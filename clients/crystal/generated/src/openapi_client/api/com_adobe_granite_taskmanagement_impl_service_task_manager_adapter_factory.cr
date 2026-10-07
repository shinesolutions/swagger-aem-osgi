require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, adapter_condition : String? = nil, taskmanager_admingroups : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "adapter.condition" => adapter_condition, "taskmanager.admingroups" => taskmanager_admingroups },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
