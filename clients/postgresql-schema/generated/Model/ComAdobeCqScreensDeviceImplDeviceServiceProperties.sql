--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensDeviceImplDeviceServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_device_impl_device_service_properties'
--
SELECT com/adobe/aem/screens/player/pingfrequency, com/adobe/aem/screens/device/pasword/specialchars, com/adobe/aem/screens/device/pasword/minlowercasechars, com/adobe/aem/screens/device/pasword/minuppercasechars, com/adobe/aem/screens/device/pasword/minnumberchars, com/adobe/aem/screens/device/pasword/minspecialchars, com/adobe/aem/screens/device/pasword/minlength FROM com_adobe_cq_screens_device_impl_device_service_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_device_impl_device_service_properties'
--
INSERT INTO com_adobe_cq_screens_device_impl_device_service_properties (com/adobe/aem/screens/player/pingfrequency, com/adobe/aem/screens/device/pasword/specialchars, com/adobe/aem/screens/device/pasword/minlowercasechars, com/adobe/aem/screens/device/pasword/minuppercasechars, com/adobe/aem/screens/device/pasword/minnumberchars, com/adobe/aem/screens/device/pasword/minspecialchars, com/adobe/aem/screens/device/pasword/minlength) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_screens_device_impl_device_service_properties'
--
UPDATE com_adobe_cq_screens_device_impl_device_service_properties SET com/adobe/aem/screens/player/pingfrequency = ?, com/adobe/aem/screens/device/pasword/specialchars = ?, com/adobe/aem/screens/device/pasword/minlowercasechars = ?, com/adobe/aem/screens/device/pasword/minuppercasechars = ?, com/adobe/aem/screens/device/pasword/minnumberchars = ?, com/adobe/aem/screens/device/pasword/minspecialchars = ?, com/adobe/aem/screens/device/pasword/minlength = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_device_impl_device_service_properties'
--
DELETE FROM com_adobe_cq_screens_device_impl_device_service_properties WHERE 1=2;

