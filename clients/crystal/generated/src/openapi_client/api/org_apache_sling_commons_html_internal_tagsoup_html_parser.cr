require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, parser_features : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "parser.features" => parser_features },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
