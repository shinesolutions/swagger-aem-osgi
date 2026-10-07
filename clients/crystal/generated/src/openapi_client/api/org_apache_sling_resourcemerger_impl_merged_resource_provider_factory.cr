require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingResourcemergerImplMergedResourceProviderFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, merge_root : String? = nil, merge_read_only : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "merge.root" => merge_root, "merge.readOnly" => merge_read_only },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
