--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAuditPurgePagesProperties' definition.
--


--
-- SELECT template for table `comAdobeCqAuditPurgePagesProperties`
--
SELECT `auditlog.rule.name`, `auditlog.rule.contentpath`, `auditlog.rule.minimumage`, `auditlog.rule.types` FROM `comAdobeCqAuditPurgePagesProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqAuditPurgePagesProperties`
--
INSERT INTO `comAdobeCqAuditPurgePagesProperties`(`auditlog.rule.name`, `auditlog.rule.contentpath`, `auditlog.rule.minimumage`, `auditlog.rule.types`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAuditPurgePagesProperties`
--
UPDATE `comAdobeCqAuditPurgePagesProperties` SET `auditlog.rule.name` = ?, `auditlog.rule.contentpath` = ?, `auditlog.rule.minimumage` = ?, `auditlog.rule.types` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAuditPurgePagesProperties`
--
DELETE FROM `comAdobeCqAuditPurgePagesProperties` WHERE 0;

