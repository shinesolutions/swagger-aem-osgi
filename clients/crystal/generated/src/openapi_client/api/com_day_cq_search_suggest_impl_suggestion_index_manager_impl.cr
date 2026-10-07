require "json"

module OpenAPIClient
  module Api
  class ComDayCqSearchSuggestImplSuggestionIndexManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path_builder_target : String? = nil, suggest_basepath : String? = nil) : Response(OpenAPIClient::ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "pathBuilder.target" => path_builder_target, "suggest.basepath" => suggest_basepath },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
