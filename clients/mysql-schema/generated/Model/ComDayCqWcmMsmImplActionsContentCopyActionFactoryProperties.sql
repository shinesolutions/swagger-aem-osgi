--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties`
--
SELECT `cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`, `contentcopyaction.order.style` FROM `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties`
--
INSERT INTO `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties`(`cq.wcm.msm.action.excludednodetypes`, `cq.wcm.msm.action.excludedparagraphitems`, `cq.wcm.msm.action.excludedprops`, `contentcopyaction.order.style`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties`
--
UPDATE `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties` SET `cq.wcm.msm.action.excludednodetypes` = ?, `cq.wcm.msm.action.excludedparagraphitems` = ?, `cq.wcm.msm.action.excludedprops` = ?, `contentcopyaction.order.style` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties`
--
DELETE FROM `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties` WHERE 0;

