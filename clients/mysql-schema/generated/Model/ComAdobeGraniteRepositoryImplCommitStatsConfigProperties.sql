--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRepositoryImplCommitStatsConfigProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteRepositoryImplCommitStatsConfigProperties`
--
SELECT `enabled`, `intervalSeconds`, `commitsPerIntervalThreshold`, `maxLocationLength`, `maxDetailsShown`, `minDetailsPercentage`, `threadMatchers`, `maxGreedyDepth`, `greedyStackMatchers`, `stackFilters`, `stackMatchers`, `stackCategorizers`, `stackShorteners` FROM `comAdobeGraniteRepositoryImplCommitStatsConfigProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRepositoryImplCommitStatsConfigProperties`
--
INSERT INTO `comAdobeGraniteRepositoryImplCommitStatsConfigProperties`(`enabled`, `intervalSeconds`, `commitsPerIntervalThreshold`, `maxLocationLength`, `maxDetailsShown`, `minDetailsPercentage`, `threadMatchers`, `maxGreedyDepth`, `greedyStackMatchers`, `stackFilters`, `stackMatchers`, `stackCategorizers`, `stackShorteners`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteRepositoryImplCommitStatsConfigProperties`
--
UPDATE `comAdobeGraniteRepositoryImplCommitStatsConfigProperties` SET `enabled` = ?, `intervalSeconds` = ?, `commitsPerIntervalThreshold` = ?, `maxLocationLength` = ?, `maxDetailsShown` = ?, `minDetailsPercentage` = ?, `threadMatchers` = ?, `maxGreedyDepth` = ?, `greedyStackMatchers` = ?, `stackFilters` = ?, `stackMatchers` = ?, `stackCategorizers` = ?, `stackShorteners` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRepositoryImplCommitStatsConfigProperties`
--
DELETE FROM `comAdobeGraniteRepositoryImplCommitStatsConfigProperties` WHERE 0;

