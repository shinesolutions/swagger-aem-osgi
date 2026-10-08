# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecker
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, codeupgradetasks: nil, codeupgradetaskfilters: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker',
          type: OpenapiClient::Models::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionCondH21e5713e,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'codeupgradetasks' => codeupgradetasks, 'codeupgradetaskfilters' => codeupgradetaskfilters }
        )
      end
    end
  end
end
