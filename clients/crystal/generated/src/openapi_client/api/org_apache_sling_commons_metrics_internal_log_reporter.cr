require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsMetricsInternalLogReporter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, period : Int32? = nil, time_unit : String? = nil, level : String? = nil, logger_name : String? = nil, prefix : String? = nil, pattern : String? = nil, registry_name : String? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsMetricsInternalLogReporterInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsMetricsInternalLogReporterInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "period" => period, "timeUnit" => time_unit, "level" => level, "loggerName" => logger_name, "prefix" => prefix, "pattern" => pattern, "registryName" => registry_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
