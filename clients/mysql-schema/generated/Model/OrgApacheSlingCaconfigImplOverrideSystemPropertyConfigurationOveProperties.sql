--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve`
--
SELECT `enabled`, `service.ranking` FROM `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve`
--
INSERT INTO `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve`(`enabled`, `service.ranking`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve`
--
UPDATE `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve` SET `enabled` = ?, `service.ranking` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve`
--
DELETE FROM `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve` WHERE 0;

