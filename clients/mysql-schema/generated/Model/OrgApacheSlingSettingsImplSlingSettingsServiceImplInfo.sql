--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingSettingsImplSlingSettingsServiceImplInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo`
--
INSERT INTO `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo`
--
UPDATE `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo`
--
DELETE FROM `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo` WHERE 0;

