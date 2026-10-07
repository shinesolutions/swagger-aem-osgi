--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_offloading_impl_offloading_job_offloader_prop'
--
SELECT offloading/offloader/enabled FROM com_adobe_granite_offloading_impl_offloading_job_offloader_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_offloading_impl_offloading_job_offloader_prop'
--
INSERT INTO com_adobe_granite_offloading_impl_offloading_job_offloader_prop (offloading/offloader/enabled) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_offloading_impl_offloading_job_offloader_prop'
--
UPDATE com_adobe_granite_offloading_impl_offloading_job_offloader_prop SET offloading/offloader/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_offloading_impl_offloading_job_offloader_prop'
--
DELETE FROM com_adobe_granite_offloading_impl_offloading_job_offloader_prop WHERE 1=2;

