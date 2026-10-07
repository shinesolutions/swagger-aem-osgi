require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, omnisearch_suggestion_requiretext_min : Int32? = nil, omnisearch_suggestion_spellcheck_require : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "omnisearch.suggestion.requiretext.min" => omnisearch_suggestion_requiretext_min, "omnisearch.suggestion.spellcheck.require" => omnisearch_suggestion_spellcheck_require },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
