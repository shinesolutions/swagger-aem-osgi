require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, locale : String? = nil, ims_config : String? = nil) : Response(OpenAPIClient::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo)
      @conn.request(OpenAPIClient::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "locale" => locale, "imsConfig" => ims_config },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
