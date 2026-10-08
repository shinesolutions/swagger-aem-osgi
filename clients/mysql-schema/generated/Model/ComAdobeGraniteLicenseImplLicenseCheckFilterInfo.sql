--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteLicenseImplLicenseCheckFilterInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteLicenseImplLicenseCheckFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteLicenseImplLicenseCheckFilterInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteLicenseImplLicenseCheckFilterInfo`
--
INSERT INTO `comAdobeGraniteLicenseImplLicenseCheckFilterInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteLicenseImplLicenseCheckFilterInfo`
--
UPDATE `comAdobeGraniteLicenseImplLicenseCheckFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteLicenseImplLicenseCheckFilterInfo`
--
DELETE FROM `comAdobeGraniteLicenseImplLicenseCheckFilterInfo` WHERE 0;

