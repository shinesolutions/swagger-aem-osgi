require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandlerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, tagpattern : String? = nil) : Response(OpenAPIClient::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "tagpattern" => tagpattern },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
