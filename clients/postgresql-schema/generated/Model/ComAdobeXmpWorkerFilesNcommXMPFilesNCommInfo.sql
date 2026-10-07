--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info WHERE 1=1;

--
-- INSERT template for table 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info'
--
INSERT INTO com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info'
--
UPDATE com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info'
--
DELETE FROM com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info WHERE 1=2;

