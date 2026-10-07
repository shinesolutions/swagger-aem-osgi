require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_scripting_javascript_rhino_opt_level : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.scripting.javascript.rhino.optLevel" => org_apache_sling_scripting_javascript_rhino_opt_level },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
