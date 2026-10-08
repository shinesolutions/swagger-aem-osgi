-module(openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties/0]).

-export([openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties/1]).

-export_type([openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties/0]).

-type openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties() ::
  [ {'references', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'scripts', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties() ->
    openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties([]).

openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties(Fields) ->
  Default = [ {'references', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'scripts', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

