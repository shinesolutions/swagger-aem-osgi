--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteI18nImplBundlePseudoTranslationsInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo`
--
INSERT INTO `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo`
--
UPDATE `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo`
--
DELETE FROM `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo` WHERE 0;

