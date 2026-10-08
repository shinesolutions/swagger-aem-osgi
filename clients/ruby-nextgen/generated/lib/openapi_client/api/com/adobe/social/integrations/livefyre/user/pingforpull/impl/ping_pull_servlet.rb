# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, communities_integration_livefyre_sling_event_filter: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet',
          type: OpenapiClient::Models::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPHd18e8002,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'communities.integration.livefyre.sling.event.filter' => communities_integration_livefyre_sling_event_filter }
        )
      end
    end
  end
end
