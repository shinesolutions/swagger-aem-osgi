# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cors_enabling: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cors.enabling' => cors_enabling }
        )
      end
    end
  end
end
