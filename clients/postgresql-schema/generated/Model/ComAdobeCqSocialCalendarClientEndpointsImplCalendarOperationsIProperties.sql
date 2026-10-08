--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_calendar_client_endpoints_impl_calendar_ope'
--
SELECT max_retry, field_whitelist, attachment_type_blacklist FROM com_adobe_cq_social_calendar_client_endpoints_impl_calendar_ope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_calendar_client_endpoints_impl_calendar_ope'
--
INSERT INTO com_adobe_cq_social_calendar_client_endpoints_impl_calendar_ope (max_retry, field_whitelist, attachment_type_blacklist) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_calendar_client_endpoints_impl_calendar_ope'
--
UPDATE com_adobe_cq_social_calendar_client_endpoints_impl_calendar_ope SET max_retry = ?, field_whitelist = ?, attachment_type_blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_calendar_client_endpoints_impl_calendar_ope'
--
DELETE FROM com_adobe_cq_social_calendar_client_endpoints_impl_calendar_ope WHERE 1=2;

