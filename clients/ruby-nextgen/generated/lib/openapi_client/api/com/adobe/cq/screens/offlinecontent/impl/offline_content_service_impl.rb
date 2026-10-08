# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, disable_smart_sync: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqScreensOfflinecontentImplOfflineContentServiH36e0aacd,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'disableSmartSync' => disable_smart_sync }
        )
      end
    end
  end
end
