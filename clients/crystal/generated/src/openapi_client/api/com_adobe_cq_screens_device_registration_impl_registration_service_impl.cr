require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, device_registration_timeout : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "deviceRegistrationTimeout" => device_registration_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
