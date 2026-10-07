--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_p'
--
SELECT filepattern, device/groups, build/page/nodes, build/client/libs, build/canvas/component FROM com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_p WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_p'
--
INSERT INTO com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_p (filepattern, device/groups, build/page/nodes, build/client/libs, build/canvas/component) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_p'
--
UPDATE com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_p SET filepattern = ?, device/groups = ?, build/page/nodes = ?, build/client/libs = ?, build/canvas/component = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_p'
--
DELETE FROM com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_p WHERE 1=2;

