# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingResourcemergerImplMergedResourceProviderFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, merge_root: nil, merge_read_only: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory',
          type: OpenapiClient::Models::OrgApacheSlingResourcemergerImplMergedResourceProviderFH76346cb5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'merge.root' => merge_root, 'merge.readOnly' => merge_read_only }
        )
      end
    end
  end
end
