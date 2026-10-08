require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, dim_default_mode : String? = nil, dim_appcache_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "dim.default.mode" => dim_default_mode, "dim.appcache.enabled" => dim_appcache_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
