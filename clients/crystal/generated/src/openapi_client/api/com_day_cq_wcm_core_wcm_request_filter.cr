require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreWCMRequestFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, wcmfilter_mode : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreWCMRequestFilterInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreWCMRequestFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "wcmfilter.mode" => wcmfilter_mode },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
