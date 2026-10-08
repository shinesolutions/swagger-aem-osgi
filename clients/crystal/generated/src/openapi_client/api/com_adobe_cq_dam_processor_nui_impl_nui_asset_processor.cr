require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamProcessorNuiImplNuiAssetProcessor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, nui_enabled : Bool? = nil, nui_service_url : String? = nil, nui_api_key : String? = nil) : Response(OpenAPIClient::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "nuiEnabled" => nui_enabled, "nuiServiceUrl" => nui_service_url, "nuiApiKey" => nui_api_key },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
