# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamS7imagingImplPsPlatformServerServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cache_enable: nil, cache_root_paths: nil, cache_max_size: nil, cache_max_entries: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet',
          type: OpenapiClient::Models::ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cache.enable' => cache_enable, 'cache.rootPaths' => cache_root_paths, 'cache.maxSize' => cache_max_size, 'cache.maxEntries' => cache_max_entries }
        )
      end
    end
  end
end
