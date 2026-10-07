# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, solr_http_url: nil, solr_zk_host: nil, solr_collection: nil, solr_socket_timeout: nil, solr_connection_timeout: nil, solr_shards_no: nil, solr_replication_factor: nil, solr_conf_dir: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrSH5f5f167c,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'solr.http.url' => solr_http_url, 'solr.zk.host' => solr_zk_host, 'solr.collection' => solr_collection, 'solr.socket.timeout' => solr_socket_timeout, 'solr.connection.timeout' => solr_connection_timeout, 'solr.shards.no' => solr_shards_no, 'solr.replication.factor' => solr_replication_factor, 'solr.conf.dir' => solr_conf_dir }
        )
      end
    end
  end
end
