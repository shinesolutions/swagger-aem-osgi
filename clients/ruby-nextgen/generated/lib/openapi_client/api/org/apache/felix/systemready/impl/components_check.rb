# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixSystemreadyImplComponentsCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, components_list: nil, type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck',
          type: OpenapiClient::Models::OrgApacheFelixSystemreadyImplComponentsCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'components.list' => components_list, 'type' => type }
        )
      end
    end
  end
end
