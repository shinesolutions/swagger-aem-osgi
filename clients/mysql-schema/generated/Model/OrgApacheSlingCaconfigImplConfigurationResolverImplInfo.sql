--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplConfigurationResolverImplInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigImplConfigurationResolverImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingCaconfigImplConfigurationResolverImplInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigImplConfigurationResolverImplInfo`
--
INSERT INTO `orgApacheSlingCaconfigImplConfigurationResolverImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigImplConfigurationResolverImplInfo`
--
UPDATE `orgApacheSlingCaconfigImplConfigurationResolverImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigImplConfigurationResolverImplInfo`
--
DELETE FROM `orgApacheSlingCaconfigImplConfigurationResolverImplInfo` WHERE 0;

