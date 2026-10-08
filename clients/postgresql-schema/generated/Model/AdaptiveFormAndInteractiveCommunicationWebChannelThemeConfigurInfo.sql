--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'adaptive_form_and_interactive_communication_web_channel_theme_c'
--
SELECT pid, title, description, properties FROM adaptive_form_and_interactive_communication_web_channel_theme_c WHERE 1=1;

--
-- INSERT template for table 'adaptive_form_and_interactive_communication_web_channel_theme_c'
--
INSERT INTO adaptive_form_and_interactive_communication_web_channel_theme_c (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'adaptive_form_and_interactive_communication_web_channel_theme_c'
--
UPDATE adaptive_form_and_interactive_communication_web_channel_theme_c SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'adaptive_form_and_interactive_communication_web_channel_theme_c'
--
DELETE FROM adaptive_form_and_interactive_communication_web_channel_theme_c WHERE 1=2;

