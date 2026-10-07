require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEngineImplSlingMainServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_max_calls : Int32? = nil, sling_max_inclusions : Int32? = nil, sling_trace_allow : Bool? = nil, sling_max_record_requests : Int32? = nil, sling_store_pattern_requests : Array(String)? = nil, sling_serverinfo : String? = nil, sling_additional_response_headers : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingEngineImplSlingMainServletInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEngineImplSlingMainServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.max.calls" => sling_max_calls, "sling.max.inclusions" => sling_max_inclusions, "sling.trace.allow" => sling_trace_allow, "sling.max.record.requests" => sling_max_record_requests, "sling.store.pattern.requests" => sling_store_pattern_requests, "sling.serverinfo" => sling_serverinfo, "sling.additional.response.headers" => sling_additional_response_headers },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
