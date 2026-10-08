--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_security_hc_packages_impl_example_content_health_c'
--
SELECT hc/tags FROM com_adobe_cq_security_hc_packages_impl_example_content_health_c WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_security_hc_packages_impl_example_content_health_c'
--
INSERT INTO com_adobe_cq_security_hc_packages_impl_example_content_health_c (hc/tags) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_security_hc_packages_impl_example_content_health_c'
--
UPDATE com_adobe_cq_security_hc_packages_impl_example_content_health_c SET hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_security_hc_packages_impl_example_content_health_c'
--
DELETE FROM com_adobe_cq_security_hc_packages_impl_example_content_health_c WHERE 1=2;

