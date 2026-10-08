--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingSettingsImplSlingSettingsServiceImplProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties`
--
SELECT `sling.name`, `sling.description` FROM `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties`
--
INSERT INTO `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties`(`sling.name`, `sling.description`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties`
--
UPDATE `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties` SET `sling.name` = ?, `sling.description` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties`
--
DELETE FROM `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties` WHERE 0;

