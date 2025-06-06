-- 175. 组合两个表

-- 表: Person

-- +-------------+---------+
-- | 列名         | 类型     |
-- +-------------+---------+
-- | PersonId    | int     |
-- | FirstName   | varchar |
-- | LastName    | varchar |
-- +-------------+---------+
-- personId 是该表的主键（具有唯一值的列）。
-- 该表包含一些人的 ID 和他们的姓和名的信息。

 

-- 表: Address

-- +-------------+---------+
-- | 列名         | 类型    |
-- +-------------+---------+
-- | AddressId   | int     |
-- | PersonId    | int     |
-- | City        | varchar |
-- | State       | varchar |
-- +-------------+---------+
-- addressId 是该表的主键（具有唯一值的列）。
-- 该表的每一行都包含一个 ID = PersonId 的人的城市和州的信息。

 

-- 编写解决方案，报告 Person 表中每个人的姓、名、城市和州。如果 personId 的地址不在 Address 表中，则报告为 null 。

-- 以 任意顺序 返回结果表。

-- 结果格式如下所示。

 

-- 示例 1:

-- 输入: 
-- Person表:
-- +----------+----------+-----------+
-- | personId | lastName | firstName |
-- +----------+----------+-----------+
-- | 1        | Wang     | Allen     |
-- | 2        | Alice    | Bob       |
-- +----------+----------+-----------+
-- Address表:
-- +-----------+----------+---------------+------------+
-- | addressId | personId | city          | state      |
-- +-----------+----------+---------------+------------+
-- | 1         | 2        | New York City | New York   |
-- | 2         | 3        | Leetcode      | California |
-- +-----------+----------+---------------+------------+
-- 输出: 
-- +-----------+----------+---------------+----------+
-- | firstName | lastName | city          | state    |
-- +-----------+----------+---------------+----------+
-- | Allen     | Wang     | Null          | Null     |
-- | Bob       | Alice    | New York City | New York |
-- +-----------+----------+---------------+----------+
-- 解释: 
-- 地址表中没有 personId = 1 的地址，所以它们的城市和州返回 null。
-- addressId = 1 包含了 personId = 2 的地址信息。



# Write your MySQL query statement below
SELECT FirstName,LastName,City,State FROM Person LEFT JOIN Address ON Person.PersonId = Address.PersonId;