# frozen_string_literal: true

module OpenapiClient
  module Api
    class Adaptive Form and Interactive Communication Web Channel Theme Configuration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, font_list: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration',
          type: OpenapiClient::Models::AdaptiveFormAndInteractiveCommunicationWebChannelThemeCH4f840ef1,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fontList' => font_list }
        )
      end
    end
  end
end
