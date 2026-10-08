# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheAriesJmxFrameworkStateConfig
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, attribute_change_notification_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.aries.jmx.framework.StateConfig',
          type: OpenapiClient::Models::OrgApacheAriesJmxFrameworkStateConfigInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'attributeChangeNotificationEnabled' => attribute_change_notification_enabled }
        )
      end
    end
  end
end
