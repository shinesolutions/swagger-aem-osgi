# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, locale: nil, ims_config: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl',
          type: OpenapiClient::Models::ComDayCqDamStockIntegrationImplConfigurationStockConfH04f5fbea,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'locale' => locale, 'imsConfig' => ims_config }
        )
      end
    end
  end
end
