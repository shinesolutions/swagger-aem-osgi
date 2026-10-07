-module(openapi_com_adobe_cq_account_impl_account_management_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_account_impl_account_management_servlet_properties/0]).

-export([openapi_com_adobe_cq_account_impl_account_management_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_account_impl_account_management_servlet_properties/0]).

-type openapi_com_adobe_cq_account_impl_account_management_servlet_properties() ::
  [ {'cq_accountmanager_config_informnewaccount_mail', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_accountmanager_config_informnewpwd_mail', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_account_impl_account_management_servlet_properties() ->
    openapi_com_adobe_cq_account_impl_account_management_servlet_properties([]).

openapi_com_adobe_cq_account_impl_account_management_servlet_properties(Fields) ->
  Default = [ {'cq.accountmanager.config.informnewaccount.mail', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.accountmanager.config.informnewpwd.mail', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

