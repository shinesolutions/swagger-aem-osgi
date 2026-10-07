require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmDesignimporterImplEntryPreprocessorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, search_pattern : String? = nil, replace_pattern : String? = nil) : Response(OpenAPIClient::ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "search.pattern" => search_pattern, "replace.pattern" => replace_pattern },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
