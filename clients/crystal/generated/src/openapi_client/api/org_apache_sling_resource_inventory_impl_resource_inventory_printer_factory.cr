require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, felix_inventory_printer_name : String? = nil, felix_inventory_printer_title : String? = nil, path : String? = nil) : Response(OpenAPIClient::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "felix.inventory.printer.name" => felix_inventory_printer_name, "felix.inventory.printer.title" => felix_inventory_printer_title, "path" => path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
