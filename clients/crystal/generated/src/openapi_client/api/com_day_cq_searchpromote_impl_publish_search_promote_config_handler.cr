require "json"

module OpenAPIClient
  module Api
  class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_searchpromote_confighandler_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.searchpromote.confighandler.enabled" => cq_searchpromote_confighandler_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
