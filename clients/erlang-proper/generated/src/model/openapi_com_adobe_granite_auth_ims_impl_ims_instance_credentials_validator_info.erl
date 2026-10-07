-module(openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_info/0]).

-export([openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_info/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_info/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties:openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties() }
  ].


openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_info() ->
    openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_info([]).

openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties:openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

