require "json"

module OpenAPIClient
  module Api
  class ComDayCqNotificationImplNotificationServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_filter : String? = nil) : Response(OpenAPIClient::ComDayCqNotificationImplNotificationServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqNotificationImplNotificationServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.filter" => event_filter },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
