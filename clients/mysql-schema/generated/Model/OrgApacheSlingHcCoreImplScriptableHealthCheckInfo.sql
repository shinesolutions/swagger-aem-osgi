--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplScriptableHealthCheckInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingHcCoreImplScriptableHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingHcCoreImplScriptableHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingHcCoreImplScriptableHealthCheckInfo`
--
INSERT INTO `orgApacheSlingHcCoreImplScriptableHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingHcCoreImplScriptableHealthCheckInfo`
--
UPDATE `orgApacheSlingHcCoreImplScriptableHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingHcCoreImplScriptableHealthCheckInfo`
--
DELETE FROM `orgApacheSlingHcCoreImplScriptableHealthCheckInfo` WHERE 0;

