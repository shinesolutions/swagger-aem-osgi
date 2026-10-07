# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensImplScreensChannelPostProcessor
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, screens_channels_properties_to_remove: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor',
          type: OpenapiClient::Models::ComAdobeCqScreensImplScreensChannelPostProcessorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'screens.channels.properties.to.remove' => screens_channels_properties_to_remove }
        )
      end
    end
  end
end
