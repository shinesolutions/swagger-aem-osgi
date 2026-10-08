require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreStatsPageViewStatisticsImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, pageviewstatistics_trackingurl : String? = nil, pageviewstatistics_trackingscript_enabled : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreStatsPageViewStatisticsImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreStatsPageViewStatisticsImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "pageviewstatistics.trackingurl" => pageviewstatistics_trackingurl, "pageviewstatistics.trackingscript.enabled" => pageviewstatistics_trackingscript_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
