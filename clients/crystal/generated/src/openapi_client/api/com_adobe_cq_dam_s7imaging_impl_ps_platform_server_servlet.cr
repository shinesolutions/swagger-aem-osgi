require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamS7imagingImplPsPlatformServerServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cache_enable : Bool? = nil, cache_root_paths : Array(String)? = nil, cache_max_size : Int32? = nil, cache_max_entries : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cache.enable" => cache_enable, "cache.rootPaths" => cache_root_paths, "cache.maxSize" => cache_max_size, "cache.maxEntries" => cache_max_entries },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
