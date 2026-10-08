# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, adapter_condition: nil, taskmanager_admingroups: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory',
          type: OpenapiClient::Models::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdaHc1ef2d8c,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'adapter.condition' => adapter_condition, 'taskmanager.admingroups' => taskmanager_admingroups }
        )
      end
    end
  end
end
