# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponentTagHandlerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, tagpattern: nil, component_resource_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory',
          type: OpenapiClient::Models::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleH0d6a807a,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'tagpattern' => tagpattern, 'component.resourceType' => component_resource_type }
        )
      end
    end
  end
end
