# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, purge_completed: nil, completed_age: nil, purge_active: nil, active_age: nil, save_threshold: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask',
          type: OpenapiClient::Models::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenH95999086,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'purgeCompleted' => purge_completed, 'completedAge' => completed_age, 'purgeActive' => purge_active, 'activeAge' => active_age, 'saveThreshold' => save_threshold }
        )
      end
    end
  end
end
