# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_analytics_testandtarget_deleteauthoractivitylistener_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener',
          type: OpenapiClient::Models::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityH29aa854f,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.analytics.testandtarget.deleteauthoractivitylistener.enabled' => cq_analytics_testandtarget_deleteauthoractivitylistener_enabled }
        )
      end
    end
  end
end
