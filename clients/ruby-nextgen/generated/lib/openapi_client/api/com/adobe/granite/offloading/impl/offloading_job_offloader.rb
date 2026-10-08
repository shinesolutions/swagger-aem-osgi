# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOffloadingImplOffloadingJobOffloader
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, offloading_offloader_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader',
          type: OpenapiClient::Models::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'offloading.offloader.enabled' => offloading_offloader_enabled }
        )
      end
    end
  end
end
