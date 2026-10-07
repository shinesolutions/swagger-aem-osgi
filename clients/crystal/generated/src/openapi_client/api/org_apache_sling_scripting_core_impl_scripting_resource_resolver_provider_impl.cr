require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, log_stacktrace_onclose : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "log.stacktrace.onclose" => log_stacktrace_onclose },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
