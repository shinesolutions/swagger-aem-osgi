# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, server_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerPHa5459dad,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'server.type' => server_type }
        )
      end
    end
  end
end
