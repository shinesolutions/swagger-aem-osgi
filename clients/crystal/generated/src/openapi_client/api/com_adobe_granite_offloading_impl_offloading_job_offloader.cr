require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOffloadingImplOffloadingJobOffloader
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, offloading_offloader_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "offloading.offloader.enabled" => offloading_offloader_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
