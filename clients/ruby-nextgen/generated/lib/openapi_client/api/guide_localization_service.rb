# frozen_string_literal: true

module OpenapiClient
  module Api
    class Guide Localization Service
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, supported_locales: nil, localizable_properties: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/Guide Localization Service',
          type: OpenapiClient::Models::GuideLocalizationServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'supportedLocales' => supported_locales, 'Localizable Properties' => localizable_properties }
        )
      end
    end
  end
end
