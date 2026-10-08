-module(openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties/0]).

-export([openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties/1]).

-export_type([openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties/0]).

-type openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties() ::
  [ {'process_label', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'extract_pages', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties() ->
    openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties([]).

openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties(Fields) ->
  Default = [ {'process.label', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'extract.pages', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

