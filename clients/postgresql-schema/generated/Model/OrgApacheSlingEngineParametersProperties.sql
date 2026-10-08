--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEngineParametersProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_engine_parameters_properties'
--
SELECT sling/default/parameter/encoding, sling/default/max/parameters, file/location, file/threshold, file/max, request/max, sling/default/parameter/check_for_additional_container_paramete FROM org_apache_sling_engine_parameters_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_engine_parameters_properties'
--
INSERT INTO org_apache_sling_engine_parameters_properties (sling/default/parameter/encoding, sling/default/max/parameters, file/location, file/threshold, file/max, request/max, sling/default/parameter/check_for_additional_container_paramete) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_engine_parameters_properties'
--
UPDATE org_apache_sling_engine_parameters_properties SET sling/default/parameter/encoding = ?, sling/default/max/parameters = ?, file/location = ?, file/threshold = ?, file/max = ?, request/max = ?, sling/default/parameter/check_for_additional_container_paramete = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_engine_parameters_properties'
--
DELETE FROM org_apache_sling_engine_parameters_properties WHERE 1=2;

