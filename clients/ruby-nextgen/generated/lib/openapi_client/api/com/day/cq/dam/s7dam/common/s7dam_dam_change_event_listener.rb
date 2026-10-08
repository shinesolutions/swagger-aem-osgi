# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamS7damCommonS7damDamChangeEventListener
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_s7dam_damchangeeventlistener_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener',
          type: OpenapiClient::Models::ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.s7dam.damchangeeventlistener.enabled' => cq_dam_s7dam_damchangeeventlistener_enabled }
        )
      end
    end
  end
end
