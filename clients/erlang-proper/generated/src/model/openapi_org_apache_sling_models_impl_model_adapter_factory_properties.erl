-module(openapi_org_apache_sling_models_impl_model_adapter_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_models_impl_model_adapter_factory_properties/0]).

-export([openapi_org_apache_sling_models_impl_model_adapter_factory_properties/1]).

-export_type([openapi_org_apache_sling_models_impl_model_adapter_factory_properties/0]).

-type openapi_org_apache_sling_models_impl_model_adapter_factory_properties() ::
  [ {'osgi_http_whiteboard_listener', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'osgi_http_whiteboard_context_select', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'max_recursion_depth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cleanup_job_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_models_impl_model_adapter_factory_properties() ->
    openapi_org_apache_sling_models_impl_model_adapter_factory_properties([]).

openapi_org_apache_sling_models_impl_model_adapter_factory_properties(Fields) ->
  Default = [ {'osgi.http.whiteboard.listener', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'osgi.http.whiteboard.context.select', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'max.recursion.depth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cleanup.job.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

