require "json"

module OpenAPIClient
  module Api
  class ComDayCqMailerImplEmailCqRetrieverTemplateFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, mailer_email_embed : Bool? = nil, mailer_email_charset : String? = nil, mailer_email_retriever_user_id : String? = nil, mailer_email_retriever_user_pwd : String? = nil) : Response(OpenAPIClient::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo)
      @conn.request(OpenAPIClient::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "mailer.email.embed" => mailer_email_embed, "mailer.email.charset" => mailer_email_charset, "mailer.email.retrieverUserID" => mailer_email_retriever_user_id, "mailer.email.retrieverUserPWD" => mailer_email_retriever_user_pwd },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
