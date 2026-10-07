--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_security_impl_safer_sling_post_valida'
--
SELECT parameter/whitelist, parameter/whitelist/prefixes, binary/parameter/whitelist, modifier/whitelist, operation/whitelist, operation/whitelist/prefixes, typehint/whitelist, resourcetype/whitelist FROM com_day_cq_wcm_foundation_security_impl_safer_sling_post_valida WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_security_impl_safer_sling_post_valida'
--
INSERT INTO com_day_cq_wcm_foundation_security_impl_safer_sling_post_valida (parameter/whitelist, parameter/whitelist/prefixes, binary/parameter/whitelist, modifier/whitelist, operation/whitelist, operation/whitelist/prefixes, typehint/whitelist, resourcetype/whitelist) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_security_impl_safer_sling_post_valida'
--
UPDATE com_day_cq_wcm_foundation_security_impl_safer_sling_post_valida SET parameter/whitelist = ?, parameter/whitelist/prefixes = ?, binary/parameter/whitelist = ?, modifier/whitelist = ?, operation/whitelist = ?, operation/whitelist/prefixes = ?, typehint/whitelist = ?, resourcetype/whitelist = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_security_impl_safer_sling_post_valida'
--
DELETE FROM com_day_cq_wcm_foundation_security_impl_safer_sling_post_valida WHERE 1=2;

