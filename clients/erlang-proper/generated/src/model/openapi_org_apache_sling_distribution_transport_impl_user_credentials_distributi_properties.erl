-module(openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties/0]).

-export([openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties/1]).

-export_type([openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties/0]).

-type openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'username', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'password', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties() ->
    openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties([]).

openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'username', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'password', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

