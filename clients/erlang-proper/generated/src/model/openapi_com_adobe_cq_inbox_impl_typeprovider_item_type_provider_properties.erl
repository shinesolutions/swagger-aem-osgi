-module(openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties/0]).

-export([openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties/1]).

-export_type([openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties/0]).

-type openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties() ::
  [ {'inbox_impl_typeprovider_registrypaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'inbox_impl_typeprovider_legacypaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'inbox_impl_typeprovider_defaulturl_failureitem', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'inbox_impl_typeprovider_defaulturl_workitem', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'inbox_impl_typeprovider_defaulturl_task', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties() ->
    openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties([]).

openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties(Fields) ->
  Default = [ {'inbox.impl.typeprovider.registrypaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'inbox.impl.typeprovider.legacypaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'inbox.impl.typeprovider.defaulturl.failureitem', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'inbox.impl.typeprovider.defaulturl.workitem', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'inbox.impl.typeprovider.defaulturl.task', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

