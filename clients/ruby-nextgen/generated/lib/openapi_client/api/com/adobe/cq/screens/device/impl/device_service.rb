# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensDeviceImplDeviceService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_aem_screens_player_pingfrequency: nil, com_adobe_aem_screens_device_pasword_specialchars: nil, com_adobe_aem_screens_device_pasword_minlowercasechars: nil, com_adobe_aem_screens_device_pasword_minuppercasechars: nil, com_adobe_aem_screens_device_pasword_minnumberchars: nil, com_adobe_aem_screens_device_pasword_minspecialchars: nil, com_adobe_aem_screens_device_pasword_minlength: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService',
          type: OpenapiClient::Models::ComAdobeCqScreensDeviceImplDeviceServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.aem.screens.player.pingfrequency' => com_adobe_aem_screens_player_pingfrequency, 'com.adobe.aem.screens.device.pasword.specialchars' => com_adobe_aem_screens_device_pasword_specialchars, 'com.adobe.aem.screens.device.pasword.minlowercasechars' => com_adobe_aem_screens_device_pasword_minlowercasechars, 'com.adobe.aem.screens.device.pasword.minuppercasechars' => com_adobe_aem_screens_device_pasword_minuppercasechars, 'com.adobe.aem.screens.device.pasword.minnumberchars' => com_adobe_aem_screens_device_pasword_minnumberchars, 'com.adobe.aem.screens.device.pasword.minspecialchars' => com_adobe_aem_screens_device_pasword_minspecialchars, 'com.adobe.aem.screens.device.pasword.minlength' => com_adobe_aem_screens_device_pasword_minlength }
        )
      end
    end
  end
end
