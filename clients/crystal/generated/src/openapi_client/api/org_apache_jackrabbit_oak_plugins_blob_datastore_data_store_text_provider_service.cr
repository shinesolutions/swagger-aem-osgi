require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, dir : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "dir" => dir },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
