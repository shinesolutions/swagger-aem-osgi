require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowCorePayloadMapCache
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, get_system_workflow_models : Array(String)? = nil, get_package_root_path : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowCorePayloadMapCacheInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowCorePayloadMapCacheInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "getSystemWorkflowModels" => get_system_workflow_models, "getPackageRootPath" => get_package_root_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
