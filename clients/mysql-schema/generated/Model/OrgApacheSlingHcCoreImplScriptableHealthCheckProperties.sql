--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplScriptableHealthCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingHcCoreImplScriptableHealthCheckProperties`
--
SELECT `hc.name`, `hc.tags`, `hc.mbean.name`, `expression`, `language.extension` FROM `orgApacheSlingHcCoreImplScriptableHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingHcCoreImplScriptableHealthCheckProperties`
--
INSERT INTO `orgApacheSlingHcCoreImplScriptableHealthCheckProperties`(`hc.name`, `hc.tags`, `hc.mbean.name`, `expression`, `language.extension`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingHcCoreImplScriptableHealthCheckProperties`
--
UPDATE `orgApacheSlingHcCoreImplScriptableHealthCheckProperties` SET `hc.name` = ?, `hc.tags` = ?, `hc.mbean.name` = ?, `expression` = ?, `language.extension` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingHcCoreImplScriptableHealthCheckProperties`
--
DELETE FROM `orgApacheSlingHcCoreImplScriptableHealthCheckProperties` WHERE 0;

