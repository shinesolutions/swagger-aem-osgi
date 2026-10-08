--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_task_properti'
--
SELECT scheduler/period, scheduler/concurrent, good_link_test_interval, bad_link_test_interval, link_unused_interval, connection/timeout FROM com_day_cq_rewriter_linkchecker_impl_link_checker_task_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_task_properti'
--
INSERT INTO com_day_cq_rewriter_linkchecker_impl_link_checker_task_properti (scheduler/period, scheduler/concurrent, good_link_test_interval, bad_link_test_interval, link_unused_interval, connection/timeout) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_task_properti'
--
UPDATE com_day_cq_rewriter_linkchecker_impl_link_checker_task_properti SET scheduler/period = ?, scheduler/concurrent = ?, good_link_test_interval = ?, bad_link_test_interval = ?, link_unused_interval = ?, connection/timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_task_properti'
--
DELETE FROM com_day_cq_rewriter_linkchecker_impl_link_checker_task_properti WHERE 1=2;

