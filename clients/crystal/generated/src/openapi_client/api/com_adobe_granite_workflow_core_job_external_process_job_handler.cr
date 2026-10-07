require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, default_timeout : Int32? = nil, max_timeout : Int32? = nil, default_period : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "default.timeout" => default_timeout, "max.timeout" => max_timeout, "default.period" => default_period },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
