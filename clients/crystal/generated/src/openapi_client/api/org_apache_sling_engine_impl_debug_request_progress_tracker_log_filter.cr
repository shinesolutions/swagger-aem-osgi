require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, extensions : Array(String)? = nil, min_duration_ms : Int32? = nil, max_duration_ms : Int32? = nil, compact_log_format : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "extensions" => extensions, "minDurationMs" => min_duration_ms, "maxDurationMs" => max_duration_ms, "compactLogFormat" => compact_log_format },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
