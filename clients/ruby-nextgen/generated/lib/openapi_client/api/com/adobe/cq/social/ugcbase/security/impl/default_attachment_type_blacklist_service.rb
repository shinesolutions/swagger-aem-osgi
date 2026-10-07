# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlacklistService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, default_attachment_type_blacklist: nil, baseline_attachment_type_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService',
          type: OpenapiClient::Models::ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTH663e1e5a,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'default.attachment.type.blacklist' => default_attachment_type_blacklist, 'baseline.attachment.type.blacklist' => baseline_attachment_type_blacklist }
        )
      end
    end
  end
end
