--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplDiffChangesObserverInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSyncImplDiffChangesObserverInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialSyncImplDiffChangesObserverInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSyncImplDiffChangesObserverInfo`
--
INSERT INTO `comAdobeCqSocialSyncImplDiffChangesObserverInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSyncImplDiffChangesObserverInfo`
--
UPDATE `comAdobeCqSocialSyncImplDiffChangesObserverInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSyncImplDiffChangesObserverInfo`
--
DELETE FROM `comAdobeCqSocialSyncImplDiffChangesObserverInfo` WHERE 0;

