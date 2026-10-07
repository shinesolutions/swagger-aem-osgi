require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteHttpcacheImplOuterCacheFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_granite_httpcache_url_paths : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.granite.httpcache.url.paths" => com_adobe_granite_httpcache_url_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
