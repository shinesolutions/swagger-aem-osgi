# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, delete_path_regexps: nil, delete_sql2_query: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup',
          type: OpenapiClient::Models::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'delete.path.regexps' => delete_path_regexps, 'delete.sql2.query' => delete_sql2_query }
        )
      end
    end
  end
end
