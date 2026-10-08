require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil, scheduler_concurrent : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression, "scheduler.concurrent" => scheduler_concurrent },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
