--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_pr'
--
SELECT cq/pagesupdatehandler/imageresourcetypes FROM com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_pr WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_pr'
--
INSERT INTO com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_pr (cq/pagesupdatehandler/imageresourcetypes) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_pr'
--
UPDATE com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_pr SET cq/pagesupdatehandler/imageresourcetypes = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_pr'
--
DELETE FROM com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_pr WHERE 1=2;

