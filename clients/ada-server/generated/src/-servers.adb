--  Adobe Experience Manager OSGI config (AEM) API
--  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  
   overriding
   procedure Adaptive_Form_And_Interactive_Communication_Web_Channel_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Show_Placeholder : in Swagger.Nullable_Boolean;
       Maximum_Cache_Entries : in Swagger.Nullable_Integer;
       Af_Periodscripting_Periodcompatversion : in Swagger.Nullable_UString;
       Make_File_Name_Unique : in Swagger.Nullable_Boolean;
       Generating_Compliant_Data : in Swagger.Nullable_Boolean;
       Result  : out .Models.AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Adaptive_Form_And_Interactive_Communication_Web_Channel_Configuration;

   --  
   overriding
   procedure Adaptive_Form_And_Interactive_Communication_Web_Channel_Theme_Configur
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Font_List : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Adaptive_Form_And_Interactive_Communication_Web_Channel_Theme_Configur;

   --  
   overriding
   procedure Analytics_Component_Query_Cache_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodcomponent_Periodquery_Periodcache_Periodsize : in Swagger.Nullable_Integer;
       Result  : out .Models.AnalyticsComponentQueryCacheServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Analytics_Component_Query_Cache_Service;

   --  
   overriding
   procedure Apache_Sling_Health_Check_Result_H_T_M_L_Serializer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Style_String : in Swagger.Nullable_UString;
       Result  : out .Models.ApacheSlingHealthCheckResultHTMLSerializerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Apache_Sling_Health_Check_Result_H_T_M_L_Serializer;

   --  
   overriding
   procedure Com_Adobe_Aem_Formsndocuments_Config_A_E_M_Forms_Manager_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Forms_Manager_Config_Periodinclude_O_O_T_B_Templates : in Swagger.Nullable_Boolean;
       Forms_Manager_Config_Periodinclude_Deprecated_Templates : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Aem_Formsndocuments_Config_A_E_M_Forms_Manager_Configuration;

   --  
   overriding
   procedure Com_Adobe_Aem_Transaction_Core_Impl_Transaction_Recorder
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Is_Transaction_Recording_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeAemTransactionCoreImplTransactionRecorderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Aem_Transaction_Core_Impl_Transaction_Recorder;

   --  
   overriding
   procedure Com_Adobe_Aem_Upgrade_Prechecks_Hc_Impl_Deprecate_Indexes_H_C
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodname : in Swagger.Nullable_UString;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Hc_Periodmbean_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Aem_Upgrade_Prechecks_Hc_Impl_Deprecate_Indexes_H_C;

   --  
   overriding
   procedure Com_Adobe_Aem_Upgrade_Prechecks_Hc_Impl_Replication_Agents_Disabled_H_C
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodname : in Swagger.Nullable_UString;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Hc_Periodmbean_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Aem_Upgrade_Prechecks_Hc_Impl_Replication_Agents_Disabled_H_C;

   --  
   overriding
   procedure Com_Adobe_Aem_Upgrade_Prechecks_Mbean_Impl_Pre_Upgrade_Tasks_M_Bean_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pre_Upgrade_Periodmaintenance_Periodtasks : in Swagger.UString_Vectors.Vector;
       Pre_Upgrade_Periodhc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Aem_Upgrade_Prechecks_Mbean_Impl_Pre_Upgrade_Tasks_M_Bean_Impl;

   --  
   overriding
   procedure Com_Adobe_Aem_Upgrade_Prechecks_Tasks_Impl_Consistency_Check_Task_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Root_Periodpath : in Swagger.Nullable_UString;
       Fix_Periodinconsistencies : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Aem_Upgrade_Prechecks_Tasks_Impl_Consistency_Check_Task_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Account_Api_Account_Management_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodaccountmanager_Periodtoken_Periodvalidity_Periodperiod : in Swagger.Nullable_Integer;
       Cq_Periodaccountmanager_Periodconfig_Periodrequestnewaccount_Periodmail : in Swagger.Nullable_UString;
       Cq_Periodaccountmanager_Periodconfig_Periodrequestnewpwd_Periodmail : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqAccountApiAccountManagementServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Account_Api_Account_Management_Service;

   --  
   overriding
   procedure Com_Adobe_Cq_Account_Impl_Account_Management_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodaccountmanager_Periodconfig_Periodinformnewaccount_Periodmail : in Swagger.Nullable_UString;
       Cq_Periodaccountmanager_Periodconfig_Periodinformnewpwd_Periodmail : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqAccountImplAccountManagementServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Account_Impl_Account_Management_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Address_Impl_Location_Location_List_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodaddress_Periodlocation_Perioddefault_Periodmax_Results : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqAddressImplLocationLocationListServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Address_Impl_Location_Location_List_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Audit_Purge_Dam
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Auditlog_Periodrule_Periodname : in Swagger.Nullable_UString;
       Auditlog_Periodrule_Periodcontentpath : in Swagger.Nullable_UString;
       Auditlog_Periodrule_Periodminimumage : in Swagger.Nullable_Integer;
       Auditlog_Periodrule_Periodtypes : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqAuditPurgeDamInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Audit_Purge_Dam;

   --  
   overriding
   procedure Com_Adobe_Cq_Audit_Purge_Pages
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Auditlog_Periodrule_Periodname : in Swagger.Nullable_UString;
       Auditlog_Periodrule_Periodcontentpath : in Swagger.Nullable_UString;
       Auditlog_Periodrule_Periodminimumage : in Swagger.Nullable_Integer;
       Auditlog_Periodrule_Periodtypes : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqAuditPurgePagesInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Audit_Purge_Pages;

   --  
   overriding
   procedure Com_Adobe_Cq_Audit_Purge_Replication
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Auditlog_Periodrule_Periodname : in Swagger.Nullable_UString;
       Auditlog_Periodrule_Periodcontentpath : in Swagger.Nullable_UString;
       Auditlog_Periodrule_Periodminimumage : in Swagger.Nullable_Integer;
       Auditlog_Periodrule_Periodtypes : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqAuditPurgeReplicationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Audit_Purge_Replication;

   --  
   overriding
   procedure Com_Adobe_Cq_Cdn_Rewriter_Impl_A_W_S_Cloud_Front_Rewriter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Keypair_Periodid : in Swagger.Nullable_UString;
       Keypair_Periodalias : in Swagger.Nullable_UString;
       Cdnrewriter_Periodattributes : in Swagger.UString_Vectors.Vector;
       Cdn_Periodrewriter_Perioddistribution_Perioddomain : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Cdn_Rewriter_Impl_A_W_S_Cloud_Front_Rewriter;

   --  
   overriding
   procedure Com_Adobe_Cq_Cdn_Rewriter_Impl_C_D_N_Config_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cdn_Periodconfig_Perioddistribution_Perioddomain : in Swagger.Nullable_UString;
       Cdn_Periodconfig_Periodenable_Periodrewriting : in Swagger.Nullable_Boolean;
       Cdn_Periodconfig_Periodpath_Periodprefixes : in Swagger.UString_Vectors.Vector;
       Cdn_Periodconfig_Periodcdnttl : in Swagger.Nullable_Integer;
       Cdn_Periodconfig_Periodapplication_Periodprotocol : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Cdn_Rewriter_Impl_C_D_N_Config_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Cdn_Rewriter_Impl_C_D_N_Rewriter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Cdnrewriter_Periodattributes : in Swagger.UString_Vectors.Vector;
       Cdn_Periodrewriter_Perioddistribution_Perioddomain : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCdnRewriterImplCDNRewriterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Cdn_Rewriter_Impl_C_D_N_Rewriter;

   --  
   overriding
   procedure Com_Adobe_Cq_Cloudconfig_Core_Impl_Configuration_Replication_Event_Handle
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Flush_Periodagents : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Cloudconfig_Core_Impl_Configuration_Replication_Event_Handle;

   --  
   overriding
   procedure Com_Adobe_Cq_Commerce_Impl_Asset_Dynamic_Image_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodcommerce_Periodasset_Periodhandler_Periodactive : in Swagger.Nullable_Boolean;
       Cq_Periodcommerce_Periodasset_Periodhandler_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Commerce_Impl_Asset_Dynamic_Image_Handler;

   --  
   overriding
   procedure Com_Adobe_Cq_Commerce_Impl_Asset_Product_Asset_Handler_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodcommerce_Periodasset_Periodhandler_Periodfallback : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Commerce_Impl_Asset_Product_Asset_Handler_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Commerce_Impl_Asset_Static_Image_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodcommerce_Periodasset_Periodhandler_Periodactive : in Swagger.Nullable_Boolean;
       Cq_Periodcommerce_Periodasset_Periodhandler_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCommerceImplAssetStaticImageHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Commerce_Impl_Asset_Static_Image_Handler;

   --  
   overriding
   procedure Com_Adobe_Cq_Commerce_Impl_Asset_Video_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodcommerce_Periodasset_Periodhandler_Periodactive : in Swagger.Nullable_Boolean;
       Cq_Periodcommerce_Periodasset_Periodhandler_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCommerceImplAssetVideoHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Commerce_Impl_Asset_Video_Handler;

   --  
   overriding
   procedure Com_Adobe_Cq_Commerce_Impl_Promotion_Promotion_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodcommerce_Periodpromotion_Periodroot : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Commerce_Impl_Promotion_Promotion_Manager_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Commerce_Pim_Impl_Cataloggenerator_Catalog_Generator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodcommerce_Periodcataloggenerator_Periodbucketsize : in Swagger.Nullable_Integer;
       Cq_Periodcommerce_Periodcataloggenerator_Periodbucketname : in Swagger.Nullable_UString;
       Cq_Periodcommerce_Periodcataloggenerator_Periodexcludedtemplateproperties : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Commerce_Pim_Impl_Cataloggenerator_Catalog_Generator_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Commerce_Pim_Impl_Page_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodcommerce_Periodpageeventlistener_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqCommercePimImplPageEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Commerce_Pim_Impl_Page_Event_Listener;

   --  
   overriding
   procedure Com_Adobe_Cq_Commerce_Pim_Impl_Productfeed_Product_Feed_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Feed generator algorithm : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Commerce_Pim_Impl_Productfeed_Product_Feed_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Contentinsight_Impl_Reporting_Services_Settings_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Reportingservices_Periodurl : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Contentinsight_Impl_Reporting_Services_Settings_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Contentinsight_Impl_Servlets_Bright_Edge_Proxy_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Brightedge_Periodurl : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Contentinsight_Impl_Servlets_Bright_Edge_Proxy_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Contentinsight_Impl_Servlets_Reporting_Services_Proxy_Servle
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Reportingservices_Periodproxy_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Contentinsight_Impl_Servlets_Reporting_Services_Proxy_Servle;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Cfm_Impl_Component_Component_Config_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Dam_Periodcfm_Periodcomponent_Periodresource_Type : in Swagger.Nullable_UString;
       Dam_Periodcfm_Periodcomponent_Periodfile_Reference_Prop : in Swagger.Nullable_UString;
       Dam_Periodcfm_Periodcomponent_Periodelements_Prop : in Swagger.Nullable_UString;
       Dam_Periodcfm_Periodcomponent_Periodvariation_Prop : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqDamCfmImplComponentComponentConfigImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Cfm_Impl_Component_Component_Config_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Cfm_Impl_Conf_Feature_Config_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Dam_Periodcfm_Periodresource_Types : in Swagger.UString_Vectors.Vector;
       Dam_Periodcfm_Periodreference_Properties : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqDamCfmImplConfFeatureConfigImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Cfm_Impl_Conf_Feature_Config_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Cfm_Impl_Content_Rewriter_Asset_Processor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pipeline_Periodtype : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Cfm_Impl_Content_Rewriter_Asset_Processor;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Cfm_Impl_Content_Rewriter_Par_Range_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pipeline_Periodtype : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Cfm_Impl_Content_Rewriter_Par_Range_Filter;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Cfm_Impl_Content_Rewriter_Payload_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pipeline_Periodtype : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Cfm_Impl_Content_Rewriter_Payload_Filter;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Dm_Process_Image_P_Tiff_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Memory : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqDamDmProcessImagePTiffManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Dm_Process_Image_P_Tiff_Manager_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Ips_Impl_Replication_Trigger_Replicate_On_Modify_Worker
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Dmreplicateonmodify_Periodenabled : in Swagger.Nullable_Boolean;
       Dmreplicateonmodify_Periodforcesyncdeletes : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Ips_Impl_Replication_Trigger_Replicate_On_Modify_Worker;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Mac_Sync_Helper_Impl_M_A_C_Sync_Client_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Perioddam_Periodmac_Periodsync_Periodclient_Periodso_Periodtimeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Mac_Sync_Helper_Impl_M_A_C_Sync_Client_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Mac_Sync_Impl_D_A_M_Sync_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodcq_Perioddam_Periodmac_Periodsync_Perioddamsyncservice_Periodregistered_Paths : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodcq_Perioddam_Periodmac_Periodsync_Perioddamsyncservice_Periodsync_Periodrenditions : in Swagger.Nullable_Boolean;
       Com_Periodadobe_Periodcq_Perioddam_Periodmac_Periodsync_Perioddamsyncservice_Periodreplicate_Periodthread_Periodwait_Periodms : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodcq_Perioddam_Periodmac_Periodsync_Perioddamsyncservice_Periodplatform : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Mac_Sync_Impl_D_A_M_Sync_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Processor_Nui_Impl_Nui_Asset_Processor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Nui_Enabled : in Swagger.Nullable_Boolean;
       Nui_Service_Url : in Swagger.Nullable_UString;
       Nui_Api_Key : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Processor_Nui_Impl_Nui_Asset_Processor;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_S7imaging_Impl_Is_Image_Server_Component
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Tcp_Port : in Swagger.Nullable_UString;
       Allow_Remote_Access : in Swagger.Nullable_Boolean;
       Max_Render_Rgn_Pixels : in Swagger.Nullable_UString;
       Max_Message_Size : in Swagger.Nullable_UString;
       Random_Access_Url_Timeout : in Swagger.Nullable_Integer;
       Worker_Threads : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqDamS7imagingImplIsImageServerComponentInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_S7imaging_Impl_Is_Image_Server_Component;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_S7imaging_Impl_Ps_Platform_Server_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cache_Periodenable : in Swagger.Nullable_Boolean;
       Cache_Periodroot_Paths : in Swagger.UString_Vectors.Vector;
       Cache_Periodmax_Size : in Swagger.Nullable_Integer;
       Cache_Periodmax_Entries : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_S7imaging_Impl_Ps_Platform_Server_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Webdav_Impl_Io_Asset_I_O_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Path_Prefix : in Swagger.Nullable_UString;
       Create_Version : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Webdav_Impl_Io_Asset_I_O_Handler;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Webdav_Impl_Io_Dam_Webdav_Version_Linking_Job
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodwebdav_Periodversion_Periodlinking_Periodenable : in Swagger.Nullable_Boolean;
       Cq_Perioddam_Periodwebdav_Periodversion_Periodlinking_Periodscheduler_Periodperiod : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodwebdav_Periodversion_Periodlinking_Periodstaging_Periodtimeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Webdav_Impl_Io_Dam_Webdav_Version_Linking_Job;

   --  
   overriding
   procedure Com_Adobe_Cq_Dam_Webdav_Impl_Io_Special_Files_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodday_Periodcq_Perioddam_Periodcore_Periodimpl_Periodio_Period_Special_Files_Handler_Periodfilepatters : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dam_Webdav_Impl_Io_Special_Files_Handler;

   --  
   overriding
   procedure Com_Adobe_Cq_Deserfw_Impl_Deserialization_Firewall_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Firewall_Perioddeserialization_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Firewall_Perioddeserialization_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Firewall_Perioddeserialization_Perioddiagnostics : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqDeserfwImplDeserializationFirewallImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Deserfw_Impl_Deserialization_Firewall_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Dtm_Impl_Service_D_T_M_Web_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Connection_Periodtimeout : in Swagger.Nullable_Integer;
       Socket_Periodtimeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqDtmImplServiceDTMWebServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dtm_Impl_Service_D_T_M_Web_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Dtm_Impl_Servlets_D_T_M_Deploy_Hook_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Dtm_Periodstaging_Periodip_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Dtm_Periodproduction_Periodip_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqDtmImplServletsDTMDeployHookServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dtm_Impl_Servlets_D_T_M_Deploy_Hook_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Dtm_Reactor_Impl_Service_Web_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Endpoint_Uri : in Swagger.Nullable_UString;
       Connection_Timeout : in Swagger.Nullable_Integer;
       Socket_Timeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqDtmReactorImplServiceWebServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Dtm_Reactor_Impl_Service_Web_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Experiencelog_Impl_Experience_Log_Config_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Disabled_For_Groups : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Experiencelog_Impl_Experience_Log_Config_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Hc_Content_Packages_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodname : in Swagger.Nullable_UString;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Hc_Periodmbean_Periodname : in Swagger.Nullable_UString;
       Package_Periodnames : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqHcContentPackagesHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Hc_Content_Packages_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Cq_History_Impl_History_Request_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       History_Periodrequest_Filter_Periodexcluded_Selectors : in Swagger.UString_Vectors.Vector;
       History_Periodrequest_Filter_Periodexcluded_Extensions : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqHistoryImplHistoryRequestFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_History_Impl_History_Request_Filter;

   --  
   overriding
   procedure Com_Adobe_Cq_History_Impl_History_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       History_Periodservice_Periodresource_Types : in Swagger.UString_Vectors.Vector;
       History_Periodservice_Periodpath_Filter : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqHistoryImplHistoryServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_History_Impl_History_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Inbox_Impl_Typeprovider_Item_Type_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Inbox_Periodimpl_Periodtypeprovider_Periodregistrypaths : in Swagger.UString_Vectors.Vector;
       Inbox_Periodimpl_Periodtypeprovider_Periodlegacypaths : in Swagger.UString_Vectors.Vector;
       Inbox_Periodimpl_Periodtypeprovider_Perioddefaulturl_Periodfailureitem : in Swagger.Nullable_UString;
       Inbox_Periodimpl_Periodtypeprovider_Perioddefaulturl_Periodworkitem : in Swagger.Nullable_UString;
       Inbox_Periodimpl_Periodtypeprovider_Perioddefaulturl_Periodtask : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Inbox_Impl_Typeprovider_Item_Type_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Projects_Impl_Servlet_Project_Image_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Image_Periodquality : in Swagger.Nullable_UString;
       Image_Periodsupported_Periodresolutions : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqProjectsImplServletProjectImageServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Projects_Impl_Servlet_Project_Image_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Projects_Purge_Scheduler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduledpurge_Periodname : in Swagger.Nullable_UString;
       Scheduledpurge_Periodpurge_Active : in Swagger.Nullable_Boolean;
       Scheduledpurge_Periodtemplates : in Swagger.UString_Vectors.Vector;
       Scheduledpurge_Periodpurge_Groups : in Swagger.Nullable_Boolean;
       Scheduledpurge_Periodpurge_Assets : in Swagger.Nullable_Boolean;
       Scheduledpurge_Periodterminate_Running_Workflows : in Swagger.Nullable_Boolean;
       Scheduledpurge_Perioddaysold : in Swagger.Nullable_Integer;
       Scheduledpurge_Periodsave_Threshold : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqProjectsPurgeSchedulerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Projects_Purge_Scheduler;

   --  
   overriding
   procedure Com_Adobe_Cq_Scheduled_Exporter_Impl_Scheduled_Exporter_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Include_Periodpaths : in Swagger.UString_Vectors.Vector;
       Exporter_Perioduser : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqScheduledExporterImplScheduledExporterImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Scheduled_Exporter_Impl_Scheduled_Exporter_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Analytics_Impl_Screens_Analytics_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodcq_Periodscreens_Periodanalytics_Periodimpl_Periodurl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodanalytics_Periodimpl_Periodapikey : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodanalytics_Periodimpl_Periodproject : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodanalytics_Periodimpl_Periodenvironment : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodanalytics_Periodimpl_Periodsend_Frequency : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Analytics_Impl_Screens_Analytics_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Device_Impl_Device_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodaem_Periodscreens_Periodplayer_Periodpingfrequency : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodaem_Periodscreens_Perioddevice_Periodpasword_Periodspecialchars : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodaem_Periodscreens_Perioddevice_Periodpasword_Periodminlowercasechars : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodaem_Periodscreens_Perioddevice_Periodpasword_Periodminuppercasechars : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodaem_Periodscreens_Perioddevice_Periodpasword_Periodminnumberchars : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodaem_Periodscreens_Perioddevice_Periodpasword_Periodminspecialchars : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodaem_Periodscreens_Perioddevice_Periodpasword_Periodminlength : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqScreensDeviceImplDeviceServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Device_Impl_Device_Service;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Device_Registration_Impl_Registration_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Device_Registration_Timeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Device_Registration_Impl_Registration_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Impl_Handler_Channels_Update_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodpagesupdatehandler_Periodimageresourcetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodpagesupdatehandler_Periodproductresourcetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodpagesupdatehandler_Periodvideoresourcetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodpagesupdatehandler_Perioddynamicsequenceresourcetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodpagesupdatehandler_Periodpreviewmodepaths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Impl_Handler_Channels_Update_Handler;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Impl_Jobs_Distributed_Devices_Stati_Update_Job
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Impl_Jobs_Distributed_Devices_Stati_Update_Job;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Impl_Remote_Impl_Distributed_Http_Client_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodaem_Periodscreens_Periodimpl_Periodremote_Periodrequest_Timeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Impl_Remote_Impl_Distributed_Http_Client_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Impl_Screens_Channel_Post_Processor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Screens_Periodchannels_Periodproperties_Periodto_Periodremove : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqScreensImplScreensChannelPostProcessorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Impl_Screens_Channel_Post_Processor;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Monitoring_Impl_Screens_Monitoring_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodproject_Path : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodschedule_Frequency : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodping_Timeout : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodrecipients : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodsmtpserver : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodsmtpport : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodusetls : in Swagger.Nullable_Boolean;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodusername : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodmonitoring_Periodimpl_Period_Screens_Monitoring_Service_Impl_Periodpassword : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Monitoring_Impl_Screens_Monitoring_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Mq_Activemq_Impl_Artemis_J_M_S_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Global_Periodsize : in Swagger.Nullable_Integer;
       Max_Perioddisk_Periodusage : in Swagger.Nullable_Integer;
       Persistence_Periodenabled : in Swagger.Nullable_Boolean;
       Thread_Periodpool_Periodmax_Periodsize : in Swagger.Nullable_Integer;
       Scheduled_Periodthread_Periodpool_Periodmax_Periodsize : in Swagger.Nullable_Integer;
       Graceful_Periodshutdown_Periodtimeout : in Swagger.Nullable_Integer;
       Queues : in Swagger.UString_Vectors.Vector;
       Topics : in Swagger.UString_Vectors.Vector;
       Addresses_Periodmax_Perioddelivery_Periodattempts : in Swagger.Nullable_Integer;
       Addresses_Periodexpiry_Perioddelay : in Swagger.Nullable_Integer;
       Addresses_Periodaddress_Periodfull_Periodmessage_Periodpolicy : in Swagger.Nullable_UString;
       Addresses_Periodmax_Periodsize_Periodbytes : in Swagger.Nullable_Integer;
       Addresses_Periodpage_Periodsize_Periodbytes : in Swagger.Nullable_Integer;
       Addresses_Periodpage_Periodcache_Periodmax_Periodsize : in Swagger.Nullable_Integer;
       Cluster_Perioduser : in Swagger.Nullable_UString;
       Cluster_Periodpassword : in Swagger.Nullable_UString;
       Cluster_Periodcall_Periodtimeout : in Swagger.Nullable_Integer;
       Cluster_Periodcall_Periodfailover_Periodtimeout : in Swagger.Nullable_Integer;
       Cluster_Periodclient_Periodfailure_Periodcheck_Periodperiod : in Swagger.Nullable_Integer;
       Cluster_Periodnotification_Periodattempts : in Swagger.Nullable_Integer;
       Cluster_Periodnotification_Periodinterval : in Swagger.Nullable_Integer;
       Id_Periodcache_Periodsize : in Swagger.Nullable_Integer;
       Cluster_Periodconfirmation_Periodwindow_Periodsize : in Swagger.Nullable_Integer;
       Cluster_Periodconnection_Periodttl : in Swagger.Nullable_Integer;
       Cluster_Periodduplicate_Perioddetection : in Swagger.Nullable_Boolean;
       Cluster_Periodinitial_Periodconnect_Periodattempts : in Swagger.Nullable_Integer;
       Cluster_Periodmax_Periodretry_Periodinterval : in Swagger.Nullable_Integer;
       Cluster_Periodmin_Periodlarge_Periodmessage_Periodsize : in Swagger.Nullable_Integer;
       Cluster_Periodproducer_Periodwindow_Periodsize : in Swagger.Nullable_Integer;
       Cluster_Periodreconnect_Periodattempts : in Swagger.Nullable_Integer;
       Cluster_Periodretry_Periodinterval : in Swagger.Nullable_Integer;
       Cluster_Periodretry_Periodinterval_Periodmultiplier : in Swagger.Number;
       Result  : out .Models.ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Mq_Activemq_Impl_Artemis_J_M_S_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Offlinecontent_Impl_Bulk_Offline_Update_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodcq_Periodscreens_Periodofflinecontent_Periodimpl_Period_Bulk_Offline_Update_Service_Impl_Periodproject_Path : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodcq_Periodscreens_Periodofflinecontent_Periodimpl_Period_Bulk_Offline_Update_Service_Impl_Periodschedule_Frequency : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Offlinecontent_Impl_Bulk_Offline_Update_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Offlinecontent_Impl_Offline_Content_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Disable_Smart_Sync : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Offlinecontent_Impl_Offline_Content_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Screens_Segmentation_Impl_Segmentation_Feature_Flag
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enable_Data_Triggered_Content : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Screens_Segmentation_Impl_Segmentation_Feature_Flag;

   --  
   overriding
   procedure Com_Adobe_Cq_Security_Hc_Bundles_Impl_Html_Library_Manager_Config_Health_Ch
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Security_Hc_Bundles_Impl_Html_Library_Manager_Config_Health_Ch;

   --  
   overriding
   procedure Com_Adobe_Cq_Security_Hc_Bundles_Impl_Wcm_Filter_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Security_Hc_Bundles_Impl_Wcm_Filter_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Cq_Security_Hc_Dispatcher_Impl_Dispatcher_Access_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Dispatcher_Periodaddress : in Swagger.Nullable_UString;
       Dispatcher_Periodfilter_Periodallowed : in Swagger.UString_Vectors.Vector;
       Dispatcher_Periodfilter_Periodblocked : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Security_Hc_Dispatcher_Impl_Dispatcher_Access_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Cq_Security_Hc_Packages_Impl_Example_Content_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Security_Hc_Packages_Impl_Example_Content_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Cq_Security_Hc_Webserver_Impl_Clickjacking_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Webserver_Periodaddress : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Security_Hc_Webserver_Impl_Clickjacking_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Accountverification_Impl_Account_Management_Config_Im
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enable : in Swagger.Nullable_Boolean;
       Ttl1 : in Swagger.Nullable_Integer;
       Ttl2 : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Accountverification_Impl_Account_Management_Config_Im;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Activitystreams_Client_Impl_Social_Activity_Componen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Activitystreams_Client_Impl_Social_Activity_Componen;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Activitystreams_Client_Impl_Social_Activity_Stream_Co
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Activitystreams_Client_Impl_Social_Activity_Stream_Co;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Activitystreams_Listener_Impl_Event_Listener_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodtopics : in Swagger.Nullable_UString;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Activitystreams_Listener_Impl_Event_Listener_Handler;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Activitystreams_Listener_Impl_Moderation_Event_Exten
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Accepted : in Swagger.Nullable_Boolean;
       Ranked : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Activitystreams_Listener_Impl_Moderation_Event_Exten;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Activitystreams_Listener_Impl_Rating_Event_Activity_S
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Ranking : in Swagger.Nullable_Integer;
       Enable : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Activitystreams_Listener_Impl_Rating_Event_Activity_S;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Activitystreams_Listener_Impl_Resource_Activity_Stre
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Stream_Path : in Swagger.Nullable_UString;
       Stream_Name : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Activitystreams_Listener_Impl_Resource_Activity_Stre;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Calendar_Client_Endpoints_Impl_Calendar_Operations_I
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Retry : in Swagger.Nullable_Integer;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Calendar_Client_Endpoints_Impl_Calendar_Operations_I;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Calendar_Client_Operationextensions_Event_Attachmen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.Nullable_UString;
       Extension_Periodorder : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Calendar_Client_Operationextensions_Event_Attachmen;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Calendar_Servlets_Time_Zone_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Timezones_Periodexpirytime : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialCalendarServletsTimeZoneServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Calendar_Servlets_Time_Zone_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Comments_Endpoints_Impl_Comment_Delete_Event
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Ranking : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Comments_Endpoints_Impl_Comment_Delete_Event;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Comments_Endpoints_Impl_Comment_Operation_Se
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Comments_Endpoints_Impl_Comment_Operation_Se;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Comments_Endpoints_Impl_Translation_Operati
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Comments_Endpoints_Impl_Translation_Operati;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Comments_Listing_Impl_Search_Comment_Social_C
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Num_User_Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Comments_Listing_Impl_Search_Comment_Social_C;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Comments_Scheduler_Impl_Search_Scheduled_Pos
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enable_Scheduled_Posts_Search : in Swagger.Nullable_Boolean;
       Number_Of_Minutes : in Swagger.Nullable_Integer;
       Max_Search_Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Comments_Scheduler_Impl_Search_Scheduled_Pos;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Cors_C_O_R_S_Authentication_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cors_Periodenabling : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Cors_C_O_R_S_Authentication_Filter;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Android_Email_Client_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority_Order : in Swagger.Nullable_Integer;
       Reply_Email_Patterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Android_Email_Client_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Comment_Email_Builder_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Context_Periodpath : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Comment_Email_Builder_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Comment_Email_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodtopics : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Comment_Email_Event_Listener;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Custom_Email_Client_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority_Order : in Swagger.Nullable_Integer;
       Reply_Email_Patterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Custom_Email_Client_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Email_Quoted_Text_Patterns_Imp
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pattern_Periodtime : in Swagger.Nullable_UString;
       Pattern_Periodnewline : in Swagger.Nullable_UString;
       Pattern_Periodday_Of_Month : in Swagger.Nullable_UString;
       Pattern_Periodmonth : in Swagger.Nullable_UString;
       Pattern_Periodyear : in Swagger.Nullable_UString;
       Pattern_Perioddate : in Swagger.Nullable_UString;
       Pattern_Perioddate_Time : in Swagger.Nullable_UString;
       Pattern_Periodemail : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Email_Quoted_Text_Patterns_Imp;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Email_Reply_Configuration_Imp
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Email_Periodname : in Swagger.Nullable_UString;
       Email_Periodcreate_Post_From_Reply : in Swagger.Nullable_Boolean;
       Email_Periodadd_Comment_Id_To : in Swagger.Nullable_UString;
       Email_Periodsubject_Maximum_Length : in Swagger.Nullable_Integer;
       Email_Periodreply_To_Address : in Swagger.Nullable_UString;
       Email_Periodreply_To_Delimiter : in Swagger.Nullable_UString;
       Email_Periodtracker_Id_Prefix_In_Subject : in Swagger.Nullable_UString;
       Email_Periodtracker_Id_Prefix_In_Body : in Swagger.Nullable_UString;
       Email_Periodas_H_T_M_L : in Swagger.Nullable_Boolean;
       Email_Perioddefault_User_Name : in Swagger.Nullable_UString;
       Email_Periodtemplates_Periodroot_Path : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Email_Reply_Configuration_Imp;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Email_Reply_Importer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Connect_Protocol : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Email_Reply_Importer;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Gmail_Email_Client_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority_Order : in Swagger.Nullable_Integer;
       Reply_Email_Patterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Gmail_Email_Client_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_I_O_S_Email_Client_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority_Order : in Swagger.Nullable_Integer;
       Reply_Email_Patterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_I_O_S_Email_Client_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Macmail_Email_Client_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority_Order : in Swagger.Nullable_Integer;
       Reply_Email_Patterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Macmail_Email_Client_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Out_Look_Email_Client_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority_Order : in Swagger.Nullable_Integer;
       Reply_Email_Patterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Out_Look_Email_Client_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Unknown_Email_Client_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Reply_Email_Patterns : in Swagger.UString_Vectors.Vector;
       Priority_Order : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Unknown_Email_Client_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Yahoo_Email_Client_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority_Order : in Swagger.Nullable_Integer;
       Reply_Email_Patterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Emailreply_Impl_Yahoo_Email_Client_Provider;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Maintainance_Impl_Delete_Temp_U_G_C_Image_Upload
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Number_Of_Days : in Swagger.Nullable_Integer;
       Age_Of_File : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Maintainance_Impl_Delete_Temp_U_G_C_Image_Upload;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Ugclimiter_Impl_U_G_C_Limiter_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodtopics : in Swagger.Nullable_UString;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Verbs : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Ugclimiter_Impl_U_G_C_Limiter_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Commons_Ugclimitsconfig_Impl_Community_User_U_G_C_Limit
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enable : in Swagger.Nullable_Boolean;
       U_G_C_Limit : in Swagger.Nullable_Integer;
       Ugc_Limit_Duration : in Swagger.Nullable_Integer;
       Domains : in Swagger.UString_Vectors.Vector;
       To_List : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Commons_Ugclimitsconfig_Impl_Community_User_U_G_C_Limit;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Connect_Oauth_Impl_Facebook_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodcloud_Periodconfig_Periodroot : in Swagger.Nullable_UString;
       Provider_Periodconfig_Periodroot : in Swagger.Nullable_UString;
       Provider_Periodconfig_Periodcreate_Periodtags_Periodenabled : in Swagger.Nullable_Boolean;
       Provider_Periodconfig_Perioduser_Periodfolder : in Swagger.Nullable_UString;
       Provider_Periodconfig_Periodfacebook_Periodfetch_Periodfields : in Swagger.Nullable_Boolean;
       Provider_Periodconfig_Periodfacebook_Periodfields : in Swagger.UString_Vectors.Vector;
       Provider_Periodconfig_Periodrefresh_Perioduserdata_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Connect_Oauth_Impl_Facebook_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Connect_Oauth_Impl_Social_O_Auth_Authentication_Handle
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Connect_Oauth_Impl_Social_O_Auth_Authentication_Handle;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Connect_Oauth_Impl_Social_O_Auth_User_Profile_Mapper
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Facebook : in Swagger.UString_Vectors.Vector;
       Twitter : in Swagger.UString_Vectors.Vector;
       Provider_Periodconfig_Perioduser_Periodfolder : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Connect_Oauth_Impl_Social_O_Auth_User_Profile_Mapper;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Connect_Oauth_Impl_Twitter_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodcloud_Periodconfig_Periodroot : in Swagger.Nullable_UString;
       Provider_Periodconfig_Periodroot : in Swagger.Nullable_UString;
       Provider_Periodconfig_Perioduser_Periodfolder : in Swagger.Nullable_UString;
       Provider_Periodconfig_Periodtwitter_Periodenable_Periodparams : in Swagger.Nullable_Boolean;
       Provider_Periodconfig_Periodtwitter_Periodparams : in Swagger.UString_Vectors.Vector;
       Provider_Periodconfig_Periodrefresh_Perioduserdata_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Connect_Oauth_Impl_Twitter_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Content_Fragments_Services_Impl_Communities_Fragmen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodsocial_Periodcontent_Periodfragments_Periodservices_Periodenabled : in Swagger.Nullable_Boolean;
       Cq_Periodsocial_Periodcontent_Periodfragments_Periodservices_Periodwait_Time_Seconds : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Content_Fragments_Services_Impl_Communities_Fragmen;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Datastore_As_Impl_A_S_Resource_Provider_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Version_Periodid : in Swagger.Nullable_UString;
       Cache_Periodon : in Swagger.Nullable_Boolean;
       Concurrency_Periodlevel : in Swagger.Nullable_Integer;
       Cache_Periodstart_Periodsize : in Swagger.Nullable_Integer;
       Cache_Periodttl : in Swagger.Nullable_Integer;
       Cache_Periodsize : in Swagger.Nullable_Integer;
       Time_Periodlimit : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Datastore_As_Impl_A_S_Resource_Provider_Factory;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Datastore_Op_Impl_Social_M_S_Resource_Provider_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Solr_Periodzk_Periodtimeout : in Swagger.Nullable_UString;
       Solr_Periodcommit : in Swagger.Nullable_UString;
       Cache_Periodon : in Swagger.Nullable_Boolean;
       Concurrency_Periodlevel : in Swagger.Nullable_Integer;
       Cache_Periodstart_Periodsize : in Swagger.Nullable_Integer;
       Cache_Periodttl : in Swagger.Nullable_Integer;
       Cache_Periodsize : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Datastore_Op_Impl_Social_M_S_Resource_Provider_Factory;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Datastore_Rdb_Impl_Social_R_D_B_Resource_Provider_Factor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Solr_Periodzk_Periodtimeout : in Swagger.Nullable_UString;
       Solr_Periodcommit : in Swagger.Nullable_UString;
       Cache_Periodon : in Swagger.Nullable_Boolean;
       Concurrency_Periodlevel : in Swagger.Nullable_Integer;
       Cache_Periodstart_Periodsize : in Swagger.Nullable_Integer;
       Cache_Periodttl : in Swagger.Nullable_Integer;
       Cache_Periodsize : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Datastore_Rdb_Impl_Social_R_D_B_Resource_Provider_Factor;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Enablement_Adaptors_Enablement_Learning_Path_Adaptor_F
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Is_Member_Check : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Enablement_Adaptors_Enablement_Learning_Path_Adaptor_F;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Enablement_Adaptors_Enablement_Resource_Adaptor_Facto
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Is_Member_Check : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Enablement_Adaptors_Enablement_Resource_Adaptor_Facto;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Enablement_Learningpath_Endpoints_Impl_Enablement_L
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Enablement_Learningpath_Endpoints_Impl_Enablement_L;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Enablement_Resource_Endpoints_Impl_Enablement_Resou
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Enablement_Resource_Endpoints_Impl_Enablement_Resou;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Enablement_Services_Impl_Author_Marker_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Enablement_Services_Impl_Author_Marker_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Filelibrary_Client_Endpoints_Filelibrary_Download_Ge
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodselectors : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodextensions : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Filelibrary_Client_Endpoints_Filelibrary_Download_Ge;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Filelibrary_Client_Endpoints_Impl_File_Library_Opera
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Filelibrary_Client_Endpoints_Impl_File_Library_Opera;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Forum_Client_Endpoints_Impl_Forum_Operations_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Forum_Client_Endpoints_Impl_Forum_Operations_Service;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Forum_Dispatcher_Impl_Flush_Operations
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Extension_Periodorder : in Swagger.Nullable_Integer;
       Flush_Periodforumontopic : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Forum_Dispatcher_Impl_Flush_Operations;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Group_Client_Impl_Community_Group_Collection_Componen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Group_Periodlisting_Periodpagination_Periodenable : in Swagger.Nullable_Boolean;
       Group_Periodlisting_Periodlazyloading_Periodenable : in Swagger.Nullable_Boolean;
       Page_Periodsize : in Swagger.Nullable_Integer;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Group_Client_Impl_Community_Group_Collection_Componen;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Group_Impl_Group_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Wait_Time : in Swagger.Nullable_Integer;
       Min_Wait_Between_Retries : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialGroupImplGroupServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Group_Impl_Group_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Handlebars_Guava_Template_Cache_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Parameter_Periodguava_Periodcache_Periodenabled : in Swagger.Nullable_Boolean;
       Parameter_Periodguava_Periodcache_Periodparams : in Swagger.Nullable_UString;
       Parameter_Periodguava_Periodcache_Periodreload : in Swagger.Nullable_Boolean;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Handlebars_Guava_Template_Cache_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ideation_Client_Endpoints_Impl_Ideation_Operations_S
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ideation_Client_Endpoints_Impl_Ideation_Operations_S;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Journal_Client_Endpoints_Impl_Journal_Operations_Ser
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Journal_Client_Endpoints_Impl_Journal_Operations_Ser;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Members_Endpoints_Impl_Community_Member_Group_Profile
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Members_Endpoints_Impl_Community_Member_Group_Profile;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Members_Endpoints_Impl_Community_Member_User_Profile_O
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Members_Endpoints_Impl_Community_Member_User_Profile_O;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Members_Impl_Community_Member_Group_Profile_Component_F
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Everyone_Limit : in Swagger.Nullable_Integer;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Members_Impl_Community_Member_Group_Profile_Component_F;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Messaging_Client_Endpoints_Impl_Messaging_Operation
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Message_Periodproperties : in Swagger.UString_Vectors.Vector;
       Message_Box_Size_Limit : in Swagger.Nullable_Integer;
       Message_Count_Limit : in Swagger.Nullable_Integer;
       Notify_Failure : in Swagger.Nullable_Boolean;
       Failure_Message_From : in Swagger.Nullable_UString;
       Failure_Template_Path : in Swagger.Nullable_UString;
       Max_Retries : in Swagger.Nullable_Integer;
       Min_Wait_Between_Retries : in Swagger.Nullable_Integer;
       Count_Update_Pool_Size : in Swagger.Nullable_Integer;
       Inbox_Periodpath : in Swagger.Nullable_UString;
       Sentitems_Periodpath : in Swagger.Nullable_UString;
       Support_Attachments : in Swagger.Nullable_Boolean;
       Support_Group_Messaging : in Swagger.Nullable_Boolean;
       Max_Total_Recipients : in Swagger.Nullable_Integer;
       Batch_Size : in Swagger.Nullable_Integer;
       Max_Total_Attachment_Size : in Swagger.Nullable_Integer;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Allowed_Attachment_Types : in Swagger.UString_Vectors.Vector;
       Service_Selector : in Swagger.Nullable_UString;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Messaging_Client_Endpoints_Impl_Messaging_Operation;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Moderation_Dashboard_Api_Filter_Group_Social_Componen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Resource_Type_Periodfilters : in Swagger.UString_Vectors.Vector;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Moderation_Dashboard_Api_Filter_Group_Social_Componen;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Moderation_Dashboard_Api_Moderation_Dashboard_Social
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Moderation_Dashboard_Api_Moderation_Dashboard_Social;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Moderation_Dashboard_Api_User_Details_Social_Componen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Moderation_Dashboard_Api_User_Details_Social_Componen;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Moderation_Dashboard_Internal_Impl_Filter_Group_Soci
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Resource_Type_Periodfilters : in Swagger.UString_Vectors.Vector;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Moderation_Dashboard_Internal_Impl_Filter_Group_Soci;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Notifications_Impl_Mentions_Router
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodtopics : in Swagger.Nullable_UString;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialNotificationsImplMentionsRouterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Notifications_Impl_Mentions_Router;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Notifications_Impl_Notification_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Periodunread_Periodnotification_Periodcount : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Notifications_Impl_Notification_Manager_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Notifications_Impl_Notifications_Router
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodtopics : in Swagger.Nullable_UString;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialNotificationsImplNotificationsRouterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Notifications_Impl_Notifications_Router;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Qna_Client_Endpoints_Impl_Qna_Forum_Operations_Servic
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Qna_Client_Endpoints_Impl_Qna_Forum_Operations_Servic;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Reporting_Analytics_Services_Impl_Analytics_Report_I
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodsocial_Periodreporting_Periodanalytics_Periodpolling_Periodimporter_Periodinterval : in Swagger.Nullable_Integer;
       Cq_Periodsocial_Periodreporting_Periodanalytics_Periodpolling_Periodimporter_Periodpage_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Reporting_Analytics_Services_Impl_Analytics_Report_I;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Reporting_Analytics_Services_Impl_Analytics_Report_M
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Report_Periodfetch_Perioddelay : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Reporting_Analytics_Services_Impl_Analytics_Report_M;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Reporting_Analytics_Services_Impl_Site_Trend_Report_S
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodsocial_Periodconsole_Periodanalytics_Periodsites_Periodmapping : in Swagger.UString_Vectors.Vector;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Reporting_Analytics_Services_Impl_Site_Trend_Report_S;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Review_Client_Endpoints_Impl_Review_Operations_Servi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Attachment_Type_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Review_Client_Endpoints_Impl_Review_Operations_Servi;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Scf_Core_Operations_Impl_Social_Operations_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodselectors : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodextensions : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Scf_Core_Operations_Impl_Social_Operations_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Scf_Endpoints_Impl_Default_Social_Get_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodselectors : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodextensions : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Scf_Endpoints_Impl_Default_Social_Get_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Scoring_Impl_Scoring_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodtopics : in Swagger.Nullable_UString;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialScoringImplScoringEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Scoring_Impl_Scoring_Event_Listener;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Serviceusers_Internal_Impl_Service_User_Wrapper_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enable_Fallback : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Serviceusers_Internal_Impl_Service_User_Wrapper_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Site_Endpoints_Impl_Site_Operation_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Field_Whitelist : in Swagger.UString_Vectors.Vector;
       Site_Path_Filters : in Swagger.UString_Vectors.Vector;
       Site_Package_Group : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Site_Endpoints_Impl_Site_Operation_Service;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Site_Impl_Analytics_Component_Configuration_Service_Im
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodsocial_Periodconsole_Periodanalytics_Periodcomponents : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Site_Impl_Analytics_Component_Configuration_Service_Im;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Site_Impl_Site_Configurator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Components_Using_Tags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Site_Impl_Site_Configurator_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Srp_Impl_Social_Solr_Connector
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Srp_Periodtype : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialSrpImplSocialSolrConnectorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Srp_Impl_Social_Solr_Connector;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Sync_Impl_Diff_Changes_Observer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Agent_Name : in Swagger.Nullable_UString;
       Diff_Path : in Swagger.Nullable_UString;
       Property_Names : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialSyncImplDiffChangesObserverInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Sync_Impl_Diff_Changes_Observer;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Sync_Impl_Group_Sync_Listener_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Nodetypes : in Swagger.UString_Vectors.Vector;
       Ignorableprops : in Swagger.UString_Vectors.Vector;
       Ignorablenodes : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Distfolders : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Sync_Impl_Group_Sync_Listener_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Sync_Impl_Publisher_Sync_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Active_Run_Modes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Sync_Impl_Publisher_Sync_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Sync_Impl_User_Sync_Listener_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Nodetypes : in Swagger.UString_Vectors.Vector;
       Ignorableprops : in Swagger.UString_Vectors.Vector;
       Ignorablenodes : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Distfolders : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialSyncImplUserSyncListenerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Sync_Impl_User_Sync_Listener_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Translation_Impl_Translation_Service_Config_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Translate_Periodlanguage : in Swagger.Nullable_UString;
       Translate_Perioddisplay : in Swagger.Nullable_UString;
       Translate_Periodattribution : in Swagger.Nullable_Boolean;
       Translate_Periodcaching : in Swagger.Nullable_UString;
       Translate_Periodsmart_Periodrendering : in Swagger.Nullable_UString;
       Translate_Periodcaching_Periodduration : in Swagger.Nullable_UString;
       Translate_Periodsession_Periodsave_Periodinterval : in Swagger.Nullable_UString;
       Translate_Periodsession_Periodsave_Periodbatch_Limit : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Translation_Impl_Translation_Service_Config_Manager;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Translation_Impl_U_G_C_Language_Detector
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodtopics : in Swagger.Nullable_UString;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Translate_Periodlistener_Periodtype : in Swagger.UString_Vectors.Vector;
       Translate_Periodproperty_Periodlist : in Swagger.UString_Vectors.Vector;
       Pool_Size : in Swagger.Nullable_Integer;
       Max_Pool_Size : in Swagger.Nullable_Integer;
       Queue_Size : in Swagger.Nullable_Integer;
       Keep_Alive_Time : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Translation_Impl_U_G_C_Language_Detector;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ugcbase_Dispatcher_Impl_Flush_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Thread_Pool_Size : in Swagger.Nullable_Integer;
       Delay_Time : in Swagger.Nullable_Integer;
       Worker_Sleep_Time : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ugcbase_Dispatcher_Impl_Flush_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ugcbase_Impl_Aysnc_Reverse_Replicator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pool_Size : in Swagger.Nullable_Integer;
       Max_Pool_Size : in Swagger.Nullable_Integer;
       Queue_Size : in Swagger.Nullable_Integer;
       Keep_Alive_Time : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ugcbase_Impl_Aysnc_Reverse_Replicator_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ugcbase_Impl_Publisher_Configuration_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Is_Primary_Publisher : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ugcbase_Impl_Publisher_Configuration_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ugcbase_Impl_Social_Utils_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Legacy_Cloud_U_G_C_Path_Mapping : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ugcbase_Impl_Social_Utils_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ugcbase_Moderation_Impl_Auto_Moderation_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Automoderation_Periodsequence : in Swagger.UString_Vectors.Vector;
       Automoderation_Periodonfailurestop : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ugcbase_Moderation_Impl_Auto_Moderation_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ugcbase_Moderation_Impl_Sentiment_Process
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Watchwords_Periodpositive : in Swagger.UString_Vectors.Vector;
       Watchwords_Periodnegative : in Swagger.UString_Vectors.Vector;
       Watchwords_Periodpath : in Swagger.Nullable_UString;
       Sentiment_Periodpath : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ugcbase_Moderation_Impl_Sentiment_Process;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ugcbase_Security_Impl_Default_Attachment_Type_Blackli
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Default_Periodattachment_Periodtype_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Baseline_Periodattachment_Periodtype_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ugcbase_Security_Impl_Default_Attachment_Type_Blackli;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_Ugcbase_Security_Impl_Safer_Sling_Post_Validator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Parameter_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Parameter_Periodwhitelist_Periodprefixes : in Swagger.UString_Vectors.Vector;
       Binary_Periodparameter_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Modifier_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Operation_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Operation_Periodwhitelist_Periodprefixes : in Swagger.UString_Vectors.Vector;
       Typehint_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Resourcetype_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_Ugcbase_Security_Impl_Safer_Sling_Post_Validator_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_User_Endpoints_Impl_Users_Group_From_Publish_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodextensions : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodpaths : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodmethods : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_User_Endpoints_Impl_Users_Group_From_Publish_Servlet;

   --  
   overriding
   procedure Com_Adobe_Cq_Social_User_Impl_Transport_Http_To_Publisher
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enable : in Swagger.Nullable_Boolean;
       Agent_Periodconfiguration : in Swagger.UString_Vectors.Vector;
       Context_Periodpath : in Swagger.Nullable_UString;
       Disabled_Periodcipher_Periodsuites : in Swagger.UString_Vectors.Vector;
       Enabled_Periodcipher_Periodsuites : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqSocialUserImplTransportHttpToPublisherInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Social_User_Impl_Transport_Http_To_Publisher;

   --  
   overriding
   procedure Com_Adobe_Cq_Ui_Wcm_Commons_Internal_Servlets_Rte_R_T_E_Filter_Servlet_Fact
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Resource_Periodtypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Ui_Wcm_Commons_Internal_Servlets_Rte_R_T_E_Filter_Servlet_Fact;

   --  
   overriding
   procedure Com_Adobe_Cq_Upgrades_Cleanup_Impl_Upgrade_Content_Cleanup
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Delete_Periodpath_Periodregexps : in Swagger.UString_Vectors.Vector;
       Delete_Periodsql2_Periodquery : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Upgrades_Cleanup_Impl_Upgrade_Content_Cleanup;

   --  
   overriding
   procedure Com_Adobe_Cq_Upgrades_Cleanup_Impl_Upgrade_Install_Folder_Cleanup
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Delete_Periodname_Periodregexps : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Upgrades_Cleanup_Impl_Upgrade_Install_Folder_Cleanup;

   --  
   overriding
   procedure Com_Adobe_Cq_Wcm_Jobs_Async_Impl_Async_Delete_Config_Provider_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Threshold : in Swagger.Nullable_Integer;
       Job_Topic_Name : in Swagger.Nullable_UString;
       Email_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Wcm_Jobs_Async_Impl_Async_Delete_Config_Provider_Service;

   --  
   overriding
   procedure Com_Adobe_Cq_Wcm_Jobs_Async_Impl_Async_Job_Clean_Up_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Job_Periodpurge_Periodthreshold : in Swagger.Nullable_Integer;
       Job_Periodpurge_Periodmax_Periodjobs : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Wcm_Jobs_Async_Impl_Async_Job_Clean_Up_Task;

   --  
   overriding
   procedure Com_Adobe_Cq_Wcm_Jobs_Async_Impl_Async_Move_Config_Provider_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Threshold : in Swagger.Nullable_Integer;
       Job_Topic_Name : in Swagger.Nullable_UString;
       Email_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Wcm_Jobs_Async_Impl_Async_Move_Config_Provider_Service;

   --  
   overriding
   procedure Com_Adobe_Cq_Wcm_Jobs_Async_Impl_Async_Page_Move_Config_Provider_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Threshold : in Swagger.Nullable_Integer;
       Job_Topic_Name : in Swagger.Nullable_UString;
       Email_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Wcm_Jobs_Async_Impl_Async_Page_Move_Config_Provider_Service;

   --  
   overriding
   procedure Com_Adobe_Cq_Wcm_Launches_Impl_Launches_Event_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Launches_Periodeventhandler_Periodthreadpool_Periodmaxsize : in Swagger.Nullable_Integer;
       Launches_Periodeventhandler_Periodthreadpool_Periodpriority : in Swagger.Nullable_UString;
       Launches_Periodeventhandler_Periodupdatelastmodification : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Wcm_Launches_Impl_Launches_Event_Handler;

   --  
   overriding
   procedure Com_Adobe_Cq_Wcm_Mobile_Qrcode_Servlet_Q_R_Code_Image_Generator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodqrcode_Periodservlet_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Wcm_Mobile_Qrcode_Servlet_Q_R_Code_Image_Generator;

   --  
   overriding
   procedure Com_Adobe_Cq_Wcm_Style_Internal_Component_Style_Info_Cache_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Size : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Wcm_Style_Internal_Component_Style_Info_Cache_Impl;

   --  
   overriding
   procedure Com_Adobe_Cq_Wcm_Translation_Impl_Translation_Platform_Configuration_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sync_Translation_State_Periodscheduling_Format : in Swagger.Nullable_UString;
       Scheduling_Repeat_Translation_Periodscheduling_Format : in Swagger.Nullable_UString;
       Sync_Translation_State_Periodlock_Timeout_In_Minutes : in Swagger.Nullable_UString;
       Export_Periodformat : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Cq_Wcm_Translation_Impl_Translation_Platform_Configuration_Impl;

   --  
   overriding
   procedure Com_Adobe_Fd_Fp_Config_Forms_Portal_Draftsand_Submission_Config_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Portal_Periodoutboxes : in Swagger.UString_Vectors.Vector;
       Draft_Perioddata_Periodservice : in Swagger.Nullable_UString;
       Draft_Periodmetadata_Periodservice : in Swagger.Nullable_UString;
       Submit_Perioddata_Periodservice : in Swagger.Nullable_UString;
       Submit_Periodmetadata_Periodservice : in Swagger.Nullable_UString;
       Pending_Sign_Perioddata_Periodservice : in Swagger.Nullable_UString;
       Pending_Sign_Periodmetadata_Periodservice : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Fd_Fp_Config_Forms_Portal_Draftsand_Submission_Config_Service;

   --  
   overriding
   procedure Com_Adobe_Fd_Fp_Config_Forms_Portal_Scheduler_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Formportal_Periodinterval : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Fd_Fp_Config_Forms_Portal_Scheduler_Service;

   --  
   overriding
   procedure Com_Adobe_Forms_Common_Service_Impl_Default_Data_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Alloweddata_File_Locations : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeFormsCommonServiceImplDefaultDataProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Forms_Common_Service_Impl_Default_Data_Provider;

   --  
   overriding
   procedure Com_Adobe_Forms_Common_Service_Impl_Forms_Common_Configuration_Service_Imp
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Temp_Storage_Config : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Forms_Common_Service_Impl_Forms_Common_Configuration_Service_Imp;

   --  
   overriding
   procedure Com_Adobe_Forms_Common_Servlet_Temp_Clean_Up_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Duration for _Temporary _Storage : in Swagger.Nullable_UString;
       Duration for _Anonymous _Storage : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeFormsCommonServletTempCleanUpTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Forms_Common_Servlet_Temp_Clean_Up_Task;

   --  
   overriding
   procedure Com_Adobe_Granite_Acp_Platform_Platform_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Query_Periodlimit : in Swagger.Nullable_Integer;
       File_Periodtype_Periodextension_Periodmap : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteAcpPlatformPlatformServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Acp_Platform_Platform_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Activitystreams_Impl_Activity_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Aggregate_Periodrelationships : in Swagger.UString_Vectors.Vector;
       Aggregate_Perioddescend_Periodvirtual : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Activitystreams_Impl_Activity_Manager_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Analyzer_Base_System_Status_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Disabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Analyzer_Base_System_Status_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Analyzer_Scripts_Compile_All_Scripts_Compiler_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Disabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Analyzer_Scripts_Compile_All_Scripts_Compiler_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Apicontroller_Filter_Resolver_Hook_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodcq_Periodcdn_Periodcdn_Rewriter : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcloud_Config_Periodcomponents : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcloud_Config_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcloud_Config_Periodui : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcom_Periodadobe_Periodcq_Periodeditor : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcom_Periodadobe_Periodcq_Periodprojects_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcom_Periodadobe_Periodcq_Periodprojects_Periodwcm_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcom_Periodadobe_Periodcq_Periodui_Periodcommons : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcom_Periodadobe_Periodcq_Periodwcm_Periodstyle : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Activitymap_Integration : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Contexthub_Commons : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Dtm : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Healthcheck : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Multisite_Targeting : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Pre_Upgrade_Cleanup : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Product_Info_Provider : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Rest_Sites : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodcq_Security_Hc : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Perioddam_Periodcq_Dam_Svg_Handler : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Perioddam_Periodcq_Scene7_Imaging : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Perioddtm_Reactor_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Perioddtm_Reactor_Periodui : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodexp_Jspel_Resolver : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodinbox_Periodcq_Inbox : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodjson_Schema_Parser : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodmedia_Periodcq_Media_Publishing_Dps_Fp_Core : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodmobile_Periodcq_Mobile_Caas : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodmobile_Periodcq_Mobile_Index_Builder : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodmobile_Periodcq_Mobile_Phonegap_Build : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodmyspell : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsample_Periodwe_Periodretail_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodcom_Periodadobe_Periodcq_Periodscreens_Perioddcc : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodscreens_Periodcom_Periodadobe_Periodcq_Periodscreens_Periodmq_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_As_Provider : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Badging_Basic_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Badging_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Calendar_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Content_Fragments_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Enablement_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Graph_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Ideation_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Jcr_Provider : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Members_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Ms_Provider : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Notifications_Channels_Web : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Notifications_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Rdb_Provider : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Scf_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Scoring_Basic_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Scoring_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Serviceusers_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Srp_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodcq_Periodsocial_Periodcq_Social_Ugcbase_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Perioddam_Periodcq_Dam_Cfm_Impl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodforms_Periodfoundation_Forms_Foundation_Base : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodapicontroller : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodasset_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodauth_Periodsso : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodbundles_Periodhc_Periodimpl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcompat_Router : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodconf : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodconf_Periodui_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcors : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcrx_Explorer : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcrxde_Lite : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcrypto_Periodconfig : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcrypto_Periodextension : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcrypto_Periodfile : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcrypto_Periodjcr : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodcsrf : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Perioddistribution_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Perioddropwizard_Periodmetrics : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodfrags_Periodimpl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodgibson : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodinfocollector : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodinstaller_Periodfactory_Periodpackages : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodjetty_Periodssl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodjobs_Periodasync : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodmaintenance_Periodoak : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodmonitoring_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodqueries : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodreplication_Periodhc_Periodimpl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodrepository_Periodchecker : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodrepository_Periodhc_Periodimpl : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodrest_Periodassets : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodsecurity_Periodui : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodstartup : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodtagsoup : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodtaskmanagement_Periodcore : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodtaskmanagement_Periodworkflow : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodui_Periodclientlibs_Periodcompiler_Periodless : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodui_Periodclientlibs_Periodprocessor_Periodgcc : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodwebconsole_Periodplugins : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodworkflow_Periodconsole : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodxmp_Periodworker_Periodfiles_Periodnative_Periodfragment_Periodlinux : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodxmp_Periodworker_Periodfiles_Periodnative_Periodfragment_Periodmacosx : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodxmp_Periodworker_Periodfiles_Periodnative_Periodfragment_Periodwin : in Swagger.Nullable_UString;
       Com_Periodday_Periodcommons_Periodosgi_Periodwrapper_Periodsimple_Jndi : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodcq_Authhandler : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodcq_Compat_Configupdate : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodcq_Licensebranding : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodcq_Notifcation_Impl : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodcq_Replication_Audit : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodcq_Search_Ext : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Perioddam_Periodcq_Dam_Annotation_Print : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Perioddam_Periodcq_Dam_Asset_Usage : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Perioddam_Periodcq_Dam_S7dam : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Perioddam_Periodcq_Dam_Similaritysearch : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Perioddam_Perioddam_Webdav_Support : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodpre_Upgrade_Tasks : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodreplication_Periodextensions : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodwcm_Periodcq_Msm_Core : in Swagger.Nullable_UString;
       Com_Periodday_Periodcq_Periodwcm_Periodcq_Wcm_Translation : in Swagger.Nullable_UString;
       Day_Commons_Jrawio : in Swagger.Nullable_UString;
       Org_Periodapache_Periodaries_Periodjmx_Periodwhiteboard : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttp_Periodsslfilter : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodorg_Periodapache_Periodfelix_Periodthreaddump : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodwebconsole_Periodplugins_Periodds : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodwebconsole_Periodplugins_Periodevent : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodwebconsole_Periodplugins_Periodmemoryusage : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodwebconsole_Periodplugins_Periodpackageadmin : in Swagger.Nullable_UString;
       Org_Periodapache_Periodjackrabbit_Periodoak_Auth_Ldap : in Swagger.Nullable_UString;
       Org_Periodapache_Periodjackrabbit_Periodoak_Segment_Tar : in Swagger.Nullable_UString;
       Org_Periodapache_Periodjackrabbit_Periodoak_Solr_Osgi : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodbundleresource_Periodimpl : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodfsclassloader : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodwebconsole : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Perioddatasource : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Perioddiscovery_Periodbase : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Perioddiscovery_Periodoak : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Perioddiscovery_Periodsupport : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Perioddistribution_Periodapi : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Perioddistribution_Periodcore : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodextensions_Periodwebconsolesecurityprovider : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodhc_Periodwebconsole : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodinstaller_Periodconsole : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodinstaller_Periodprovider_Periodfile : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodinstaller_Periodprovider_Periodjcr : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodjcr_Perioddavex : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodjcr_Periodresourcesecurity : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodjmx_Periodprovider : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodlaunchpad_Periodinstaller : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodmodels_Periodimpl : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodrepoinit_Periodparser : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodresource_Periodinventory : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodresourceresolver : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodscripting_Periodjavascript : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodscripting_Periodjst : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodscripting_Periodsightly_Periodjs_Periodprovider : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodscripting_Periodsightly_Periodmodels_Periodprovider : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodsecurity : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodservlets_Periodcompat : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodservlets_Periodget : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodstartupfilter_Perioddisabler : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodtracer : in Swagger.Nullable_UString;
       We_Periodretail_Periodclient_Periodapp_Periodcore : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Apicontroller_Filter_Resolver_Hook_Factory;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Cert_Impl_Client_Cert_Auth_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Cert_Impl_Client_Cert_Auth_Handler;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Ims
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Configid : in Swagger.Nullable_UString;
       Scope : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthImsInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Ims;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Ims_Impl_External_User_Id_Mapping_Provider_Extension
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Ims_Impl_External_User_Id_Mapping_Provider_Extension;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Ims_Impl_I_M_S_Access_Token_Request_Customizer_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Auth_Periodims_Periodclient_Periodsecret : in Swagger.Nullable_UString;
       Customizer_Periodtype : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Ims_Impl_I_M_S_Access_Token_Request_Customizer_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Ims_Impl_I_M_S_Instance_Credentials_Validator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Ims_Impl_I_M_S_Instance_Credentials_Validator;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Ims_Impl_I_M_S_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodims_Periodauthorization_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodims_Periodtoken_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodims_Periodprofile_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodims_Periodextended_Perioddetails_Periodurls : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodims_Periodvalidate_Periodtoken_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodims_Periodsession_Periodproperty : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodims_Periodservice_Periodtoken_Periodclient_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodims_Periodservice_Periodtoken_Periodclient_Periodsecret : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodims_Periodservice_Periodtoken : in Swagger.Nullable_UString;
       Ims_Periodorg_Periodref : in Swagger.Nullable_UString;
       Ims_Periodgroup_Periodmapping : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodims_Periodonly_Periodlicense_Periodgroup : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteAuthImsImplIMSProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Ims_Impl_I_M_S_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Ims_Impl_Ims_Config_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodconfigmanager_Periodims_Periodconfigid : in Swagger.Nullable_UString;
       Ims_Periodowning_Entity : in Swagger.Nullable_UString;
       Aem_Periodinstance_Id : in Swagger.Nullable_UString;
       Ims_Periodservice_Code : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Ims_Impl_Ims_Config_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Accesstoken_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Auth_Periodtoken_Periodprovider_Periodtitle : in Swagger.Nullable_UString;
       Auth_Periodtoken_Periodprovider_Perioddefault_Periodclaims : in Swagger.UString_Vectors.Vector;
       Auth_Periodtoken_Periodprovider_Periodendpoint : in Swagger.Nullable_UString;
       Auth_Periodaccess_Periodtoken_Periodrequest : in Swagger.Nullable_UString;
       Auth_Periodtoken_Periodprovider_Periodkeypair_Periodalias : in Swagger.Nullable_UString;
       Auth_Periodtoken_Periodprovider_Periodconn_Periodtimeout : in Swagger.Nullable_Integer;
       Auth_Periodtoken_Periodprovider_Periodso_Periodtimeout : in Swagger.Nullable_Integer;
       Auth_Periodtoken_Periodprovider_Periodclient_Periodid : in Swagger.Nullable_UString;
       Auth_Periodtoken_Periodprovider_Periodscope : in Swagger.Nullable_UString;
       Auth_Periodtoken_Periodprovider_Periodreuse_Periodaccess_Periodtoken : in Swagger.Nullable_Boolean;
       Auth_Periodtoken_Periodprovider_Periodrelaxed_Periodssl : in Swagger.Nullable_Boolean;
       Token_Periodrequest_Periodcustomizer_Periodtype : in Swagger.Nullable_UString;
       Auth_Periodtoken_Periodvalidator_Periodtype : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthAccesstokenProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Accesstoken_Provider;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_Bearer_Authentication_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Oauth_Periodclient_Ids_Periodallowed : in Swagger.UString_Vectors.Vector;
       Auth_Periodbearer_Periodsync_Periodims : in Swagger.Nullable_Boolean;
       Auth_Periodtoken_Request_Parameter : in Swagger.Nullable_UString;
       Oauth_Periodbearer_Periodconfigid : in Swagger.Nullable_UString;
       Oauth_Periodjwt_Periodsupport : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_Bearer_Authentication_Handler;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_Default_Token_Validator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Auth_Periodtoken_Periodvalidator_Periodtype : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_Default_Token_Validator_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_Facebook_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_Facebook_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_Github_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodgithub_Periodauthorization_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodgithub_Periodtoken_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodgithub_Periodprofile_Periodurl : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplGithubProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_Github_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_Granite_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodgranite_Periodauthorization_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodgranite_Periodtoken_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodgranite_Periodprofile_Periodurl : in Swagger.Nullable_UString;
       Oauth_Periodprovider_Periodgranite_Periodextended_Perioddetails_Periodurls : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplGraniteProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_Granite_Provider;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_Helper_Provider_Config_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodcookie_Periodlogin_Periodtimeout : in Swagger.Nullable_UString;
       Oauth_Periodcookie_Periodmax_Periodage : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_Helper_Provider_Config_Manager;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_Helper_Provider_Config_Manager_Internal
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodcookie_Periodlogin_Periodtimeout : in Swagger.Nullable_UString;
       Oauth_Periodcookie_Periodmax_Periodage : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_Helper_Provider_Config_Manager_Internal;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_O_Auth_Authentication_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_O_Auth_Authentication_Handler;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Impl_Twitter_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Impl_Twitter_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Oauth_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodconfig_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodclient_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodclient_Periodsecret : in Swagger.Nullable_UString;
       Oauth_Periodscope : in Swagger.UString_Vectors.Vector;
       Oauth_Periodconfig_Periodprovider_Periodid : in Swagger.Nullable_UString;
       Oauth_Periodcreate_Periodusers : in Swagger.Nullable_Boolean;
       Oauth_Perioduserid_Periodproperty : in Swagger.Nullable_UString;
       Force_Periodstrict_Periodusername_Periodmatching : in Swagger.Nullable_Boolean;
       Oauth_Periodencode_Perioduserids : in Swagger.Nullable_Boolean;
       Oauth_Periodhash_Perioduserids : in Swagger.Nullable_Boolean;
       Oauth_Periodcall_Back_Url : in Swagger.Nullable_UString;
       Oauth_Periodaccess_Periodtoken_Periodpersist : in Swagger.Nullable_Boolean;
       Oauth_Periodaccess_Periodtoken_Periodpersist_Periodcookie : in Swagger.Nullable_Boolean;
       Oauth_Periodcsrf_Periodstate_Periodprotection : in Swagger.Nullable_Boolean;
       Oauth_Periodredirect_Periodrequest_Periodparams : in Swagger.Nullable_Boolean;
       Oauth_Periodconfig_Periodsiblings_Periodallow : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteAuthOauthProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Oauth_Provider;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Requirement_Impl_Default_Requirement_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Supported_Paths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Requirement_Impl_Default_Requirement_Handler;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Saml_Saml_Authentication_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Idp_Url : in Swagger.Nullable_UString;
       Idp_Cert_Alias : in Swagger.Nullable_UString;
       Idp_Http_Redirect : in Swagger.Nullable_Boolean;
       Service_Provider_Entity_Id : in Swagger.Nullable_UString;
       Assertion_Consumer_Service_U_R_L : in Swagger.Nullable_UString;
       Sp_Private_Key_Alias : in Swagger.Nullable_UString;
       Key_Store_Password : in Swagger.Nullable_UString;
       Default_Redirect_Url : in Swagger.Nullable_UString;
       User_I_D_Attribute : in Swagger.Nullable_UString;
       Use_Encryption : in Swagger.Nullable_Boolean;
       Create_User : in Swagger.Nullable_Boolean;
       User_Intermediate_Path : in Swagger.Nullable_UString;
       Add_Group_Memberships : in Swagger.Nullable_Boolean;
       Group_Membership_Attribute : in Swagger.Nullable_UString;
       Default_Groups : in Swagger.UString_Vectors.Vector;
       Name_Id_Format : in Swagger.Nullable_UString;
       Synchronize_Attributes : in Swagger.UString_Vectors.Vector;
       Handle_Logout : in Swagger.Nullable_Boolean;
       Logout_Url : in Swagger.Nullable_UString;
       Clock_Tolerance : in Swagger.Nullable_Integer;
       Digest_Method : in Swagger.Nullable_UString;
       Signature_Method : in Swagger.Nullable_UString;
       Identity_Sync_Type : in Swagger.Nullable_UString;
       Idp_Identifier : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Saml_Saml_Authentication_Handler;

   --  
   overriding
   procedure Com_Adobe_Granite_Auth_Sso_Impl_Sso_Authentication_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Jaas_Periodcontrol_Flag : in Swagger.Nullable_UString;
       Jaas_Periodrealm_Name : in Swagger.Nullable_UString;
       Jaas_Periodranking : in Swagger.Nullable_Integer;
       Headers : in Swagger.UString_Vectors.Vector;
       Cookies : in Swagger.UString_Vectors.Vector;
       Parameters : in Swagger.UString_Vectors.Vector;
       Usermap : in Swagger.UString_Vectors.Vector;
       Format : in Swagger.Nullable_UString;
       Trusted_Credentials_Attribute : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Auth_Sso_Impl_Sso_Authentication_Handler;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Code_Cache_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Minimum_Periodcode_Periodcache_Periodsize : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Code_Cache_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Crxde_Support_Bundle_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Crxde_Support_Bundle_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Dav_Ex_Bundle_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Dav_Ex_Bundle_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Inactive_Bundles_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Ignored_Periodbundles : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Inactive_Bundles_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Jobs_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Max_Periodqueued_Periodjobs : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Jobs_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Sling_Get_Servlet_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Sling_Get_Servlet_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Sling_Java_Script_Handler_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Sling_Java_Script_Handler_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Sling_Jsp_Script_Handler_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Sling_Jsp_Script_Handler_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Sling_Referrer_Filter_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Sling_Referrer_Filter_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Bundles_Hc_Impl_Web_Dav_Bundle_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Bundles_Hc_Impl_Web_Dav_Bundle_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Comments_Internal_Comment_Replication_Content_Filter_Fac
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Replicate_Periodcomment_Periodresource_Types : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Comments_Internal_Comment_Replication_Content_Filter_Fac;

   --  
   overriding
   procedure Com_Adobe_Granite_Compatrouter_Impl_Compat_Switching_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Compatgroups : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Compatrouter_Impl_Compat_Switching_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Compatrouter_Impl_Routing_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Id : in Swagger.Nullable_UString;
       Compat_Path : in Swagger.Nullable_UString;
       New_Path : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteCompatrouterImplRoutingConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Compatrouter_Impl_Routing_Config;

   --  
   overriding
   procedure Com_Adobe_Granite_Compatrouter_Impl_Switch_Mapping_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Group : in Swagger.Nullable_UString;
       Ids : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Compatrouter_Impl_Switch_Mapping_Config;

   --  
   overriding
   procedure Com_Adobe_Granite_Conf_Impl_Runtime_Aware_Configuration_Resource_Resolving
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Fallback_Paths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Conf_Impl_Runtime_Aware_Configuration_Resource_Resolving;

   --  
   overriding
   procedure Com_Adobe_Granite_Contexthub_Impl_Context_Hub_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodgranite_Periodcontexthub_Periodsilent_Mode : in Swagger.Nullable_Boolean;
       Com_Periodadobe_Periodgranite_Periodcontexthub_Periodshow_Ui : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteContexthubImplContextHubImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Contexthub_Impl_Context_Hub_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Cors_Impl_C_O_R_S_Policy_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Alloworigin : in Swagger.UString_Vectors.Vector;
       Alloworiginregexp : in Swagger.UString_Vectors.Vector;
       Allowedpaths : in Swagger.UString_Vectors.Vector;
       Exposedheaders : in Swagger.UString_Vectors.Vector;
       Maxage : in Swagger.Nullable_Integer;
       Supportedheaders : in Swagger.UString_Vectors.Vector;
       Supportedmethods : in Swagger.UString_Vectors.Vector;
       Supportscredentials : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteCorsImplCORSPolicyImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Cors_Impl_C_O_R_S_Policy_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Csrf_Impl_C_S_R_F_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Filter_Periodmethods : in Swagger.UString_Vectors.Vector;
       Filter_Periodenable_Periodsafe_Perioduser_Periodagents : in Swagger.Nullable_Boolean;
       Filter_Periodsafe_Perioduser_Periodagents : in Swagger.UString_Vectors.Vector;
       Filter_Periodexcluded_Periodpaths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteCsrfImplCSRFFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Csrf_Impl_C_S_R_F_Filter;

   --  
   overriding
   procedure Com_Adobe_Granite_Csrf_Impl_C_S_R_F_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Csrf_Periodtoken_Periodexpires_Periodin : in Swagger.Nullable_Integer;
       Sling_Periodauth_Periodrequirements : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteCsrfImplCSRFServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Csrf_Impl_C_S_R_F_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Distribution_Core_Impl_Crypto_Distribution_Transport_Se
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Username : in Swagger.Nullable_UString;
       Encrypted_Password : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Distribution_Core_Impl_Crypto_Distribution_Transport_Se;

   --  
   overriding
   procedure Com_Adobe_Granite_Distribution_Core_Impl_Diff_Diff_Changes_Observer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Agent_Name : in Swagger.Nullable_UString;
       Diff_Path : in Swagger.Nullable_UString;
       Observed_Path : in Swagger.Nullable_UString;
       Service_Name : in Swagger.Nullable_UString;
       Property_Names : in Swagger.Nullable_UString;
       Distribution_Delay : in Swagger.Nullable_Integer;
       Service_User_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Distribution_Core_Impl_Diff_Diff_Changes_Observer;

   --  
   overriding
   procedure Com_Adobe_Granite_Distribution_Core_Impl_Diff_Diff_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Diff_Path : in Swagger.Nullable_UString;
       Service_Name : in Swagger.Nullable_UString;
       Service_User_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Distribution_Core_Impl_Diff_Diff_Event_Listener;

   --  
   overriding
   procedure Com_Adobe_Granite_Distribution_Core_Impl_Distribution_To_Replication_Even
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Importer_Periodname : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Distribution_Core_Impl_Distribution_To_Replication_Even;

   --  
   overriding
   procedure Com_Adobe_Granite_Distribution_Core_Impl_Replication_Adapters_Replicat
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Provider_Name : in Swagger.Nullable_UString;
       Forward_Periodrequests : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Distribution_Core_Impl_Replication_Adapters_Replicat;

   --  
   overriding
   procedure Com_Adobe_Granite_Distribution_Core_Impl_Replication_Distribution_Trans
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Forward_Periodrequests : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Distribution_Core_Impl_Replication_Distribution_Trans;

   --  
   overriding
   procedure Com_Adobe_Granite_Distribution_Core_Impl_Transport_Access_Token_Distribu
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Service_Name : in Swagger.Nullable_UString;
       User_Id : in Swagger.Nullable_UString;
       Access_Token_Provider_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Distribution_Core_Impl_Transport_Access_Token_Distribu;

   --  
   overriding
   procedure Com_Adobe_Granite_Frags_Impl_Check_Http_Header_Flag
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Feature_Periodname : in Swagger.Nullable_UString;
       Feature_Perioddescription : in Swagger.Nullable_UString;
       Http_Periodheader_Periodname : in Swagger.Nullable_UString;
       Http_Periodheader_Periodvaluepattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Frags_Impl_Check_Http_Header_Flag;

   --  
   overriding
   procedure Com_Adobe_Granite_Frags_Impl_Random_Feature
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Feature_Periodname : in Swagger.Nullable_UString;
       Feature_Perioddescription : in Swagger.Nullable_UString;
       Active_Periodpercentage : in Swagger.Nullable_UString;
       Cookie_Periodname : in Swagger.Nullable_UString;
       Cookie_Periodmax_Age : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteFragsImplRandomFeatureInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Frags_Impl_Random_Feature;

   --  
   overriding
   procedure Com_Adobe_Granite_Httpcache_File_File_Cache_Store
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodgranite_Periodhttpcache_Periodfile_Perioddocument_Root : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodhttpcache_Periodfile_Periodinclude_Host : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteHttpcacheFileFileCacheStoreInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Httpcache_File_File_Cache_Store;

   --  
   overriding
   procedure Com_Adobe_Granite_Httpcache_Impl_Outer_Cache_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodgranite_Periodhttpcache_Periodurl_Periodpaths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Httpcache_Impl_Outer_Cache_Filter;

   --  
   overriding
   procedure Com_Adobe_Granite_I18n_Impl_Bundle_Pseudo_Translations
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pseudo_Periodpatterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_I18n_Impl_Bundle_Pseudo_Translations;

   --  
   overriding
   procedure Com_Adobe_Granite_I18n_Impl_Preferences_Locale_Resolver_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Security_Periodpreferences_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_I18n_Impl_Preferences_Locale_Resolver_Service;

   --  
   overriding
   procedure Com_Adobe_Granite_Infocollector_Info_Collector
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Granite_Periodinfocollector_Periodinclude_Thread_Dumps : in Swagger.Nullable_Boolean;
       Granite_Periodinfocollector_Periodinclude_Heap_Dump : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteInfocollectorInfoCollectorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Infocollector_Info_Collector;

   --  
   overriding
   procedure Com_Adobe_Granite_Jetty_Ssl_Internal_Granite_Ssl_Connector_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodgranite_Periodjetty_Periodssl_Periodport : in Swagger.Nullable_Integer;
       Com_Periodadobe_Periodgranite_Periodjetty_Periodssl_Periodkeystore_Perioduser : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodjetty_Periodssl_Periodkeystore_Periodpassword : in Swagger.Nullable_UString;
       Com_Periodadobe_Periodgranite_Periodjetty_Periodssl_Periodciphersuites_Periodexcluded : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodgranite_Periodjetty_Periodssl_Periodciphersuites_Periodincluded : in Swagger.UString_Vectors.Vector;
       Com_Periodadobe_Periodgranite_Periodjetty_Periodssl_Periodclient_Periodcertificate : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Jetty_Ssl_Internal_Granite_Ssl_Connector_Factory;

   --  
   overriding
   procedure Com_Adobe_Granite_License_Impl_License_Check_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Check_Internval : in Swagger.Nullable_Integer;
       Exclude_Ids : in Swagger.UString_Vectors.Vector;
       Encrypt_Ping : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteLicenseImplLicenseCheckFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_License_Impl_License_Check_Filter;

   --  
   overriding
   procedure Com_Adobe_Granite_Logging_Impl_Log_Analyser_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Messages_Periodqueue_Periodsize : in Swagger.Nullable_Integer;
       Logger_Periodconfig : in Swagger.UString_Vectors.Vector;
       Messages_Periodsize : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteLoggingImplLogAnalyserImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Logging_Impl_Log_Analyser_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Logging_Impl_Log_Error_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Logging_Impl_Log_Error_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Maintenance_Crx_Impl_Data_Store_Garbage_Collection_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Granite_Periodmaintenance_Periodmandatory : in Swagger.Nullable_Boolean;
       Job_Periodtopics : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Maintenance_Crx_Impl_Data_Store_Garbage_Collection_Task;

   --  
   overriding
   procedure Com_Adobe_Granite_Maintenance_Crx_Impl_Lucene_Binaries_Cleanup_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Job_Periodtopics : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Maintenance_Crx_Impl_Lucene_Binaries_Cleanup_Task;

   --  
   overriding
   procedure Com_Adobe_Granite_Maintenance_Crx_Impl_Revision_Cleanup_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Full_Periodgc_Perioddays : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Maintenance_Crx_Impl_Revision_Cleanup_Task;

   --  
   overriding
   procedure Com_Adobe_Granite_Monitoring_Impl_Script_Config_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Script_Periodfilename : in Swagger.Nullable_UString;
       Script_Perioddisplay : in Swagger.Nullable_UString;
       Script_Periodpath : in Swagger.Nullable_UString;
       Script_Periodplatform : in Swagger.UString_Vectors.Vector;
       Interval : in Swagger.Nullable_Integer;
       Jmxdomain : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteMonitoringImplScriptConfigImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Monitoring_Impl_Script_Config_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Oauth_Server_Auth_Impl_O_Auth2_Server_Authentication_Han
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Jaas_Periodcontrol_Flag : in Swagger.Nullable_UString;
       Jaas_Periodrealm_Name : in Swagger.Nullable_UString;
       Jaas_Periodranking : in Swagger.Nullable_Integer;
       Oauth_Periodoffline_Periodvalidation : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Oauth_Server_Auth_Impl_O_Auth2_Server_Authentication_Han;

   --  
   overriding
   procedure Com_Adobe_Granite_Oauth_Server_Impl_Access_Token_Cleanup_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Oauth_Server_Impl_Access_Token_Cleanup_Task;

   --  
   overriding
   procedure Com_Adobe_Granite_Oauth_Server_Impl_O_Auth2_Client_Revocation_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodclient_Periodrevocation_Periodactive : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Oauth_Server_Impl_O_Auth2_Client_Revocation_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Oauth_Server_Impl_O_Auth2_Revocation_Endpoint_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodpaths : in Swagger.Nullable_UString;
       Oauth_Periodrevocation_Periodactive : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Oauth_Server_Impl_O_Auth2_Revocation_Endpoint_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Oauth_Server_Impl_O_Auth2_Token_Endpoint_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodissuer : in Swagger.Nullable_UString;
       Oauth_Periodaccess_Periodtoken_Periodexpires_Periodin : in Swagger.Nullable_UString;
       Osgi_Periodhttp_Periodwhiteboard_Periodservlet_Periodpattern : in Swagger.Nullable_UString;
       Osgi_Periodhttp_Periodwhiteboard_Periodcontext_Periodselect : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Oauth_Server_Impl_O_Auth2_Token_Endpoint_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Oauth_Server_Impl_O_Auth2_Token_Revocation_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Oauth_Periodtoken_Periodrevocation_Periodactive : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Oauth_Server_Impl_O_Auth2_Token_Revocation_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Offloading_Impl_Offloading_Configurator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Offloading_Periodtransporter : in Swagger.Nullable_UString;
       Offloading_Periodcleanup_Periodpayload : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Offloading_Impl_Offloading_Configurator;

   --  
   overriding
   procedure Com_Adobe_Granite_Offloading_Impl_Offloading_Job_Cloner
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Offloading_Periodjobcloner_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Offloading_Impl_Offloading_Job_Cloner;

   --  
   overriding
   procedure Com_Adobe_Granite_Offloading_Impl_Offloading_Job_Offloader
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Offloading_Periodoffloader_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Offloading_Impl_Offloading_Job_Offloader;

   --  
   overriding
   procedure Com_Adobe_Granite_Offloading_Impl_Transporter_Offloading_Agent_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Offloading_Periodagentmanager_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Offloading_Impl_Transporter_Offloading_Agent_Manager;

   --  
   overriding
   procedure Com_Adobe_Granite_Offloading_Impl_Transporter_Offloading_Default_Transpo
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Default_Periodtransport_Periodagent_To_Worker_Periodprefix : in Swagger.Nullable_UString;
       Default_Periodtransport_Periodagent_To_Master_Periodprefix : in Swagger.Nullable_UString;
       Default_Periodtransport_Periodinput_Periodpackage : in Swagger.Nullable_UString;
       Default_Periodtransport_Periodoutput_Periodpackage : in Swagger.Nullable_UString;
       Default_Periodtransport_Periodreplication_Periodsynchronous : in Swagger.Nullable_Boolean;
       Default_Periodtransport_Periodcontentpackage : in Swagger.Nullable_Boolean;
       Offloading_Periodtransporter_Perioddefault_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Offloading_Impl_Transporter_Offloading_Default_Transpo;

   --  
   overriding
   procedure Com_Adobe_Granite_Omnisearch_Impl_Core_Omni_Search_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Omnisearch_Periodsuggestion_Periodrequiretext_Periodmin : in Swagger.Nullable_Integer;
       Omnisearch_Periodsuggestion_Periodspellcheck_Periodrequire : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Omnisearch_Impl_Core_Omni_Search_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Optout_Impl_Opt_Out_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Optout_Periodcookies : in Swagger.UString_Vectors.Vector;
       Optout_Periodheaders : in Swagger.UString_Vectors.Vector;
       Optout_Periodwhitelist_Periodcookies : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteOptoutImplOptOutServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Optout_Impl_Opt_Out_Service_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Queries_Impl_Hc_Async_Index_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Indexing_Periodcritical_Periodthreshold : in Swagger.Nullable_Integer;
       Indexing_Periodwarn_Periodthreshold : in Swagger.Nullable_Integer;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Queries_Impl_Hc_Async_Index_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Queries_Impl_Hc_Large_Index_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Large_Periodindex_Periodcritical_Periodthreshold : in Swagger.Nullable_Integer;
       Large_Periodindex_Periodwarn_Periodthreshold : in Swagger.Nullable_Integer;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Queries_Impl_Hc_Large_Index_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Queries_Impl_Hc_Queries_Status_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Queries_Impl_Hc_Queries_Status_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Queries_Impl_Hc_Query_Health_Check_Metrics
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Get_Period : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Queries_Impl_Hc_Query_Health_Check_Metrics;

   --  
   overriding
   procedure Com_Adobe_Granite_Queries_Impl_Hc_Query_Limits_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Queries_Impl_Hc_Query_Limits_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Replication_Hc_Impl_Replication_Queue_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Number_Periodof_Periodretries_Periodallowed : in Swagger.Nullable_Integer;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Replication_Hc_Impl_Replication_Queue_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Replication_Hc_Impl_Replication_Transport_Users_Health_C
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Replication_Hc_Impl_Replication_Transport_Users_Health_C;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Hc_Impl_Authorizable_Node_Name_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Hc_Impl_Authorizable_Node_Name_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Hc_Impl_Content_Sling_Sling_Content_Health_C
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Exclude_Periodsearch_Periodpath : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Hc_Impl_Content_Sling_Sling_Content_Health_C;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Hc_Impl_Continuous_R_G_C_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Hc_Impl_Continuous_R_G_C_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Hc_Impl_Default_Access_User_Profile_Health_Che
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Hc_Impl_Default_Access_User_Profile_Health_Che;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Hc_Impl_Default_Logins_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Account_Periodlogins : in Swagger.UString_Vectors.Vector;
       Console_Periodlogins : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Hc_Impl_Default_Logins_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Hc_Impl_Disk_Space_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Disk_Periodspace_Periodwarn_Periodthreshold : in Swagger.Nullable_Integer;
       Disk_Periodspace_Perioderror_Periodthreshold : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Hc_Impl_Disk_Space_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Hc_Impl_Observation_Queue_Length_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Hc_Impl_Observation_Queue_Length_Health_Check;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Impl_Commit_Stats_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Interval_Seconds : in Swagger.Nullable_Integer;
       Commits_Per_Interval_Threshold : in Swagger.Nullable_Integer;
       Max_Location_Length : in Swagger.Nullable_Integer;
       Max_Details_Shown : in Swagger.Nullable_Integer;
       Min_Details_Percentage : in Swagger.Nullable_Integer;
       Thread_Matchers : in Swagger.UString_Vectors.Vector;
       Max_Greedy_Depth : in Swagger.Nullable_Integer;
       Greedy_Stack_Matchers : in Swagger.Nullable_UString;
       Stack_Filters : in Swagger.UString_Vectors.Vector;
       Stack_Matchers : in Swagger.UString_Vectors.Vector;
       Stack_Categorizers : in Swagger.UString_Vectors.Vector;
       Stack_Shorteners : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRepositoryImplCommitStatsConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Impl_Commit_Stats_Config;

   --  
   overriding
   procedure Com_Adobe_Granite_Repository_Service_User_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Serviceusers_Periodsimple_Subject_Population : in Swagger.Nullable_Boolean;
       Serviceusers_Periodlist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRepositoryServiceUserConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Repository_Service_User_Configuration;

   --  
   overriding
   procedure Com_Adobe_Granite_Requests_Logging_Impl_Hc_Requests_Status_Health_Check_Im
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Requests_Logging_Impl_Hc_Requests_Status_Health_Check_Im;

   --  
   overriding
   procedure Com_Adobe_Granite_Resourcestatus_Impl_Composite_Status_Type
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Types : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Resourcestatus_Impl_Composite_Status_Type;

   --  
   overriding
   procedure Com_Adobe_Granite_Resourcestatus_Impl_Status_Resource_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Provider_Periodroot : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Resourcestatus_Impl_Status_Resource_Provider_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Rest_Assets_Impl_Asset_Content_Disposition_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mime_Periodallow_Empty : in Swagger.Nullable_Boolean;
       Mime_Periodallowed : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Rest_Assets_Impl_Asset_Content_Disposition_Filter;

   --  
   overriding
   procedure Com_Adobe_Granite_Rest_Impl_Api_Endpoint_Resource_Provider_Factory_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Provider_Periodroots : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Rest_Impl_Api_Endpoint_Resource_Provider_Factory_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Rest_Impl_Servlet_Default_G_E_T_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Default_Periodlimit : in Swagger.Nullable_Integer;
       Use_Periodabsolute_Perioduri : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteRestImplServletDefaultGETServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Rest_Impl_Servlet_Default_G_E_T_Servlet;

   --  
   overriding
   procedure Com_Adobe_Granite_Security_User_Ui_Internal_Servlets_S_S_L_Configuration_S
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Security_User_Ui_Internal_Servlets_S_S_L_Configuration_S;

   --  
   overriding
   procedure Com_Adobe_Granite_Security_User_User_Properties_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Adapter_Periodcondition : in Swagger.Nullable_UString;
       Granite_Perioduserproperties_Periodnodetypes : in Swagger.UString_Vectors.Vector;
       Granite_Perioduserproperties_Periodresourcetypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteSecurityUserUserPropertiesServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Security_User_User_Properties_Service;

   --  
   overriding
   procedure Com_Adobe_Granite_Socialgraph_Impl_Social_Graph_Factory_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Group2member_Periodrelationship_Periodoutgoing : in Swagger.Nullable_UString;
       Group2member_Periodexcluded_Periodoutgoing : in Swagger.UString_Vectors.Vector;
       Group2member_Periodrelationship_Periodincoming : in Swagger.Nullable_UString;
       Group2member_Periodexcluded_Periodincoming : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Socialgraph_Impl_Social_Graph_Factory_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_System_Monitoring_Impl_System_Stats_M_Bean_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Jmx_Periodobjectname : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_System_Monitoring_Impl_System_Stats_M_Bean_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Taskmanagement_Impl_Jcr_Task_Adapter_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Adapter_Periodcondition : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Taskmanagement_Impl_Jcr_Task_Adapter_Factory;

   --  
   overriding
   procedure Com_Adobe_Granite_Taskmanagement_Impl_Jcr_Task_Archive_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Archiving_Periodenabled : in Swagger.Nullable_Boolean;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Archive_Periodsince_Perioddays_Periodcompleted : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Taskmanagement_Impl_Jcr_Task_Archive_Service;

   --  
   overriding
   procedure Com_Adobe_Granite_Taskmanagement_Impl_Purge_Task_Purge_Maintenance_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Purge_Completed : in Swagger.Nullable_Boolean;
       Completed_Age : in Swagger.Nullable_Integer;
       Purge_Active : in Swagger.Nullable_Boolean;
       Active_Age : in Swagger.Nullable_Integer;
       Save_Threshold : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Taskmanagement_Impl_Purge_Task_Purge_Maintenance_Task;

   --  
   overriding
   procedure Com_Adobe_Granite_Taskmanagement_Impl_Service_Task_Manager_Adapter_Factor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Adapter_Periodcondition : in Swagger.Nullable_UString;
       Taskmanager_Periodadmingroups : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Taskmanagement_Impl_Service_Task_Manager_Adapter_Factor;

   --  
   overriding
   procedure Com_Adobe_Granite_Threaddump_Thread_Dump_Collector
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodperiod : in Swagger.Nullable_Integer;
       Scheduler_Periodrun_On : in Swagger.Nullable_UString;
       Granite_Periodthreaddump_Periodenabled : in Swagger.Nullable_Boolean;
       Granite_Periodthreaddump_Perioddumps_Per_File : in Swagger.Nullable_Integer;
       Granite_Periodthreaddump_Periodenable_Gzip_Compression : in Swagger.Nullable_Boolean;
       Granite_Periodthreaddump_Periodenable_Directories_Compression : in Swagger.Nullable_Boolean;
       Granite_Periodthreaddump_Periodenable_J_Stack : in Swagger.Nullable_Boolean;
       Granite_Periodthreaddump_Periodmax_Backup_Days : in Swagger.Nullable_Integer;
       Granite_Periodthreaddump_Periodbackup_Clean_Trigger : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteThreaddumpThreadDumpCollectorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Threaddump_Thread_Dump_Collector;

   --  
   overriding
   procedure Com_Adobe_Granite_Translation_Connector_Msft_Core_Impl_Microsoft_Transl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Translation_Factory : in Swagger.Nullable_UString;
       Default_Connector_Label : in Swagger.Nullable_UString;
       Default_Connector_Attribution : in Swagger.Nullable_UString;
       Default_Connector_Workspace_Id : in Swagger.Nullable_UString;
       Default_Connector_Subscription_Key : in Swagger.Nullable_UString;
       Language_Map_Location : in Swagger.Nullable_UString;
       Category_Map_Location : in Swagger.Nullable_UString;
       Retry_Attempts : in Swagger.Nullable_Integer;
       Timeout_Count : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Translation_Connector_Msft_Core_Impl_Microsoft_Transl;

   --  
   overriding
   procedure Com_Adobe_Granite_Translation_Core_Impl_Translation_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Default_Connector_Name : in Swagger.Nullable_UString;
       Default_Category : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Translation_Core_Impl_Translation_Manager_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Ui_Clientlibs_Impl_Html_Library_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Htmllibmanager_Periodtiming : in Swagger.Nullable_Boolean;
       Htmllibmanager_Perioddebug_Periodinit_Periodjs : in Swagger.Nullable_UString;
       Htmllibmanager_Periodminify : in Swagger.Nullable_Boolean;
       Htmllibmanager_Perioddebug : in Swagger.Nullable_Boolean;
       Htmllibmanager_Periodgzip : in Swagger.Nullable_Boolean;
       Htmllibmanager_Periodmax_Data_Uri_Size : in Swagger.Nullable_Integer;
       Htmllibmanager_Periodmaxage : in Swagger.Nullable_Integer;
       Htmllibmanager_Periodforce_C_Q_Url_Info : in Swagger.Nullable_Boolean;
       Htmllibmanager_Perioddefaultthemename : in Swagger.Nullable_UString;
       Htmllibmanager_Perioddefaultuserthemename : in Swagger.Nullable_UString;
       Htmllibmanager_Periodclientmanager : in Swagger.Nullable_UString;
       Htmllibmanager_Periodpath_Periodlist : in Swagger.UString_Vectors.Vector;
       Htmllibmanager_Periodexcluded_Periodpath_Periodlist : in Swagger.UString_Vectors.Vector;
       Htmllibmanager_Periodprocessor_Periodjs : in Swagger.UString_Vectors.Vector;
       Htmllibmanager_Periodprocessor_Periodcss : in Swagger.UString_Vectors.Vector;
       Htmllibmanager_Periodlongcache_Periodpatterns : in Swagger.UString_Vectors.Vector;
       Htmllibmanager_Periodlongcache_Periodformat : in Swagger.Nullable_UString;
       Htmllibmanager_Perioduse_File_System_Output_Cache : in Swagger.Nullable_Boolean;
       Htmllibmanager_Periodfile_System_Output_Cache_Location : in Swagger.Nullable_UString;
       Htmllibmanager_Perioddisable_Periodreplacement : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Ui_Clientlibs_Impl_Html_Library_Manager_Impl;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Console_Frags_Workflow_Withdraw_Feature
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Console_Frags_Workflow_Withdraw_Feature;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Console_Publish_Workflow_Publish_Event_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Granite_Periodworkflow_Period_Workflow_Publish_Event_Service_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Console_Publish_Workflow_Publish_Event_Service;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Core_Jcr_Workflow_Bucket_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Bucket_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Core_Jcr_Workflow_Bucket_Manager;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Core_Job_External_Process_Job_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Default_Periodtimeout : in Swagger.Nullable_Integer;
       Max_Periodtimeout : in Swagger.Nullable_Integer;
       Default_Periodperiod : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Core_Job_External_Process_Job_Handler;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Core_Job_Job_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Job_Periodtopics : in Swagger.UString_Vectors.Vector;
       Allow_Periodself_Periodprocess_Periodtermination : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteWorkflowCoreJobJobHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Core_Job_Job_Handler;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Core_Offloading_Workflow_Offloading_Job_Consum
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Job_Periodtopics : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Core_Offloading_Workflow_Offloading_Job_Consum;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Core_Payload_Map_Cache
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Get_System_Workflow_Models : in Swagger.UString_Vectors.Vector;
       Get_Package_Root_Path : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeGraniteWorkflowCorePayloadMapCacheInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Core_Payload_Map_Cache;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Core_Payloadmap_Payload_Move_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Payload_Periodmove_Periodwhite_Periodlist : in Swagger.UString_Vectors.Vector;
       Payload_Periodmove_Periodhandle_Periodfrom_Periodworkflow_Periodprocess : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Core_Payloadmap_Payload_Move_Listener;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Core_Workflow_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodworkflow_Periodconfig_Periodworkflow_Periodpackages_Periodroot_Periodpath : in Swagger.UString_Vectors.Vector;
       Cq_Periodworkflow_Periodconfig_Periodworkflow_Periodprocess_Periodlegacy_Periodmode : in Swagger.Nullable_Boolean;
       Cq_Periodworkflow_Periodconfig_Periodallow_Periodlocking : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComAdobeGraniteWorkflowCoreWorkflowConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Core_Workflow_Config;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Core_Workflow_Session_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Granite_Periodworkflowinbox_Periodsort_Periodproperty_Name : in Swagger.Nullable_UString;
       Granite_Periodworkflowinbox_Periodsort_Periodorder : in Swagger.Nullable_UString;
       Cq_Periodworkflow_Periodjob_Periodretry : in Swagger.Nullable_Integer;
       Cq_Periodworkflow_Periodsuperuser : in Swagger.UString_Vectors.Vector;
       Granite_Periodworkflow_Periodinbox_Query_Size : in Swagger.Nullable_Integer;
       Granite_Periodworkflow_Periodadmin_User_Group_Filter : in Swagger.Nullable_Boolean;
       Granite_Periodworkflow_Periodenforce_Workitem_Assignee_Permissions : in Swagger.Nullable_Boolean;
       Granite_Periodworkflow_Periodenforce_Workflow_Initiator_Permissions : in Swagger.Nullable_Boolean;
       Granite_Periodworkflow_Periodinject_Tenant_Id_In_Job_Topics : in Swagger.Nullable_Boolean;
       Granite_Periodworkflow_Periodmax_Purge_Save_Threshold : in Swagger.Nullable_Integer;
       Granite_Periodworkflow_Periodmax_Purge_Query_Count : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Core_Workflow_Session_Factory;

   --  
   overriding
   procedure Com_Adobe_Granite_Workflow_Purge_Scheduler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduledpurge_Periodname : in Swagger.Nullable_UString;
       Scheduledpurge_Periodworkflow_Status : in Swagger.Nullable_UString;
       Scheduledpurge_Periodmodel_Ids : in Swagger.UString_Vectors.Vector;
       Scheduledpurge_Perioddaysold : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeGraniteWorkflowPurgeSchedulerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Granite_Workflow_Purge_Scheduler;

   --  
   overriding
   procedure Com_Adobe_Octopus_Ncomm_Bootstrap
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Connections : in Swagger.Nullable_Integer;
       Max_Requests : in Swagger.Nullable_Integer;
       Request_Timeout : in Swagger.Nullable_Integer;
       Request_Retries : in Swagger.Nullable_Integer;
       Launch_Timeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComAdobeOctopusNcommBootstrapInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Octopus_Ncomm_Bootstrap;

   --  
   overriding
   procedure Com_Adobe_Social_Integrations_Livefyre_User_Pingforpull_Impl_Ping_Pull_S
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Communities_Periodintegration_Periodlivefyre_Periodsling_Periodevent_Periodfilter : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Social_Integrations_Livefyre_User_Pingforpull_Impl_Ping_Pull_S;

   --  
   overriding
   procedure Com_Adobe_Xmp_Worker_Files_Ncomm_X_M_P_Files_N_Comm
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Connections : in Swagger.Nullable_UString;
       Max_Requests : in Swagger.Nullable_UString;
       Request_Timeout : in Swagger.Nullable_UString;
       Log_Dir : in Swagger.Nullable_UString;
       Result  : out .Models.ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Adobe_Xmp_Worker_Files_Ncomm_X_M_P_Files_N_Comm;

   --  
   overriding
   procedure Com_Day_Commons_Datasource_Jdbcpool_Jdbc_Pool_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Jdbc_Perioddriver_Periodclass : in Swagger.Nullable_UString;
       Jdbc_Periodconnection_Perioduri : in Swagger.Nullable_UString;
       Jdbc_Periodusername : in Swagger.Nullable_UString;
       Jdbc_Periodpassword : in Swagger.Nullable_UString;
       Jdbc_Periodvalidation_Periodquery : in Swagger.Nullable_UString;
       Default_Periodreadonly : in Swagger.Nullable_Boolean;
       Default_Periodautocommit : in Swagger.Nullable_Boolean;
       Pool_Periodsize : in Swagger.Nullable_Integer;
       Pool_Periodmax_Periodwait_Periodmsec : in Swagger.Nullable_Integer;
       Datasource_Periodname : in Swagger.Nullable_UString;
       Datasource_Periodsvc_Periodproperties : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Commons_Datasource_Jdbcpool_Jdbc_Pool_Service;

   --  
   overriding
   procedure Com_Day_Commons_Httpclient
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Proxy_Periodenabled : in Swagger.Nullable_Boolean;
       Proxy_Periodhost : in Swagger.Nullable_UString;
       Proxy_Perioduser : in Swagger.Nullable_UString;
       Proxy_Periodpassword : in Swagger.Nullable_UString;
       Proxy_Periodntlm_Periodhost : in Swagger.Nullable_UString;
       Proxy_Periodntlm_Perioddomain : in Swagger.Nullable_UString;
       Proxy_Periodexceptions : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCommonsHttpclientInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Commons_Httpclient;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Impl_Store_Properties_Change_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodstore_Periodlistener_Periodadditional_Store_Paths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Impl_Store_Properties_Change_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Sitecatalyst_Impl_Exporter_Classifications_Exporte
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Allowed_Periodpaths : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodsaint_Periodexporter_Periodpagesize : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Sitecatalyst_Impl_Exporter_Classifications_Exporte;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Sitecatalyst_Impl_Importer_Report_Importer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Report_Periodfetch_Periodattempts : in Swagger.Nullable_Integer;
       Report_Periodfetch_Perioddelay : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Sitecatalyst_Impl_Importer_Report_Importer;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Sitecatalyst_Impl_Sitecatalyst_Adapter_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodadapterfactory_Periodcontextstores : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Sitecatalyst_Impl_Sitecatalyst_Adapter_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Sitecatalyst_Impl_Sitecatalyst_Http_Client_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodsitecatalyst_Periodservice_Perioddatacenter_Periodurl : in Swagger.UString_Vectors.Vector;
       Devhostnamepatterns : in Swagger.UString_Vectors.Vector;
       Connection_Periodtimeout : in Swagger.Nullable_Integer;
       Socket_Periodtimeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Sitecatalyst_Impl_Sitecatalyst_Http_Client_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Testandtarget_Impl_Account_Options_Updater
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodtestandtarget_Periodaccountoptionsupdater_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Testandtarget_Impl_Account_Options_Updater;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Testandtarget_Impl_Delete_Author_Activity_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodtestandtarget_Perioddeleteauthoractivitylistener_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Testandtarget_Impl_Delete_Author_Activity_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Testandtarget_Impl_Push_Author_Campaign_Page_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodtestandtarget_Periodpushauthorcampaignpagelistener_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Testandtarget_Impl_Push_Author_Campaign_Page_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Testandtarget_Impl_Segment_Importer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodtestandtarget_Periodsegmentimporter_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Testandtarget_Impl_Segment_Importer;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Testandtarget_Impl_Service_Web_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Endpoint_Uri : in Swagger.Nullable_UString;
       Connection_Timeout : in Swagger.Nullable_Integer;
       Socket_Timeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Testandtarget_Impl_Service_Web_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Testandtarget_Impl_Servlets_Admin_Server_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Testandtarget_Periodendpoint_Periodurl : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Testandtarget_Impl_Servlets_Admin_Server_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Analytics_Testandtarget_Impl_Testandtarget_Http_Client_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodanalytics_Periodtestandtarget_Periodapi_Periodurl : in Swagger.Nullable_UString;
       Cq_Periodanalytics_Periodtestandtarget_Periodtimeout : in Swagger.Nullable_Integer;
       Cq_Periodanalytics_Periodtestandtarget_Periodsockettimeout : in Swagger.Nullable_Integer;
       Cq_Periodanalytics_Periodtestandtarget_Periodrecommendations_Periodurl_Periodreplace : in Swagger.Nullable_UString;
       Cq_Periodanalytics_Periodtestandtarget_Periodrecommendations_Periodurl_Periodreplacewith : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Analytics_Testandtarget_Impl_Testandtarget_Http_Client_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Auth_Impl_Cug_Cug_Support_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cug_Periodexempted_Periodprincipals : in Swagger.UString_Vectors.Vector;
       Cug_Periodenabled : in Swagger.Nullable_Boolean;
       Cug_Periodprincipals_Periodregex : in Swagger.Nullable_UString;
       Cug_Periodprincipals_Periodreplacement : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqAuthImplCugCugSupportImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Auth_Impl_Cug_Cug_Support_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Auth_Impl_Login_Selector_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Auth_Periodloginselector_Periodmappings : in Swagger.UString_Vectors.Vector;
       Auth_Periodloginselector_Periodchangepw_Periodmappings : in Swagger.UString_Vectors.Vector;
       Auth_Periodloginselector_Perioddefaultloginpage : in Swagger.Nullable_UString;
       Auth_Periodloginselector_Perioddefaultchangepwpage : in Swagger.Nullable_UString;
       Auth_Periodloginselector_Periodhandle : in Swagger.UString_Vectors.Vector;
       Auth_Periodloginselector_Periodhandle_Periodall_Periodextensions : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqAuthImplLoginSelectorHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Auth_Impl_Login_Selector_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Commons_Impl_Externalizer_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Externalizer_Perioddomains : in Swagger.UString_Vectors.Vector;
       Externalizer_Periodhost : in Swagger.Nullable_UString;
       Externalizer_Periodcontextpath : in Swagger.Nullable_UString;
       Externalizer_Periodencodedpath : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqCommonsImplExternalizerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Commons_Impl_Externalizer_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Commons_Servlets_Root_Mapping_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Rootmapping_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqCommonsServletsRootMappingServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Commons_Servlets_Root_Mapping_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Compat_Codeupgrade_Impl_Code_Upgrade_Execution_Condition_Checke
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Codeupgradetasks : in Swagger.UString_Vectors.Vector;
       Codeupgradetaskfilters : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Compat_Codeupgrade_Impl_Code_Upgrade_Execution_Condition_Checke;

   --  
   overriding
   procedure Com_Day_Cq_Compat_Codeupgrade_Impl_Upgrade_Task_Ignore_List
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Upgrade_Task_Ignore_List : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Compat_Codeupgrade_Impl_Upgrade_Task_Ignore_List;

   --  
   overriding
   procedure Com_Day_Cq_Compat_Codeupgrade_Impl_Version_Range_Task_Ignorelist
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Effective_Bundle_List_Path : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Compat_Codeupgrade_Impl_Version_Range_Task_Ignorelist;

   --  
   overriding
   procedure Com_Day_Cq_Contentsync_Impl_Content_Sync_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Contentsync_Periodfallback_Periodauthorizable : in Swagger.Nullable_UString;
       Contentsync_Periodfallback_Periodupdateuser : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqContentsyncImplContentSyncManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Contentsync_Impl_Content_Sync_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Commons_Handler_Standard_Image_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Large_File_Threshold : in Swagger.Nullable_Integer;
       Large_Comment_Threshold : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodenable_Periodext_Periodmeta_Periodextraction : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCommonsHandlerStandardImageHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Commons_Handler_Standard_Image_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Commons_Metadata_Xmp_Filter_Black_White
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Xmp_Periodfilter_Periodapply_Whitelist : in Swagger.Nullable_Boolean;
       Xmp_Periodfilter_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Xmp_Periodfilter_Periodapply_Blacklist : in Swagger.Nullable_Boolean;
       Xmp_Periodfilter_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Commons_Metadata_Xmp_Filter_Black_White;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Commons_Util_Impl_Asset_Cache_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Large_Periodfile_Periodmin : in Swagger.Nullable_Integer;
       Cache_Periodapply : in Swagger.Nullable_Boolean;
       Mime_Periodtypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCommonsUtilImplAssetCacheImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Commons_Util_Impl_Asset_Cache_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Annotation_Pdf_Annotation_Pdf_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Perioddocument_Periodwidth : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Perioddocument_Periodheight : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Perioddocument_Periodpadding_Periodhorizontal : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Perioddocument_Periodpadding_Periodvertical : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodfont_Periodsize : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodfont_Periodcolor : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodfont_Periodfamily : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodfont_Periodlight : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodmargin_Text_Image : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodmin_Image_Height : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodreview_Status_Periodwidth : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodreview_Status_Periodcolor_Periodapproved : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodreview_Status_Periodcolor_Periodrejected : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodreview_Status_Periodcolor_Periodchanges_Requested : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodannotation_Marker_Periodwidth : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodannotation_Periodpdf_Periodasset_Periodminheight : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Annotation_Pdf_Annotation_Pdf_Config;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Asset_Move_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplAssetMoveListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Asset_Move_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Assethome_Asset_Home_Page_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Is_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Assethome_Asset_Home_Page_Configuration;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Assetlinkshare_Adhoc_Asset_Share_Proxy_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodadhoc_Periodasset_Periodshare_Periodprezip_Periodmaxcontentsize : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Assetlinkshare_Adhoc_Asset_Share_Proxy_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Cache_C_Q_Buffered_Image_Cache
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodimage_Periodcache_Periodmax_Periodmemory : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodimage_Periodcache_Periodmax_Periodage : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodimage_Periodcache_Periodmax_Perioddimension : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Cache_C_Q_Buffered_Image_Cache;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Dam_Change_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Changeeventlistener_Periodobserved_Periodpaths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCoreImplDamChangeEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Dam_Change_Event_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Dam_Event_Purge_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Max_Saved_Activities : in Swagger.Nullable_Integer;
       Save_Interval : in Swagger.Nullable_Integer;
       Enable_Activity_Purge : in Swagger.Nullable_Boolean;
       Event_Types : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplDamEventPurgeServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Dam_Event_Purge_Service;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Dam_Event_Recorder_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Event_Periodqueue_Periodlength : in Swagger.Nullable_Integer;
       Eventrecorder_Periodenabled : in Swagger.Nullable_Boolean;
       Eventrecorder_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Eventrecorder_Periodeventtypes : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplDamEventRecorderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Dam_Event_Recorder_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Event_Dam_Event_Audit_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplEventDamEventAuditListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Event_Dam_Event_Audit_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Expiry_Notification_Job_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodexpiry_Periodnotification_Periodscheduler_Periodistimebased : in Swagger.Nullable_Boolean;
       Cq_Perioddam_Periodexpiry_Periodnotification_Periodscheduler_Periodtimebased_Periodrule : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodexpiry_Periodnotification_Periodscheduler_Periodperiod_Periodrule : in Swagger.Nullable_Integer;
       Send_Email : in Swagger.Nullable_Boolean;
       Asset_Expired_Limit : in Swagger.Nullable_Integer;
       Prior_Notification_Seconds : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodexpiry_Periodnotification_Periodurl_Periodprotocol : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplExpiryNotificationJobImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Expiry_Notification_Job_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Foldermetadataschema_Folder_Metadata_Schema_Feat
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Is_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Foldermetadataschema_Folder_Metadata_Schema_Feat;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Gfx_Commons_Gfx_Renderer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Skip_Periodbufferedcache : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplGfxCommonsGfxRendererInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Gfx_Commons_Gfx_Renderer;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Handler_E_P_S_Format_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mimetype : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Handler_E_P_S_Format_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Handler_Indesign_Format_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mimetype : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Handler_Indesign_Format_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Handler_Jpeg_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodenable_Periodext_Periodmeta_Periodextraction : in Swagger.Nullable_Boolean;
       Large_File_Threshold : in Swagger.Nullable_Integer;
       Large_Comment_Threshold : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplHandlerJpegHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Handler_Jpeg_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Handler_Xmp_N_Comm_X_M_P_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Xmphandler_Periodcq_Periodformats : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Handler_Xmp_N_Comm_X_M_P_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Jmx_Asset_Index_Update_Monitor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Jmx_Periodobjectname : in Swagger.Nullable_UString;
       Property_Periodmeasure_Periodenabled : in Swagger.Nullable_Boolean;
       Property_Periodname : in Swagger.Nullable_UString;
       Property_Periodmax_Periodwait_Periodms : in Swagger.Nullable_Integer;
       Property_Periodmax_Periodrate : in Swagger.Number;
       Fulltext_Periodmeasure_Periodenabled : in Swagger.Nullable_Boolean;
       Fulltext_Periodname : in Swagger.Nullable_UString;
       Fulltext_Periodmax_Periodwait_Periodms : in Swagger.Nullable_Integer;
       Fulltext_Periodmax_Periodrate : in Swagger.Number;
       Result  : out .Models.ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Jmx_Asset_Index_Update_Monitor;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Jmx_Asset_Migration_M_Bean_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Jmx_Periodobjectname : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Jmx_Asset_Migration_M_Bean_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Jmx_Asset_Update_Monitor_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Jmx_Periodobjectname : in Swagger.Nullable_UString;
       Active : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Jmx_Asset_Update_Monitor_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Jobs_Metadataexport_Async_Metadata_Export_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Operation : in Swagger.Nullable_UString;
       Email_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Jobs_Metadataexport_Async_Metadata_Export_Config;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Jobs_Metadataimport_Async_Metadata_Import_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Operation : in Swagger.Nullable_UString;
       Operation_Icon : in Swagger.Nullable_UString;
       Topic_Name : in Swagger.Nullable_UString;
       Email_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Jobs_Metadataimport_Async_Metadata_Import_Config;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Lightbox_Lightbox_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodpaths : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodmethods : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodenable_Periodanonymous : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplLightboxLightboxServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Lightbox_Lightbox_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Metadata_Editor_Select_Component_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Granite_Data : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Metadata_Editor_Select_Component_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Mime_Type_Asset_Upload_Restriction_Helper
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodallow_Periodall_Periodmime : in Swagger.Nullable_Boolean;
       Cq_Perioddam_Periodallowed_Periodasset_Periodmimes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Mime_Type_Asset_Upload_Restriction_Helper;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Mime_Type_Dam_Mime_Type_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Perioddetect_Periodasset_Periodmime_Periodfrom_Periodcontent : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Mime_Type_Dam_Mime_Type_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Missing_Metadata_Notification_Job
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodmissingmetadata_Periodnotification_Periodscheduler_Periodistimebased : in Swagger.Nullable_Boolean;
       Cq_Perioddam_Periodmissingmetadata_Periodnotification_Periodscheduler_Periodtimebased_Periodrule : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodmissingmetadata_Periodnotification_Periodscheduler_Periodperiod_Periodrule : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodmissingmetadata_Periodnotification_Periodrecipient : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplMissingMetadataNotificationJobInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Missing_Metadata_Notification_Job;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Process_Send_Transient_Workflow_Completed_Email_Pr
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Process_Periodlabel : in Swagger.Nullable_UString;
       Notify on _Complete : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Process_Send_Transient_Workflow_Completed_Email_Pr;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Process_Text_Extraction_Process
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mime_Types : in Swagger.UString_Vectors.Vector;
       Max_Extract : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplProcessTextExtractionProcessInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Process_Text_Extraction_Process;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Rendition_Maker_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Xmp_Periodpropagate : in Swagger.Nullable_Boolean;
       Xmp_Periodexcludes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCoreImplRenditionMakerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Rendition_Maker_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Reports_Report_Export_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Query_Batch_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplReportsReportExportServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Reports_Report_Export_Service;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Reports_Report_Purge_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Max_Saved_Reports : in Swagger.Nullable_Integer;
       Time_Duration : in Swagger.Nullable_Integer;
       Enable_Report_Purge : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplReportsReportPurgeServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Reports_Report_Purge_Service;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Asset_Download_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplServletAssetDownloadServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Asset_Download_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Asset_Status_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodstatus_Periodmaxassets : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplServletAssetStatusServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Asset_Status_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Asset_X_M_P_Search_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodindesign_Periodmaxassets : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplServletAssetXMPSearchServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Asset_X_M_P_Search_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Batch_Metadata_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodmetadata_Periodasset_Perioddefault : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodmetadata_Periodcollection_Perioddefault : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodmetadata_Periodmaxresources : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplServletBatchMetadataServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Batch_Metadata_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Binary_Provider_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodresource_Types : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodmethods : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Perioddrm_Periodenable : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplServletBinaryProviderServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Binary_Provider_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Collection_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodcollection_Periodproperties : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodcollection_Periodmaxcollections : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplServletCollectionServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Collection_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Collections_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodcollections_Periodproperties : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodbatch_Periodcollections_Periodlimit : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamCoreImplServletCollectionsServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Collections_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Companion_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       More _Info : in Swagger.Nullable_UString;
       Slashmnt_Slashoverlay_Slashdam_Slashgui_Slashcontent_Slashassets_Slashmoreinfo_Periodhtml_Slash_Dollar_Left_Curly_Bracketpath_Right_Curly_Bracket : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplServletCompanionServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Companion_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Create_Asset_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Detect_Duplicate : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplServletCreateAssetServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Create_Asset_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Dam_Content_Disposition_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodmime_Periodtype_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodempty_Periodmime : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplServletDamContentDispositionFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Dam_Content_Disposition_Filter;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Guid_Lookup_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodcore_Periodguidlookupfilter_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplServletGuidLookupFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Guid_Lookup_Filter;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Health_Check_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodsync_Periodworkflow_Periodid : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodsync_Periodfolder_Periodtypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCoreImplServletHealthCheckServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Health_Check_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Metadata_Get_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodresource_Types : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodmethods : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodextensions : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodselectors : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplServletMetadataGetServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Metadata_Get_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Multiple_License_Accept_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Perioddrm_Periodenable : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Multiple_License_Accept_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Servlet_Resource_Collection_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodresource_Types : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodmethods : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodselectors : in Swagger.Nullable_UString;
       Download_Periodconfig : in Swagger.Nullable_UString;
       View_Periodselector : in Swagger.Nullable_UString;
       Send_Email : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreImplServletResourceCollectionServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Servlet_Resource_Collection_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Ui_Preview_Folder_Preview_Updater_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Create_Preview_Enabled : in Swagger.Nullable_Boolean;
       Update_Preview_Enabled : in Swagger.Nullable_Boolean;
       Queue_Size : in Swagger.Nullable_Integer;
       Folder_Preview_Rendition_Regex : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Ui_Preview_Folder_Preview_Updater_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Impl_Unzip_Unzip_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodconfig_Periodunzip_Periodmaxuncompressedsize : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodconfig_Periodunzip_Periodencoding : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamCoreImplUnzipUnzipConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Impl_Unzip_Unzip_Config;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Process_Exif_Tool_Extract_Metadata_Process
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Process_Periodlabel : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodenable_Periodsha1 : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Process_Exif_Tool_Extract_Metadata_Process;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Process_Extract_Metadata_Process
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Process_Periodlabel : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodenable_Periodsha1 : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamCoreProcessExtractMetadataProcessInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Process_Extract_Metadata_Process;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Core_Process_Metadata_Processor_Process
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Process_Periodlabel : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodenable_Periodsha1 : in Swagger.Nullable_Boolean;
       Cq_Perioddam_Periodmetadata_Periodxssprotected_Periodproperties : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamCoreProcessMetadataProcessorProcessInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Core_Process_Metadata_Processor_Process;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Handler_Ffmpeg_Locator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Executable_Periodsearchpath : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamHandlerFfmpegLocatorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Handler_Ffmpeg_Locator_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Handler_Gibson_Fontmanager_Impl_Font_Manager_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Fontmgr_Periodsystem_Periodfont_Perioddir : in Swagger.UString_Vectors.Vector;
       Fontmgr_Periodadobe_Periodfont_Perioddir : in Swagger.Nullable_UString;
       Fontmgr_Periodcustomer_Periodfont_Perioddir : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Handler_Gibson_Fontmanager_Impl_Font_Manager_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Handler_Standard_Pdf_Pdf_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Raster_Periodannotation : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamHandlerStandardPdfPdfHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Handler_Standard_Pdf_Pdf_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Handler_Standard_Ps_Post_Script_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Raster_Periodannotation : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamHandlerStandardPsPostScriptHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Handler_Standard_Ps_Post_Script_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Handler_Standard_Psd_Psd_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Large_File_Threshold : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamHandlerStandardPsdPsdHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Handler_Standard_Psd_Psd_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Ids_Impl_I_D_S_Job_Processor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enable_Periodmultisession : in Swagger.Nullable_Boolean;
       Ids_Periodcc_Periodenable : in Swagger.Nullable_Boolean;
       Enable_Periodretry : in Swagger.Nullable_Boolean;
       Enable_Periodretry_Periodscripterror : in Swagger.Nullable_Boolean;
       Externalizer_Perioddomain_Periodcqhost : in Swagger.Nullable_UString;
       Externalizer_Perioddomain_Periodhttp : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamIdsImplIDSJobProcessorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Ids_Impl_I_D_S_Job_Processor;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Ids_Impl_I_D_S_Pool_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Perioderrors_Periodto_Periodblacklist : in Swagger.Nullable_Integer;
       Retry_Periodinterval_Periodto_Periodwhitelist : in Swagger.Nullable_Integer;
       Connect_Periodtimeout : in Swagger.Nullable_Integer;
       Socket_Periodtimeout : in Swagger.Nullable_Integer;
       Process_Periodlabel : in Swagger.Nullable_UString;
       Connection_Perioduse_Periodmax : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamIdsImplIDSPoolManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Ids_Impl_I_D_S_Pool_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Indd_Impl_Handler_Indesign_X_M_P_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Process_Periodlabel : in Swagger.Nullable_UString;
       Extract_Periodpages : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Indd_Impl_Handler_Indesign_X_M_P_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Indd_Impl_Servlet_Snippet_Creation_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Snippetcreation_Periodmaxcollections : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamInddImplServletSnippetCreationServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Indd_Impl_Servlet_Snippet_Creation_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Indd_Process_I_N_D_D_Media_Extract_Process
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Process_Periodlabel : in Swagger.Nullable_UString;
       Cq_Perioddam_Periodindd_Periodpages_Periodregex : in Swagger.Nullable_UString;
       Ids_Periodjob_Perioddecoupled : in Swagger.Nullable_Boolean;
       Ids_Periodjob_Periodworkflow_Periodmodel : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamInddProcessINDDMediaExtractProcessInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Indd_Process_I_N_D_D_Media_Extract_Process;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Performance_Internal_Asset_Performance_Data_Handler_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Batch_Periodcommit_Periodsize : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Performance_Internal_Asset_Performance_Data_Handler_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Performance_Internal_Asset_Performance_Report_Sync_Job
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Performance_Internal_Asset_Performance_Report_Sync_Job;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Pim_Impl_Sourcing_Upload_Process_Product_Assets_Upload_Pro
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Delete_Periodzip_Periodfile : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Pim_Impl_Sourcing_Upload_Process_Product_Assets_Upload_Pro;

   --  
   overriding
   procedure Com_Day_Cq_Dam_S7dam_Common_Analytics_Impl_S7dam_Dynamic_Media_Config_Even
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periods7dam_Perioddynamicmediaconfigeventlistener_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_S7dam_Common_Analytics_Impl_S7dam_Dynamic_Media_Config_Even;

   --  
   overriding
   procedure Com_Day_Cq_Dam_S7dam_Common_Analytics_Impl_Site_Catalyst_Report_Runner
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Scheduler_Periodconcurrent : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_S7dam_Common_Analytics_Impl_Site_Catalyst_Report_Runner;

   --  
   overriding
   procedure Com_Day_Cq_Dam_S7dam_Common_Post_Servlets_Set_Create_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodpost_Periodoperation : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodmethods : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_S7dam_Common_Post_Servlets_Set_Create_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_S7dam_Common_Post_Servlets_Set_Modify_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodpost_Periodoperation : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodmethods : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_S7dam_Common_Post_Servlets_Set_Modify_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Dam_S7dam_Common_Process_Video_Thumbnail_Download_Process
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Process_Periodlabel : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_S7dam_Common_Process_Video_Thumbnail_Download_Process;

   --  
   overriding
   procedure Com_Day_Cq_Dam_S7dam_Common_S7dam_Dam_Change_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periods7dam_Perioddamchangeeventlistener_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_S7dam_Common_S7dam_Dam_Change_Event_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Dam_S7dam_Common_Servlets_S7dam_Product_Info_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodpaths : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodmethods : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_S7dam_Common_Servlets_S7dam_Product_Info_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Dam_S7dam_Common_Video_Impl_Video_Proxy_Client_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periods7dam_Periodvideoproxyclientservice_Periodmultipartupload_Periodminsize_Periodname : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periods7dam_Periodvideoproxyclientservice_Periodmultipartupload_Periodpartsize_Periodname : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periods7dam_Periodvideoproxyclientservice_Periodmultipartupload_Periodnumthread_Periodname : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periods7dam_Periodvideoproxyclientservice_Periodhttp_Periodreadtimeout_Periodname : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periods7dam_Periodvideoproxyclientservice_Periodhttp_Periodconnectiontimeout_Periodname : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periods7dam_Periodvideoproxyclientservice_Periodhttp_Periodmaxretrycount_Periodname : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periods7dam_Periodvideoproxyclientservice_Perioduploadprogress_Periodinterval_Periodname : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_S7dam_Common_Video_Impl_Video_Proxy_Client_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Scene7_Impl_Scene7_A_P_I_Client_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodscene7_Periodapiclient_Periodrecordsperpage_Periodnofilter_Periodname : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodscene7_Periodapiclient_Periodrecordsperpage_Periodwithfilter_Periodname : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamScene7ImplScene7APIClientImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Scene7_Impl_Scene7_A_P_I_Client_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Scene7_Impl_Scene7_Asset_Mime_Type_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodscene7_Periodassetmimetypeservice_Periodmapping : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Scene7_Impl_Scene7_Asset_Mime_Type_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Scene7_Impl_Scene7_Configuration_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodscene7_Periodconfigurationeventlistener_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Scene7_Impl_Scene7_Configuration_Event_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Scene7_Impl_Scene7_Dam_Change_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodscene7_Perioddamchangeeventlistener_Periodenabled : in Swagger.Nullable_Boolean;
       Cq_Perioddam_Periodscene7_Perioddamchangeeventlistener_Periodobserved_Periodpaths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Scene7_Impl_Scene7_Dam_Change_Event_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Scene7_Impl_Scene7_Flash_Templates_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scene7_Flash_Templates_Periodrti : in Swagger.Nullable_UString;
       Scene7_Flash_Templates_Periodrsi : in Swagger.Nullable_UString;
       Scene7_Flash_Templates_Periodrb : in Swagger.Nullable_UString;
       Scene7_Flash_Templates_Periodrurl : in Swagger.Nullable_UString;
       Scene7_Flash_Template_Periodurl_Format_Parameter : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Scene7_Impl_Scene7_Flash_Templates_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Scene7_Impl_Scene7_Upload_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Perioddam_Periodscene7_Perioduploadservice_Periodactivejobtimeout_Periodlabel : in Swagger.Nullable_Integer;
       Cq_Perioddam_Periodscene7_Perioduploadservice_Periodconnectionmaxperroute_Periodlabel : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamScene7ImplScene7UploadServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Scene7_Impl_Scene7_Upload_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Stock_Integration_Impl_Cache_Stock_Cache_Configuration_Ser
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Get_Cache_Expiration_Unit : in Swagger.Nullable_UString;
       Get_Cache_Expiration_Value : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Stock_Integration_Impl_Cache_Stock_Cache_Configuration_Ser;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Stock_Integration_Impl_Configuration_Stock_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Locale : in Swagger.Nullable_UString;
       Ims_Config : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Stock_Integration_Impl_Configuration_Stock_Configuration;

   --  
   overriding
   procedure Com_Day_Cq_Dam_Video_Impl_Servlet_Video_Test_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqDamVideoImplServletVideoTestServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Dam_Video_Impl_Servlet_Video_Test_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Extwidget_Servlets_Image_Sprite_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Width : in Swagger.Nullable_Integer;
       Max_Height : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqExtwidgetServletsImageSpriteServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Extwidget_Servlets_Image_Sprite_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Image_Internal_Font_Font_Helper
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Fontpath : in Swagger.UString_Vectors.Vector;
       Oversampling_Factor : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqImageInternalFontFontHelperInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Image_Internal_Font_Font_Helper;

   --  
   overriding
   procedure Com_Day_Cq_Jcrclustersupport_Cluster_Start_Level_Controller
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cluster_Periodlevel_Periodenable : in Swagger.Nullable_Boolean;
       Cluster_Periodmaster_Periodlevel : in Swagger.Nullable_Integer;
       Cluster_Periodslave_Periodlevel : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqJcrclustersupportClusterStartLevelControllerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Jcrclustersupport_Cluster_Start_Level_Controller;

   --  
   overriding
   procedure Com_Day_Cq_Mailer_Default_Mail_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Smtp_Periodhost : in Swagger.Nullable_UString;
       Smtp_Periodport : in Swagger.Nullable_Integer;
       Smtp_Perioduser : in Swagger.Nullable_UString;
       Smtp_Periodpassword : in Swagger.Nullable_UString;
       From_Periodaddress : in Swagger.Nullable_UString;
       Smtp_Periodssl : in Swagger.Nullable_Boolean;
       Smtp_Periodstarttls : in Swagger.Nullable_Boolean;
       Debug_Periodemail : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqMailerDefaultMailServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mailer_Default_Mail_Service;

   --  
   overriding
   procedure Com_Day_Cq_Mailer_Impl_Cq_Mailing_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Periodrecipient_Periodcount : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMailerImplCqMailingServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mailer_Impl_Cq_Mailing_Service;

   --  
   overriding
   procedure Com_Day_Cq_Mailer_Impl_Email_Cq_Email_Template_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mailer_Periodemail_Periodcharset : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mailer_Impl_Email_Cq_Email_Template_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Mailer_Impl_Email_Cq_Retriever_Template_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mailer_Periodemail_Periodembed : in Swagger.Nullable_Boolean;
       Mailer_Periodemail_Periodcharset : in Swagger.Nullable_UString;
       Mailer_Periodemail_Periodretriever_User_I_D : in Swagger.Nullable_UString;
       Mailer_Periodemail_Periodretriever_User_P_W_D : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mailer_Impl_Email_Cq_Retriever_Template_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Campaign_Impl_Integration_Config_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Aem_Periodmcm_Periodcampaign_Periodform_Constraints : in Swagger.UString_Vectors.Vector;
       Aem_Periodmcm_Periodcampaign_Periodpublic_Url : in Swagger.Nullable_UString;
       Aem_Periodmcm_Periodcampaign_Periodrelaxed_S_S_L : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqMcmCampaignImplIntegrationConfigImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Campaign_Impl_Integration_Config_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Campaign_Importer_Personalized_Text_Handler_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Campaign_Importer_Personalized_Text_Handler_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Core_Newsletter_Newsletter_Email_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       From_Periodaddress : in Swagger.Nullable_UString;
       Sender_Periodhost : in Swagger.Nullable_UString;
       Max_Periodbounce_Periodcount : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Core_Newsletter_Newsletter_Email_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Impl_M_C_M_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Experience_Periodindirection : in Swagger.UString_Vectors.Vector;
       Touchpoint_Periodindirection : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqMcmImplMCMConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Impl_M_C_M_Configuration;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Cta_Click_Through_Componen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Component_Periodresource_Type : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Cta_Click_Through_Componen;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Cta_Graphical_Click_Throug
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Component_Periodresource_Type : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Cta_Graphical_Click_Throug;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Cta_Lead_Form_C_T_A_Component
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Cta_Lead_Form_C_T_A_Component;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Mbox_M_Box_Experience_Tag_Ha
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Mbox_M_Box_Experience_Tag_Ha;

   --  
   overriding
   procedure Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Mbox_Target_Component_Tag_H
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Component_Periodresource_Type : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Mcm_Landingpage_Parser_Taghandlers_Mbox_Target_Component_Tag_H;

   --  
   overriding
   procedure Com_Day_Cq_Notification_Impl_Notification_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqNotificationImplNotificationServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Notification_Impl_Notification_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Personalization_Impl_Servlets_Targeting_Configuration_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Forcelocation : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Personalization_Impl_Servlets_Targeting_Configuration_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Polling_Importer_Impl_Managed_Poll_Config_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Id : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Reference : in Swagger.Nullable_Boolean;
       Interval : in Swagger.Nullable_Integer;
       Expression : in Swagger.Nullable_UString;
       Source : in Swagger.Nullable_UString;
       Target : in Swagger.Nullable_UString;
       Login : in Swagger.Nullable_UString;
       Password : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqPollingImporterImplManagedPollConfigImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Polling_Importer_Impl_Managed_Poll_Config_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Polling_Importer_Impl_Managed_Polling_Importer_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Importer_Perioduser : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqPollingImporterImplManagedPollingImporterImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Polling_Importer_Impl_Managed_Polling_Importer_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Polling_Importer_Impl_Polling_Importer_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Importer_Periodmin_Periodinterval : in Swagger.Nullable_Integer;
       Importer_Perioduser : in Swagger.Nullable_UString;
       Exclude_Periodpaths : in Swagger.UString_Vectors.Vector;
       Include_Periodpaths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqPollingImporterImplPollingImporterImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Polling_Importer_Impl_Polling_Importer_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Audit_Replication_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqReplicationAuditReplicationEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Audit_Replication_Event_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Content_Static_Content_Builder
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Host : in Swagger.Nullable_UString;
       Port : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqReplicationContentStaticContentBuilderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Content_Static_Content_Builder;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Agent_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Job_Periodtopics : in Swagger.Nullable_UString;
       Service_User_Periodtarget : in Swagger.Nullable_UString;
       Agent_Provider_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqReplicationImplAgentManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Agent_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Content_Durbo_Binary_Less_Content_Builder
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Binary_Periodthreshold : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Content_Durbo_Binary_Less_Content_Builder;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Content_Durbo_Durbo_Import_Configuration_Prov
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Preserve_Periodhierarchy_Periodnodes : in Swagger.Nullable_Boolean;
       Ignore_Periodversioning : in Swagger.Nullable_Boolean;
       Import_Periodacl : in Swagger.Nullable_Boolean;
       Save_Periodthreshold : in Swagger.Nullable_Integer;
       Preserve_Perioduser_Periodpaths : in Swagger.Nullable_Boolean;
       Preserve_Perioduuid : in Swagger.Nullable_Boolean;
       Preserve_Perioduuid_Periodnodetypes : in Swagger.UString_Vectors.Vector;
       Preserve_Perioduuid_Periodsubtrees : in Swagger.UString_Vectors.Vector;
       Auto_Periodcommit : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Content_Durbo_Durbo_Import_Configuration_Prov;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Replication_Content_Factory_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Replication_Periodcontent_Perioduse_File_Storage : in Swagger.Nullable_Boolean;
       Replication_Periodcontent_Periodmax_Commit_Attempts : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Replication_Content_Factory_Provider_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Replication_Receiver_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Receiver_Periodtmpfile_Periodthreshold : in Swagger.Nullable_Integer;
       Receiver_Periodpackages_Perioduse_Periodinstall : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqReplicationImplReplicationReceiverImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Replication_Receiver_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Replicator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Distribute_Events : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqReplicationImplReplicatorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Replicator_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Reverse_Replicator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodperiod : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqReplicationImplReverseReplicatorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Reverse_Replicator;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Transport_Binary_Less_Transport_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Disabled_Periodcipher_Periodsuites : in Swagger.UString_Vectors.Vector;
       Enabled_Periodcipher_Periodsuites : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Transport_Binary_Less_Transport_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Replication_Impl_Transport_Http
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Disabled_Periodcipher_Periodsuites : in Swagger.UString_Vectors.Vector;
       Enabled_Periodcipher_Periodsuites : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqReplicationImplTransportHttpInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Replication_Impl_Transport_Http;

   --  
   overriding
   procedure Com_Day_Cq_Reporting_Impl_Cache_Cache_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Repcache_Periodenable : in Swagger.Nullable_Boolean;
       Repcache_Periodttl : in Swagger.Nullable_Integer;
       Repcache_Periodmax : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqReportingImplCacheCacheImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Reporting_Impl_Cache_Cache_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Reporting_Impl_Config_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Repconf_Periodtimezone : in Swagger.Nullable_UString;
       Repconf_Periodlocale : in Swagger.Nullable_UString;
       Repconf_Periodsnapshots : in Swagger.Nullable_UString;
       Repconf_Periodrepdir : in Swagger.Nullable_UString;
       Repconf_Periodhourofday : in Swagger.Nullable_Integer;
       Repconf_Periodminofhour : in Swagger.Nullable_Integer;
       Repconf_Periodmaxrows : in Swagger.Nullable_Integer;
       Repconf_Periodfakedata : in Swagger.Nullable_Boolean;
       Repconf_Periodsnapshotuser : in Swagger.Nullable_UString;
       Repconf_Periodenforcesnapshotuser : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqReportingImplConfigServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Reporting_Impl_Config_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Reporting_Impl_R_Log_Analyzer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Request_Periodlog_Periodoutput : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqReportingImplRLogAnalyzerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Reporting_Impl_R_Log_Analyzer;

   --  
   overriding
   procedure Com_Day_Cq_Rewriter_Linkchecker_Impl_Link_Checker_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodperiod : in Swagger.Nullable_Integer;
       Scheduler_Periodconcurrent : in Swagger.Nullable_Boolean;
       Service_Periodbad_Link_Tolerance_Interval : in Swagger.Nullable_Integer;
       Service_Periodcheck_Override_Patterns : in Swagger.UString_Vectors.Vector;
       Service_Periodcache_Broken_Internal_Links : in Swagger.Nullable_Boolean;
       Service_Periodspecial_Link_Prefix : in Swagger.UString_Vectors.Vector;
       Service_Periodspecial_Link_Patterns : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Rewriter_Linkchecker_Impl_Link_Checker_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Rewriter_Linkchecker_Impl_Link_Checker_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodperiod : in Swagger.Nullable_Integer;
       Scheduler_Periodconcurrent : in Swagger.Nullable_Boolean;
       Good_Link_Test_Interval : in Swagger.Nullable_Integer;
       Bad_Link_Test_Interval : in Swagger.Nullable_Integer;
       Link_Unused_Interval : in Swagger.Nullable_Integer;
       Connection_Periodtimeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Rewriter_Linkchecker_Impl_Link_Checker_Task;

   --  
   overriding
   procedure Com_Day_Cq_Rewriter_Linkchecker_Impl_Link_Checker_Transformer_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Linkcheckertransformer_Perioddisable_Rewriting : in Swagger.Nullable_Boolean;
       Linkcheckertransformer_Perioddisable_Checking : in Swagger.Nullable_Boolean;
       Linkcheckertransformer_Periodmap_Cache_Size : in Swagger.Nullable_Integer;
       Linkcheckertransformer_Periodstrict_Extension_Check : in Swagger.Nullable_Boolean;
       Linkcheckertransformer_Periodstrip_Htmlt_Extension : in Swagger.Nullable_Boolean;
       Linkcheckertransformer_Periodrewrite_Elements : in Swagger.UString_Vectors.Vector;
       Linkcheckertransformer_Periodstrip_Extension_Path_Blacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Rewriter_Linkchecker_Impl_Link_Checker_Transformer_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Rewriter_Linkchecker_Impl_Link_Info_Storage_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodmax_Links_Per_Host : in Swagger.Nullable_Integer;
       Service_Periodsave_External_Link_References : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Rewriter_Linkchecker_Impl_Link_Info_Storage_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Rewriter_Processor_Impl_Html_Parser_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Htmlparser_Periodprocess_Tags : in Swagger.UString_Vectors.Vector;
       Htmlparser_Periodpreserve_Camel_Case : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqRewriterProcessorImplHtmlParserFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Rewriter_Processor_Impl_Html_Parser_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Search_Impl_Builder_Query_Builder_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Excerpt_Periodproperties : in Swagger.UString_Vectors.Vector;
       Cache_Periodmax_Periodentries : in Swagger.Nullable_Integer;
       Cache_Periodentry_Periodlifetime : in Swagger.Nullable_Integer;
       Xpath_Periodunion : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqSearchImplBuilderQueryBuilderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Search_Impl_Builder_Query_Builder_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Search_Suggest_Impl_Suggestion_Index_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path_Builder_Periodtarget : in Swagger.Nullable_UString;
       Suggest_Periodbasepath : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Search_Suggest_Impl_Suggestion_Index_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Searchpromote_Impl_Publish_Search_Promote_Config_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodsearchpromote_Periodconfighandler_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Searchpromote_Impl_Publish_Search_Promote_Config_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Searchpromote_Impl_Search_Promote_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodsearchpromote_Periodconfiguration_Periodserver_Perioduri : in Swagger.Nullable_UString;
       Cq_Periodsearchpromote_Periodconfiguration_Periodenvironment : in Swagger.Nullable_UString;
       Connection_Periodtimeout : in Swagger.Nullable_Integer;
       Socket_Periodtimeout : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Searchpromote_Impl_Search_Promote_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Security_A_C_L_Setup
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodaclsetup_Periodrules : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqSecurityACLSetupInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Security_A_C_L_Setup;

   --  
   overriding
   procedure Com_Day_Cq_Statistics_Impl_Statistics_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodperiod : in Swagger.Nullable_Integer;
       Scheduler_Periodconcurrent : in Swagger.Nullable_Boolean;
       Path : in Swagger.Nullable_UString;
       Workspace : in Swagger.Nullable_UString;
       Keywords_Path : in Swagger.Nullable_UString;
       Async_Entries : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqStatisticsImplStatisticsServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Statistics_Impl_Statistics_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Tagging_Impl_Jcr_Tag_Manager_Factory_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Validation_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqTaggingImplJcrTagManagerFactoryImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Tagging_Impl_Jcr_Tag_Manager_Factory_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Tagging_Impl_Search_Tag_Predicate_Evaluator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Ignore_Path : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Tagging_Impl_Search_Tag_Predicate_Evaluator;

   --  
   overriding
   procedure Com_Day_Cq_Tagging_Impl_Tag_Garbage_Collector
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqTaggingImplTagGarbageCollectorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Tagging_Impl_Tag_Garbage_Collector;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Contentsync_Impl_Handler_Pages_Update_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodpagesupdatehandler_Periodimageresourcetypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Contentsync_Impl_Handler_Pages_Update_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Contentsync_Impl_Rewriter_Path_Rewriter_Transformer_Factor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodcontentsync_Periodpathrewritertransformer_Periodmapping_Periodlinks : in Swagger.UString_Vectors.Vector;
       Cq_Periodcontentsync_Periodpathrewritertransformer_Periodmapping_Periodclientlibs : in Swagger.UString_Vectors.Vector;
       Cq_Periodcontentsync_Periodpathrewritertransformer_Periodmapping_Periodimages : in Swagger.UString_Vectors.Vector;
       Cq_Periodcontentsync_Periodpathrewritertransformer_Periodattribute_Periodpattern : in Swagger.Nullable_UString;
       Cq_Periodcontentsync_Periodpathrewritertransformer_Periodclientlibrary_Periodpattern : in Swagger.Nullable_UString;
       Cq_Periodcontentsync_Periodpathrewritertransformer_Periodclientlibrary_Periodreplace : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Contentsync_Impl_Rewriter_Path_Rewriter_Transformer_Factor;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Authoring_U_I_Mode_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Authoring_U_I_Mode_Service_Perioddefault : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Authoring_U_I_Mode_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Commands_W_C_M_Command_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Wcmcommandservlet_Perioddelete_Whitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplCommandsWCMCommandServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Commands_W_C_M_Command_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Devicedetection_Device_Identification_Mode_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Dim_Perioddefault_Periodmode : in Swagger.Nullable_UString;
       Dim_Periodappcache_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Devicedetection_Device_Identification_Mode_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Event_Page_Event_Audit_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Configured : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreImplEventPageEventAuditListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Event_Page_Event_Audit_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Event_Page_Post_Processor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Paths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplEventPagePostProcessorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Event_Page_Post_Processor;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Event_Repository_Change_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Paths : in Swagger.UString_Vectors.Vector;
       Excluded_Paths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Event_Repository_Change_Event_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Event_Template_Post_Processor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Paths : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreImplEventTemplatePostProcessorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Event_Template_Post_Processor;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Language_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Langmgr_Periodlist_Periodpath : in Swagger.Nullable_UString;
       Langmgr_Periodcountry_Perioddefault : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplLanguageManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Language_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Link_Checker_Configuration_Factory_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Link_Periodexpired_Periodprefix : in Swagger.Nullable_UString;
       Link_Periodexpired_Periodremove : in Swagger.Nullable_Boolean;
       Link_Periodexpired_Periodsuffix : in Swagger.Nullable_UString;
       Link_Periodinvalid_Periodprefix : in Swagger.Nullable_UString;
       Link_Periodinvalid_Periodremove : in Swagger.Nullable_Boolean;
       Link_Periodinvalid_Periodsuffix : in Swagger.Nullable_UString;
       Link_Periodpredated_Periodprefix : in Swagger.Nullable_UString;
       Link_Periodpredated_Periodremove : in Swagger.Nullable_Boolean;
       Link_Periodpredated_Periodsuffix : in Swagger.Nullable_UString;
       Link_Periodwcmmodes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Link_Checker_Configuration_Factory_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Page_Page_Info_Aggregator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Page_Periodinfo_Periodprovider_Periodproperty_Periodregex_Perioddefault : in Swagger.Nullable_UString;
       Page_Periodinfo_Periodprovider_Periodproperty_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Page_Page_Info_Aggregator_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Page_Page_Manager_Factory_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Illegal_Char_Mapping : in Swagger.Nullable_UString;
       Page_Sub_Tree_Activation_Check : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Page_Page_Manager_Factory_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_References_Content_Content_Reference_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Content_Reference_Config_Periodresource_Types : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_References_Content_Content_Reference_Config;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Servlets_Contentfinder_Asset_View_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Dam_Periodshowexpired : in Swagger.Nullable_Boolean;
       Dam_Periodshowhidden : in Swagger.Nullable_Boolean;
       Tag_Title_Search : in Swagger.Nullable_Boolean;
       Guess_Total : in Swagger.Nullable_UString;
       Dam_Periodexpiry_Property : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Servlets_Contentfinder_Asset_View_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Servlets_Contentfinder_Connector_Connector_Vie
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Item_Periodresource_Periodtypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Servlets_Contentfinder_Connector_Connector_Vie;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Servlets_Contentfinder_Page_View_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Guess_Total : in Swagger.Nullable_UString;
       Tag_Title_Search : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Servlets_Contentfinder_Page_View_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Servlets_Find_Replace_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scope : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplServletsFindReplaceServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Servlets_Find_Replace_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Servlets_Reference_Search_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Referencesearchservlet_Periodmax_References_Per_Page : in Swagger.Nullable_Integer;
       Referencesearchservlet_Periodmax_Pages : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqWcmCoreImplServletsReferenceSearchServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Servlets_Reference_Search_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Servlets_Thumbnail_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Workspace : in Swagger.Nullable_UString;
       Dimensions : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmCoreImplServletsThumbnailServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Servlets_Thumbnail_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Utils_Default_Page_Name_Validator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Non_Valid_Chars : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Utils_Default_Page_Name_Validator;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Variants_Page_Variants_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Default_Periodexternalizer_Perioddomain : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Variants_Page_Variants_Provider_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Version_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Versionmanager_Periodcreate_Version_On_Activation : in Swagger.Nullable_Boolean;
       Versionmanager_Periodpurging_Enabled : in Swagger.Nullable_Boolean;
       Versionmanager_Periodpurge_Paths : in Swagger.UString_Vectors.Vector;
       Versionmanager_Periodiv_Paths : in Swagger.UString_Vectors.Vector;
       Versionmanager_Periodmax_Age_Days : in Swagger.Nullable_Integer;
       Versionmanager_Periodmax_Number_Versions : in Swagger.Nullable_Integer;
       Versionmanager_Periodmin_Number_Versions : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqWcmCoreImplVersionManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Version_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Version_Purge_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Versionpurge_Periodpaths : in Swagger.UString_Vectors.Vector;
       Versionpurge_Periodrecursive : in Swagger.Nullable_Boolean;
       Versionpurge_Periodmax_Versions : in Swagger.Nullable_Integer;
       Versionpurge_Periodmin_Versions : in Swagger.Nullable_Integer;
       Versionpurge_Periodmax_Age_Days : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqWcmCoreImplVersionPurgeTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Version_Purge_Task;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_W_C_M_Debug_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Wcmdbgfilter_Periodenabled : in Swagger.Nullable_Boolean;
       Wcmdbgfilter_Periodjsp_Debug : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmCoreImplWCMDebugFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_W_C_M_Debug_Filter;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_W_C_M_Developer_Mode_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Wcmdevmodefilter_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_W_C_M_Developer_Mode_Filter;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Impl_Warp_Time_Warp_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Filter_Periodorder : in Swagger.Nullable_UString;
       Filter_Periodscope : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreImplWarpTimeWarpFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Impl_Warp_Time_Warp_Filter;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Mvt_M_V_T_Statistics_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mvtstatistics_Periodtrackingurl : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreMvtMVTStatisticsImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Mvt_M_V_T_Statistics_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_Stats_Page_View_Statistics_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pageviewstatistics_Periodtrackingurl : in Swagger.Nullable_UString;
       Pageviewstatistics_Periodtrackingscript_Periodenabled : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreStatsPageViewStatisticsImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_Stats_Page_View_Statistics_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Core_W_C_M_Request_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Wcmfilter_Periodmode : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmCoreWCMRequestFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Core_W_C_M_Request_Filter;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Design_Package_Importer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Extract_Periodfilter : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmDesignimporterDesignPackageImporterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Design_Package_Importer;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Impl_Canvas_Builder_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Filepattern : in Swagger.Nullable_UString;
       Build_Periodpage_Periodnodes : in Swagger.Nullable_Boolean;
       Build_Periodclient_Periodlibs : in Swagger.Nullable_Boolean;
       Build_Periodcanvas_Periodcomponent : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Impl_Canvas_Builder_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Impl_Canvas_Page_Delete_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Min_Thread_Pool_Size : in Swagger.Nullable_Integer;
       Max_Thread_Pool_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Impl_Canvas_Page_Delete_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Impl_Entry_Preprocessor_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Search_Periodpattern : in Swagger.Nullable_UString;
       Replace_Periodpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Impl_Entry_Preprocessor_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Impl_Mobile_Canvas_Builder_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Filepattern : in Swagger.Nullable_UString;
       Device_Periodgroups : in Swagger.UString_Vectors.Vector;
       Build_Periodpage_Periodnodes : in Swagger.Nullable_Boolean;
       Build_Periodclient_Periodlibs : in Swagger.Nullable_Boolean;
       Build_Periodcanvas_Periodcomponent : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Impl_Mobile_Canvas_Builder_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Canvas_Compone
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Canvas_Compone;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Default_Compon
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Default_Compon;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Default_Tag_Han
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Default_Tag_Han;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Head_Tag_Handle
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Head_Tag_Handle;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_I_Frame_Tag_Hand
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_I_Frame_Tag_Hand;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Image_Componen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Component_Periodresource_Type : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Image_Componen;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Img_Tag_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Img_Tag_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Inline_Script_T
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Inline_Script_T;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Link_Tag_Handle
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Link_Tag_Handle;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Meta_Tag_Handle
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Meta_Tag_Handle;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Non_Script_Tag_H
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Non_Script_Tag_H;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Parsys_Compone
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Component_Periodresource_Type : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Parsys_Compone;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Script_Tag_Hand
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Script_Tag_Hand;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Style_Tag_Handl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Style_Tag_Handl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Text_Component
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Component_Periodresource_Type : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Text_Component;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Title_Componen
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Component_Periodresource_Type : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Title_Componen;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Title_Tag_Handl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Tagpattern : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Designimporter_Parser_Taghandlers_Factory_Title_Tag_Handl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Forms_Impl_Form_Chooser_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodname : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodresource_Types : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodselectors : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodmethods : in Swagger.UString_Vectors.Vector;
       Forms_Periodformchooserservlet_Periodadvansesearch_Periodrequire : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmFoundationFormsImplFormChooserServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Forms_Impl_Form_Chooser_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Forms_Impl_Form_Paragraph_Post_Processor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Forms_Periodformparagraphpostprocessor_Periodenabled : in Swagger.Nullable_Boolean;
       Forms_Periodformparagraphpostprocessor_Periodformresourcetypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Forms_Impl_Form_Paragraph_Post_Processor;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Forms_Impl_Forms_Handling_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name_Periodwhitelist : in Swagger.Nullable_UString;
       Allow_Periodexpressions : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Forms_Impl_Forms_Handling_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Forms_Impl_Mail_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodresource_Types : in Swagger.Nullable_UString;
       Sling_Periodservlet_Periodselectors : in Swagger.Nullable_UString;
       Resource_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Resource_Periodblacklist : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmFoundationFormsImplMailServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Forms_Impl_Mail_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Impl_Adaptive_Image_Component_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Adapt_Periodsupported_Periodwidths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Impl_Adaptive_Image_Component_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Impl_H_T_T_P_Auth_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Auth_Periodhttp_Periodnologin : in Swagger.Nullable_Boolean;
       Auth_Periodhttp_Periodrealm : in Swagger.Nullable_UString;
       Auth_Perioddefault_Periodloginpage : in Swagger.Nullable_UString;
       Auth_Periodcred_Periodform : in Swagger.UString_Vectors.Vector;
       Auth_Periodcred_Periodutf8 : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmFoundationImplHTTPAuthHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Impl_H_T_T_P_Auth_Handler;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Impl_Page_Impressions_Tracker
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodauth_Periodrequirements : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmFoundationImplPageImpressionsTrackerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Impl_Page_Impressions_Tracker;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Impl_Page_Redirect_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Excluded_Periodresource_Periodtypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmFoundationImplPageRedirectServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Impl_Page_Redirect_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Security_Impl_Default_Attachment_Type_Blacklist
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Default_Periodattachment_Periodtype_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Baseline_Periodattachment_Periodtype_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Security_Impl_Default_Attachment_Type_Blacklist;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Foundation_Security_Impl_Safer_Sling_Post_Validator_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Parameter_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Parameter_Periodwhitelist_Periodprefixes : in Swagger.UString_Vectors.Vector;
       Binary_Periodparameter_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Modifier_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Operation_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Operation_Periodwhitelist_Periodprefixes : in Swagger.UString_Vectors.Vector;
       Typehint_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Resourcetype_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Foundation_Security_Impl_Safer_Sling_Post_Validator_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Mobile_Core_Impl_Device_Device_Info_Transformer_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Device_Periodinfo_Periodtransformer_Periodenabled : in Swagger.Nullable_Boolean;
       Device_Periodinfo_Periodtransformer_Periodcss_Periodstyle : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Mobile_Core_Impl_Device_Device_Info_Transformer_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Mobile_Core_Impl_Redirect_Redirect_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Redirect_Periodenabled : in Swagger.Nullable_Boolean;
       Redirect_Periodstats_Periodenabled : in Swagger.Nullable_Boolean;
       Redirect_Periodextensions : in Swagger.UString_Vectors.Vector;
       Redirect_Periodpaths : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Mobile_Core_Impl_Redirect_Redirect_Filter;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Actions_Content_Copy_Action_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludednodetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedparagraphitems : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedprops : in Swagger.UString_Vectors.Vector;
       Contentcopyaction_Periodorder_Periodstyle : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Actions_Content_Copy_Action_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Actions_Content_Delete_Action_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludednodetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedparagraphitems : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedprops : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Actions_Content_Delete_Action_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Actions_Content_Update_Action_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludednodetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedparagraphitems : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedprops : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodignored_Mixin : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Actions_Content_Update_Action_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Actions_Order_Children_Action_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludednodetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedparagraphitems : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedprops : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Actions_Order_Children_Action_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Actions_Page_Move_Action_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludednodetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedparagraphitems : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedprops : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodimpl_Periodactions_Periodpagemove_Periodprop_Reference_Update : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Actions_Page_Move_Action_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Actions_References_Update_Action_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludednodetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedparagraphitems : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedprops : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodimpl_Periodaction_Periodreferencesupdate_Periodprop_Update_Nested : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Actions_References_Update_Action_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Actions_Version_Copy_Action_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludednodetypes : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedparagraphitems : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodmsm_Periodaction_Periodexcludedprops : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Actions_Version_Copy_Action_Factory;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Live_Relationship_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Liverelationshipmgr_Periodrelationsconfig_Perioddefault : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Live_Relationship_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Rollout_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Rolloutmgr_Periodexcludedprops_Perioddefault : in Swagger.UString_Vectors.Vector;
       Rolloutmgr_Periodexcludedparagraphprops_Perioddefault : in Swagger.UString_Vectors.Vector;
       Rolloutmgr_Periodexcludednodetypes_Perioddefault : in Swagger.UString_Vectors.Vector;
       Rolloutmgr_Periodthreadpool_Periodmaxsize : in Swagger.Nullable_Integer;
       Rolloutmgr_Periodthreadpool_Periodmaxshutdowntime : in Swagger.Nullable_Integer;
       Rolloutmgr_Periodthreadpool_Periodpriority : in Swagger.Nullable_UString;
       Rolloutmgr_Periodcommit_Periodsize : in Swagger.Nullable_Integer;
       Rolloutmgr_Periodconflicthandling_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWcmMsmImplRolloutManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Rollout_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Msm_Impl_Servlets_Audit_Log_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Auditlogservlet_Perioddefault_Periodevents_Periodcount : in Swagger.Nullable_Integer;
       Auditlogservlet_Perioddefault_Periodpath : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmMsmImplServletsAuditLogServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Msm_Impl_Servlets_Audit_Log_Servlet;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Notification_Email_Impl_Email_Channel
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Email_Periodfrom : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmNotificationEmailImplEmailChannelInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Notification_Email_Impl_Email_Channel;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Notification_Impl_Notification_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodtopics : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmNotificationImplNotificationManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Notification_Impl_Notification_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Scripting_Impl_B_V_P_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Com_Periodday_Periodcq_Periodwcm_Periodscripting_Periodbvp_Periodscript_Periodengines : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmScriptingImplBVPManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Scripting_Impl_B_V_P_Manager;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Undo_Undo_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodundo_Periodenabled : in Swagger.Nullable_Boolean;
       Cq_Periodwcm_Periodundo_Periodpath : in Swagger.Nullable_UString;
       Cq_Periodwcm_Periodundo_Periodvalidity : in Swagger.Nullable_Integer;
       Cq_Periodwcm_Periodundo_Periodsteps : in Swagger.Nullable_Integer;
       Cq_Periodwcm_Periodundo_Periodpersistence : in Swagger.Nullable_UString;
       Cq_Periodwcm_Periodundo_Periodpersistence_Periodmode : in Swagger.Nullable_Boolean;
       Cq_Periodwcm_Periodundo_Periodmarkermode : in Swagger.Nullable_UString;
       Cq_Periodwcm_Periodundo_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Cq_Periodwcm_Periodundo_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmUndoUndoConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Undo_Undo_Config;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Webservicesupport_Impl_Replication_Event_Listener
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Flush agents : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Webservicesupport_Impl_Replication_Event_Listener;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Workflow_Impl_Wcm_Workflow_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Event_Periodfilter : in Swagger.Nullable_UString;
       Min_Thread_Pool_Size : in Swagger.Nullable_Integer;
       Max_Thread_Pool_Size : in Swagger.Nullable_Integer;
       Cq_Periodwcm_Periodworkflow_Periodterminate_Periodon_Periodactivate : in Swagger.Nullable_Boolean;
       Cq_Periodwcm_Periodworklfow_Periodterminate_Periodexclusion_Periodlist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Workflow_Impl_Wcm_Workflow_Service_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Wcm_Workflow_Impl_Workflow_Package_Info_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Workflowpackageinfoprovider_Periodfilter : in Swagger.UString_Vectors.Vector;
       Workflowpackageinfoprovider_Periodfilter_Periodrootpath : in Swagger.Nullable_UString;
       Result  : out .Models.ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Wcm_Workflow_Impl_Workflow_Package_Info_Provider;

   --  
   overriding
   procedure Com_Day_Cq_Widget_Impl_Html_Library_Manager_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Htmllibmanager_Periodclientmanager : in Swagger.Nullable_UString;
       Htmllibmanager_Perioddebug : in Swagger.Nullable_Boolean;
       Htmllibmanager_Perioddebug_Periodconsole : in Swagger.Nullable_Boolean;
       Htmllibmanager_Perioddebug_Periodinit_Periodjs : in Swagger.Nullable_UString;
       Htmllibmanager_Perioddefaultthemename : in Swagger.Nullable_UString;
       Htmllibmanager_Perioddefaultuserthemename : in Swagger.Nullable_UString;
       Htmllibmanager_Periodfirebuglite_Periodpath : in Swagger.Nullable_UString;
       Htmllibmanager_Periodforce_C_Q_Url_Info : in Swagger.Nullable_Boolean;
       Htmllibmanager_Periodgzip : in Swagger.Nullable_Boolean;
       Htmllibmanager_Periodmaxage : in Swagger.Nullable_Integer;
       Htmllibmanager_Periodmax_Data_Uri_Size : in Swagger.Nullable_Integer;
       Htmllibmanager_Periodminify : in Swagger.Nullable_Boolean;
       Htmllibmanager_Periodpath_Periodlist : in Swagger.UString_Vectors.Vector;
       Htmllibmanager_Periodtiming : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWidgetImplHtmlLibraryManagerImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Widget_Impl_Html_Library_Manager_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Widget_Impl_Widget_Extension_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Extendable_Periodwidgets : in Swagger.UString_Vectors.Vector;
       Widgetextensionprovider_Perioddebug : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWidgetImplWidgetExtensionProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Widget_Impl_Widget_Extension_Provider_Impl;

   --  
   overriding
   procedure Com_Day_Cq_Workflow_Impl_Email_E_Mail_Notification_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       From_Periodaddress : in Swagger.Nullable_UString;
       Host_Periodprefix : in Swagger.Nullable_UString;
       Notify_Periodonabort : in Swagger.Nullable_Boolean;
       Notify_Periodoncomplete : in Swagger.Nullable_Boolean;
       Notify_Periodoncontainercomplete : in Swagger.Nullable_Boolean;
       Notify_Perioduseronly : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWorkflowImplEmailEMailNotificationServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Workflow_Impl_Email_E_Mail_Notification_Service;

   --  
   overriding
   procedure Com_Day_Cq_Workflow_Impl_Email_Task_E_Mail_Notification_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Notify_Periodonupdate : in Swagger.Nullable_Boolean;
       Notify_Periodoncomplete : in Swagger.Nullable_Boolean;
       Result  : out .Models.ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Cq_Workflow_Impl_Email_Task_E_Mail_Notification_Service;

   --  
   overriding
   procedure Com_Day_Crx_Security_Token_Impl_Impl_Token_Authentication_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Token_Periodrequired_Periodattr : in Swagger.Nullable_UString;
       Token_Periodalternate_Periodurl : in Swagger.Nullable_UString;
       Token_Periodencapsulated : in Swagger.Nullable_Boolean;
       Skip_Periodtoken_Periodrefresh : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Crx_Security_Token_Impl_Impl_Token_Authentication_Handler;

   --  
   overriding
   procedure Com_Day_Crx_Security_Token_Impl_Token_Cleanup_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enable_Periodtoken_Periodcleanup_Periodtask : in Swagger.Nullable_Boolean;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Batch_Periodsize : in Swagger.Nullable_Integer;
       Result  : out .Models.ComDayCrxSecurityTokenImplTokenCleanupTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Com_Day_Crx_Security_Token_Impl_Token_Cleanup_Task;

   --  
   overriding
   procedure Guide_Localization_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Supported_Locales : in Swagger.UString_Vectors.Vector;
       Localizable _Properties : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.GuideLocalizationServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Guide_Localization_Service;

   --  
   overriding
   procedure Messaging_User_Component_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Priority : in Swagger.Nullable_Integer;
       Result  : out .Models.MessagingUserComponentFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Messaging_User_Component_Factory;

   --  
   overriding
   procedure Org_Apache_Aries_Jmx_Framework_State_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Attribute_Change_Notification_Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheAriesJmxFrameworkStateConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Aries_Jmx_Framework_State_Config;

   --  
   overriding
   procedure Org_Apache_Felix_Eventadmin_Impl_Event_Admin
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodeventadmin_Period_Thread_Pool_Size : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodeventadmin_Period_Async_To_Sync_Thread_Ratio : in Swagger.Number;
       Org_Periodapache_Periodfelix_Periodeventadmin_Period_Timeout : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodeventadmin_Period_Require_Topic : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodeventadmin_Period_Ignore_Timeout : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodeventadmin_Period_Ignore_Topic : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheFelixEventadminImplEventAdminInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Eventadmin_Impl_Event_Admin;

   --  
   overriding
   procedure Org_Apache_Felix_Http
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodhttp_Periodhost : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttp_Periodenable : in Swagger.Nullable_Boolean;
       Org_Periodosgi_Periodservice_Periodhttp_Periodport : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodtimeout : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttps_Periodenable : in Swagger.Nullable_Boolean;
       Org_Periodosgi_Periodservice_Periodhttp_Periodport_Periodsecure : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodclientcertificate : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttp_Periodcontext_Path : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttp_Periodmbeans : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttp_Periodsession_Periodtimeout : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodjetty_Periodthreadpool_Periodmax : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodjetty_Periodacceptors : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodjetty_Periodselectors : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodjetty_Periodheader_Buffer_Size : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodjetty_Periodrequest_Buffer_Size : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodjetty_Periodresponse_Buffer_Size : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodjetty_Periodmax_Form_Size : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodpath_Exclusions : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodhttps_Periodjetty_Periodciphersuites_Periodexcluded : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodhttps_Periodjetty_Periodciphersuites_Periodincluded : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodhttp_Periodjetty_Periodsend_Server_Header : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttps_Periodjetty_Periodprotocols_Periodincluded : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodhttps_Periodjetty_Periodprotocols_Periodexcluded : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodproxy_Periodload_Periodbalancer_Periodconnection_Periodenable : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttps_Periodjetty_Periodrenegotiate_Allowed : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttps_Periodjetty_Periodsession_Periodcookie_Periodhttp_Only : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttps_Periodjetty_Periodsession_Periodcookie_Periodsecure : in Swagger.Nullable_Boolean;
       Org_Periodeclipse_Periodjetty_Periodservlet_Period_Session_Id_Path_Parameter_Name : in Swagger.Nullable_UString;
       Org_Periodeclipse_Periodjetty_Periodservlet_Period_Checking_Remote_Session_Id_Encoding : in Swagger.Nullable_Boolean;
       Org_Periodeclipse_Periodjetty_Periodservlet_Period_Session_Cookie : in Swagger.Nullable_UString;
       Org_Periodeclipse_Periodjetty_Periodservlet_Period_Session_Domain : in Swagger.Nullable_UString;
       Org_Periodeclipse_Periodjetty_Periodservlet_Period_Session_Path : in Swagger.Nullable_UString;
       Org_Periodeclipse_Periodjetty_Periodservlet_Period_Max_Age : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodhttp_Periodname : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgziphandler_Periodenable : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodmin_Gzip_Size : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodcompression_Level : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodinflate_Buffer_Size : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodsync_Flush : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodexcluded_User_Agents : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodincluded_Methods : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodexcluded_Methods : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodincluded_Paths : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodexcluded_Paths : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodincluded_Mime_Types : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodjetty_Periodgzip_Periodexcluded_Mime_Types : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodfelix_Periodhttp_Periodsession_Periodinvalidate : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttp_Periodsession_Perioduniqueid : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheFelixHttpInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Http;

   --  
   overriding
   procedure Org_Apache_Felix_Http_Sslfilter_Ssl_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Ssl_Forward_Periodheader : in Swagger.Nullable_UString;
       Ssl_Forward_Periodvalue : in Swagger.Nullable_UString;
       Ssl_Forward_Cert_Periodheader : in Swagger.Nullable_UString;
       Rewrite_Periodabsolute_Periodurls : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheFelixHttpSslfilterSslFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Http_Sslfilter_Ssl_Filter;

   --  
   overriding
   procedure Org_Apache_Felix_Jaas_Configuration_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Jaas_Periodcontrol_Flag : in Swagger.Nullable_UString;
       Jaas_Periodranking : in Swagger.Nullable_Integer;
       Jaas_Periodrealm_Name : in Swagger.Nullable_UString;
       Jaas_Periodclassname : in Swagger.Nullable_UString;
       Jaas_Periodoptions : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheFelixJaasConfigurationFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Jaas_Configuration_Factory;

   --  
   overriding
   procedure Org_Apache_Felix_Jaas_Configuration_Spi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Jaas_Perioddefault_Realm_Name : in Swagger.Nullable_UString;
       Jaas_Periodconfig_Provider_Name : in Swagger.Nullable_UString;
       Jaas_Periodglobal_Config_Policy : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheFelixJaasConfigurationSpiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Jaas_Configuration_Spi;

   --  
   overriding
   procedure Org_Apache_Felix_Scr_Scr_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Ds_Periodloglevel : in Swagger.Nullable_Integer;
       Ds_Periodfactory_Periodenabled : in Swagger.Nullable_Boolean;
       Ds_Perioddelayed_Periodkeep_Instances : in Swagger.Nullable_Boolean;
       Ds_Periodlock_Periodtimeout_Periodmilliseconds : in Swagger.Nullable_Integer;
       Ds_Periodstop_Periodtimeout_Periodmilliseconds : in Swagger.Nullable_Integer;
       Ds_Periodglobal_Periodextender : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheFelixScrScrServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Scr_Scr_Service;

   --  
   overriding
   procedure Org_Apache_Felix_Systemready_Impl_Components_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Components_Periodlist : in Swagger.UString_Vectors.Vector;
       P_Type : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheFelixSystemreadyImplComponentsCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Systemready_Impl_Components_Check;

   --  
   overriding
   procedure Org_Apache_Felix_Systemready_Impl_Framework_Start_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Timeout : in Swagger.Nullable_Integer;
       Target_Periodstart_Periodlevel : in Swagger.Nullable_Integer;
       Target_Periodstart_Periodlevel_Periodprop_Periodname : in Swagger.Nullable_UString;
       P_Type : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Systemready_Impl_Framework_Start_Check;

   --  
   overriding
   procedure Org_Apache_Felix_Systemready_Impl_Services_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Services_Periodlist : in Swagger.UString_Vectors.Vector;
       P_Type : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheFelixSystemreadyImplServicesCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Systemready_Impl_Services_Check;

   --  
   overriding
   procedure Org_Apache_Felix_Systemready_Impl_Servlet_System_Alive_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Osgi_Periodhttp_Periodwhiteboard_Periodservlet_Periodpattern : in Swagger.Nullable_UString;
       Osgi_Periodhttp_Periodwhiteboard_Periodcontext_Periodselect : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Systemready_Impl_Servlet_System_Alive_Servlet;

   --  
   overriding
   procedure Org_Apache_Felix_Systemready_Impl_Servlet_System_Ready_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Osgi_Periodhttp_Periodwhiteboard_Periodservlet_Periodpattern : in Swagger.Nullable_UString;
       Osgi_Periodhttp_Periodwhiteboard_Periodcontext_Periodselect : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Systemready_Impl_Servlet_System_Ready_Servlet;

   --  
   overriding
   procedure Org_Apache_Felix_Systemready_System_Ready_Monitor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Poll_Periodinterval : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheFelixSystemreadySystemReadyMonitorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Systemready_System_Ready_Monitor;

   --  
   overriding
   procedure Org_Apache_Felix_Webconsole_Internal_Servlet_Osgi_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Manager_Periodroot : in Swagger.Nullable_UString;
       Http_Periodservice_Periodfilter : in Swagger.Nullable_UString;
       Default_Periodrender : in Swagger.Nullable_UString;
       Realm : in Swagger.Nullable_UString;
       Username : in Swagger.Nullable_UString;
       Password : in Swagger.Nullable_UString;
       Category : in Swagger.Nullable_UString;
       Locale : in Swagger.Nullable_UString;
       Loglevel : in Swagger.Nullable_Integer;
       Plugins : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Webconsole_Internal_Servlet_Osgi_Manager;

   --  
   overriding
   procedure Org_Apache_Felix_Webconsole_Plugins_Event_Internal_Plugin_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Periodsize : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Webconsole_Plugins_Event_Internal_Plugin_Servlet;

   --  
   overriding
   procedure Org_Apache_Felix_Webconsole_Plugins_Memoryusage_Internal_Memory_Usage_Co
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Felix_Periodmemoryusage_Perioddump_Periodthreshold : in Swagger.Nullable_Integer;
       Felix_Periodmemoryusage_Perioddump_Periodinterval : in Swagger.Nullable_Integer;
       Felix_Periodmemoryusage_Perioddump_Periodlocation : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Felix_Webconsole_Plugins_Memoryusage_Internal_Memory_Usage_Co;

   --  
   overriding
   procedure Org_Apache_Http_Proxyconfigurator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Proxy_Periodenabled : in Swagger.Nullable_Boolean;
       Proxy_Periodhost : in Swagger.Nullable_UString;
       Proxy_Periodport : in Swagger.Nullable_Integer;
       Proxy_Perioduser : in Swagger.Nullable_UString;
       Proxy_Periodpassword : in Swagger.Nullable_UString;
       Proxy_Periodexceptions : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheHttpProxyconfiguratorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Http_Proxyconfigurator;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Blob_Datastore_Data_Store_Text_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Dir : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Blob_Datastore_Data_Store_Text_Provider;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Blob_Datastore_File_Data_Store
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Blob_Datastore_File_Data_Store;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Document_Document_Node_Store_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mongouri : in Swagger.Nullable_UString;
       Db : in Swagger.Nullable_UString;
       Socket_Keep_Alive : in Swagger.Nullable_Boolean;
       Cache : in Swagger.Nullable_Integer;
       Node_Cache_Percentage : in Swagger.Nullable_Integer;
       Prev_Doc_Cache_Percentage : in Swagger.Nullable_Integer;
       Children_Cache_Percentage : in Swagger.Nullable_Integer;
       Diff_Cache_Percentage : in Swagger.Nullable_Integer;
       Cache_Segment_Count : in Swagger.Nullable_Integer;
       Cache_Stack_Move_Distance : in Swagger.Nullable_Integer;
       Blob_Cache_Size : in Swagger.Nullable_Integer;
       Persistent_Cache : in Swagger.Nullable_UString;
       Journal_Cache : in Swagger.Nullable_UString;
       Custom_Blob_Store : in Swagger.Nullable_Boolean;
       Journal_G_C_Interval : in Swagger.Nullable_Integer;
       Journal_G_C_Max_Age : in Swagger.Nullable_Integer;
       Prefetch_External_Changes : in Swagger.Nullable_Boolean;
       Role : in Swagger.Nullable_UString;
       Version_Gc_Max_Age_In_Secs : in Swagger.Nullable_Integer;
       Version_G_C_Expression : in Swagger.Nullable_UString;
       Version_G_C_Time_Limit_In_Secs : in Swagger.Nullable_Integer;
       Blob_Gc_Max_Age_In_Secs : in Swagger.Nullable_Integer;
       Blob_Track_Snapshot_Interval_In_Secs : in Swagger.Nullable_Integer;
       Repository_Periodhome : in Swagger.Nullable_UString;
       Max_Replication_Lag_In_Secs : in Swagger.Nullable_Integer;
       Document_Store_Type : in Swagger.Nullable_UString;
       Bundling_Disabled : in Swagger.Nullable_Boolean;
       Update_Limit : in Swagger.Nullable_Integer;
       Persistent_Cache_Includes : in Swagger.UString_Vectors.Vector;
       Lease_Check_Mode : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Document_Document_Node_Store_Service;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Document_Document_Node_Store_Service_Pre
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Persistent_Cache_Includes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Document_Document_Node_Store_Service_Pre;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Document_Secondary_Secondary_Store_Cac
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Included_Paths : in Swagger.UString_Vectors.Vector;
       Enable_Async_Observer : in Swagger.Nullable_Boolean;
       Observer_Queue_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Document_Secondary_Secondary_Store_Cac;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Index_Async_Indexer_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Async_Configs : in Swagger.UString_Vectors.Vector;
       Lease_Time_Out_Minutes : in Swagger.Nullable_Integer;
       Failing_Index_Timeout_Seconds : in Swagger.Nullable_Integer;
       Error_Warn_Interval_Seconds : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Index_Async_Indexer_Service;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Index_Lucene_Lucene_Index_Provider_Serv
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Disabled : in Swagger.Nullable_Boolean;
       Debug : in Swagger.Nullable_Boolean;
       Local_Index_Dir : in Swagger.Nullable_UString;
       Enable_Open_Index_Async : in Swagger.Nullable_Boolean;
       Thread_Pool_Size : in Swagger.Nullable_Integer;
       Prefetch_Index_Files : in Swagger.Nullable_Boolean;
       Extracted_Text_Cache_Size_In_M_B : in Swagger.Nullable_Integer;
       Extracted_Text_Cache_Expiry_In_Secs : in Swagger.Nullable_Integer;
       Always_Use_Pre_Extracted_Cache : in Swagger.Nullable_Boolean;
       Boolean_Clause_Limit : in Swagger.Nullable_Integer;
       Enable_Hybrid_Indexing : in Swagger.Nullable_Boolean;
       Hybrid_Queue_Size : in Swagger.Nullable_Integer;
       Disable_Stored_Index_Definition : in Swagger.Nullable_Boolean;
       Deleted_Blobs_Collection_Enabled : in Swagger.Nullable_Boolean;
       Prop_Index_Cleaner_Interval_In_Secs : in Swagger.Nullable_Integer;
       Enable_Single_Blob_Index_Files : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Index_Lucene_Lucene_Index_Provider_Serv;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Embedded_Solr_Server_Co
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Solr_Periodhome_Periodpath : in Swagger.Nullable_UString;
       Solr_Periodcore_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Embedded_Solr_Server_Co;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Node_State_Solr_Servers
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Node_State_Solr_Servers;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Oak_Solr_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path_Perioddesc_Periodfield : in Swagger.Nullable_UString;
       Path_Periodchild_Periodfield : in Swagger.Nullable_UString;
       Path_Periodparent_Periodfield : in Swagger.Nullable_UString;
       Path_Periodexact_Periodfield : in Swagger.Nullable_UString;
       Catch_Periodall_Periodfield : in Swagger.Nullable_UString;
       Collapsed_Periodpath_Periodfield : in Swagger.Nullable_UString;
       Path_Perioddepth_Periodfield : in Swagger.Nullable_UString;
       Commit_Periodpolicy : in Swagger.Nullable_UString;
       Rows : in Swagger.Nullable_Integer;
       Path_Periodrestrictions : in Swagger.Nullable_Boolean;
       Property_Periodrestrictions : in Swagger.Nullable_Boolean;
       Primarytypes_Periodrestrictions : in Swagger.Nullable_Boolean;
       Ignored_Periodproperties : in Swagger.UString_Vectors.Vector;
       Used_Periodproperties : in Swagger.UString_Vectors.Vector;
       Type_Periodmappings : in Swagger.UString_Vectors.Vector;
       Property_Periodmappings : in Swagger.UString_Vectors.Vector;
       Collapse_Periodjcrcontent_Periodnodes : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Oak_Solr_Configuration;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Remote_Solr_Server_Conf
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Solr_Periodhttp_Periodurl : in Swagger.Nullable_UString;
       Solr_Periodzk_Periodhost : in Swagger.Nullable_UString;
       Solr_Periodcollection : in Swagger.Nullable_UString;
       Solr_Periodsocket_Periodtimeout : in Swagger.Nullable_Integer;
       Solr_Periodconnection_Periodtimeout : in Swagger.Nullable_Integer;
       Solr_Periodshards_Periodno : in Swagger.Nullable_Integer;
       Solr_Periodreplication_Periodfactor : in Swagger.Nullable_Integer;
       Solr_Periodconf_Perioddir : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Remote_Solr_Server_Conf;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Solr_Query_Index_Provid
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Query_Periodaggregation : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Solr_Query_Index_Provid;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Solr_Server_Provider_Se
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Server_Periodtype : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Index_Solr_Osgi_Solr_Server_Provider_Se;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Metric_Statistics_Provider_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Provider_Type : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Metric_Statistics_Provider_Factory;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Plugins_Observation_Change_Collector_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Items : in Swagger.Nullable_Integer;
       Max_Path_Depth : in Swagger.Nullable_Integer;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Plugins_Observation_Change_Collector_Provider;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Query_Query_Engine_Settings_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Query_Limit_In_Memory : in Swagger.Nullable_Integer;
       Query_Limit_Reads : in Swagger.Nullable_Integer;
       Query_Fail_Traversal : in Swagger.Nullable_Boolean;
       Fast_Query_Size : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Query_Query_Engine_Settings_Service;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Security_Authentication_Authentication_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodjackrabbit_Periodoak_Periodauthentication_Periodapp_Name : in Swagger.Nullable_UString;
       Org_Periodapache_Periodjackrabbit_Periodoak_Periodauthentication_Periodconfig_Spi_Name : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Security_Authentication_Authentication_Config;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Security_Authentication_Ldap_Impl_Ldap_Identi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Provider_Periodname : in Swagger.Nullable_UString;
       Host_Periodname : in Swagger.Nullable_UString;
       Host_Periodport : in Swagger.Nullable_Integer;
       Host_Periodssl : in Swagger.Nullable_Boolean;
       Host_Periodtls : in Swagger.Nullable_Boolean;
       Host_Periodno_Cert_Check : in Swagger.Nullable_Boolean;
       Bind_Perioddn : in Swagger.Nullable_UString;
       Bind_Periodpassword : in Swagger.Nullable_UString;
       Search_Timeout : in Swagger.Nullable_UString;
       Admin_Pool_Periodmax_Active : in Swagger.Nullable_Integer;
       Admin_Pool_Periodlookup_On_Validate : in Swagger.Nullable_Boolean;
       User_Pool_Periodmax_Active : in Swagger.Nullable_Integer;
       User_Pool_Periodlookup_On_Validate : in Swagger.Nullable_Boolean;
       User_Periodbase_D_N : in Swagger.Nullable_UString;
       User_Periodobjectclass : in Swagger.UString_Vectors.Vector;
       User_Periodid_Attribute : in Swagger.Nullable_UString;
       User_Periodextra_Filter : in Swagger.Nullable_UString;
       User_Periodmake_Dn_Path : in Swagger.Nullable_Boolean;
       Group_Periodbase_D_N : in Swagger.Nullable_UString;
       Group_Periodobjectclass : in Swagger.UString_Vectors.Vector;
       Group_Periodname_Attribute : in Swagger.Nullable_UString;
       Group_Periodextra_Filter : in Swagger.Nullable_UString;
       Group_Periodmake_Dn_Path : in Swagger.Nullable_Boolean;
       Group_Periodmember_Attribute : in Swagger.Nullable_UString;
       Use_Uid_For_Ext_Id : in Swagger.Nullable_Boolean;
       Customattributes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Security_Authentication_Ldap_Impl_Ldap_Identi;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Security_Authentication_Token_Token_Configura
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Token_Expiration : in Swagger.Nullable_UString;
       Token_Length : in Swagger.Nullable_UString;
       Token_Refresh : in Swagger.Nullable_Boolean;
       Token_Cleanup_Threshold : in Swagger.Nullable_Integer;
       Password_Hash_Algorithm : in Swagger.Nullable_UString;
       Password_Hash_Iterations : in Swagger.Nullable_Integer;
       Password_Salt_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Security_Authentication_Token_Token_Configura;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Security_Authorization_Authorization_Configur
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Permissions_Jr2 : in Swagger.Nullable_UString;
       Import_Behavior : in Swagger.Nullable_UString;
       Read_Paths : in Swagger.UString_Vectors.Vector;
       Administrative_Principals : in Swagger.UString_Vectors.Vector;
       Configuration_Ranking : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Security_Authorization_Authorization_Configur;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Security_Internal_Security_Provider_Registrati
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Required_Service_Pids : in Swagger.UString_Vectors.Vector;
       Authorization_Composition_Type : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Security_Internal_Security_Provider_Registrati;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Security_User_Random_Authorizable_Node_Name
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Length : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Security_User_Random_Authorizable_Node_Name;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Security_User_User_Configuration_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Users_Path : in Swagger.Nullable_UString;
       Groups_Path : in Swagger.Nullable_UString;
       System_Relative_Path : in Swagger.Nullable_UString;
       Default_Depth : in Swagger.Nullable_Integer;
       Import_Behavior : in Swagger.Nullable_UString;
       Password_Hash_Algorithm : in Swagger.Nullable_UString;
       Password_Hash_Iterations : in Swagger.Nullable_Integer;
       Password_Salt_Size : in Swagger.Nullable_Integer;
       Omit_Admin_Pw : in Swagger.Nullable_Boolean;
       Support_Auto_Save : in Swagger.Nullable_Boolean;
       Password_Max_Age : in Swagger.Nullable_Integer;
       Initial_Password_Change : in Swagger.Nullable_Boolean;
       Password_History_Size : in Swagger.Nullable_Integer;
       Password_Expiry_For_Admin : in Swagger.Nullable_Boolean;
       Cache_Expiration : in Swagger.Nullable_Integer;
       Enable_R_F_C7613_Usercase_Mapped_Profile : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Security_User_User_Configuration_Impl;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Segment_Azure_Azure_Segment_Store_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Account_Name : in Swagger.Nullable_UString;
       Container_Name : in Swagger.Nullable_UString;
       Access_Key : in Swagger.Nullable_UString;
       Root_Path : in Swagger.Nullable_UString;
       Connection_U_R_L : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Segment_Azure_Azure_Segment_Store_Service;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Segment_Segment_Node_Store_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Repository_Periodhome : in Swagger.Nullable_UString;
       Tarmk_Periodmode : in Swagger.Nullable_UString;
       Tarmk_Periodsize : in Swagger.Nullable_Integer;
       Segment_Cache_Periodsize : in Swagger.Nullable_Integer;
       String_Cache_Periodsize : in Swagger.Nullable_Integer;
       Template_Cache_Periodsize : in Swagger.Nullable_Integer;
       String_Deduplication_Cache_Periodsize : in Swagger.Nullable_Integer;
       Template_Deduplication_Cache_Periodsize : in Swagger.Nullable_Integer;
       Node_Deduplication_Cache_Periodsize : in Swagger.Nullable_Integer;
       Pause_Compaction : in Swagger.Nullable_Boolean;
       Compaction_Periodretry_Count : in Swagger.Nullable_Integer;
       Compaction_Periodforce_Periodtimeout : in Swagger.Nullable_Integer;
       Compaction_Periodsize_Delta_Estimation : in Swagger.Nullable_Integer;
       Compaction_Perioddisable_Estimation : in Swagger.Nullable_Boolean;
       Compaction_Periodretained_Generations : in Swagger.Nullable_Integer;
       Compaction_Periodmemory_Threshold : in Swagger.Nullable_Integer;
       Compaction_Periodprogress_Log : in Swagger.Nullable_Integer;
       Standby : in Swagger.Nullable_Boolean;
       Custom_Blob_Store : in Swagger.Nullable_Boolean;
       Custom_Segment_Store : in Swagger.Nullable_Boolean;
       Split_Persistence : in Swagger.Nullable_Boolean;
       Repository_Periodbackup_Perioddir : in Swagger.Nullable_UString;
       Blob_Gc_Max_Age_In_Secs : in Swagger.Nullable_Integer;
       Blob_Track_Snapshot_Interval_In_Secs : in Swagger.Nullable_Integer;
       Role : in Swagger.Nullable_UString;
       Register_Descriptors : in Swagger.Nullable_Boolean;
       Dispatch_Changes : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Segment_Segment_Node_Store_Factory;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Segment_Segment_Node_Store_Monitor_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Commits_Tracker_Writer_Groups : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Segment_Segment_Node_Store_Monitor_Service;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Segment_Segment_Node_Store_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Repository_Periodhome : in Swagger.Nullable_UString;
       Tarmk_Periodmode : in Swagger.Nullable_UString;
       Tarmk_Periodsize : in Swagger.Nullable_Integer;
       Segment_Cache_Periodsize : in Swagger.Nullable_Integer;
       String_Cache_Periodsize : in Swagger.Nullable_Integer;
       Template_Cache_Periodsize : in Swagger.Nullable_Integer;
       String_Deduplication_Cache_Periodsize : in Swagger.Nullable_Integer;
       Template_Deduplication_Cache_Periodsize : in Swagger.Nullable_Integer;
       Node_Deduplication_Cache_Periodsize : in Swagger.Nullable_Integer;
       Pause_Compaction : in Swagger.Nullable_Boolean;
       Compaction_Periodretry_Count : in Swagger.Nullable_Integer;
       Compaction_Periodforce_Periodtimeout : in Swagger.Nullable_Integer;
       Compaction_Periodsize_Delta_Estimation : in Swagger.Nullable_Integer;
       Compaction_Perioddisable_Estimation : in Swagger.Nullable_Boolean;
       Compaction_Periodretained_Generations : in Swagger.Nullable_Integer;
       Compaction_Periodmemory_Threshold : in Swagger.Nullable_Integer;
       Compaction_Periodprogress_Log : in Swagger.Nullable_Integer;
       Standby : in Swagger.Nullable_Boolean;
       Custom_Blob_Store : in Swagger.Nullable_Boolean;
       Custom_Segment_Store : in Swagger.Nullable_Boolean;
       Split_Persistence : in Swagger.Nullable_Boolean;
       Repository_Periodbackup_Perioddir : in Swagger.Nullable_UString;
       Blob_Gc_Max_Age_In_Secs : in Swagger.Nullable_Integer;
       Blob_Track_Snapshot_Interval_In_Secs : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Segment_Segment_Node_Store_Service;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Segment_Standby_Store_Standby_Store_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodinstaller_Periodconfiguration_Periodpersist : in Swagger.Nullable_Boolean;
       Mode : in Swagger.Nullable_UString;
       Port : in Swagger.Nullable_Integer;
       Primary_Periodhost : in Swagger.Nullable_UString;
       Interval : in Swagger.Nullable_Integer;
       Primary_Periodallowed_Client_Ip_Ranges : in Swagger.UString_Vectors.Vector;
       Secure : in Swagger.Nullable_Boolean;
       Standby_Periodreadtimeout : in Swagger.Nullable_Integer;
       Standby_Periodautoclean : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Segment_Standby_Store_Standby_Store_Service;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Spi_Security_Authentication_External_Impl_De
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Handler_Periodname : in Swagger.Nullable_UString;
       User_Periodexpiration_Time : in Swagger.Nullable_UString;
       User_Periodauto_Membership : in Swagger.UString_Vectors.Vector;
       User_Periodproperty_Mapping : in Swagger.UString_Vectors.Vector;
       User_Periodpath_Prefix : in Swagger.Nullable_UString;
       User_Periodmembership_Exp_Time : in Swagger.Nullable_UString;
       User_Periodmembership_Nesting_Depth : in Swagger.Nullable_Integer;
       User_Perioddynamic_Membership : in Swagger.Nullable_Boolean;
       User_Perioddisable_Missing : in Swagger.Nullable_Boolean;
       Group_Periodexpiration_Time : in Swagger.Nullable_UString;
       Group_Periodauto_Membership : in Swagger.UString_Vectors.Vector;
       Group_Periodproperty_Mapping : in Swagger.UString_Vectors.Vector;
       Group_Periodpath_Prefix : in Swagger.Nullable_UString;
       Enable_R_F_C7613_Usercase_Mapped_Profile : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Spi_Security_Authentication_External_Impl_De;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Spi_Security_Authentication_External_Impl_Ex
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Jaas_Periodranking : in Swagger.Nullable_Integer;
       Jaas_Periodcontrol_Flag : in Swagger.Nullable_UString;
       Jaas_Periodrealm_Name : in Swagger.Nullable_UString;
       Idp_Periodname : in Swagger.Nullable_UString;
       Sync_Periodhandler_Name : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Spi_Security_Authentication_External_Impl_Ex;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Spi_Security_Authentication_External_Impl_Pr
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Protect_External_Id : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Spi_Security_Authentication_External_Impl_Pr;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Spi_Security_Authorization_Cug_Impl_Cug_Confi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Cug_Supported_Paths : in Swagger.UString_Vectors.Vector;
       Cug_Enabled : in Swagger.Nullable_Boolean;
       Configuration_Ranking : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Spi_Security_Authorization_Cug_Impl_Cug_Confi;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Spi_Security_Authorization_Cug_Impl_Cug_Exclu
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Principal_Names : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Spi_Security_Authorization_Cug_Impl_Cug_Exclu;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Oak_Spi_Security_User_Action_Default_Authorizable
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled_Actions : in Swagger.Nullable_UString;
       User_Privilege_Names : in Swagger.UString_Vectors.Vector;
       Group_Privilege_Names : in Swagger.UString_Vectors.Vector;
       Constraint : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Oak_Spi_Security_User_Action_Default_Authorizable;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Vault_Packaging_Impl_Packaging_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Package_Roots : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Vault_Packaging_Impl_Packaging_Impl;

   --  
   overriding
   procedure Org_Apache_Jackrabbit_Vault_Packaging_Registry_Impl_F_S_Package_Registry
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Home_Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Jackrabbit_Vault_Packaging_Registry_Impl_F_S_Package_Registry;

   --  
   overriding
   procedure Org_Apache_Sling_Auth_Core_Impl_Logout_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodmethods : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodpaths : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingAuthCoreImplLogoutServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Auth_Core_Impl_Logout_Servlet;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Impl_Configuration_Bindings_Value_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Impl_Configuration_Bindings_Value_Provider;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Impl_Configuration_Resolver_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Config_Bucket_Names : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingCaconfigImplConfigurationResolverImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Impl_Configuration_Resolver_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Impl_Def_Default_Configuration_Inheritance_Stra
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Config_Property_Inheritance_Property_Names : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Impl_Def_Default_Configuration_Inheritance_Stra;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Impl_Def_Default_Configuration_Persistence_Stra
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Impl_Def_Default_Configuration_Persistence_Stra;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Impl_Override_Osgi_Configuration_Override_Provi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Description : in Swagger.Nullable_UString;
       Overrides : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Impl_Override_Osgi_Configuration_Override_Provi;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Impl_Override_System_Property_Configuration_Ove
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Impl_Override_System_Property_Configuration_Ove;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Management_Impl_Configuration_Management_Setti
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Ignore_Property_Name_Regex : in Swagger.UString_Vectors.Vector;
       Config_Collection_Properties_Resource_Names : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Management_Impl_Configuration_Management_Setti;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Resource_Impl_Def_Default_Configuration_Resour
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Config_Path : in Swagger.Nullable_UString;
       Fallback_Paths : in Swagger.UString_Vectors.Vector;
       Config_Collection_Inheritance_Property_Names : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Resource_Impl_Def_Default_Configuration_Resour;

   --  
   overriding
   procedure Org_Apache_Sling_Caconfig_Resource_Impl_Def_Default_Context_Path_Strategy
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Config_Ref_Resource_Names : in Swagger.UString_Vectors.Vector;
       Config_Ref_Property_Names : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Caconfig_Resource_Impl_Def_Default_Context_Path_Strategy;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Html_Internal_Tagsoup_Html_Parser
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Parser_Periodfeatures : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Html_Internal_Tagsoup_Html_Parser;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Log_Log_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodlevel : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodfile : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodfile_Periodnumber : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodfile_Periodsize : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodpattern : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodconfiguration_File : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodpackaging_Data_Enabled : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodmax_Caller_Data_Depth : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodmax_Old_File_Count_In_Dump : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodnum_Of_Lines : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingCommonsLogLogManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Log_Log_Manager;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Log_Log_Manager_Factory_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodlevel : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodfile : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodpattern : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodnames : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodadditiv : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Log_Log_Manager_Factory_Config;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Log_Log_Manager_Factory_Writer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodfile : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodfile_Periodnumber : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodfile_Periodsize : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodcommons_Periodlog_Periodfile_Periodbuffered : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Log_Log_Manager_Factory_Writer;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Metrics_Internal_Log_Reporter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Period : in Swagger.Nullable_Integer;
       Time_Unit : in Swagger.Nullable_UString;
       Level : in Swagger.Nullable_UString;
       Logger_Name : in Swagger.Nullable_UString;
       Prefix : in Swagger.Nullable_UString;
       Pattern : in Swagger.Nullable_UString;
       Registry_Name : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingCommonsMetricsInternalLogReporterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Metrics_Internal_Log_Reporter;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Metrics_Rrd4j_Impl_Codahale_Metrics_Reporter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Datasources : in Swagger.UString_Vectors.Vector;
       Step : in Swagger.Nullable_Integer;
       Archives : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Metrics_Rrd4j_Impl_Codahale_Metrics_Reporter;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Mime_Internal_Mime_Type_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Mime_Periodtypes : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Mime_Internal_Mime_Type_Service_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Scheduler_Impl_Quartz_Scheduler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Pool_Name : in Swagger.Nullable_UString;
       Allowed_Pool_Names : in Swagger.UString_Vectors.Vector;
       Scheduler_Perioduseleaderforsingle : in Swagger.Nullable_Boolean;
       Metrics_Periodfilters : in Swagger.UString_Vectors.Vector;
       Slow_Threshold_Millis : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Scheduler_Impl_Quartz_Scheduler;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Scheduler_Impl_Scheduler_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Periodquartz_Job_Periodduration_Periodacceptable : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Scheduler_Impl_Scheduler_Health_Check;

   --  
   overriding
   procedure Org_Apache_Sling_Commons_Threads_Impl_Default_Thread_Pool_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Min_Pool_Size : in Swagger.Nullable_Integer;
       Max_Pool_Size : in Swagger.Nullable_Integer;
       Queue_Size : in Swagger.Nullable_Integer;
       Max_Thread_Age : in Swagger.Nullable_Integer;
       Keep_Alive_Time : in Swagger.Nullable_Integer;
       Block_Policy : in Swagger.Nullable_UString;
       Shutdown_Graceful : in Swagger.Nullable_Boolean;
       Daemon : in Swagger.Nullable_Boolean;
       Shutdown_Wait_Time : in Swagger.Nullable_Integer;
       Priority : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Commons_Threads_Impl_Default_Thread_Pool_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Datasource_Data_Source_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Datasource_Periodname : in Swagger.Nullable_UString;
       Datasource_Periodsvc_Periodprop_Periodname : in Swagger.Nullable_UString;
       Driver_Class_Name : in Swagger.Nullable_UString;
       Url : in Swagger.Nullable_UString;
       Username : in Swagger.Nullable_UString;
       Password : in Swagger.Nullable_UString;
       Default_Auto_Commit : in Swagger.Nullable_UString;
       Default_Read_Only : in Swagger.Nullable_UString;
       Default_Transaction_Isolation : in Swagger.Nullable_UString;
       Default_Catalog : in Swagger.Nullable_UString;
       Max_Active : in Swagger.Nullable_Integer;
       Max_Idle : in Swagger.Nullable_Integer;
       Min_Idle : in Swagger.Nullable_Integer;
       Initial_Size : in Swagger.Nullable_Integer;
       Max_Wait : in Swagger.Nullable_Integer;
       Max_Age : in Swagger.Nullable_Integer;
       Test_On_Borrow : in Swagger.Nullable_Boolean;
       Test_On_Return : in Swagger.Nullable_Boolean;
       Test_While_Idle : in Swagger.Nullable_Boolean;
       Validation_Query : in Swagger.Nullable_UString;
       Validation_Query_Timeout : in Swagger.Nullable_Integer;
       Time_Between_Eviction_Runs_Millis : in Swagger.Nullable_Integer;
       Min_Evictable_Idle_Time_Millis : in Swagger.Nullable_Integer;
       Connection_Properties : in Swagger.Nullable_UString;
       Init_S_Q_L : in Swagger.Nullable_UString;
       Jdbc_Interceptors : in Swagger.Nullable_UString;
       Validation_Interval : in Swagger.Nullable_Integer;
       Log_Validation_Errors : in Swagger.Nullable_Boolean;
       Datasource_Periodsvc_Periodproperties : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingDatasourceDataSourceFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Datasource_Data_Source_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Datasource_J_N_D_I_Data_Source_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Datasource_Periodname : in Swagger.Nullable_UString;
       Datasource_Periodsvc_Periodprop_Periodname : in Swagger.Nullable_UString;
       Datasource_Periodjndi_Periodname : in Swagger.Nullable_UString;
       Jndi_Periodproperties : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Datasource_J_N_D_I_Data_Source_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Discovery_Oak_Config
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Connector_Ping_Timeout : in Swagger.Nullable_Integer;
       Connector_Ping_Interval : in Swagger.Nullable_Integer;
       Discovery_Lite_Check_Interval : in Swagger.Nullable_Integer;
       Cluster_Sync_Service_Timeout : in Swagger.Nullable_Integer;
       Cluster_Sync_Service_Interval : in Swagger.Nullable_Integer;
       Enable_Sync_Token : in Swagger.Nullable_Boolean;
       Min_Event_Delay : in Swagger.Nullable_Integer;
       Socket_Connect_Timeout : in Swagger.Nullable_Integer;
       So_Timeout : in Swagger.Nullable_Integer;
       Topology_Connector_Urls : in Swagger.UString_Vectors.Vector;
       Topology_Connector_Whitelist : in Swagger.UString_Vectors.Vector;
       Auto_Stop_Local_Loop_Enabled : in Swagger.Nullable_Boolean;
       Gzip_Connector_Requests_Enabled : in Swagger.Nullable_Boolean;
       Hmac_Enabled : in Swagger.Nullable_Boolean;
       Enable_Encryption : in Swagger.Nullable_Boolean;
       Shared_Key : in Swagger.Nullable_UString;
       Hmac_Shared_Key_T_T_L : in Swagger.Nullable_Integer;
       Backoff_Standby_Factor : in Swagger.Nullable_UString;
       Backoff_Stable_Factor : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDiscoveryOakConfigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Discovery_Oak_Config;

   --  
   overriding
   procedure Org_Apache_Sling_Discovery_Oak_Synchronized_Clocks_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodname : in Swagger.Nullable_UString;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Hc_Periodmbean_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Discovery_Oak_Synchronized_Clocks_Health_Check;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Agent_Impl_Forward_Distribution_Agent_Facto
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Title : in Swagger.Nullable_UString;
       Details : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Service_Name : in Swagger.Nullable_UString;
       Log_Periodlevel : in Swagger.Nullable_UString;
       Allowed_Periodroots : in Swagger.UString_Vectors.Vector;
       Queue_Periodprocessing_Periodenabled : in Swagger.Nullable_Boolean;
       Package_Importer_Periodendpoints : in Swagger.UString_Vectors.Vector;
       Passive_Queues : in Swagger.UString_Vectors.Vector;
       Priority_Queues : in Swagger.UString_Vectors.Vector;
       Retry_Periodstrategy : in Swagger.Nullable_UString;
       Retry_Periodattempts : in Swagger.Nullable_Integer;
       Request_Authorization_Strategy_Periodtarget : in Swagger.Nullable_UString;
       Transport_Secret_Provider_Periodtarget : in Swagger.Nullable_UString;
       Package_Builder_Periodtarget : in Swagger.Nullable_UString;
       Triggers_Periodtarget : in Swagger.Nullable_UString;
       Queue_Periodprovider : in Swagger.Nullable_UString;
       Async_Perioddelivery : in Swagger.Nullable_Boolean;
       Http_Periodconn_Periodtimeout : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Agent_Impl_Forward_Distribution_Agent_Facto;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Agent_Impl_Privilege_Distribution_Request_A
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Jcr_Privilege : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Agent_Impl_Privilege_Distribution_Request_A;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Agent_Impl_Queue_Distribution_Agent_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Title : in Swagger.Nullable_UString;
       Details : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Service_Name : in Swagger.Nullable_UString;
       Log_Periodlevel : in Swagger.Nullable_UString;
       Allowed_Periodroots : in Swagger.UString_Vectors.Vector;
       Request_Authorization_Strategy_Periodtarget : in Swagger.Nullable_UString;
       Queue_Provider_Factory_Periodtarget : in Swagger.Nullable_UString;
       Package_Builder_Periodtarget : in Swagger.Nullable_UString;
       Triggers_Periodtarget : in Swagger.Nullable_UString;
       Priority_Queues : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Agent_Impl_Queue_Distribution_Agent_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Agent_Impl_Reverse_Distribution_Agent_Facto
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Title : in Swagger.Nullable_UString;
       Details : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Service_Name : in Swagger.Nullable_UString;
       Log_Periodlevel : in Swagger.Nullable_UString;
       Queue_Periodprocessing_Periodenabled : in Swagger.Nullable_Boolean;
       Package_Exporter_Periodendpoints : in Swagger.UString_Vectors.Vector;
       Pull_Perioditems : in Swagger.Nullable_Integer;
       Http_Periodconn_Periodtimeout : in Swagger.Nullable_Integer;
       Request_Authorization_Strategy_Periodtarget : in Swagger.Nullable_UString;
       Transport_Secret_Provider_Periodtarget : in Swagger.Nullable_UString;
       Package_Builder_Periodtarget : in Swagger.Nullable_UString;
       Triggers_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Agent_Impl_Reverse_Distribution_Agent_Facto;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Agent_Impl_Simple_Distribution_Agent_Factor
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Title : in Swagger.Nullable_UString;
       Details : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Service_Name : in Swagger.Nullable_UString;
       Log_Periodlevel : in Swagger.Nullable_UString;
       Queue_Periodprocessing_Periodenabled : in Swagger.Nullable_Boolean;
       Package_Exporter_Periodtarget : in Swagger.Nullable_UString;
       Package_Importer_Periodtarget : in Swagger.Nullable_UString;
       Request_Authorization_Strategy_Periodtarget : in Swagger.Nullable_UString;
       Triggers_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Agent_Impl_Simple_Distribution_Agent_Factor;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Agent_Impl_Sync_Distribution_Agent_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Title : in Swagger.Nullable_UString;
       Details : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Service_Name : in Swagger.Nullable_UString;
       Log_Periodlevel : in Swagger.Nullable_UString;
       Queue_Periodprocessing_Periodenabled : in Swagger.Nullable_Boolean;
       Passive_Queues : in Swagger.UString_Vectors.Vector;
       Package_Exporter_Periodendpoints : in Swagger.UString_Vectors.Vector;
       Package_Importer_Periodendpoints : in Swagger.UString_Vectors.Vector;
       Retry_Periodstrategy : in Swagger.Nullable_UString;
       Retry_Periodattempts : in Swagger.Nullable_Integer;
       Pull_Perioditems : in Swagger.Nullable_Integer;
       Http_Periodconn_Periodtimeout : in Swagger.Nullable_Integer;
       Request_Authorization_Strategy_Periodtarget : in Swagger.Nullable_UString;
       Transport_Secret_Provider_Periodtarget : in Swagger.Nullable_UString;
       Package_Builder_Periodtarget : in Swagger.Nullable_UString;
       Triggers_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Agent_Impl_Sync_Distribution_Agent_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Monitor_Distribution_Queue_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodname : in Swagger.Nullable_UString;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Hc_Periodmbean_Periodname : in Swagger.Nullable_UString;
       Number_Of_Retries_Allowed : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Monitor_Distribution_Queue_Health_Check;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Packaging_Impl_Exporter_Agent_Distributio
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Queue : in Swagger.Nullable_UString;
       Drop_Periodinvalid_Perioditems : in Swagger.Nullable_Boolean;
       Agent_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Packaging_Impl_Exporter_Agent_Distributio;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Packaging_Impl_Exporter_Local_Distributio
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Package_Builder_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Packaging_Impl_Exporter_Local_Distributio;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Packaging_Impl_Exporter_Remote_Distributi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Endpoints : in Swagger.UString_Vectors.Vector;
       Pull_Perioditems : in Swagger.Nullable_Integer;
       Package_Builder_Periodtarget : in Swagger.Nullable_UString;
       Transport_Secret_Provider_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Packaging_Impl_Exporter_Remote_Distributi;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Packaging_Impl_Importer_Local_Distributio
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Package_Builder_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Packaging_Impl_Importer_Local_Distributio;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Packaging_Impl_Importer_Remote_Distributi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Endpoints : in Swagger.UString_Vectors.Vector;
       Transport_Secret_Provider_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Packaging_Impl_Importer_Remote_Distributi;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Packaging_Impl_Importer_Repository_Distri
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Service_Periodname : in Swagger.Nullable_UString;
       Path : in Swagger.Nullable_UString;
       Privilege_Periodname : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Packaging_Impl_Importer_Repository_Distri;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Resources_Impl_Distribution_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Provider_Periodroots : in Swagger.Nullable_UString;
       Kind : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Resources_Impl_Distribution_Configuration;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Resources_Impl_Distribution_Service_Resour
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Provider_Periodroots : in Swagger.Nullable_UString;
       Kind : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Resources_Impl_Distribution_Service_Resour;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Serialization_Impl_Distribution_Package_Bu
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       P_Type : in Swagger.Nullable_UString;
       Format_Periodtarget : in Swagger.Nullable_UString;
       Temp_Fs_Folder : in Swagger.Nullable_UString;
       File_Threshold : in Swagger.Nullable_Integer;
       Memory_Unit : in Swagger.Nullable_UString;
       Use_Off_Heap_Memory : in Swagger.Nullable_Boolean;
       Digest_Algorithm : in Swagger.Nullable_UString;
       Monitoring_Queue_Size : in Swagger.Nullable_Integer;
       Cleanup_Delay : in Swagger.Nullable_Integer;
       Package_Periodfilters : in Swagger.UString_Vectors.Vector;
       Property_Periodfilters : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Serialization_Impl_Distribution_Package_Bu;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Serialization_Impl_Vlt_Vault_Distribution
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       P_Type : in Swagger.Nullable_UString;
       Import_Mode : in Swagger.Nullable_UString;
       Acl_Handling : in Swagger.Nullable_UString;
       Package_Periodroots : in Swagger.Nullable_UString;
       Package_Periodfilters : in Swagger.UString_Vectors.Vector;
       Property_Periodfilters : in Swagger.UString_Vectors.Vector;
       Temp_Fs_Folder : in Swagger.Nullable_UString;
       Use_Binary_References : in Swagger.Nullable_Boolean;
       Auto_Save_Threshold : in Swagger.Nullable_Integer;
       Cleanup_Delay : in Swagger.Nullable_Integer;
       File_Threshold : in Swagger.Nullable_Integer;
       M_E_G_A_B_Y_T_E_S : in Swagger.Nullable_UString;
       Use_Off_Heap_Memory : in Swagger.Nullable_Boolean;
       Digest_Algorithm : in Swagger.Nullable_UString;
       Monitoring_Queue_Size : in Swagger.Nullable_Integer;
       Paths_Mapping : in Swagger.UString_Vectors.Vector;
       Strict_Import : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Serialization_Impl_Vlt_Vault_Distribution;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Transport_Impl_User_Credentials_Distributi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Username : in Swagger.Nullable_UString;
       Password : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Transport_Impl_User_Credentials_Distributi;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Trigger_Impl_Distribution_Event_Distribute
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Trigger_Impl_Distribution_Event_Distribute;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Trigger_Impl_Jcr_Event_Distribution_Trigger
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Path : in Swagger.Nullable_UString;
       Ignored_Paths_Patterns : in Swagger.UString_Vectors.Vector;
       Service_Name : in Swagger.Nullable_UString;
       Deep : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Trigger_Impl_Jcr_Event_Distribution_Trigger;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Trigger_Impl_Persisted_Jcr_Event_Distributi
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Path : in Swagger.Nullable_UString;
       Service_Name : in Swagger.Nullable_UString;
       Nuggets_Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Trigger_Impl_Persisted_Jcr_Event_Distributi;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Trigger_Impl_Remote_Event_Distribution_Trig
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Endpoint : in Swagger.Nullable_UString;
       Transport_Secret_Provider_Periodtarget : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Trigger_Impl_Remote_Event_Distribution_Trig;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Trigger_Impl_Resource_Event_Distribution_Tr
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Trigger_Impl_Resource_Event_Distribution_Tr;

   --  
   overriding
   procedure Org_Apache_Sling_Distribution_Trigger_Impl_Scheduled_Distribution_Trigge
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Path : in Swagger.Nullable_UString;
       Seconds : in Swagger.Nullable_UString;
       Service_Name : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Distribution_Trigger_Impl_Scheduled_Distribution_Trigge;

   --  
   overriding
   procedure Org_Apache_Sling_Engine_Impl_Auth_Sling_Authenticator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Osgi_Periodhttp_Periodwhiteboard_Periodcontext_Periodselect : in Swagger.Nullable_UString;
       Osgi_Periodhttp_Periodwhiteboard_Periodlistener : in Swagger.Nullable_UString;
       Auth_Periodsudo_Periodcookie : in Swagger.Nullable_UString;
       Auth_Periodsudo_Periodparameter : in Swagger.Nullable_UString;
       Auth_Periodannonymous : in Swagger.Nullable_Boolean;
       Sling_Periodauth_Periodrequirements : in Swagger.UString_Vectors.Vector;
       Sling_Periodauth_Periodanonymous_Perioduser : in Swagger.Nullable_UString;
       Sling_Periodauth_Periodanonymous_Periodpassword : in Swagger.Nullable_UString;
       Auth_Periodhttp : in Swagger.Nullable_UString;
       Auth_Periodhttp_Periodrealm : in Swagger.Nullable_UString;
       Auth_Perioduri_Periodsuffix : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Engine_Impl_Auth_Sling_Authenticator;

   --  
   overriding
   procedure Org_Apache_Sling_Engine_Impl_Debug_Request_Progress_Tracker_Log_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Extensions : in Swagger.UString_Vectors.Vector;
       Min_Duration_Ms : in Swagger.Nullable_Integer;
       Max_Duration_Ms : in Swagger.Nullable_Integer;
       Compact_Log_Format : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Engine_Impl_Debug_Request_Progress_Tracker_Log_Filter;

   --  
   overriding
   procedure Org_Apache_Sling_Engine_Impl_Log_Request_Logger
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Request_Periodlog_Periodoutput : in Swagger.Nullable_UString;
       Request_Periodlog_Periodoutputtype : in Swagger.Nullable_Integer;
       Request_Periodlog_Periodenabled : in Swagger.Nullable_Boolean;
       Access_Periodlog_Periodoutput : in Swagger.Nullable_UString;
       Access_Periodlog_Periodoutputtype : in Swagger.Nullable_Integer;
       Access_Periodlog_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingEngineImplLogRequestLoggerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Engine_Impl_Log_Request_Logger;

   --  
   overriding
   procedure Org_Apache_Sling_Engine_Impl_Log_Request_Logger_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Request_Periodlog_Periodservice_Periodformat : in Swagger.Nullable_UString;
       Request_Periodlog_Periodservice_Periodoutput : in Swagger.Nullable_UString;
       Request_Periodlog_Periodservice_Periodoutputtype : in Swagger.Nullable_Integer;
       Request_Periodlog_Periodservice_Periodonentry : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingEngineImplLogRequestLoggerServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Engine_Impl_Log_Request_Logger_Service;

   --  
   overriding
   procedure Org_Apache_Sling_Engine_Impl_Sling_Main_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodmax_Periodcalls : in Swagger.Nullable_Integer;
       Sling_Periodmax_Periodinclusions : in Swagger.Nullable_Integer;
       Sling_Periodtrace_Periodallow : in Swagger.Nullable_Boolean;
       Sling_Periodmax_Periodrecord_Periodrequests : in Swagger.Nullable_Integer;
       Sling_Periodstore_Periodpattern_Periodrequests : in Swagger.UString_Vectors.Vector;
       Sling_Periodserverinfo : in Swagger.Nullable_UString;
       Sling_Periodadditional_Periodresponse_Periodheaders : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingEngineImplSlingMainServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Engine_Impl_Sling_Main_Servlet;

   --  
   overriding
   procedure Org_Apache_Sling_Engine_Parameters
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Perioddefault_Periodparameter_Periodencoding : in Swagger.Nullable_UString;
       Sling_Perioddefault_Periodmax_Periodparameters : in Swagger.Nullable_Integer;
       File_Periodlocation : in Swagger.Nullable_UString;
       File_Periodthreshold : in Swagger.Nullable_Integer;
       File_Periodmax : in Swagger.Nullable_Integer;
       Request_Periodmax : in Swagger.Nullable_Integer;
       Sling_Perioddefault_Periodparameter_Periodcheck_For_Additional_Container_Parameters : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingEngineParametersInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Engine_Parameters;

   --  
   overriding
   procedure Org_Apache_Sling_Event_Impl_Eventing_Thread_Pool
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Min_Pool_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingEventImplEventingThreadPoolInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Event_Impl_Eventing_Thread_Pool;

   --  
   overriding
   procedure Org_Apache_Sling_Event_Impl_Jobs_Default_Job_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Queue_Periodpriority : in Swagger.Nullable_UString;
       Queue_Periodretries : in Swagger.Nullable_Integer;
       Queue_Periodretrydelay : in Swagger.Nullable_Integer;
       Queue_Periodmaxparallel : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingEventImplJobsDefaultJobManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Event_Impl_Jobs_Default_Job_Manager;

   --  
   overriding
   procedure Org_Apache_Sling_Event_Impl_Jobs_Jcr_Persistence_Handler
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Job_Periodconsumermanager_Perioddisable_Distribution : in Swagger.Nullable_Boolean;
       Startup_Perioddelay : in Swagger.Nullable_Integer;
       Cleanup_Periodperiod : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Event_Impl_Jobs_Jcr_Persistence_Handler;

   --  
   overriding
   procedure Org_Apache_Sling_Event_Impl_Jobs_Job_Consumer_Manager
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodinstaller_Periodconfiguration_Periodpersist : in Swagger.Nullable_Boolean;
       Job_Periodconsumermanager_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Job_Periodconsumermanager_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingEventImplJobsJobConsumerManagerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Event_Impl_Jobs_Job_Consumer_Manager;

   --  
   overriding
   procedure Org_Apache_Sling_Event_Jobs_Queue_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Queue_Periodname : in Swagger.Nullable_UString;
       Queue_Periodtopics : in Swagger.UString_Vectors.Vector;
       Queue_Periodtype : in Swagger.Nullable_UString;
       Queue_Periodpriority : in Swagger.Nullable_UString;
       Queue_Periodretries : in Swagger.Nullable_Integer;
       Queue_Periodretrydelay : in Swagger.Nullable_Integer;
       Queue_Periodmaxparallel : in Swagger.Number;
       Queue_Periodkeep_Jobs : in Swagger.Nullable_Boolean;
       Queue_Periodprefer_Run_On_Creation_Instance : in Swagger.Nullable_Boolean;
       Queue_Periodthread_Pool_Size : in Swagger.Nullable_Integer;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingEventJobsQueueConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Event_Jobs_Queue_Configuration;

   --  
   overriding
   procedure Org_Apache_Sling_Extensions_Webconsolesecurityprovider_Internal_Sling_W
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Users : in Swagger.UString_Vectors.Vector;
       Groups : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Extensions_Webconsolesecurityprovider_Internal_Sling_W;

   --  
   overriding
   procedure Org_Apache_Sling_Featureflags_Feature
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Description : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingFeatureflagsFeatureInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Featureflags_Feature;

   --  
   overriding
   procedure Org_Apache_Sling_Featureflags_Impl_Configured_Feature
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.Nullable_UString;
       Description : in Swagger.Nullable_UString;
       Enabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Featureflags_Impl_Configured_Feature;

   --  
   overriding
   procedure Org_Apache_Sling_Hapi_Impl_H_Api_Util_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodhapi_Periodtools_Periodresourcetype : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodhapi_Periodtools_Periodcollectionresourcetype : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodhapi_Periodtools_Periodsearchpaths : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodhapi_Periodtools_Periodexternalurl : in Swagger.Nullable_UString;
       Org_Periodapache_Periodsling_Periodhapi_Periodtools_Periodenabled : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingHapiImplHApiUtilImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Hapi_Impl_H_Api_Util_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Hc_Core_Impl_Composite_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodname : in Swagger.Nullable_UString;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Hc_Periodmbean_Periodname : in Swagger.Nullable_UString;
       Filter_Periodtags : in Swagger.UString_Vectors.Vector;
       Filter_Periodcombine_Tags_With_Or : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingHcCoreImplCompositeHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Hc_Core_Impl_Composite_Health_Check;

   --  
   overriding
   procedure Org_Apache_Sling_Hc_Core_Impl_Executor_Health_Check_Executor_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Timeout_In_Ms : in Swagger.Nullable_Integer;
       Long_Running_Future_Threshold_For_Critical_Ms : in Swagger.Nullable_Integer;
       Result_Cache_Ttl_In_Ms : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Hc_Core_Impl_Executor_Health_Check_Executor_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Hc_Core_Impl_Jmx_Attribute_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodname : in Swagger.Nullable_UString;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Hc_Periodmbean_Periodname : in Swagger.Nullable_UString;
       Mbean_Periodname : in Swagger.Nullable_UString;
       Attribute_Periodname : in Swagger.Nullable_UString;
       Attribute_Periodvalue_Periodconstraint : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Hc_Core_Impl_Jmx_Attribute_Health_Check;

   --  
   overriding
   procedure Org_Apache_Sling_Hc_Core_Impl_Scriptable_Health_Check
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Hc_Periodname : in Swagger.Nullable_UString;
       Hc_Periodtags : in Swagger.UString_Vectors.Vector;
       Hc_Periodmbean_Periodname : in Swagger.Nullable_UString;
       Expression : in Swagger.Nullable_UString;
       Language_Periodextension : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingHcCoreImplScriptableHealthCheckInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Hc_Core_Impl_Scriptable_Health_Check;

   --  
   overriding
   procedure Org_Apache_Sling_Hc_Core_Impl_Servlet_Health_Check_Executor_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Servlet_Path : in Swagger.Nullable_UString;
       Disabled : in Swagger.Nullable_Boolean;
       Cors_Periodaccess_Control_Allow_Origin : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Hc_Core_Impl_Servlet_Health_Check_Executor_Servlet;

   --  
   overriding
   procedure Org_Apache_Sling_Hc_Core_Impl_Servlet_Result_Txt_Verbose_Serializer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Total_Width : in Swagger.Nullable_Integer;
       Col_Width_Name : in Swagger.Nullable_Integer;
       Col_Width_Result : in Swagger.Nullable_Integer;
       Col_Width_Timing : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Hc_Core_Impl_Servlet_Result_Txt_Verbose_Serializer;

   --  
   overriding
   procedure Org_Apache_Sling_I18n_Impl_I18_N_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Sling_Periodfilter_Periodscope : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingI18nImplI18NFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_I18n_Impl_I18_N_Filter;

   --  
   overriding
   procedure Org_Apache_Sling_I18n_Impl_Jcr_Resource_Bundle_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Locale_Perioddefault : in Swagger.Nullable_UString;
       Preload_Periodbundles : in Swagger.Nullable_Boolean;
       Invalidation_Perioddelay : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingI18nImplJcrResourceBundleProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_I18n_Impl_Jcr_Resource_Bundle_Provider;

   --  
   overriding
   procedure Org_Apache_Sling_Installer_Provider_Jcr_Impl_Jcr_Installer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Handler_Periodschemes : in Swagger.UString_Vectors.Vector;
       Sling_Periodjcrinstall_Periodfolder_Periodname_Periodregexp : in Swagger.Nullable_UString;
       Sling_Periodjcrinstall_Periodfolder_Periodmax_Perioddepth : in Swagger.Nullable_Integer;
       Sling_Periodjcrinstall_Periodsearch_Periodpath : in Swagger.UString_Vectors.Vector;
       Sling_Periodjcrinstall_Periodnew_Periodconfig_Periodpath : in Swagger.Nullable_UString;
       Sling_Periodjcrinstall_Periodsignal_Periodpath : in Swagger.Nullable_UString;
       Sling_Periodjcrinstall_Periodenable_Periodwriteback : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Installer_Provider_Jcr_Impl_Jcr_Installer;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Base_Internal_Login_Admin_Whitelist
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Whitelist_Periodbypass : in Swagger.Nullable_Boolean;
       Whitelist_Periodbundles_Periodregexp : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Base_Internal_Login_Admin_Whitelist;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Base_Internal_Login_Admin_Whitelist_Fragment
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Whitelist_Periodname : in Swagger.Nullable_UString;
       Whitelist_Periodbundles : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Base_Internal_Login_Admin_Whitelist_Fragment;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Davex_Impl_Servlets_Sling_Dav_Ex_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Alias : in Swagger.Nullable_UString;
       Dav_Periodcreate_Absolute_Uri : in Swagger.Nullable_Boolean;
       Dav_Periodprotectedhandlers : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Davex_Impl_Servlets_Sling_Dav_Ex_Servlet;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Jackrabbit_Server_Jndi_Registration_Support
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Java_Periodnaming_Periodfactory_Periodinitial : in Swagger.Nullable_UString;
       Java_Periodnaming_Periodprovider_Periodurl : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Jackrabbit_Server_Jndi_Registration_Support;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Jackrabbit_Server_Rmi_Registration_Support
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Port : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Jackrabbit_Server_Rmi_Registration_Support;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Repoinit_Impl_Repository_Initializer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       References : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Repoinit_Impl_Repository_Initializer;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Repoinit_Repository_Initializer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       References : in Swagger.UString_Vectors.Vector;
       Scripts : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingJcrRepoinitRepositoryInitializerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Repoinit_Repository_Initializer;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Resource_Internal_Jcr_Resource_Resolver_Factory_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Periodsearchpath : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Periodmanglenamespaces : in Swagger.Nullable_Boolean;
       Resource_Periodresolver_Periodallow_Direct : in Swagger.Nullable_Boolean;
       Resource_Periodresolver_Periodrequired_Periodproviders : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Periodrequired_Periodprovidernames : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Periodvirtual : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Periodmapping : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Periodmap_Periodlocation : in Swagger.Nullable_UString;
       Resource_Periodresolver_Periodmap_Periodobservation : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Perioddefault_Periodvanity_Periodredirect_Periodstatus : in Swagger.Nullable_Integer;
       Resource_Periodresolver_Periodenable_Periodvanitypath : in Swagger.Nullable_Boolean;
       Resource_Periodresolver_Periodvanitypath_Periodmax_Entries : in Swagger.Nullable_Integer;
       Resource_Periodresolver_Periodvanitypath_Periodmax_Entries_Periodstartup : in Swagger.Nullable_Boolean;
       Resource_Periodresolver_Periodvanitypath_Periodbloomfilter_Periodmax_Bytes : in Swagger.Nullable_Integer;
       Resource_Periodresolver_Periodoptimize_Periodalias_Periodresolution : in Swagger.Nullable_Boolean;
       Resource_Periodresolver_Periodvanitypath_Periodwhitelist : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Periodvanitypath_Periodblacklist : in Swagger.UString_Vectors.Vector;
       Resource_Periodresolver_Periodvanity_Periodprecedence : in Swagger.Nullable_Boolean;
       Resource_Periodresolver_Periodproviderhandling_Periodparanoid : in Swagger.Nullable_Boolean;
       Resource_Periodresolver_Periodlog_Periodclosing : in Swagger.Nullable_Boolean;
       Resource_Periodresolver_Periodlog_Periodunclosed : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Resource_Internal_Jcr_Resource_Resolver_Factory_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Resource_Internal_Jcr_System_User_Validator
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Allow_Periodonly_Periodsystem_Perioduser : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Resource_Internal_Jcr_System_User_Validator;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Resourcesecurity_Impl_Resource_Access_Gate_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Path : in Swagger.Nullable_UString;
       Checkpath_Periodprefix : in Swagger.Nullable_UString;
       Jcr_Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Resourcesecurity_Impl_Resource_Access_Gate_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Webdav_Impl_Handler_Default_Handler_Service
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Type_Periodcollections : in Swagger.Nullable_UString;
       Type_Periodnoncollections : in Swagger.Nullable_UString;
       Type_Periodcontent : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Webdav_Impl_Handler_Default_Handler_Service;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Webdav_Impl_Handler_Dir_Listing_Export_Handler_Servic
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Webdav_Impl_Handler_Dir_Listing_Export_Handler_Servic;

   --  
   overriding
   procedure Org_Apache_Sling_Jcr_Webdav_Impl_Servlets_Simple_Web_Dav_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Dav_Periodroot : in Swagger.Nullable_UString;
       Dav_Periodcreate_Absolute_Uri : in Swagger.Nullable_Boolean;
       Dav_Periodrealm : in Swagger.Nullable_UString;
       Collection_Periodtypes : in Swagger.UString_Vectors.Vector;
       Filter_Periodprefixes : in Swagger.UString_Vectors.Vector;
       Filter_Periodtypes : in Swagger.Nullable_UString;
       Filter_Perioduris : in Swagger.Nullable_UString;
       Type_Periodcollections : in Swagger.Nullable_UString;
       Type_Periodnoncollections : in Swagger.Nullable_UString;
       Type_Periodcontent : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jcr_Webdav_Impl_Servlets_Simple_Web_Dav_Servlet;

   --  
   overriding
   procedure Org_Apache_Sling_Jmx_Provider_Impl_J_M_X_Resource_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Provider_Periodroots : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingJmxProviderImplJMXResourceProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Jmx_Provider_Impl_J_M_X_Resource_Provider;

   --  
   overriding
   procedure Org_Apache_Sling_Models_Impl_Model_Adapter_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Osgi_Periodhttp_Periodwhiteboard_Periodlistener : in Swagger.Nullable_UString;
       Osgi_Periodhttp_Periodwhiteboard_Periodcontext_Periodselect : in Swagger.Nullable_UString;
       Max_Periodrecursion_Perioddepth : in Swagger.Nullable_Integer;
       Cleanup_Periodjob_Periodperiod : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingModelsImplModelAdapterFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Models_Impl_Model_Adapter_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Models_Jacksonexporter_Impl_Resource_Module_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Max_Periodrecursion_Periodlevels : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Models_Jacksonexporter_Impl_Resource_Module_Provider;

   --  
   overriding
   procedure Org_Apache_Sling_Resource_Inventory_Impl_Resource_Inventory_Printer_Facto
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Felix_Periodinventory_Periodprinter_Periodname : in Swagger.Nullable_UString;
       Felix_Periodinventory_Periodprinter_Periodtitle : in Swagger.Nullable_UString;
       Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Resource_Inventory_Impl_Resource_Inventory_Printer_Facto;

   --  
   overriding
   procedure Org_Apache_Sling_Resourcemerger_Impl_Merged_Resource_Provider_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Merge_Periodroot : in Swagger.Nullable_UString;
       Merge_Periodread_Only : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Resourcemerger_Impl_Merged_Resource_Provider_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Resourcemerger_Picker_Overriding
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Merge_Periodroot : in Swagger.Nullable_UString;
       Merge_Periodread_Only : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingResourcemergerPickerOverridingInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Resourcemerger_Picker_Overriding;

   --  
   overriding
   procedure Org_Apache_Sling_Scripting_Core_Impl_Script_Cache_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodscripting_Periodcache_Periodsize : in Swagger.Nullable_Integer;
       Org_Periodapache_Periodsling_Periodscripting_Periodcache_Periodadditional_Extensions : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingScriptingCoreImplScriptCacheImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Scripting_Core_Impl_Script_Cache_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Scripting_Core_Impl_Scripting_Resource_Resolver_Provider
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Log_Periodstacktrace_Periodonclose : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Scripting_Core_Impl_Scripting_Resource_Resolver_Provider;

   --  
   overriding
   procedure Org_Apache_Sling_Scripting_Java_Impl_Java_Script_Engine_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Java_Periodclassdebuginfo : in Swagger.Nullable_Boolean;
       Java_Periodjava_Encoding : in Swagger.Nullable_UString;
       Java_Periodcompiler_Source_V_M : in Swagger.Nullable_UString;
       Java_Periodcompiler_Target_V_M : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Scripting_Java_Impl_Java_Script_Engine_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Scripting_Javascript_Internal_Rhino_Java_Script_Engine_Fa
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodscripting_Periodjavascript_Periodrhino_Periodopt_Level : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Scripting_Javascript_Internal_Rhino_Java_Script_Engine_Fa;

   --  
   overriding
   procedure Org_Apache_Sling_Scripting_Jsp_Jsp_Script_Engine_Factory
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Jasper_Periodcompiler_Target_V_M : in Swagger.Nullable_UString;
       Jasper_Periodcompiler_Source_V_M : in Swagger.Nullable_UString;
       Jasper_Periodclassdebuginfo : in Swagger.Nullable_Boolean;
       Jasper_Periodenable_Pooling : in Swagger.Nullable_Boolean;
       Jasper_Periodie_Class_Id : in Swagger.Nullable_UString;
       Jasper_Periodgen_String_As_Char_Array : in Swagger.Nullable_Boolean;
       Jasper_Periodkeepgenerated : in Swagger.Nullable_Boolean;
       Jasper_Periodmappedfile : in Swagger.Nullable_Boolean;
       Jasper_Periodtrim_Spaces : in Swagger.Nullable_Boolean;
       Jasper_Perioddisplay_Source_Fragments : in Swagger.Nullable_Boolean;
       Default_Periodis_Periodsession : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Scripting_Jsp_Jsp_Script_Engine_Factory;

   --  
   overriding
   procedure Org_Apache_Sling_Scripting_Sightly_Js_Impl_Jsapi_Sly_Bindings_Values_Prov
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Org_Periodapache_Periodsling_Periodscripting_Periodsightly_Periodjs_Periodbindings : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Scripting_Sightly_Js_Impl_Jsapi_Sly_Bindings_Values_Prov;

   --  
   overriding
   procedure Org_Apache_Sling_Security_Impl_Content_Disposition_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodcontent_Perioddisposition_Periodpaths : in Swagger.UString_Vectors.Vector;
       Sling_Periodcontent_Perioddisposition_Periodexcluded_Periodpaths : in Swagger.UString_Vectors.Vector;
       Sling_Periodcontent_Perioddisposition_Periodall_Periodpaths : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingSecurityImplContentDispositionFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Security_Impl_Content_Disposition_Filter;

   --  
   overriding
   procedure Org_Apache_Sling_Security_Impl_Referrer_Filter
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Allow_Periodempty : in Swagger.Nullable_Boolean;
       Allow_Periodhosts : in Swagger.UString_Vectors.Vector;
       Allow_Periodhosts_Periodregexp : in Swagger.UString_Vectors.Vector;
       Filter_Periodmethods : in Swagger.UString_Vectors.Vector;
       Exclude_Periodagents_Periodregexp : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingSecurityImplReferrerFilterInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Security_Impl_Referrer_Filter;

   --  
   overriding
   procedure Org_Apache_Sling_Serviceusermapping_Impl_Service_User_Mapper_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       User_Periodmapping : in Swagger.UString_Vectors.Vector;
       User_Perioddefault : in Swagger.Nullable_UString;
       User_Periodenable_Perioddefault_Periodmapping : in Swagger.Nullable_Boolean;
       Require_Periodvalidation : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Serviceusermapping_Impl_Service_User_Mapper_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Serviceusermapping_Impl_Service_User_Mapper_Impl_Amended
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       User_Periodmapping : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Serviceusermapping_Impl_Service_User_Mapper_Impl_Amended;

   --  
   overriding
   procedure Org_Apache_Sling_Servlets_Get_Default_Get_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Aliases : in Swagger.UString_Vectors.Vector;
       Index : in Swagger.Nullable_Boolean;
       Index_Periodfiles : in Swagger.UString_Vectors.Vector;
       Enable_Periodhtml : in Swagger.Nullable_Boolean;
       Enable_Periodjson : in Swagger.Nullable_Boolean;
       Enable_Periodtxt : in Swagger.Nullable_Boolean;
       Enable_Periodxml : in Swagger.Nullable_Boolean;
       Json_Periodmaximumresults : in Swagger.Nullable_Integer;
       Ecma_Suport : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingServletsGetDefaultGetServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Servlets_Get_Default_Get_Servlet;

   --  
   overriding
   procedure Org_Apache_Sling_Servlets_Get_Impl_Version_Version_Info_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodservlet_Periodselectors : in Swagger.UString_Vectors.Vector;
       Ecma_Suport : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Servlets_Get_Impl_Version_Version_Info_Servlet;

   --  
   overriding
   procedure Org_Apache_Sling_Servlets_Post_Impl_Helper_Chunk_Clean_Up_Task
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Scheduler_Periodexpression : in Swagger.Nullable_UString;
       Scheduler_Periodconcurrent : in Swagger.Nullable_Boolean;
       Chunk_Periodcleanup_Periodage : in Swagger.Nullable_Integer;
       Result  : out .Models.OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Servlets_Post_Impl_Helper_Chunk_Clean_Up_Task;

   --  
   overriding
   procedure Org_Apache_Sling_Servlets_Post_Impl_Sling_Post_Servlet
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Servlet_Periodpost_Perioddate_Formats : in Swagger.UString_Vectors.Vector;
       Servlet_Periodpost_Periodnode_Name_Hints : in Swagger.UString_Vectors.Vector;
       Servlet_Periodpost_Periodnode_Name_Max_Length : in Swagger.Nullable_Integer;
       Servlet_Periodpost_Periodcheckin_New_Versionable_Nodes : in Swagger.Nullable_Boolean;
       Servlet_Periodpost_Periodauto_Checkout : in Swagger.Nullable_Boolean;
       Servlet_Periodpost_Periodauto_Checkin : in Swagger.Nullable_Boolean;
       Servlet_Periodpost_Periodignore_Pattern : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingServletsPostImplSlingPostServletInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Servlets_Post_Impl_Sling_Post_Servlet;

   --  
   overriding
   procedure Org_Apache_Sling_Servlets_Resolver_Sling_Servlet_Resolver
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Servletresolver_Periodservlet_Root : in Swagger.Nullable_UString;
       Servletresolver_Periodcache_Size : in Swagger.Nullable_Integer;
       Servletresolver_Periodpaths : in Swagger.UString_Vectors.Vector;
       Servletresolver_Perioddefault_Extensions : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingServletsResolverSlingServletResolverInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Servlets_Resolver_Sling_Servlet_Resolver;

   --  
   overriding
   procedure Org_Apache_Sling_Settings_Impl_Sling_Settings_Service_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Sling_Periodname : in Swagger.Nullable_UString;
       Sling_Perioddescription : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Settings_Impl_Sling_Settings_Service_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Startupfilter_Impl_Startup_Filter_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Active_Periodby_Perioddefault : in Swagger.Nullable_Boolean;
       Default_Periodmessage : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingStartupfilterImplStartupFilterImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Startupfilter_Impl_Startup_Filter_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Tenant_Internal_Tenant_Provider_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Tenant_Periodroot : in Swagger.Nullable_UString;
       Tenant_Periodpath_Periodmatcher : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.OrgApacheSlingTenantInternalTenantProviderImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Tenant_Internal_Tenant_Provider_Impl;

   --  
   overriding
   procedure Org_Apache_Sling_Tracer_Internal_Log_Tracer
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Tracer_Sets : in Swagger.UString_Vectors.Vector;
       Enabled : in Swagger.Nullable_Boolean;
       Servlet_Enabled : in Swagger.Nullable_Boolean;
       Recording_Cache_Size_In_M_B : in Swagger.Nullable_Integer;
       Recording_Cache_Duration_In_Secs : in Swagger.Nullable_Integer;
       Recording_Compression_Enabled : in Swagger.Nullable_Boolean;
       Gzip_Response : in Swagger.Nullable_Boolean;
       Result  : out .Models.OrgApacheSlingTracerInternalLogTracerInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Tracer_Internal_Log_Tracer;

   --  
   overriding
   procedure Org_Apache_Sling_Xss_Impl_X_S_S_Filter_Impl
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Policy_Path : in Swagger.Nullable_UString;
       Result  : out .Models.OrgApacheSlingXssImplXSSFilterImplInfo_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Org_Apache_Sling_Xss_Impl_X_S_S_Filter_Impl;

end .Servers;
