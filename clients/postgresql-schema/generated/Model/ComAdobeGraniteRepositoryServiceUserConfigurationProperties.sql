--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRepositoryServiceUserConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_repository_service_user_configuration_propert'
--
SELECT service/ranking, serviceusers/simple_subject_population, serviceusers/list FROM com_adobe_granite_repository_service_user_configuration_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_repository_service_user_configuration_propert'
--
INSERT INTO com_adobe_granite_repository_service_user_configuration_propert (service/ranking, serviceusers/simple_subject_population, serviceusers/list) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_repository_service_user_configuration_propert'
--
UPDATE com_adobe_granite_repository_service_user_configuration_propert SET service/ranking = ?, serviceusers/simple_subject_population = ?, serviceusers/list = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_repository_service_user_configuration_propert'
--
DELETE FROM com_adobe_granite_repository_service_user_configuration_propert WHERE 1=2;

