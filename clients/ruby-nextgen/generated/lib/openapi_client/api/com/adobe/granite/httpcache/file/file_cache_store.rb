# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteHttpcacheFileFileCacheStore
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_granite_httpcache_file_document_root: nil, com_adobe_granite_httpcache_file_include_host: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore',
          type: OpenapiClient::Models::ComAdobeGraniteHttpcacheFileFileCacheStoreInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.granite.httpcache.file.documentRoot' => com_adobe_granite_httpcache_file_document_root, 'com.adobe.granite.httpcache.file.includeHost' => com_adobe_granite_httpcache_file_include_host }
        )
      end
    end
  end
end
