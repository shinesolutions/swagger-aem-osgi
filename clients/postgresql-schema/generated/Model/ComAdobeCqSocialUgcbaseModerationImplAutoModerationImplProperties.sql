--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_imp'
--
SELECT automoderation/sequence, automoderation/onfailurestop FROM com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_imp WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_imp'
--
INSERT INTO com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_imp (automoderation/sequence, automoderation/onfailurestop) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_imp'
--
UPDATE com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_imp SET automoderation/sequence = ?, automoderation/onfailurestop = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_imp'
--
DELETE FROM com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_imp WHERE 1=2;

