--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties`
--
SELECT `cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops` FROM `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties`
--
INSERT INTO `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties`(`cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties`
--
UPDATE `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties` SET `cq.wcm.msm.action.excludednodetypes` = ?, `cq.wcm.msm.action.excludedparagraphitems` = ?, `cq.wcm.msm.action.excludedprops` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties`
--
DELETE FROM `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties` WHERE 0;

