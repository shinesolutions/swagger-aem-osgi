require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamInddImplServletSnippetCreationServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, snippetcreation_maxcollections : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamInddImplServletSnippetCreationServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamInddImplServletSnippetCreationServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "snippetcreation.maxcollections" => snippetcreation_maxcollections },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
