require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteHttpcacheFileFileCacheStore
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_granite_httpcache_file_document_root : String? = nil, com_adobe_granite_httpcache_file_include_host : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteHttpcacheFileFileCacheStoreInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteHttpcacheFileFileCacheStoreInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.granite.httpcache.file.documentRoot" => com_adobe_granite_httpcache_file_document_root, "com.adobe.granite.httpcache.file.includeHost" => com_adobe_granite_httpcache_file_include_host },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
