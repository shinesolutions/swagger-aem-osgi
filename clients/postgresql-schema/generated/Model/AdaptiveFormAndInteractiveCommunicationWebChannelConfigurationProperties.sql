--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'adaptive_form_and_interactive_communication_web_channel_configu'
--
SELECT show_placeholder, maximum_cache_entries, af/scripting/compatversion, make_file_name_unique, generating_compliant_data FROM adaptive_form_and_interactive_communication_web_channel_configu WHERE 1=1;

--
-- INSERT template for table 'adaptive_form_and_interactive_communication_web_channel_configu'
--
INSERT INTO adaptive_form_and_interactive_communication_web_channel_configu (show_placeholder, maximum_cache_entries, af/scripting/compatversion, make_file_name_unique, generating_compliant_data) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'adaptive_form_and_interactive_communication_web_channel_configu'
--
UPDATE adaptive_form_and_interactive_communication_web_channel_configu SET show_placeholder = ?, maximum_cache_entries = ?, af/scripting/compatversion = ?, make_file_name_unique = ?, generating_compliant_data = ? WHERE 1=2;

--
-- DELETE template for table 'adaptive_form_and_interactive_communication_web_channel_configu'
--
DELETE FROM adaptive_form_and_interactive_communication_web_channel_configu WHERE 1=2;

