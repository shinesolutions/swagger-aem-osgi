# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_items: nil, max_path_depth: nil, enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsObservationChangeCollectorH5d4ed75b,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'maxItems' => max_items, 'maxPathDepth' => max_path_depth, 'enabled' => enabled }
        )
      end
    end
  end
end
