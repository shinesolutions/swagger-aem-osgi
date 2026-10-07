# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, device_registration_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqScreensDeviceRegistrationImplRegistrationSerH8ad03dff,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'deviceRegistrationTimeout' => device_registration_timeout }
        )
      end
    end
  end
end
