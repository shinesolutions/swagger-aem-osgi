--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteFragsImplRandomFeatureProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteFragsImplRandomFeatureProperties`
--
SELECT `feature.name`, `feature.description`, `active.percentage`, `cookie.name`, `cookie.maxAge` FROM `comAdobeGraniteFragsImplRandomFeatureProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteFragsImplRandomFeatureProperties`
--
INSERT INTO `comAdobeGraniteFragsImplRandomFeatureProperties`(`feature.name`, `feature.description`, `active.percentage`, `cookie.name`, `cookie.maxAge`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteFragsImplRandomFeatureProperties`
--
UPDATE `comAdobeGraniteFragsImplRandomFeatureProperties` SET `feature.name` = ?, `feature.description` = ?, `active.percentage` = ?, `cookie.name` = ?, `cookie.maxAge` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteFragsImplRandomFeatureProperties`
--
DELETE FROM `comAdobeGraniteFragsImplRandomFeatureProperties` WHERE 0;

