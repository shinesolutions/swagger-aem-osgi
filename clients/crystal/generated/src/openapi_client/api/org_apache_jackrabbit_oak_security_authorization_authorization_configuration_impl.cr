require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, permissions_jr2 : String? = nil, import_behavior : String? = nil, read_paths : Array(String)? = nil, administrative_principals : Array(String)? = nil, configuration_ranking : Int32? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "permissionsJr2" => permissions_jr2, "importBehavior" => import_behavior, "readPaths" => read_paths, "administrativePrincipals" => administrative_principals, "configurationRanking" => configuration_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
