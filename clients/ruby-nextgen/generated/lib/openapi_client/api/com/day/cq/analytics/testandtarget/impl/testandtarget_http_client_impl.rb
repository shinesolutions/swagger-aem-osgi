# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_analytics_testandtarget_api_url: nil, cq_analytics_testandtarget_timeout: nil, cq_analytics_testandtarget_sockettimeout: nil, cq_analytics_testandtarget_recommendations_url_replace: nil, cq_analytics_testandtarget_recommendations_url_replacewith: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl',
          type: OpenapiClient::Models::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpCliHd81a9d5b,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.analytics.testandtarget.api.url' => cq_analytics_testandtarget_api_url, 'cq.analytics.testandtarget.timeout' => cq_analytics_testandtarget_timeout, 'cq.analytics.testandtarget.sockettimeout' => cq_analytics_testandtarget_sockettimeout, 'cq.analytics.testandtarget.recommendations.url.replace' => cq_analytics_testandtarget_recommendations_url_replace, 'cq.analytics.testandtarget.recommendations.url.replacewith' => cq_analytics_testandtarget_recommendations_url_replacewith }
        )
      end
    end
  end
end
