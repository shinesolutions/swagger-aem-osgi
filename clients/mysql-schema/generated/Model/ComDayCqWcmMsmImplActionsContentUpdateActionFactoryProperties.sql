--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties`
--
SELECT `cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`, `cq.wcm.msm.action.ignoredMixin` FROM `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties`
--
INSERT INTO `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties`(`cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`, `cq.wcm.msm.action.ignoredMixin`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties`
--
UPDATE `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties` SET `cq.wcm.msm.action.excludednodetypes` = ?, `cq.wcm.msm.action.excludedparagraphitems` = ?, `cq.wcm.msm.action.excludedprops` = ?, `cq.wcm.msm.action.ignoredMixin` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties`
--
DELETE FROM `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties` WHERE 0;

