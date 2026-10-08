--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'MessagingUserComponentFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'messaging_user_component_factory_info'
--
SELECT pid, title, description, properties FROM messaging_user_component_factory_info WHERE 1=1;

--
-- INSERT template for table 'messaging_user_component_factory_info'
--
INSERT INTO messaging_user_component_factory_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'messaging_user_component_factory_info'
--
UPDATE messaging_user_component_factory_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'messaging_user_component_factory_info'
--
DELETE FROM messaging_user_component_factory_info WHERE 1=2;

