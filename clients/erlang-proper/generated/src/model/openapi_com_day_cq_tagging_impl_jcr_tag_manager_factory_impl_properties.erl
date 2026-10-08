-module(openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties/0]).

-export([openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties/1]).

-export_type([openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties/0]).

-type openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties() ::
  [ {'validation_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties() ->
    openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties([]).

openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties(Fields) ->
  Default = [ {'validation.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

