require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, device_info_transformer_enabled : Bool? = nil, device_info_transformer_css_style : String? = nil) : Response(OpenAPIClient::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "device.info.transformer.enabled" => device_info_transformer_enabled, "device.info.transformer.css.style" => device_info_transformer_css_style },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
