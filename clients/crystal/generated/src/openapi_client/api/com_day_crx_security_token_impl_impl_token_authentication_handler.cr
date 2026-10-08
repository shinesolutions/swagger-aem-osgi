require "json"

module OpenAPIClient
  module Api
  class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil, token_required_attr : String? = nil, token_alternate_url : String? = nil, token_encapsulated : Bool? = nil, skip_token_refresh : Array(String)? = nil) : Response(OpenAPIClient::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "token.required.attr" => token_required_attr, "token.alternate.url" => token_alternate_url, "token.encapsulated" => token_encapsulated, "skip.token.refresh" => skip_token_refresh },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
