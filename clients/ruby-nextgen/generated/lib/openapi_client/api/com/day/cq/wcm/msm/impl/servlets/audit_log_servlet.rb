# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmMsmImplServletsAuditLogServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, auditlogservlet_default_events_count: nil, auditlogservlet_default_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet',
          type: OpenapiClient::Models::ComDayCqWcmMsmImplServletsAuditLogServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'auditlogservlet.default.events.count' => auditlogservlet_default_events_count, 'auditlogservlet.default.path' => auditlogservlet_default_path }
        )
      end
    end
  end
end
