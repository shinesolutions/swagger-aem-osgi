require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationImplAdaptiveImageComponentServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, adapt_supported_widths : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "adapt.supported.widths" => adapt_supported_widths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
