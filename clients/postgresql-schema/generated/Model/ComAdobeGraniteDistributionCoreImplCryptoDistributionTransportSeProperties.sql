--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_distribution_core_impl_crypto_distribution_tr'
--
SELECT "name", username, encrypted_password FROM com_adobe_granite_distribution_core_impl_crypto_distribution_tr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_distribution_core_impl_crypto_distribution_tr'
--
INSERT INTO com_adobe_granite_distribution_core_impl_crypto_distribution_tr ("name", username, encrypted_password) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_distribution_core_impl_crypto_distribution_tr'
--
UPDATE com_adobe_granite_distribution_core_impl_crypto_distribution_tr SET "name" = ?, username = ?, encrypted_password = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_distribution_core_impl_crypto_distribution_tr'
--
DELETE FROM com_adobe_granite_distribution_core_impl_crypto_distribution_tr WHERE 1=2;

