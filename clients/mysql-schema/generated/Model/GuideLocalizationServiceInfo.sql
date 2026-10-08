--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'guideLocalizationServiceInfo' definition.
--


--
-- SELECT template for table `guideLocalizationServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `guideLocalizationServiceInfo` WHERE 1;

--
-- INSERT template for table `guideLocalizationServiceInfo`
--
INSERT INTO `guideLocalizationServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `guideLocalizationServiceInfo`
--
UPDATE `guideLocalizationServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `guideLocalizationServiceInfo`
--
DELETE FROM `guideLocalizationServiceInfo` WHERE 0;

