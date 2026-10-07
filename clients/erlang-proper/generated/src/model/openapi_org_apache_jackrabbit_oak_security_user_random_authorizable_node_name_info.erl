-module(openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_info/0]).

-export([openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_info/0]).

-type openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties:openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_info() ->
    openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_info([]).

openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties:openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

