--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo`
--
INSERT INTO `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo`
--
UPDATE `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo`
--
DELETE FROM `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo` WHERE 0;

