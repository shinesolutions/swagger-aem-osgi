--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourI`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourI` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourI`
--
INSERT INTO `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourI`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourI`
--
UPDATE `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourI`
--
DELETE FROM `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourI` WHERE 0;

