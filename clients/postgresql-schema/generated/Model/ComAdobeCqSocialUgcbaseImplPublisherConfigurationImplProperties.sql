--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_p'
--
SELECT is_primary_publisher FROM com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_p WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_p'
--
INSERT INTO com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_p (is_primary_publisher) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_p'
--
UPDATE com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_p SET is_primary_publisher = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_p'
--
DELETE FROM com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_p WHERE 1=2;

