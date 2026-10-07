-module(openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties/0]).

-type openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties() ::
    #{ 'felix_inventory_printer_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'felix_inventory_printer_title' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'felix_inventory_printer_name' := FelixInventoryPrinterName,
          'felix_inventory_printer_title' := FelixInventoryPrinterTitle,
          'path' := Path
        }) ->
    #{ 'felix.inventory.printer.name' => FelixInventoryPrinterName,
       'felix.inventory.printer.title' => FelixInventoryPrinterTitle,
       'path' => Path
     }.
