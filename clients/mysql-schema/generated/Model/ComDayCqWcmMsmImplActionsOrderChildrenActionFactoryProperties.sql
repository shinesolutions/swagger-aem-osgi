--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties`
--
SELECT `cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops` FROM `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties`
--
INSERT INTO `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties`(`cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties`
--
UPDATE `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties` SET `cq.wcm.msm.action.excludednodetypes` = ?, `cq.wcm.msm.action.excludedparagraphitems` = ?, `cq.wcm.msm.action.excludedprops` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties`
--
DELETE FROM `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties` WHERE 0;

