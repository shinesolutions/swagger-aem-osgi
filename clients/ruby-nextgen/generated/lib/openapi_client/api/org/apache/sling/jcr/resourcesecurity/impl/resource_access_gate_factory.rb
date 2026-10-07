# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil, checkpath_prefix: nil, jcr_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory',
          type: OpenapiClient::Models::OrgApacheSlingJcrResourcesecurityImplResourceAccessGatHf3d341e4,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path, 'checkpath.prefix' => checkpath_prefix, 'jcrPath' => jcr_path }
        )
      end
    end
  end
end
