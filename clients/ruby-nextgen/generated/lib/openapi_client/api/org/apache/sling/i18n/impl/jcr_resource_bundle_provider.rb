# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingI18nImplJcrResourceBundleProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, locale_default: nil, preload_bundles: nil, invalidation_delay: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider',
          type: OpenapiClient::Models::OrgApacheSlingI18nImplJcrResourceBundleProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'locale.default' => locale_default, 'preload.bundles' => preload_bundles, 'invalidation.delay' => invalidation_delay }
        )
      end
    end
  end
end
