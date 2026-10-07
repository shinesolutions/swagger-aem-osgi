# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteCorsImplCORSPolicyImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, alloworigin: nil, alloworiginregexp: nil, allowedpaths: nil, exposedheaders: nil, maxage: nil, supportedheaders: nil, supportedmethods: nil, supportscredentials: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl',
          type: OpenapiClient::Models::ComAdobeGraniteCorsImplCORSPolicyImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'alloworigin' => alloworigin, 'alloworiginregexp' => alloworiginregexp, 'allowedpaths' => allowedpaths, 'exposedheaders' => exposedheaders, 'maxage' => maxage, 'supportedheaders' => supportedheaders, 'supportedmethods' => supportedmethods, 'supportscredentials' => supportscredentials }
        )
      end
    end
  end
end
