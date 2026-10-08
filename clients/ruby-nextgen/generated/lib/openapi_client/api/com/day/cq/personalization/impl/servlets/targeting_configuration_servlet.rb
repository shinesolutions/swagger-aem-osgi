# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqPersonalizationImplServletsTargetingConfigurationServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, forcelocation: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet',
          type: OpenapiClient::Models::ComDayCqPersonalizationImplServletsTargetingConfiguratiH8dbb4994,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'forcelocation' => forcelocation }
        )
      end
    end
  end
end
