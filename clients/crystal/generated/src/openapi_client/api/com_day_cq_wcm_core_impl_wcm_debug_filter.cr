require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplWCMDebugFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, wcmdbgfilter_enabled : Bool? = nil, wcmdbgfilter_jsp_debug : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplWCMDebugFilterInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplWCMDebugFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "wcmdbgfilter.enabled" => wcmdbgfilter_enabled, "wcmdbgfilter.jspDebug" => wcmdbgfilter_jsp_debug },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
