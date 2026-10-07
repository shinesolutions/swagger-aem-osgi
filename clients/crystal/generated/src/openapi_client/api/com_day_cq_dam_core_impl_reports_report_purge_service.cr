require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplReportsReportPurgeService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil, max_saved_reports : Int32? = nil, time_duration : Int32? = nil, enable_report_purge : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplReportsReportPurgeServiceInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplReportsReportPurgeServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression, "maxSavedReports" => max_saved_reports, "timeDuration" => time_duration, "enableReportPurge" => enable_report_purge },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
