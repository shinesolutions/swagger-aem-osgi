# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, compatgroups: nil, enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl',
          type: OpenapiClient::Models::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'compatgroups' => compatgroups, 'enabled' => enabled }
        )
      end
    end
  end
end
