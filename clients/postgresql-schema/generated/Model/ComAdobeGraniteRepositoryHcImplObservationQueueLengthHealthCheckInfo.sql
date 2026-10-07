--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_repository_hc_impl_observation_queue_length_h'
--
SELECT pid, title, description, properties FROM com_adobe_granite_repository_hc_impl_observation_queue_length_h WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_repository_hc_impl_observation_queue_length_h'
--
INSERT INTO com_adobe_granite_repository_hc_impl_observation_queue_length_h (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_repository_hc_impl_observation_queue_length_h'
--
UPDATE com_adobe_granite_repository_hc_impl_observation_queue_length_h SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_repository_hc_impl_observation_queue_length_h'
--
DELETE FROM com_adobe_granite_repository_hc_impl_observation_queue_length_h WHERE 1=2;

