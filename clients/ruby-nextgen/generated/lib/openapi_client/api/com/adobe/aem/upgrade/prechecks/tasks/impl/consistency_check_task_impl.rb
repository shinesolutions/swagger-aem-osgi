# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, root_path: nil, fix_inconsistencies: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl',
          type: OpenapiClient::Models::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTHbff3410d,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'root.path' => root_path, 'fix.inconsistencies' => fix_inconsistencies }
        )
      end
    end
  end
end
