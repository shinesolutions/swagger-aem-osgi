--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplWCMDebugFilterProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplWCMDebugFilterProperties`
--
SELECT `wcmdbgfilter.enabled`, `wcmdbgfilter.jspDebug` FROM `comDayCqWcmCoreImplWCMDebugFilterProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplWCMDebugFilterProperties`
--
INSERT INTO `comDayCqWcmCoreImplWCMDebugFilterProperties`(`wcmdbgfilter.enabled`, `wcmdbgfilter.jspDebug`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplWCMDebugFilterProperties`
--
UPDATE `comDayCqWcmCoreImplWCMDebugFilterProperties` SET `wcmdbgfilter.enabled` = ?, `wcmdbgfilter.jspDebug` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplWCMDebugFilterProperties`
--
DELETE FROM `comDayCqWcmCoreImplWCMDebugFilterProperties` WHERE 0;

