--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties`
--
SELECT `cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`, `cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate` FROM `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties`
--
INSERT INTO `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties`(`cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`, `cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties`
--
UPDATE `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties` SET `cq.wcm.msm.action.excludednodetypes` = ?, `cq.wcm.msm.action.excludedparagraphitems` = ?, `cq.wcm.msm.action.excludedprops` = ?, `cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties`
--
DELETE FROM `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties` WHERE 0;

