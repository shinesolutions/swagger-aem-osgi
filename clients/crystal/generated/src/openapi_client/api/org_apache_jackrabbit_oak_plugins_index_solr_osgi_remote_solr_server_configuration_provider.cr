require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, solr_http_url : String? = nil, solr_zk_host : String? = nil, solr_collection : String? = nil, solr_socket_timeout : Int32? = nil, solr_connection_timeout : Int32? = nil, solr_shards_no : Int32? = nil, solr_replication_factor : Int32? = nil, solr_conf_dir : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "solr.http.url" => solr_http_url, "solr.zk.host" => solr_zk_host, "solr.collection" => solr_collection, "solr.socket.timeout" => solr_socket_timeout, "solr.connection.timeout" => solr_connection_timeout, "solr.shards.no" => solr_shards_no, "solr.replication.factor" => solr_replication_factor, "solr.conf.dir" => solr_conf_dir },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
