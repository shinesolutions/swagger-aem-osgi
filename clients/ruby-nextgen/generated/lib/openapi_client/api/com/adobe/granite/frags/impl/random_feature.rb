# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteFragsImplRandomFeature
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, feature_name: nil, feature_description: nil, active_percentage: nil, cookie_name: nil, cookie_max_age: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature',
          type: OpenapiClient::Models::ComAdobeGraniteFragsImplRandomFeatureInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'feature.name' => feature_name, 'feature.description' => feature_description, 'active.percentage' => active_percentage, 'cookie.name' => cookie_name, 'cookie.maxAge' => cookie_max_age }
        )
      end
    end
  end
end
