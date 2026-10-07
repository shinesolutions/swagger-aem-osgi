# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, everyone_limit: nil, priority: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialMembersImplCommunityMemberGroupProfilH84bfc2dd,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'everyoneLimit' => everyone_limit, 'priority' => priority }
        )
      end
    end
  end
end
