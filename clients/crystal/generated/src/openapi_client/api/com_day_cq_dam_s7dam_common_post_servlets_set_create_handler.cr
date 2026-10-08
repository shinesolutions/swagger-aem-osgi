require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamS7damCommonPostServletsSetCreateHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_post_operation : String? = nil, sling_servlet_methods : String? = nil) : Response(OpenAPIClient::ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.post.operation" => sling_post_operation, "sling.servlet.methods" => sling_servlet_methods },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
