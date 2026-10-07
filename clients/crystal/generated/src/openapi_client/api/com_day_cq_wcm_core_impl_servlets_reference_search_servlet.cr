require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplServletsReferenceSearchServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, referencesearchservlet_max_references_per_page : Int32? = nil, referencesearchservlet_max_pages : Int32? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplServletsReferenceSearchServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplServletsReferenceSearchServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "referencesearchservlet.maxReferencesPerPage" => referencesearchservlet_max_references_per_page, "referencesearchservlet.maxPages" => referencesearchservlet_max_pages },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
