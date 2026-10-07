# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, felix_inventory_printer_name: nil, felix_inventory_printer_title: nil, path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory',
          type: OpenapiClient::Models::OrgApacheSlingResourceInventoryImplResourceInventoryPrH02917a51,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'felix.inventory.printer.name' => felix_inventory_printer_name, 'felix.inventory.printer.title' => felix_inventory_printer_title, 'path' => path }
        )
      end
    end
  end
end
