--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_'
--
SELECT pid, title, description, properties FROM com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_'
--
INSERT INTO com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_'
--
UPDATE com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_'
--
DELETE FROM com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_ WHERE 1=2;

