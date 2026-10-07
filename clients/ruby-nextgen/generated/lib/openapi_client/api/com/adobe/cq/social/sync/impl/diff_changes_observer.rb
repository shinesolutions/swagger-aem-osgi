# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialSyncImplDiffChangesObserver
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil, agent_name: nil, diff_path: nil, property_names: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver',
          type: OpenapiClient::Models::ComAdobeCqSocialSyncImplDiffChangesObserverInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled, 'agentName' => agent_name, 'diffPath' => diff_path, 'propertyNames' => property_names }
        )
      end
    end
  end
end
