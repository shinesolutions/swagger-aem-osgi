require "json"

module OpenAPIClient
  module Api
  class ComDayCqRewriterProcessorImplHtmlParserFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, htmlparser_process_tags : Array(String)? = nil, htmlparser_preserve_camel_case : Bool? = nil) : Response(OpenAPIClient::ComDayCqRewriterProcessorImplHtmlParserFactoryInfo)
      @conn.request(OpenAPIClient::ComDayCqRewriterProcessorImplHtmlParserFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "htmlparser.processTags" => htmlparser_process_tags, "htmlparser.preserveCamelCase" => htmlparser_preserve_camel_case },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
