require "json"

module OpenAPIClient
  module Api
  class OrgApacheAriesJmxFrameworkStateConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, attribute_change_notification_enabled : Bool? = nil) : Response(OpenAPIClient::OrgApacheAriesJmxFrameworkStateConfigInfo)
      @conn.request(OpenAPIClient::OrgApacheAriesJmxFrameworkStateConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.aries.jmx.framework.StateConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "attributeChangeNotificationEnabled" => attribute_change_notification_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
