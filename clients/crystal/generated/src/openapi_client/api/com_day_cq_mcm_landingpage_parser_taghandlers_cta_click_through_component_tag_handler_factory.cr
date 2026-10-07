require "json"

module OpenAPIClient
  module Api
  class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponentTagHandlerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, tagpattern : String? = nil, component_resource_type : String? = nil) : Response(OpenAPIClient::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo)
      @conn.request(OpenAPIClient::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "tagpattern" => tagpattern, "component.resourceType" => component_resource_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
