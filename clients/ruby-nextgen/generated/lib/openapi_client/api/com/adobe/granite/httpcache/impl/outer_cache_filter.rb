# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteHttpcacheImplOuterCacheFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_granite_httpcache_url_paths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter',
          type: OpenapiClient::Models::ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.granite.httpcache.url.paths' => com_adobe_granite_httpcache_url_paths }
        )
      end
    end
  end
end
