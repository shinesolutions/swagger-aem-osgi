--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplGroupSyncListenerImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo`
--
INSERT INTO `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo`
--
UPDATE `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo`
--
DELETE FROM `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo` WHERE 0;

