--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUserImplTransportHttpToPublisherProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_user_impl_transport_http_to_publisher_prope'
--
SELECT "enable", agent/configuration, context/path, disabled/cipher/suites, enabled/cipher/suites FROM com_adobe_cq_social_user_impl_transport_http_to_publisher_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_user_impl_transport_http_to_publisher_prope'
--
INSERT INTO com_adobe_cq_social_user_impl_transport_http_to_publisher_prope ("enable", agent/configuration, context/path, disabled/cipher/suites, enabled/cipher/suites) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_user_impl_transport_http_to_publisher_prope'
--
UPDATE com_adobe_cq_social_user_impl_transport_http_to_publisher_prope SET "enable" = ?, agent/configuration = ?, context/path = ?, disabled/cipher/suites = ?, enabled/cipher/suites = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_user_impl_transport_http_to_publisher_prope'
--
DELETE FROM com_adobe_cq_social_user_impl_transport_http_to_publisher_prope WHERE 1=2;

