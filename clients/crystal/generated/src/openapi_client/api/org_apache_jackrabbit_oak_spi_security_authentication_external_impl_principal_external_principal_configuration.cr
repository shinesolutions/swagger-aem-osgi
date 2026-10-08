require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrincipalExternalPrincipalConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, protect_external_id : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "protectExternalId" => protect_external_id },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
