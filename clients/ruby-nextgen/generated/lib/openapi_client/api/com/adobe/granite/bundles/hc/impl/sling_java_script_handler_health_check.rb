# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHeHf38bb49b,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags }
        )
      end
    end
  end
end
