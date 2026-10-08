# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, type_collections: nil, type_noncollections: nil, type_content: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService',
          type: OpenapiClient::Models::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'type.collections' => type_collections, 'type.noncollections' => type_noncollections, 'type.content' => type_content }
        )
      end
    end
  end
end
