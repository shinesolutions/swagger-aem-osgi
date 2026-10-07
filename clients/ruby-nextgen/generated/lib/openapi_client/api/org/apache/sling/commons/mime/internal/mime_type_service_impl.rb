# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, mime_types: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl',
          type: OpenapiClient::Models::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'mime.types' => mime_types }
        )
      end
    end
  end
end
