require "json"

module OpenAPIClient
  module Api
  class ComDayCqSearchpromoteImplSearchPromoteServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_searchpromote_configuration_server_uri : String? = nil, cq_searchpromote_configuration_environment : String? = nil, connection_timeout : Int32? = nil, socket_timeout : Int32? = nil) : Response(OpenAPIClient::ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.searchpromote.configuration.server.uri" => cq_searchpromote_configuration_server_uri, "cq.searchpromote.configuration.environment" => cq_searchpromote_configuration_environment, "connection.timeout" => connection_timeout, "socket.timeout" => socket_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
