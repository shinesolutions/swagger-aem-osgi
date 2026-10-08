# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, adapter_condition: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory',
          type: OpenapiClient::Models::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'adapter.condition' => adapter_condition }
        )
      end
    end
  end
end
