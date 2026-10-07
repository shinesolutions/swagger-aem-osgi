--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_authentication_ldap_impl_lda'
--
SELECT provider/name, host/name, host/port, host/ssl, host/tls, host/no_cert_check, bind/dn, bind/password, search_timeout, admin_pool/max_active, admin_pool/lookup_on_validate, user_pool/max_active, user_pool/lookup_on_validate, user/base_dn, user/objectclass, user/id_attribute, user/extra_filter, user/make_dn_path, group/base_dn, group/objectclass, group/name_attribute, group/extra_filter, group/make_dn_path, group/member_attribute, use_uid_for_ext_id, customattributes FROM org_apache_jackrabbit_oak_security_authentication_ldap_impl_lda WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_authentication_ldap_impl_lda'
--
INSERT INTO org_apache_jackrabbit_oak_security_authentication_ldap_impl_lda (provider/name, host/name, host/port, host/ssl, host/tls, host/no_cert_check, bind/dn, bind/password, search_timeout, admin_pool/max_active, admin_pool/lookup_on_validate, user_pool/max_active, user_pool/lookup_on_validate, user/base_dn, user/objectclass, user/id_attribute, user/extra_filter, user/make_dn_path, group/base_dn, group/objectclass, group/name_attribute, group/extra_filter, group/make_dn_path, group/member_attribute, use_uid_for_ext_id, customattributes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_authentication_ldap_impl_lda'
--
UPDATE org_apache_jackrabbit_oak_security_authentication_ldap_impl_lda SET provider/name = ?, host/name = ?, host/port = ?, host/ssl = ?, host/tls = ?, host/no_cert_check = ?, bind/dn = ?, bind/password = ?, search_timeout = ?, admin_pool/max_active = ?, admin_pool/lookup_on_validate = ?, user_pool/max_active = ?, user_pool/lookup_on_validate = ?, user/base_dn = ?, user/objectclass = ?, user/id_attribute = ?, user/extra_filter = ?, user/make_dn_path = ?, group/base_dn = ?, group/objectclass = ?, group/name_attribute = ?, group/extra_filter = ?, group/make_dn_path = ?, group/member_attribute = ?, use_uid_for_ext_id = ?, customattributes = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_authentication_ldap_impl_lda'
--
DELETE FROM org_apache_jackrabbit_oak_security_authentication_ldap_impl_lda WHERE 1=2;

