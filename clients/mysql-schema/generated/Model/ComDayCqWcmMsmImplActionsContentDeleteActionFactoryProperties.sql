--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties`
--
SELECT `cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops` FROM `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties`
--
INSERT INTO `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties`(`cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties`
--
UPDATE `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties` SET `cq.wcm.msm.action.excludednodetypes` = ?, `cq.wcm.msm.action.excludedparagraphitems` = ?, `cq.wcm.msm.action.excludedprops` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties`
--
DELETE FROM `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties` WHERE 0;

