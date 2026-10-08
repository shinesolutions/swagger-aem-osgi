-module(openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties/0]).

-export([openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties/1]).

-export_type([openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties/0]).

-type openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties() ::
  [ {'importer_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties() ->
    openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties([]).

openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties(Fields) ->
  Default = [ {'importer.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

