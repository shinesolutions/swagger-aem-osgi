--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSearchImplBuilderQueryBuilderImplProperties' definition.
--


--
-- SELECT template for table `comDayCqSearchImplBuilderQueryBuilderImplProperties`
--
SELECT `excerpt.properties`, `cache.max.entries`, `cache.entry.lifetime`, `xpath.union` FROM `comDayCqSearchImplBuilderQueryBuilderImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqSearchImplBuilderQueryBuilderImplProperties`
--
INSERT INTO `comDayCqSearchImplBuilderQueryBuilderImplProperties`(`excerpt.properties`, `cache.max.entries`, `cache.entry.lifetime`, `xpath.union`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqSearchImplBuilderQueryBuilderImplProperties`
--
UPDATE `comDayCqSearchImplBuilderQueryBuilderImplProperties` SET `excerpt.properties` = ?, `cache.max.entries` = ?, `cache.entry.lifetime` = ?, `xpath.union` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSearchImplBuilderQueryBuilderImplProperties`
--
DELETE FROM `comDayCqSearchImplBuilderQueryBuilderImplProperties` WHERE 0;

