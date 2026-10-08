require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponentTagHandlerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, tagpattern : String? = nil) : Response(OpenAPIClient::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "tagpattern" => tagpattern },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
