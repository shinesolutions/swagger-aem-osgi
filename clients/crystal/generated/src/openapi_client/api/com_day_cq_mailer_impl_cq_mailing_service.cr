require "json"

module OpenAPIClient
  module Api
  class ComDayCqMailerImplCqMailingService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_recipient_count : String? = nil) : Response(OpenAPIClient::ComDayCqMailerImplCqMailingServiceInfo)
      @conn.request(OpenAPIClient::ComDayCqMailerImplCqMailingServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.mailer.impl.CqMailingService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "max.recipient.count" => max_recipient_count },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
