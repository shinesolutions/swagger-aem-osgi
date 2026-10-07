--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties`
--
SELECT `cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`, `cq.wcm.msm.impl.action.referencesupdate.prop_updateNested` FROM `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties`
--
INSERT INTO `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties`(`cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`, `cq.wcm.msm.impl.action.referencesupdate.prop_updateNested`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties`
--
UPDATE `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties` SET `cq.wcm.msm.action.excludednodetypes` = ?, `cq.wcm.msm.action.excludedparagraphitems` = ?, `cq.wcm.msm.action.excludedprops` = ?, `cq.wcm.msm.impl.action.referencesupdate.prop_updateNested` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties`
--
DELETE FROM `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties` WHERE 0;

