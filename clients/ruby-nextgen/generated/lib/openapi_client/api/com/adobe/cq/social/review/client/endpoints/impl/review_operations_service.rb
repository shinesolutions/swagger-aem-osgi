# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, field_whitelist: nil, attachment_type_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService',
          type: OpenapiClient::Models::ComAdobeCqSocialReviewClientEndpointsImplReviewOperatH018b59cc,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fieldWhitelist' => field_whitelist, 'attachmentTypeBlacklist' => attachment_type_blacklist }
        )
      end
    end
  end
end
