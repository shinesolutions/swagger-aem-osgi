--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteThreaddumpThreadDumpCollectorInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteThreaddumpThreadDumpCollectorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteThreaddumpThreadDumpCollectorInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteThreaddumpThreadDumpCollectorInfo`
--
INSERT INTO `comAdobeGraniteThreaddumpThreadDumpCollectorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteThreaddumpThreadDumpCollectorInfo`
--
UPDATE `comAdobeGraniteThreaddumpThreadDumpCollectorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteThreaddumpThreadDumpCollectorInfo`
--
DELETE FROM `comAdobeGraniteThreaddumpThreadDumpCollectorInfo` WHERE 0;

