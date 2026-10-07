--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properti'
--
SELECT scheduler/period, scheduler/concurrent, service/bad_link_tolerance_interval, service/check_override_patterns, service/cache_broken_internal_links, service/special_link_prefix, service/special_link_patterns FROM com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properti'
--
INSERT INTO com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properti (scheduler/period, scheduler/concurrent, service/bad_link_tolerance_interval, service/check_override_patterns, service/cache_broken_internal_links, service/special_link_prefix, service/special_link_patterns) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properti'
--
UPDATE com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properti SET scheduler/period = ?, scheduler/concurrent = ?, service/bad_link_tolerance_interval = ?, service/check_override_patterns = ?, service/cache_broken_internal_links = ?, service/special_link_prefix = ?, service/special_link_patterns = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properti'
--
DELETE FROM com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properti WHERE 1=2;

