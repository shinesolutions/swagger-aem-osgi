require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingScriptingCoreImplScriptCacheImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_scripting_cache_size : Int32? = nil, org_apache_sling_scripting_cache_additional_extensions : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingScriptingCoreImplScriptCacheImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingScriptingCoreImplScriptCacheImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.scripting.cache.size" => org_apache_sling_scripting_cache_size, "org.apache.sling.scripting.cache.additional_extensions" => org_apache_sling_scripting_cache_additional_extensions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
