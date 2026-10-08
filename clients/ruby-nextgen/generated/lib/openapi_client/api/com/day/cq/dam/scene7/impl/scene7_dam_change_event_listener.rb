# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamScene7ImplScene7DamChangeEventListener
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_scene7_damchangeeventlistener_enabled: nil, cq_dam_scene7_damchangeeventlistener_observed_paths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener',
          type: OpenapiClient::Models::ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.scene7.damchangeeventlistener.enabled' => cq_dam_scene7_damchangeeventlistener_enabled, 'cq.dam.scene7.damchangeeventlistener.observed.paths' => cq_dam_scene7_damchangeeventlistener_observed_paths }
        )
      end
    end
  end
end
