require "json"

module OpenAPIClient
  module Api
  class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, from_address : String? = nil, sender_host : String? = nil, max_bounce_count : String? = nil) : Response(OpenAPIClient::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "from.address" => from_address, "sender.host" => sender_host, "max.bounce.count" => max_bounce_count },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
