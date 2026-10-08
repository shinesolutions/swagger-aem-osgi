require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplWCMDeveloperModeFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, wcmdevmodefilter_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "wcmdevmodefilter.enabled" => wcmdevmodefilter_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
