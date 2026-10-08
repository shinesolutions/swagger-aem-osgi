require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingScriptingJspJspScriptEngineFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, jasper_compiler_target_vm : String? = nil, jasper_compiler_source_vm : String? = nil, jasper_classdebuginfo : Bool? = nil, jasper_enable_pooling : Bool? = nil, jasper_ie_class_id : String? = nil, jasper_gen_string_as_char_array : Bool? = nil, jasper_keepgenerated : Bool? = nil, jasper_mappedfile : Bool? = nil, jasper_trim_spaces : Bool? = nil, jasper_display_source_fragments : Bool? = nil, default_is_session : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "jasper.compilerTargetVM" => jasper_compiler_target_vm, "jasper.compilerSourceVM" => jasper_compiler_source_vm, "jasper.classdebuginfo" => jasper_classdebuginfo, "jasper.enablePooling" => jasper_enable_pooling, "jasper.ieClassId" => jasper_ie_class_id, "jasper.genStringAsCharArray" => jasper_gen_string_as_char_array, "jasper.keepgenerated" => jasper_keepgenerated, "jasper.mappedfile" => jasper_mappedfile, "jasper.trimSpaces" => jasper_trim_spaces, "jasper.displaySourceFragments" => jasper_display_source_fragments, "default.is.session" => default_is_session },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
