# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmentCreationServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_social_content_fragments_services_enabled: nil, cq_social_content_fragments_services_wait_time_seconds: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialContentFragmentsServicesImplCommunitieH29868cf1,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.social.content.fragments.services.enabled' => cq_social_content_fragments_services_enabled, 'cq.social.content.fragments.services.waitTimeSeconds' => cq_social_content_fragments_services_wait_time_seconds }
        )
      end
    end
  end
end
