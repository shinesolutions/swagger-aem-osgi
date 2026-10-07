require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cug_supported_paths : Array(String)? = nil, cug_enabled : Bool? = nil, configuration_ranking : Int32? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cugSupportedPaths" => cug_supported_paths, "cugEnabled" => cug_enabled, "configurationRanking" => configuration_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
