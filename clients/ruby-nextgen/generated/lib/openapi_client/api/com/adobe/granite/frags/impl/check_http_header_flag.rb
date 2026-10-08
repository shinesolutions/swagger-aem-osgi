# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteFragsImplCheckHttpHeaderFlag
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, feature_name: nil, feature_description: nil, http_header_name: nil, http_header_valuepattern: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag',
          type: OpenapiClient::Models::ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'feature.name' => feature_name, 'feature.description' => feature_description, 'http.header.name' => http_header_name, 'http.header.valuepattern' => http_header_valuepattern }
        )
      end
    end
  end
end
