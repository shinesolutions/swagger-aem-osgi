--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_in'
--
SELECT pid, title, description, properties FROM com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_in WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_in'
--
INSERT INTO com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_in (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_in'
--
UPDATE com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_in SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_in'
--
DELETE FROM com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_in WHERE 1=2;

