--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCalendarServletsTimeZoneServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_calendar_servlets_time_zone_servlet_propert'
--
SELECT timezones/expirytime FROM com_adobe_cq_social_calendar_servlets_time_zone_servlet_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_calendar_servlets_time_zone_servlet_propert'
--
INSERT INTO com_adobe_cq_social_calendar_servlets_time_zone_servlet_propert (timezones/expirytime) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_calendar_servlets_time_zone_servlet_propert'
--
UPDATE com_adobe_cq_social_calendar_servlets_time_zone_servlet_propert SET timezones/expirytime = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_calendar_servlets_time_zone_servlet_propert'
--
DELETE FROM com_adobe_cq_social_calendar_servlets_time_zone_servlet_propert WHERE 1=2;

