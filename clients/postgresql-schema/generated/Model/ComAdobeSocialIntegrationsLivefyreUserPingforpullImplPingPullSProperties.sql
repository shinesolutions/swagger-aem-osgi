--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_social_integrations_livefyre_user_pingforpull_impl_pi'
--
SELECT communities/integration/livefyre/sling/event/filter FROM com_adobe_social_integrations_livefyre_user_pingforpull_impl_pi WHERE 1=1;

--
-- INSERT template for table 'com_adobe_social_integrations_livefyre_user_pingforpull_impl_pi'
--
INSERT INTO com_adobe_social_integrations_livefyre_user_pingforpull_impl_pi (communities/integration/livefyre/sling/event/filter) VALUES (?);

--
-- UPDATE template for table 'com_adobe_social_integrations_livefyre_user_pingforpull_impl_pi'
--
UPDATE com_adobe_social_integrations_livefyre_user_pingforpull_impl_pi SET communities/integration/livefyre/sling/event/filter = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_social_integrations_livefyre_user_pingforpull_impl_pi'
--
DELETE FROM com_adobe_social_integrations_livefyre_user_pingforpull_impl_pi WHERE 1=2;

