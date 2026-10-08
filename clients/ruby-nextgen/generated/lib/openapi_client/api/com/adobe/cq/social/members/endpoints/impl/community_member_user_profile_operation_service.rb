# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOperationService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, field_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService',
          type: OpenapiClient::Models::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUsHe2dfe7eb,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fieldWhitelist' => field_whitelist }
        )
      end
    end
  end
end
