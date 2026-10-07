# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enable_fallback: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialServiceusersInternalImplServiceUserWrH643367ad,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enableFallback' => enable_fallback }
        )
      end
    end
  end
end
