--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProper`
--
SELECT `enabled`, `agentName`, `diffPath`, `observedPath`, `serviceName`, `propertyNames`, `distributionDelay`, `serviceUser.target` FROM `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProper` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProper`
--
INSERT INTO `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProper`(`enabled`, `agentName`, `diffPath`, `observedPath`, `serviceName`, `propertyNames`, `distributionDelay`, `serviceUser.target`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProper`
--
UPDATE `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProper` SET `enabled` = ?, `agentName` = ?, `diffPath` = ?, `observedPath` = ?, `serviceName` = ?, `propertyNames` = ?, `distributionDelay` = ?, `serviceUser.target` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProper`
--
DELETE FROM `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProper` WHERE 0;

