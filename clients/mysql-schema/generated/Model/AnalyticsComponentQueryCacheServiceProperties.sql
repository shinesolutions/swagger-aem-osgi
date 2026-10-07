--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'analyticsComponentQueryCacheServiceProperties' definition.
--


--
-- SELECT template for table `analyticsComponentQueryCacheServiceProperties`
--
SELECT `cq.analytics.component.query.cache.size` FROM `analyticsComponentQueryCacheServiceProperties` WHERE 1;

--
-- INSERT template for table `analyticsComponentQueryCacheServiceProperties`
--
INSERT INTO `analyticsComponentQueryCacheServiceProperties`(`cq.analytics.component.query.cache.size`) VALUES (?);

--
-- UPDATE template for table `analyticsComponentQueryCacheServiceProperties`
--
UPDATE `analyticsComponentQueryCacheServiceProperties` SET `cq.analytics.component.query.cache.size` = ? WHERE 1;

--
-- DELETE template for table `analyticsComponentQueryCacheServiceProperties`
--
DELETE FROM `analyticsComponentQueryCacheServiceProperties` WHERE 0;

