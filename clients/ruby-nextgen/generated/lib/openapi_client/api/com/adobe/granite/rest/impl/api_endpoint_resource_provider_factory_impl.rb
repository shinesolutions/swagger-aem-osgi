# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, provider_roots: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl',
          type: OpenapiClient::Models::ComAdobeGraniteRestImplApiEndpointResourceProviderFacH15e170ad,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'provider.roots' => provider_roots }
        )
      end
    end
  end
end
