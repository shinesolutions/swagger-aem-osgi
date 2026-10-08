# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil, exclude_search_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteRepositoryHcImplContentSlingSlingConteH82d87eb5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags, 'exclude.search.path' => exclude_search_path }
        )
      end
    end
  end
end
