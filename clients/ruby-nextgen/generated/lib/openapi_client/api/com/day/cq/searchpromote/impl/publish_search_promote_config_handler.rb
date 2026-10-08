# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_searchpromote_confighandler_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler',
          type: OpenapiClient::Models::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.searchpromote.confighandler.enabled' => cq_searchpromote_confighandler_enabled }
        )
      end
    end
  end
end
