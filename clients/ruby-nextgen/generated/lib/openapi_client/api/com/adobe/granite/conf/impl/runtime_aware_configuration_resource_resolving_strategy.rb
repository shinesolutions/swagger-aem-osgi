# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingStrategy
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil, fallback_paths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy',
          type: OpenapiClient::Models::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourHd6387572,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled, 'fallbackPaths' => fallback_paths }
        )
      end
    end
  end
end
