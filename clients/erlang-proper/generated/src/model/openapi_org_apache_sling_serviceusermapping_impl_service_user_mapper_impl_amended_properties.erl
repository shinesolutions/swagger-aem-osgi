-module(openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties/0]).

-export([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties/1]).

-export_type([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties/0]).

-type openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'user_mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties() ->
    openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties([]).

openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'user.mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

