require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, java_classdebuginfo : Bool? = nil, java_java_encoding : String? = nil, java_compiler_source_vm : String? = nil, java_compiler_target_vm : String? = nil) : Response(OpenAPIClient::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "java.classdebuginfo" => java_classdebuginfo, "java.javaEncoding" => java_java_encoding, "java.compilerSourceVM" => java_compiler_source_vm, "java.compilerTargetVM" => java_compiler_target_vm },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
