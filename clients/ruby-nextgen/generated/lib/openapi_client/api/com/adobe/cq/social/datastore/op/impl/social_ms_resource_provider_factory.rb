# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, solr_zk_timeout: nil, solr_commit: nil, cache_on: nil, concurrency_level: nil, cache_start_size: nil, cache_ttl: nil, cache_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviH3fc7eef6,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'solr.zk.timeout' => solr_zk_timeout, 'solr.commit' => solr_commit, 'cache.on' => cache_on, 'concurrency.level' => concurrency_level, 'cache.start.size' => cache_start_size, 'cache.ttl' => cache_ttl, 'cache.size' => cache_size }
        )
      end
    end
  end
end
