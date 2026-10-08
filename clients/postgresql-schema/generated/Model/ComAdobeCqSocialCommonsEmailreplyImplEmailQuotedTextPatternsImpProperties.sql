--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_p'
--
SELECT pattern/time, pattern/newline, pattern/day_of_month, pattern/month, pattern/year, pattern/date, pattern/date_time, pattern/email FROM com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_p WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_p'
--
INSERT INTO com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_p (pattern/time, pattern/newline, pattern/day_of_month, pattern/month, pattern/year, pattern/date, pattern/date_time, pattern/email) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_p'
--
UPDATE com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_p SET pattern/time = ?, pattern/newline = ?, pattern/day_of_month = ?, pattern/month = ?, pattern/year = ?, pattern/date = ?, pattern/date_time = ?, pattern/email = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_p'
--
DELETE FROM com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_p WHERE 1=2;

