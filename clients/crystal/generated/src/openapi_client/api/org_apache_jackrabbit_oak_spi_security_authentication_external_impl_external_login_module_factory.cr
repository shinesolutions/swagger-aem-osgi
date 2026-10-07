require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExternalLoginModuleFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, jaas_ranking : Int32? = nil, jaas_control_flag : String? = nil, jaas_realm_name : String? = nil, idp_name : String? = nil, sync_handler_name : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "jaas.ranking" => jaas_ranking, "jaas.controlFlag" => jaas_control_flag, "jaas.realmName" => jaas_realm_name, "idp.name" => idp_name, "sync.handlerName" => sync_handler_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
