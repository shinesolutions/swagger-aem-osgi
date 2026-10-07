require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEngineImplLogRequestLogger
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, request_log_output : String? = nil, request_log_outputtype : Int32? = nil, request_log_enabled : Bool? = nil, access_log_output : String? = nil, access_log_outputtype : Int32? = nil, access_log_enabled : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingEngineImplLogRequestLoggerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEngineImplLogRequestLoggerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "request.log.output" => request_log_output, "request.log.outputtype" => request_log_outputtype, "request.log.enabled" => request_log_enabled, "access.log.output" => access_log_output, "access.log.outputtype" => access_log_outputtype, "access.log.enabled" => access_log_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
