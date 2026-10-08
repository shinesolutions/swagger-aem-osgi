# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmDesignimporterImplEntryPreprocessorImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, search_pattern: nil, replace_pattern: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl',
          type: OpenapiClient::Models::ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'search.pattern' => search_pattern, 'replace.pattern' => replace_pattern }
        )
      end
    end
  end
end
