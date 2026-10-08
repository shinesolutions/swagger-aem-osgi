require "json"

module OpenAPIClient
  module Api
  class ComDayCqStatisticsImplStatisticsServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_period : Int32? = nil, scheduler_concurrent : Bool? = nil, path : String? = nil, workspace : String? = nil, keywords_path : String? = nil, async_entries : Bool? = nil) : Response(OpenAPIClient::ComDayCqStatisticsImplStatisticsServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqStatisticsImplStatisticsServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.period" => scheduler_period, "scheduler.concurrent" => scheduler_concurrent, "path" => path, "workspace" => workspace, "keywordsPath" => keywords_path, "asyncEntries" => async_entries },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
