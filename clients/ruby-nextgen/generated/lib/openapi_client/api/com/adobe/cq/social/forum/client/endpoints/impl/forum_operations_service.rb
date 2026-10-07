# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialForumClientEndpointsImplForumOperationsService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, field_whitelist: nil, attachment_type_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService',
          type: OpenapiClient::Models::ComAdobeCqSocialForumClientEndpointsImplForumOperatioH9b1fcf42,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fieldWhitelist' => field_whitelist, 'attachmentTypeBlacklist' => attachment_type_blacklist }
        )
      end
    end
  end
end
