--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplUserSyncListenerImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSyncImplUserSyncListenerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialSyncImplUserSyncListenerImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSyncImplUserSyncListenerImplInfo`
--
INSERT INTO `comAdobeCqSocialSyncImplUserSyncListenerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSyncImplUserSyncListenerImplInfo`
--
UPDATE `comAdobeCqSocialSyncImplUserSyncListenerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSyncImplUserSyncListenerImplInfo`
--
DELETE FROM `comAdobeCqSocialSyncImplUserSyncListenerImplInfo` WHERE 0;

