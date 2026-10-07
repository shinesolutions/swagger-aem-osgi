# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, effective_bundle_list_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist',
          type: OpenapiClient::Models::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'effectiveBundleListPath' => effective_bundle_list_path }
        )
      end
    end
  end
end
