require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmNotificationEmailImplEmailChannel
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, email_from : String? = nil) : Response(OpenAPIClient::ComDayCqWcmNotificationEmailImplEmailChannelInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmNotificationEmailImplEmailChannelInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "email.from" => email_from },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
