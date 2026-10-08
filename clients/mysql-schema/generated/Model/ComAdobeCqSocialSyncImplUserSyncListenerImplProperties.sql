--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplUserSyncListenerImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSyncImplUserSyncListenerImplProperties`
--
SELECT `nodetypes`, `ignorableprops`, `ignorablenodes`, `enabled`, `distfolders` FROM `comAdobeCqSocialSyncImplUserSyncListenerImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSyncImplUserSyncListenerImplProperties`
--
INSERT INTO `comAdobeCqSocialSyncImplUserSyncListenerImplProperties`(`nodetypes`, `ignorableprops`, `ignorablenodes`, `enabled`, `distfolders`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSyncImplUserSyncListenerImplProperties`
--
UPDATE `comAdobeCqSocialSyncImplUserSyncListenerImplProperties` SET `nodetypes` = ?, `ignorableprops` = ?, `ignorablenodes` = ?, `enabled` = ?, `distfolders` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSyncImplUserSyncListenerImplProperties`
--
DELETE FROM `comAdobeCqSocialSyncImplUserSyncListenerImplProperties` WHERE 0;

