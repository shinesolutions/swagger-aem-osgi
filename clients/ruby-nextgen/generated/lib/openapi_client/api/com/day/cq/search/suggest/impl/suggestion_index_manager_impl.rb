# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqSearchSuggestImplSuggestionIndexManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path_builder_target: nil, suggest_basepath: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl',
          type: OpenapiClient::Models::ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'pathBuilder.target' => path_builder_target, 'suggest.basepath' => suggest_basepath }
        )
      end
    end
  end
end
