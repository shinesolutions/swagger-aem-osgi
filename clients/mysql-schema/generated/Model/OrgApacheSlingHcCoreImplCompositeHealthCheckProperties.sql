--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplCompositeHealthCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingHcCoreImplCompositeHealthCheckProperties`
--
SELECT `hc.name`, `hc.tags`, `hc.mbean.name`, `filter.tags`, `filter.combineTagsWithOr` FROM `orgApacheSlingHcCoreImplCompositeHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingHcCoreImplCompositeHealthCheckProperties`
--
INSERT INTO `orgApacheSlingHcCoreImplCompositeHealthCheckProperties`(`hc.name`, `hc.tags`, `hc.mbean.name`, `filter.tags`, `filter.combineTagsWithOr`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingHcCoreImplCompositeHealthCheckProperties`
--
UPDATE `orgApacheSlingHcCoreImplCompositeHealthCheckProperties` SET `hc.name` = ?, `hc.tags` = ?, `hc.mbean.name` = ?, `filter.tags` = ?, `filter.combineTagsWithOr` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingHcCoreImplCompositeHealthCheckProperties`
--
DELETE FROM `orgApacheSlingHcCoreImplCompositeHealthCheckProperties` WHERE 0;

