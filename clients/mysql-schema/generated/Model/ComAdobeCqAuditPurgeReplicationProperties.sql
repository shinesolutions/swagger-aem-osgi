--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAuditPurgeReplicationProperties' definition.
--


--
-- SELECT template for table `comAdobeCqAuditPurgeReplicationProperties`
--
SELECT `auditlog.rule.name`, `auditlog.rule.contentpath`, `auditlog.rule.minimumage`, `auditlog.rule.types` FROM `comAdobeCqAuditPurgeReplicationProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqAuditPurgeReplicationProperties`
--
INSERT INTO `comAdobeCqAuditPurgeReplicationProperties`(`auditlog.rule.name`, `auditlog.rule.contentpath`, `auditlog.rule.minimumage`, `auditlog.rule.types`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAuditPurgeReplicationProperties`
--
UPDATE `comAdobeCqAuditPurgeReplicationProperties` SET `auditlog.rule.name` = ?, `auditlog.rule.contentpath` = ?, `auditlog.rule.minimumage` = ?, `auditlog.rule.types` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAuditPurgeReplicationProperties`
--
DELETE FROM `comAdobeCqAuditPurgeReplicationProperties` WHERE 0;

