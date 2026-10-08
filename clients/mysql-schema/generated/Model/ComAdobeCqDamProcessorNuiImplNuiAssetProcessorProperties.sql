--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties`
--
SELECT `nuiEnabled`, `nuiServiceUrl`, `nuiApiKey` FROM `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties`
--
INSERT INTO `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties`(`nuiEnabled`, `nuiServiceUrl`, `nuiApiKey`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties`
--
UPDATE `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties` SET `nuiEnabled` = ?, `nuiServiceUrl` = ?, `nuiApiKey` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties`
--
DELETE FROM `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties` WHERE 0;

