# frozen_string_literal: true

module OpenapiClient
  module Api
    class Apache Sling Health Check Result HTML Serializer
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, style_string: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/Apache Sling Health Check Result HTML Serializer',
          type: OpenapiClient::Models::ApacheSlingHealthCheckResultHTMLSerializerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'styleString' => style_string }
        )
      end
    end
  end
end
