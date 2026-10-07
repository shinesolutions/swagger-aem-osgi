# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingTenantInternalTenantProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, tenant_root: nil, tenant_path_matcher: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl',
          type: OpenapiClient::Models::OrgApacheSlingTenantInternalTenantProviderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'tenant.root' => tenant_root, 'tenant.path.matcher' => tenant_path_matcher }
        )
      end
    end
  end
end
