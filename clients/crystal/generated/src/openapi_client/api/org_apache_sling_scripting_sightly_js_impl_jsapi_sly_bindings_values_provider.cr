require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_scripting_sightly_js_bindings : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.scripting.sightly.js.bindings" => org_apache_sling_scripting_sightly_js_bindings },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
