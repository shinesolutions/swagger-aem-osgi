require "json"

module OpenAPIClient
  module Api
  class ComDayCqReportingImplRLogAnalyzer
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, request_log_output : String? = nil) : Response(OpenAPIClient::ComDayCqReportingImplRLogAnalyzerInfo)
      @conn.request(OpenAPIClient::ComDayCqReportingImplRLogAnalyzerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "request.log.output" => request_log_output },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
