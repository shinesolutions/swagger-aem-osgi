require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
