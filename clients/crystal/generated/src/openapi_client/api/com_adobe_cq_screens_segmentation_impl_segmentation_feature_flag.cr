require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enable_data_triggered_content : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enableDataTriggeredContent" => enable_data_triggered_content },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
