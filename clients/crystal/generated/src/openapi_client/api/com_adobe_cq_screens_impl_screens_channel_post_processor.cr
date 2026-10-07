require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensImplScreensChannelPostProcessor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, screens_channels_properties_to_remove : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqScreensImplScreensChannelPostProcessorInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensImplScreensChannelPostProcessorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "screens.channels.properties.to.remove" => screens_channels_properties_to_remove },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
