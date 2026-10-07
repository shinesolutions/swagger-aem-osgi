# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteI18nImplPreferencesLocaleResolverService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, security_preferences_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService',
          type: OpenapiClient::Models::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'security.preferences.name' => security_preferences_name }
        )
      end
    end
  end
end
