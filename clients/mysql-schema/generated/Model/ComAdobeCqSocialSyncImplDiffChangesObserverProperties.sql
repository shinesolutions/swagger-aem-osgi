--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplDiffChangesObserverProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSyncImplDiffChangesObserverProperties`
--
SELECT `enabled`, `agentName`, `diffPath`, `propertyNames` FROM `comAdobeCqSocialSyncImplDiffChangesObserverProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSyncImplDiffChangesObserverProperties`
--
INSERT INTO `comAdobeCqSocialSyncImplDiffChangesObserverProperties`(`enabled`, `agentName`, `diffPath`, `propertyNames`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSyncImplDiffChangesObserverProperties`
--
UPDATE `comAdobeCqSocialSyncImplDiffChangesObserverProperties` SET `enabled` = ?, `agentName` = ?, `diffPath` = ?, `propertyNames` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSyncImplDiffChangesObserverProperties`
--
DELETE FROM `comAdobeCqSocialSyncImplDiffChangesObserverProperties` WHERE 0;

