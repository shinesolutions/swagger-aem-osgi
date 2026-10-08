require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialNotificationsImplNotificationManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_unread_notification_count : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "max.unread.notification.count" => max_unread_notification_count },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
