--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'guideLocalizationServiceProperties' definition.
--


--
-- SELECT template for table `guideLocalizationServiceProperties`
--
SELECT `supportedLocales`, `Localizable Properties` FROM `guideLocalizationServiceProperties` WHERE 1;

--
-- INSERT template for table `guideLocalizationServiceProperties`
--
INSERT INTO `guideLocalizationServiceProperties`(`supportedLocales`, `Localizable Properties`) VALUES (?, ?);

--
-- UPDATE template for table `guideLocalizationServiceProperties`
--
UPDATE `guideLocalizationServiceProperties` SET `supportedLocales` = ?, `Localizable Properties` = ? WHERE 1;

--
-- DELETE template for table `guideLocalizationServiceProperties`
--
DELETE FROM `guideLocalizationServiceProperties` WHERE 0;

