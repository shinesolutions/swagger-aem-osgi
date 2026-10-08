--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteContexthubImplContextHubImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteContexthubImplContextHubImplProperties`
--
SELECT `com.adobe.granite.contexthub.silent_mode`, `com.adobe.granite.contexthub.show_ui` FROM `comAdobeGraniteContexthubImplContextHubImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteContexthubImplContextHubImplProperties`
--
INSERT INTO `comAdobeGraniteContexthubImplContextHubImplProperties`(`com.adobe.granite.contexthub.silent_mode`, `com.adobe.granite.contexthub.show_ui`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteContexthubImplContextHubImplProperties`
--
UPDATE `comAdobeGraniteContexthubImplContextHubImplProperties` SET `com.adobe.granite.contexthub.silent_mode` = ?, `com.adobe.granite.contexthub.show_ui` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteContexthubImplContextHubImplProperties`
--
DELETE FROM `comAdobeGraniteContexthubImplContextHubImplProperties` WHERE 0;

