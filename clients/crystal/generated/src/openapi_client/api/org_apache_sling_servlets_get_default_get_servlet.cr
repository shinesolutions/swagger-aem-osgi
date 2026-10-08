require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingServletsGetDefaultGetServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, aliases : Array(String)? = nil, index : Bool? = nil, index_files : Array(String)? = nil, enable_html : Bool? = nil, enable_json : Bool? = nil, enable_txt : Bool? = nil, enable_xml : Bool? = nil, json_maximumresults : Int32? = nil, ecma_suport : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingServletsGetDefaultGetServletInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingServletsGetDefaultGetServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "aliases" => aliases, "index" => index, "index.files" => index_files, "enable.html" => enable_html, "enable.json" => enable_json, "enable.txt" => enable_txt, "enable.xml" => enable_xml, "json.maximumresults" => json_maximumresults, "ecmaSuport" => ecma_suport },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
