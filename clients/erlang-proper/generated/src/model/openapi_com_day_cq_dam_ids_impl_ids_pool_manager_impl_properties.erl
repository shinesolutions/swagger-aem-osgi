-module(openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties/0]).

-export([openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties/0]).

-type openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties() ::
  [ {'max_errors_to_blacklist', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'retry_interval_to_whitelist', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'connect_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'socket_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'process_label', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'connection_use_max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties() ->
    openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties([]).

openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties(Fields) ->
  Default = [ {'max.errors.to.blacklist', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'retry.interval.to.whitelist', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'connect.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'socket.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'process.label', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'connection.use.max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

