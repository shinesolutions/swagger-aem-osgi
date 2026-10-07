require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, required_service_pids : Array(String)? = nil, authorization_composition_type : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "requiredServicePids" => required_service_pids, "authorizationCompositionType" => authorization_composition_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
