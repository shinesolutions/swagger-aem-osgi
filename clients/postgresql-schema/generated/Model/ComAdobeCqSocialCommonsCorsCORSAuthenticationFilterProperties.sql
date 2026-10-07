--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_cors_cors_authentication_filter_pro'
--
SELECT cors/enabling FROM com_adobe_cq_social_commons_cors_cors_authentication_filter_pro WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_cors_cors_authentication_filter_pro'
--
INSERT INTO com_adobe_cq_social_commons_cors_cors_authentication_filter_pro (cors/enabling) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_cors_cors_authentication_filter_pro'
--
UPDATE com_adobe_cq_social_commons_cors_cors_authentication_filter_pro SET cors/enabling = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_cors_cors_authentication_filter_pro'
--
DELETE FROM com_adobe_cq_social_commons_cors_cors_authentication_filter_pro WHERE 1=2;

