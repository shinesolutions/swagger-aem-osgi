-module(openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties/0]).

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties() ::
  [ {'cq_analytics_adapterfactory_contextstores', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties() ->
    openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties([]).

openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties(Fields) ->
  Default = [ {'cq.analytics.adapterfactory.contextstores', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

