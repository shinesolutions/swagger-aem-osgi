# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHeaH648bc3aa,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags }
        )
      end
    end
  end
end
