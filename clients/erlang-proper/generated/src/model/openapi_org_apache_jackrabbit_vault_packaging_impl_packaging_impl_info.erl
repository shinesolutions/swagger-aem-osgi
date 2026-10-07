-module(openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info/0]).

-export([openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info/1]).

-export_type([openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info/0]).

-type openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties:openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties() }
  ].


openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info() ->
    openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info([]).

openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties:openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

