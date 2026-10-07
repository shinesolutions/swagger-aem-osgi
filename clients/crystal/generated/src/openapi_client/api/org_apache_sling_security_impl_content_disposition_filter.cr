require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingSecurityImplContentDispositionFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_content_disposition_paths : Array(String)? = nil, sling_content_disposition_excluded_paths : Array(String)? = nil, sling_content_disposition_all_paths : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingSecurityImplContentDispositionFilterInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingSecurityImplContentDispositionFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.content.disposition.paths" => sling_content_disposition_paths, "sling.content.disposition.excluded.paths" => sling_content_disposition_excluded_paths, "sling.content.disposition.all.paths" => sling_content_disposition_all_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
