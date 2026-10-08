-module(openapi_com_adobe_cq_account_api_account_management_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_account_api_account_management_service_properties/0]).

-export([openapi_com_adobe_cq_account_api_account_management_service_properties/1]).

-export_type([openapi_com_adobe_cq_account_api_account_management_service_properties/0]).

-type openapi_com_adobe_cq_account_api_account_management_service_properties() ::
  [ {'cq_accountmanager_token_validity_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_accountmanager_config_requestnewaccount_mail', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_accountmanager_config_requestnewpwd_mail', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_account_api_account_management_service_properties() ->
    openapi_com_adobe_cq_account_api_account_management_service_properties([]).

openapi_com_adobe_cq_account_api_account_management_service_properties(Fields) ->
  Default = [ {'cq.accountmanager.token.validity.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.accountmanager.config.requestnewaccount.mail', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.accountmanager.config.requestnewpwd.mail', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

