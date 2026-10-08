--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingSecurityImplReferrerFilterInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingSecurityImplReferrerFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingSecurityImplReferrerFilterInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingSecurityImplReferrerFilterInfo`
--
INSERT INTO `orgApacheSlingSecurityImplReferrerFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingSecurityImplReferrerFilterInfo`
--
UPDATE `orgApacheSlingSecurityImplReferrerFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingSecurityImplReferrerFilterInfo`
--
DELETE FROM `orgApacheSlingSecurityImplReferrerFilterInfo` WHERE 0;

