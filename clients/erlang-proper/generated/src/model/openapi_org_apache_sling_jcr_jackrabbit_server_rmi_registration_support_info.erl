-module(openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info/0]).

-export([openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info/1]).

-export_type([openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info/0]).

-type openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties:openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties() }
  ].


openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info() ->
    openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info([]).

openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties:openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

