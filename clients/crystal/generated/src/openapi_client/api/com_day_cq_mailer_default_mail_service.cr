require "json"

module OpenAPIClient
  module Api
  class ComDayCqMailerDefaultMailService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, smtp_host : String? = nil, smtp_port : Int32? = nil, smtp_user : String? = nil, smtp_password : String? = nil, from_address : String? = nil, smtp_ssl : Bool? = nil, smtp_starttls : Bool? = nil, debug_email : Bool? = nil) : Response(OpenAPIClient::ComDayCqMailerDefaultMailServiceInfo)
      @conn.request(OpenAPIClient::ComDayCqMailerDefaultMailServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.mailer.DefaultMailService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "smtp.host" => smtp_host, "smtp.port" => smtp_port, "smtp.user" => smtp_user, "smtp.password" => smtp_password, "from.address" => from_address, "smtp.ssl" => smtp_ssl, "smtp.starttls" => smtp_starttls, "debug.email" => debug_email },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
