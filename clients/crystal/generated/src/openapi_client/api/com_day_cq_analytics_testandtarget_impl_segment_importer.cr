require "json"

module OpenAPIClient
  module Api
  class ComDayCqAnalyticsTestandtargetImplSegmentImporter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_analytics_testandtarget_segmentimporter_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo)
      @conn.request(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.analytics.testandtarget.segmentimporter.enabled" => cq_analytics_testandtarget_segmentimporter_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
