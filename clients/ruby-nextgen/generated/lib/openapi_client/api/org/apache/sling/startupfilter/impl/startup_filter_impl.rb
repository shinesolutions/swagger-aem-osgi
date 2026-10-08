# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingStartupfilterImplStartupFilterImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, active_by_default: nil, default_message: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl',
          type: OpenapiClient::Models::OrgApacheSlingStartupfilterImplStartupFilterImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'active.by.default' => active_by_default, 'default.message' => default_message }
        )
      end
    end
  end
end
