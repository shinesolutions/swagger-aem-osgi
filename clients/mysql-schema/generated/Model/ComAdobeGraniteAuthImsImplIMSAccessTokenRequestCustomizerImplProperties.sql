--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPro`
--
SELECT `auth.ims.client.secret`, `customizer.type` FROM `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPro` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPro`
--
INSERT INTO `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPro`(`auth.ims.client.secret`, `customizer.type`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPro`
--
UPDATE `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPro` SET `auth.ims.client.secret` = ?, `customizer.type` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPro`
--
DELETE FROM `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPro` WHERE 0;

