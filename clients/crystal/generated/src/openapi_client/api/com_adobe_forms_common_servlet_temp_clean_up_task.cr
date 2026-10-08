require "json"

module OpenAPIClient
  module Api
  class ComAdobeFormsCommonServletTempCleanUpTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil, duration_for_temporary_storage : String? = nil, duration_for_anonymous_storage : String? = nil) : Response(OpenAPIClient::ComAdobeFormsCommonServletTempCleanUpTaskInfo)
      @conn.request(OpenAPIClient::ComAdobeFormsCommonServletTempCleanUpTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression, "Duration for Temporary Storage" => duration_for_temporary_storage, "Duration for Anonymous Storage" => duration_for_anonymous_storage },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
