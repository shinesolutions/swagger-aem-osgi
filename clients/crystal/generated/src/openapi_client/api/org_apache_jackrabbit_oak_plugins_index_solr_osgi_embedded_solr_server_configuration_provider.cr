require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerConfigurationProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, solr_home_path : String? = nil, solr_core_name : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "solr.home.path" => solr_home_path, "solr.core.name" => solr_core_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
