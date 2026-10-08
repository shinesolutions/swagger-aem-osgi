require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, server_type : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "server.type" => server_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
