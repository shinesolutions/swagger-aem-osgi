require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmNotificationImplNotificationManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_topics : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmNotificationImplNotificationManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmNotificationImplNotificationManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.topics" => event_topics },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
