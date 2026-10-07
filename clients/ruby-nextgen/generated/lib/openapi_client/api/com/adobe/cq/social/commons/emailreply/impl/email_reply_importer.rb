# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, connect_protocol: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'connectProtocol' => connect_protocol }
        )
      end
    end
  end
end
