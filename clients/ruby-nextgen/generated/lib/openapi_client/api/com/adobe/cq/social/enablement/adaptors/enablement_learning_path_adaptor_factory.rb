# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, is_member_check: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPaHc1cf2fec,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'isMemberCheck' => is_member_check }
        )
      end
    end
  end
end
