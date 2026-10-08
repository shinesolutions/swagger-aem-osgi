--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi`
--
SELECT `description`, `overrides`, `enabled`, `service.ranking` FROM `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi`
--
INSERT INTO `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi`(`description`, `overrides`, `enabled`, `service.ranking`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi`
--
UPDATE `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi` SET `description` = ?, `overrides` = ?, `enabled` = ?, `service.ranking` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi`
--
DELETE FROM `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi` WHERE 0;

