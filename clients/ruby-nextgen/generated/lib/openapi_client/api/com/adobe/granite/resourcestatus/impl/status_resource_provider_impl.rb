# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, provider_root: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl',
          type: OpenapiClient::Models::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'provider.root' => provider_root }
        )
      end
    end
  end
end
