require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil, minimum_code_cache_size : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags, "minimum.code.cache.size" => minimum_code_cache_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
