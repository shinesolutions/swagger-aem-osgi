--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo`
--
INSERT INTO `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo`
--
UPDATE `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo`
--
DELETE FROM `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo` WHERE 0;

