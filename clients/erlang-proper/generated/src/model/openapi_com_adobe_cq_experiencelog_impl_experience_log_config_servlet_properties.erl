-module(openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties/0]).

-export([openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties/0]).

-type openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'disabledForGroups', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties() ->
    openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties([]).

openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'disabledForGroups', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

