--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplWarpTimeWarpFilterProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplWarpTimeWarpFilterProperties`
--
SELECT `filter.order`, `filter.scope` FROM `comDayCqWcmCoreImplWarpTimeWarpFilterProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplWarpTimeWarpFilterProperties`
--
INSERT INTO `comDayCqWcmCoreImplWarpTimeWarpFilterProperties`(`filter.order`, `filter.scope`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplWarpTimeWarpFilterProperties`
--
UPDATE `comDayCqWcmCoreImplWarpTimeWarpFilterProperties` SET `filter.order` = ?, `filter.scope` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplWarpTimeWarpFilterProperties`
--
DELETE FROM `comDayCqWcmCoreImplWarpTimeWarpFilterProperties` WHERE 0;

