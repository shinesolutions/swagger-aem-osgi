-module(openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties/0]).

-export([openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties() ::
  [ {'scene7FlashTemplates_rti', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scene7FlashTemplates_rsi', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scene7FlashTemplates_rb', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scene7FlashTemplates_rurl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scene7FlashTemplate_urlFormatParameter', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties() ->
    openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties([]).

openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties(Fields) ->
  Default = [ {'scene7FlashTemplates.rti', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scene7FlashTemplates.rsi', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scene7FlashTemplates.rb', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scene7FlashTemplates.rurl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scene7FlashTemplate.urlFormatParameter', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

