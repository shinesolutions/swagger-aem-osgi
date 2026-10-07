--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingI18nImplI18NFilterInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingI18nImplI18NFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingI18nImplI18NFilterInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingI18nImplI18NFilterInfo`
--
INSERT INTO `orgApacheSlingI18nImplI18NFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingI18nImplI18NFilterInfo`
--
UPDATE `orgApacheSlingI18nImplI18NFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingI18nImplI18NFilterInfo`
--
DELETE FROM `orgApacheSlingI18nImplI18NFilterInfo` WHERE 0;

