# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteCompatrouterImplRoutingConfig
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, id: nil, compat_path: nil, new_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig',
          type: OpenapiClient::Models::ComAdobeGraniteCompatrouterImplRoutingConfigInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'id' => id, 'compatPath' => compat_path, 'newPath' => new_path }
        )
      end
    end
  end
end
