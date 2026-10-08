require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingServletsResolverSlingServletResolver
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, servletresolver_servlet_root : String? = nil, servletresolver_cache_size : Int32? = nil, servletresolver_paths : Array(String)? = nil, servletresolver_default_extensions : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingServletsResolverSlingServletResolverInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingServletsResolverSlingServletResolverInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "servletresolver.servletRoot" => servletresolver_servlet_root, "servletresolver.cacheSize" => servletresolver_cache_size, "servletresolver.paths" => servletresolver_paths, "servletresolver.defaultExtensions" => servletresolver_default_extensions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
