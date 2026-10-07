--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_saml_saml_authentication_handler_propert'
--
SELECT "path", service/ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, user_intermediate_path, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, identity_sync_type, idp_identifier FROM com_adobe_granite_auth_saml_saml_authentication_handler_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_saml_saml_authentication_handler_propert'
--
INSERT INTO com_adobe_granite_auth_saml_saml_authentication_handler_propert ("path", service/ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, user_intermediate_path, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, identity_sync_type, idp_identifier) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_saml_saml_authentication_handler_propert'
--
UPDATE com_adobe_granite_auth_saml_saml_authentication_handler_propert SET "path" = ?, service/ranking = ?, idp_url = ?, idp_cert_alias = ?, idp_http_redirect = ?, service_provider_entity_id = ?, assertion_consumer_service_url = ?, sp_private_key_alias = ?, key_store_password = ?, default_redirect_url = ?, user_id_attribute = ?, use_encryption = ?, create_user = ?, user_intermediate_path = ?, add_group_memberships = ?, group_membership_attribute = ?, default_groups = ?, name_id_format = ?, synchronize_attributes = ?, handle_logout = ?, logout_url = ?, clock_tolerance = ?, digest_method = ?, signature_method = ?, identity_sync_type = ?, idp_identifier = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_saml_saml_authentication_handler_propert'
--
DELETE FROM com_adobe_granite_auth_saml_saml_authentication_handler_propert WHERE 1=2;

