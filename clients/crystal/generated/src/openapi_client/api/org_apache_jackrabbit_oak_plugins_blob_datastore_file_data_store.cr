require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
