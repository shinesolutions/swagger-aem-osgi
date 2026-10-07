--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPro`
--
SELECT `dmreplicateonmodify.enabled`, `dmreplicateonmodify.forcesyncdeletes` FROM `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPro` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPro`
--
INSERT INTO `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPro`(`dmreplicateonmodify.enabled`, `dmreplicateonmodify.forcesyncdeletes`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPro`
--
UPDATE `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPro` SET `dmreplicateonmodify.enabled` = ?, `dmreplicateonmodify.forcesyncdeletes` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPro`
--
DELETE FROM `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPro` WHERE 0;

