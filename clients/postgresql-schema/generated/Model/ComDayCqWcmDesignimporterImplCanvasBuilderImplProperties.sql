--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmDesignimporterImplCanvasBuilderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properti'
--
SELECT filepattern, build/page/nodes, build/client/libs, build/canvas/component FROM com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properti'
--
INSERT INTO com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properti (filepattern, build/page/nodes, build/client/libs, build/canvas/component) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properti'
--
UPDATE com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properti SET filepattern = ?, build/page/nodes = ?, build/client/libs = ?, build/canvas/component = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properti'
--
DELETE FROM com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properti WHERE 1=2;

