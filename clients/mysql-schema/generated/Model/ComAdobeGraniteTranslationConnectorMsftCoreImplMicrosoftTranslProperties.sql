--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPr`
--
SELECT `translationFactory`, `defaultConnectorLabel`, `defaultConnectorAttribution`, `defaultConnectorWorkspaceId`, `defaultConnectorSubscriptionKey`, `languageMapLocation`, `categoryMapLocation`, `retryAttempts`, `timeoutCount` FROM `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPr` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPr`
--
INSERT INTO `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPr`(`translationFactory`, `defaultConnectorLabel`, `defaultConnectorAttribution`, `defaultConnectorWorkspaceId`, `defaultConnectorSubscriptionKey`, `languageMapLocation`, `categoryMapLocation`, `retryAttempts`, `timeoutCount`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPr`
--
UPDATE `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPr` SET `translationFactory` = ?, `defaultConnectorLabel` = ?, `defaultConnectorAttribution` = ?, `defaultConnectorWorkspaceId` = ?, `defaultConnectorSubscriptionKey` = ?, `languageMapLocation` = ?, `categoryMapLocation` = ?, `retryAttempts` = ?, `timeoutCount` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPr`
--
DELETE FROM `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPr` WHERE 0;

