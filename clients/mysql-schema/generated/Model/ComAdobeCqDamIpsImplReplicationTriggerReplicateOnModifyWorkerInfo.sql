--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInf`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInf` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInf`
--
INSERT INTO `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInf`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInf`
--
UPDATE `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInf` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInf`
--
DELETE FROM `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInf` WHERE 0;

