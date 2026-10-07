# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqContentinsightImplReportingServicesSettingsProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, reportingservices_url: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider',
          type: OpenapiClient::Models::ComAdobeCqContentinsightImplReportingServicesSettingsPHe279f0f6,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'reportingservices.url' => reportingservices_url }
        )
      end
    end
  end
end
