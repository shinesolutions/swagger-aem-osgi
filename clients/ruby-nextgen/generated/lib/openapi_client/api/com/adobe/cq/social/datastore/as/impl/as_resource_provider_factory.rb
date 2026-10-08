# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, version_id: nil, cache_on: nil, concurrency_level: nil, cache_start_size: nil, cache_ttl: nil, cache_size: nil, time_limit: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'version.id' => version_id, 'cache.on' => cache_on, 'concurrency.level' => concurrency_level, 'cache.start.size' => cache_start_size, 'cache.ttl' => cache_ttl, 'cache.size' => cache_size, 'time.limit' => time_limit }
        )
      end
    end
  end
end
