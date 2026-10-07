-module(openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info/0]).

-export([openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info/0]).

-type openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties:openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties() }
  ].


openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info() ->
    openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info([]).

openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties:openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

