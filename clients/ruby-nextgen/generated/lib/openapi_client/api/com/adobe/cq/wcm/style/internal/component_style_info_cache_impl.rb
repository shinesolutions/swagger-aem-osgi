# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl',
          type: OpenapiClient::Models::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'size' => size }
        )
      end
    end
  end
end
