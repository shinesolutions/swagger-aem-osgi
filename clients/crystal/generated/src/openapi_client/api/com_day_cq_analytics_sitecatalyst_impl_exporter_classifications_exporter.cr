require "json"

module OpenAPIClient
  module Api
  class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, allowed_paths : Array(String)? = nil, cq_analytics_saint_exporter_pagesize : Int32? = nil) : Response(OpenAPIClient::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo)
      @conn.request(OpenAPIClient::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "allowed.paths" => allowed_paths, "cq.analytics.saint.exporter.pagesize" => cq_analytics_saint_exporter_pagesize },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
