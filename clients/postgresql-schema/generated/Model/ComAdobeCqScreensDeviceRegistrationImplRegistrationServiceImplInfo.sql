--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_device_registration_impl_registration_serv'
--
SELECT pid, title, description, properties FROM com_adobe_cq_screens_device_registration_impl_registration_serv WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_device_registration_impl_registration_serv'
--
INSERT INTO com_adobe_cq_screens_device_registration_impl_registration_serv (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_screens_device_registration_impl_registration_serv'
--
UPDATE com_adobe_cq_screens_device_registration_impl_registration_serv SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_device_registration_impl_registration_serv'
--
DELETE FROM com_adobe_cq_screens_device_registration_impl_registration_serv WHERE 1=2;

