--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslIn` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslIn`
--
INSERT INTO `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslIn`
--
UPDATE `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslIn`
--
DELETE FROM `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslIn` WHERE 0;

