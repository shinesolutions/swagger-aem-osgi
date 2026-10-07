-module(openapi_com_adobe_cq_account_api_account_management_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_account_api_account_management_service_properties/0]).

-type openapi_com_adobe_cq_account_api_account_management_service_properties() ::
    #{ 'cq_accountmanager_token_validity_period' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_accountmanager_config_requestnewaccount_mail' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_accountmanager_config_requestnewpwd_mail' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_accountmanager_token_validity_period' := CqAccountmanagerTokenValidityPeriod,
          'cq_accountmanager_config_requestnewaccount_mail' := CqAccountmanagerConfigRequestnewaccountMail,
          'cq_accountmanager_config_requestnewpwd_mail' := CqAccountmanagerConfigRequestnewpwdMail
        }) ->
    #{ 'cq.accountmanager.token.validity.period' => CqAccountmanagerTokenValidityPeriod,
       'cq.accountmanager.config.requestnewaccount.mail' => CqAccountmanagerConfigRequestnewaccountMail,
       'cq.accountmanager.config.requestnewpwd.mail' => CqAccountmanagerConfigRequestnewpwdMail
     }.
