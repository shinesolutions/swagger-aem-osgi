require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreMvtMVTStatisticsImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, mvtstatistics_trackingurl : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreMvtMVTStatisticsImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreMvtMVTStatisticsImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "mvtstatistics.trackingurl" => mvtstatistics_trackingurl },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
