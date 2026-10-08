# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponentTagHandlerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, tagpattern: nil, component_resource_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory',
          type: OpenapiClient::Models::ComDayCqMcmLandingpageParserTaghandlersCtaClickThrougHf4794d8f,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'tagpattern' => tagpattern, 'component.resourceType' => component_resource_type }
        )
      end
    end
  end
end
