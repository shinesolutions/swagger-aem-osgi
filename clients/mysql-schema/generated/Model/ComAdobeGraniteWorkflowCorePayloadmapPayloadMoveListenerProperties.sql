--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperti`
--
SELECT `payload.move.white.list`, `payload.move.handle.from.workflow.process` FROM `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperti` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperti`
--
INSERT INTO `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperti`(`payload.move.white.list`, `payload.move.handle.from.workflow.process`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperti`
--
UPDATE `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperti` SET `payload.move.white.list` = ?, `payload.move.handle.from.workflow.process` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperti`
--
DELETE FROM `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperti` WHERE 0;

