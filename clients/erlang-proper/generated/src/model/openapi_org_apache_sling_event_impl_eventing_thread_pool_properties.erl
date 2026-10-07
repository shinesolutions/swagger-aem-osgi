-module(openapi_org_apache_sling_event_impl_eventing_thread_pool_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_event_impl_eventing_thread_pool_properties/0]).

-export([openapi_org_apache_sling_event_impl_eventing_thread_pool_properties/1]).

-export_type([openapi_org_apache_sling_event_impl_eventing_thread_pool_properties/0]).

-type openapi_org_apache_sling_event_impl_eventing_thread_pool_properties() ::
  [ {'minPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_event_impl_eventing_thread_pool_properties() ->
    openapi_org_apache_sling_event_impl_eventing_thread_pool_properties([]).

openapi_org_apache_sling_event_impl_eventing_thread_pool_properties(Fields) ->
  Default = [ {'minPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

