require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, handler_name : String? = nil, user_expiration_time : String? = nil, user_auto_membership : Array(String)? = nil, user_property_mapping : Array(String)? = nil, user_path_prefix : String? = nil, user_membership_exp_time : String? = nil, user_membership_nesting_depth : Int32? = nil, user_dynamic_membership : Bool? = nil, user_disable_missing : Bool? = nil, group_expiration_time : String? = nil, group_auto_membership : Array(String)? = nil, group_property_mapping : Array(String)? = nil, group_path_prefix : String? = nil, enable_rfc7613_usercase_mapped_profile : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "handler.name" => handler_name, "user.expirationTime" => user_expiration_time, "user.autoMembership" => user_auto_membership, "user.propertyMapping" => user_property_mapping, "user.pathPrefix" => user_path_prefix, "user.membershipExpTime" => user_membership_exp_time, "user.membershipNestingDepth" => user_membership_nesting_depth, "user.dynamicMembership" => user_dynamic_membership, "user.disableMissing" => user_disable_missing, "group.expirationTime" => group_expiration_time, "group.autoMembership" => group_auto_membership, "group.propertyMapping" => group_property_mapping, "group.pathPrefix" => group_path_prefix, "enableRFC7613UsercaseMappedProfile" => enable_rfc7613_usercase_mapped_profile },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
