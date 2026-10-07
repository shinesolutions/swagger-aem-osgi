-module(openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties/0]).

-export([openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties/0]).

-type openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties() ::
  [ {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'fontmgr_system_font_dir', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'fontmgr_adobe_font_dir', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'fontmgr_customer_font_dir', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties() ->
    openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties([]).

openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties(Fields) ->
  Default = [ {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'fontmgr.system.font.dir', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'fontmgr.adobe.font.dir', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'fontmgr.customer.font.dir', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

