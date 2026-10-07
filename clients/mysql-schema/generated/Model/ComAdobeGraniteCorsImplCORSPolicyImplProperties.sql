--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCorsImplCORSPolicyImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteCorsImplCORSPolicyImplProperties`
--
SELECT `alloworigin`, `alloworiginregexp`, `allowedpaths`, `exposedheaders`, `maxage`, `supportedheaders`, `supportedmethods`, `supportscredentials` FROM `comAdobeGraniteCorsImplCORSPolicyImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCorsImplCORSPolicyImplProperties`
--
INSERT INTO `comAdobeGraniteCorsImplCORSPolicyImplProperties`(`alloworigin`, `alloworiginregexp`, `allowedpaths`, `exposedheaders`, `maxage`, `supportedheaders`, `supportedmethods`, `supportscredentials`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteCorsImplCORSPolicyImplProperties`
--
UPDATE `comAdobeGraniteCorsImplCORSPolicyImplProperties` SET `alloworigin` = ?, `alloworiginregexp` = ?, `allowedpaths` = ?, `exposedheaders` = ?, `maxage` = ?, `supportedheaders` = ?, `supportedmethods` = ?, `supportscredentials` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCorsImplCORSPolicyImplProperties`
--
DELETE FROM `comAdobeGraniteCorsImplCORSPolicyImplProperties` WHERE 0;

