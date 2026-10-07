# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLearningPathModelOperationService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, field_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService',
          type: OpenapiClient::Models::ComAdobeCqSocialEnablementLearningpathEndpointsImplEnaH8bdd6665,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fieldWhitelist' => field_whitelist }
        )
      end
    end
  end
end
