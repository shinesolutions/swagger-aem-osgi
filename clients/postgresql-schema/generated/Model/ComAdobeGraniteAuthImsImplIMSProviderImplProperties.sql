--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthImsImplIMSProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_ims_impl_ims_provider_impl_properties'
--
SELECT oauth/provider/id, oauth/provider/ims/authorization/url, oauth/provider/ims/token/url, oauth/provider/ims/profile/url, oauth/provider/ims/extended/details/urls, oauth/provider/ims/validate/token/url, oauth/provider/ims/session/property, oauth/provider/ims/service/token/client/id, oauth/provider/ims/service/token/client/secret, oauth/provider/ims/service/token, ims/org/ref, ims/group/mapping, oauth/provider/ims/only/license/group FROM com_adobe_granite_auth_ims_impl_ims_provider_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_ims_impl_ims_provider_impl_properties'
--
INSERT INTO com_adobe_granite_auth_ims_impl_ims_provider_impl_properties (oauth/provider/id, oauth/provider/ims/authorization/url, oauth/provider/ims/token/url, oauth/provider/ims/profile/url, oauth/provider/ims/extended/details/urls, oauth/provider/ims/validate/token/url, oauth/provider/ims/session/property, oauth/provider/ims/service/token/client/id, oauth/provider/ims/service/token/client/secret, oauth/provider/ims/service/token, ims/org/ref, ims/group/mapping, oauth/provider/ims/only/license/group) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_ims_impl_ims_provider_impl_properties'
--
UPDATE com_adobe_granite_auth_ims_impl_ims_provider_impl_properties SET oauth/provider/id = ?, oauth/provider/ims/authorization/url = ?, oauth/provider/ims/token/url = ?, oauth/provider/ims/profile/url = ?, oauth/provider/ims/extended/details/urls = ?, oauth/provider/ims/validate/token/url = ?, oauth/provider/ims/session/property = ?, oauth/provider/ims/service/token/client/id = ?, oauth/provider/ims/service/token/client/secret = ?, oauth/provider/ims/service/token = ?, ims/org/ref = ?, ims/group/mapping = ?, oauth/provider/ims/only/license/group = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_ims_impl_ims_provider_impl_properties'
--
DELETE FROM com_adobe_granite_auth_ims_impl_ims_provider_impl_properties WHERE 1=2;

