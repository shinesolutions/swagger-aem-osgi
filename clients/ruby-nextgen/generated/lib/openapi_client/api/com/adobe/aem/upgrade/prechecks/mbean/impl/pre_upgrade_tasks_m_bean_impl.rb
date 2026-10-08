# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, pre_upgrade_maintenance_tasks: nil, pre_upgrade_hc_tags: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl',
          type: OpenapiClient::Models::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBH28087afb,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'pre-upgrade.maintenance.tasks' => pre_upgrade_maintenance_tasks, 'pre-upgrade.hc.tags' => pre_upgrade_hc_tags }
        )
      end
    end
  end
end
