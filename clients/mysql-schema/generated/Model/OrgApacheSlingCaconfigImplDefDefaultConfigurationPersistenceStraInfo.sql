--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra`
--
INSERT INTO `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra`
--
UPDATE `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra`
--
DELETE FROM `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra` WHERE 0;

