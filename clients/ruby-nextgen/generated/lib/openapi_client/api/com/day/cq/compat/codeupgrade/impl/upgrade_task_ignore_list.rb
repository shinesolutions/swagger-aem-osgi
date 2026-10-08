# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, upgrade_task_ignore_list: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList',
          type: OpenapiClient::Models::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'upgradeTaskIgnoreList' => upgrade_task_ignore_list }
        )
      end
    end
  end
end
