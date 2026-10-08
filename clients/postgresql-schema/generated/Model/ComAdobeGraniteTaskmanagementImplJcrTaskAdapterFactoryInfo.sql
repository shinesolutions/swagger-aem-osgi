--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_'
--
SELECT pid, title, description, properties FROM com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_'
--
INSERT INTO com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_'
--
UPDATE com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_'
--
DELETE FROM com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_ WHERE 1=2;

