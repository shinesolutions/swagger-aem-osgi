-module(openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties() ::
  [ {'length', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties() ->
    openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties([]).

openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties(Fields) ->
  Default = [ {'length', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

