# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteI18nImplBundlePseudoTranslations
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, pseudo_patterns: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations',
          type: OpenapiClient::Models::ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'pseudo.patterns' => pseudo_patterns }
        )
      end
    end
  end
end
