--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_calendar_client_operationextensions_event_a'
--
SELECT attachment_type_blacklist, extension/order FROM com_adobe_cq_social_calendar_client_operationextensions_event_a WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_calendar_client_operationextensions_event_a'
--
INSERT INTO com_adobe_cq_social_calendar_client_operationextensions_event_a (attachment_type_blacklist, extension/order) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_calendar_client_operationextensions_event_a'
--
UPDATE com_adobe_cq_social_calendar_client_operationextensions_event_a SET attachment_type_blacklist = ?, extension/order = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_calendar_client_operationextensions_event_a'
--
DELETE FROM com_adobe_cq_social_calendar_client_operationextensions_event_a WHERE 1=2;

