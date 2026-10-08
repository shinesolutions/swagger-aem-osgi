--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_filelibrary_client_endpoints_impl_file_libr'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_filelibrary_client_endpoints_impl_file_libr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_filelibrary_client_endpoints_impl_file_libr'
--
INSERT INTO com_adobe_cq_social_filelibrary_client_endpoints_impl_file_libr (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_filelibrary_client_endpoints_impl_file_libr'
--
UPDATE com_adobe_cq_social_filelibrary_client_endpoints_impl_file_libr SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_filelibrary_client_endpoints_impl_file_libr'
--
DELETE FROM com_adobe_cq_social_filelibrary_client_endpoints_impl_file_libr WHERE 1=2;

