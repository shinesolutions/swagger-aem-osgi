# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileOperationService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, field_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService',
          type: OpenapiClient::Models::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGrHcf9aeb52,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fieldWhitelist' => field_whitelist }
        )
      end
    end
  end
end
