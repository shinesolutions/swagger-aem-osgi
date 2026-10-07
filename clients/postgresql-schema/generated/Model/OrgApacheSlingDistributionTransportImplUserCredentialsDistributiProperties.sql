--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_transport_impl_user_credentials_d'
--
SELECT "name", username, "password" FROM org_apache_sling_distribution_transport_impl_user_credentials_d WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_transport_impl_user_credentials_d'
--
INSERT INTO org_apache_sling_distribution_transport_impl_user_credentials_d ("name", username, "password") VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_transport_impl_user_credentials_d'
--
UPDATE org_apache_sling_distribution_transport_impl_user_credentials_d SET "name" = ?, username = ?, "password" = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_transport_impl_user_credentials_d'
--
DELETE FROM org_apache_sling_distribution_transport_impl_user_credentials_d WHERE 1=2;

