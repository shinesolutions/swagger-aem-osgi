# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, brightedge_url: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet',
          type: OpenapiClient::Models::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'brightedge.url' => brightedge_url }
        )
      end
    end
  end
end
