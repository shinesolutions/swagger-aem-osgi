require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplEventPagePostProcessor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, paths : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplEventPagePostProcessorInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplEventPagePostProcessorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "paths" => paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
