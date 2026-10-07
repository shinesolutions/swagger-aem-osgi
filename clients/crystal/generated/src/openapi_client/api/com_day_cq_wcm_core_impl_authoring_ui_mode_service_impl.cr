require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplAuthoringUIModeServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, authoring_ui_mode_service_default : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "authoringUIModeService.default" => authoring_ui_mode_service_default },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
