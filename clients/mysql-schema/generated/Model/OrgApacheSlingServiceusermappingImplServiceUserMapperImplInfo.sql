--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo`
--
INSERT INTO `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo`
--
UPDATE `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo`
--
DELETE FROM `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo` WHERE 0;

