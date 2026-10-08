require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplReportsReportExportService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, query_batch_size : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplReportsReportExportServiceInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplReportsReportExportServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "queryBatchSize" => query_batch_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
