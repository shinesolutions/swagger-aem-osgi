--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_'
--
SELECT cq/dam/webdav/version/linking/enable, cq/dam/webdav/version/linking/scheduler/period, cq/dam/webdav/version/linking/staging/timeout FROM com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_'
--
INSERT INTO com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_ (cq/dam/webdav/version/linking/enable, cq/dam/webdav/version/linking/scheduler/period, cq/dam/webdav/version/linking/staging/timeout) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_'
--
UPDATE com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_ SET cq/dam/webdav/version/linking/enable = ?, cq/dam/webdav/version/linking/scheduler/period = ?, cq/dam/webdav/version/linking/staging/timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_'
--
DELETE FROM com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_ WHERE 1=2;

