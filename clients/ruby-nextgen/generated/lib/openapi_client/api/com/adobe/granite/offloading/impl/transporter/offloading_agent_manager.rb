# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, offloading_agentmanager_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager',
          type: OpenapiClient::Models::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentHef4ecddd,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'offloading.agentmanager.enabled' => offloading_agentmanager_enabled }
        )
      end
    end
  end
end
