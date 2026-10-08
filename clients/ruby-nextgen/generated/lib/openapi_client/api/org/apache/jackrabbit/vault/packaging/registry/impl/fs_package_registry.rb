# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, home_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry',
          type: OpenapiClient::Models::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageH2ab438bc,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'homePath' => home_path }
        )
      end
    end
  end
end
