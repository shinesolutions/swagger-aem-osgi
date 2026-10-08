require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletMetadataGetServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_resource_types : String? = nil, sling_servlet_methods : String? = nil, sling_servlet_extensions : String? = nil, sling_servlet_selectors : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletMetadataGetServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletMetadataGetServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.resourceTypes" => sling_servlet_resource_types, "sling.servlet.methods" => sling_servlet_methods, "sling.servlet.extensions" => sling_servlet_extensions, "sling.servlet.selectors" => sling_servlet_selectors },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
