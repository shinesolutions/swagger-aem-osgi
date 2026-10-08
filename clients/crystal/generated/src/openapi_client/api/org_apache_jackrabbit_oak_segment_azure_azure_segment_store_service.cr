require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, account_name : String? = nil, container_name : String? = nil, access_key : String? = nil, root_path : String? = nil, connection_url : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "accountName" => account_name, "containerName" => container_name, "accessKey" => access_key, "rootPath" => root_path, "connectionURL" => connection_url },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
