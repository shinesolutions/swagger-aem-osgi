-module(openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties/0]).

-export([openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties/1]).

-export_type([openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties/0]).

-type openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties() ::
  [ {'importer_min_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'importer_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'exclude_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'include_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties() ->
    openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties([]).

openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties(Fields) ->
  Default = [ {'importer.min.interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'importer.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'exclude.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'include.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

