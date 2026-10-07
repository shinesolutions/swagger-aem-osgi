# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialSrpImplSocialSolrConnector
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, srp_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector',
          type: OpenapiClient::Models::ComAdobeCqSocialSrpImplSocialSolrConnectorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'srp.type' => srp_type }
        )
      end
    end
  end
end
