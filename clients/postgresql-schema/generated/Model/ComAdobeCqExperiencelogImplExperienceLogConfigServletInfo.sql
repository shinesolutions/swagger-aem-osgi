--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqExperiencelogImplExperienceLogConfigServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_i'
--
SELECT pid, title, description, properties, additional_properties, bundle_location, service_location FROM com_adobe_cq_experiencelog_impl_experience_log_config_servlet_i WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_i'
--
INSERT INTO com_adobe_cq_experiencelog_impl_experience_log_config_servlet_i (pid, title, description, properties, additional_properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_i'
--
UPDATE com_adobe_cq_experiencelog_impl_experience_log_config_servlet_i SET pid = ?, title = ?, description = ?, properties = ?, additional_properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_i'
--
DELETE FROM com_adobe_cq_experiencelog_impl_experience_log_config_servlet_i WHERE 1=2;

