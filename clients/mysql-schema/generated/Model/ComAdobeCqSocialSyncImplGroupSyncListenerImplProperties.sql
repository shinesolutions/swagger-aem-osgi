--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplGroupSyncListenerImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties`
--
SELECT `nodetypes`, `ignorableprops`, `ignorablenodes`, `enabled`, `distfolders` FROM `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties`
--
INSERT INTO `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties`(`nodetypes`, `ignorableprops`, `ignorablenodes`, `enabled`, `distfolders`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties`
--
UPDATE `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties` SET `nodetypes` = ?, `ignorableprops` = ?, `ignorablenodes` = ?, `enabled` = ?, `distfolders` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties`
--
DELETE FROM `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties` WHERE 0;

