# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_expression: nil, jmx_objectname: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl',
          type: OpenapiClient::Models::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.expression' => scheduler_expression, 'jmx.objectname' => jmx_objectname }
        )
      end
    end
  end
end
