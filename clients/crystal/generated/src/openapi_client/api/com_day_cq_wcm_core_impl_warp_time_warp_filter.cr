require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplWarpTimeWarpFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, filter_order : String? = nil, filter_scope : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplWarpTimeWarpFilterInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplWarpTimeWarpFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "filter.order" => filter_order, "filter.scope" => filter_scope },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
