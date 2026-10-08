--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAnalyzerBaseSystemStatusServletInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo`
--
INSERT INTO `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo`
--
UPDATE `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo`
--
DELETE FROM `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo` WHERE 0;

