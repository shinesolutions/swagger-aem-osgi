--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'adaptive_form_and_interactive_communication_web_channel_configu'
--
SELECT pid, title, description, properties FROM adaptive_form_and_interactive_communication_web_channel_configu WHERE 1=1;

--
-- INSERT template for table 'adaptive_form_and_interactive_communication_web_channel_configu'
--
INSERT INTO adaptive_form_and_interactive_communication_web_channel_configu (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'adaptive_form_and_interactive_communication_web_channel_configu'
--
UPDATE adaptive_form_and_interactive_communication_web_channel_configu SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'adaptive_form_and_interactive_communication_web_channel_configu'
--
DELETE FROM adaptive_form_and_interactive_communication_web_channel_configu WHERE 1=2;

