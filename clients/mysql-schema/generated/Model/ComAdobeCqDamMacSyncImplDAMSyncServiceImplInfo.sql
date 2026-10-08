--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo`
--
INSERT INTO `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo`
--
UPDATE `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo`
--
DELETE FROM `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo` WHERE 0;

