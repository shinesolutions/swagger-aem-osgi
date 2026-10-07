# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_cq_screens_analytics_impl_url: nil, com_adobe_cq_screens_analytics_impl_apikey: nil, com_adobe_cq_screens_analytics_impl_project: nil, com_adobe_cq_screens_analytics_impl_environment: nil, com_adobe_cq_screens_analytics_impl_send_frequency: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.cq.screens.analytics.impl.url' => com_adobe_cq_screens_analytics_impl_url, 'com.adobe.cq.screens.analytics.impl.apikey' => com_adobe_cq_screens_analytics_impl_apikey, 'com.adobe.cq.screens.analytics.impl.project' => com_adobe_cq_screens_analytics_impl_project, 'com.adobe.cq.screens.analytics.impl.environment' => com_adobe_cq_screens_analytics_impl_environment, 'com.adobe.cq.screens.analytics.impl.sendFrequency' => com_adobe_cq_screens_analytics_impl_send_frequency }
        )
      end
    end
  end
end
