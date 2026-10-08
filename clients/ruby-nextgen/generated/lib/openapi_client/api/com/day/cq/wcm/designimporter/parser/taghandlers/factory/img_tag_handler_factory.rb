# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, tagpattern: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory',
          type: OpenapiClient::Models::ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTHe109746e,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'tagpattern' => tagpattern }
        )
      end
    end
  end
end
