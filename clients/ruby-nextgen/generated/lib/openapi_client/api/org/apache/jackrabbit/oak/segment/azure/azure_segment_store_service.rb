# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, account_name: nil, container_name: nil, access_key: nil, root_path: nil, connection_url: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'accountName' => account_name, 'containerName' => container_name, 'accessKey' => access_key, 'rootPath' => root_path, 'connectionURL' => connection_url }
        )
      end
    end
  end
end
