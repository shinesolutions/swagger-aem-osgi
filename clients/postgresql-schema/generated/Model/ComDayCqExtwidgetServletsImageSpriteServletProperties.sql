--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqExtwidgetServletsImageSpriteServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_extwidget_servlets_image_sprite_servlet_properties'
--
SELECT max_width, max_height FROM com_day_cq_extwidget_servlets_image_sprite_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_extwidget_servlets_image_sprite_servlet_properties'
--
INSERT INTO com_day_cq_extwidget_servlets_image_sprite_servlet_properties (max_width, max_height) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_extwidget_servlets_image_sprite_servlet_properties'
--
UPDATE com_day_cq_extwidget_servlets_image_sprite_servlet_properties SET max_width = ?, max_height = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_extwidget_servlets_image_sprite_servlet_properties'
--
DELETE FROM com_day_cq_extwidget_servlets_image_sprite_servlet_properties WHERE 1=2;

