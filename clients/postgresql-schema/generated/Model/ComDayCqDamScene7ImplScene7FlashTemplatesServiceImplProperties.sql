--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_'
--
SELECT scene7_flash_templates/rti, scene7_flash_templates/rsi, scene7_flash_templates/rb, scene7_flash_templates/rurl, scene7_flash_template/url_format_parameter FROM com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_'
--
INSERT INTO com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_ (scene7_flash_templates/rti, scene7_flash_templates/rsi, scene7_flash_templates/rb, scene7_flash_templates/rurl, scene7_flash_template/url_format_parameter) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_'
--
UPDATE com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_ SET scene7_flash_templates/rti = ?, scene7_flash_templates/rsi = ?, scene7_flash_templates/rb = ?, scene7_flash_templates/rurl = ?, scene7_flash_template/url_format_parameter = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_'
--
DELETE FROM com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_ WHERE 1=2;

