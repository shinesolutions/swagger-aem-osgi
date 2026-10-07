--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAuditPurgeReplicationInfo' definition.
--


--
-- SELECT template for table `comAdobeCqAuditPurgeReplicationInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqAuditPurgeReplicationInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqAuditPurgeReplicationInfo`
--
INSERT INTO `comAdobeCqAuditPurgeReplicationInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAuditPurgeReplicationInfo`
--
UPDATE `comAdobeCqAuditPurgeReplicationInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAuditPurgeReplicationInfo`
--
DELETE FROM `comAdobeCqAuditPurgeReplicationInfo` WHERE 0;

