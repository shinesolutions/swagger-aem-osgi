--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamIdsImplIDSJobProcessorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_ids_impl_ids_job_processor_properties'
--
SELECT enable/multisession, ids/cc/enable, enable/retry, enable/retry/scripterror, externalizer/domain/cqhost, externalizer/domain/http FROM com_day_cq_dam_ids_impl_ids_job_processor_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_ids_impl_ids_job_processor_properties'
--
INSERT INTO com_day_cq_dam_ids_impl_ids_job_processor_properties (enable/multisession, ids/cc/enable, enable/retry, enable/retry/scripterror, externalizer/domain/cqhost, externalizer/domain/http) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_ids_impl_ids_job_processor_properties'
--
UPDATE com_day_cq_dam_ids_impl_ids_job_processor_properties SET enable/multisession = ?, ids/cc/enable = ?, enable/retry = ?, enable/retry/scripterror = ?, externalizer/domain/cqhost = ?, externalizer/domain/http = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_ids_impl_ids_job_processor_properties'
--
DELETE FROM com_day_cq_dam_ids_impl_ids_job_processor_properties WHERE 1=2;

