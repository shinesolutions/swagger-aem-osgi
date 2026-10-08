# frozen_string_literal: true

module OpenapiClient
  module Api
    class Adaptive Form and Interactive Communication Web Channel Configuration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, show_placeholder: nil, maximum_cache_entries: nil, af_scripting_compatversion: nil, make_file_name_unique: nil, generating_compliant_data: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration',
          type: OpenapiClient::Models::AdaptiveFormAndInteractiveCommunicationWebChannelConfigHe81a90fb,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'showPlaceholder' => show_placeholder, 'maximumCacheEntries' => maximum_cache_entries, 'af.scripting.compatversion' => af_scripting_compatversion, 'makeFileNameUnique' => make_file_name_unique, 'generatingCompliantData' => generating_compliant_data }
        )
      end
    end
  end
end
