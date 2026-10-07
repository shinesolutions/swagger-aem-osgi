# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, delete_name_regexps: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup',
          type: OpenapiClient::Models::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'delete.name.regexps' => delete_name_regexps }
        )
      end
    end
  end
end
