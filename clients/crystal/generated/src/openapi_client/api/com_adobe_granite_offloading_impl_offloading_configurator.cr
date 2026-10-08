require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOffloadingImplOffloadingConfigurator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, offloading_transporter : String? = nil, offloading_cleanup_payload : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "offloading.transporter" => offloading_transporter, "offloading.cleanup.payload" => offloading_cleanup_payload },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
