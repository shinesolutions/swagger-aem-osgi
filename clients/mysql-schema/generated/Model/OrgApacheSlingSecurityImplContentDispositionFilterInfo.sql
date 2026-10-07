--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingSecurityImplContentDispositionFilterInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingSecurityImplContentDispositionFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingSecurityImplContentDispositionFilterInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingSecurityImplContentDispositionFilterInfo`
--
INSERT INTO `orgApacheSlingSecurityImplContentDispositionFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingSecurityImplContentDispositionFilterInfo`
--
UPDATE `orgApacheSlingSecurityImplContentDispositionFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingSecurityImplContentDispositionFilterInfo`
--
DELETE FROM `orgApacheSlingSecurityImplContentDispositionFilterInfo` WHERE 0;

