# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, parser_features: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser',
          type: OpenapiClient::Models::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'parser.features' => parser_features }
        )
      end
    end
  end
end
