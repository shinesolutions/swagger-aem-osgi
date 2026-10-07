require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableActionProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled_actions : String? = nil, user_privilege_names : Array(String)? = nil, group_privilege_names : Array(String)? = nil, constraint : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabledActions" => enabled_actions, "userPrivilegeNames" => user_privilege_names, "groupPrivilegeNames" => group_privilege_names, "constraint" => constraint },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
