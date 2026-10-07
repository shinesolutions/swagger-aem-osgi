# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, full_gc_days: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask',
          type: OpenapiClient::Models::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'full.gc.days' => full_gc_days }
        )
      end
    end
  end
end
