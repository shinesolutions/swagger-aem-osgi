# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqRewriterProcessorImplHtmlParserFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, htmlparser_process_tags: nil, htmlparser_preserve_camel_case: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory',
          type: OpenapiClient::Models::ComDayCqRewriterProcessorImplHtmlParserFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'htmlparser.processTags' => htmlparser_process_tags, 'htmlparser.preserveCamelCase' => htmlparser_preserve_camel_case }
        )
      end
    end
  end
end
