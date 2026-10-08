--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqProjectsImplServletProjectImageServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_projects_impl_servlet_project_image_servlet_proper'
--
SELECT image/quality, image/supported/resolutions FROM com_adobe_cq_projects_impl_servlet_project_image_servlet_proper WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_projects_impl_servlet_project_image_servlet_proper'
--
INSERT INTO com_adobe_cq_projects_impl_servlet_project_image_servlet_proper (image/quality, image/supported/resolutions) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_projects_impl_servlet_project_image_servlet_proper'
--
UPDATE com_adobe_cq_projects_impl_servlet_project_image_servlet_proper SET image/quality = ?, image/supported/resolutions = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_projects_impl_servlet_project_image_servlet_proper'
--
DELETE FROM com_adobe_cq_projects_impl_servlet_project_image_servlet_proper WHERE 1=2;

