# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixSystemreadyImplServicesCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, services_list: nil, type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck',
          type: OpenapiClient::Models::OrgApacheFelixSystemreadyImplServicesCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'services.list' => services_list, 'type' => type }
        )
      end
    end
  end
end
