# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingHapiImplHApiUtilImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_sling_hapi_tools_resourcetype: nil, org_apache_sling_hapi_tools_collectionresourcetype: nil, org_apache_sling_hapi_tools_searchpaths: nil, org_apache_sling_hapi_tools_externalurl: nil, org_apache_sling_hapi_tools_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl',
          type: OpenapiClient::Models::OrgApacheSlingHapiImplHApiUtilImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.sling.hapi.tools.resourcetype' => org_apache_sling_hapi_tools_resourcetype, 'org.apache.sling.hapi.tools.collectionresourcetype' => org_apache_sling_hapi_tools_collectionresourcetype, 'org.apache.sling.hapi.tools.searchpaths' => org_apache_sling_hapi_tools_searchpaths, 'org.apache.sling.hapi.tools.externalurl' => org_apache_sling_hapi_tools_externalurl, 'org.apache.sling.hapi.tools.enabled' => org_apache_sling_hapi_tools_enabled }
        )
      end
    end
  end
end
