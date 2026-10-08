--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do'
--
SELECT sling/servlet/selectors, sling/servlet/extensions FROM com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do'
--
INSERT INTO com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do (sling/servlet/selectors, sling/servlet/extensions) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do'
--
UPDATE com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do SET sling/servlet/selectors = ?, sling/servlet/extensions = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do'
--
DELETE FROM com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_do WHERE 1=2;

