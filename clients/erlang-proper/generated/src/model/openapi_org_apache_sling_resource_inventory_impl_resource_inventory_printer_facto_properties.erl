-module(openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties/0]).

-export([openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties/1]).

-export_type([openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties/0]).

-type openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties() ::
  [ {'felix_inventory_printer_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'felix_inventory_printer_title', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties() ->
    openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties([]).

openapi_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties(Fields) ->
  Default = [ {'felix.inventory.printer.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'felix.inventory.printer.title', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

