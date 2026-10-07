# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqTaggingImplSearchTagPredicateEvaluator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, ignore_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator',
          type: OpenapiClient::Models::ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'ignore_path' => ignore_path }
        )
      end
    end
  end
end
