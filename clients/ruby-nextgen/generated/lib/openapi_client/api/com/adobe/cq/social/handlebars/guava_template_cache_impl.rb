# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, parameter_guava_cache_enabled: nil, parameter_guava_cache_params: nil, parameter_guava_cache_reload: nil, service_ranking: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'parameter.guava.cache.enabled' => parameter_guava_cache_enabled, 'parameter.guava.cache.params' => parameter_guava_cache_params, 'parameter.guava.cache.reload' => parameter_guava_cache_reload, 'service.ranking' => service_ranking }
        )
      end
    end
  end
end
