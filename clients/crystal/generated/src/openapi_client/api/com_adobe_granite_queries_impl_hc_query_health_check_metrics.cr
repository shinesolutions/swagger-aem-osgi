require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, get_period : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "getPeriod" => get_period },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
