--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamCfmImplConfFeatureConfigImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamCfmImplConfFeatureConfigImplProperties`
--
SELECT `dam.cfm.resourceTypes`, `dam.cfm.referenceProperties` FROM `comAdobeCqDamCfmImplConfFeatureConfigImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamCfmImplConfFeatureConfigImplProperties`
--
INSERT INTO `comAdobeCqDamCfmImplConfFeatureConfigImplProperties`(`dam.cfm.resourceTypes`, `dam.cfm.referenceProperties`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqDamCfmImplConfFeatureConfigImplProperties`
--
UPDATE `comAdobeCqDamCfmImplConfFeatureConfigImplProperties` SET `dam.cfm.resourceTypes` = ?, `dam.cfm.referenceProperties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamCfmImplConfFeatureConfigImplProperties`
--
DELETE FROM `comAdobeCqDamCfmImplConfFeatureConfigImplProperties` WHERE 0;

