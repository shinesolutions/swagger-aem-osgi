# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamScene7ImplScene7ConfigurationEventListener
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_scene7_configurationeventlistener_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener',
          type: OpenapiClient::Models::ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.scene7.configurationeventlistener.enabled' => cq_dam_scene7_configurationeventlistener_enabled }
        )
      end
    end
  end
end
