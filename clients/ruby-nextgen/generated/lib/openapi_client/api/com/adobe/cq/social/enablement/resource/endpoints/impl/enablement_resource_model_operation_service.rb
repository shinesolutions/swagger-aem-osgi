# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResourceModelOperationService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, field_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService',
          type: OpenapiClient::Models::ComAdobeCqSocialEnablementResourceEndpointsImplEnablemHfeed15ae,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fieldWhitelist' => field_whitelist }
        )
      end
    end
  end
end
