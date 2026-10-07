-module(openapi_com_adobe_cq_account_impl_account_management_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_account_impl_account_management_servlet_properties/0]).

-type openapi_com_adobe_cq_account_impl_account_management_servlet_properties() ::
    #{ 'cq_accountmanager_config_informnewaccount_mail' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_accountmanager_config_informnewpwd_mail' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_accountmanager_config_informnewaccount_mail' := CqAccountmanagerConfigInformnewaccountMail,
          'cq_accountmanager_config_informnewpwd_mail' := CqAccountmanagerConfigInformnewpwdMail
        }) ->
    #{ 'cq.accountmanager.config.informnewaccount.mail' => CqAccountmanagerConfigInformnewaccountMail,
       'cq.accountmanager.config.informnewpwd.mail' => CqAccountmanagerConfigInformnewpwdMail
     }.
