require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil, dispatcher_address : String? = nil, dispatcher_filter_allowed : Array(String)? = nil, dispatcher_filter_blocked : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags, "dispatcher.address" => dispatcher_address, "dispatcher.filter.allowed" => dispatcher_filter_allowed, "dispatcher.filter.blocked" => dispatcher_filter_blocked },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
