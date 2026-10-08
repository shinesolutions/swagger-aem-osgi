-module(openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_info/0]).

-export([openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_info/1]).

-export_type([openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_info/0]).

-type openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties:openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties() }
  ].


openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_info() ->
    openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_info([]).

openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties:openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

