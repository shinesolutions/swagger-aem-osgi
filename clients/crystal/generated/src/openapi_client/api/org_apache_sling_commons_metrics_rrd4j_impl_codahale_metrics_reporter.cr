require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, datasources : Array(String)? = nil, step : Int32? = nil, archives : Array(String)? = nil, path : String? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "datasources" => datasources, "step" => step, "archives" => archives, "path" => path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
