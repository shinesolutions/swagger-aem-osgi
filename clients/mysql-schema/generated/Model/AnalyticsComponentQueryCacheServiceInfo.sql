--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'analyticsComponentQueryCacheServiceInfo' definition.
--


--
-- SELECT template for table `analyticsComponentQueryCacheServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `analyticsComponentQueryCacheServiceInfo` WHERE 1;

--
-- INSERT template for table `analyticsComponentQueryCacheServiceInfo`
--
INSERT INTO `analyticsComponentQueryCacheServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `analyticsComponentQueryCacheServiceInfo`
--
UPDATE `analyticsComponentQueryCacheServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `analyticsComponentQueryCacheServiceInfo`
--
DELETE FROM `analyticsComponentQueryCacheServiceInfo` WHERE 0;

