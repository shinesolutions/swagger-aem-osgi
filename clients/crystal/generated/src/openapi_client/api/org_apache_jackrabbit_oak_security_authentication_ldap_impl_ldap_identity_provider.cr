require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, provider_name : String? = nil, host_name : String? = nil, host_port : Int32? = nil, host_ssl : Bool? = nil, host_tls : Bool? = nil, host_no_cert_check : Bool? = nil, bind_dn : String? = nil, bind_password : String? = nil, search_timeout : String? = nil, admin_pool_max_active : Int32? = nil, admin_pool_lookup_on_validate : Bool? = nil, user_pool_max_active : Int32? = nil, user_pool_lookup_on_validate : Bool? = nil, user_base_dn : String? = nil, user_objectclass : Array(String)? = nil, user_id_attribute : String? = nil, user_extra_filter : String? = nil, user_make_dn_path : Bool? = nil, group_base_dn : String? = nil, group_objectclass : Array(String)? = nil, group_name_attribute : String? = nil, group_extra_filter : String? = nil, group_make_dn_path : Bool? = nil, group_member_attribute : String? = nil, use_uid_for_ext_id : Bool? = nil, customattributes : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "provider.name" => provider_name, "host.name" => host_name, "host.port" => host_port, "host.ssl" => host_ssl, "host.tls" => host_tls, "host.noCertCheck" => host_no_cert_check, "bind.dn" => bind_dn, "bind.password" => bind_password, "searchTimeout" => search_timeout, "adminPool.maxActive" => admin_pool_max_active, "adminPool.lookupOnValidate" => admin_pool_lookup_on_validate, "userPool.maxActive" => user_pool_max_active, "userPool.lookupOnValidate" => user_pool_lookup_on_validate, "user.baseDN" => user_base_dn, "user.objectclass" => user_objectclass, "user.idAttribute" => user_id_attribute, "user.extraFilter" => user_extra_filter, "user.makeDnPath" => user_make_dn_path, "group.baseDN" => group_base_dn, "group.objectclass" => group_objectclass, "group.nameAttribute" => group_name_attribute, "group.extraFilter" => group_extra_filter, "group.makeDnPath" => group_make_dn_path, "group.memberAttribute" => group_member_attribute, "useUidForExtId" => use_uid_for_ext_id, "customattributes" => customattributes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
