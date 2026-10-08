# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOffloadingImplOffloadingConfigurator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, offloading_transporter: nil, offloading_cleanup_payload: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator',
          type: OpenapiClient::Models::ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'offloading.transporter' => offloading_transporter, 'offloading.cleanup.payload' => offloading_cleanup_payload }
        )
      end
    end
  end
end
