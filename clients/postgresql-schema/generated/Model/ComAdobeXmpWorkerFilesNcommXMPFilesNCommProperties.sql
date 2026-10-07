--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties'
--
SELECT max_connections, max_requests, request_timeout, log_dir FROM com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties'
--
INSERT INTO com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties (max_connections, max_requests, request_timeout, log_dir) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties'
--
UPDATE com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties SET max_connections = ?, max_requests = ?, request_timeout = ?, log_dir = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties'
--
DELETE FROM com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties WHERE 1=2;

