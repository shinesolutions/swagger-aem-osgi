require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, indexing_critical_threshold : Int32? = nil, indexing_warn_threshold : Int32? = nil, hc_tags : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "indexing.critical.threshold" => indexing_critical_threshold, "indexing.warn.threshold" => indexing_warn_threshold, "hc.tags" => hc_tags },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
