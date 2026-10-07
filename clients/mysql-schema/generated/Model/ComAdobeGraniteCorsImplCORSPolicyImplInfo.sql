--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCorsImplCORSPolicyImplInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteCorsImplCORSPolicyImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteCorsImplCORSPolicyImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCorsImplCORSPolicyImplInfo`
--
INSERT INTO `comAdobeGraniteCorsImplCORSPolicyImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteCorsImplCORSPolicyImplInfo`
--
UPDATE `comAdobeGraniteCorsImplCORSPolicyImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCorsImplCORSPolicyImplInfo`
--
DELETE FROM `comAdobeGraniteCorsImplCORSPolicyImplInfo` WHERE 0;

