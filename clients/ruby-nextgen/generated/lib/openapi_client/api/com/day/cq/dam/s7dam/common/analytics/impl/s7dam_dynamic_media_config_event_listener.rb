# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEventListener
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener',
          type: OpenapiClient::Models::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaHc3a6b41c,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled' => cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled }
        )
      end
    end
  end
end
