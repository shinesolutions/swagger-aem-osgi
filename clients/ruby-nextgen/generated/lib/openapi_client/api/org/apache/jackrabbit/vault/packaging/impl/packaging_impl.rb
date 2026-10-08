# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitVaultPackagingImplPackagingImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, package_roots: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl',
          type: OpenapiClient::Models::OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'packageRoots' => package_roots }
        )
      end
    end
  end
end
