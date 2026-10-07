--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_repository_hc_impl_authorizable_node_name_hea'
--
SELECT pid, title, description, properties FROM com_adobe_granite_repository_hc_impl_authorizable_node_name_hea WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_repository_hc_impl_authorizable_node_name_hea'
--
INSERT INTO com_adobe_granite_repository_hc_impl_authorizable_node_name_hea (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_repository_hc_impl_authorizable_node_name_hea'
--
UPDATE com_adobe_granite_repository_hc_impl_authorizable_node_name_hea SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_repository_hc_impl_authorizable_node_name_hea'
--
DELETE FROM com_adobe_granite_repository_hc_impl_authorizable_node_name_hea WHERE 1=2;

