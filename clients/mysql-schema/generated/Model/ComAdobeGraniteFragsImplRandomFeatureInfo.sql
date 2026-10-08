--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteFragsImplRandomFeatureInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteFragsImplRandomFeatureInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteFragsImplRandomFeatureInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteFragsImplRandomFeatureInfo`
--
INSERT INTO `comAdobeGraniteFragsImplRandomFeatureInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteFragsImplRandomFeatureInfo`
--
UPDATE `comAdobeGraniteFragsImplRandomFeatureInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteFragsImplRandomFeatureInfo`
--
DELETE FROM `comAdobeGraniteFragsImplRandomFeatureInfo` WHERE 0;

