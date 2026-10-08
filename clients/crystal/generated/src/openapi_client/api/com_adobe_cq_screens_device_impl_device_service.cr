require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensDeviceImplDeviceService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_aem_screens_player_pingfrequency : Int32? = nil, com_adobe_aem_screens_device_pasword_specialchars : String? = nil, com_adobe_aem_screens_device_pasword_minlowercasechars : Int32? = nil, com_adobe_aem_screens_device_pasword_minuppercasechars : Int32? = nil, com_adobe_aem_screens_device_pasword_minnumberchars : Int32? = nil, com_adobe_aem_screens_device_pasword_minspecialchars : Int32? = nil, com_adobe_aem_screens_device_pasword_minlength : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqScreensDeviceImplDeviceServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensDeviceImplDeviceServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.aem.screens.player.pingfrequency" => com_adobe_aem_screens_player_pingfrequency, "com.adobe.aem.screens.device.pasword.specialchars" => com_adobe_aem_screens_device_pasword_specialchars, "com.adobe.aem.screens.device.pasword.minlowercasechars" => com_adobe_aem_screens_device_pasword_minlowercasechars, "com.adobe.aem.screens.device.pasword.minuppercasechars" => com_adobe_aem_screens_device_pasword_minuppercasechars, "com.adobe.aem.screens.device.pasword.minnumberchars" => com_adobe_aem_screens_device_pasword_minnumberchars, "com.adobe.aem.screens.device.pasword.minspecialchars" => com_adobe_aem_screens_device_pasword_minspecialchars, "com.adobe.aem.screens.device.pasword.minlength" => com_adobe_aem_screens_device_pasword_minlength },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
