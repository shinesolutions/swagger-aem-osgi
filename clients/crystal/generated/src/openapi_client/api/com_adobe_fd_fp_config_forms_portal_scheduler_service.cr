require "json"

module OpenAPIClient
  module Api
  class ComAdobeFdFpConfigFormsPortalSchedulerService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, formportal_interval : String? = nil) : Response(OpenAPIClient::ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "formportal.interval" => formportal_interval },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
