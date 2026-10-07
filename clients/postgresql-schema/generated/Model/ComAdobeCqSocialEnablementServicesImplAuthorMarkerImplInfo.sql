--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_enablement_services_impl_author_marker_impl'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_cq_social_enablement_services_impl_author_marker_impl WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_enablement_services_impl_author_marker_impl'
--
INSERT INTO com_adobe_cq_social_enablement_services_impl_author_marker_impl (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_enablement_services_impl_author_marker_impl'
--
UPDATE com_adobe_cq_social_enablement_services_impl_author_marker_impl SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_enablement_services_impl_author_marker_impl'
--
DELETE FROM com_adobe_cq_social_enablement_services_impl_author_marker_impl WHERE 1=2;

