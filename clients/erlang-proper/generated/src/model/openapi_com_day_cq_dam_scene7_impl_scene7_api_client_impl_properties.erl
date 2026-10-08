-module(openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties/0]).

-export([openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties() ::
  [ {'cq_dam_scene7_apiclient_recordsperpage_nofilter_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_scene7_apiclient_recordsperpage_withfilter_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties() ->
    openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties([]).

openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties(Fields) ->
  Default = [ {'cq.dam.scene7.apiclient.recordsperpage.nofilter.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.scene7.apiclient.recordsperpage.withfilter.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

