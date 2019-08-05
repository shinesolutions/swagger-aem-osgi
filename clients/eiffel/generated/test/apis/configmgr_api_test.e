note
    description: "API tests for CONFIGMGR_API"
    date: "$Date$"
    revision: "$Revision$"


class CONFIGMGR_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_adaptive_form_and_interactive_communication_web_channel_configuration
            -- 
            -- 
            --  
        local
            l_response: ADAPTIVE_FORM_AND_INTERACTIVE_COMMUNICATION_WEB_CHANNEL_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_show_placeholder: BOOLEAN
            l_maximum_cache_entries: INTEGER_32
            l_af_scripting_compatversion: STRING_32
            l_make_file_name_unique: BOOLEAN
            l_generating_compliant_data: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.adaptive_form_and_interactive_communication_web_channel_configuration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_show_placeholder, l_maximum_cache_entries, l_af_scripting_compatversion, l_make_file_name_unique, l_generating_compliant_data)
            assert ("not_implemented", False)
        end
    
    test_adaptive_form_and_interactive_communication_web_channel_theme_configur
            -- 
            -- 
            --  
        local
            l_response: ADAPTIVE_FORM_AND_INTERACTIVE_COMMUNICATION_WEB_CHANNEL_THEME_CONFIGUR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_font_list: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.adaptive_form_and_interactive_communication_web_channel_theme_configur(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_font_list)
            assert ("not_implemented", False)
        end
    
    test_analytics_component_query_cache_service
            -- 
            -- 
            --  
        local
            l_response: ANALYTICS_COMPONENT_QUERY_CACHE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_analytics_component_query_cache_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.analytics_component_query_cache_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_analytics_component_query_cache_size)
            assert ("not_implemented", False)
        end
    
    test_apache_sling_health_check_result_ht_ml_serializer
            -- 
            -- 
            --  
        local
            l_response: APACHE_SLING_HEALTH_CHECK_RESULT_HTML_SERIALIZER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_style_string: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.apache_sling_health_check_result_ht_ml_serializer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_style_string)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_aem_formsndocuments_config_ae_mforms_manager_configuration
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_AEM_FORMSNDOCUMENTS_CONFIG_AEM_FORMS_MANAGER_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_forms_manager_config_include_oo_tb_templates: BOOLEAN
            l_forms_manager_config_include_deprecated_templates: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_aem_formsndocuments_config_ae_mforms_manager_configuration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_forms_manager_config_include_oo_tb_templates, l_forms_manager_config_include_deprecated_templates)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_aem_transaction_core_impl_transaction_recorder
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_AEM_TRANSACTION_CORE_IMPL_TRANSACTION_RECORDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_is_transaction_recording_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_aem_transaction_core_impl_transaction_recorder(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_is_transaction_recording_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_AEM_UPGRADE_PRECHECKS_HC_IMPL_DEPRECATE_INDEXES_HC_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_name: STRING_32
            l_hc_tags: LIST [STRING_32]
            l_hc_mbean_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_name, l_hc_tags, l_hc_mbean_name)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_AEM_UPGRADE_PRECHECKS_HC_IMPL_REPLICATION_AGENTS_DISABLED_HC_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_name: STRING_32
            l_hc_tags: LIST [STRING_32]
            l_hc_mbean_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_name, l_hc_tags, l_hc_mbean_name)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_mbean_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_AEM_UPGRADE_PRECHECKS_MBEAN_IMPL_PRE_UPGRADE_TASKS_M_BEAN_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pre_upgrade_maintenance_tasks: LIST [STRING_32]
            l_pre_upgrade_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_mbean_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pre_upgrade_maintenance_tasks, l_pre_upgrade_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_AEM_UPGRADE_PRECHECKS_TASKS_IMPL_CONSISTENCY_CHECK_TASK_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_root_path: STRING_32
            l_fix_inconsistencies: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_root_path, l_fix_inconsistencies)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_account_api_account_management_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_ACCOUNT_API_ACCOUNT_MANAGEMENT_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_accountmanager_token_validity_period: INTEGER_32
            l_cq_accountmanager_config_requestnewaccount_mail: STRING_32
            l_cq_accountmanager_config_requestnewpwd_mail: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_account_api_account_management_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_accountmanager_token_validity_period, l_cq_accountmanager_config_requestnewaccount_mail, l_cq_accountmanager_config_requestnewpwd_mail)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_account_impl_account_management_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_ACCOUNT_IMPL_ACCOUNT_MANAGEMENT_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_accountmanager_config_informnewaccount_mail: STRING_32
            l_cq_accountmanager_config_informnewpwd_mail: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_account_impl_account_management_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_accountmanager_config_informnewaccount_mail, l_cq_accountmanager_config_informnewpwd_mail)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_address_impl_location_location_list_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_ADDRESS_IMPL_LOCATION_LOCATION_LIST_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_address_location_default_max_results: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_address_impl_location_location_list_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_address_location_default_max_results)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_audit_purge_dam
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_AUDIT_PURGE_DAM_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_auditlog_rule_name: STRING_32
            l_auditlog_rule_contentpath: STRING_32
            l_auditlog_rule_minimumage: INTEGER_32
            l_auditlog_rule_types: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_audit_purge_dam(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_auditlog_rule_name, l_auditlog_rule_contentpath, l_auditlog_rule_minimumage, l_auditlog_rule_types)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_audit_purge_pages
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_AUDIT_PURGE_PAGES_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_auditlog_rule_name: STRING_32
            l_auditlog_rule_contentpath: STRING_32
            l_auditlog_rule_minimumage: INTEGER_32
            l_auditlog_rule_types: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_audit_purge_pages(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_auditlog_rule_name, l_auditlog_rule_contentpath, l_auditlog_rule_minimumage, l_auditlog_rule_types)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_audit_purge_replication
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_AUDIT_PURGE_REPLICATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_auditlog_rule_name: STRING_32
            l_auditlog_rule_contentpath: STRING_32
            l_auditlog_rule_minimumage: INTEGER_32
            l_auditlog_rule_types: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_audit_purge_replication(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_auditlog_rule_name, l_auditlog_rule_contentpath, l_auditlog_rule_minimumage, l_auditlog_rule_types)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_cdn_rewriter_impl_aw_scloud_front_rewriter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_CDN_REWRITER_IMPL_AWS_CLOUD_FRONT_REWRITER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_keypair_id: STRING_32
            l_keypair_alias: STRING_32
            l_cdnrewriter_attributes: LIST [STRING_32]
            l_cdn_rewriter_distribution_domain: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_cdn_rewriter_impl_aw_scloud_front_rewriter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_keypair_id, l_keypair_alias, l_cdnrewriter_attributes, l_cdn_rewriter_distribution_domain)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_cdn_rewriter_impl_cd_nconfig_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_CDN_REWRITER_IMPL_CDN_CONFIG_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cdn_config_distribution_domain: STRING_32
            l_cdn_config_enable_rewriting: BOOLEAN
            l_cdn_config_path_prefixes: LIST [STRING_32]
            l_cdn_config_cdnttl: INTEGER_32
            l_cdn_config_application_protocol: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_cdn_rewriter_impl_cd_nconfig_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cdn_config_distribution_domain, l_cdn_config_enable_rewriting, l_cdn_config_path_prefixes, l_cdn_config_cdnttl, l_cdn_config_application_protocol)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_cdn_rewriter_impl_cd_nrewriter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_CDN_REWRITER_IMPL_CDN_REWRITER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_cdnrewriter_attributes: LIST [STRING_32]
            l_cdn_rewriter_distribution_domain: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_cdn_rewriter_impl_cd_nrewriter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_cdnrewriter_attributes, l_cdn_rewriter_distribution_domain)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_CLOUDCONFIG_CORE_IMPL_CONFIGURATION_REPLICATION_EVENT_HANDLE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_flush_agents: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_flush_agents)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_commerce_impl_asset_dynamic_image_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_COMMERCE_IMPL_ASSET_DYNAMIC_IMAGE_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_commerce_asset_handler_active: BOOLEAN
            l_cq_commerce_asset_handler_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_commerce_impl_asset_dynamic_image_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_commerce_asset_handler_active, l_cq_commerce_asset_handler_name)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_COMMERCE_IMPL_ASSET_PRODUCT_ASSET_HANDLER_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_commerce_asset_handler_fallback: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_commerce_asset_handler_fallback)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_commerce_impl_asset_static_image_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_COMMERCE_IMPL_ASSET_STATIC_IMAGE_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_commerce_asset_handler_active: BOOLEAN
            l_cq_commerce_asset_handler_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_commerce_impl_asset_static_image_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_commerce_asset_handler_active, l_cq_commerce_asset_handler_name)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_commerce_impl_asset_video_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_COMMERCE_IMPL_ASSET_VIDEO_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_commerce_asset_handler_active: BOOLEAN
            l_cq_commerce_asset_handler_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_commerce_impl_asset_video_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_commerce_asset_handler_active, l_cq_commerce_asset_handler_name)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_commerce_impl_promotion_promotion_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_COMMERCE_IMPL_PROMOTION_PROMOTION_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_commerce_promotion_root: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_commerce_impl_promotion_promotion_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_commerce_promotion_root)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_COMMERCE_PIM_IMPL_CATALOGGENERATOR_CATALOG_GENERATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_commerce_cataloggenerator_bucketsize: INTEGER_32
            l_cq_commerce_cataloggenerator_bucketname: STRING_32
            l_cq_commerce_cataloggenerator_excludedtemplateproperties: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_commerce_cataloggenerator_bucketsize, l_cq_commerce_cataloggenerator_bucketname, l_cq_commerce_cataloggenerator_excludedtemplateproperties)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_commerce_pim_impl_page_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_COMMERCE_PIM_IMPL_PAGE_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_commerce_pageeventlistener_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_commerce_pim_impl_page_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_commerce_pageeventlistener_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_COMMERCE_PIM_IMPL_PRODUCTFEED_PRODUCT_FEED_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_feed_generator_algorithm: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_feed_generator_algorithm)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_CONTENTINSIGHT_IMPL_REPORTING_SERVICES_SETTINGS_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_reportingservices_url: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_contentinsight_impl_reporting_services_settings_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_reportingservices_url)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_CONTENTINSIGHT_IMPL_SERVLETS_BRIGHT_EDGE_PROXY_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_brightedge_url: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_brightedge_url)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_CONTENTINSIGHT_IMPL_SERVLETS_REPORTING_SERVICES_PROXY_SERVLE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_reportingservices_proxy_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_reportingservices_proxy_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_cfm_impl_component_component_config_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_CFM_IMPL_COMPONENT_COMPONENT_CONFIG_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_dam_cfm_component_resource_type: STRING_32
            l_dam_cfm_component_file_reference_prop: STRING_32
            l_dam_cfm_component_elements_prop: STRING_32
            l_dam_cfm_component_variation_prop: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_cfm_impl_component_component_config_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_dam_cfm_component_resource_type, l_dam_cfm_component_file_reference_prop, l_dam_cfm_component_elements_prop, l_dam_cfm_component_variation_prop)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_CFM_IMPL_CONF_FEATURE_CONFIG_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_dam_cfm_resource_types: LIST [STRING_32]
            l_dam_cfm_reference_properties: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_cfm_impl_conf_feature_config_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_dam_cfm_resource_types, l_dam_cfm_reference_properties)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_CFM_IMPL_CONTENT_REWRITER_ASSET_PROCESSOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pipeline_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pipeline_type)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_CFM_IMPL_CONTENT_REWRITER_PAR_RANGE_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pipeline_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pipeline_type)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_CFM_IMPL_CONTENT_REWRITER_PAYLOAD_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pipeline_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pipeline_type)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_dm_process_image_ptiff_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_DM_PROCESS_IMAGE_P_TIFF_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_memory: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_dm_process_image_ptiff_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_memory)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_IPS_IMPL_REPLICATION_TRIGGER_REPLICATE_ON_MODIFY_WORKER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_dmreplicateonmodify_enabled: BOOLEAN
            l_dmreplicateonmodify_forcesyncdeletes: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_dmreplicateonmodify_enabled, l_dmreplicateonmodify_forcesyncdeletes)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_mac_sync_helper_impl_ma_csync_client_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_MAC_SYNC_HELPER_IMPL_MAC_SYNC_CLIENT_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_dam_mac_sync_client_so_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_mac_sync_helper_impl_ma_csync_client_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_dam_mac_sync_client_so_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_mac_sync_impl_da_msync_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_MAC_SYNC_IMPL_DAM_SYNC_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths: LIST [STRING_32]
            l_com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions: BOOLEAN
            l_com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms: INTEGER_32
            l_com_adobe_cq_dam_mac_sync_damsyncservice_platform: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_mac_sync_impl_da_msync_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths, l_com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions, l_com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms, l_com_adobe_cq_dam_mac_sync_damsyncservice_platform)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_PROCESSOR_NUI_IMPL_NUI_ASSET_PROCESSOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_nui_enabled: BOOLEAN
            l_nui_service_url: STRING_32
            l_nui_api_key: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_processor_nui_impl_nui_asset_processor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_nui_enabled, l_nui_service_url, l_nui_api_key)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_s7imaging_impl_is_image_server_component
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_S7IMAGING_IMPL_IS_IMAGE_SERVER_COMPONENT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_tcp_port: STRING_32
            l_allow_remote_access: BOOLEAN
            l_max_render_rgn_pixels: STRING_32
            l_max_message_size: STRING_32
            l_random_access_url_timeout: INTEGER_32
            l_worker_threads: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_s7imaging_impl_is_image_server_component(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_tcp_port, l_allow_remote_access, l_max_render_rgn_pixels, l_max_message_size, l_random_access_url_timeout, l_worker_threads)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_S7IMAGING_IMPL_PS_PLATFORM_SERVER_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cache_enable: BOOLEAN
            l_cache_root_paths: LIST [STRING_32]
            l_cache_max_size: INTEGER_32
            l_cache_max_entries: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cache_enable, l_cache_root_paths, l_cache_max_size, l_cache_max_entries)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_webdav_impl_io_asset_io_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_WEBDAV_IMPL_IO_ASSET_IO_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_path_prefix: STRING_32
            l_create_version: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_webdav_impl_io_asset_io_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_path_prefix, l_create_version)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_WEBDAV_IMPL_IO_DAM_WEBDAV_VERSION_LINKING_JOB_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_webdav_version_linking_enable: BOOLEAN
            l_cq_dam_webdav_version_linking_scheduler_period: INTEGER_32
            l_cq_dam_webdav_version_linking_staging_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_webdav_version_linking_enable, l_cq_dam_webdav_version_linking_scheduler_period, l_cq_dam_webdav_version_linking_staging_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dam_webdav_impl_io_special_files_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DAM_WEBDAV_IMPL_IO_SPECIAL_FILES_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_day_cq_dam_core_impl_io__special_files_handler_filepatters: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dam_webdav_impl_io_special_files_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_day_cq_dam_core_impl_io__special_files_handler_filepatters)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_deserfw_impl_deserialization_firewall_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DESERFW_IMPL_DESERIALIZATION_FIREWALL_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_firewall_deserialization_whitelist: LIST [STRING_32]
            l_firewall_deserialization_blacklist: LIST [STRING_32]
            l_firewall_deserialization_diagnostics: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_deserfw_impl_deserialization_firewall_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_firewall_deserialization_whitelist, l_firewall_deserialization_blacklist, l_firewall_deserialization_diagnostics)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dtm_impl_service_dt_mweb_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DTM_IMPL_SERVICE_DTM_WEB_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_connection_timeout: INTEGER_32
            l_socket_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dtm_impl_service_dt_mweb_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_connection_timeout, l_socket_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dtm_impl_servlets_dt_mdeploy_hook_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DTM_IMPL_SERVLETS_DTM_DEPLOY_HOOK_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_dtm_staging_ip_whitelist: LIST [STRING_32]
            l_dtm_production_ip_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dtm_impl_servlets_dt_mdeploy_hook_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_dtm_staging_ip_whitelist, l_dtm_production_ip_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_dtm_reactor_impl_service_web_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_DTM_REACTOR_IMPL_SERVICE_WEB_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_endpoint_uri: STRING_32
            l_connection_timeout: INTEGER_32
            l_socket_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_dtm_reactor_impl_service_web_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_endpoint_uri, l_connection_timeout, l_socket_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_experiencelog_impl_experience_log_config_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_EXPERIENCELOG_IMPL_EXPERIENCE_LOG_CONFIG_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_disabled_for_groups: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_experiencelog_impl_experience_log_config_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_disabled_for_groups)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_hc_content_packages_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_HC_CONTENT_PACKAGES_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_name: STRING_32
            l_hc_tags: LIST [STRING_32]
            l_hc_mbean_name: STRING_32
            l_package_names: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_hc_content_packages_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_name, l_hc_tags, l_hc_mbean_name, l_package_names)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_history_impl_history_request_filter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_HISTORY_IMPL_HISTORY_REQUEST_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_history_request_filter_excluded_selectors: LIST [STRING_32]
            l_history_request_filter_excluded_extensions: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_history_impl_history_request_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_history_request_filter_excluded_selectors, l_history_request_filter_excluded_extensions)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_history_impl_history_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_HISTORY_IMPL_HISTORY_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_history_service_resource_types: LIST [STRING_32]
            l_history_service_path_filter: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_history_impl_history_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_history_service_resource_types, l_history_service_path_filter)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_inbox_impl_typeprovider_item_type_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_INBOX_IMPL_TYPEPROVIDER_ITEM_TYPE_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_inbox_impl_typeprovider_registrypaths: LIST [STRING_32]
            l_inbox_impl_typeprovider_legacypaths: LIST [STRING_32]
            l_inbox_impl_typeprovider_defaulturl_failureitem: STRING_32
            l_inbox_impl_typeprovider_defaulturl_workitem: STRING_32
            l_inbox_impl_typeprovider_defaulturl_task: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_inbox_impl_typeprovider_item_type_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_inbox_impl_typeprovider_registrypaths, l_inbox_impl_typeprovider_legacypaths, l_inbox_impl_typeprovider_defaulturl_failureitem, l_inbox_impl_typeprovider_defaulturl_workitem, l_inbox_impl_typeprovider_defaulturl_task)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_projects_impl_servlet_project_image_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_PROJECTS_IMPL_SERVLET_PROJECT_IMAGE_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_image_quality: STRING_32
            l_image_supported_resolutions: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_projects_impl_servlet_project_image_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_image_quality, l_image_supported_resolutions)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_projects_purge_scheduler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_PROJECTS_PURGE_SCHEDULER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduledpurge_name: STRING_32
            l_scheduledpurge_purge_active: BOOLEAN
            l_scheduledpurge_templates: LIST [STRING_32]
            l_scheduledpurge_purge_groups: BOOLEAN
            l_scheduledpurge_purge_assets: BOOLEAN
            l_scheduledpurge_terminate_running_workflows: BOOLEAN
            l_scheduledpurge_daysold: INTEGER_32
            l_scheduledpurge_save_threshold: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_projects_purge_scheduler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduledpurge_name, l_scheduledpurge_purge_active, l_scheduledpurge_templates, l_scheduledpurge_purge_groups, l_scheduledpurge_purge_assets, l_scheduledpurge_terminate_running_workflows, l_scheduledpurge_daysold, l_scheduledpurge_save_threshold)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCHEDULED_EXPORTER_IMPL_SCHEDULED_EXPORTER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_include_paths: LIST [STRING_32]
            l_exporter_user: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_include_paths, l_exporter_user)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_ANALYTICS_IMPL_SCREENS_ANALYTICS_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_cq_screens_analytics_impl_url: STRING_32
            l_com_adobe_cq_screens_analytics_impl_apikey: STRING_32
            l_com_adobe_cq_screens_analytics_impl_project: STRING_32
            l_com_adobe_cq_screens_analytics_impl_environment: STRING_32
            l_com_adobe_cq_screens_analytics_impl_send_frequency: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_cq_screens_analytics_impl_url, l_com_adobe_cq_screens_analytics_impl_apikey, l_com_adobe_cq_screens_analytics_impl_project, l_com_adobe_cq_screens_analytics_impl_environment, l_com_adobe_cq_screens_analytics_impl_send_frequency)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_device_impl_device_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_DEVICE_IMPL_DEVICE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_aem_screens_player_pingfrequency: INTEGER_32
            l_com_adobe_aem_screens_device_pasword_specialchars: STRING_32
            l_com_adobe_aem_screens_device_pasword_minlowercasechars: INTEGER_32
            l_com_adobe_aem_screens_device_pasword_minuppercasechars: INTEGER_32
            l_com_adobe_aem_screens_device_pasword_minnumberchars: INTEGER_32
            l_com_adobe_aem_screens_device_pasword_minspecialchars: INTEGER_32
            l_com_adobe_aem_screens_device_pasword_minlength: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_device_impl_device_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_aem_screens_player_pingfrequency, l_com_adobe_aem_screens_device_pasword_specialchars, l_com_adobe_aem_screens_device_pasword_minlowercasechars, l_com_adobe_aem_screens_device_pasword_minuppercasechars, l_com_adobe_aem_screens_device_pasword_minnumberchars, l_com_adobe_aem_screens_device_pasword_minspecialchars, l_com_adobe_aem_screens_device_pasword_minlength)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_device_registration_impl_registration_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_DEVICE_REGISTRATION_IMPL_REGISTRATION_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_device_registration_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_device_registration_impl_registration_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_device_registration_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_impl_handler_channels_update_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_IMPL_HANDLER_CHANNELS_UPDATE_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_pagesupdatehandler_imageresourcetypes: LIST [STRING_32]
            l_cq_pagesupdatehandler_productresourcetypes: LIST [STRING_32]
            l_cq_pagesupdatehandler_videoresourcetypes: LIST [STRING_32]
            l_cq_pagesupdatehandler_dynamicsequenceresourcetypes: LIST [STRING_32]
            l_cq_pagesupdatehandler_previewmodepaths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_impl_handler_channels_update_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_pagesupdatehandler_imageresourcetypes, l_cq_pagesupdatehandler_productresourcetypes, l_cq_pagesupdatehandler_videoresourcetypes, l_cq_pagesupdatehandler_dynamicsequenceresourcetypes, l_cq_pagesupdatehandler_previewmodepaths)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_IMPL_JOBS_DISTRIBUTED_DEVICES_STATI_UPDATE_JOB_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_IMPL_REMOTE_IMPL_DISTRIBUTED_HTTP_CLIENT_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_aem_screens_impl_remote_request_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_aem_screens_impl_remote_request_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_impl_screens_channel_post_processor
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_IMPL_SCREENS_CHANNEL_POST_PROCESSOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_screens_channels_properties_to_remove: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_impl_screens_channel_post_processor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_screens_channels_properties_to_remove)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_MONITORING_IMPL_SCREENS_MONITORING_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_project_path: LIST [STRING_32]
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_schedule_frequency: STRING_32
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_ping_timeout: INTEGER_32
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_recipients: STRING_32
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_smtpserver: STRING_32
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_smtpport: INTEGER_32
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_usetls: BOOLEAN
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_username: STRING_32
            l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_password: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_project_path, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_schedule_frequency, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_ping_timeout, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_recipients, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_smtpserver, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_smtpport, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_usetls, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_username, l_com_adobe_cq_screens_monitoring_impl__screens_monitoring_service_impl_password)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_mq_activemq_impl_artemis_jm_sprovider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_MQ_ACTIVEMQ_IMPL_ARTEMIS_JMS_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_global_size: INTEGER_32
            l_max_disk_usage: INTEGER_32
            l_persistence_enabled: BOOLEAN
            l_thread_pool_max_size: INTEGER_32
            l_scheduled_thread_pool_max_size: INTEGER_32
            l_graceful_shutdown_timeout: INTEGER_32
            l_queues: LIST [STRING_32]
            l_topics: LIST [STRING_32]
            l_addresses_max_delivery_attempts: INTEGER_32
            l_addresses_expiry_delay: INTEGER_32
            l_addresses_address_full_message_policy: STRING_32
            l_addresses_max_size_bytes: INTEGER_32
            l_addresses_page_size_bytes: INTEGER_32
            l_addresses_page_cache_max_size: INTEGER_32
            l_cluster_user: STRING_32
            l_cluster_password: STRING_32
            l_cluster_call_timeout: INTEGER_32
            l_cluster_call_failover_timeout: INTEGER_32
            l_cluster_client_failure_check_period: INTEGER_32
            l_cluster_notification_attempts: INTEGER_32
            l_cluster_notification_interval: INTEGER_32
            l_id_cache_size: INTEGER_32
            l_cluster_confirmation_window_size: INTEGER_32
            l_cluster_connection_ttl: INTEGER_32
            l_cluster_duplicate_detection: BOOLEAN
            l_cluster_initial_connect_attempts: INTEGER_32
            l_cluster_max_retry_interval: INTEGER_32
            l_cluster_min_large_message_size: INTEGER_32
            l_cluster_producer_window_size: INTEGER_32
            l_cluster_reconnect_attempts: INTEGER_32
            l_cluster_retry_interval: INTEGER_32
            l_cluster_retry_interval_multiplier: REAL_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_mq_activemq_impl_artemis_jm_sprovider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_global_size, l_max_disk_usage, l_persistence_enabled, l_thread_pool_max_size, l_scheduled_thread_pool_max_size, l_graceful_shutdown_timeout, l_queues, l_topics, l_addresses_max_delivery_attempts, l_addresses_expiry_delay, l_addresses_address_full_message_policy, l_addresses_max_size_bytes, l_addresses_page_size_bytes, l_addresses_page_cache_max_size, l_cluster_user, l_cluster_password, l_cluster_call_timeout, l_cluster_call_failover_timeout, l_cluster_client_failure_check_period, l_cluster_notification_attempts, l_cluster_notification_interval, l_id_cache_size, l_cluster_confirmation_window_size, l_cluster_connection_ttl, l_cluster_duplicate_detection, l_cluster_initial_connect_attempts, l_cluster_max_retry_interval, l_cluster_min_large_message_size, l_cluster_producer_window_size, l_cluster_reconnect_attempts, l_cluster_retry_interval, l_cluster_retry_interval_multiplier)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_OFFLINECONTENT_IMPL_BULK_OFFLINE_UPDATE_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_cq_screens_offlinecontent_impl__bulk_offline_update_service_impl_project_path: LIST [STRING_32]
            l_com_adobe_cq_screens_offlinecontent_impl__bulk_offline_update_service_impl_schedule_frequency: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_cq_screens_offlinecontent_impl__bulk_offline_update_service_impl_project_path, l_com_adobe_cq_screens_offlinecontent_impl__bulk_offline_update_service_impl_schedule_frequency)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_OFFLINECONTENT_IMPL_OFFLINE_CONTENT_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_disable_smart_sync: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_disable_smart_sync)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SCREENS_SEGMENTATION_IMPL_SEGMENTATION_FEATURE_FLAG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enable_data_triggered_content: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enable_data_triggered_content)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SECURITY_HC_BUNDLES_IMPL_HTML_LIBRARY_MANAGER_CONFIG_HEALTH_CH_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SECURITY_HC_BUNDLES_IMPL_WCM_FILTER_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SECURITY_HC_DISPATCHER_IMPL_DISPATCHER_ACCESS_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
            l_dispatcher_address: STRING_32
            l_dispatcher_filter_allowed: LIST [STRING_32]
            l_dispatcher_filter_blocked: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags, l_dispatcher_address, l_dispatcher_filter_allowed, l_dispatcher_filter_blocked)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_security_hc_packages_impl_example_content_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SECURITY_HC_PACKAGES_IMPL_EXAMPLE_CONTENT_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_security_hc_packages_impl_example_content_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SECURITY_HC_WEBSERVER_IMPL_CLICKJACKING_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
            l_webserver_address: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags, l_webserver_address)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_accountverification_impl_account_management_config_im
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ACCOUNTVERIFICATION_IMPL_ACCOUNT_MANAGEMENT_CONFIG_IM_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enable: BOOLEAN
            l_ttl1: INTEGER_32
            l_ttl2: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_accountverification_impl_account_management_config_im(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enable, l_ttl1, l_ttl2)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_CLIENT_IMPL_SOCIAL_ACTIVITY_COMPONEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_activitystreams_client_impl_social_activity_componen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_CLIENT_IMPL_SOCIAL_ACTIVITY_STREAM_CO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_LISTENER_IMPL_EVENT_LISTENER_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_topics: STRING_32
            l_event_filter: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_topics, l_event_filter)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_LISTENER_IMPL_MODERATION_EVENT_EXTEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_accepted: BOOLEAN
            l_ranked: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_accepted, l_ranked)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_LISTENER_IMPL_RATING_EVENT_ACTIVITY_S_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_ranking: INTEGER_32
            l_enable: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_ranking, l_enable)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ACTIVITYSTREAMS_LISTENER_IMPL_RESOURCE_ACTIVITY_STRE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_stream_path: STRING_32
            l_stream_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_stream_path, l_stream_name)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_CALENDAR_CLIENT_ENDPOINTS_IMPL_CALENDAR_OPERATIONS_I_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_retry: INTEGER_32
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_retry, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_CALENDAR_CLIENT_OPERATIONEXTENSIONS_EVENT_ATTACHMEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_attachment_type_blacklist: STRING_32
            l_extension_order: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_calendar_client_operationextensions_event_attachmen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_attachment_type_blacklist, l_extension_order)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_calendar_servlets_time_zone_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_CALENDAR_SERVLETS_TIME_ZONE_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_timezones_expirytime: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_calendar_servlets_time_zone_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_timezones_expirytime)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_ENDPOINTS_IMPL_COMMENT_DELETE_EVENT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_ranking)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_ENDPOINTS_IMPL_COMMENT_OPERATION_SE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_ENDPOINTS_IMPL_TRANSLATION_OPERATI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_LISTING_IMPL_SEARCH_COMMENT_SOCIAL_C_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_num_user_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_num_user_limit)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_COMMENTS_SCHEDULER_IMPL_SEARCH_SCHEDULED_POS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enable_scheduled_posts_search: BOOLEAN
            l_number_of_minutes: INTEGER_32
            l_max_search_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enable_scheduled_posts_search, l_number_of_minutes, l_max_search_limit)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_cors_co_rs_authentication_filter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_CORS_CORS_AUTHENTICATION_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cors_enabling: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_cors_co_rs_authentication_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cors_enabling)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_ANDROID_EMAIL_CLIENT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority_order: INTEGER_32
            l_reply_email_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority_order, l_reply_email_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_COMMENT_EMAIL_BUILDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_context_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_context_path)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_COMMENT_EMAIL_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_topics: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_topics)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_CUSTOM_EMAIL_CLIENT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority_order: INTEGER_32
            l_reply_email_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority_order, l_reply_email_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_EMAIL_QUOTED_TEXT_PATTERNS_IMP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pattern_time: STRING_32
            l_pattern_newline: STRING_32
            l_pattern_day_of_month: STRING_32
            l_pattern_month: STRING_32
            l_pattern_year: STRING_32
            l_pattern_date: STRING_32
            l_pattern_date_time: STRING_32
            l_pattern_email: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pattern_time, l_pattern_newline, l_pattern_day_of_month, l_pattern_month, l_pattern_year, l_pattern_date, l_pattern_date_time, l_pattern_email)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_EMAIL_REPLY_CONFIGURATION_IMP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_email_name: STRING_32
            l_email_create_post_from_reply: BOOLEAN
            l_email_add_comment_id_to: STRING_32
            l_email_subject_maximum_length: INTEGER_32
            l_email_reply_to_address: STRING_32
            l_email_reply_to_delimiter: STRING_32
            l_email_tracker_id_prefix_in_subject: STRING_32
            l_email_tracker_id_prefix_in_body: STRING_32
            l_email_as_ht_ml: BOOLEAN
            l_email_default_user_name: STRING_32
            l_email_templates_root_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_email_name, l_email_create_post_from_reply, l_email_add_comment_id_to, l_email_subject_maximum_length, l_email_reply_to_address, l_email_reply_to_delimiter, l_email_tracker_id_prefix_in_subject, l_email_tracker_id_prefix_in_body, l_email_as_ht_ml, l_email_default_user_name, l_email_templates_root_path)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_EMAIL_REPLY_IMPORTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_connect_protocol: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_email_reply_importer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_connect_protocol)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_GMAIL_EMAIL_CLIENT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority_order: INTEGER_32
            l_reply_email_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority_order, l_reply_email_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_io_semail_client_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_IOS_EMAIL_CLIENT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority_order: INTEGER_32
            l_reply_email_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_io_semail_client_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority_order, l_reply_email_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_MACMAIL_EMAIL_CLIENT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority_order: INTEGER_32
            l_reply_email_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority_order, l_reply_email_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_OUT_LOOK_EMAIL_CLIENT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority_order: INTEGER_32
            l_reply_email_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority_order, l_reply_email_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_UNKNOWN_EMAIL_CLIENT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_reply_email_patterns: LIST [STRING_32]
            l_priority_order: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_reply_email_patterns, l_priority_order)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_YAHOO_EMAIL_CLIENT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority_order: INTEGER_32
            l_reply_email_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority_order, l_reply_email_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ug_cimage_upload
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_MAINTAINANCE_IMPL_DELETE_TEMP_UGC_IMAGE_UPLOAD_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_number_of_days: INTEGER_32
            l_age_of_file: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_maintainance_impl_delete_temp_ug_cimage_upload(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_number_of_days, l_age_of_file)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_ugclimiter_impl_ug_climiter_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_UGCLIMITER_IMPL_UGC_LIMITER_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_topics: STRING_32
            l_event_filter: STRING_32
            l_verbs: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_ugclimiter_impl_ug_climiter_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_topics, l_event_filter, l_verbs)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ug_climit
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_COMMONS_UGCLIMITSCONFIG_IMPL_COMMUNITY_USER_UGC_LIMIT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enable: BOOLEAN
            l_u_gc_limit: INTEGER_32
            l_ugc_limit_duration: INTEGER_32
            l_domains: LIST [STRING_32]
            l_to_list: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ug_climit(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enable, l_u_gc_limit, l_ugc_limit_duration, l_domains, l_to_list)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_CONNECT_OAUTH_IMPL_FACEBOOK_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
            l_oauth_cloud_config_root: STRING_32
            l_provider_config_root: STRING_32
            l_provider_config_create_tags_enabled: BOOLEAN
            l_provider_config_user_folder: STRING_32
            l_provider_config_facebook_fetch_fields: BOOLEAN
            l_provider_config_facebook_fields: LIST [STRING_32]
            l_provider_config_refresh_userdata_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id, l_oauth_cloud_config_root, l_provider_config_root, l_provider_config_create_tags_enabled, l_provider_config_user_folder, l_provider_config_facebook_fetch_fields, l_provider_config_facebook_fields, l_provider_config_refresh_userdata_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_connect_oauth_impl_social_oauth_authentication_handle
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_CONNECT_OAUTH_IMPL_SOCIAL_O_AUTH_AUTHENTICATION_HANDLE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: LIST [STRING_32]
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_connect_oauth_impl_social_oauth_authentication_handle(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_connect_oauth_impl_social_oauth_user_profile_mapper
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_CONNECT_OAUTH_IMPL_SOCIAL_O_AUTH_USER_PROFILE_MAPPER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_facebook: LIST [STRING_32]
            l_twitter: LIST [STRING_32]
            l_provider_config_user_folder: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_connect_oauth_impl_social_oauth_user_profile_mapper(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_facebook, l_twitter, l_provider_config_user_folder)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_CONNECT_OAUTH_IMPL_TWITTER_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
            l_oauth_cloud_config_root: STRING_32
            l_provider_config_root: STRING_32
            l_provider_config_user_folder: STRING_32
            l_provider_config_twitter_enable_params: BOOLEAN
            l_provider_config_twitter_params: LIST [STRING_32]
            l_provider_config_refresh_userdata_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id, l_oauth_cloud_config_root, l_provider_config_root, l_provider_config_user_folder, l_provider_config_twitter_enable_params, l_provider_config_twitter_params, l_provider_config_refresh_userdata_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_CONTENT_FRAGMENTS_SERVICES_IMPL_COMMUNITIES_FRAGMEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_social_content_fragments_services_enabled: BOOLEAN
            l_cq_social_content_fragments_services_wait_time_seconds: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_content_fragments_services_impl_communities_fragmen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_social_content_fragments_services_enabled, l_cq_social_content_fragments_services_wait_time_seconds)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_DATASTORE_AS_IMPL_AS_RESOURCE_PROVIDER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_version_id: STRING_32
            l_cache_on: BOOLEAN
            l_concurrency_level: INTEGER_32
            l_cache_start_size: INTEGER_32
            l_cache_ttl: INTEGER_32
            l_cache_size: INTEGER_32
            l_time_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_version_id, l_cache_on, l_concurrency_level, l_cache_start_size, l_cache_ttl, l_cache_size, l_time_limit)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_DATASTORE_OP_IMPL_SOCIAL_MS_RESOURCE_PROVIDER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_solr_zk_timeout: STRING_32
            l_solr_commit: STRING_32
            l_cache_on: BOOLEAN
            l_concurrency_level: INTEGER_32
            l_cache_start_size: INTEGER_32
            l_cache_ttl: INTEGER_32
            l_cache_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_solr_zk_timeout, l_solr_commit, l_cache_on, l_concurrency_level, l_cache_start_size, l_cache_ttl, l_cache_size)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_datastore_rdb_impl_social_rd_bresource_provider_factor
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_DATASTORE_RDB_IMPL_SOCIAL_RDB_RESOURCE_PROVIDER_FACTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_solr_zk_timeout: STRING_32
            l_solr_commit: STRING_32
            l_cache_on: BOOLEAN
            l_concurrency_level: INTEGER_32
            l_cache_start_size: INTEGER_32
            l_cache_ttl: INTEGER_32
            l_cache_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_datastore_rdb_impl_social_rd_bresource_provider_factor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_solr_zk_timeout, l_solr_commit, l_cache_on, l_concurrency_level, l_cache_start_size, l_cache_ttl, l_cache_size)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ENABLEMENT_ADAPTORS_ENABLEMENT_LEARNING_PATH_ADAPTOR_F_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_is_member_check: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_is_member_check)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ENABLEMENT_ADAPTORS_ENABLEMENT_RESOURCE_ADAPTOR_FACTO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_is_member_check: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_is_member_check)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ENABLEMENT_LEARNINGPATH_ENDPOINTS_IMPL_ENABLEMENT_L_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ENABLEMENT_RESOURCE_ENDPOINTS_IMPL_ENABLEMENT_RESOU_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_enablement_services_impl_author_marker_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_ENABLEMENT_SERVICES_IMPL_AUTHOR_MARKER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_enablement_services_impl_author_marker_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_ENDPOINTS_FILELIBRARY_DOWNLOAD_GE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_selectors: STRING_32
            l_sling_servlet_extensions: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_selectors, l_sling_servlet_extensions)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_FILELIBRARY_CLIENT_ENDPOINTS_IMPL_FILE_LIBRARY_OPERA_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_FORUM_CLIENT_ENDPOINTS_IMPL_FORUM_OPERATIONS_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_forum_dispatcher_impl_flush_operations
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_FORUM_DISPATCHER_IMPL_FLUSH_OPERATIONS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_extension_order: INTEGER_32
            l_flush_forumontopic: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_forum_dispatcher_impl_flush_operations(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_extension_order, l_flush_forumontopic)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_group_client_impl_community_group_collection_componen
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_GROUP_CLIENT_IMPL_COMMUNITY_GROUP_COLLECTION_COMPONEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_group_listing_pagination_enable: BOOLEAN
            l_group_listing_lazyloading_enable: BOOLEAN
            l_page_size: INTEGER_32
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_group_client_impl_community_group_collection_componen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_group_listing_pagination_enable, l_group_listing_lazyloading_enable, l_page_size, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_group_impl_group_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_GROUP_IMPL_GROUP_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_wait_time: INTEGER_32
            l_min_wait_between_retries: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_group_impl_group_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_wait_time, l_min_wait_between_retries)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_handlebars_guava_template_cache_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_HANDLEBARS_GUAVA_TEMPLATE_CACHE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_parameter_guava_cache_enabled: BOOLEAN
            l_parameter_guava_cache_params: STRING_32
            l_parameter_guava_cache_reload: BOOLEAN
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_handlebars_guava_template_cache_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_parameter_guava_cache_enabled, l_parameter_guava_cache_params, l_parameter_guava_cache_reload, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_IDEATION_CLIENT_ENDPOINTS_IMPL_IDEATION_OPERATIONS_S_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_JOURNAL_CLIENT_ENDPOINTS_IMPL_JOURNAL_OPERATIONS_SER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_MEMBERS_ENDPOINTS_IMPL_COMMUNITY_MEMBER_GROUP_PROFILE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_members_endpoints_impl_community_member_group_profile(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_MEMBERS_ENDPOINTS_IMPL_COMMUNITY_MEMBER_USER_PROFILE_O_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_members_impl_community_member_group_profile_component_f
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_MEMBERS_IMPL_COMMUNITY_MEMBER_GROUP_PROFILE_COMPONENT_F_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_everyone_limit: INTEGER_32
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_members_impl_community_member_group_profile_component_f(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_everyone_limit, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_MESSAGING_CLIENT_ENDPOINTS_IMPL_MESSAGING_OPERATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_message_properties: LIST [STRING_32]
            l_message_box_size_limit: INTEGER_32
            l_message_count_limit: INTEGER_32
            l_notify_failure: BOOLEAN
            l_failure_message_from: STRING_32
            l_failure_template_path: STRING_32
            l_max_retries: INTEGER_32
            l_min_wait_between_retries: INTEGER_32
            l_count_update_pool_size: INTEGER_32
            l_inbox_path: STRING_32
            l_sentitems_path: STRING_32
            l_support_attachments: BOOLEAN
            l_support_group_messaging: BOOLEAN
            l_max_total_recipients: INTEGER_32
            l_batch_size: INTEGER_32
            l_max_total_attachment_size: INTEGER_32
            l_attachment_type_blacklist: LIST [STRING_32]
            l_allowed_attachment_types: LIST [STRING_32]
            l_service_selector: STRING_32
            l_field_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_message_properties, l_message_box_size_limit, l_message_count_limit, l_notify_failure, l_failure_message_from, l_failure_template_path, l_max_retries, l_min_wait_between_retries, l_count_update_pool_size, l_inbox_path, l_sentitems_path, l_support_attachments, l_support_group_messaging, l_max_total_recipients, l_batch_size, l_max_total_attachment_size, l_attachment_type_blacklist, l_allowed_attachment_types, l_service_selector, l_field_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_FILTER_GROUP_SOCIAL_COMPONEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_resource_type_filters: LIST [STRING_32]
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_resource_type_filters, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_MODERATION_DASHBOARD_SOCIAL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_API_USER_DETAILS_SOCIAL_COMPONEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_MODERATION_DASHBOARD_INTERNAL_IMPL_FILTER_GROUP_SOCI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_resource_type_filters: LIST [STRING_32]
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_resource_type_filters, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_notifications_impl_mentions_router
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_IMPL_MENTIONS_ROUTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_topics: STRING_32
            l_event_filter: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_notifications_impl_mentions_router(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_topics, l_event_filter)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_notifications_impl_notification_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_IMPL_NOTIFICATION_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_unread_notification_count: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_notifications_impl_notification_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_unread_notification_count)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_notifications_impl_notifications_router
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_NOTIFICATIONS_IMPL_NOTIFICATIONS_ROUTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_topics: STRING_32
            l_event_filter: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_notifications_impl_notifications_router(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_topics, l_event_filter)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_QNA_CLIENT_ENDPOINTS_IMPL_QNA_FORUM_OPERATIONS_SERVIC_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_SERVICES_IMPL_ANALYTICS_REPORT_I_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_social_reporting_analytics_polling_importer_interval: INTEGER_32
            l_cq_social_reporting_analytics_polling_importer_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_social_reporting_analytics_polling_importer_interval, l_cq_social_reporting_analytics_polling_importer_page_size)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_SERVICES_IMPL_ANALYTICS_REPORT_M_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_report_fetch_delay: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_report_fetch_delay)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_REPORTING_ANALYTICS_SERVICES_IMPL_SITE_TREND_REPORT_S_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_social_console_analytics_sites_mapping: LIST [STRING_32]
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_social_console_analytics_sites_mapping, l_priority)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_REVIEW_CLIENT_ENDPOINTS_IMPL_REVIEW_OPERATIONS_SERVI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SCF_CORE_OPERATIONS_IMPL_SOCIAL_OPERATIONS_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_selectors: STRING_32
            l_sling_servlet_extensions: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_selectors, l_sling_servlet_extensions)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SCF_ENDPOINTS_IMPL_DEFAULT_SOCIAL_GET_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_selectors: LIST [STRING_32]
            l_sling_servlet_extensions: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_selectors, l_sling_servlet_extensions)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_scoring_impl_scoring_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SCORING_IMPL_SCORING_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_topics: STRING_32
            l_event_filter: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_scoring_impl_scoring_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_topics, l_event_filter)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SERVICEUSERS_INTERNAL_IMPL_SERVICE_USER_WRAPPER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enable_fallback: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enable_fallback)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_site_endpoints_impl_site_operation_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SITE_ENDPOINTS_IMPL_SITE_OPERATION_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_field_whitelist: LIST [STRING_32]
            l_site_path_filters: LIST [STRING_32]
            l_site_package_group: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_site_endpoints_impl_site_operation_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_field_whitelist, l_site_path_filters, l_site_package_group)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SITE_IMPL_ANALYTICS_COMPONENT_CONFIGURATION_SERVICE_IM_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_social_console_analytics_components: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_site_impl_analytics_component_configuration_service_im(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_social_console_analytics_components)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_site_impl_site_configurator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SITE_IMPL_SITE_CONFIGURATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_components_using_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_site_impl_site_configurator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_components_using_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_srp_impl_social_solr_connector
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SRP_IMPL_SOCIAL_SOLR_CONNECTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_srp_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_srp_impl_social_solr_connector(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_srp_type)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_sync_impl_diff_changes_observer
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SYNC_IMPL_DIFF_CHANGES_OBSERVER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_agent_name: STRING_32
            l_diff_path: STRING_32
            l_property_names: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_sync_impl_diff_changes_observer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_agent_name, l_diff_path, l_property_names)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_sync_impl_group_sync_listener_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SYNC_IMPL_GROUP_SYNC_LISTENER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_nodetypes: LIST [STRING_32]
            l_ignorableprops: LIST [STRING_32]
            l_ignorablenodes: STRING_32
            l_enabled: BOOLEAN
            l_distfolders: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_sync_impl_group_sync_listener_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_nodetypes, l_ignorableprops, l_ignorablenodes, l_enabled, l_distfolders)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_sync_impl_publisher_sync_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SYNC_IMPL_PUBLISHER_SYNC_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_active_run_modes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_sync_impl_publisher_sync_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_active_run_modes)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_sync_impl_user_sync_listener_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_SYNC_IMPL_USER_SYNC_LISTENER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_nodetypes: LIST [STRING_32]
            l_ignorableprops: LIST [STRING_32]
            l_ignorablenodes: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_distfolders: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_sync_impl_user_sync_listener_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_nodetypes, l_ignorableprops, l_ignorablenodes, l_enabled, l_distfolders)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_translation_impl_translation_service_config_manager
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_TRANSLATION_IMPL_TRANSLATION_SERVICE_CONFIG_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_translate_language: STRING_32
            l_translate_display: STRING_32
            l_translate_attribution: BOOLEAN
            l_translate_caching: STRING_32
            l_translate_smart_rendering: STRING_32
            l_translate_caching_duration: STRING_32
            l_translate_session_save_interval: STRING_32
            l_translate_session_save_batch_limit: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_translation_impl_translation_service_config_manager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_translate_language, l_translate_display, l_translate_attribution, l_translate_caching, l_translate_smart_rendering, l_translate_caching_duration, l_translate_session_save_interval, l_translate_session_save_batch_limit)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_translation_impl_ug_clanguage_detector
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_TRANSLATION_IMPL_UGC_LANGUAGE_DETECTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_topics: STRING_32
            l_event_filter: STRING_32
            l_translate_listener_type: LIST [STRING_32]
            l_translate_property_list: LIST [STRING_32]
            l_pool_size: INTEGER_32
            l_max_pool_size: INTEGER_32
            l_queue_size: INTEGER_32
            l_keep_alive_time: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_translation_impl_ug_clanguage_detector(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_topics, l_event_filter, l_translate_listener_type, l_translate_property_list, l_pool_size, l_max_pool_size, l_queue_size, l_keep_alive_time)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_UGCBASE_DISPATCHER_IMPL_FLUSH_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_thread_pool_size: INTEGER_32
            l_delay_time: INTEGER_32
            l_worker_sleep_time: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_thread_pool_size, l_delay_time, l_worker_sleep_time)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_UGCBASE_IMPL_AYSNC_REVERSE_REPLICATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pool_size: INTEGER_32
            l_max_pool_size: INTEGER_32
            l_queue_size: INTEGER_32
            l_keep_alive_time: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pool_size, l_max_pool_size, l_queue_size, l_keep_alive_time)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_UGCBASE_IMPL_PUBLISHER_CONFIGURATION_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_is_primary_publisher: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_is_primary_publisher)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ugcbase_impl_social_utils_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_UGCBASE_IMPL_SOCIAL_UTILS_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_legacy_cloud_ug_cpath_mapping: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ugcbase_impl_social_utils_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_legacy_cloud_ug_cpath_mapping)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_UGCBASE_MODERATION_IMPL_AUTO_MODERATION_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_automoderation_sequence: LIST [STRING_32]
            l_automoderation_onfailurestop: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_automoderation_sequence, l_automoderation_onfailurestop)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_UGCBASE_MODERATION_IMPL_SENTIMENT_PROCESS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_watchwords_positive: LIST [STRING_32]
            l_watchwords_negative: LIST [STRING_32]
            l_watchwords_path: STRING_32
            l_sentiment_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_watchwords_positive, l_watchwords_negative, l_watchwords_path, l_sentiment_path)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_UGCBASE_SECURITY_IMPL_DEFAULT_ATTACHMENT_TYPE_BLACKLI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_default_attachment_type_blacklist: LIST [STRING_32]
            l_baseline_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_default_attachment_type_blacklist, l_baseline_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_UGCBASE_SECURITY_IMPL_SAFER_SLING_POST_VALIDATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_parameter_whitelist: LIST [STRING_32]
            l_parameter_whitelist_prefixes: LIST [STRING_32]
            l_binary_parameter_whitelist: LIST [STRING_32]
            l_modifier_whitelist: LIST [STRING_32]
            l_operation_whitelist: LIST [STRING_32]
            l_operation_whitelist_prefixes: LIST [STRING_32]
            l_typehint_whitelist: LIST [STRING_32]
            l_resourcetype_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_parameter_whitelist, l_parameter_whitelist_prefixes, l_binary_parameter_whitelist, l_modifier_whitelist, l_operation_whitelist, l_operation_whitelist_prefixes, l_typehint_whitelist, l_resourcetype_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_USER_ENDPOINTS_IMPL_USERS_GROUP_FROM_PUBLISH_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_extensions: STRING_32
            l_sling_servlet_paths: STRING_32
            l_sling_servlet_methods: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_extensions, l_sling_servlet_paths, l_sling_servlet_methods)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_social_user_impl_transport_http_to_publisher
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_SOCIAL_USER_IMPL_TRANSPORT_HTTP_TO_PUBLISHER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enable: BOOLEAN
            l_agent_configuration: LIST [STRING_32]
            l_context_path: STRING_32
            l_disabled_cipher_suites: LIST [STRING_32]
            l_enabled_cipher_suites: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_social_user_impl_transport_http_to_publisher(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enable, l_agent_configuration, l_context_path, l_disabled_cipher_suites, l_enabled_cipher_suites)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rt_efilter_servlet_fact
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_UI_WCM_COMMONS_INTERNAL_SERVLETS_RTE_RTE_FILTER_SERVLET_FACT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_resource_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rt_efilter_servlet_fact(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_resource_types)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_UPGRADES_CLEANUP_IMPL_UPGRADE_CONTENT_CLEANUP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_delete_path_regexps: LIST [STRING_32]
            l_delete_sql2_query: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_delete_path_regexps, l_delete_sql2_query)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_UPGRADES_CLEANUP_IMPL_UPGRADE_INSTALL_FOLDER_CLEANUP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_delete_name_regexps: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_delete_name_regexps)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_WCM_JOBS_ASYNC_IMPL_ASYNC_DELETE_CONFIG_PROVIDER_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_threshold: INTEGER_32
            l_job_topic_name: STRING_32
            l_email_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_threshold, l_job_topic_name, l_email_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_WCM_JOBS_ASYNC_IMPL_ASYNC_JOB_CLEAN_UP_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
            l_job_purge_threshold: INTEGER_32
            l_job_purge_max_jobs: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression, l_job_purge_threshold, l_job_purge_max_jobs)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_WCM_JOBS_ASYNC_IMPL_ASYNC_MOVE_CONFIG_PROVIDER_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_threshold: INTEGER_32
            l_job_topic_name: STRING_32
            l_email_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_threshold, l_job_topic_name, l_email_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_WCM_JOBS_ASYNC_IMPL_ASYNC_PAGE_MOVE_CONFIG_PROVIDER_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_threshold: INTEGER_32
            l_job_topic_name: STRING_32
            l_email_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_threshold, l_job_topic_name, l_email_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_wcm_launches_impl_launches_event_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_WCM_LAUNCHES_IMPL_LAUNCHES_EVENT_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_filter: STRING_32
            l_launches_eventhandler_threadpool_maxsize: INTEGER_32
            l_launches_eventhandler_threadpool_priority: STRING_32
            l_launches_eventhandler_updatelastmodification: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_wcm_launches_impl_launches_event_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_filter, l_launches_eventhandler_threadpool_maxsize, l_launches_eventhandler_threadpool_priority, l_launches_eventhandler_updatelastmodification)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_WCM_MOBILE_QRCODE_SERVLET_QR_CODE_IMAGE_GENERATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_qrcode_servlet_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_qrcode_servlet_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_WCM_STYLE_INTERNAL_COMPONENT_STYLE_INFO_CACHE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_wcm_style_internal_component_style_info_cache_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_size)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_CQ_WCM_TRANSLATION_IMPL_TRANSLATION_PLATFORM_CONFIGURATION_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sync_translation_state_scheduling_format: STRING_32
            l_scheduling_repeat_translation_scheduling_format: STRING_32
            l_sync_translation_state_lock_timeout_in_minutes: STRING_32
            l_export_format: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sync_translation_state_scheduling_format, l_scheduling_repeat_translation_scheduling_format, l_sync_translation_state_lock_timeout_in_minutes, l_export_format)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_FD_FP_CONFIG_FORMS_PORTAL_DRAFTSAND_SUBMISSION_CONFIG_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_portal_outboxes: LIST [STRING_32]
            l_draft_data_service: STRING_32
            l_draft_metadata_service: STRING_32
            l_submit_data_service: STRING_32
            l_submit_metadata_service: STRING_32
            l_pending_sign_data_service: STRING_32
            l_pending_sign_metadata_service: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_portal_outboxes, l_draft_data_service, l_draft_metadata_service, l_submit_data_service, l_submit_metadata_service, l_pending_sign_data_service, l_pending_sign_metadata_service)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_fd_fp_config_forms_portal_scheduler_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_FD_FP_CONFIG_FORMS_PORTAL_SCHEDULER_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_formportal_interval: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_fd_fp_config_forms_portal_scheduler_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_formportal_interval)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_forms_common_service_impl_default_data_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_FORMS_COMMON_SERVICE_IMPL_DEFAULT_DATA_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_alloweddata_file_locations: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_forms_common_service_impl_default_data_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_alloweddata_file_locations)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_FORMS_COMMON_SERVICE_IMPL_FORMS_COMMON_CONFIGURATION_SERVICE_IMP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_temp_storage_config: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_forms_common_service_impl_forms_common_configuration_service_imp(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_temp_storage_config)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_forms_common_servlet_temp_clean_up_task
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_FORMS_COMMON_SERVLET_TEMP_CLEAN_UP_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
            l_duration_for__temporary__storage: STRING_32
            l_duration_for__anonymous__storage: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_forms_common_servlet_temp_clean_up_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression, l_duration_for__temporary__storage, l_duration_for__anonymous__storage)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_acp_platform_platform_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_ACP_PLATFORM_PLATFORM_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_query_limit: INTEGER_32
            l_file_type_extension_map: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_acp_platform_platform_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_query_limit, l_file_type_extension_map)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_activitystreams_impl_activity_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_ACTIVITYSTREAMS_IMPL_ACTIVITY_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_aggregate_relationships: LIST [STRING_32]
            l_aggregate_descend_virtual: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_activitystreams_impl_activity_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_aggregate_relationships, l_aggregate_descend_virtual)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_analyzer_base_system_status_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_ANALYZER_BASE_SYSTEM_STATUS_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_disabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_analyzer_base_system_status_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_disabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_ANALYZER_SCRIPTS_COMPILE_ALL_SCRIPTS_COMPILER_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_disabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_disabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_apicontroller_filter_resolver_hook_factory
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_APICONTROLLER_FILTER_RESOLVER_HOOK_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_cq_cdn_cdn_rewriter: STRING_32
            l_com_adobe_cq_cloud_config_components: STRING_32
            l_com_adobe_cq_cloud_config_core: STRING_32
            l_com_adobe_cq_cloud_config_ui: STRING_32
            l_com_adobe_cq_com_adobe_cq_editor: STRING_32
            l_com_adobe_cq_com_adobe_cq_projects_core: STRING_32
            l_com_adobe_cq_com_adobe_cq_projects_wcm_core: STRING_32
            l_com_adobe_cq_com_adobe_cq_ui_commons: STRING_32
            l_com_adobe_cq_com_adobe_cq_wcm_style: STRING_32
            l_com_adobe_cq_cq_activitymap_integration: STRING_32
            l_com_adobe_cq_cq_contexthub_commons: STRING_32
            l_com_adobe_cq_cq_dtm: STRING_32
            l_com_adobe_cq_cq_healthcheck: STRING_32
            l_com_adobe_cq_cq_multisite_targeting: STRING_32
            l_com_adobe_cq_cq_pre_upgrade_cleanup: STRING_32
            l_com_adobe_cq_cq_product_info_provider: STRING_32
            l_com_adobe_cq_cq_rest_sites: STRING_32
            l_com_adobe_cq_cq_security_hc: STRING_32
            l_com_adobe_cq_dam_cq_dam_svg_handler: STRING_32
            l_com_adobe_cq_dam_cq_scene7_imaging: STRING_32
            l_com_adobe_cq_dtm_reactor_core: STRING_32
            l_com_adobe_cq_dtm_reactor_ui: STRING_32
            l_com_adobe_cq_exp_jspel_resolver: STRING_32
            l_com_adobe_cq_inbox_cq_inbox: STRING_32
            l_com_adobe_cq_json_schema_parser: STRING_32
            l_com_adobe_cq_media_cq_media_publishing_dps_fp_core: STRING_32
            l_com_adobe_cq_mobile_cq_mobile_caas: STRING_32
            l_com_adobe_cq_mobile_cq_mobile_index_builder: STRING_32
            l_com_adobe_cq_mobile_cq_mobile_phonegap_build: STRING_32
            l_com_adobe_cq_myspell: STRING_32
            l_com_adobe_cq_sample_we_retail_core: STRING_32
            l_com_adobe_cq_screens_com_adobe_cq_screens_dcc: STRING_32
            l_com_adobe_cq_screens_com_adobe_cq_screens_mq_core: STRING_32
            l_com_adobe_cq_social_cq_social_as_provider: STRING_32
            l_com_adobe_cq_social_cq_social_badging_basic_impl: STRING_32
            l_com_adobe_cq_social_cq_social_badging_impl: STRING_32
            l_com_adobe_cq_social_cq_social_calendar_impl: STRING_32
            l_com_adobe_cq_social_cq_social_content_fragments_impl: STRING_32
            l_com_adobe_cq_social_cq_social_enablement_impl: STRING_32
            l_com_adobe_cq_social_cq_social_graph_impl: STRING_32
            l_com_adobe_cq_social_cq_social_ideation_impl: STRING_32
            l_com_adobe_cq_social_cq_social_jcr_provider: STRING_32
            l_com_adobe_cq_social_cq_social_members_impl: STRING_32
            l_com_adobe_cq_social_cq_social_ms_provider: STRING_32
            l_com_adobe_cq_social_cq_social_notifications_channels_web: STRING_32
            l_com_adobe_cq_social_cq_social_notifications_impl: STRING_32
            l_com_adobe_cq_social_cq_social_rdb_provider: STRING_32
            l_com_adobe_cq_social_cq_social_scf_impl: STRING_32
            l_com_adobe_cq_social_cq_social_scoring_basic_impl: STRING_32
            l_com_adobe_cq_social_cq_social_scoring_impl: STRING_32
            l_com_adobe_cq_social_cq_social_serviceusers_impl: STRING_32
            l_com_adobe_cq_social_cq_social_srp_impl: STRING_32
            l_com_adobe_cq_social_cq_social_ugcbase_impl: STRING_32
            l_com_adobe_dam_cq_dam_cfm_impl: STRING_32
            l_com_adobe_forms_foundation_forms_foundation_base: STRING_32
            l_com_adobe_granite_apicontroller: STRING_32
            l_com_adobe_granite_asset_core: STRING_32
            l_com_adobe_granite_auth_sso: STRING_32
            l_com_adobe_granite_bundles_hc_impl: STRING_32
            l_com_adobe_granite_compat_router: STRING_32
            l_com_adobe_granite_conf: STRING_32
            l_com_adobe_granite_conf_ui_core: STRING_32
            l_com_adobe_granite_cors: STRING_32
            l_com_adobe_granite_crx_explorer: STRING_32
            l_com_adobe_granite_crxde_lite: STRING_32
            l_com_adobe_granite_crypto_config: STRING_32
            l_com_adobe_granite_crypto_extension: STRING_32
            l_com_adobe_granite_crypto_file: STRING_32
            l_com_adobe_granite_crypto_jcr: STRING_32
            l_com_adobe_granite_csrf: STRING_32
            l_com_adobe_granite_distribution_core: STRING_32
            l_com_adobe_granite_dropwizard_metrics: STRING_32
            l_com_adobe_granite_frags_impl: STRING_32
            l_com_adobe_granite_gibson: STRING_32
            l_com_adobe_granite_infocollector: STRING_32
            l_com_adobe_granite_installer_factory_packages: STRING_32
            l_com_adobe_granite_jetty_ssl: STRING_32
            l_com_adobe_granite_jobs_async: STRING_32
            l_com_adobe_granite_maintenance_oak: STRING_32
            l_com_adobe_granite_monitoring_core: STRING_32
            l_com_adobe_granite_queries: STRING_32
            l_com_adobe_granite_replication_hc_impl: STRING_32
            l_com_adobe_granite_repository_checker: STRING_32
            l_com_adobe_granite_repository_hc_impl: STRING_32
            l_com_adobe_granite_rest_assets: STRING_32
            l_com_adobe_granite_security_ui: STRING_32
            l_com_adobe_granite_startup: STRING_32
            l_com_adobe_granite_tagsoup: STRING_32
            l_com_adobe_granite_taskmanagement_core: STRING_32
            l_com_adobe_granite_taskmanagement_workflow: STRING_32
            l_com_adobe_granite_ui_clientlibs_compiler_less: STRING_32
            l_com_adobe_granite_ui_clientlibs_processor_gcc: STRING_32
            l_com_adobe_granite_webconsole_plugins: STRING_32
            l_com_adobe_granite_workflow_console: STRING_32
            l_com_adobe_xmp_worker_files_native_fragment_linux: STRING_32
            l_com_adobe_xmp_worker_files_native_fragment_macosx: STRING_32
            l_com_adobe_xmp_worker_files_native_fragment_win: STRING_32
            l_com_day_commons_osgi_wrapper_simple_jndi: STRING_32
            l_com_day_cq_cq_authhandler: STRING_32
            l_com_day_cq_cq_compat_configupdate: STRING_32
            l_com_day_cq_cq_licensebranding: STRING_32
            l_com_day_cq_cq_notifcation_impl: STRING_32
            l_com_day_cq_cq_replication_audit: STRING_32
            l_com_day_cq_cq_search_ext: STRING_32
            l_com_day_cq_dam_cq_dam_annotation_print: STRING_32
            l_com_day_cq_dam_cq_dam_asset_usage: STRING_32
            l_com_day_cq_dam_cq_dam_s7dam: STRING_32
            l_com_day_cq_dam_cq_dam_similaritysearch: STRING_32
            l_com_day_cq_dam_dam_webdav_support: STRING_32
            l_com_day_cq_pre_upgrade_tasks: STRING_32
            l_com_day_cq_replication_extensions: STRING_32
            l_com_day_cq_wcm_cq_msm_core: STRING_32
            l_com_day_cq_wcm_cq_wcm_translation: STRING_32
            l_day_commons_jrawio: STRING_32
            l_org_apache_aries_jmx_whiteboard: STRING_32
            l_org_apache_felix_http_sslfilter: STRING_32
            l_org_apache_felix_org_apache_felix_threaddump: STRING_32
            l_org_apache_felix_webconsole_plugins_ds: STRING_32
            l_org_apache_felix_webconsole_plugins_event: STRING_32
            l_org_apache_felix_webconsole_plugins_memoryusage: STRING_32
            l_org_apache_felix_webconsole_plugins_packageadmin: STRING_32
            l_org_apache_jackrabbit_oak_auth_ldap: STRING_32
            l_org_apache_jackrabbit_oak_segment_tar: STRING_32
            l_org_apache_jackrabbit_oak_solr_osgi: STRING_32
            l_org_apache_sling_bundleresource_impl: STRING_32
            l_org_apache_sling_commons_fsclassloader: STRING_32
            l_org_apache_sling_commons_log_webconsole: STRING_32
            l_org_apache_sling_datasource: STRING_32
            l_org_apache_sling_discovery_base: STRING_32
            l_org_apache_sling_discovery_oak: STRING_32
            l_org_apache_sling_discovery_support: STRING_32
            l_org_apache_sling_distribution_api: STRING_32
            l_org_apache_sling_distribution_core: STRING_32
            l_org_apache_sling_extensions_webconsolesecurityprovider: STRING_32
            l_org_apache_sling_hc_webconsole: STRING_32
            l_org_apache_sling_installer_console: STRING_32
            l_org_apache_sling_installer_provider_file: STRING_32
            l_org_apache_sling_installer_provider_jcr: STRING_32
            l_org_apache_sling_jcr_davex: STRING_32
            l_org_apache_sling_jcr_resourcesecurity: STRING_32
            l_org_apache_sling_jmx_provider: STRING_32
            l_org_apache_sling_launchpad_installer: STRING_32
            l_org_apache_sling_models_impl: STRING_32
            l_org_apache_sling_repoinit_parser: STRING_32
            l_org_apache_sling_resource_inventory: STRING_32
            l_org_apache_sling_resourceresolver: STRING_32
            l_org_apache_sling_scripting_javascript: STRING_32
            l_org_apache_sling_scripting_jst: STRING_32
            l_org_apache_sling_scripting_sightly_js_provider: STRING_32
            l_org_apache_sling_scripting_sightly_models_provider: STRING_32
            l_org_apache_sling_security: STRING_32
            l_org_apache_sling_servlets_compat: STRING_32
            l_org_apache_sling_servlets_get: STRING_32
            l_org_apache_sling_startupfilter_disabler: STRING_32
            l_org_apache_sling_tracer: STRING_32
            l_we_retail_client_app_core: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_apicontroller_filter_resolver_hook_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_cq_cdn_cdn_rewriter, l_com_adobe_cq_cloud_config_components, l_com_adobe_cq_cloud_config_core, l_com_adobe_cq_cloud_config_ui, l_com_adobe_cq_com_adobe_cq_editor, l_com_adobe_cq_com_adobe_cq_projects_core, l_com_adobe_cq_com_adobe_cq_projects_wcm_core, l_com_adobe_cq_com_adobe_cq_ui_commons, l_com_adobe_cq_com_adobe_cq_wcm_style, l_com_adobe_cq_cq_activitymap_integration, l_com_adobe_cq_cq_contexthub_commons, l_com_adobe_cq_cq_dtm, l_com_adobe_cq_cq_healthcheck, l_com_adobe_cq_cq_multisite_targeting, l_com_adobe_cq_cq_pre_upgrade_cleanup, l_com_adobe_cq_cq_product_info_provider, l_com_adobe_cq_cq_rest_sites, l_com_adobe_cq_cq_security_hc, l_com_adobe_cq_dam_cq_dam_svg_handler, l_com_adobe_cq_dam_cq_scene7_imaging, l_com_adobe_cq_dtm_reactor_core, l_com_adobe_cq_dtm_reactor_ui, l_com_adobe_cq_exp_jspel_resolver, l_com_adobe_cq_inbox_cq_inbox, l_com_adobe_cq_json_schema_parser, l_com_adobe_cq_media_cq_media_publishing_dps_fp_core, l_com_adobe_cq_mobile_cq_mobile_caas, l_com_adobe_cq_mobile_cq_mobile_index_builder, l_com_adobe_cq_mobile_cq_mobile_phonegap_build, l_com_adobe_cq_myspell, l_com_adobe_cq_sample_we_retail_core, l_com_adobe_cq_screens_com_adobe_cq_screens_dcc, l_com_adobe_cq_screens_com_adobe_cq_screens_mq_core, l_com_adobe_cq_social_cq_social_as_provider, l_com_adobe_cq_social_cq_social_badging_basic_impl, l_com_adobe_cq_social_cq_social_badging_impl, l_com_adobe_cq_social_cq_social_calendar_impl, l_com_adobe_cq_social_cq_social_content_fragments_impl, l_com_adobe_cq_social_cq_social_enablement_impl, l_com_adobe_cq_social_cq_social_graph_impl, l_com_adobe_cq_social_cq_social_ideation_impl, l_com_adobe_cq_social_cq_social_jcr_provider, l_com_adobe_cq_social_cq_social_members_impl, l_com_adobe_cq_social_cq_social_ms_provider, l_com_adobe_cq_social_cq_social_notifications_channels_web, l_com_adobe_cq_social_cq_social_notifications_impl, l_com_adobe_cq_social_cq_social_rdb_provider, l_com_adobe_cq_social_cq_social_scf_impl, l_com_adobe_cq_social_cq_social_scoring_basic_impl, l_com_adobe_cq_social_cq_social_scoring_impl, l_com_adobe_cq_social_cq_social_serviceusers_impl, l_com_adobe_cq_social_cq_social_srp_impl, l_com_adobe_cq_social_cq_social_ugcbase_impl, l_com_adobe_dam_cq_dam_cfm_impl, l_com_adobe_forms_foundation_forms_foundation_base, l_com_adobe_granite_apicontroller, l_com_adobe_granite_asset_core, l_com_adobe_granite_auth_sso, l_com_adobe_granite_bundles_hc_impl, l_com_adobe_granite_compat_router, l_com_adobe_granite_conf, l_com_adobe_granite_conf_ui_core, l_com_adobe_granite_cors, l_com_adobe_granite_crx_explorer, l_com_adobe_granite_crxde_lite, l_com_adobe_granite_crypto_config, l_com_adobe_granite_crypto_extension, l_com_adobe_granite_crypto_file, l_com_adobe_granite_crypto_jcr, l_com_adobe_granite_csrf, l_com_adobe_granite_distribution_core, l_com_adobe_granite_dropwizard_metrics, l_com_adobe_granite_frags_impl, l_com_adobe_granite_gibson, l_com_adobe_granite_infocollector, l_com_adobe_granite_installer_factory_packages, l_com_adobe_granite_jetty_ssl, l_com_adobe_granite_jobs_async, l_com_adobe_granite_maintenance_oak, l_com_adobe_granite_monitoring_core, l_com_adobe_granite_queries, l_com_adobe_granite_replication_hc_impl, l_com_adobe_granite_repository_checker, l_com_adobe_granite_repository_hc_impl, l_com_adobe_granite_rest_assets, l_com_adobe_granite_security_ui, l_com_adobe_granite_startup, l_com_adobe_granite_tagsoup, l_com_adobe_granite_taskmanagement_core, l_com_adobe_granite_taskmanagement_workflow, l_com_adobe_granite_ui_clientlibs_compiler_less, l_com_adobe_granite_ui_clientlibs_processor_gcc, l_com_adobe_granite_webconsole_plugins, l_com_adobe_granite_workflow_console, l_com_adobe_xmp_worker_files_native_fragment_linux, l_com_adobe_xmp_worker_files_native_fragment_macosx, l_com_adobe_xmp_worker_files_native_fragment_win, l_com_day_commons_osgi_wrapper_simple_jndi, l_com_day_cq_cq_authhandler, l_com_day_cq_cq_compat_configupdate, l_com_day_cq_cq_licensebranding, l_com_day_cq_cq_notifcation_impl, l_com_day_cq_cq_replication_audit, l_com_day_cq_cq_search_ext, l_com_day_cq_dam_cq_dam_annotation_print, l_com_day_cq_dam_cq_dam_asset_usage, l_com_day_cq_dam_cq_dam_s7dam, l_com_day_cq_dam_cq_dam_similaritysearch, l_com_day_cq_dam_dam_webdav_support, l_com_day_cq_pre_upgrade_tasks, l_com_day_cq_replication_extensions, l_com_day_cq_wcm_cq_msm_core, l_com_day_cq_wcm_cq_wcm_translation, l_day_commons_jrawio, l_org_apache_aries_jmx_whiteboard, l_org_apache_felix_http_sslfilter, l_org_apache_felix_org_apache_felix_threaddump, l_org_apache_felix_webconsole_plugins_ds, l_org_apache_felix_webconsole_plugins_event, l_org_apache_felix_webconsole_plugins_memoryusage, l_org_apache_felix_webconsole_plugins_packageadmin, l_org_apache_jackrabbit_oak_auth_ldap, l_org_apache_jackrabbit_oak_segment_tar, l_org_apache_jackrabbit_oak_solr_osgi, l_org_apache_sling_bundleresource_impl, l_org_apache_sling_commons_fsclassloader, l_org_apache_sling_commons_log_webconsole, l_org_apache_sling_datasource, l_org_apache_sling_discovery_base, l_org_apache_sling_discovery_oak, l_org_apache_sling_discovery_support, l_org_apache_sling_distribution_api, l_org_apache_sling_distribution_core, l_org_apache_sling_extensions_webconsolesecurityprovider, l_org_apache_sling_hc_webconsole, l_org_apache_sling_installer_console, l_org_apache_sling_installer_provider_file, l_org_apache_sling_installer_provider_jcr, l_org_apache_sling_jcr_davex, l_org_apache_sling_jcr_resourcesecurity, l_org_apache_sling_jmx_provider, l_org_apache_sling_launchpad_installer, l_org_apache_sling_models_impl, l_org_apache_sling_repoinit_parser, l_org_apache_sling_resource_inventory, l_org_apache_sling_resourceresolver, l_org_apache_sling_scripting_javascript, l_org_apache_sling_scripting_jst, l_org_apache_sling_scripting_sightly_js_provider, l_org_apache_sling_scripting_sightly_models_provider, l_org_apache_sling_security, l_org_apache_sling_servlets_compat, l_org_apache_sling_servlets_get, l_org_apache_sling_startupfilter_disabler, l_org_apache_sling_tracer, l_we_retail_client_app_core)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_cert_impl_client_cert_auth_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_CERT_IMPL_CLIENT_CERT_AUTH_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_cert_impl_client_cert_auth_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_ims
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_IMS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_configid: STRING_32
            l_scope: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_ims(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_configid, l_scope)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_IMS_IMPL_EXTERNAL_USER_ID_MAPPING_PROVIDER_EXTENSION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_ims_impl_im_saccess_token_request_customizer_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_IMS_IMPL_IMS_ACCESS_TOKEN_REQUEST_CUSTOMIZER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_auth_ims_client_secret: STRING_32
            l_customizer_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_ims_impl_im_saccess_token_request_customizer_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_auth_ims_client_secret, l_customizer_type)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_ims_impl_im_sinstance_credentials_validator
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_IMS_IMPL_IMS_INSTANCE_CREDENTIALS_VALIDATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_ims_impl_im_sinstance_credentials_validator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_ims_impl_im_sprovider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_IMS_IMPL_IMS_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
            l_oauth_provider_ims_authorization_url: STRING_32
            l_oauth_provider_ims_token_url: STRING_32
            l_oauth_provider_ims_profile_url: STRING_32
            l_oauth_provider_ims_extended_details_urls: LIST [STRING_32]
            l_oauth_provider_ims_validate_token_url: STRING_32
            l_oauth_provider_ims_session_property: STRING_32
            l_oauth_provider_ims_service_token_client_id: STRING_32
            l_oauth_provider_ims_service_token_client_secret: STRING_32
            l_oauth_provider_ims_service_token: STRING_32
            l_ims_org_ref: STRING_32
            l_ims_group_mapping: LIST [STRING_32]
            l_oauth_provider_ims_only_license_group: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_ims_impl_im_sprovider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id, l_oauth_provider_ims_authorization_url, l_oauth_provider_ims_token_url, l_oauth_provider_ims_profile_url, l_oauth_provider_ims_extended_details_urls, l_oauth_provider_ims_validate_token_url, l_oauth_provider_ims_session_property, l_oauth_provider_ims_service_token_client_id, l_oauth_provider_ims_service_token_client_secret, l_oauth_provider_ims_service_token, l_ims_org_ref, l_ims_group_mapping, l_oauth_provider_ims_only_license_group)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_ims_impl_ims_config_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_IMS_IMPL_IMS_CONFIG_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_configmanager_ims_configid: STRING_32
            l_ims_owning_entity: STRING_32
            l_aem_instance_id: STRING_32
            l_ims_service_code: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_ims_impl_ims_config_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_configmanager_ims_configid, l_ims_owning_entity, l_aem_instance_id, l_ims_service_code)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_accesstoken_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_ACCESSTOKEN_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_auth_token_provider_title: STRING_32
            l_auth_token_provider_default_claims: LIST [STRING_32]
            l_auth_token_provider_endpoint: STRING_32
            l_auth_access_token_request: STRING_32
            l_auth_token_provider_keypair_alias: STRING_32
            l_auth_token_provider_conn_timeout: INTEGER_32
            l_auth_token_provider_so_timeout: INTEGER_32
            l_auth_token_provider_client_id: STRING_32
            l_auth_token_provider_scope: STRING_32
            l_auth_token_provider_reuse_access_token: BOOLEAN
            l_auth_token_provider_relaxed_ssl: BOOLEAN
            l_token_request_customizer_type: STRING_32
            l_auth_token_validator_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_accesstoken_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_auth_token_provider_title, l_auth_token_provider_default_claims, l_auth_token_provider_endpoint, l_auth_access_token_request, l_auth_token_provider_keypair_alias, l_auth_token_provider_conn_timeout, l_auth_token_provider_so_timeout, l_auth_token_provider_client_id, l_auth_token_provider_scope, l_auth_token_provider_reuse_access_token, l_auth_token_provider_relaxed_ssl, l_token_request_customizer_type, l_auth_token_validator_type)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_BEARER_AUTHENTICATION_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
            l_oauth_client_ids_allowed: LIST [STRING_32]
            l_auth_bearer_sync_ims: BOOLEAN
            l_auth_token_request_parameter: STRING_32
            l_oauth_bearer_configid: STRING_32
            l_oauth_jwt_support: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_bearer_authentication_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_oauth_client_ids_allowed, l_auth_bearer_sync_ims, l_auth_token_request_parameter, l_oauth_bearer_configid, l_oauth_jwt_support)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_default_token_validator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_DEFAULT_TOKEN_VALIDATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_auth_token_validator_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_default_token_validator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_auth_token_validator_type)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_facebook_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_FACEBOOK_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_facebook_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_github_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_GITHUB_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
            l_oauth_provider_github_authorization_url: STRING_32
            l_oauth_provider_github_token_url: STRING_32
            l_oauth_provider_github_profile_url: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_github_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id, l_oauth_provider_github_authorization_url, l_oauth_provider_github_token_url, l_oauth_provider_github_profile_url)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_granite_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_GRANITE_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
            l_oauth_provider_granite_authorization_url: STRING_32
            l_oauth_provider_granite_token_url: STRING_32
            l_oauth_provider_granite_profile_url: STRING_32
            l_oauth_provider_granite_extended_details_urls: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_granite_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id, l_oauth_provider_granite_authorization_url, l_oauth_provider_granite_token_url, l_oauth_provider_granite_profile_url, l_oauth_provider_granite_extended_details_urls)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_HELPER_PROVIDER_CONFIG_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_cookie_login_timeout: STRING_32
            l_oauth_cookie_max_age: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_helper_provider_config_manager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_cookie_login_timeout, l_oauth_cookie_max_age)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_HELPER_PROVIDER_CONFIG_MANAGER_INTERNAL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_cookie_login_timeout: STRING_32
            l_oauth_cookie_max_age: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_cookie_login_timeout, l_oauth_cookie_max_age)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_oauth_authentication_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_O_AUTH_AUTHENTICATION_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_oauth_authentication_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_impl_twitter_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_TWITTER_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_provider_id: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_impl_twitter_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_provider_id)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_oauth_provider
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_OAUTH_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_config_id: STRING_32
            l_oauth_client_id: STRING_32
            l_oauth_client_secret: STRING_32
            l_oauth_scope: LIST [STRING_32]
            l_oauth_config_provider_id: STRING_32
            l_oauth_create_users: BOOLEAN
            l_oauth_userid_property: STRING_32
            l_force_strict_username_matching: BOOLEAN
            l_oauth_encode_userids: BOOLEAN
            l_oauth_hash_userids: BOOLEAN
            l_oauth_call_back_url: STRING_32
            l_oauth_access_token_persist: BOOLEAN
            l_oauth_access_token_persist_cookie: BOOLEAN
            l_oauth_csrf_state_protection: BOOLEAN
            l_oauth_redirect_request_params: BOOLEAN
            l_oauth_config_siblings_allow: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_oauth_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_config_id, l_oauth_client_id, l_oauth_client_secret, l_oauth_scope, l_oauth_config_provider_id, l_oauth_create_users, l_oauth_userid_property, l_force_strict_username_matching, l_oauth_encode_userids, l_oauth_hash_userids, l_oauth_call_back_url, l_oauth_access_token_persist, l_oauth_access_token_persist_cookie, l_oauth_csrf_state_protection, l_oauth_redirect_request_params, l_oauth_config_siblings_allow)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_requirement_impl_default_requirement_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_REQUIREMENT_IMPL_DEFAULT_REQUIREMENT_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_supported_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_requirement_impl_default_requirement_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_supported_paths)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_saml_saml_authentication_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_SAML_SAML_AUTHENTICATION_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_idp_url: STRING_32
            l_idp_cert_alias: STRING_32
            l_idp_http_redirect: BOOLEAN
            l_service_provider_entity_id: STRING_32
            l_assertion_consumer_service_ur_l: STRING_32
            l_sp_private_key_alias: STRING_32
            l_key_store_password: STRING_32
            l_default_redirect_url: STRING_32
            l_user_id_attribute: STRING_32
            l_use_encryption: BOOLEAN
            l_create_user: BOOLEAN
            l_user_intermediate_path: STRING_32
            l_add_group_memberships: BOOLEAN
            l_group_membership_attribute: STRING_32
            l_default_groups: LIST [STRING_32]
            l_name_id_format: STRING_32
            l_synchronize_attributes: LIST [STRING_32]
            l_handle_logout: BOOLEAN
            l_logout_url: STRING_32
            l_clock_tolerance: INTEGER_32
            l_digest_method: STRING_32
            l_signature_method: STRING_32
            l_identity_sync_type: STRING_32
            l_idp_identifier: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_saml_saml_authentication_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_service_ranking, l_idp_url, l_idp_cert_alias, l_idp_http_redirect, l_service_provider_entity_id, l_assertion_consumer_service_ur_l, l_sp_private_key_alias, l_key_store_password, l_default_redirect_url, l_user_id_attribute, l_use_encryption, l_create_user, l_user_intermediate_path, l_add_group_memberships, l_group_membership_attribute, l_default_groups, l_name_id_format, l_synchronize_attributes, l_handle_logout, l_logout_url, l_clock_tolerance, l_digest_method, l_signature_method, l_identity_sync_type, l_idp_identifier)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_auth_sso_impl_sso_authentication_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_AUTH_SSO_IMPL_SSO_AUTHENTICATION_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
            l_service_ranking: INTEGER_32
            l_jaas_control_flag: STRING_32
            l_jaas_realm_name: STRING_32
            l_jaas_ranking: INTEGER_32
            l_headers: LIST [STRING_32]
            l_cookies: LIST [STRING_32]
            l_parameters: LIST [STRING_32]
            l_usermap: LIST [STRING_32]
            l_format: STRING_32
            l_trusted_credentials_attribute: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_auth_sso_impl_sso_authentication_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_service_ranking, l_jaas_control_flag, l_jaas_realm_name, l_jaas_ranking, l_headers, l_cookies, l_parameters, l_usermap, l_format, l_trusted_credentials_attribute)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_code_cache_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_CODE_CACHE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
            l_minimum_code_cache_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_code_cache_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags, l_minimum_code_cache_size)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_CRXDE_SUPPORT_BUNDLE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_DAV_EX_BUNDLE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_INACTIVE_BUNDLES_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
            l_ignored_bundles: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags, l_ignored_bundles)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_jobs_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_JOBS_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
            l_max_queued_jobs: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_jobs_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags, l_max_queued_jobs)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_SLING_GET_SERVLET_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_SLING_JAVA_SCRIPT_HANDLER_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_SLING_JSP_SCRIPT_HANDLER_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_SLING_REFERRER_FILTER_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_BUNDLES_HC_IMPL_WEB_DAV_BUNDLE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_comments_internal_comment_replication_content_filter_fac
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_COMMENTS_INTERNAL_COMMENT_REPLICATION_CONTENT_FILTER_FAC_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_replicate_comment_resource_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_comments_internal_comment_replication_content_filter_fac(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_replicate_comment_resource_types)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_compatrouter_impl_compat_switching_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_COMPATROUTER_IMPL_COMPAT_SWITCHING_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_compatgroups: LIST [STRING_32]
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_compatrouter_impl_compat_switching_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_compatgroups, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_compatrouter_impl_routing_config
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_COMPATROUTER_IMPL_ROUTING_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_id: STRING_32
            l_compat_path: STRING_32
            l_new_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_compatrouter_impl_routing_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_id, l_compat_path, l_new_path)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_compatrouter_impl_switch_mapping_config
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_COMPATROUTER_IMPL_SWITCH_MAPPING_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_group: STRING_32
            l_ids: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_compatrouter_impl_switch_mapping_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_group, l_ids)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_CONF_IMPL_RUNTIME_AWARE_CONFIGURATION_RESOURCE_RESOLVING_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_fallback_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_fallback_paths)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_contexthub_impl_context_hub_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_CONTEXTHUB_IMPL_CONTEXT_HUB_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_granite_contexthub_silent_mode: BOOLEAN
            l_com_adobe_granite_contexthub_show_ui: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_contexthub_impl_context_hub_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_granite_contexthub_silent_mode, l_com_adobe_granite_contexthub_show_ui)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_cors_impl_co_rs_policy_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_CORS_IMPL_CORS_POLICY_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_alloworigin: LIST [STRING_32]
            l_alloworiginregexp: LIST [STRING_32]
            l_allowedpaths: LIST [STRING_32]
            l_exposedheaders: LIST [STRING_32]
            l_maxage: INTEGER_32
            l_supportedheaders: LIST [STRING_32]
            l_supportedmethods: LIST [STRING_32]
            l_supportscredentials: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_cors_impl_co_rs_policy_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_alloworigin, l_alloworiginregexp, l_allowedpaths, l_exposedheaders, l_maxage, l_supportedheaders, l_supportedmethods, l_supportscredentials)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_csrf_impl_cs_rf_filter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_CSRF_IMPL_CSRF_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_filter_methods: LIST [STRING_32]
            l_filter_enable_safe_user_agents: BOOLEAN
            l_filter_safe_user_agents: LIST [STRING_32]
            l_filter_excluded_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_csrf_impl_cs_rf_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_filter_methods, l_filter_enable_safe_user_agents, l_filter_safe_user_agents, l_filter_excluded_paths)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_csrf_impl_cs_rf_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_CSRF_IMPL_CSRF_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_csrf_token_expires_in: INTEGER_32
            l_sling_auth_requirements: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_csrf_impl_cs_rf_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_csrf_token_expires_in, l_sling_auth_requirements)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_CRYPTO_DISTRIBUTION_TRANSPORT_SE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_username: STRING_32
            l_encrypted_password: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_username, l_encrypted_password)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_DIFF_DIFF_CHANGES_OBSERVER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_agent_name: STRING_32
            l_diff_path: STRING_32
            l_observed_path: STRING_32
            l_service_name: STRING_32
            l_property_names: STRING_32
            l_distribution_delay: INTEGER_32
            l_service_user_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_distribution_core_impl_diff_diff_changes_observer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_agent_name, l_diff_path, l_observed_path, l_service_name, l_property_names, l_distribution_delay, l_service_user_target)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_distribution_core_impl_diff_diff_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_DIFF_DIFF_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_diff_path: STRING_32
            l_service_name: STRING_32
            l_service_user_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_distribution_core_impl_diff_diff_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_diff_path, l_service_name, l_service_user_target)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_distribution_core_impl_distribution_to_replication_even
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_DISTRIBUTION_TO_REPLICATION_EVEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_importer_name: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_distribution_core_impl_distribution_to_replication_even(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_importer_name)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_distribution_core_impl_replication_adapters_replicat
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_REPLICATION_ADAPTERS_REPLICAT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_provider_name: STRING_32
            l_forward_requests: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_distribution_core_impl_replication_adapters_replicat(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_provider_name, l_forward_requests)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_distribution_core_impl_replication_distribution_trans
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_REPLICATION_DISTRIBUTION_TRANS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_forward_requests: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_distribution_core_impl_replication_distribution_trans(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_forward_requests)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_distribution_core_impl_transport_access_token_distribu
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_TRANSPORT_ACCESS_TOKEN_DISTRIBU_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_service_name: STRING_32
            l_user_id: STRING_32
            l_access_token_provider_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_distribution_core_impl_transport_access_token_distribu(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_service_name, l_user_id, l_access_token_provider_target)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_frags_impl_check_http_header_flag
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_FRAGS_IMPL_CHECK_HTTP_HEADER_FLAG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_feature_name: STRING_32
            l_feature_description: STRING_32
            l_http_header_name: STRING_32
            l_http_header_valuepattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_frags_impl_check_http_header_flag(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_feature_name, l_feature_description, l_http_header_name, l_http_header_valuepattern)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_frags_impl_random_feature
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_FRAGS_IMPL_RANDOM_FEATURE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_feature_name: STRING_32
            l_feature_description: STRING_32
            l_active_percentage: STRING_32
            l_cookie_name: STRING_32
            l_cookie_max_age: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_frags_impl_random_feature(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_feature_name, l_feature_description, l_active_percentage, l_cookie_name, l_cookie_max_age)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_httpcache_file_file_cache_store
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_HTTPCACHE_FILE_FILE_CACHE_STORE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_granite_httpcache_file_document_root: STRING_32
            l_com_adobe_granite_httpcache_file_include_host: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_httpcache_file_file_cache_store(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_granite_httpcache_file_document_root, l_com_adobe_granite_httpcache_file_include_host)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_httpcache_impl_outer_cache_filter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_HTTPCACHE_IMPL_OUTER_CACHE_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_granite_httpcache_url_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_httpcache_impl_outer_cache_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_granite_httpcache_url_paths)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_i18n_impl_bundle_pseudo_translations
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_I18N_IMPL_BUNDLE_PSEUDO_TRANSLATIONS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pseudo_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_i18n_impl_bundle_pseudo_translations(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pseudo_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_i18n_impl_preferences_locale_resolver_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_I18N_IMPL_PREFERENCES_LOCALE_RESOLVER_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_security_preferences_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_i18n_impl_preferences_locale_resolver_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_security_preferences_name)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_infocollector_info_collector
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_INFOCOLLECTOR_INFO_COLLECTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_granite_infocollector_include_thread_dumps: BOOLEAN
            l_granite_infocollector_include_heap_dump: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_infocollector_info_collector(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_granite_infocollector_include_thread_dumps, l_granite_infocollector_include_heap_dump)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_JETTY_SSL_INTERNAL_GRANITE_SSL_CONNECTOR_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_adobe_granite_jetty_ssl_port: INTEGER_32
            l_com_adobe_granite_jetty_ssl_keystore_user: STRING_32
            l_com_adobe_granite_jetty_ssl_keystore_password: STRING_32
            l_com_adobe_granite_jetty_ssl_ciphersuites_excluded: LIST [STRING_32]
            l_com_adobe_granite_jetty_ssl_ciphersuites_included: LIST [STRING_32]
            l_com_adobe_granite_jetty_ssl_client_certificate: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_adobe_granite_jetty_ssl_port, l_com_adobe_granite_jetty_ssl_keystore_user, l_com_adobe_granite_jetty_ssl_keystore_password, l_com_adobe_granite_jetty_ssl_ciphersuites_excluded, l_com_adobe_granite_jetty_ssl_ciphersuites_included, l_com_adobe_granite_jetty_ssl_client_certificate)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_license_impl_license_check_filter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_LICENSE_IMPL_LICENSE_CHECK_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_check_internval: INTEGER_32
            l_exclude_ids: LIST [STRING_32]
            l_encrypt_ping: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_license_impl_license_check_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_check_internval, l_exclude_ids, l_encrypt_ping)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_logging_impl_log_analyser_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_LOGGING_IMPL_LOG_ANALYSER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_messages_queue_size: INTEGER_32
            l_logger_config: LIST [STRING_32]
            l_messages_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_logging_impl_log_analyser_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_messages_queue_size, l_logger_config, l_messages_size)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_logging_impl_log_error_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_LOGGING_IMPL_LOG_ERROR_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_logging_impl_log_error_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_MAINTENANCE_CRX_IMPL_DATA_STORE_GARBAGE_COLLECTION_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_granite_maintenance_mandatory: BOOLEAN
            l_job_topics: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_granite_maintenance_mandatory, l_job_topics)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_MAINTENANCE_CRX_IMPL_LUCENE_BINARIES_CLEANUP_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_job_topics: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_job_topics)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_MAINTENANCE_CRX_IMPL_REVISION_CLEANUP_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_full_gc_days: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_maintenance_crx_impl_revision_cleanup_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_full_gc_days)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_monitoring_impl_script_config_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_MONITORING_IMPL_SCRIPT_CONFIG_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_script_filename: STRING_32
            l_script_display: STRING_32
            l_script_path: STRING_32
            l_script_platform: LIST [STRING_32]
            l_interval: INTEGER_32
            l_jmxdomain: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_monitoring_impl_script_config_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_script_filename, l_script_display, l_script_path, l_script_platform, l_interval, l_jmxdomain)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_oauth_server_auth_impl_oauth2_server_authentication_han
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OAUTH_SERVER_AUTH_IMPL_O_AUTH2_SERVER_AUTHENTICATION_HAN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
            l_jaas_control_flag: STRING_32
            l_jaas_realm_name: STRING_32
            l_jaas_ranking: INTEGER_32
            l_oauth_offline_validation: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_oauth_server_auth_impl_oauth2_server_authentication_han(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_jaas_control_flag, l_jaas_realm_name, l_jaas_ranking, l_oauth_offline_validation)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_oauth_server_impl_access_token_cleanup_task
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OAUTH_SERVER_IMPL_ACCESS_TOKEN_CLEANUP_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_oauth_server_impl_access_token_cleanup_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_oauth_server_impl_oauth2_client_revocation_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OAUTH_SERVER_IMPL_O_AUTH2_CLIENT_REVOCATION_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_client_revocation_active: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_oauth_server_impl_oauth2_client_revocation_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_client_revocation_active)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_oauth_server_impl_oauth2_revocation_endpoint_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OAUTH_SERVER_IMPL_O_AUTH2_REVOCATION_ENDPOINT_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_paths: STRING_32
            l_oauth_revocation_active: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_oauth_server_impl_oauth2_revocation_endpoint_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_paths, l_oauth_revocation_active)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_oauth_server_impl_oauth2_token_endpoint_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OAUTH_SERVER_IMPL_O_AUTH2_TOKEN_ENDPOINT_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_issuer: STRING_32
            l_oauth_access_token_expires_in: STRING_32
            l_osgi_http_whiteboard_servlet_pattern: STRING_32
            l_osgi_http_whiteboard_context_select: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_oauth_server_impl_oauth2_token_endpoint_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_issuer, l_oauth_access_token_expires_in, l_osgi_http_whiteboard_servlet_pattern, l_osgi_http_whiteboard_context_select)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_oauth_server_impl_oauth2_token_revocation_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OAUTH_SERVER_IMPL_O_AUTH2_TOKEN_REVOCATION_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_oauth_token_revocation_active: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_oauth_server_impl_oauth2_token_revocation_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_oauth_token_revocation_active)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_offloading_impl_offloading_configurator
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OFFLOADING_IMPL_OFFLOADING_CONFIGURATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_offloading_transporter: STRING_32
            l_offloading_cleanup_payload: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_offloading_impl_offloading_configurator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_offloading_transporter, l_offloading_cleanup_payload)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_offloading_impl_offloading_job_cloner
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OFFLOADING_IMPL_OFFLOADING_JOB_CLONER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_offloading_jobcloner_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_offloading_impl_offloading_job_cloner(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_offloading_jobcloner_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_offloading_impl_offloading_job_offloader
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OFFLOADING_IMPL_OFFLOADING_JOB_OFFLOADER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_offloading_offloader_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_offloading_impl_offloading_job_offloader(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_offloading_offloader_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_offloading_impl_transporter_offloading_agent_manager
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OFFLOADING_IMPL_TRANSPORTER_OFFLOADING_AGENT_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_offloading_agentmanager_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_offloading_impl_transporter_offloading_agent_manager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_offloading_agentmanager_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OFFLOADING_IMPL_TRANSPORTER_OFFLOADING_DEFAULT_TRANSPO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_default_transport_agent_to_worker_prefix: STRING_32
            l_default_transport_agent_to_master_prefix: STRING_32
            l_default_transport_input_package: STRING_32
            l_default_transport_output_package: STRING_32
            l_default_transport_replication_synchronous: BOOLEAN
            l_default_transport_contentpackage: BOOLEAN
            l_offloading_transporter_default_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_offloading_impl_transporter_offloading_default_transpo(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_default_transport_agent_to_worker_prefix, l_default_transport_agent_to_master_prefix, l_default_transport_input_package, l_default_transport_output_package, l_default_transport_replication_synchronous, l_default_transport_contentpackage, l_offloading_transporter_default_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OMNISEARCH_IMPL_CORE_OMNI_SEARCH_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_omnisearch_suggestion_requiretext_min: INTEGER_32
            l_omnisearch_suggestion_spellcheck_require: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_omnisearch_impl_core_omni_search_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_omnisearch_suggestion_requiretext_min, l_omnisearch_suggestion_spellcheck_require)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_optout_impl_opt_out_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_OPTOUT_IMPL_OPT_OUT_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_optout_cookies: LIST [STRING_32]
            l_optout_headers: LIST [STRING_32]
            l_optout_whitelist_cookies: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_optout_impl_opt_out_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_optout_cookies, l_optout_headers, l_optout_whitelist_cookies)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_queries_impl_hc_async_index_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_QUERIES_IMPL_HC_ASYNC_INDEX_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_indexing_critical_threshold: INTEGER_32
            l_indexing_warn_threshold: INTEGER_32
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_queries_impl_hc_async_index_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_indexing_critical_threshold, l_indexing_warn_threshold, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_queries_impl_hc_large_index_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_QUERIES_IMPL_HC_LARGE_INDEX_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_large_index_critical_threshold: INTEGER_32
            l_large_index_warn_threshold: INTEGER_32
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_queries_impl_hc_large_index_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_large_index_critical_threshold, l_large_index_warn_threshold, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_queries_impl_hc_queries_status_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_QUERIES_IMPL_HC_QUERIES_STATUS_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_queries_impl_hc_queries_status_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_queries_impl_hc_query_health_check_metrics
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_QUERIES_IMPL_HC_QUERY_HEALTH_CHECK_METRICS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_get_period: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_queries_impl_hc_query_health_check_metrics(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_get_period)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_queries_impl_hc_query_limits_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_QUERIES_IMPL_HC_QUERY_LIMITS_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_queries_impl_hc_query_limits_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_replication_hc_impl_replication_queue_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPLICATION_HC_IMPL_REPLICATION_QUEUE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_number_of_retries_allowed: INTEGER_32
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_replication_hc_impl_replication_queue_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_number_of_retries_allowed, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPLICATION_HC_IMPL_REPLICATION_TRANSPORT_USERS_HEALTH_C_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_replication_hc_impl_replication_transport_users_health_c(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_HC_IMPL_AUTHORIZABLE_NODE_NAME_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_HC_IMPL_CONTENT_SLING_SLING_CONTENT_HEALTH_C_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
            l_exclude_search_path: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags, l_exclude_search_path)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_hc_impl_continuous_rg_chealth_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_HC_IMPL_CONTINUOUS_RGC_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_hc_impl_continuous_rg_chealth_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_HC_IMPL_DEFAULT_ACCESS_USER_PROFILE_HEALTH_CHE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_hc_impl_default_logins_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_HC_IMPL_DEFAULT_LOGINS_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
            l_account_logins: LIST [STRING_32]
            l_console_logins: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_hc_impl_default_logins_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags, l_account_logins, l_console_logins)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_hc_impl_disk_space_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_HC_IMPL_DISK_SPACE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
            l_disk_space_warn_threshold: INTEGER_32
            l_disk_space_error_threshold: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_hc_impl_disk_space_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags, l_disk_space_warn_threshold, l_disk_space_error_threshold)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_hc_impl_observation_queue_length_health_check
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_HC_IMPL_OBSERVATION_QUEUE_LENGTH_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_hc_impl_observation_queue_length_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_impl_commit_stats_config
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_IMPL_COMMIT_STATS_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_interval_seconds: INTEGER_32
            l_commits_per_interval_threshold: INTEGER_32
            l_max_location_length: INTEGER_32
            l_max_details_shown: INTEGER_32
            l_min_details_percentage: INTEGER_32
            l_thread_matchers: LIST [STRING_32]
            l_max_greedy_depth: INTEGER_32
            l_greedy_stack_matchers: STRING_32
            l_stack_filters: LIST [STRING_32]
            l_stack_matchers: LIST [STRING_32]
            l_stack_categorizers: LIST [STRING_32]
            l_stack_shorteners: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_impl_commit_stats_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_interval_seconds, l_commits_per_interval_threshold, l_max_location_length, l_max_details_shown, l_min_details_percentage, l_thread_matchers, l_max_greedy_depth, l_greedy_stack_matchers, l_stack_filters, l_stack_matchers, l_stack_categorizers, l_stack_shorteners)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_repository_service_user_configuration
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REPOSITORY_SERVICE_USER_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_serviceusers_simple_subject_population: BOOLEAN
            l_serviceusers_list: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_repository_service_user_configuration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_serviceusers_simple_subject_population, l_serviceusers_list)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REQUESTS_LOGGING_IMPL_HC_REQUESTS_STATUS_HEALTH_CHECK_IM_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_resourcestatus_impl_composite_status_type
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_RESOURCESTATUS_IMPL_COMPOSITE_STATUS_TYPE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_resourcestatus_impl_composite_status_type(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_types)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_RESOURCESTATUS_IMPL_STATUS_RESOURCE_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_provider_root: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_resourcestatus_impl_status_resource_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_provider_root)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REST_ASSETS_IMPL_ASSET_CONTENT_DISPOSITION_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mime_allow_empty: BOOLEAN
            l_mime_allowed: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_rest_assets_impl_asset_content_disposition_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mime_allow_empty, l_mime_allowed)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REST_IMPL_API_ENDPOINT_RESOURCE_PROVIDER_FACTORY_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_provider_roots: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_provider_roots)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_rest_impl_servlet_default_ge_tservlet
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_REST_IMPL_SERVLET_DEFAULT_GET_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_default_limit: INTEGER_32
            l_use_absolute_uri: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_rest_impl_servlet_default_ge_tservlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_default_limit, l_use_absolute_uri)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_security_user_ui_internal_servlets_ss_lconfiguration_s
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_SECURITY_USER_UI_INTERNAL_SERVLETS_SSL_CONFIGURATION_S_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_tags: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_security_user_ui_internal_servlets_ss_lconfiguration_s(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_tags)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_security_user_user_properties_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_SECURITY_USER_USER_PROPERTIES_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_adapter_condition: STRING_32
            l_granite_userproperties_nodetypes: LIST [STRING_32]
            l_granite_userproperties_resourcetypes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_security_user_user_properties_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_adapter_condition, l_granite_userproperties_nodetypes, l_granite_userproperties_resourcetypes)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_socialgraph_impl_social_graph_factory_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_SOCIALGRAPH_IMPL_SOCIAL_GRAPH_FACTORY_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_group2member_relationship_outgoing: STRING_32
            l_group2member_excluded_outgoing: LIST [STRING_32]
            l_group2member_relationship_incoming: STRING_32
            l_group2member_excluded_incoming: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_socialgraph_impl_social_graph_factory_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_group2member_relationship_outgoing, l_group2member_excluded_outgoing, l_group2member_relationship_incoming, l_group2member_excluded_incoming)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_system_monitoring_impl_system_stats_mbean_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_SYSTEM_MONITORING_IMPL_SYSTEM_STATS_M_BEAN_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
            l_jmx_objectname: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_system_monitoring_impl_system_stats_mbean_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression, l_jmx_objectname)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_TASKMANAGEMENT_IMPL_JCR_TASK_ADAPTER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_adapter_condition: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_adapter_condition)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_TASKMANAGEMENT_IMPL_JCR_TASK_ARCHIVE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_archiving_enabled: BOOLEAN
            l_scheduler_expression: STRING_32
            l_archive_since_days_completed: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_taskmanagement_impl_jcr_task_archive_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_archiving_enabled, l_scheduler_expression, l_archive_since_days_completed)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_TASKMANAGEMENT_IMPL_PURGE_TASK_PURGE_MAINTENANCE_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_purge_completed: BOOLEAN
            l_completed_age: INTEGER_32
            l_purge_active: BOOLEAN
            l_active_age: INTEGER_32
            l_save_threshold: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_purge_completed, l_completed_age, l_purge_active, l_active_age, l_save_threshold)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_TASKMANAGEMENT_IMPL_SERVICE_TASK_MANAGER_ADAPTER_FACTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_adapter_condition: STRING_32
            l_taskmanager_admingroups: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_adapter_condition, l_taskmanager_admingroups)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_threaddump_thread_dump_collector
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_THREADDUMP_THREAD_DUMP_COLLECTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_period: INTEGER_32
            l_scheduler_run_on: STRING_32
            l_granite_threaddump_enabled: BOOLEAN
            l_granite_threaddump_dumps_per_file: INTEGER_32
            l_granite_threaddump_enable_gzip_compression: BOOLEAN
            l_granite_threaddump_enable_directories_compression: BOOLEAN
            l_granite_threaddump_enable_jstack: BOOLEAN
            l_granite_threaddump_max_backup_days: INTEGER_32
            l_granite_threaddump_backup_clean_trigger: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_threaddump_thread_dump_collector(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_period, l_scheduler_run_on, l_granite_threaddump_enabled, l_granite_threaddump_dumps_per_file, l_granite_threaddump_enable_gzip_compression, l_granite_threaddump_enable_directories_compression, l_granite_threaddump_enable_jstack, l_granite_threaddump_max_backup_days, l_granite_threaddump_backup_clean_trigger)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_TRANSLATION_CONNECTOR_MSFT_CORE_IMPL_MICROSOFT_TRANSL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_translation_factory: STRING_32
            l_default_connector_label: STRING_32
            l_default_connector_attribution: STRING_32
            l_default_connector_workspace_id: STRING_32
            l_default_connector_subscription_key: STRING_32
            l_language_map_location: STRING_32
            l_category_map_location: STRING_32
            l_retry_attempts: INTEGER_32
            l_timeout_count: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_translation_factory, l_default_connector_label, l_default_connector_attribution, l_default_connector_workspace_id, l_default_connector_subscription_key, l_language_map_location, l_category_map_location, l_retry_attempts, l_timeout_count)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_translation_core_impl_translation_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_TRANSLATION_CORE_IMPL_TRANSLATION_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_default_connector_name: STRING_32
            l_default_category: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_translation_core_impl_translation_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_default_connector_name, l_default_category)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_UI_CLIENTLIBS_IMPL_HTML_LIBRARY_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_htmllibmanager_timing: BOOLEAN
            l_htmllibmanager_debug_init_js: STRING_32
            l_htmllibmanager_minify: BOOLEAN
            l_htmllibmanager_debug: BOOLEAN
            l_htmllibmanager_gzip: BOOLEAN
            l_htmllibmanager_max_data_uri_size: INTEGER_32
            l_htmllibmanager_maxage: INTEGER_32
            l_htmllibmanager_force_cq_url_info: BOOLEAN
            l_htmllibmanager_defaultthemename: STRING_32
            l_htmllibmanager_defaultuserthemename: STRING_32
            l_htmllibmanager_clientmanager: STRING_32
            l_htmllibmanager_path_list: LIST [STRING_32]
            l_htmllibmanager_excluded_path_list: LIST [STRING_32]
            l_htmllibmanager_processor_js: LIST [STRING_32]
            l_htmllibmanager_processor_css: LIST [STRING_32]
            l_htmllibmanager_longcache_patterns: LIST [STRING_32]
            l_htmllibmanager_longcache_format: STRING_32
            l_htmllibmanager_use_file_system_output_cache: BOOLEAN
            l_htmllibmanager_file_system_output_cache_location: STRING_32
            l_htmllibmanager_disable_replacement: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_htmllibmanager_timing, l_htmllibmanager_debug_init_js, l_htmllibmanager_minify, l_htmllibmanager_debug, l_htmllibmanager_gzip, l_htmllibmanager_max_data_uri_size, l_htmllibmanager_maxage, l_htmllibmanager_force_cq_url_info, l_htmllibmanager_defaultthemename, l_htmllibmanager_defaultuserthemename, l_htmllibmanager_clientmanager, l_htmllibmanager_path_list, l_htmllibmanager_excluded_path_list, l_htmllibmanager_processor_js, l_htmllibmanager_processor_css, l_htmllibmanager_longcache_patterns, l_htmllibmanager_longcache_format, l_htmllibmanager_use_file_system_output_cache, l_htmllibmanager_file_system_output_cache_location, l_htmllibmanager_disable_replacement)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CONSOLE_FRAGS_WORKFLOW_WITHDRAW_FEATURE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_console_frags_workflow_withdraw_feature(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_console_publish_workflow_publish_event_service
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CONSOLE_PUBLISH_WORKFLOW_PUBLISH_EVENT_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_granite_workflow__workflow_publish_event_service_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_console_publish_workflow_publish_event_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_granite_workflow__workflow_publish_event_service_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CORE_JCR_WORKFLOW_BUCKET_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_bucket_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_core_jcr_workflow_bucket_manager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_bucket_size)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_core_job_external_process_job_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CORE_JOB_EXTERNAL_PROCESS_JOB_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_default_timeout: INTEGER_32
            l_max_timeout: INTEGER_32
            l_default_period: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_core_job_external_process_job_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_default_timeout, l_max_timeout, l_default_period)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_core_job_job_handler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CORE_JOB_JOB_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_job_topics: LIST [STRING_32]
            l_allow_self_process_termination: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_core_job_job_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_job_topics, l_allow_self_process_termination)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CORE_OFFLOADING_WORKFLOW_OFFLOADING_JOB_CONSUM_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_job_topics: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_job_topics)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_core_payload_map_cache
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CORE_PAYLOAD_MAP_CACHE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_get_system_workflow_models: LIST [STRING_32]
            l_get_package_root_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_core_payload_map_cache(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_get_system_workflow_models, l_get_package_root_path)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_core_payloadmap_payload_move_listener
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CORE_PAYLOADMAP_PAYLOAD_MOVE_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_payload_move_white_list: LIST [STRING_32]
            l_payload_move_handle_from_workflow_process: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_core_payloadmap_payload_move_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_payload_move_white_list, l_payload_move_handle_from_workflow_process)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_core_workflow_config
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CORE_WORKFLOW_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_workflow_config_workflow_packages_root_path: LIST [STRING_32]
            l_cq_workflow_config_workflow_process_legacy_mode: BOOLEAN
            l_cq_workflow_config_allow_locking: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_core_workflow_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_workflow_config_workflow_packages_root_path, l_cq_workflow_config_workflow_process_legacy_mode, l_cq_workflow_config_allow_locking)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_core_workflow_session_factory
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_CORE_WORKFLOW_SESSION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_granite_workflowinbox_sort_property_name: STRING_32
            l_granite_workflowinbox_sort_order: STRING_32
            l_cq_workflow_job_retry: INTEGER_32
            l_cq_workflow_superuser: LIST [STRING_32]
            l_granite_workflow_inbox_query_size: INTEGER_32
            l_granite_workflow_admin_user_group_filter: BOOLEAN
            l_granite_workflow_enforce_workitem_assignee_permissions: BOOLEAN
            l_granite_workflow_enforce_workflow_initiator_permissions: BOOLEAN
            l_granite_workflow_inject_tenant_id_in_job_topics: BOOLEAN
            l_granite_workflow_max_purge_save_threshold: INTEGER_32
            l_granite_workflow_max_purge_query_count: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_core_workflow_session_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_granite_workflowinbox_sort_property_name, l_granite_workflowinbox_sort_order, l_cq_workflow_job_retry, l_cq_workflow_superuser, l_granite_workflow_inbox_query_size, l_granite_workflow_admin_user_group_filter, l_granite_workflow_enforce_workitem_assignee_permissions, l_granite_workflow_enforce_workflow_initiator_permissions, l_granite_workflow_inject_tenant_id_in_job_topics, l_granite_workflow_max_purge_save_threshold, l_granite_workflow_max_purge_query_count)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_granite_workflow_purge_scheduler
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_GRANITE_WORKFLOW_PURGE_SCHEDULER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduledpurge_name: STRING_32
            l_scheduledpurge_workflow_status: STRING_32
            l_scheduledpurge_model_ids: LIST [STRING_32]
            l_scheduledpurge_daysold: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_granite_workflow_purge_scheduler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduledpurge_name, l_scheduledpurge_workflow_status, l_scheduledpurge_model_ids, l_scheduledpurge_daysold)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_octopus_ncomm_bootstrap
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_OCTOPUS_NCOMM_BOOTSTRAP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_connections: INTEGER_32
            l_max_requests: INTEGER_32
            l_request_timeout: INTEGER_32
            l_request_retries: INTEGER_32
            l_launch_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_octopus_ncomm_bootstrap(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_connections, l_max_requests, l_request_timeout, l_request_retries, l_launch_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_SOCIAL_INTEGRATIONS_LIVEFYRE_USER_PINGFORPULL_IMPL_PING_PULL_S_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_communities_integration_livefyre_sling_event_filter: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_communities_integration_livefyre_sling_event_filter)
            assert ("not_implemented", False)
        end
    
    test_com_adobe_xmp_worker_files_ncomm_xm_pfiles_ncomm
            -- 
            -- 
            --  
        local
            l_response: COM_ADOBE_XMP_WORKER_FILES_NCOMM_XMP_FILES_N_COMM_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_connections: STRING_32
            l_max_requests: STRING_32
            l_request_timeout: STRING_32
            l_log_dir: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_adobe_xmp_worker_files_ncomm_xm_pfiles_ncomm(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_connections, l_max_requests, l_request_timeout, l_log_dir)
            assert ("not_implemented", False)
        end
    
    test_com_day_commons_datasource_jdbcpool_jdbc_pool_service
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_COMMONS_DATASOURCE_JDBCPOOL_JDBC_POOL_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_jdbc_driver_class: STRING_32
            l_jdbc_connection_uri: STRING_32
            l_jdbc_username: STRING_32
            l_jdbc_password: STRING_32
            l_jdbc_validation_query: STRING_32
            l_default_readonly: BOOLEAN
            l_default_autocommit: BOOLEAN
            l_pool_size: INTEGER_32
            l_pool_max_wait_msec: INTEGER_32
            l_datasource_name: STRING_32
            l_datasource_svc_properties: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_commons_datasource_jdbcpool_jdbc_pool_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_jdbc_driver_class, l_jdbc_connection_uri, l_jdbc_username, l_jdbc_password, l_jdbc_validation_query, l_default_readonly, l_default_autocommit, l_pool_size, l_pool_max_wait_msec, l_datasource_name, l_datasource_svc_properties)
            assert ("not_implemented", False)
        end
    
    test_com_day_commons_httpclient
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_COMMONS_HTTPCLIENT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_proxy_enabled: BOOLEAN
            l_proxy_host: STRING_32
            l_proxy_user: STRING_32
            l_proxy_password: STRING_32
            l_proxy_ntlm_host: STRING_32
            l_proxy_ntlm_domain: STRING_32
            l_proxy_exceptions: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_commons_httpclient(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_proxy_enabled, l_proxy_host, l_proxy_user, l_proxy_password, l_proxy_ntlm_host, l_proxy_ntlm_domain, l_proxy_exceptions)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_impl_store_properties_change_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_IMPL_STORE_PROPERTIES_CHANGE_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_store_listener_additional_store_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_impl_store_properties_change_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_store_listener_additional_store_paths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_SITECATALYST_IMPL_EXPORTER_CLASSIFICATIONS_EXPORTE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_allowed_paths: LIST [STRING_32]
            l_cq_analytics_saint_exporter_pagesize: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_allowed_paths, l_cq_analytics_saint_exporter_pagesize)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_SITECATALYST_IMPL_IMPORTER_REPORT_IMPORTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_report_fetch_attempts: INTEGER_32
            l_report_fetch_delay: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_sitecatalyst_impl_importer_report_importer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_report_fetch_attempts, l_report_fetch_delay)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_SITECATALYST_IMPL_SITECATALYST_ADAPTER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_analytics_adapterfactory_contextstores: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_analytics_adapterfactory_contextstores)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_SITECATALYST_IMPL_SITECATALYST_HTTP_CLIENT_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_analytics_sitecatalyst_service_datacenter_url: LIST [STRING_32]
            l_devhostnamepatterns: LIST [STRING_32]
            l_connection_timeout: INTEGER_32
            l_socket_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_analytics_sitecatalyst_service_datacenter_url, l_devhostnamepatterns, l_connection_timeout, l_socket_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_testandtarget_impl_account_options_updater
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_TESTANDTARGET_IMPL_ACCOUNT_OPTIONS_UPDATER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_analytics_testandtarget_accountoptionsupdater_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_testandtarget_impl_account_options_updater(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_analytics_testandtarget_accountoptionsupdater_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_TESTANDTARGET_IMPL_DELETE_AUTHOR_ACTIVITY_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_analytics_testandtarget_deleteauthoractivitylistener_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_analytics_testandtarget_deleteauthoractivitylistener_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_TESTANDTARGET_IMPL_PUSH_AUTHOR_CAMPAIGN_PAGE_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_testandtarget_impl_segment_importer
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_TESTANDTARGET_IMPL_SEGMENT_IMPORTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_analytics_testandtarget_segmentimporter_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_testandtarget_impl_segment_importer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_analytics_testandtarget_segmentimporter_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_testandtarget_impl_service_web_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_TESTANDTARGET_IMPL_SERVICE_WEB_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_endpoint_uri: STRING_32
            l_connection_timeout: INTEGER_32
            l_socket_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_testandtarget_impl_service_web_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_endpoint_uri, l_connection_timeout, l_socket_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_TESTANDTARGET_IMPL_SERVLETS_ADMIN_SERVER_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_testandtarget_endpoint_url: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_testandtarget_endpoint_url)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_ANALYTICS_TESTANDTARGET_IMPL_TESTANDTARGET_HTTP_CLIENT_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_analytics_testandtarget_api_url: STRING_32
            l_cq_analytics_testandtarget_timeout: INTEGER_32
            l_cq_analytics_testandtarget_sockettimeout: INTEGER_32
            l_cq_analytics_testandtarget_recommendations_url_replace: STRING_32
            l_cq_analytics_testandtarget_recommendations_url_replacewith: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_analytics_testandtarget_api_url, l_cq_analytics_testandtarget_timeout, l_cq_analytics_testandtarget_sockettimeout, l_cq_analytics_testandtarget_recommendations_url_replace, l_cq_analytics_testandtarget_recommendations_url_replacewith)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_auth_impl_cug_cug_support_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_AUTH_IMPL_CUG_CUG_SUPPORT_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cug_exempted_principals: LIST [STRING_32]
            l_cug_enabled: BOOLEAN
            l_cug_principals_regex: STRING_32
            l_cug_principals_replacement: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_auth_impl_cug_cug_support_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cug_exempted_principals, l_cug_enabled, l_cug_principals_regex, l_cug_principals_replacement)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_auth_impl_login_selector_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_AUTH_IMPL_LOGIN_SELECTOR_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
            l_service_ranking: INTEGER_32
            l_auth_loginselector_mappings: LIST [STRING_32]
            l_auth_loginselector_changepw_mappings: LIST [STRING_32]
            l_auth_loginselector_defaultloginpage: STRING_32
            l_auth_loginselector_defaultchangepwpage: STRING_32
            l_auth_loginselector_handle: LIST [STRING_32]
            l_auth_loginselector_handle_all_extensions: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_auth_impl_login_selector_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_service_ranking, l_auth_loginselector_mappings, l_auth_loginselector_changepw_mappings, l_auth_loginselector_defaultloginpage, l_auth_loginselector_defaultchangepwpage, l_auth_loginselector_handle, l_auth_loginselector_handle_all_extensions)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_commons_impl_externalizer_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_COMMONS_IMPL_EXTERNALIZER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_externalizer_domains: LIST [STRING_32]
            l_externalizer_host: STRING_32
            l_externalizer_contextpath: STRING_32
            l_externalizer_encodedpath: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_commons_impl_externalizer_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_externalizer_domains, l_externalizer_host, l_externalizer_contextpath, l_externalizer_encodedpath)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_commons_servlets_root_mapping_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_COMMONS_SERVLETS_ROOT_MAPPING_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_rootmapping_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_commons_servlets_root_mapping_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_rootmapping_target)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_COMPAT_CODEUPGRADE_IMPL_CODE_UPGRADE_EXECUTION_CONDITION_CHECKE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_codeupgradetasks: LIST [STRING_32]
            l_codeupgradetaskfilters: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_codeupgradetasks, l_codeupgradetaskfilters)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_COMPAT_CODEUPGRADE_IMPL_UPGRADE_TASK_IGNORE_LIST_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_upgrade_task_ignore_list: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_upgrade_task_ignore_list)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_COMPAT_CODEUPGRADE_IMPL_VERSION_RANGE_TASK_IGNORELIST_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_effective_bundle_list_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_effective_bundle_list_path)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_contentsync_impl_content_sync_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_CONTENTSYNC_IMPL_CONTENT_SYNC_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_contentsync_fallback_authorizable: STRING_32
            l_contentsync_fallback_updateuser: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_contentsync_impl_content_sync_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_contentsync_fallback_authorizable, l_contentsync_fallback_updateuser)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_commons_handler_standard_image_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_COMMONS_HANDLER_STANDARD_IMAGE_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_large_file_threshold: INTEGER_32
            l_large_comment_threshold: INTEGER_32
            l_cq_dam_enable_ext_meta_extraction: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_commons_handler_standard_image_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_large_file_threshold, l_large_comment_threshold, l_cq_dam_enable_ext_meta_extraction)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_commons_metadata_xmp_filter_black_white
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_COMMONS_METADATA_XMP_FILTER_BLACK_WHITE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_xmp_filter_apply_whitelist: BOOLEAN
            l_xmp_filter_whitelist: LIST [STRING_32]
            l_xmp_filter_apply_blacklist: BOOLEAN
            l_xmp_filter_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_commons_metadata_xmp_filter_black_white(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_xmp_filter_apply_whitelist, l_xmp_filter_whitelist, l_xmp_filter_apply_blacklist, l_xmp_filter_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_commons_util_impl_asset_cache_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_COMMONS_UTIL_IMPL_ASSET_CACHE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_large_file_min: INTEGER_32
            l_cache_apply: BOOLEAN
            l_mime_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_commons_util_impl_asset_cache_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_large_file_min, l_cache_apply, l_mime_types)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_ANNOTATION_PDF_ANNOTATION_PDF_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_config_annotation_pdf_document_width: INTEGER_32
            l_cq_dam_config_annotation_pdf_document_height: INTEGER_32
            l_cq_dam_config_annotation_pdf_document_padding_horizontal: INTEGER_32
            l_cq_dam_config_annotation_pdf_document_padding_vertical: INTEGER_32
            l_cq_dam_config_annotation_pdf_font_size: INTEGER_32
            l_cq_dam_config_annotation_pdf_font_color: STRING_32
            l_cq_dam_config_annotation_pdf_font_family: STRING_32
            l_cq_dam_config_annotation_pdf_font_light: STRING_32
            l_cq_dam_config_annotation_pdf_margin_text_image: INTEGER_32
            l_cq_dam_config_annotation_pdf_min_image_height: INTEGER_32
            l_cq_dam_config_annotation_pdf_review_status_width: INTEGER_32
            l_cq_dam_config_annotation_pdf_review_status_color_approved: STRING_32
            l_cq_dam_config_annotation_pdf_review_status_color_rejected: STRING_32
            l_cq_dam_config_annotation_pdf_review_status_color_changes_requested: STRING_32
            l_cq_dam_config_annotation_pdf_annotation_marker_width: INTEGER_32
            l_cq_dam_config_annotation_pdf_asset_minheight: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_config_annotation_pdf_document_width, l_cq_dam_config_annotation_pdf_document_height, l_cq_dam_config_annotation_pdf_document_padding_horizontal, l_cq_dam_config_annotation_pdf_document_padding_vertical, l_cq_dam_config_annotation_pdf_font_size, l_cq_dam_config_annotation_pdf_font_color, l_cq_dam_config_annotation_pdf_font_family, l_cq_dam_config_annotation_pdf_font_light, l_cq_dam_config_annotation_pdf_margin_text_image, l_cq_dam_config_annotation_pdf_min_image_height, l_cq_dam_config_annotation_pdf_review_status_width, l_cq_dam_config_annotation_pdf_review_status_color_approved, l_cq_dam_config_annotation_pdf_review_status_color_rejected, l_cq_dam_config_annotation_pdf_review_status_color_changes_requested, l_cq_dam_config_annotation_pdf_annotation_marker_width, l_cq_dam_config_annotation_pdf_asset_minheight)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_asset_move_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_ASSET_MOVE_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_asset_move_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_assethome_asset_home_page_configuration
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_ASSETHOME_ASSET_HOME_PAGE_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_is_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_assethome_asset_home_page_configuration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_is_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_ASSETLINKSHARE_ADHOC_ASSET_SHARE_PROXY_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_adhoc_asset_share_prezip_maxcontentsize: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_adhoc_asset_share_prezip_maxcontentsize)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_CACHE_CQ_BUFFERED_IMAGE_CACHE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_image_cache_max_memory: INTEGER_32
            l_cq_dam_image_cache_max_age: INTEGER_32
            l_cq_dam_image_cache_max_dimension: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_cache_cq_buffered_image_cache(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_image_cache_max_memory, l_cq_dam_image_cache_max_age, l_cq_dam_image_cache_max_dimension)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_dam_change_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_DAM_CHANGE_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_changeeventlistener_observed_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_dam_change_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_changeeventlistener_observed_paths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_dam_event_purge_service
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_DAM_EVENT_PURGE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
            l_max_saved_activities: INTEGER_32
            l_save_interval: INTEGER_32
            l_enable_activity_purge: BOOLEAN
            l_event_types: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_dam_event_purge_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression, l_max_saved_activities, l_save_interval, l_enable_activity_purge, l_event_types)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_dam_event_recorder_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_DAM_EVENT_RECORDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_filter: STRING_32
            l_event_queue_length: INTEGER_32
            l_eventrecorder_enabled: BOOLEAN
            l_eventrecorder_blacklist: LIST [STRING_32]
            l_eventrecorder_eventtypes: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_dam_event_recorder_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_filter, l_event_queue_length, l_eventrecorder_enabled, l_eventrecorder_blacklist, l_eventrecorder_eventtypes)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_event_dam_event_audit_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_EVENT_DAM_EVENT_AUDIT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_filter: STRING_32
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_event_dam_event_audit_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_filter, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_expiry_notification_job_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_EXPIRY_NOTIFICATION_JOB_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_expiry_notification_scheduler_istimebased: BOOLEAN
            l_cq_dam_expiry_notification_scheduler_timebased_rule: STRING_32
            l_cq_dam_expiry_notification_scheduler_period_rule: INTEGER_32
            l_send_email: BOOLEAN
            l_asset_expired_limit: INTEGER_32
            l_prior_notification_seconds: INTEGER_32
            l_cq_dam_expiry_notification_url_protocol: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_expiry_notification_job_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_expiry_notification_scheduler_istimebased, l_cq_dam_expiry_notification_scheduler_timebased_rule, l_cq_dam_expiry_notification_scheduler_period_rule, l_send_email, l_asset_expired_limit, l_prior_notification_seconds, l_cq_dam_expiry_notification_url_protocol)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_FOLDERMETADATASCHEMA_FOLDER_METADATA_SCHEMA_FEAT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_is_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_is_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_GFX_COMMONS_GFX_RENDERER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_skip_bufferedcache: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_gfx_commons_gfx_renderer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_skip_bufferedcache)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_handler_ep_sformat_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_HANDLER_EPS_FORMAT_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mimetype: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_handler_ep_sformat_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mimetype)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_handler_indesign_format_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_HANDLER_INDESIGN_FORMAT_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mimetype: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_handler_indesign_format_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mimetype)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_handler_jpeg_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_HANDLER_JPEG_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_enable_ext_meta_extraction: BOOLEAN
            l_large_file_threshold: INTEGER_32
            l_large_comment_threshold: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_handler_jpeg_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_enable_ext_meta_extraction, l_large_file_threshold, l_large_comment_threshold)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_handler_xmp_ncomm_xm_phandler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_HANDLER_XMP_N_COMM_XMP_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_xmphandler_cq_formats: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_handler_xmp_ncomm_xm_phandler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_xmphandler_cq_formats)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_JMX_ASSET_INDEX_UPDATE_MONITOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_jmx_objectname: STRING_32
            l_property_measure_enabled: BOOLEAN
            l_property_name: STRING_32
            l_property_max_wait_ms: INTEGER_32
            l_property_max_rate: REAL_32
            l_fulltext_measure_enabled: BOOLEAN
            l_fulltext_name: STRING_32
            l_fulltext_max_wait_ms: INTEGER_32
            l_fulltext_max_rate: REAL_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_jmx_asset_index_update_monitor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_jmx_objectname, l_property_measure_enabled, l_property_name, l_property_max_wait_ms, l_property_max_rate, l_fulltext_measure_enabled, l_fulltext_name, l_fulltext_max_wait_ms, l_fulltext_max_rate)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_jmx_asset_migration_mbean_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_JMX_ASSET_MIGRATION_M_BEAN_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_jmx_objectname: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_jmx_asset_migration_mbean_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_jmx_objectname)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_JMX_ASSET_UPDATE_MONITOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_jmx_objectname: STRING_32
            l_active: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_jmx_objectname, l_active)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_JOBS_METADATAEXPORT_ASYNC_METADATA_EXPORT_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_operation: STRING_32
            l_email_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_operation, l_email_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_JOBS_METADATAIMPORT_ASYNC_METADATA_IMPORT_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_operation: STRING_32
            l_operation_icon: STRING_32
            l_topic_name: STRING_32
            l_email_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_operation, l_operation_icon, l_topic_name, l_email_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_lightbox_lightbox_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_LIGHTBOX_LIGHTBOX_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_paths: STRING_32
            l_sling_servlet_methods: LIST [STRING_32]
            l_cq_dam_enable_anonymous: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_lightbox_lightbox_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_paths, l_sling_servlet_methods, l_cq_dam_enable_anonymous)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_metadata_editor_select_component_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_METADATA_EDITOR_SELECT_COMPONENT_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_granitedata: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_metadata_editor_select_component_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_granitedata)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_MIME_TYPE_ASSET_UPLOAD_RESTRICTION_HELPER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_allow_all_mime: BOOLEAN
            l_cq_dam_allowed_asset_mimes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_allow_all_mime, l_cq_dam_allowed_asset_mimes)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_MIME_TYPE_DAM_MIME_TYPE_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_detect_asset_mime_from_content: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_detect_asset_mime_from_content)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_missing_metadata_notification_job
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_MISSING_METADATA_NOTIFICATION_JOB_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_missingmetadata_notification_scheduler_istimebased: BOOLEAN
            l_cq_dam_missingmetadata_notification_scheduler_timebased_rule: STRING_32
            l_cq_dam_missingmetadata_notification_scheduler_period_rule: INTEGER_32
            l_cq_dam_missingmetadata_notification_recipient: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_missing_metadata_notification_job(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_missingmetadata_notification_scheduler_istimebased, l_cq_dam_missingmetadata_notification_scheduler_timebased_rule, l_cq_dam_missingmetadata_notification_scheduler_period_rule, l_cq_dam_missingmetadata_notification_recipient)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_PROCESS_SEND_TRANSIENT_WORKFLOW_COMPLETED_EMAIL_PR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_process_label: STRING_32
            l_notify_on__complete: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_process_label, l_notify_on__complete)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_process_text_extraction_process
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_PROCESS_TEXT_EXTRACTION_PROCESS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mime_types: LIST [STRING_32]
            l_max_extract: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_process_text_extraction_process(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mime_types, l_max_extract)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_rendition_maker_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_RENDITION_MAKER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_xmp_propagate: BOOLEAN
            l_xmp_excludes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_rendition_maker_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_xmp_propagate, l_xmp_excludes)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_reports_report_export_service
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_REPORTS_REPORT_EXPORT_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_query_batch_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_reports_report_export_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_query_batch_size)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_reports_report_purge_service
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_REPORTS_REPORT_PURGE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
            l_max_saved_reports: INTEGER_32
            l_time_duration: INTEGER_32
            l_enable_report_purge: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_reports_report_purge_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression, l_max_saved_reports, l_time_duration, l_enable_report_purge)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_asset_download_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_ASSET_DOWNLOAD_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_asset_download_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_asset_status_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_ASSET_STATUS_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_batch_status_maxassets: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_asset_status_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_batch_status_maxassets)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_asset_xm_psearch_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_ASSET_XMP_SEARCH_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_batch_indesign_maxassets: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_asset_xm_psearch_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_batch_indesign_maxassets)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_BATCH_METADATA_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_batch_metadata_asset_default: LIST [STRING_32]
            l_cq_dam_batch_metadata_collection_default: LIST [STRING_32]
            l_cq_dam_batch_metadata_maxresources: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_batch_metadata_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_batch_metadata_asset_default, l_cq_dam_batch_metadata_collection_default, l_cq_dam_batch_metadata_maxresources)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_binary_provider_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_BINARY_PROVIDER_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_resource_types: LIST [STRING_32]
            l_sling_servlet_methods: LIST [STRING_32]
            l_cq_dam_drm_enable: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_binary_provider_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_resource_types, l_sling_servlet_methods, l_cq_dam_drm_enable)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_collection_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_COLLECTION_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_batch_collection_properties: LIST [STRING_32]
            l_cq_dam_batch_collection_maxcollections: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_collection_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_batch_collection_properties, l_cq_dam_batch_collection_maxcollections)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_collections_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_COLLECTIONS_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_batch_collections_properties: LIST [STRING_32]
            l_cq_dam_batch_collections_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_collections_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_batch_collections_properties, l_cq_dam_batch_collections_limit)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_companion_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_COMPANION_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_more__info: STRING_32
            l_mntoverlaydamguicontentassetsmoreinfo_htmlpath: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_companion_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_more__info, l_mntoverlaydamguicontentassetsmoreinfo_htmlpath)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_create_asset_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_CREATE_ASSET_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_detect_duplicate: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_create_asset_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_detect_duplicate)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_DAM_CONTENT_DISPOSITION_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_mime_type_blacklist: LIST [STRING_32]
            l_cq_dam_empty_mime: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_mime_type_blacklist, l_cq_dam_empty_mime)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_guid_lookup_filter
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_GUID_LOOKUP_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_core_guidlookupfilter_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_guid_lookup_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_core_guidlookupfilter_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_health_check_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_HEALTH_CHECK_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_sync_workflow_id: STRING_32
            l_cq_dam_sync_folder_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_health_check_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_sync_workflow_id, l_cq_dam_sync_folder_types)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_metadata_get_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_METADATA_GET_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_resource_types: STRING_32
            l_sling_servlet_methods: STRING_32
            l_sling_servlet_extensions: STRING_32
            l_sling_servlet_selectors: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_metadata_get_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_resource_types, l_sling_servlet_methods, l_sling_servlet_extensions, l_sling_servlet_selectors)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_MULTIPLE_LICENSE_ACCEPT_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_drm_enable: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_drm_enable)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_servlet_resource_collection_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_SERVLET_RESOURCE_COLLECTION_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_resource_types: LIST [STRING_32]
            l_sling_servlet_methods: STRING_32
            l_sling_servlet_selectors: STRING_32
            l_download_config: STRING_32
            l_view_selector: STRING_32
            l_send_email: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_servlet_resource_collection_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_resource_types, l_sling_servlet_methods, l_sling_servlet_selectors, l_download_config, l_view_selector, l_send_email)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_UI_PREVIEW_FOLDER_PREVIEW_UPDATER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_create_preview_enabled: BOOLEAN
            l_update_preview_enabled: BOOLEAN
            l_queue_size: INTEGER_32
            l_folder_preview_rendition_regex: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_create_preview_enabled, l_update_preview_enabled, l_queue_size, l_folder_preview_rendition_regex)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_impl_unzip_unzip_config
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_IMPL_UNZIP_UNZIP_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_config_unzip_maxuncompressedsize: INTEGER_32
            l_cq_dam_config_unzip_encoding: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_impl_unzip_unzip_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_config_unzip_maxuncompressedsize, l_cq_dam_config_unzip_encoding)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_process_exif_tool_extract_metadata_process
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_PROCESS_EXIF_TOOL_EXTRACT_METADATA_PROCESS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_process_label: STRING_32
            l_cq_dam_enable_sha1: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_process_exif_tool_extract_metadata_process(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_process_label, l_cq_dam_enable_sha1)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_process_extract_metadata_process
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_PROCESS_EXTRACT_METADATA_PROCESS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_process_label: STRING_32
            l_cq_dam_enable_sha1: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_process_extract_metadata_process(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_process_label, l_cq_dam_enable_sha1)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_core_process_metadata_processor_process
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_CORE_PROCESS_METADATA_PROCESSOR_PROCESS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_process_label: STRING_32
            l_cq_dam_enable_sha1: BOOLEAN
            l_cq_dam_metadata_xssprotected_properties: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_core_process_metadata_processor_process(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_process_label, l_cq_dam_enable_sha1, l_cq_dam_metadata_xssprotected_properties)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_handler_ffmpeg_locator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_HANDLER_FFMPEG_LOCATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_executable_searchpath: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_handler_ffmpeg_locator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_executable_searchpath)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_HANDLER_GIBSON_FONTMANAGER_IMPL_FONT_MANAGER_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_filter: STRING_32
            l_fontmgr_system_font_dir: LIST [STRING_32]
            l_fontmgr_adobe_font_dir: STRING_32
            l_fontmgr_customer_font_dir: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_filter, l_fontmgr_system_font_dir, l_fontmgr_adobe_font_dir, l_fontmgr_customer_font_dir)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_handler_standard_pdf_pdf_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_HANDLER_STANDARD_PDF_PDF_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_raster_annotation: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_handler_standard_pdf_pdf_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_raster_annotation)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_handler_standard_ps_post_script_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_HANDLER_STANDARD_PS_POST_SCRIPT_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_raster_annotation: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_handler_standard_ps_post_script_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_raster_annotation)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_handler_standard_psd_psd_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_HANDLER_STANDARD_PSD_PSD_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_large_file_threshold: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_handler_standard_psd_psd_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_large_file_threshold)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_ids_impl_id_sjob_processor
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_IDS_IMPL_IDS_JOB_PROCESSOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enable_multisession: BOOLEAN
            l_ids_cc_enable: BOOLEAN
            l_enable_retry: BOOLEAN
            l_enable_retry_scripterror: BOOLEAN
            l_externalizer_domain_cqhost: STRING_32
            l_externalizer_domain_http: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_ids_impl_id_sjob_processor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enable_multisession, l_ids_cc_enable, l_enable_retry, l_enable_retry_scripterror, l_externalizer_domain_cqhost, l_externalizer_domain_http)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_ids_impl_id_spool_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_IDS_IMPL_IDS_POOL_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_errors_to_blacklist: INTEGER_32
            l_retry_interval_to_whitelist: INTEGER_32
            l_connect_timeout: INTEGER_32
            l_socket_timeout: INTEGER_32
            l_process_label: STRING_32
            l_connection_use_max: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_ids_impl_id_spool_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_errors_to_blacklist, l_retry_interval_to_whitelist, l_connect_timeout, l_socket_timeout, l_process_label, l_connection_use_max)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_indd_impl_handler_indesign_xm_phandler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_INDD_IMPL_HANDLER_INDESIGN_XMP_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_process_label: STRING_32
            l_extract_pages: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_indd_impl_handler_indesign_xm_phandler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_process_label, l_extract_pages)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_INDD_IMPL_SERVLET_SNIPPET_CREATION_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_snippetcreation_maxcollections: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_snippetcreation_maxcollections)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_indd_process_in_dd_media_extract_process
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_INDD_PROCESS_INDD_MEDIA_EXTRACT_PROCESS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_process_label: STRING_32
            l_cq_dam_indd_pages_regex: STRING_32
            l_ids_job_decoupled: BOOLEAN
            l_ids_job_workflow_model: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_indd_process_in_dd_media_extract_process(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_process_label, l_cq_dam_indd_pages_regex, l_ids_job_decoupled, l_ids_job_workflow_model)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_PERFORMANCE_INTERNAL_ASSET_PERFORMANCE_DATA_HANDLER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_batch_commit_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_performance_internal_asset_performance_data_handler_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_batch_commit_size)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_performance_internal_asset_performance_report_sync_job
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_PERFORMANCE_INTERNAL_ASSET_PERFORMANCE_REPORT_SYNC_JOB_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_performance_internal_asset_performance_report_sync_job(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_PIM_IMPL_SOURCING_UPLOAD_PROCESS_PRODUCT_ASSETS_UPLOAD_PRO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_delete_zip_file: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_delete_zip_file)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_S7DAM_COMMON_ANALYTICS_IMPL_S7DAM_DYNAMIC_MEDIA_CONFIG_EVEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_S7DAM_COMMON_ANALYTICS_IMPL_SITE_CATALYST_REPORT_RUNNER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
            l_scheduler_concurrent: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression, l_scheduler_concurrent)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_s7dam_common_post_servlets_set_create_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_S7DAM_COMMON_POST_SERVLETS_SET_CREATE_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_post_operation: STRING_32
            l_sling_servlet_methods: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_s7dam_common_post_servlets_set_create_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_post_operation, l_sling_servlet_methods)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_S7DAM_COMMON_POST_SERVLETS_SET_MODIFY_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_post_operation: STRING_32
            l_sling_servlet_methods: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_post_operation, l_sling_servlet_methods)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_S7DAM_COMMON_PROCESS_VIDEO_THUMBNAIL_DOWNLOAD_PROCESS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_process_label: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_process_label)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_S7DAM_COMMON_S7DAM_DAM_CHANGE_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_s7dam_damchangeeventlistener_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_s7dam_damchangeeventlistener_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_S7DAM_COMMON_SERVLETS_S7DAM_PRODUCT_INFO_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_paths: STRING_32
            l_sling_servlet_methods: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_paths, l_sling_servlet_methods)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_S7DAM_COMMON_VIDEO_IMPL_VIDEO_PROXY_CLIENT_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name: INTEGER_32
            l_cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name: INTEGER_32
            l_cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name: INTEGER_32
            l_cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name: INTEGER_32
            l_cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name: INTEGER_32
            l_cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name: INTEGER_32
            l_cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name, l_cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name, l_cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name, l_cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name, l_cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name, l_cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name, l_cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_scene7_impl_scene7_ap_iclient_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_SCENE7_IMPL_SCENE7_API_CLIENT_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_scene7_apiclient_recordsperpage_nofilter_name: INTEGER_32
            l_cq_dam_scene7_apiclient_recordsperpage_withfilter_name: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_scene7_impl_scene7_ap_iclient_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_scene7_apiclient_recordsperpage_nofilter_name, l_cq_dam_scene7_apiclient_recordsperpage_withfilter_name)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_SCENE7_IMPL_SCENE7_ASSET_MIME_TYPE_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_scene7_assetmimetypeservice_mapping: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_scene7_assetmimetypeservice_mapping)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_scene7_impl_scene7_configuration_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_SCENE7_IMPL_SCENE7_CONFIGURATION_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_scene7_configurationeventlistener_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_scene7_impl_scene7_configuration_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_scene7_configurationeventlistener_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_SCENE7_IMPL_SCENE7_DAM_CHANGE_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_scene7_damchangeeventlistener_enabled: BOOLEAN
            l_cq_dam_scene7_damchangeeventlistener_observed_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_scene7_damchangeeventlistener_enabled, l_cq_dam_scene7_damchangeeventlistener_observed_paths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_SCENE7_IMPL_SCENE7_FLASH_TEMPLATES_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scene7_flash_templates_rti: STRING_32
            l_scene7_flash_templates_rsi: STRING_32
            l_scene7_flash_templates_rb: STRING_32
            l_scene7_flash_templates_rurl: STRING_32
            l_scene7_flash_template_url_format_parameter: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scene7_flash_templates_rti, l_scene7_flash_templates_rsi, l_scene7_flash_templates_rb, l_scene7_flash_templates_rurl, l_scene7_flash_template_url_format_parameter)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_scene7_impl_scene7_upload_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_SCENE7_IMPL_SCENE7_UPLOAD_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_dam_scene7_uploadservice_activejobtimeout_label: INTEGER_32
            l_cq_dam_scene7_uploadservice_connectionmaxperroute_label: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_scene7_impl_scene7_upload_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_dam_scene7_uploadservice_activejobtimeout_label, l_cq_dam_scene7_uploadservice_connectionmaxperroute_label)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_STOCK_INTEGRATION_IMPL_CACHE_STOCK_CACHE_CONFIGURATION_SER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_get_cache_expiration_unit: STRING_32
            l_get_cache_expiration_value: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_get_cache_expiration_unit, l_get_cache_expiration_value)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_STOCK_INTEGRATION_IMPL_CONFIGURATION_STOCK_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_locale: STRING_32
            l_ims_config: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_stock_integration_impl_configuration_stock_configuration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_locale, l_ims_config)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_dam_video_impl_servlet_video_test_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_DAM_VIDEO_IMPL_SERVLET_VIDEO_TEST_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_dam_video_impl_servlet_video_test_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_extwidget_servlets_image_sprite_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_EXTWIDGET_SERVLETS_IMAGE_SPRITE_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_width: INTEGER_32
            l_max_height: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_extwidget_servlets_image_sprite_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_width, l_max_height)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_image_internal_font_font_helper
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_IMAGE_INTERNAL_FONT_FONT_HELPER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_fontpath: LIST [STRING_32]
            l_oversampling_factor: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_image_internal_font_font_helper(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_fontpath, l_oversampling_factor)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_jcrclustersupport_cluster_start_level_controller
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_JCRCLUSTERSUPPORT_CLUSTER_START_LEVEL_CONTROLLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cluster_level_enable: BOOLEAN
            l_cluster_master_level: INTEGER_32
            l_cluster_slave_level: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_jcrclustersupport_cluster_start_level_controller(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cluster_level_enable, l_cluster_master_level, l_cluster_slave_level)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mailer_default_mail_service
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MAILER_DEFAULT_MAIL_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_smtp_host: STRING_32
            l_smtp_port: INTEGER_32
            l_smtp_user: STRING_32
            l_smtp_password: STRING_32
            l_from_address: STRING_32
            l_smtp_ssl: BOOLEAN
            l_smtp_starttls: BOOLEAN
            l_debug_email: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mailer_default_mail_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_smtp_host, l_smtp_port, l_smtp_user, l_smtp_password, l_from_address, l_smtp_ssl, l_smtp_starttls, l_debug_email)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mailer_impl_cq_mailing_service
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MAILER_IMPL_CQ_MAILING_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_recipient_count: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mailer_impl_cq_mailing_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_recipient_count)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mailer_impl_email_cq_email_template_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MAILER_IMPL_EMAIL_CQ_EMAIL_TEMPLATE_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mailer_email_charset: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mailer_impl_email_cq_email_template_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mailer_email_charset)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mailer_impl_email_cq_retriever_template_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MAILER_IMPL_EMAIL_CQ_RETRIEVER_TEMPLATE_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mailer_email_embed: BOOLEAN
            l_mailer_email_charset: STRING_32
            l_mailer_email_retriever_user_id: STRING_32
            l_mailer_email_retriever_user_pw_d: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mailer_impl_email_cq_retriever_template_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mailer_email_embed, l_mailer_email_charset, l_mailer_email_retriever_user_id, l_mailer_email_retriever_user_pw_d)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_campaign_impl_integration_config_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_CAMPAIGN_IMPL_INTEGRATION_CONFIG_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_aem_mcm_campaign_form_constraints: LIST [STRING_32]
            l_aem_mcm_campaign_public_url: STRING_32
            l_aem_mcm_campaign_relaxed_ss_l: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_campaign_impl_integration_config_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_aem_mcm_campaign_form_constraints, l_aem_mcm_campaign_public_url, l_aem_mcm_campaign_relaxed_ss_l)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_campaign_importer_personalized_text_handler_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_CAMPAIGN_IMPORTER_PERSONALIZED_TEXT_HANDLER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_campaign_importer_personalized_text_handler_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_CORE_NEWSLETTER_NEWSLETTER_EMAIL_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_from_address: STRING_32
            l_sender_host: STRING_32
            l_max_bounce_count: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_core_newsletter_newsletter_email_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_from_address, l_sender_host, l_max_bounce_count)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_impl_mc_mconfiguration
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_IMPL_MCM_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_experience_indirection: LIST [STRING_32]
            l_touchpoint_indirection: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_impl_mc_mconfiguration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_experience_indirection, l_touchpoint_indirection)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_CLICK_THROUGH_COMPONEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
            l_component_resource_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern, l_component_resource_type)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_GRAPHICAL_CLICK_THROUG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
            l_component_resource_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern, l_component_resource_type)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_ct_acomponent
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_CTA_LEAD_FORM_CTA_COMPONENT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_ct_acomponent(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_mbox_experience_tag_ha
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_MBOX_M_BOX_EXPERIENCE_TAG_HA_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_landingpage_parser_taghandlers_mbox_mbox_experience_tag_ha(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_MCM_LANDINGPAGE_PARSER_TAGHANDLERS_MBOX_TARGET_COMPONENT_TAG_H_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
            l_component_resource_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern, l_component_resource_type)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_notification_impl_notification_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_NOTIFICATION_IMPL_NOTIFICATION_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_filter: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_notification_impl_notification_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_filter)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_PERSONALIZATION_IMPL_SERVLETS_TARGETING_CONFIGURATION_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_forcelocation: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_personalization_impl_servlets_targeting_configuration_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_forcelocation)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_polling_importer_impl_managed_poll_config_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_POLLING_IMPORTER_IMPL_MANAGED_POLL_CONFIG_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_id: STRING_32
            l_enabled: BOOLEAN
            l_reference: BOOLEAN
            l_interval: INTEGER_32
            l_expression: STRING_32
            l_source: STRING_32
            l_target: STRING_32
            l_login: STRING_32
            l_password: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_polling_importer_impl_managed_poll_config_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_id, l_enabled, l_reference, l_interval, l_expression, l_source, l_target, l_login, l_password)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_polling_importer_impl_managed_polling_importer_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_POLLING_IMPORTER_IMPL_MANAGED_POLLING_IMPORTER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_importer_user: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_polling_importer_impl_managed_polling_importer_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_importer_user)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_polling_importer_impl_polling_importer_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_POLLING_IMPORTER_IMPL_POLLING_IMPORTER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_importer_min_interval: INTEGER_32
            l_importer_user: STRING_32
            l_exclude_paths: LIST [STRING_32]
            l_include_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_polling_importer_impl_polling_importer_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_importer_min_interval, l_importer_user, l_exclude_paths, l_include_paths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_audit_replication_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_AUDIT_REPLICATION_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_audit_replication_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_content_static_content_builder
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_CONTENT_STATIC_CONTENT_BUILDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_host: STRING_32
            l_port: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_content_static_content_builder(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_host, l_port)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_agent_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_AGENT_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_job_topics: STRING_32
            l_service_user_target: STRING_32
            l_agent_provider_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_agent_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_job_topics, l_service_user_target, l_agent_provider_target)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_content_durbo_binary_less_content_builder
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_CONTENT_DURBO_BINARY_LESS_CONTENT_BUILDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_binary_threshold: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_content_durbo_binary_less_content_builder(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_binary_threshold)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_CONTENT_DURBO_DURBO_IMPORT_CONFIGURATION_PROV_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_preserve_hierarchy_nodes: BOOLEAN
            l_ignore_versioning: BOOLEAN
            l_import_acl: BOOLEAN
            l_save_threshold: INTEGER_32
            l_preserve_user_paths: BOOLEAN
            l_preserve_uuid: BOOLEAN
            l_preserve_uuid_nodetypes: LIST [STRING_32]
            l_preserve_uuid_subtrees: LIST [STRING_32]
            l_auto_commit: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_preserve_hierarchy_nodes, l_ignore_versioning, l_import_acl, l_save_threshold, l_preserve_user_paths, l_preserve_uuid, l_preserve_uuid_nodetypes, l_preserve_uuid_subtrees, l_auto_commit)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_replication_content_factory_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_REPLICATION_CONTENT_FACTORY_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_replication_content_use_file_storage: BOOLEAN
            l_replication_content_max_commit_attempts: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_replication_content_factory_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_replication_content_use_file_storage, l_replication_content_max_commit_attempts)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_replication_receiver_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_REPLICATION_RECEIVER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_receiver_tmpfile_threshold: INTEGER_32
            l_receiver_packages_use_install: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_replication_receiver_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_receiver_tmpfile_threshold, l_receiver_packages_use_install)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_replicator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_REPLICATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_distribute_events: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_replicator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_distribute_events)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_reverse_replicator
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_REVERSE_REPLICATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_period: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_reverse_replicator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_period)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_transport_binary_less_transport_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_TRANSPORT_BINARY_LESS_TRANSPORT_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_disabled_cipher_suites: LIST [STRING_32]
            l_enabled_cipher_suites: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_transport_binary_less_transport_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_disabled_cipher_suites, l_enabled_cipher_suites)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_replication_impl_transport_http
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPLICATION_IMPL_TRANSPORT_HTTP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_disabled_cipher_suites: LIST [STRING_32]
            l_enabled_cipher_suites: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_replication_impl_transport_http(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_disabled_cipher_suites, l_enabled_cipher_suites)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_reporting_impl_cache_cache_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPORTING_IMPL_CACHE_CACHE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_repcache_enable: BOOLEAN
            l_repcache_ttl: INTEGER_32
            l_repcache_max: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_reporting_impl_cache_cache_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_repcache_enable, l_repcache_ttl, l_repcache_max)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_reporting_impl_config_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPORTING_IMPL_CONFIG_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_repconf_timezone: STRING_32
            l_repconf_locale: STRING_32
            l_repconf_snapshots: STRING_32
            l_repconf_repdir: STRING_32
            l_repconf_hourofday: INTEGER_32
            l_repconf_minofhour: INTEGER_32
            l_repconf_maxrows: INTEGER_32
            l_repconf_fakedata: BOOLEAN
            l_repconf_snapshotuser: STRING_32
            l_repconf_enforcesnapshotuser: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_reporting_impl_config_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_repconf_timezone, l_repconf_locale, l_repconf_snapshots, l_repconf_repdir, l_repconf_hourofday, l_repconf_minofhour, l_repconf_maxrows, l_repconf_fakedata, l_repconf_snapshotuser, l_repconf_enforcesnapshotuser)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_reporting_impl_rlog_analyzer
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REPORTING_IMPL_R_LOG_ANALYZER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_request_log_output: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_reporting_impl_rlog_analyzer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_request_log_output)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_rewriter_linkchecker_impl_link_checker_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REWRITER_LINKCHECKER_IMPL_LINK_CHECKER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_period: INTEGER_32
            l_scheduler_concurrent: BOOLEAN
            l_service_bad_link_tolerance_interval: INTEGER_32
            l_service_check_override_patterns: LIST [STRING_32]
            l_service_cache_broken_internal_links: BOOLEAN
            l_service_special_link_prefix: LIST [STRING_32]
            l_service_special_link_patterns: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_rewriter_linkchecker_impl_link_checker_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_period, l_scheduler_concurrent, l_service_bad_link_tolerance_interval, l_service_check_override_patterns, l_service_cache_broken_internal_links, l_service_special_link_prefix, l_service_special_link_patterns)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_rewriter_linkchecker_impl_link_checker_task
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REWRITER_LINKCHECKER_IMPL_LINK_CHECKER_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_period: INTEGER_32
            l_scheduler_concurrent: BOOLEAN
            l_good_link_test_interval: INTEGER_32
            l_bad_link_test_interval: INTEGER_32
            l_link_unused_interval: INTEGER_32
            l_connection_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_rewriter_linkchecker_impl_link_checker_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_period, l_scheduler_concurrent, l_good_link_test_interval, l_bad_link_test_interval, l_link_unused_interval, l_connection_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REWRITER_LINKCHECKER_IMPL_LINK_CHECKER_TRANSFORMER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_linkcheckertransformer_disable_rewriting: BOOLEAN
            l_linkcheckertransformer_disable_checking: BOOLEAN
            l_linkcheckertransformer_map_cache_size: INTEGER_32
            l_linkcheckertransformer_strict_extension_check: BOOLEAN
            l_linkcheckertransformer_strip_htmlt_extension: BOOLEAN
            l_linkcheckertransformer_rewrite_elements: LIST [STRING_32]
            l_linkcheckertransformer_strip_extension_path_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_linkcheckertransformer_disable_rewriting, l_linkcheckertransformer_disable_checking, l_linkcheckertransformer_map_cache_size, l_linkcheckertransformer_strict_extension_check, l_linkcheckertransformer_strip_htmlt_extension, l_linkcheckertransformer_rewrite_elements, l_linkcheckertransformer_strip_extension_path_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REWRITER_LINKCHECKER_IMPL_LINK_INFO_STORAGE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_max_links_per_host: INTEGER_32
            l_service_save_external_link_references: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_max_links_per_host, l_service_save_external_link_references)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_rewriter_processor_impl_html_parser_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_REWRITER_PROCESSOR_IMPL_HTML_PARSER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_htmlparser_process_tags: LIST [STRING_32]
            l_htmlparser_preserve_camel_case: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_rewriter_processor_impl_html_parser_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_htmlparser_process_tags, l_htmlparser_preserve_camel_case)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_search_impl_builder_query_builder_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_SEARCH_IMPL_BUILDER_QUERY_BUILDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_excerpt_properties: LIST [STRING_32]
            l_cache_max_entries: INTEGER_32
            l_cache_entry_lifetime: INTEGER_32
            l_xpath_union: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_search_impl_builder_query_builder_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_excerpt_properties, l_cache_max_entries, l_cache_entry_lifetime, l_xpath_union)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_search_suggest_impl_suggestion_index_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_SEARCH_SUGGEST_IMPL_SUGGESTION_INDEX_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path_builder_target: STRING_32
            l_suggest_basepath: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_search_suggest_impl_suggestion_index_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path_builder_target, l_suggest_basepath)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_searchpromote_impl_publish_search_promote_config_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_SEARCHPROMOTE_IMPL_PUBLISH_SEARCH_PROMOTE_CONFIG_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_searchpromote_confighandler_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_searchpromote_impl_publish_search_promote_config_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_searchpromote_confighandler_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_searchpromote_impl_search_promote_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_SEARCHPROMOTE_IMPL_SEARCH_PROMOTE_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_searchpromote_configuration_server_uri: STRING_32
            l_cq_searchpromote_configuration_environment: STRING_32
            l_connection_timeout: INTEGER_32
            l_socket_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_searchpromote_impl_search_promote_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_searchpromote_configuration_server_uri, l_cq_searchpromote_configuration_environment, l_connection_timeout, l_socket_timeout)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_security_ac_lsetup
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_SECURITY_ACL_SETUP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_aclsetup_rules: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_security_ac_lsetup(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_aclsetup_rules)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_statistics_impl_statistics_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_STATISTICS_IMPL_STATISTICS_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_period: INTEGER_32
            l_scheduler_concurrent: BOOLEAN
            l_path: STRING_32
            l_workspace: STRING_32
            l_keywords_path: STRING_32
            l_async_entries: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_statistics_impl_statistics_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_period, l_scheduler_concurrent, l_path, l_workspace, l_keywords_path, l_async_entries)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_TAGGING_IMPL_JCR_TAG_MANAGER_FACTORY_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_validation_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_tagging_impl_jcr_tag_manager_factory_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_validation_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_tagging_impl_search_tag_predicate_evaluator
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_TAGGING_IMPL_SEARCH_TAG_PREDICATE_EVALUATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_ignore_path: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_tagging_impl_search_tag_predicate_evaluator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_ignore_path)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_tagging_impl_tag_garbage_collector
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_TAGGING_IMPL_TAG_GARBAGE_COLLECTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_tagging_impl_tag_garbage_collector(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CONTENTSYNC_IMPL_HANDLER_PAGES_UPDATE_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_pagesupdatehandler_imageresourcetypes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_contentsync_impl_handler_pages_update_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_pagesupdatehandler_imageresourcetypes)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CONTENTSYNC_IMPL_REWRITER_PATH_REWRITER_TRANSFORMER_FACTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_contentsync_pathrewritertransformer_mapping_links: LIST [STRING_32]
            l_cq_contentsync_pathrewritertransformer_mapping_clientlibs: LIST [STRING_32]
            l_cq_contentsync_pathrewritertransformer_mapping_images: LIST [STRING_32]
            l_cq_contentsync_pathrewritertransformer_attribute_pattern: STRING_32
            l_cq_contentsync_pathrewritertransformer_clientlibrary_pattern: STRING_32
            l_cq_contentsync_pathrewritertransformer_clientlibrary_replace: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_contentsync_pathrewritertransformer_mapping_links, l_cq_contentsync_pathrewritertransformer_mapping_clientlibs, l_cq_contentsync_pathrewritertransformer_mapping_images, l_cq_contentsync_pathrewritertransformer_attribute_pattern, l_cq_contentsync_pathrewritertransformer_clientlibrary_pattern, l_cq_contentsync_pathrewritertransformer_clientlibrary_replace)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_AUTHORING_UI_MODE_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_authoring_ui_mode_service_default: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_authoring_ui_mode_service_default)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_commands_wc_mcommand_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_COMMANDS_WCM_COMMAND_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_wcmcommandservlet_delete_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_commands_wc_mcommand_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_wcmcommandservlet_delete_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_DEVICEDETECTION_DEVICE_IDENTIFICATION_MODE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_dim_default_mode: STRING_32
            l_dim_appcache_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_dim_default_mode, l_dim_appcache_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_event_page_event_audit_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_EVENT_PAGE_EVENT_AUDIT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_configured: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_event_page_event_audit_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_configured)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_event_page_post_processor
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_EVENT_PAGE_POST_PROCESSOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_event_page_post_processor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_paths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_event_repository_change_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_EVENT_REPOSITORY_CHANGE_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_paths: LIST [STRING_32]
            l_excluded_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_event_repository_change_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_paths, l_excluded_paths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_event_template_post_processor
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_EVENT_TEMPLATE_POST_PROCESSOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_paths: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_event_template_post_processor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_paths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_language_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_LANGUAGE_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_langmgr_list_path: STRING_32
            l_langmgr_country_default: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_language_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_langmgr_list_path, l_langmgr_country_default)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_LINK_CHECKER_CONFIGURATION_FACTORY_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_link_expired_prefix: STRING_32
            l_link_expired_remove: BOOLEAN
            l_link_expired_suffix: STRING_32
            l_link_invalid_prefix: STRING_32
            l_link_invalid_remove: BOOLEAN
            l_link_invalid_suffix: STRING_32
            l_link_predated_prefix: STRING_32
            l_link_predated_remove: BOOLEAN
            l_link_predated_suffix: STRING_32
            l_link_wcmmodes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_link_expired_prefix, l_link_expired_remove, l_link_expired_suffix, l_link_invalid_prefix, l_link_invalid_remove, l_link_invalid_suffix, l_link_predated_prefix, l_link_predated_remove, l_link_predated_suffix, l_link_wcmmodes)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_PAGE_PAGE_INFO_AGGREGATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_page_info_provider_property_regex_default: STRING_32
            l_page_info_provider_property_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_page_page_info_aggregator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_page_info_provider_property_regex_default, l_page_info_provider_property_name)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_page_page_manager_factory_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_PAGE_PAGE_MANAGER_FACTORY_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_illegal_char_mapping: STRING_32
            l_page_sub_tree_activation_check: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_page_page_manager_factory_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_illegal_char_mapping, l_page_sub_tree_activation_check)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_references_content_content_reference_config
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_REFERENCES_CONTENT_CONTENT_REFERENCE_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_content_reference_config_resource_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_references_content_content_reference_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_content_reference_config_resource_types)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_SERVLETS_CONTENTFINDER_ASSET_VIEW_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_dam_showexpired: BOOLEAN
            l_dam_showhidden: BOOLEAN
            l_tag_title_search: BOOLEAN
            l_guess_total: STRING_32
            l_dam_expiry_property: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_dam_showexpired, l_dam_showhidden, l_tag_title_search, l_guess_total, l_dam_expiry_property)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_SERVLETS_CONTENTFINDER_CONNECTOR_CONNECTOR_VIE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_item_resource_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_item_resource_types)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_SERVLETS_CONTENTFINDER_PAGE_VIEW_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_guess_total: STRING_32
            l_tag_title_search: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_guess_total, l_tag_title_search)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_servlets_find_replace_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_SERVLETS_FIND_REPLACE_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scope: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_servlets_find_replace_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scope)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_servlets_reference_search_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_SERVLETS_REFERENCE_SEARCH_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_referencesearchservlet_max_references_per_page: INTEGER_32
            l_referencesearchservlet_max_pages: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_servlets_reference_search_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_referencesearchservlet_max_references_per_page, l_referencesearchservlet_max_pages)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_SERVLETS_THUMBNAIL_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_workspace: STRING_32
            l_dimensions: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_servlets_thumbnail_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_workspace, l_dimensions)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_utils_default_page_name_validator
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_UTILS_DEFAULT_PAGE_NAME_VALIDATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_non_valid_chars: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_utils_default_page_name_validator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_non_valid_chars)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_variants_page_variants_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_VARIANTS_PAGE_VARIANTS_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_default_externalizer_domain: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_variants_page_variants_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_default_externalizer_domain)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_version_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_VERSION_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_versionmanager_create_version_on_activation: BOOLEAN
            l_versionmanager_purging_enabled: BOOLEAN
            l_versionmanager_purge_paths: LIST [STRING_32]
            l_versionmanager_iv_paths: LIST [STRING_32]
            l_versionmanager_max_age_days: INTEGER_32
            l_versionmanager_max_number_versions: INTEGER_32
            l_versionmanager_min_number_versions: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_version_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_versionmanager_create_version_on_activation, l_versionmanager_purging_enabled, l_versionmanager_purge_paths, l_versionmanager_iv_paths, l_versionmanager_max_age_days, l_versionmanager_max_number_versions, l_versionmanager_min_number_versions)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_version_purge_task
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_VERSION_PURGE_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_versionpurge_paths: LIST [STRING_32]
            l_versionpurge_recursive: BOOLEAN
            l_versionpurge_max_versions: INTEGER_32
            l_versionpurge_min_versions: INTEGER_32
            l_versionpurge_max_age_days: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_version_purge_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_versionpurge_paths, l_versionpurge_recursive, l_versionpurge_max_versions, l_versionpurge_min_versions, l_versionpurge_max_age_days)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_warp_time_warp_filter
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_WARP_TIME_WARP_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_filter_order: STRING_32
            l_filter_scope: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_warp_time_warp_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_filter_order, l_filter_scope)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_wc_mdebug_filter
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_WCM_DEBUG_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_wcmdbgfilter_enabled: BOOLEAN
            l_wcmdbgfilter_jsp_debug: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_wc_mdebug_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_wcmdbgfilter_enabled, l_wcmdbgfilter_jsp_debug)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_impl_wc_mdeveloper_mode_filter
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_IMPL_WCM_DEVELOPER_MODE_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_wcmdevmodefilter_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_impl_wc_mdeveloper_mode_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_wcmdevmodefilter_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_mvt_mv_tstatistics_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_MVT_MVT_STATISTICS_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mvtstatistics_trackingurl: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_mvt_mv_tstatistics_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mvtstatistics_trackingurl)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_stats_page_view_statistics_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_STATS_PAGE_VIEW_STATISTICS_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pageviewstatistics_trackingurl: STRING_32
            l_pageviewstatistics_trackingscript_enabled: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_stats_page_view_statistics_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pageviewstatistics_trackingurl, l_pageviewstatistics_trackingscript_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_core_wc_mrequest_filter
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_CORE_WCM_REQUEST_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_wcmfilter_mode: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_core_wc_mrequest_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_wcmfilter_mode)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_design_package_importer
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_DESIGN_PACKAGE_IMPORTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_extract_filter: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_design_package_importer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_extract_filter)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_impl_canvas_builder_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_IMPL_CANVAS_BUILDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_filepattern: STRING_32
            l_build_page_nodes: BOOLEAN
            l_build_client_libs: BOOLEAN
            l_build_canvas_component: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_impl_canvas_builder_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_filepattern, l_build_page_nodes, l_build_client_libs, l_build_canvas_component)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_IMPL_CANVAS_PAGE_DELETE_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_min_thread_pool_size: INTEGER_32
            l_max_thread_pool_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_min_thread_pool_size, l_max_thread_pool_size)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_IMPL_ENTRY_PREPROCESSOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_search_pattern: STRING_32
            l_replace_pattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_search_pattern, l_replace_pattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_IMPL_MOBILE_CANVAS_BUILDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_filepattern: STRING_32
            l_device_groups: LIST [STRING_32]
            l_build_page_nodes: BOOLEAN
            l_build_client_libs: BOOLEAN
            l_build_canvas_component: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_filepattern, l_device_groups, l_build_page_nodes, l_build_client_libs, l_build_canvas_component)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_CANVAS_COMPONE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_DEFAULT_COMPON_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_DEFAULT_TAG_HAN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_HEAD_TAG_HANDLE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_iframe_tag_hand
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_I_FRAME_TAG_HAND_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_iframe_tag_hand(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_IMAGE_COMPONEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
            l_component_resource_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern, l_component_resource_type)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_IMG_TAG_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_INLINE_SCRIPT_T_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_LINK_TAG_HANDLE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_META_TAG_HANDLE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_NON_SCRIPT_TAG_H_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_PARSYS_COMPONE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
            l_component_resource_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern, l_component_resource_type)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_SCRIPT_TAG_HAND_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_STYLE_TAG_HANDL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_TEXT_COMPONENT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
            l_component_resource_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern, l_component_resource_type)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_TITLE_COMPONEN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
            l_component_resource_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern, l_component_resource_type)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_DESIGNIMPORTER_PARSER_TAGHANDLERS_FACTORY_TITLE_TAG_HANDL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_tagpattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_tagpattern)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_FORMS_IMPL_FORM_CHOOSER_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_name: STRING_32
            l_sling_servlet_resource_types: STRING_32
            l_sling_servlet_selectors: STRING_32
            l_sling_servlet_methods: LIST [STRING_32]
            l_forms_formchooserservlet_advansesearch_require: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_name, l_sling_servlet_resource_types, l_sling_servlet_selectors, l_sling_servlet_methods, l_forms_formchooserservlet_advansesearch_require)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_FORMS_IMPL_FORM_PARAGRAPH_POST_PROCESSOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_forms_formparagraphpostprocessor_enabled: BOOLEAN
            l_forms_formparagraphpostprocessor_formresourcetypes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_forms_formparagraphpostprocessor_enabled, l_forms_formparagraphpostprocessor_formresourcetypes)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_FORMS_IMPL_FORMS_HANDLING_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name_whitelist: STRING_32
            l_allow_expressions: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name_whitelist, l_allow_expressions)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_forms_impl_mail_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_FORMS_IMPL_MAIL_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_resource_types: STRING_32
            l_sling_servlet_selectors: STRING_32
            l_resource_whitelist: LIST [STRING_32]
            l_resource_blacklist: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_forms_impl_mail_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_resource_types, l_sling_servlet_selectors, l_resource_whitelist, l_resource_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_IMPL_ADAPTIVE_IMAGE_COMPONENT_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_adapt_supported_widths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_adapt_supported_widths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_impl_ht_tp_auth_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_IMPL_HTTP_AUTH_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
            l_auth_http_nologin: BOOLEAN
            l_auth_http_realm: STRING_32
            l_auth_default_loginpage: STRING_32
            l_auth_cred_form: LIST [STRING_32]
            l_auth_cred_utf8: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_impl_ht_tp_auth_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_auth_http_nologin, l_auth_http_realm, l_auth_default_loginpage, l_auth_cred_form, l_auth_cred_utf8)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_impl_page_impressions_tracker
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_IMPL_PAGE_IMPRESSIONS_TRACKER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_auth_requirements: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_impl_page_impressions_tracker(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_auth_requirements)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_impl_page_redirect_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_IMPL_PAGE_REDIRECT_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_excluded_resource_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_impl_page_redirect_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_excluded_resource_types)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_SECURITY_IMPL_DEFAULT_ATTACHMENT_TYPE_BLACKLIST_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_default_attachment_type_blacklist: LIST [STRING_32]
            l_baseline_attachment_type_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_default_attachment_type_blacklist, l_baseline_attachment_type_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_FOUNDATION_SECURITY_IMPL_SAFER_SLING_POST_VALIDATOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_parameter_whitelist: LIST [STRING_32]
            l_parameter_whitelist_prefixes: LIST [STRING_32]
            l_binary_parameter_whitelist: LIST [STRING_32]
            l_modifier_whitelist: LIST [STRING_32]
            l_operation_whitelist: LIST [STRING_32]
            l_operation_whitelist_prefixes: LIST [STRING_32]
            l_typehint_whitelist: LIST [STRING_32]
            l_resourcetype_whitelist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_parameter_whitelist, l_parameter_whitelist_prefixes, l_binary_parameter_whitelist, l_modifier_whitelist, l_operation_whitelist, l_operation_whitelist_prefixes, l_typehint_whitelist, l_resourcetype_whitelist)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MOBILE_CORE_IMPL_DEVICE_DEVICE_INFO_TRANSFORMER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_device_info_transformer_enabled: BOOLEAN
            l_device_info_transformer_css_style: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_device_info_transformer_enabled, l_device_info_transformer_css_style)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MOBILE_CORE_IMPL_REDIRECT_REDIRECT_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_redirect_enabled: BOOLEAN
            l_redirect_stats_enabled: BOOLEAN
            l_redirect_extensions: LIST [STRING_32]
            l_redirect_paths: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_redirect_enabled, l_redirect_stats_enabled, l_redirect_extensions, l_redirect_paths)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_actions_content_copy_action_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_ACTIONS_CONTENT_COPY_ACTION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_msm_action_excludednodetypes: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedparagraphitems: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedprops: LIST [STRING_32]
            l_contentcopyaction_order_style: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_actions_content_copy_action_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_msm_action_excludednodetypes, l_cq_wcm_msm_action_excludedparagraphitems, l_cq_wcm_msm_action_excludedprops, l_contentcopyaction_order_style)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_actions_content_delete_action_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_ACTIONS_CONTENT_DELETE_ACTION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_msm_action_excludednodetypes: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedparagraphitems: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedprops: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_actions_content_delete_action_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_msm_action_excludednodetypes, l_cq_wcm_msm_action_excludedparagraphitems, l_cq_wcm_msm_action_excludedprops)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_actions_content_update_action_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_ACTIONS_CONTENT_UPDATE_ACTION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_msm_action_excludednodetypes: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedparagraphitems: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedprops: LIST [STRING_32]
            l_cq_wcm_msm_action_ignored_mixin: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_actions_content_update_action_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_msm_action_excludednodetypes, l_cq_wcm_msm_action_excludedparagraphitems, l_cq_wcm_msm_action_excludedprops, l_cq_wcm_msm_action_ignored_mixin)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_actions_order_children_action_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_ACTIONS_ORDER_CHILDREN_ACTION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_msm_action_excludednodetypes: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedparagraphitems: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedprops: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_actions_order_children_action_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_msm_action_excludednodetypes, l_cq_wcm_msm_action_excludedparagraphitems, l_cq_wcm_msm_action_excludedprops)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_actions_page_move_action_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_ACTIONS_PAGE_MOVE_ACTION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_msm_action_excludednodetypes: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedparagraphitems: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedprops: LIST [STRING_32]
            l_cq_wcm_msm_impl_actions_pagemove_prop_reference_update: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_actions_page_move_action_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_msm_action_excludednodetypes, l_cq_wcm_msm_action_excludedparagraphitems, l_cq_wcm_msm_action_excludedprops, l_cq_wcm_msm_impl_actions_pagemove_prop_reference_update)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_actions_references_update_action_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_ACTIONS_REFERENCES_UPDATE_ACTION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_msm_action_excludednodetypes: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedparagraphitems: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedprops: LIST [STRING_32]
            l_cq_wcm_msm_impl_action_referencesupdate_prop_update_nested: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_actions_references_update_action_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_msm_action_excludednodetypes, l_cq_wcm_msm_action_excludedparagraphitems, l_cq_wcm_msm_action_excludedprops, l_cq_wcm_msm_impl_action_referencesupdate_prop_update_nested)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_ACTIONS_VERSION_COPY_ACTION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_msm_action_excludednodetypes: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedparagraphitems: LIST [STRING_32]
            l_cq_wcm_msm_action_excludedprops: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_actions_version_copy_action_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_msm_action_excludednodetypes, l_cq_wcm_msm_action_excludedparagraphitems, l_cq_wcm_msm_action_excludedprops)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_live_relationship_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_LIVE_RELATIONSHIP_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_liverelationshipmgr_relationsconfig_default: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_live_relationship_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_liverelationshipmgr_relationsconfig_default)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_rollout_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_ROLLOUT_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_filter: STRING_32
            l_rolloutmgr_excludedprops_default: LIST [STRING_32]
            l_rolloutmgr_excludedparagraphprops_default: LIST [STRING_32]
            l_rolloutmgr_excludednodetypes_default: LIST [STRING_32]
            l_rolloutmgr_threadpool_maxsize: INTEGER_32
            l_rolloutmgr_threadpool_maxshutdowntime: INTEGER_32
            l_rolloutmgr_threadpool_priority: STRING_32
            l_rolloutmgr_commit_size: INTEGER_32
            l_rolloutmgr_conflicthandling_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_rollout_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_filter, l_rolloutmgr_excludedprops_default, l_rolloutmgr_excludedparagraphprops_default, l_rolloutmgr_excludednodetypes_default, l_rolloutmgr_threadpool_maxsize, l_rolloutmgr_threadpool_maxshutdowntime, l_rolloutmgr_threadpool_priority, l_rolloutmgr_commit_size, l_rolloutmgr_conflicthandling_enabled)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_MSM_IMPL_SERVLETS_AUDIT_LOG_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_auditlogservlet_default_events_count: INTEGER_32
            l_auditlogservlet_default_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_msm_impl_servlets_audit_log_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_auditlogservlet_default_events_count, l_auditlogservlet_default_path)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_notification_email_impl_email_channel
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_NOTIFICATION_EMAIL_IMPL_EMAIL_CHANNEL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_email_from: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_notification_email_impl_email_channel(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_email_from)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_notification_impl_notification_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_NOTIFICATION_IMPL_NOTIFICATION_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_topics: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_notification_impl_notification_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_topics)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_scripting_impl_bv_pmanager
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_SCRIPTING_IMPL_BVP_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_com_day_cq_wcm_scripting_bvp_script_engines: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_scripting_impl_bv_pmanager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_com_day_cq_wcm_scripting_bvp_script_engines)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_undo_undo_config
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_UNDO_UNDO_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cq_wcm_undo_enabled: BOOLEAN
            l_cq_wcm_undo_path: STRING_32
            l_cq_wcm_undo_validity: INTEGER_32
            l_cq_wcm_undo_steps: INTEGER_32
            l_cq_wcm_undo_persistence: STRING_32
            l_cq_wcm_undo_persistence_mode: BOOLEAN
            l_cq_wcm_undo_markermode: STRING_32
            l_cq_wcm_undo_whitelist: LIST [STRING_32]
            l_cq_wcm_undo_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_undo_undo_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cq_wcm_undo_enabled, l_cq_wcm_undo_path, l_cq_wcm_undo_validity, l_cq_wcm_undo_steps, l_cq_wcm_undo_persistence, l_cq_wcm_undo_persistence_mode, l_cq_wcm_undo_markermode, l_cq_wcm_undo_whitelist, l_cq_wcm_undo_blacklist)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_webservicesupport_impl_replication_event_listener
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_WEBSERVICESUPPORT_IMPL_REPLICATION_EVENT_LISTENER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_flush_agents: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_webservicesupport_impl_replication_event_listener(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_flush_agents)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_WORKFLOW_IMPL_WCM_WORKFLOW_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_event_filter: STRING_32
            l_min_thread_pool_size: INTEGER_32
            l_max_thread_pool_size: INTEGER_32
            l_cq_wcm_workflow_terminate_on_activate: BOOLEAN
            l_cq_wcm_worklfow_terminate_exclusion_list: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_event_filter, l_min_thread_pool_size, l_max_thread_pool_size, l_cq_wcm_workflow_terminate_on_activate, l_cq_wcm_worklfow_terminate_exclusion_list)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_wcm_workflow_impl_workflow_package_info_provider
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WCM_WORKFLOW_IMPL_WORKFLOW_PACKAGE_INFO_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_workflowpackageinfoprovider_filter: LIST [STRING_32]
            l_workflowpackageinfoprovider_filter_rootpath: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_wcm_workflow_impl_workflow_package_info_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_workflowpackageinfoprovider_filter, l_workflowpackageinfoprovider_filter_rootpath)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_widget_impl_html_library_manager_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WIDGET_IMPL_HTML_LIBRARY_MANAGER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_htmllibmanager_clientmanager: STRING_32
            l_htmllibmanager_debug: BOOLEAN
            l_htmllibmanager_debug_console: BOOLEAN
            l_htmllibmanager_debug_init_js: STRING_32
            l_htmllibmanager_defaultthemename: STRING_32
            l_htmllibmanager_defaultuserthemename: STRING_32
            l_htmllibmanager_firebuglite_path: STRING_32
            l_htmllibmanager_force_cq_url_info: BOOLEAN
            l_htmllibmanager_gzip: BOOLEAN
            l_htmllibmanager_maxage: INTEGER_32
            l_htmllibmanager_max_data_uri_size: INTEGER_32
            l_htmllibmanager_minify: BOOLEAN
            l_htmllibmanager_path_list: LIST [STRING_32]
            l_htmllibmanager_timing: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_widget_impl_html_library_manager_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_htmllibmanager_clientmanager, l_htmllibmanager_debug, l_htmllibmanager_debug_console, l_htmllibmanager_debug_init_js, l_htmllibmanager_defaultthemename, l_htmllibmanager_defaultuserthemename, l_htmllibmanager_firebuglite_path, l_htmllibmanager_force_cq_url_info, l_htmllibmanager_gzip, l_htmllibmanager_maxage, l_htmllibmanager_max_data_uri_size, l_htmllibmanager_minify, l_htmllibmanager_path_list, l_htmllibmanager_timing)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_widget_impl_widget_extension_provider_impl
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WIDGET_IMPL_WIDGET_EXTENSION_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_extendable_widgets: LIST [STRING_32]
            l_widgetextensionprovider_debug: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_widget_impl_widget_extension_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_extendable_widgets, l_widgetextensionprovider_debug)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_workflow_impl_email_email_notification_service
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WORKFLOW_IMPL_EMAIL_E_MAIL_NOTIFICATION_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_from_address: STRING_32
            l_host_prefix: STRING_32
            l_notify_onabort: BOOLEAN
            l_notify_oncomplete: BOOLEAN
            l_notify_oncontainercomplete: BOOLEAN
            l_notify_useronly: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_workflow_impl_email_email_notification_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_from_address, l_host_prefix, l_notify_onabort, l_notify_oncomplete, l_notify_oncontainercomplete, l_notify_useronly)
            assert ("not_implemented", False)
        end
    
    test_com_day_cq_workflow_impl_email_task_email_notification_service
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CQ_WORKFLOW_IMPL_EMAIL_TASK_E_MAIL_NOTIFICATION_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_notify_onupdate: BOOLEAN
            l_notify_oncomplete: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_cq_workflow_impl_email_task_email_notification_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_notify_onupdate, l_notify_oncomplete)
            assert ("not_implemented", False)
        end
    
    test_com_day_crx_security_token_impl_impl_token_authentication_handler
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CRX_SECURITY_TOKEN_IMPL_IMPL_TOKEN_AUTHENTICATION_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
            l_token_required_attr: STRING_32
            l_token_alternate_url: STRING_32
            l_token_encapsulated: BOOLEAN
            l_skip_token_refresh: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_crx_security_token_impl_impl_token_authentication_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_token_required_attr, l_token_alternate_url, l_token_encapsulated, l_skip_token_refresh)
            assert ("not_implemented", False)
        end
    
    test_com_day_crx_security_token_impl_token_cleanup_task
            -- 
            -- 
            --  
        local
            l_response: COM_DAY_CRX_SECURITY_TOKEN_IMPL_TOKEN_CLEANUP_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enable_token_cleanup_task: BOOLEAN
            l_scheduler_expression: STRING_32
            l_batch_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.com_day_crx_security_token_impl_token_cleanup_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enable_token_cleanup_task, l_scheduler_expression, l_batch_size)
            assert ("not_implemented", False)
        end
    
    test_guide_localization_service
            -- 
            -- 
            --  
        local
            l_response: GUIDE_LOCALIZATION_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_supported_locales: LIST [STRING_32]
            l_localizable__properties: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.guide_localization_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_supported_locales, l_localizable__properties)
            assert ("not_implemented", False)
        end
    
    test_messaging_user_component_factory
            -- 
            -- 
            --  
        local
            l_response: MESSAGING_USER_COMPONENT_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_priority: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.messaging_user_component_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_priority)
            assert ("not_implemented", False)
        end
    
    test_org_apache_aries_jmx_framework_state_config
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_ARIES_JMX_FRAMEWORK_STATE_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_attribute_change_notification_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_aries_jmx_framework_state_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_attribute_change_notification_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_eventadmin_impl_event_admin
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_EVENTADMIN_IMPL_EVENT_ADMIN_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_felix_eventadmin__thread_pool_size: INTEGER_32
            l_org_apache_felix_eventadmin__async_to_sync_thread_ratio: REAL_32
            l_org_apache_felix_eventadmin__timeout: INTEGER_32
            l_org_apache_felix_eventadmin__require_topic: BOOLEAN
            l_org_apache_felix_eventadmin__ignore_timeout: LIST [STRING_32]
            l_org_apache_felix_eventadmin__ignore_topic: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_eventadmin_impl_event_admin(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_felix_eventadmin__thread_pool_size, l_org_apache_felix_eventadmin__async_to_sync_thread_ratio, l_org_apache_felix_eventadmin__timeout, l_org_apache_felix_eventadmin__require_topic, l_org_apache_felix_eventadmin__ignore_timeout, l_org_apache_felix_eventadmin__ignore_topic)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_http
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_HTTP_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_felix_http_host: STRING_32
            l_org_apache_felix_http_enable: BOOLEAN
            l_org_osgi_service_http_port: INTEGER_32
            l_org_apache_felix_http_timeout: INTEGER_32
            l_org_apache_felix_https_enable: BOOLEAN
            l_org_osgi_service_http_port_secure: INTEGER_32
            l_org_apache_felix_https_keystore: STRING_32
            l_org_apache_felix_https_keystore_password: STRING_32
            l_org_apache_felix_https_keystore_key_password: STRING_32
            l_org_apache_felix_https_truststore: STRING_32
            l_org_apache_felix_https_truststore_password: STRING_32
            l_org_apache_felix_https_clientcertificate: STRING_32
            l_org_apache_felix_http_context_path: STRING_32
            l_org_apache_felix_http_mbeans: BOOLEAN
            l_org_apache_felix_http_session_timeout: INTEGER_32
            l_org_apache_felix_http_jetty_threadpool_max: INTEGER_32
            l_org_apache_felix_http_jetty_acceptors: INTEGER_32
            l_org_apache_felix_http_jetty_selectors: INTEGER_32
            l_org_apache_felix_http_jetty_header_buffer_size: INTEGER_32
            l_org_apache_felix_http_jetty_request_buffer_size: INTEGER_32
            l_org_apache_felix_http_jetty_response_buffer_size: INTEGER_32
            l_org_apache_felix_http_jetty_max_form_size: INTEGER_32
            l_org_apache_felix_http_path_exclusions: LIST [STRING_32]
            l_org_apache_felix_https_jetty_ciphersuites_excluded: LIST [STRING_32]
            l_org_apache_felix_https_jetty_ciphersuites_included: LIST [STRING_32]
            l_org_apache_felix_http_jetty_send_server_header: BOOLEAN
            l_org_apache_felix_https_jetty_protocols_included: LIST [STRING_32]
            l_org_apache_felix_https_jetty_protocols_excluded: LIST [STRING_32]
            l_org_apache_felix_proxy_load_balancer_connection_enable: BOOLEAN
            l_org_apache_felix_https_jetty_renegotiate_allowed: BOOLEAN
            l_org_apache_felix_https_jetty_session_cookie_http_only: BOOLEAN
            l_org_apache_felix_https_jetty_session_cookie_secure: BOOLEAN
            l_org_eclipse_jetty_servlet__session_id_path_parameter_name: STRING_32
            l_org_eclipse_jetty_servlet__checking_remote_session_id_encoding: BOOLEAN
            l_org_eclipse_jetty_servlet__session_cookie: STRING_32
            l_org_eclipse_jetty_servlet__session_domain: STRING_32
            l_org_eclipse_jetty_servlet__session_path: STRING_32
            l_org_eclipse_jetty_servlet__max_age: INTEGER_32
            l_org_apache_felix_http_name: STRING_32
            l_org_apache_felix_jetty_gziphandler_enable: BOOLEAN
            l_org_apache_felix_jetty_gzip_min_gzip_size: INTEGER_32
            l_org_apache_felix_jetty_gzip_compression_level: INTEGER_32
            l_org_apache_felix_jetty_gzip_inflate_buffer_size: INTEGER_32
            l_org_apache_felix_jetty_gzip_sync_flush: BOOLEAN
            l_org_apache_felix_jetty_gzip_excluded_user_agents: LIST [STRING_32]
            l_org_apache_felix_jetty_gzip_included_methods: LIST [STRING_32]
            l_org_apache_felix_jetty_gzip_excluded_methods: LIST [STRING_32]
            l_org_apache_felix_jetty_gzip_included_paths: LIST [STRING_32]
            l_org_apache_felix_jetty_gzip_excluded_paths: LIST [STRING_32]
            l_org_apache_felix_jetty_gzip_included_mime_types: LIST [STRING_32]
            l_org_apache_felix_jetty_gzip_excluded_mime_types: LIST [STRING_32]
            l_org_apache_felix_http_session_invalidate: BOOLEAN
            l_org_apache_felix_http_session_uniqueid: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_http(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_felix_http_host, l_org_apache_felix_http_enable, l_org_osgi_service_http_port, l_org_apache_felix_http_timeout, l_org_apache_felix_https_enable, l_org_osgi_service_http_port_secure, l_org_apache_felix_https_keystore, l_org_apache_felix_https_keystore_password, l_org_apache_felix_https_keystore_key_password, l_org_apache_felix_https_truststore, l_org_apache_felix_https_truststore_password, l_org_apache_felix_https_clientcertificate, l_org_apache_felix_http_context_path, l_org_apache_felix_http_mbeans, l_org_apache_felix_http_session_timeout, l_org_apache_felix_http_jetty_threadpool_max, l_org_apache_felix_http_jetty_acceptors, l_org_apache_felix_http_jetty_selectors, l_org_apache_felix_http_jetty_header_buffer_size, l_org_apache_felix_http_jetty_request_buffer_size, l_org_apache_felix_http_jetty_response_buffer_size, l_org_apache_felix_http_jetty_max_form_size, l_org_apache_felix_http_path_exclusions, l_org_apache_felix_https_jetty_ciphersuites_excluded, l_org_apache_felix_https_jetty_ciphersuites_included, l_org_apache_felix_http_jetty_send_server_header, l_org_apache_felix_https_jetty_protocols_included, l_org_apache_felix_https_jetty_protocols_excluded, l_org_apache_felix_proxy_load_balancer_connection_enable, l_org_apache_felix_https_jetty_renegotiate_allowed, l_org_apache_felix_https_jetty_session_cookie_http_only, l_org_apache_felix_https_jetty_session_cookie_secure, l_org_eclipse_jetty_servlet__session_id_path_parameter_name, l_org_eclipse_jetty_servlet__checking_remote_session_id_encoding, l_org_eclipse_jetty_servlet__session_cookie, l_org_eclipse_jetty_servlet__session_domain, l_org_eclipse_jetty_servlet__session_path, l_org_eclipse_jetty_servlet__max_age, l_org_apache_felix_http_name, l_org_apache_felix_jetty_gziphandler_enable, l_org_apache_felix_jetty_gzip_min_gzip_size, l_org_apache_felix_jetty_gzip_compression_level, l_org_apache_felix_jetty_gzip_inflate_buffer_size, l_org_apache_felix_jetty_gzip_sync_flush, l_org_apache_felix_jetty_gzip_excluded_user_agents, l_org_apache_felix_jetty_gzip_included_methods, l_org_apache_felix_jetty_gzip_excluded_methods, l_org_apache_felix_jetty_gzip_included_paths, l_org_apache_felix_jetty_gzip_excluded_paths, l_org_apache_felix_jetty_gzip_included_mime_types, l_org_apache_felix_jetty_gzip_excluded_mime_types, l_org_apache_felix_http_session_invalidate, l_org_apache_felix_http_session_uniqueid)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_http_sslfilter_ssl_filter
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_HTTP_SSLFILTER_SSL_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_ssl_forward_header: STRING_32
            l_ssl_forward_value: STRING_32
            l_ssl_forward_cert_header: STRING_32
            l_rewrite_absolute_urls: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_http_sslfilter_ssl_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_ssl_forward_header, l_ssl_forward_value, l_ssl_forward_cert_header, l_rewrite_absolute_urls)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_jaas_configuration_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_JAAS_CONFIGURATION_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_jaas_control_flag: STRING_32
            l_jaas_ranking: INTEGER_32
            l_jaas_realm_name: STRING_32
            l_jaas_classname: STRING_32
            l_jaas_options: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_jaas_configuration_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_jaas_control_flag, l_jaas_ranking, l_jaas_realm_name, l_jaas_classname, l_jaas_options)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_jaas_configuration_spi
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_JAAS_CONFIGURATION_SPI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_jaas_default_realm_name: STRING_32
            l_jaas_config_provider_name: STRING_32
            l_jaas_global_config_policy: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_jaas_configuration_spi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_jaas_default_realm_name, l_jaas_config_provider_name, l_jaas_global_config_policy)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_scr_scr_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_SCR_SCR_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_ds_loglevel: INTEGER_32
            l_ds_factory_enabled: BOOLEAN
            l_ds_delayed_keep_instances: BOOLEAN
            l_ds_lock_timeout_milliseconds: INTEGER_32
            l_ds_stop_timeout_milliseconds: INTEGER_32
            l_ds_global_extender: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_scr_scr_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_ds_loglevel, l_ds_factory_enabled, l_ds_delayed_keep_instances, l_ds_lock_timeout_milliseconds, l_ds_stop_timeout_milliseconds, l_ds_global_extender)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_systemready_impl_components_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_SYSTEMREADY_IMPL_COMPONENTS_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_components_list: LIST [STRING_32]
            l_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_systemready_impl_components_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_components_list, l_type)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_systemready_impl_framework_start_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_SYSTEMREADY_IMPL_FRAMEWORK_START_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_timeout: INTEGER_32
            l_target_start_level: INTEGER_32
            l_target_start_level_prop_name: STRING_32
            l_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_systemready_impl_framework_start_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_timeout, l_target_start_level, l_target_start_level_prop_name, l_type)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_systemready_impl_services_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_SYSTEMREADY_IMPL_SERVICES_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_services_list: LIST [STRING_32]
            l_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_systemready_impl_services_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_services_list, l_type)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_systemready_impl_servlet_system_alive_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_SYSTEMREADY_IMPL_SERVLET_SYSTEM_ALIVE_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_osgi_http_whiteboard_servlet_pattern: STRING_32
            l_osgi_http_whiteboard_context_select: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_systemready_impl_servlet_system_alive_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_osgi_http_whiteboard_servlet_pattern, l_osgi_http_whiteboard_context_select)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_systemready_impl_servlet_system_ready_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_SYSTEMREADY_IMPL_SERVLET_SYSTEM_READY_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_osgi_http_whiteboard_servlet_pattern: STRING_32
            l_osgi_http_whiteboard_context_select: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_systemready_impl_servlet_system_ready_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_osgi_http_whiteboard_servlet_pattern, l_osgi_http_whiteboard_context_select)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_systemready_system_ready_monitor
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_SYSTEMREADY_SYSTEM_READY_MONITOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_poll_interval: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_systemready_system_ready_monitor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_poll_interval)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_webconsole_internal_servlet_osgi_manager
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_WEBCONSOLE_INTERNAL_SERVLET_OSGI_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_manager_root: STRING_32
            l_http_service_filter: STRING_32
            l_default_render: STRING_32
            l_realm: STRING_32
            l_username: STRING_32
            l_password: STRING_32
            l_category: STRING_32
            l_locale: STRING_32
            l_loglevel: INTEGER_32
            l_plugins: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_webconsole_internal_servlet_osgi_manager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_manager_root, l_http_service_filter, l_default_render, l_realm, l_username, l_password, l_category, l_locale, l_loglevel, l_plugins)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_WEBCONSOLE_PLUGINS_EVENT_INTERNAL_PLUGIN_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_webconsole_plugins_event_internal_plugin_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_size)
            assert ("not_implemented", False)
        end
    
    test_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_FELIX_WEBCONSOLE_PLUGINS_MEMORYUSAGE_INTERNAL_MEMORY_USAGE_CO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_felix_memoryusage_dump_threshold: INTEGER_32
            l_felix_memoryusage_dump_interval: INTEGER_32
            l_felix_memoryusage_dump_location: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_felix_memoryusage_dump_threshold, l_felix_memoryusage_dump_interval, l_felix_memoryusage_dump_location)
            assert ("not_implemented", False)
        end
    
    test_org_apache_http_proxyconfigurator
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_HTTP_PROXYCONFIGURATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_proxy_enabled: BOOLEAN
            l_proxy_host: STRING_32
            l_proxy_port: INTEGER_32
            l_proxy_user: STRING_32
            l_proxy_password: STRING_32
            l_proxy_exceptions: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_http_proxyconfigurator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_proxy_enabled, l_proxy_host, l_proxy_port, l_proxy_user, l_proxy_password, l_proxy_exceptions)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_BLOB_DATASTORE_DATA_STORE_TEXT_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_dir: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_dir)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_BLOB_DATASTORE_FILE_DATA_STORE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_document_document_node_store_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_DOCUMENT_DOCUMENT_NODE_STORE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mongouri: STRING_32
            l_db: STRING_32
            l_socket_keep_alive: BOOLEAN
            l_cache: INTEGER_32
            l_node_cache_percentage: INTEGER_32
            l_prev_doc_cache_percentage: INTEGER_32
            l_children_cache_percentage: INTEGER_32
            l_diff_cache_percentage: INTEGER_32
            l_cache_segment_count: INTEGER_32
            l_cache_stack_move_distance: INTEGER_32
            l_blob_cache_size: INTEGER_32
            l_persistent_cache: STRING_32
            l_journal_cache: STRING_32
            l_custom_blob_store: BOOLEAN
            l_journal_gc_interval: INTEGER_32
            l_journal_gc_max_age: INTEGER_32
            l_prefetch_external_changes: BOOLEAN
            l_role: STRING_32
            l_version_gc_max_age_in_secs: INTEGER_32
            l_version_gc_expression: STRING_32
            l_version_gc_time_limit_in_secs: INTEGER_32
            l_blob_gc_max_age_in_secs: INTEGER_32
            l_blob_track_snapshot_interval_in_secs: INTEGER_32
            l_repository_home: STRING_32
            l_max_replication_lag_in_secs: INTEGER_32
            l_document_store_type: STRING_32
            l_bundling_disabled: BOOLEAN
            l_update_limit: INTEGER_32
            l_persistent_cache_includes: LIST [STRING_32]
            l_lease_check_mode: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_document_document_node_store_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mongouri, l_db, l_socket_keep_alive, l_cache, l_node_cache_percentage, l_prev_doc_cache_percentage, l_children_cache_percentage, l_diff_cache_percentage, l_cache_segment_count, l_cache_stack_move_distance, l_blob_cache_size, l_persistent_cache, l_journal_cache, l_custom_blob_store, l_journal_gc_interval, l_journal_gc_max_age, l_prefetch_external_changes, l_role, l_version_gc_max_age_in_secs, l_version_gc_expression, l_version_gc_time_limit_in_secs, l_blob_gc_max_age_in_secs, l_blob_track_snapshot_interval_in_secs, l_repository_home, l_max_replication_lag_in_secs, l_document_store_type, l_bundling_disabled, l_update_limit, l_persistent_cache_includes, l_lease_check_mode)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_DOCUMENT_DOCUMENT_NODE_STORE_SERVICE_PRE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_persistent_cache_includes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_persistent_cache_includes)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_DOCUMENT_SECONDARY_SECONDARY_STORE_CAC_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_included_paths: LIST [STRING_32]
            l_enable_async_observer: BOOLEAN
            l_observer_queue_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_included_paths, l_enable_async_observer, l_observer_queue_size)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_index_async_indexer_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_INDEX_ASYNC_INDEXER_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_async_configs: LIST [STRING_32]
            l_lease_time_out_minutes: INTEGER_32
            l_failing_index_timeout_seconds: INTEGER_32
            l_error_warn_interval_seconds: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_index_async_indexer_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_async_configs, l_lease_time_out_minutes, l_failing_index_timeout_seconds, l_error_warn_interval_seconds)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_INDEX_LUCENE_LUCENE_INDEX_PROVIDER_SERV_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_disabled: BOOLEAN
            l_var_debug: BOOLEAN
            l_local_index_dir: STRING_32
            l_enable_open_index_async: BOOLEAN
            l_thread_pool_size: INTEGER_32
            l_prefetch_index_files: BOOLEAN
            l_extracted_text_cache_size_in_mb: INTEGER_32
            l_extracted_text_cache_expiry_in_secs: INTEGER_32
            l_always_use_pre_extracted_cache: BOOLEAN
            l_boolean_clause_limit: INTEGER_32
            l_enable_hybrid_indexing: BOOLEAN
            l_hybrid_queue_size: INTEGER_32
            l_disable_stored_index_definition: BOOLEAN
            l_deleted_blobs_collection_enabled: BOOLEAN
            l_prop_index_cleaner_interval_in_secs: INTEGER_32
            l_enable_single_blob_index_files: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_disabled, l_var_debug, l_local_index_dir, l_enable_open_index_async, l_thread_pool_size, l_prefetch_index_files, l_extracted_text_cache_size_in_mb, l_extracted_text_cache_expiry_in_secs, l_always_use_pre_extracted_cache, l_boolean_clause_limit, l_enable_hybrid_indexing, l_hybrid_queue_size, l_disable_stored_index_definition, l_deleted_blobs_collection_enabled, l_prop_index_cleaner_interval_in_secs, l_enable_single_blob_index_files)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_INDEX_SOLR_OSGI_EMBEDDED_SOLR_SERVER_CO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_solr_home_path: STRING_32
            l_solr_core_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_solr_home_path, l_solr_core_name)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_INDEX_SOLR_OSGI_NODE_STATE_SOLR_SERVERS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_INDEX_SOLR_OSGI_OAK_SOLR_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path_desc_field: STRING_32
            l_path_child_field: STRING_32
            l_path_parent_field: STRING_32
            l_path_exact_field: STRING_32
            l_catch_all_field: STRING_32
            l_collapsed_path_field: STRING_32
            l_path_depth_field: STRING_32
            l_commit_policy: STRING_32
            l_rows: INTEGER_32
            l_path_restrictions: BOOLEAN
            l_property_restrictions: BOOLEAN
            l_primarytypes_restrictions: BOOLEAN
            l_ignored_properties: LIST [STRING_32]
            l_used_properties: LIST [STRING_32]
            l_type_mappings: LIST [STRING_32]
            l_property_mappings: LIST [STRING_32]
            l_collapse_jcrcontent_nodes: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path_desc_field, l_path_child_field, l_path_parent_field, l_path_exact_field, l_catch_all_field, l_collapsed_path_field, l_path_depth_field, l_commit_policy, l_rows, l_path_restrictions, l_property_restrictions, l_primarytypes_restrictions, l_ignored_properties, l_used_properties, l_type_mappings, l_property_mappings, l_collapse_jcrcontent_nodes)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_INDEX_SOLR_OSGI_REMOTE_SOLR_SERVER_CONF_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_solr_http_url: STRING_32
            l_solr_zk_host: STRING_32
            l_solr_collection: STRING_32
            l_solr_socket_timeout: INTEGER_32
            l_solr_connection_timeout: INTEGER_32
            l_solr_shards_no: INTEGER_32
            l_solr_replication_factor: INTEGER_32
            l_solr_conf_dir: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_solr_http_url, l_solr_zk_host, l_solr_collection, l_solr_socket_timeout, l_solr_connection_timeout, l_solr_shards_no, l_solr_replication_factor, l_solr_conf_dir)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_INDEX_SOLR_OSGI_SOLR_QUERY_INDEX_PROVID_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_query_aggregation: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_query_aggregation)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_INDEX_SOLR_OSGI_SOLR_SERVER_PROVIDER_SE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_server_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_server_type)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_METRIC_STATISTICS_PROVIDER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_provider_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_provider_type)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_PLUGINS_OBSERVATION_CHANGE_COLLECTOR_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_items: INTEGER_32
            l_max_path_depth: INTEGER_32
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_plugins_observation_change_collector_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_items, l_max_path_depth, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_query_query_engine_settings_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_QUERY_QUERY_ENGINE_SETTINGS_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_query_limit_in_memory: INTEGER_32
            l_query_limit_reads: INTEGER_32
            l_query_fail_traversal: BOOLEAN
            l_fast_query_size: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_query_query_engine_settings_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_query_limit_in_memory, l_query_limit_reads, l_query_fail_traversal, l_fast_query_size)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_security_authentication_authentication_config
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SECURITY_AUTHENTICATION_AUTHENTICATION_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_jackrabbit_oak_authentication_app_name: STRING_32
            l_org_apache_jackrabbit_oak_authentication_config_spi_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_security_authentication_authentication_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_jackrabbit_oak_authentication_app_name, l_org_apache_jackrabbit_oak_authentication_config_spi_name)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SECURITY_AUTHENTICATION_LDAP_IMPL_LDAP_IDENTI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_provider_name: STRING_32
            l_host_name: STRING_32
            l_host_port: INTEGER_32
            l_host_ssl: BOOLEAN
            l_host_tls: BOOLEAN
            l_host_no_cert_check: BOOLEAN
            l_bind_dn: STRING_32
            l_bind_password: STRING_32
            l_search_timeout: STRING_32
            l_admin_pool_max_active: INTEGER_32
            l_admin_pool_lookup_on_validate: BOOLEAN
            l_user_pool_max_active: INTEGER_32
            l_user_pool_lookup_on_validate: BOOLEAN
            l_user_base_dn: STRING_32
            l_user_objectclass: LIST [STRING_32]
            l_user_id_attribute: STRING_32
            l_user_extra_filter: STRING_32
            l_user_make_dn_path: BOOLEAN
            l_group_base_dn: STRING_32
            l_group_objectclass: LIST [STRING_32]
            l_group_name_attribute: STRING_32
            l_group_extra_filter: STRING_32
            l_group_make_dn_path: BOOLEAN
            l_group_member_attribute: STRING_32
            l_use_uid_for_ext_id: BOOLEAN
            l_customattributes: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_provider_name, l_host_name, l_host_port, l_host_ssl, l_host_tls, l_host_no_cert_check, l_bind_dn, l_bind_password, l_search_timeout, l_admin_pool_max_active, l_admin_pool_lookup_on_validate, l_user_pool_max_active, l_user_pool_lookup_on_validate, l_user_base_dn, l_user_objectclass, l_user_id_attribute, l_user_extra_filter, l_user_make_dn_path, l_group_base_dn, l_group_objectclass, l_group_name_attribute, l_group_extra_filter, l_group_make_dn_path, l_group_member_attribute, l_use_uid_for_ext_id, l_customattributes)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_security_authentication_token_token_configura
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SECURITY_AUTHENTICATION_TOKEN_TOKEN_CONFIGURA_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_token_expiration: STRING_32
            l_token_length: STRING_32
            l_token_refresh: BOOLEAN
            l_token_cleanup_threshold: INTEGER_32
            l_password_hash_algorithm: STRING_32
            l_password_hash_iterations: INTEGER_32
            l_password_salt_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_security_authentication_token_token_configura(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_token_expiration, l_token_length, l_token_refresh, l_token_cleanup_threshold, l_password_hash_algorithm, l_password_hash_iterations, l_password_salt_size)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_security_authorization_authorization_configur
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SECURITY_AUTHORIZATION_AUTHORIZATION_CONFIGUR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_permissions_jr2: STRING_32
            l_import_behavior: STRING_32
            l_read_paths: LIST [STRING_32]
            l_administrative_principals: LIST [STRING_32]
            l_configuration_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_security_authorization_authorization_configur(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_permissions_jr2, l_import_behavior, l_read_paths, l_administrative_principals, l_configuration_ranking)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_security_internal_security_provider_registrati
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SECURITY_INTERNAL_SECURITY_PROVIDER_REGISTRATI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_required_service_pids: LIST [STRING_32]
            l_authorization_composition_type: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_security_internal_security_provider_registrati(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_required_service_pids, l_authorization_composition_type)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SECURITY_USER_RANDOM_AUTHORIZABLE_NODE_NAME_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_length: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_security_user_random_authorizable_node_name(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_length)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_security_user_user_configuration_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SECURITY_USER_USER_CONFIGURATION_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_users_path: STRING_32
            l_groups_path: STRING_32
            l_system_relative_path: STRING_32
            l_default_depth: INTEGER_32
            l_import_behavior: STRING_32
            l_password_hash_algorithm: STRING_32
            l_password_hash_iterations: INTEGER_32
            l_password_salt_size: INTEGER_32
            l_omit_admin_pw: BOOLEAN
            l_support_auto_save: BOOLEAN
            l_password_max_age: INTEGER_32
            l_initial_password_change: BOOLEAN
            l_password_history_size: INTEGER_32
            l_password_expiry_for_admin: BOOLEAN
            l_cache_expiration: INTEGER_32
            l_enable_rf_c7613_usercase_mapped_profile: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_security_user_user_configuration_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_users_path, l_groups_path, l_system_relative_path, l_default_depth, l_import_behavior, l_password_hash_algorithm, l_password_hash_iterations, l_password_salt_size, l_omit_admin_pw, l_support_auto_save, l_password_max_age, l_initial_password_change, l_password_history_size, l_password_expiry_for_admin, l_cache_expiration, l_enable_rf_c7613_usercase_mapped_profile)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SEGMENT_AZURE_AZURE_SEGMENT_STORE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_account_name: STRING_32
            l_container_name: STRING_32
            l_access_key: STRING_32
            l_root_path: STRING_32
            l_connection_ur_l: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_account_name, l_container_name, l_access_key, l_root_path, l_connection_ur_l)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_segment_segment_node_store_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SEGMENT_SEGMENT_NODE_STORE_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_repository_home: STRING_32
            l_tarmk_mode: STRING_32
            l_tarmk_size: INTEGER_32
            l_segment_cache_size: INTEGER_32
            l_string_cache_size: INTEGER_32
            l_template_cache_size: INTEGER_32
            l_string_deduplication_cache_size: INTEGER_32
            l_template_deduplication_cache_size: INTEGER_32
            l_node_deduplication_cache_size: INTEGER_32
            l_pause_compaction: BOOLEAN
            l_compaction_retry_count: INTEGER_32
            l_compaction_force_timeout: INTEGER_32
            l_compaction_size_delta_estimation: INTEGER_32
            l_compaction_disable_estimation: BOOLEAN
            l_compaction_retained_generations: INTEGER_32
            l_compaction_memory_threshold: INTEGER_32
            l_compaction_progress_log: INTEGER_32
            l_standby: BOOLEAN
            l_custom_blob_store: BOOLEAN
            l_custom_segment_store: BOOLEAN
            l_split_persistence: BOOLEAN
            l_repository_backup_dir: STRING_32
            l_blob_gc_max_age_in_secs: INTEGER_32
            l_blob_track_snapshot_interval_in_secs: INTEGER_32
            l_role: STRING_32
            l_register_descriptors: BOOLEAN
            l_dispatch_changes: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_segment_segment_node_store_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_repository_home, l_tarmk_mode, l_tarmk_size, l_segment_cache_size, l_string_cache_size, l_template_cache_size, l_string_deduplication_cache_size, l_template_deduplication_cache_size, l_node_deduplication_cache_size, l_pause_compaction, l_compaction_retry_count, l_compaction_force_timeout, l_compaction_size_delta_estimation, l_compaction_disable_estimation, l_compaction_retained_generations, l_compaction_memory_threshold, l_compaction_progress_log, l_standby, l_custom_blob_store, l_custom_segment_store, l_split_persistence, l_repository_backup_dir, l_blob_gc_max_age_in_secs, l_blob_track_snapshot_interval_in_secs, l_role, l_register_descriptors, l_dispatch_changes)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SEGMENT_SEGMENT_NODE_STORE_MONITOR_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_commits_tracker_writer_groups: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_commits_tracker_writer_groups)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_segment_segment_node_store_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SEGMENT_SEGMENT_NODE_STORE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_repository_home: STRING_32
            l_tarmk_mode: STRING_32
            l_tarmk_size: INTEGER_32
            l_segment_cache_size: INTEGER_32
            l_string_cache_size: INTEGER_32
            l_template_cache_size: INTEGER_32
            l_string_deduplication_cache_size: INTEGER_32
            l_template_deduplication_cache_size: INTEGER_32
            l_node_deduplication_cache_size: INTEGER_32
            l_pause_compaction: BOOLEAN
            l_compaction_retry_count: INTEGER_32
            l_compaction_force_timeout: INTEGER_32
            l_compaction_size_delta_estimation: INTEGER_32
            l_compaction_disable_estimation: BOOLEAN
            l_compaction_retained_generations: INTEGER_32
            l_compaction_memory_threshold: INTEGER_32
            l_compaction_progress_log: INTEGER_32
            l_standby: BOOLEAN
            l_custom_blob_store: BOOLEAN
            l_custom_segment_store: BOOLEAN
            l_split_persistence: BOOLEAN
            l_repository_backup_dir: STRING_32
            l_blob_gc_max_age_in_secs: INTEGER_32
            l_blob_track_snapshot_interval_in_secs: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_segment_segment_node_store_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_repository_home, l_tarmk_mode, l_tarmk_size, l_segment_cache_size, l_string_cache_size, l_template_cache_size, l_string_deduplication_cache_size, l_template_deduplication_cache_size, l_node_deduplication_cache_size, l_pause_compaction, l_compaction_retry_count, l_compaction_force_timeout, l_compaction_size_delta_estimation, l_compaction_disable_estimation, l_compaction_retained_generations, l_compaction_memory_threshold, l_compaction_progress_log, l_standby, l_custom_blob_store, l_custom_segment_store, l_split_persistence, l_repository_backup_dir, l_blob_gc_max_age_in_secs, l_blob_track_snapshot_interval_in_secs)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SEGMENT_STANDBY_STORE_STANDBY_STORE_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_installer_configuration_persist: BOOLEAN
            l_mode: STRING_32
            l_port: INTEGER_32
            l_primary_host: STRING_32
            l_interval: INTEGER_32
            l_primary_allowed_client_ip_ranges: LIST [STRING_32]
            l_secure: BOOLEAN
            l_standby_readtimeout: INTEGER_32
            l_standby_autoclean: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_segment_standby_store_standby_store_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_installer_configuration_persist, l_mode, l_port, l_primary_host, l_interval, l_primary_allowed_client_ip_ranges, l_secure, l_standby_readtimeout, l_standby_autoclean)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_EXTERNAL_IMPL_DE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_handler_name: STRING_32
            l_user_expiration_time: STRING_32
            l_user_auto_membership: LIST [STRING_32]
            l_user_property_mapping: LIST [STRING_32]
            l_user_path_prefix: STRING_32
            l_user_membership_exp_time: STRING_32
            l_user_membership_nesting_depth: INTEGER_32
            l_user_dynamic_membership: BOOLEAN
            l_user_disable_missing: BOOLEAN
            l_group_expiration_time: STRING_32
            l_group_auto_membership: LIST [STRING_32]
            l_group_property_mapping: LIST [STRING_32]
            l_group_path_prefix: STRING_32
            l_enable_rf_c7613_usercase_mapped_profile: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_handler_name, l_user_expiration_time, l_user_auto_membership, l_user_property_mapping, l_user_path_prefix, l_user_membership_exp_time, l_user_membership_nesting_depth, l_user_dynamic_membership, l_user_disable_missing, l_group_expiration_time, l_group_auto_membership, l_group_property_mapping, l_group_path_prefix, l_enable_rf_c7613_usercase_mapped_profile)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_EXTERNAL_IMPL_EX_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_jaas_ranking: INTEGER_32
            l_jaas_control_flag: STRING_32
            l_jaas_realm_name: STRING_32
            l_idp_name: STRING_32
            l_sync_handler_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_jaas_ranking, l_jaas_control_flag, l_jaas_realm_name, l_idp_name, l_sync_handler_name)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHENTICATION_EXTERNAL_IMPL_PR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_protect_external_id: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_protect_external_id)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_CUG_IMPL_CUG_CONFI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_cug_supported_paths: LIST [STRING_32]
            l_cug_enabled: BOOLEAN
            l_configuration_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_cug_supported_paths, l_cug_enabled, l_configuration_ranking)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_AUTHORIZATION_CUG_IMPL_CUG_EXCLU_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_principal_names: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_principal_names)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_OAK_SPI_SECURITY_USER_ACTION_DEFAULT_AUTHORIZABLE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled_actions: STRING_32
            l_user_privilege_names: LIST [STRING_32]
            l_group_privilege_names: LIST [STRING_32]
            l_constraint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled_actions, l_user_privilege_names, l_group_privilege_names, l_constraint)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_vault_packaging_impl_packaging_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_IMPL_PACKAGING_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_package_roots: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_vault_packaging_impl_packaging_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_package_roots)
            assert ("not_implemented", False)
        end
    
    test_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_JACKRABBIT_VAULT_PACKAGING_REGISTRY_IMPL_FS_PACKAGE_REGISTRY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_home_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_home_path)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_auth_core_impl_logout_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_AUTH_CORE_IMPL_LOGOUT_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_methods: LIST [STRING_32]
            l_sling_servlet_paths: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_auth_core_impl_logout_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_methods, l_sling_servlet_paths)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_impl_configuration_bindings_value_provider
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_IMPL_CONFIGURATION_BINDINGS_VALUE_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_impl_configuration_bindings_value_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_impl_configuration_resolver_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_IMPL_CONFIGURATION_RESOLVER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_config_bucket_names: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_impl_configuration_resolver_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_config_bucket_names)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_IMPL_DEF_DEFAULT_CONFIGURATION_INHERITANCE_STRA_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_config_property_inheritance_property_names: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_config_property_inheritance_property_names)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_IMPL_DEF_DEFAULT_CONFIGURATION_PERSISTENCE_STRA_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_IMPL_OVERRIDE_OSGI_CONFIGURATION_OVERRIDE_PROVI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_description: STRING_32
            l_overrides: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_description, l_overrides, l_enabled, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_impl_override_system_property_configuration_ove
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_IMPL_OVERRIDE_SYSTEM_PROPERTY_CONFIGURATION_OVE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_impl_override_system_property_configuration_ove(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_management_impl_configuration_management_setti
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_MANAGEMENT_IMPL_CONFIGURATION_MANAGEMENT_SETTI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_ignore_property_name_regex: LIST [STRING_32]
            l_config_collection_properties_resource_names: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_management_impl_configuration_management_setti(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_ignore_property_name_regex, l_config_collection_properties_resource_names)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_RESOURCE_IMPL_DEF_DEFAULT_CONFIGURATION_RESOUR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_config_path: STRING_32
            l_fallback_paths: LIST [STRING_32]
            l_config_collection_inheritance_property_names: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_resource_impl_def_default_configuration_resour(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_config_path, l_fallback_paths, l_config_collection_inheritance_property_names)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_CACONFIG_RESOURCE_IMPL_DEF_DEFAULT_CONTEXT_PATH_STRATEGY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_config_ref_resource_names: LIST [STRING_32]
            l_config_ref_property_names: LIST [STRING_32]
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_enabled, l_config_ref_resource_names, l_config_ref_property_names, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_html_internal_tagsoup_html_parser
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_HTML_INTERNAL_TAGSOUP_HTML_PARSER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_parser_features: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_html_internal_tagsoup_html_parser(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_parser_features)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_log_log_manager
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_LOG_LOG_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_commons_log_level: STRING_32
            l_org_apache_sling_commons_log_file: STRING_32
            l_org_apache_sling_commons_log_file_number: INTEGER_32
            l_org_apache_sling_commons_log_file_size: STRING_32
            l_org_apache_sling_commons_log_pattern: STRING_32
            l_org_apache_sling_commons_log_configuration_file: STRING_32
            l_org_apache_sling_commons_log_packaging_data_enabled: BOOLEAN
            l_org_apache_sling_commons_log_max_caller_data_depth: INTEGER_32
            l_org_apache_sling_commons_log_max_old_file_count_in_dump: INTEGER_32
            l_org_apache_sling_commons_log_num_of_lines: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_log_log_manager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_commons_log_level, l_org_apache_sling_commons_log_file, l_org_apache_sling_commons_log_file_number, l_org_apache_sling_commons_log_file_size, l_org_apache_sling_commons_log_pattern, l_org_apache_sling_commons_log_configuration_file, l_org_apache_sling_commons_log_packaging_data_enabled, l_org_apache_sling_commons_log_max_caller_data_depth, l_org_apache_sling_commons_log_max_old_file_count_in_dump, l_org_apache_sling_commons_log_num_of_lines)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_log_log_manager_factory_config
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_LOG_LOG_MANAGER_FACTORY_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_commons_log_level: STRING_32
            l_org_apache_sling_commons_log_file: STRING_32
            l_org_apache_sling_commons_log_pattern: STRING_32
            l_org_apache_sling_commons_log_names: LIST [STRING_32]
            l_org_apache_sling_commons_log_additiv: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_log_log_manager_factory_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_commons_log_level, l_org_apache_sling_commons_log_file, l_org_apache_sling_commons_log_pattern, l_org_apache_sling_commons_log_names, l_org_apache_sling_commons_log_additiv)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_log_log_manager_factory_writer
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_LOG_LOG_MANAGER_FACTORY_WRITER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_commons_log_file: STRING_32
            l_org_apache_sling_commons_log_file_number: INTEGER_32
            l_org_apache_sling_commons_log_file_size: STRING_32
            l_org_apache_sling_commons_log_file_buffered: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_log_log_manager_factory_writer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_commons_log_file, l_org_apache_sling_commons_log_file_number, l_org_apache_sling_commons_log_file_size, l_org_apache_sling_commons_log_file_buffered)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_metrics_internal_log_reporter
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_METRICS_INTERNAL_LOG_REPORTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_period: INTEGER_32
            l_time_unit: STRING_32
            l_level: STRING_32
            l_logger_name: STRING_32
            l_prefix: STRING_32
            l_pattern: STRING_32
            l_registry_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_metrics_internal_log_reporter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_period, l_time_unit, l_level, l_logger_name, l_prefix, l_pattern, l_registry_name)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_METRICS_RRD4J_IMPL_CODAHALE_METRICS_REPORTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_datasources: LIST [STRING_32]
            l_step: INTEGER_32
            l_archives: LIST [STRING_32]
            l_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_datasources, l_step, l_archives, l_path)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_mime_internal_mime_type_service_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_MIME_INTERNAL_MIME_TYPE_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_mime_types: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_mime_internal_mime_type_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_mime_types)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_scheduler_impl_quartz_scheduler
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_SCHEDULER_IMPL_QUARTZ_SCHEDULER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_pool_name: STRING_32
            l_allowed_pool_names: LIST [STRING_32]
            l_scheduler_useleaderforsingle: BOOLEAN
            l_metrics_filters: LIST [STRING_32]
            l_slow_threshold_millis: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_scheduler_impl_quartz_scheduler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_pool_name, l_allowed_pool_names, l_scheduler_useleaderforsingle, l_metrics_filters, l_slow_threshold_millis)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_scheduler_impl_scheduler_health_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_SCHEDULER_IMPL_SCHEDULER_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_quartz_job_duration_acceptable: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_scheduler_impl_scheduler_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_quartz_job_duration_acceptable)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_commons_threads_impl_default_thread_pool_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_COMMONS_THREADS_IMPL_DEFAULT_THREAD_POOL_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_min_pool_size: INTEGER_32
            l_max_pool_size: INTEGER_32
            l_queue_size: INTEGER_32
            l_max_thread_age: INTEGER_32
            l_keep_alive_time: INTEGER_32
            l_block_policy: STRING_32
            l_shutdown_graceful: BOOLEAN
            l_daemon: BOOLEAN
            l_shutdown_wait_time: INTEGER_32
            l_priority: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_commons_threads_impl_default_thread_pool_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_min_pool_size, l_max_pool_size, l_queue_size, l_max_thread_age, l_keep_alive_time, l_block_policy, l_shutdown_graceful, l_daemon, l_shutdown_wait_time, l_priority)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_datasource_data_source_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DATASOURCE_DATA_SOURCE_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_datasource_name: STRING_32
            l_datasource_svc_prop_name: STRING_32
            l_driver_class_name: STRING_32
            l_url: STRING_32
            l_username: STRING_32
            l_password: STRING_32
            l_default_auto_commit: STRING_32
            l_default_read_only: STRING_32
            l_default_transaction_isolation: STRING_32
            l_default_catalog: STRING_32
            l_max_active: INTEGER_32
            l_max_idle: INTEGER_32
            l_min_idle: INTEGER_32
            l_initial_size: INTEGER_32
            l_max_wait: INTEGER_32
            l_max_age: INTEGER_32
            l_test_on_borrow: BOOLEAN
            l_test_on_return: BOOLEAN
            l_test_while_idle: BOOLEAN
            l_validation_query: STRING_32
            l_validation_query_timeout: INTEGER_32
            l_time_between_eviction_runs_millis: INTEGER_32
            l_min_evictable_idle_time_millis: INTEGER_32
            l_connection_properties: STRING_32
            l_init_sq_l: STRING_32
            l_jdbc_interceptors: STRING_32
            l_validation_interval: INTEGER_32
            l_log_validation_errors: BOOLEAN
            l_datasource_svc_properties: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_datasource_data_source_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_datasource_name, l_datasource_svc_prop_name, l_driver_class_name, l_url, l_username, l_password, l_default_auto_commit, l_default_read_only, l_default_transaction_isolation, l_default_catalog, l_max_active, l_max_idle, l_min_idle, l_initial_size, l_max_wait, l_max_age, l_test_on_borrow, l_test_on_return, l_test_while_idle, l_validation_query, l_validation_query_timeout, l_time_between_eviction_runs_millis, l_min_evictable_idle_time_millis, l_connection_properties, l_init_sq_l, l_jdbc_interceptors, l_validation_interval, l_log_validation_errors, l_datasource_svc_properties)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_datasource_jn_di_data_source_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DATASOURCE_JNDI_DATA_SOURCE_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_datasource_name: STRING_32
            l_datasource_svc_prop_name: STRING_32
            l_datasource_jndi_name: STRING_32
            l_jndi_properties: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_datasource_jn_di_data_source_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_datasource_name, l_datasource_svc_prop_name, l_datasource_jndi_name, l_jndi_properties)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_discovery_oak_config
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISCOVERY_OAK_CONFIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_connector_ping_timeout: INTEGER_32
            l_connector_ping_interval: INTEGER_32
            l_discovery_lite_check_interval: INTEGER_32
            l_cluster_sync_service_timeout: INTEGER_32
            l_cluster_sync_service_interval: INTEGER_32
            l_enable_sync_token: BOOLEAN
            l_min_event_delay: INTEGER_32
            l_socket_connect_timeout: INTEGER_32
            l_so_timeout: INTEGER_32
            l_topology_connector_urls: LIST [STRING_32]
            l_topology_connector_whitelist: LIST [STRING_32]
            l_auto_stop_local_loop_enabled: BOOLEAN
            l_gzip_connector_requests_enabled: BOOLEAN
            l_hmac_enabled: BOOLEAN
            l_enable_encryption: BOOLEAN
            l_shared_key: STRING_32
            l_hmac_shared_key_tt_l: INTEGER_32
            l_backoff_standby_factor: STRING_32
            l_backoff_stable_factor: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_discovery_oak_config(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_connector_ping_timeout, l_connector_ping_interval, l_discovery_lite_check_interval, l_cluster_sync_service_timeout, l_cluster_sync_service_interval, l_enable_sync_token, l_min_event_delay, l_socket_connect_timeout, l_so_timeout, l_topology_connector_urls, l_topology_connector_whitelist, l_auto_stop_local_loop_enabled, l_gzip_connector_requests_enabled, l_hmac_enabled, l_enable_encryption, l_shared_key, l_hmac_shared_key_tt_l, l_backoff_standby_factor, l_backoff_stable_factor)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_discovery_oak_synchronized_clocks_health_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISCOVERY_OAK_SYNCHRONIZED_CLOCKS_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_name: STRING_32
            l_hc_tags: LIST [STRING_32]
            l_hc_mbean_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_discovery_oak_synchronized_clocks_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_name, l_hc_tags, l_hc_mbean_name)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_AGENT_IMPL_FORWARD_DISTRIBUTION_AGENT_FACTO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_title: STRING_32
            l_details: STRING_32
            l_enabled: BOOLEAN
            l_service_name: STRING_32
            l_log_level: STRING_32
            l_allowed_roots: LIST [STRING_32]
            l_queue_processing_enabled: BOOLEAN
            l_package_importer_endpoints: LIST [STRING_32]
            l_passive_queues: LIST [STRING_32]
            l_priority_queues: LIST [STRING_32]
            l_retry_strategy: STRING_32
            l_retry_attempts: INTEGER_32
            l_request_authorization_strategy_target: STRING_32
            l_transport_secret_provider_target: STRING_32
            l_package_builder_target: STRING_32
            l_triggers_target: STRING_32
            l_queue_provider: STRING_32
            l_async_delivery: BOOLEAN
            l_http_conn_timeout: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_title, l_details, l_enabled, l_service_name, l_log_level, l_allowed_roots, l_queue_processing_enabled, l_package_importer_endpoints, l_passive_queues, l_priority_queues, l_retry_strategy, l_retry_attempts, l_request_authorization_strategy_target, l_transport_secret_provider_target, l_package_builder_target, l_triggers_target, l_queue_provider, l_async_delivery, l_http_conn_timeout)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_AGENT_IMPL_PRIVILEGE_DISTRIBUTION_REQUEST_A_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_jcr_privilege: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_agent_impl_privilege_distribution_request_a(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_jcr_privilege)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_AGENT_IMPL_QUEUE_DISTRIBUTION_AGENT_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_title: STRING_32
            l_details: STRING_32
            l_enabled: BOOLEAN
            l_service_name: STRING_32
            l_log_level: STRING_32
            l_allowed_roots: LIST [STRING_32]
            l_request_authorization_strategy_target: STRING_32
            l_queue_provider_factory_target: STRING_32
            l_package_builder_target: STRING_32
            l_triggers_target: STRING_32
            l_priority_queues: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_title, l_details, l_enabled, l_service_name, l_log_level, l_allowed_roots, l_request_authorization_strategy_target, l_queue_provider_factory_target, l_package_builder_target, l_triggers_target, l_priority_queues)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_AGENT_IMPL_REVERSE_DISTRIBUTION_AGENT_FACTO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_title: STRING_32
            l_details: STRING_32
            l_enabled: BOOLEAN
            l_service_name: STRING_32
            l_log_level: STRING_32
            l_queue_processing_enabled: BOOLEAN
            l_package_exporter_endpoints: LIST [STRING_32]
            l_pull_items: INTEGER_32
            l_http_conn_timeout: INTEGER_32
            l_request_authorization_strategy_target: STRING_32
            l_transport_secret_provider_target: STRING_32
            l_package_builder_target: STRING_32
            l_triggers_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_title, l_details, l_enabled, l_service_name, l_log_level, l_queue_processing_enabled, l_package_exporter_endpoints, l_pull_items, l_http_conn_timeout, l_request_authorization_strategy_target, l_transport_secret_provider_target, l_package_builder_target, l_triggers_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_AGENT_IMPL_SIMPLE_DISTRIBUTION_AGENT_FACTOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_title: STRING_32
            l_details: STRING_32
            l_enabled: BOOLEAN
            l_service_name: STRING_32
            l_log_level: STRING_32
            l_queue_processing_enabled: BOOLEAN
            l_package_exporter_target: STRING_32
            l_package_importer_target: STRING_32
            l_request_authorization_strategy_target: STRING_32
            l_triggers_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_title, l_details, l_enabled, l_service_name, l_log_level, l_queue_processing_enabled, l_package_exporter_target, l_package_importer_target, l_request_authorization_strategy_target, l_triggers_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_AGENT_IMPL_SYNC_DISTRIBUTION_AGENT_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_title: STRING_32
            l_details: STRING_32
            l_enabled: BOOLEAN
            l_service_name: STRING_32
            l_log_level: STRING_32
            l_queue_processing_enabled: BOOLEAN
            l_passive_queues: LIST [STRING_32]
            l_package_exporter_endpoints: LIST [STRING_32]
            l_package_importer_endpoints: LIST [STRING_32]
            l_retry_strategy: STRING_32
            l_retry_attempts: INTEGER_32
            l_pull_items: INTEGER_32
            l_http_conn_timeout: INTEGER_32
            l_request_authorization_strategy_target: STRING_32
            l_transport_secret_provider_target: STRING_32
            l_package_builder_target: STRING_32
            l_triggers_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_title, l_details, l_enabled, l_service_name, l_log_level, l_queue_processing_enabled, l_passive_queues, l_package_exporter_endpoints, l_package_importer_endpoints, l_retry_strategy, l_retry_attempts, l_pull_items, l_http_conn_timeout, l_request_authorization_strategy_target, l_transport_secret_provider_target, l_package_builder_target, l_triggers_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_monitor_distribution_queue_health_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_MONITOR_DISTRIBUTION_QUEUE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_name: STRING_32
            l_hc_tags: LIST [STRING_32]
            l_hc_mbean_name: STRING_32
            l_number_of_retries_allowed: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_monitor_distribution_queue_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_name, l_hc_tags, l_hc_mbean_name, l_number_of_retries_allowed)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_packaging_impl_exporter_agent_distributio
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_PACKAGING_IMPL_EXPORTER_AGENT_DISTRIBUTIO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_queue: STRING_32
            l_drop_invalid_items: BOOLEAN
            l_agent_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_packaging_impl_exporter_agent_distributio(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_queue, l_drop_invalid_items, l_agent_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_packaging_impl_exporter_local_distributio
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_PACKAGING_IMPL_EXPORTER_LOCAL_DISTRIBUTIO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_package_builder_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_packaging_impl_exporter_local_distributio(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_package_builder_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_packaging_impl_exporter_remote_distributi
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_PACKAGING_IMPL_EXPORTER_REMOTE_DISTRIBUTI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_endpoints: LIST [STRING_32]
            l_pull_items: INTEGER_32
            l_package_builder_target: STRING_32
            l_transport_secret_provider_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_packaging_impl_exporter_remote_distributi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_endpoints, l_pull_items, l_package_builder_target, l_transport_secret_provider_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_packaging_impl_importer_local_distributio
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_PACKAGING_IMPL_IMPORTER_LOCAL_DISTRIBUTIO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_package_builder_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_packaging_impl_importer_local_distributio(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_package_builder_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_packaging_impl_importer_remote_distributi
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_PACKAGING_IMPL_IMPORTER_REMOTE_DISTRIBUTI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_endpoints: LIST [STRING_32]
            l_transport_secret_provider_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_packaging_impl_importer_remote_distributi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_endpoints, l_transport_secret_provider_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_packaging_impl_importer_repository_distri
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_PACKAGING_IMPL_IMPORTER_REPOSITORY_DISTRI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_service_name: STRING_32
            l_path: STRING_32
            l_privilege_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_packaging_impl_importer_repository_distri(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_service_name, l_path, l_privilege_name)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_resources_impl_distribution_configuration
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_RESOURCES_IMPL_DISTRIBUTION_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_provider_roots: STRING_32
            l_kind: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_resources_impl_distribution_configuration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_provider_roots, l_kind)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_resources_impl_distribution_service_resour
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_RESOURCES_IMPL_DISTRIBUTION_SERVICE_RESOUR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_provider_roots: STRING_32
            l_kind: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_resources_impl_distribution_service_resour(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_provider_roots, l_kind)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_serialization_impl_distribution_package_bu
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_SERIALIZATION_IMPL_DISTRIBUTION_PACKAGE_BU_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_type: STRING_32
            l_format_target: STRING_32
            l_temp_fs_folder: STRING_32
            l_file_threshold: INTEGER_32
            l_memory_unit: STRING_32
            l_use_off_heap_memory: BOOLEAN
            l_digest_algorithm: STRING_32
            l_monitoring_queue_size: INTEGER_32
            l_cleanup_delay: INTEGER_32
            l_package_filters: LIST [STRING_32]
            l_property_filters: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_serialization_impl_distribution_package_bu(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_type, l_format_target, l_temp_fs_folder, l_file_threshold, l_memory_unit, l_use_off_heap_memory, l_digest_algorithm, l_monitoring_queue_size, l_cleanup_delay, l_package_filters, l_property_filters)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_SERIALIZATION_IMPL_VLT_VAULT_DISTRIBUTION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_type: STRING_32
            l_import_mode: STRING_32
            l_acl_handling: STRING_32
            l_package_roots: STRING_32
            l_package_filters: LIST [STRING_32]
            l_property_filters: LIST [STRING_32]
            l_temp_fs_folder: STRING_32
            l_use_binary_references: BOOLEAN
            l_auto_save_threshold: INTEGER_32
            l_cleanup_delay: INTEGER_32
            l_file_threshold: INTEGER_32
            l_mega_bytes: STRING_32
            l_use_off_heap_memory: BOOLEAN
            l_digest_algorithm: STRING_32
            l_monitoring_queue_size: INTEGER_32
            l_paths_mapping: LIST [STRING_32]
            l_strict_import: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_serialization_impl_vlt_vault_distribution(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_type, l_import_mode, l_acl_handling, l_package_roots, l_package_filters, l_property_filters, l_temp_fs_folder, l_use_binary_references, l_auto_save_threshold, l_cleanup_delay, l_file_threshold, l_mega_bytes, l_use_off_heap_memory, l_digest_algorithm, l_monitoring_queue_size, l_paths_mapping, l_strict_import)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_transport_impl_user_credentials_distributi
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_TRANSPORT_IMPL_USER_CREDENTIALS_DISTRIBUTI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_username: STRING_32
            l_password: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_transport_impl_user_credentials_distributi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_username, l_password)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_trigger_impl_distribution_event_distribute
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_TRIGGER_IMPL_DISTRIBUTION_EVENT_DISTRIBUTE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_trigger_impl_distribution_event_distribute(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_path)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_TRIGGER_IMPL_JCR_EVENT_DISTRIBUTION_TRIGGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_path: STRING_32
            l_ignored_paths_patterns: LIST [STRING_32]
            l_service_name: STRING_32
            l_deep: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_path, l_ignored_paths_patterns, l_service_name, l_deep)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_TRIGGER_IMPL_PERSISTED_JCR_EVENT_DISTRIBUTI_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_path: STRING_32
            l_service_name: STRING_32
            l_nuggets_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_path, l_service_name, l_nuggets_path)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_TRIGGER_IMPL_REMOTE_EVENT_DISTRIBUTION_TRIG_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_endpoint: STRING_32
            l_transport_secret_provider_target: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_endpoint, l_transport_secret_provider_target)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_TRIGGER_IMPL_RESOURCE_EVENT_DISTRIBUTION_TR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_path)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_DISTRIBUTION_TRIGGER_IMPL_SCHEDULED_DISTRIBUTION_TRIGGE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_path: STRING_32
            l_seconds: STRING_32
            l_service_name: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_path, l_seconds, l_service_name)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_engine_impl_auth_sling_authenticator
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_ENGINE_IMPL_AUTH_SLING_AUTHENTICATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_osgi_http_whiteboard_context_select: STRING_32
            l_osgi_http_whiteboard_listener: STRING_32
            l_auth_sudo_cookie: STRING_32
            l_auth_sudo_parameter: STRING_32
            l_auth_annonymous: BOOLEAN
            l_sling_auth_requirements: LIST [STRING_32]
            l_sling_auth_anonymous_user: STRING_32
            l_sling_auth_anonymous_password: STRING_32
            l_auth_http: STRING_32
            l_auth_http_realm: STRING_32
            l_auth_uri_suffix: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_engine_impl_auth_sling_authenticator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_osgi_http_whiteboard_context_select, l_osgi_http_whiteboard_listener, l_auth_sudo_cookie, l_auth_sudo_parameter, l_auth_annonymous, l_sling_auth_requirements, l_sling_auth_anonymous_user, l_sling_auth_anonymous_password, l_auth_http, l_auth_http_realm, l_auth_uri_suffix)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_ENGINE_IMPL_DEBUG_REQUEST_PROGRESS_TRACKER_LOG_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_extensions: LIST [STRING_32]
            l_min_duration_ms: INTEGER_32
            l_max_duration_ms: INTEGER_32
            l_compact_log_format: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_extensions, l_min_duration_ms, l_max_duration_ms, l_compact_log_format)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_engine_impl_log_request_logger
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_ENGINE_IMPL_LOG_REQUEST_LOGGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_request_log_output: STRING_32
            l_request_log_outputtype: INTEGER_32
            l_request_log_enabled: BOOLEAN
            l_access_log_output: STRING_32
            l_access_log_outputtype: INTEGER_32
            l_access_log_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_engine_impl_log_request_logger(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_request_log_output, l_request_log_outputtype, l_request_log_enabled, l_access_log_output, l_access_log_outputtype, l_access_log_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_engine_impl_log_request_logger_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_ENGINE_IMPL_LOG_REQUEST_LOGGER_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_request_log_service_format: STRING_32
            l_request_log_service_output: STRING_32
            l_request_log_service_outputtype: INTEGER_32
            l_request_log_service_onentry: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_engine_impl_log_request_logger_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_request_log_service_format, l_request_log_service_output, l_request_log_service_outputtype, l_request_log_service_onentry)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_engine_impl_sling_main_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_ENGINE_IMPL_SLING_MAIN_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_max_calls: INTEGER_32
            l_sling_max_inclusions: INTEGER_32
            l_sling_trace_allow: BOOLEAN
            l_sling_max_record_requests: INTEGER_32
            l_sling_store_pattern_requests: LIST [STRING_32]
            l_sling_serverinfo: STRING_32
            l_sling_additional_response_headers: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_engine_impl_sling_main_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_max_calls, l_sling_max_inclusions, l_sling_trace_allow, l_sling_max_record_requests, l_sling_store_pattern_requests, l_sling_serverinfo, l_sling_additional_response_headers)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_engine_parameters
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_ENGINE_PARAMETERS_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_default_parameter_encoding: STRING_32
            l_sling_default_max_parameters: INTEGER_32
            l_file_location: STRING_32
            l_file_threshold: INTEGER_32
            l_file_max: INTEGER_32
            l_request_max: INTEGER_32
            l_sling_default_parameter_check_for_additional_container_parameters: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_engine_parameters(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_default_parameter_encoding, l_sling_default_max_parameters, l_file_location, l_file_threshold, l_file_max, l_request_max, l_sling_default_parameter_check_for_additional_container_parameters)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_event_impl_eventing_thread_pool
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_EVENT_IMPL_EVENTING_THREAD_POOL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_min_pool_size: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_event_impl_eventing_thread_pool(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_min_pool_size)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_event_impl_jobs_default_job_manager
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_EVENT_IMPL_JOBS_DEFAULT_JOB_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_queue_priority: STRING_32
            l_queue_retries: INTEGER_32
            l_queue_retrydelay: INTEGER_32
            l_queue_maxparallel: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_event_impl_jobs_default_job_manager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_queue_priority, l_queue_retries, l_queue_retrydelay, l_queue_maxparallel)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_event_impl_jobs_jcr_persistence_handler
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_EVENT_IMPL_JOBS_JCR_PERSISTENCE_HANDLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_job_consumermanager_disable_distribution: BOOLEAN
            l_startup_delay: INTEGER_32
            l_cleanup_period: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_event_impl_jobs_jcr_persistence_handler(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_job_consumermanager_disable_distribution, l_startup_delay, l_cleanup_period)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_event_impl_jobs_job_consumer_manager
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_EVENT_IMPL_JOBS_JOB_CONSUMER_MANAGER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_installer_configuration_persist: BOOLEAN
            l_job_consumermanager_whitelist: LIST [STRING_32]
            l_job_consumermanager_blacklist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_event_impl_jobs_job_consumer_manager(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_installer_configuration_persist, l_job_consumermanager_whitelist, l_job_consumermanager_blacklist)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_event_jobs_queue_configuration
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_EVENT_JOBS_QUEUE_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_queue_name: STRING_32
            l_queue_topics: LIST [STRING_32]
            l_queue_type: STRING_32
            l_queue_priority: STRING_32
            l_queue_retries: INTEGER_32
            l_queue_retrydelay: INTEGER_32
            l_queue_maxparallel: REAL_32
            l_queue_keep_jobs: BOOLEAN
            l_queue_prefer_run_on_creation_instance: BOOLEAN
            l_queue_thread_pool_size: INTEGER_32
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_event_jobs_queue_configuration(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_queue_name, l_queue_topics, l_queue_type, l_queue_priority, l_queue_retries, l_queue_retrydelay, l_queue_maxparallel, l_queue_keep_jobs, l_queue_prefer_run_on_creation_instance, l_queue_thread_pool_size, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_EXTENSIONS_WEBCONSOLESECURITYPROVIDER_INTERNAL_SLING_W_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_users: LIST [STRING_32]
            l_groups: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_users, l_groups)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_featureflags_feature
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_FEATUREFLAGS_FEATURE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_description: STRING_32
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_featureflags_feature(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_description, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_featureflags_impl_configured_feature
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_FEATUREFLAGS_IMPL_CONFIGURED_FEATURE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_name: STRING_32
            l_description: STRING_32
            l_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_featureflags_impl_configured_feature(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_name, l_description, l_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_hapi_impl_hapi_util_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_HAPI_IMPL_H_API_UTIL_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_hapi_tools_resourcetype: STRING_32
            l_org_apache_sling_hapi_tools_collectionresourcetype: STRING_32
            l_org_apache_sling_hapi_tools_searchpaths: LIST [STRING_32]
            l_org_apache_sling_hapi_tools_externalurl: STRING_32
            l_org_apache_sling_hapi_tools_enabled: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_hapi_impl_hapi_util_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_hapi_tools_resourcetype, l_org_apache_sling_hapi_tools_collectionresourcetype, l_org_apache_sling_hapi_tools_searchpaths, l_org_apache_sling_hapi_tools_externalurl, l_org_apache_sling_hapi_tools_enabled)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_hc_core_impl_composite_health_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_HC_CORE_IMPL_COMPOSITE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_name: STRING_32
            l_hc_tags: LIST [STRING_32]
            l_hc_mbean_name: STRING_32
            l_filter_tags: LIST [STRING_32]
            l_filter_combine_tags_with_or: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_hc_core_impl_composite_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_name, l_hc_tags, l_hc_mbean_name, l_filter_tags, l_filter_combine_tags_with_or)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_hc_core_impl_executor_health_check_executor_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_HC_CORE_IMPL_EXECUTOR_HEALTH_CHECK_EXECUTOR_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_timeout_in_ms: INTEGER_32
            l_long_running_future_threshold_for_critical_ms: INTEGER_32
            l_result_cache_ttl_in_ms: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_hc_core_impl_executor_health_check_executor_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_timeout_in_ms, l_long_running_future_threshold_for_critical_ms, l_result_cache_ttl_in_ms)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_hc_core_impl_jmx_attribute_health_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_HC_CORE_IMPL_JMX_ATTRIBUTE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_name: STRING_32
            l_hc_tags: LIST [STRING_32]
            l_hc_mbean_name: STRING_32
            l_mbean_name: STRING_32
            l_attribute_name: STRING_32
            l_attribute_value_constraint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_hc_core_impl_jmx_attribute_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_name, l_hc_tags, l_hc_mbean_name, l_mbean_name, l_attribute_name, l_attribute_value_constraint)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_hc_core_impl_scriptable_health_check
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_HC_CORE_IMPL_SCRIPTABLE_HEALTH_CHECK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_hc_name: STRING_32
            l_hc_tags: LIST [STRING_32]
            l_hc_mbean_name: STRING_32
            l_expression: STRING_32
            l_language_extension: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_hc_core_impl_scriptable_health_check(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_hc_name, l_hc_tags, l_hc_mbean_name, l_expression, l_language_extension)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_HC_CORE_IMPL_SERVLET_HEALTH_CHECK_EXECUTOR_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_servlet_path: STRING_32
            l_disabled: BOOLEAN
            l_cors_access_control_allow_origin: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_servlet_path, l_disabled, l_cors_access_control_allow_origin)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_HC_CORE_IMPL_SERVLET_RESULT_TXT_VERBOSE_SERIALIZER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_total_width: INTEGER_32
            l_col_width_name: INTEGER_32
            l_col_width_result: INTEGER_32
            l_col_width_timing: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_total_width, l_col_width_name, l_col_width_result, l_col_width_timing)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_i18n_impl_i18_nfilter
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_I18N_IMPL_I18_N_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_sling_filter_scope: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_i18n_impl_i18_nfilter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_sling_filter_scope)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_i18n_impl_jcr_resource_bundle_provider
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_I18N_IMPL_JCR_RESOURCE_BUNDLE_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_locale_default: STRING_32
            l_preload_bundles: BOOLEAN
            l_invalidation_delay: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_i18n_impl_jcr_resource_bundle_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_locale_default, l_preload_bundles, l_invalidation_delay)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_installer_provider_jcr_impl_jcr_installer
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_INSTALLER_PROVIDER_JCR_IMPL_JCR_INSTALLER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_handler_schemes: LIST [STRING_32]
            l_sling_jcrinstall_folder_name_regexp: STRING_32
            l_sling_jcrinstall_folder_max_depth: INTEGER_32
            l_sling_jcrinstall_search_path: LIST [STRING_32]
            l_sling_jcrinstall_new_config_path: STRING_32
            l_sling_jcrinstall_signal_path: STRING_32
            l_sling_jcrinstall_enable_writeback: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_installer_provider_jcr_impl_jcr_installer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_handler_schemes, l_sling_jcrinstall_folder_name_regexp, l_sling_jcrinstall_folder_max_depth, l_sling_jcrinstall_search_path, l_sling_jcrinstall_new_config_path, l_sling_jcrinstall_signal_path, l_sling_jcrinstall_enable_writeback)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_base_internal_login_admin_whitelist
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_BASE_INTERNAL_LOGIN_ADMIN_WHITELIST_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_whitelist_bypass: BOOLEAN
            l_whitelist_bundles_regexp: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_base_internal_login_admin_whitelist(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_whitelist_bypass, l_whitelist_bundles_regexp)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_BASE_INTERNAL_LOGIN_ADMIN_WHITELIST_FRAGMENT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_whitelist_name: STRING_32
            l_whitelist_bundles: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_whitelist_name, l_whitelist_bundles)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_DAVEX_IMPL_SERVLETS_SLING_DAV_EX_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_var_alias: STRING_32
            l_dav_create_absolute_uri: BOOLEAN
            l_dav_protectedhandlers: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_var_alias, l_dav_create_absolute_uri, l_dav_protectedhandlers)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_JACKRABBIT_SERVER_JNDI_REGISTRATION_SUPPORT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_java_naming_factory_initial: STRING_32
            l_java_naming_provider_url: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_jackrabbit_server_jndi_registration_support(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_java_naming_factory_initial, l_java_naming_provider_url)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_JACKRABBIT_SERVER_RMI_REGISTRATION_SUPPORT_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_port: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_jackrabbit_server_rmi_registration_support(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_port)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_repoinit_impl_repository_initializer
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_REPOINIT_IMPL_REPOSITORY_INITIALIZER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_references: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_repoinit_impl_repository_initializer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_references)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_repoinit_repository_initializer
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_REPOINIT_REPOSITORY_INITIALIZER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_references: LIST [STRING_32]
            l_scripts: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_repoinit_repository_initializer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_references, l_scripts)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_RESOURCE_INTERNAL_JCR_RESOURCE_RESOLVER_FACTORY_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_resource_resolver_searchpath: LIST [STRING_32]
            l_resource_resolver_manglenamespaces: BOOLEAN
            l_resource_resolver_allow_direct: BOOLEAN
            l_resource_resolver_required_providers: LIST [STRING_32]
            l_resource_resolver_required_providernames: LIST [STRING_32]
            l_resource_resolver_virtual: LIST [STRING_32]
            l_resource_resolver_mapping: LIST [STRING_32]
            l_resource_resolver_map_location: STRING_32
            l_resource_resolver_map_observation: LIST [STRING_32]
            l_resource_resolver_default_vanity_redirect_status: INTEGER_32
            l_resource_resolver_enable_vanitypath: BOOLEAN
            l_resource_resolver_vanitypath_max_entries: INTEGER_32
            l_resource_resolver_vanitypath_max_entries_startup: BOOLEAN
            l_resource_resolver_vanitypath_bloomfilter_max_bytes: INTEGER_32
            l_resource_resolver_optimize_alias_resolution: BOOLEAN
            l_resource_resolver_vanitypath_whitelist: LIST [STRING_32]
            l_resource_resolver_vanitypath_blacklist: LIST [STRING_32]
            l_resource_resolver_vanity_precedence: BOOLEAN
            l_resource_resolver_providerhandling_paranoid: BOOLEAN
            l_resource_resolver_log_closing: BOOLEAN
            l_resource_resolver_log_unclosed: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_resource_resolver_searchpath, l_resource_resolver_manglenamespaces, l_resource_resolver_allow_direct, l_resource_resolver_required_providers, l_resource_resolver_required_providernames, l_resource_resolver_virtual, l_resource_resolver_mapping, l_resource_resolver_map_location, l_resource_resolver_map_observation, l_resource_resolver_default_vanity_redirect_status, l_resource_resolver_enable_vanitypath, l_resource_resolver_vanitypath_max_entries, l_resource_resolver_vanitypath_max_entries_startup, l_resource_resolver_vanitypath_bloomfilter_max_bytes, l_resource_resolver_optimize_alias_resolution, l_resource_resolver_vanitypath_whitelist, l_resource_resolver_vanitypath_blacklist, l_resource_resolver_vanity_precedence, l_resource_resolver_providerhandling_paranoid, l_resource_resolver_log_closing, l_resource_resolver_log_unclosed)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_resource_internal_jcr_system_user_validator
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_RESOURCE_INTERNAL_JCR_SYSTEM_USER_VALIDATOR_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_allow_only_system_user: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_resource_internal_jcr_system_user_validator(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_allow_only_system_user)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_RESOURCESECURITY_IMPL_RESOURCE_ACCESS_GATE_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_path: STRING_32
            l_checkpath_prefix: STRING_32
            l_jcr_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_path, l_checkpath_prefix, l_jcr_path)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_webdav_impl_handler_default_handler_service
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_WEBDAV_IMPL_HANDLER_DEFAULT_HANDLER_SERVICE_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_type_collections: STRING_32
            l_type_noncollections: STRING_32
            l_type_content: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_webdav_impl_handler_default_handler_service(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_type_collections, l_type_noncollections, l_type_content)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_WEBDAV_IMPL_HANDLER_DIR_LISTING_EXPORT_HANDLER_SERVIC_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JCR_WEBDAV_IMPL_SERVLETS_SIMPLE_WEB_DAV_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_dav_root: STRING_32
            l_dav_create_absolute_uri: BOOLEAN
            l_dav_realm: STRING_32
            l_collection_types: LIST [STRING_32]
            l_filter_prefixes: LIST [STRING_32]
            l_filter_types: STRING_32
            l_filter_uris: STRING_32
            l_type_collections: STRING_32
            l_type_noncollections: STRING_32
            l_type_content: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_dav_root, l_dav_create_absolute_uri, l_dav_realm, l_collection_types, l_filter_prefixes, l_filter_types, l_filter_uris, l_type_collections, l_type_noncollections, l_type_content)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_jmx_provider_impl_jm_xresource_provider
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_JMX_PROVIDER_IMPL_JMX_RESOURCE_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_provider_roots: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_jmx_provider_impl_jm_xresource_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_provider_roots)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_models_impl_model_adapter_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_MODELS_IMPL_MODEL_ADAPTER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_osgi_http_whiteboard_listener: STRING_32
            l_osgi_http_whiteboard_context_select: STRING_32
            l_max_recursion_depth: INTEGER_32
            l_cleanup_job_period: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_models_impl_model_adapter_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_osgi_http_whiteboard_listener, l_osgi_http_whiteboard_context_select, l_max_recursion_depth, l_cleanup_job_period)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_models_jacksonexporter_impl_resource_module_provider
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_MODELS_JACKSONEXPORTER_IMPL_RESOURCE_MODULE_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_max_recursion_levels: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_models_jacksonexporter_impl_resource_module_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_max_recursion_levels)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_RESOURCE_INVENTORY_IMPL_RESOURCE_INVENTORY_PRINTER_FACTO_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_felix_inventory_printer_name: STRING_32
            l_felix_inventory_printer_title: STRING_32
            l_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_felix_inventory_printer_name, l_felix_inventory_printer_title, l_path)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_RESOURCEMERGER_IMPL_MERGED_RESOURCE_PROVIDER_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_merge_root: STRING_32
            l_merge_read_only: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_resourcemerger_impl_merged_resource_provider_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_merge_root, l_merge_read_only)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_resourcemerger_picker_overriding
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_RESOURCEMERGER_PICKER_OVERRIDING_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_merge_root: STRING_32
            l_merge_read_only: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_resourcemerger_picker_overriding(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_merge_root, l_merge_read_only)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_scripting_core_impl_script_cache_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SCRIPTING_CORE_IMPL_SCRIPT_CACHE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_scripting_cache_size: INTEGER_32
            l_org_apache_sling_scripting_cache_additional_extensions: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_scripting_core_impl_script_cache_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_scripting_cache_size, l_org_apache_sling_scripting_cache_additional_extensions)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SCRIPTING_CORE_IMPL_SCRIPTING_RESOURCE_RESOLVER_PROVIDER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_log_stacktrace_onclose: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_log_stacktrace_onclose)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_scripting_java_impl_java_script_engine_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SCRIPTING_JAVA_IMPL_JAVA_SCRIPT_ENGINE_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_java_classdebuginfo: BOOLEAN
            l_java_java_encoding: STRING_32
            l_java_compiler_source_vm: STRING_32
            l_java_compiler_target_vm: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_scripting_java_impl_java_script_engine_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_java_classdebuginfo, l_java_java_encoding, l_java_compiler_source_vm, l_java_compiler_target_vm)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SCRIPTING_JAVASCRIPT_INTERNAL_RHINO_JAVA_SCRIPT_ENGINE_FA_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_scripting_javascript_rhino_opt_level: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_scripting_javascript_rhino_opt_level)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_scripting_jsp_jsp_script_engine_factory
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SCRIPTING_JSP_JSP_SCRIPT_ENGINE_FACTORY_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_jasper_compiler_target_vm: STRING_32
            l_jasper_compiler_source_vm: STRING_32
            l_jasper_classdebuginfo: BOOLEAN
            l_jasper_enable_pooling: BOOLEAN
            l_jasper_ie_class_id: STRING_32
            l_jasper_gen_string_as_char_array: BOOLEAN
            l_jasper_keepgenerated: BOOLEAN
            l_jasper_mappedfile: BOOLEAN
            l_jasper_trim_spaces: BOOLEAN
            l_jasper_display_source_fragments: BOOLEAN
            l_default_is_session: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_scripting_jsp_jsp_script_engine_factory(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_jasper_compiler_target_vm, l_jasper_compiler_source_vm, l_jasper_classdebuginfo, l_jasper_enable_pooling, l_jasper_ie_class_id, l_jasper_gen_string_as_char_array, l_jasper_keepgenerated, l_jasper_mappedfile, l_jasper_trim_spaces, l_jasper_display_source_fragments, l_default_is_session)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SCRIPTING_SIGHTLY_JS_IMPL_JSAPI_SLY_BINDINGS_VALUES_PROV_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_org_apache_sling_scripting_sightly_js_bindings: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_org_apache_sling_scripting_sightly_js_bindings)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_security_impl_content_disposition_filter
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SECURITY_IMPL_CONTENT_DISPOSITION_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_content_disposition_paths: LIST [STRING_32]
            l_sling_content_disposition_excluded_paths: LIST [STRING_32]
            l_sling_content_disposition_all_paths: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_security_impl_content_disposition_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_content_disposition_paths, l_sling_content_disposition_excluded_paths, l_sling_content_disposition_all_paths)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_security_impl_referrer_filter
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SECURITY_IMPL_REFERRER_FILTER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_allow_empty: BOOLEAN
            l_allow_hosts: LIST [STRING_32]
            l_allow_hosts_regexp: LIST [STRING_32]
            l_filter_methods: LIST [STRING_32]
            l_exclude_agents_regexp: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_security_impl_referrer_filter(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_allow_empty, l_allow_hosts, l_allow_hosts_regexp, l_filter_methods, l_exclude_agents_regexp)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SERVICEUSERMAPPING_IMPL_SERVICE_USER_MAPPER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_user_mapping: LIST [STRING_32]
            l_user_default: STRING_32
            l_user_enable_default_mapping: BOOLEAN
            l_require_validation: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_serviceusermapping_impl_service_user_mapper_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_user_mapping, l_user_default, l_user_enable_default_mapping, l_require_validation)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SERVICEUSERMAPPING_IMPL_SERVICE_USER_MAPPER_IMPL_AMENDED_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_user_mapping: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_service_ranking, l_user_mapping)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_servlets_get_default_get_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SERVLETS_GET_DEFAULT_GET_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_aliases: LIST [STRING_32]
            l_index: BOOLEAN
            l_index_files: LIST [STRING_32]
            l_enable_html: BOOLEAN
            l_enable_json: BOOLEAN
            l_enable_txt: BOOLEAN
            l_enable_xml: BOOLEAN
            l_json_maximumresults: INTEGER_32
            l_ecma_suport: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_servlets_get_default_get_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_aliases, l_index, l_index_files, l_enable_html, l_enable_json, l_enable_txt, l_enable_xml, l_json_maximumresults, l_ecma_suport)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_servlets_get_impl_version_version_info_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SERVLETS_GET_IMPL_VERSION_VERSION_INFO_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_servlet_selectors: LIST [STRING_32]
            l_ecma_suport: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_servlets_get_impl_version_version_info_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_servlet_selectors, l_ecma_suport)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SERVLETS_POST_IMPL_HELPER_CHUNK_CLEAN_UP_TASK_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_scheduler_expression: STRING_32
            l_scheduler_concurrent: BOOLEAN
            l_chunk_cleanup_age: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_scheduler_expression, l_scheduler_concurrent, l_chunk_cleanup_age)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_servlets_post_impl_sling_post_servlet
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SERVLETS_POST_IMPL_SLING_POST_SERVLET_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_servlet_post_date_formats: LIST [STRING_32]
            l_servlet_post_node_name_hints: LIST [STRING_32]
            l_servlet_post_node_name_max_length: INTEGER_32
            l_servlet_post_checkin_new_versionable_nodes: BOOLEAN
            l_servlet_post_auto_checkout: BOOLEAN
            l_servlet_post_auto_checkin: BOOLEAN
            l_servlet_post_ignore_pattern: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_servlets_post_impl_sling_post_servlet(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_servlet_post_date_formats, l_servlet_post_node_name_hints, l_servlet_post_node_name_max_length, l_servlet_post_checkin_new_versionable_nodes, l_servlet_post_auto_checkout, l_servlet_post_auto_checkin, l_servlet_post_ignore_pattern)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_servlets_resolver_sling_servlet_resolver
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SERVLETS_RESOLVER_SLING_SERVLET_RESOLVER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_servletresolver_servlet_root: STRING_32
            l_servletresolver_cache_size: INTEGER_32
            l_servletresolver_paths: LIST [STRING_32]
            l_servletresolver_default_extensions: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_servlets_resolver_sling_servlet_resolver(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_servletresolver_servlet_root, l_servletresolver_cache_size, l_servletresolver_paths, l_servletresolver_default_extensions)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_settings_impl_sling_settings_service_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_SETTINGS_IMPL_SLING_SETTINGS_SERVICE_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_sling_name: STRING_32
            l_sling_description: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_settings_impl_sling_settings_service_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_sling_name, l_sling_description)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_startupfilter_impl_startup_filter_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_STARTUPFILTER_IMPL_STARTUP_FILTER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_active_by_default: BOOLEAN
            l_default_message: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_startupfilter_impl_startup_filter_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_active_by_default, l_default_message)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_tenant_internal_tenant_provider_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_TENANT_INTERNAL_TENANT_PROVIDER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_tenant_root: STRING_32
            l_tenant_path_matcher: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_tenant_internal_tenant_provider_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_tenant_root, l_tenant_path_matcher)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_tracer_internal_log_tracer
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_TRACER_INTERNAL_LOG_TRACER_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_tracer_sets: LIST [STRING_32]
            l_enabled: BOOLEAN
            l_servlet_enabled: BOOLEAN
            l_recording_cache_size_in_mb: INTEGER_32
            l_recording_cache_duration_in_secs: INTEGER_32
            l_recording_compression_enabled: BOOLEAN
            l_gzip_response: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_tracer_internal_log_tracer(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_tracer_sets, l_enabled, l_servlet_enabled, l_recording_cache_size_in_mb, l_recording_cache_duration_in_secs, l_recording_compression_enabled, l_gzip_response)
            assert ("not_implemented", False)
        end
    
    test_org_apache_sling_xss_impl_xs_sfilter_impl
            -- 
            -- 
            --  
        local
            l_response: ORG_APACHE_SLING_XSS_IMPL_XSS_FILTER_IMPL_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_propertylist: LIST [STRING_32]
            l_policy_path: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.org_apache_sling_xss_impl_xs_sfilter_impl(l_post, l_apply, l_delete, l_action, l_location, l_propertylist, l_policy_path)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONFIGMGR_API
            -- Create an object instance of `CONFIGMGR_API'.
        once            
            create { CONFIGMGR_API } Result
        end

end
