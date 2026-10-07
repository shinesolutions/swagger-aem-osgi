--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRepositoryImplCommitStatsConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_repository_impl_commit_stats_config_propertie'
--
SELECT enabled, interval_seconds, commits_per_interval_threshold, max_location_length, max_details_shown, min_details_percentage, thread_matchers, max_greedy_depth, greedy_stack_matchers, stack_filters, stack_matchers, stack_categorizers, stack_shorteners FROM com_adobe_granite_repository_impl_commit_stats_config_propertie WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_repository_impl_commit_stats_config_propertie'
--
INSERT INTO com_adobe_granite_repository_impl_commit_stats_config_propertie (enabled, interval_seconds, commits_per_interval_threshold, max_location_length, max_details_shown, min_details_percentage, thread_matchers, max_greedy_depth, greedy_stack_matchers, stack_filters, stack_matchers, stack_categorizers, stack_shorteners) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_repository_impl_commit_stats_config_propertie'
--
UPDATE com_adobe_granite_repository_impl_commit_stats_config_propertie SET enabled = ?, interval_seconds = ?, commits_per_interval_threshold = ?, max_location_length = ?, max_details_shown = ?, min_details_percentage = ?, thread_matchers = ?, max_greedy_depth = ?, greedy_stack_matchers = ?, stack_filters = ?, stack_matchers = ?, stack_categorizers = ?, stack_shorteners = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_repository_impl_commit_stats_config_propertie'
--
DELETE FROM com_adobe_granite_repository_impl_commit_stats_config_propertie WHERE 1=2;

