--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamCfmImplComponentComponentConfigImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamCfmImplComponentComponentConfigImplProperties`
--
SELECT `dam.cfm.component.resourceType`, `dam.cfm.component.fileReferenceProp`, `dam.cfm.component.elementsProp`, `dam.cfm.component.variationProp` FROM `comAdobeCqDamCfmImplComponentComponentConfigImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamCfmImplComponentComponentConfigImplProperties`
--
INSERT INTO `comAdobeCqDamCfmImplComponentComponentConfigImplProperties`(`dam.cfm.component.resourceType`, `dam.cfm.component.fileReferenceProp`, `dam.cfm.component.elementsProp`, `dam.cfm.component.variationProp`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamCfmImplComponentComponentConfigImplProperties`
--
UPDATE `comAdobeCqDamCfmImplComponentComponentConfigImplProperties` SET `dam.cfm.component.resourceType` = ?, `dam.cfm.component.fileReferenceProp` = ?, `dam.cfm.component.elementsProp` = ?, `dam.cfm.component.variationProp` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamCfmImplComponentComponentConfigImplProperties`
--
DELETE FROM `comAdobeCqDamCfmImplComponentComponentConfigImplProperties` WHERE 0;

