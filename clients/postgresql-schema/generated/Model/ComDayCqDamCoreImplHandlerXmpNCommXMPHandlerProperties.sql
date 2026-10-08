--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propert'
--
SELECT xmphandler/cq/formats FROM com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propert WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propert'
--
INSERT INTO com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propert (xmphandler/cq/formats) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propert'
--
UPDATE com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propert SET xmphandler/cq/formats = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propert'
--
DELETE FROM com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_propert WHERE 1=2;

