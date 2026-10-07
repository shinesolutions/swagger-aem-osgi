require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, adapter_condition : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "adapter.condition" => adapter_condition },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
