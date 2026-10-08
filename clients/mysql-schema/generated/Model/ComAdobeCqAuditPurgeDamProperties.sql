--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAuditPurgeDamProperties' definition.
--


--
-- SELECT template for table `comAdobeCqAuditPurgeDamProperties`
--
SELECT `auditlog.rule.name`, `auditlog.rule.contentpath`, `auditlog.rule.minimumage`, `auditlog.rule.types` FROM `comAdobeCqAuditPurgeDamProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqAuditPurgeDamProperties`
--
INSERT INTO `comAdobeCqAuditPurgeDamProperties`(`auditlog.rule.name`, `auditlog.rule.contentpath`, `auditlog.rule.minimumage`, `auditlog.rule.types`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAuditPurgeDamProperties`
--
UPDATE `comAdobeCqAuditPurgeDamProperties` SET `auditlog.rule.name` = ?, `auditlog.rule.contentpath` = ?, `auditlog.rule.minimumage` = ?, `auditlog.rule.types` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAuditPurgeDamProperties`
--
DELETE FROM `comAdobeCqAuditPurgeDamProperties` WHERE 0;

