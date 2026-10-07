# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, automoderation_sequence: nil, automoderation_onfailurestop: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'automoderation.sequence' => automoderation_sequence, 'automoderation.onfailurestop' => automoderation_onfailurestop }
        )
      end
    end
  end
end
