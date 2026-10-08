-module(openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties() ::
  [ {'illegalCharMapping', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pageSubTreeActivationCheck', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties() ->
    openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties([]).

openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties(Fields) ->
  Default = [ {'illegalCharMapping', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pageSubTreeActivationCheck', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

