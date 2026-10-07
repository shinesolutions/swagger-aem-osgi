# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_name: nil, hc_tags: nil, hc_mbean_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC',
          type: OpenapiClient::Models::ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.name' => hc_name, 'hc.tags' => hc_tags, 'hc.mbean.name' => hc_mbean_name }
        )
      end
    end
  end
end
