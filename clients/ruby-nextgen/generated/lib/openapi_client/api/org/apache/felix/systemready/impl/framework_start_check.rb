# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixSystemreadyImplFrameworkStartCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, timeout: nil, target_start_level: nil, target_start_level_prop_name: nil, type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck',
          type: OpenapiClient::Models::OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'timeout' => timeout, 'target.start.level' => target_start_level, 'target.start.level.prop.name' => target_start_level_prop_name, 'type' => type }
        )
      end
    end
  end
end
