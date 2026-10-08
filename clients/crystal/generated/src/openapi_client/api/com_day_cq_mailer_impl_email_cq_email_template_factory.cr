require "json"

module OpenAPIClient
  module Api
  class ComDayCqMailerImplEmailCqEmailTemplateFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, mailer_email_charset : String? = nil) : Response(OpenAPIClient::ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo)
      @conn.request(OpenAPIClient::ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "mailer.email.charset" => mailer_email_charset },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
