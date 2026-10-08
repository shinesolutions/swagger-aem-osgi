--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteLicenseImplLicenseCheckFilterProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteLicenseImplLicenseCheckFilterProperties`
--
SELECT `checkInternval`, `excludeIds`, `encryptPing` FROM `comAdobeGraniteLicenseImplLicenseCheckFilterProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteLicenseImplLicenseCheckFilterProperties`
--
INSERT INTO `comAdobeGraniteLicenseImplLicenseCheckFilterProperties`(`checkInternval`, `excludeIds`, `encryptPing`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteLicenseImplLicenseCheckFilterProperties`
--
UPDATE `comAdobeGraniteLicenseImplLicenseCheckFilterProperties` SET `checkInternval` = ?, `excludeIds` = ?, `encryptPing` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteLicenseImplLicenseCheckFilterProperties`
--
DELETE FROM `comAdobeGraniteLicenseImplLicenseCheckFilterProperties` WHERE 0;

