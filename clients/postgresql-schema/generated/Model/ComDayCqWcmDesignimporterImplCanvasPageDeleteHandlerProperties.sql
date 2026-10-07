--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_p'
--
SELECT min_thread_pool_size, max_thread_pool_size FROM com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_p WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_p'
--
INSERT INTO com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_p (min_thread_pool_size, max_thread_pool_size) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_p'
--
UPDATE com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_p SET min_thread_pool_size = ?, max_thread_pool_size = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_p'
--
DELETE FROM com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_p WHERE 1=2;

