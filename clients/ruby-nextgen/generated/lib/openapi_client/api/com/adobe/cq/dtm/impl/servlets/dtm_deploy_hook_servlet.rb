# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDtmImplServletsDTMDeployHookServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, dtm_staging_ip_whitelist: nil, dtm_production_ip_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet',
          type: OpenapiClient::Models::ComAdobeCqDtmImplServletsDTMDeployHookServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'dtm.staging.ip.whitelist' => dtm_staging_ip_whitelist, 'dtm.production.ip.whitelist' => dtm_production_ip_whitelist }
        )
      end
    end
  end
end
