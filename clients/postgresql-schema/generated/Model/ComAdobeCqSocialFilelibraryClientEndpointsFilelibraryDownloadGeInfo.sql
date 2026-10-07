--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do'
--
INSERT INTO com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do'
--
UPDATE com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do'
--
DELETE FROM com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do WHERE 1=2;

