--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAuditPurgeDamInfo' definition.
--


--
-- SELECT template for table `comAdobeCqAuditPurgeDamInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqAuditPurgeDamInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqAuditPurgeDamInfo`
--
INSERT INTO `comAdobeCqAuditPurgeDamInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAuditPurgeDamInfo`
--
UPDATE `comAdobeCqAuditPurgeDamInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAuditPurgeDamInfo`
--
DELETE FROM `comAdobeCqAuditPurgeDamInfo` WHERE 0;

