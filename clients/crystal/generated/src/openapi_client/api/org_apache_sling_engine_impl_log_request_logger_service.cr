require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEngineImplLogRequestLoggerService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, request_log_service_format : String? = nil, request_log_service_output : String? = nil, request_log_service_outputtype : Int32? = nil, request_log_service_onentry : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingEngineImplLogRequestLoggerServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEngineImplLogRequestLoggerServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "request.log.service.format" => request_log_service_format, "request.log.service.output" => request_log_service_output, "request.log.service.outputtype" => request_log_service_outputtype, "request.log.service.onentry" => request_log_service_onentry },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
