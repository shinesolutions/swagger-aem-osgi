# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqContentinsightImplServletsReportingServicesProxyServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, reportingservices_proxy_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet',
          type: OpenapiClient::Models::ComAdobeCqContentinsightImplServletsReportingServicesPH04d3a9a7,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'reportingservices.proxy.whitelist' => reportingservices_proxy_whitelist }
        )
      end
    end
  end
end
