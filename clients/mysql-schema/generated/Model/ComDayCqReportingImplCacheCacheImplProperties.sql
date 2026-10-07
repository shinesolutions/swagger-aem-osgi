--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReportingImplCacheCacheImplProperties' definition.
--


--
-- SELECT template for table `comDayCqReportingImplCacheCacheImplProperties`
--
SELECT `repcache.enable`, `repcache.ttl`, `repcache.max` FROM `comDayCqReportingImplCacheCacheImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReportingImplCacheCacheImplProperties`
--
INSERT INTO `comDayCqReportingImplCacheCacheImplProperties`(`repcache.enable`, `repcache.ttl`, `repcache.max`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqReportingImplCacheCacheImplProperties`
--
UPDATE `comDayCqReportingImplCacheCacheImplProperties` SET `repcache.enable` = ?, `repcache.ttl` = ?, `repcache.max` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReportingImplCacheCacheImplProperties`
--
DELETE FROM `comDayCqReportingImplCacheCacheImplProperties` WHERE 0;

