--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteInfocollectorInfoCollectorProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteInfocollectorInfoCollectorProperties`
--
SELECT `granite.infocollector.includeThreadDumps`, `granite.infocollector.includeHeapDump` FROM `comAdobeGraniteInfocollectorInfoCollectorProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteInfocollectorInfoCollectorProperties`
--
INSERT INTO `comAdobeGraniteInfocollectorInfoCollectorProperties`(`granite.infocollector.includeThreadDumps`, `granite.infocollector.includeHeapDump`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteInfocollectorInfoCollectorProperties`
--
UPDATE `comAdobeGraniteInfocollectorInfoCollectorProperties` SET `granite.infocollector.includeThreadDumps` = ?, `granite.infocollector.includeHeapDump` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteInfocollectorInfoCollectorProperties`
--
DELETE FROM `comAdobeGraniteInfocollectorInfoCollectorProperties` WHERE 0;

