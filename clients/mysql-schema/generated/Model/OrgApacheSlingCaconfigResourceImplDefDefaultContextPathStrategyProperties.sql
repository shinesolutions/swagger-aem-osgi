--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyP`
--
SELECT `enabled`, `configRefResourceNames`, `configRefPropertyNames`, `service.ranking` FROM `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyP`
--
INSERT INTO `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyP`(`enabled`, `configRefResourceNames`, `configRefPropertyNames`, `service.ranking`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyP`
--
UPDATE `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyP` SET `enabled` = ?, `configRefResourceNames` = ?, `configRefPropertyNames` = ?, `service.ranking` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyP`
--
DELETE FROM `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyP` WHERE 0;

