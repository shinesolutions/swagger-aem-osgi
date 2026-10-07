--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties`
--
SELECT `hc.name`, `hc.tags`, `hc.mbean.name`, `mbean.name`, `attribute.name`, `attribute.value.constraint` FROM `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties`
--
INSERT INTO `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties`(`hc.name`, `hc.tags`, `hc.mbean.name`, `mbean.name`, `attribute.name`, `attribute.value.constraint`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties`
--
UPDATE `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties` SET `hc.name` = ?, `hc.tags` = ?, `hc.mbean.name` = ?, `mbean.name` = ?, `attribute.name` = ?, `attribute.value.constraint` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties`
--
DELETE FROM `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties` WHERE 0;

