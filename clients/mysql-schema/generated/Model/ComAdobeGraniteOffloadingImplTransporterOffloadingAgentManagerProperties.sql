--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPr`
--
SELECT `offloading.agentmanager.enabled` FROM `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPr` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPr`
--
INSERT INTO `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPr`(`offloading.agentmanager.enabled`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPr`
--
UPDATE `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPr` SET `offloading.agentmanager.enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPr`
--
DELETE FROM `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPr` WHERE 0;

