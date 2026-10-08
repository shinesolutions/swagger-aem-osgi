--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_vali'
--
SELECT parameter/whitelist, parameter/whitelist/prefixes, binary/parameter/whitelist, modifier/whitelist, operation/whitelist, operation/whitelist/prefixes, typehint/whitelist, resourcetype/whitelist FROM com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_vali WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_vali'
--
INSERT INTO com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_vali (parameter/whitelist, parameter/whitelist/prefixes, binary/parameter/whitelist, modifier/whitelist, operation/whitelist, operation/whitelist/prefixes, typehint/whitelist, resourcetype/whitelist) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_vali'
--
UPDATE com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_vali SET parameter/whitelist = ?, parameter/whitelist/prefixes = ?, binary/parameter/whitelist = ?, modifier/whitelist = ?, operation/whitelist = ?, operation/whitelist/prefixes = ?, typehint/whitelist = ?, resourcetype/whitelist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_vali'
--
DELETE FROM com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_vali WHERE 1=2;

