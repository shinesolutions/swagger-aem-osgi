require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrDavexImplServletsSlingDavExServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, _alias : String? = nil, dav_create_absolute_uri : Bool? = nil, dav_protectedhandlers : String? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "alias" => _alias, "dav.create-absolute-uri" => dav_create_absolute_uri, "dav.protectedhandlers" => dav_protectedhandlers },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
