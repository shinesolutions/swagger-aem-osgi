-module(openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties/0]).

-export([openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties/1]).

-export_type([openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties/0]).

-type openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties() ::
  [ {'allow_only_system_user', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties() ->
    openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties([]).

openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties(Fields) ->
  Default = [ {'allow.only.system.user', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

