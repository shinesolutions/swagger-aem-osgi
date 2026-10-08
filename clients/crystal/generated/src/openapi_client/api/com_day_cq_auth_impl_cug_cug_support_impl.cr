require "json"

module OpenAPIClient
  module Api
  class ComDayCqAuthImplCugCugSupportImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cug_exempted_principals : Array(String)? = nil, cug_enabled : Bool? = nil, cug_principals_regex : String? = nil, cug_principals_replacement : String? = nil) : Response(OpenAPIClient::ComDayCqAuthImplCugCugSupportImplInfo)
      @conn.request(OpenAPIClient::ComDayCqAuthImplCugCugSupportImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cug.exempted.principals" => cug_exempted_principals, "cug.enabled" => cug_enabled, "cug.principals.regex" => cug_principals_regex, "cug.principals.replacement" => cug_principals_replacement },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
