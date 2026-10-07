--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqExperiencelogImplExperienceLogConfigServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_p'
--
SELECT enabled, disabled_for_groups FROM com_adobe_cq_experiencelog_impl_experience_log_config_servlet_p WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_p'
--
INSERT INTO com_adobe_cq_experiencelog_impl_experience_log_config_servlet_p (enabled, disabled_for_groups) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_p'
--
UPDATE com_adobe_cq_experiencelog_impl_experience_log_config_servlet_p SET enabled = ?, disabled_for_groups = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_p'
--
DELETE FROM com_adobe_cq_experiencelog_impl_experience_log_config_servlet_p WHERE 1=2;

