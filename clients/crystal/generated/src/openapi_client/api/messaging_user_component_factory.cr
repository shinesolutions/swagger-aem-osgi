require "json"

module OpenAPIClient
  module Api
  class MessagingUserComponentFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, priority : Int32? = nil) : Response(OpenAPIClient::MessagingUserComponentFactoryInfo)
      @conn.request(OpenAPIClient::MessagingUserComponentFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/MessagingUserComponentFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "priority" => priority },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
