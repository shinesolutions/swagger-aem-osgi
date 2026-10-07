--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAuditPurgePagesInfo' definition.
--


--
-- SELECT template for table `comAdobeCqAuditPurgePagesInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqAuditPurgePagesInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqAuditPurgePagesInfo`
--
INSERT INTO `comAdobeCqAuditPurgePagesInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAuditPurgePagesInfo`
--
UPDATE `comAdobeCqAuditPurgePagesInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAuditPurgePagesInfo`
--
DELETE FROM `comAdobeCqAuditPurgePagesInfo` WHERE 0;

