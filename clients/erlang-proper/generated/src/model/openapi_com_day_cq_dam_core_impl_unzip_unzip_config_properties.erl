-module(openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties/0]).

-type openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties() ::
  [ {'cq_dam_config_unzip_maxuncompressedsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_config_unzip_encoding', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties() ->
    openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties([]).

openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties(Fields) ->
  Default = [ {'cq.dam.config.unzip.maxuncompressedsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.config.unzip.encoding', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

