# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingServletsResolverSlingServletResolver
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, servletresolver_servlet_root: nil, servletresolver_cache_size: nil, servletresolver_paths: nil, servletresolver_default_extensions: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver',
          type: OpenapiClient::Models::OrgApacheSlingServletsResolverSlingServletResolverInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'servletresolver.servletRoot' => servletresolver_servlet_root, 'servletresolver.cacheSize' => servletresolver_cache_size, 'servletresolver.paths' => servletresolver_paths, 'servletresolver.defaultExtensions' => servletresolver_default_extensions }
        )
      end
    end
  end
end
