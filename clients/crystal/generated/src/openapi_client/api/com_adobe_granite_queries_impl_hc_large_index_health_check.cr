require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, large_index_critical_threshold : Int32? = nil, large_index_warn_threshold : Int32? = nil, hc_tags : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "large.index.critical.threshold" => large_index_critical_threshold, "large.index.warn.threshold" => large_index_warn_threshold, "hc.tags" => hc_tags },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
