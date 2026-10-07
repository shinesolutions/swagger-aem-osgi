require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
