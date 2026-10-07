--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingJobClonerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_offloading_impl_offloading_job_cloner_propert'
--
SELECT offloading/jobcloner/enabled FROM com_adobe_granite_offloading_impl_offloading_job_cloner_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_offloading_impl_offloading_job_cloner_propert'
--
INSERT INTO com_adobe_granite_offloading_impl_offloading_job_cloner_propert (offloading/jobcloner/enabled) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_offloading_impl_offloading_job_cloner_propert'
--
UPDATE com_adobe_granite_offloading_impl_offloading_job_cloner_propert SET offloading/jobcloner/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_offloading_impl_offloading_job_cloner_propert'
--
DELETE FROM com_adobe_granite_offloading_impl_offloading_job_cloner_propert WHERE 1=2;

