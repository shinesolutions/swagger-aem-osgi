--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_taskmanagement_impl_service_task_manager_adap'
--
SELECT adapter/condition, taskmanager/admingroups FROM com_adobe_granite_taskmanagement_impl_service_task_manager_adap WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_taskmanagement_impl_service_task_manager_adap'
--
INSERT INTO com_adobe_granite_taskmanagement_impl_service_task_manager_adap (adapter/condition, taskmanager/admingroups) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_taskmanagement_impl_service_task_manager_adap'
--
UPDATE com_adobe_granite_taskmanagement_impl_service_task_manager_adap SET adapter/condition = ?, taskmanager/admingroups = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_taskmanagement_impl_service_task_manager_adap'
--
DELETE FROM com_adobe_granite_taskmanagement_impl_service_task_manager_adap WHERE 1=2;

