# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerConfigurationProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, solr_home_path: nil, solr_core_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolH4ea5d6a8,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'solr.home.path' => solr_home_path, 'solr.core.name' => solr_core_name }
        )
      end
    end
  end
end
