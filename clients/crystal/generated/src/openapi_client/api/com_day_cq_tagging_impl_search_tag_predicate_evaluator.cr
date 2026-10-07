require "json"

module OpenAPIClient
  module Api
  class ComDayCqTaggingImplSearchTagPredicateEvaluator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, ignore_path : Bool? = nil) : Response(OpenAPIClient::ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo)
      @conn.request(OpenAPIClient::ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "ignore_path" => ignore_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
