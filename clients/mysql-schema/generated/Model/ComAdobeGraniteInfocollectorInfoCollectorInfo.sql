--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteInfocollectorInfoCollectorInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteInfocollectorInfoCollectorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteInfocollectorInfoCollectorInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteInfocollectorInfoCollectorInfo`
--
INSERT INTO `comAdobeGraniteInfocollectorInfoCollectorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteInfocollectorInfoCollectorInfo`
--
UPDATE `comAdobeGraniteInfocollectorInfoCollectorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteInfocollectorInfoCollectorInfo`
--
DELETE FROM `comAdobeGraniteInfocollectorInfoCollectorInfo` WHERE 0;

