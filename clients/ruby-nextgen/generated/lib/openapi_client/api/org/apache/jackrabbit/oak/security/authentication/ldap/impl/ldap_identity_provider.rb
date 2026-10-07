# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, provider_name: nil, host_name: nil, host_port: nil, host_ssl: nil, host_tls: nil, host_no_cert_check: nil, bind_dn: nil, bind_password: nil, search_timeout: nil, admin_pool_max_active: nil, admin_pool_lookup_on_validate: nil, user_pool_max_active: nil, user_pool_lookup_on_validate: nil, user_base_dn: nil, user_objectclass: nil, user_id_attribute: nil, user_extra_filter: nil, user_make_dn_path: nil, group_base_dn: nil, group_objectclass: nil, group_name_attribute: nil, group_extra_filter: nil, group_make_dn_path: nil, group_member_attribute: nil, use_uid_for_ext_id: nil, customattributes: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdH2f6c61f8,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'provider.name' => provider_name, 'host.name' => host_name, 'host.port' => host_port, 'host.ssl' => host_ssl, 'host.tls' => host_tls, 'host.noCertCheck' => host_no_cert_check, 'bind.dn' => bind_dn, 'bind.password' => bind_password, 'searchTimeout' => search_timeout, 'adminPool.maxActive' => admin_pool_max_active, 'adminPool.lookupOnValidate' => admin_pool_lookup_on_validate, 'userPool.maxActive' => user_pool_max_active, 'userPool.lookupOnValidate' => user_pool_lookup_on_validate, 'user.baseDN' => user_base_dn, 'user.objectclass' => user_objectclass, 'user.idAttribute' => user_id_attribute, 'user.extraFilter' => user_extra_filter, 'user.makeDnPath' => user_make_dn_path, 'group.baseDN' => group_base_dn, 'group.objectclass' => group_objectclass, 'group.nameAttribute' => group_name_attribute, 'group.extraFilter' => group_extra_filter, 'group.makeDnPath' => group_make_dn_path, 'group.memberAttribute' => group_member_attribute, 'useUidForExtId' => use_uid_for_ext_id, 'customattributes' => customattributes }
        )
      end
    end
  end
end
