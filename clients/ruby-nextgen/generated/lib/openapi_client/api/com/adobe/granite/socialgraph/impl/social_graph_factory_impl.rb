# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, group2member_relationship_outgoing: nil, group2member_excluded_outgoing: nil, group2member_relationship_incoming: nil, group2member_excluded_incoming: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl',
          type: OpenapiClient::Models::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'group2member.relationship.outgoing' => group2member_relationship_outgoing, 'group2member.excluded.outgoing' => group2member_excluded_outgoing, 'group2member.relationship.incoming' => group2member_relationship_incoming, 'group2member.excluded.incoming' => group2member_excluded_incoming }
        )
      end
    end
  end
end
