(ns adobe-experience-manager-osgi-config-(aem)-api.api.configmgr
  (:require [adobe-experience-manager-osgi-config-(aem)-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn adaptive-form-and-interactive-communication-web-channel-configuration-with-http-info
  ""
  ([] (adaptive-form-and-interactive-communication-web-channel-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist show-placeholder maximum-cache-entries afscriptingcompatversion make-file-name-unique generating-compliant-data ]}]
   (call-api "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "showPlaceholder" show-placeholder "maximumCacheEntries" maximum-cache-entries "af.scripting.compatversion" afscriptingcompatversion "makeFileNameUnique" make-file-name-unique "generatingCompliantData" generating-compliant-data }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn adaptive-form-and-interactive-communication-web-channel-configuration
  ""
  ([] (adaptive-form-and-interactive-communication-web-channel-configuration nil))
  ([optional-params]
   (:data (adaptive-form-and-interactive-communication-web-channel-configuration-with-http-info optional-params))))

(defn adaptive-form-and-interactive-communication-web-channel-theme-configur-with-http-info
  ""
  ([] (adaptive-form-and-interactive-communication-web-channel-theme-configur-with-http-info nil))
  ([{:keys [post apply delete action location propertylist font-list ]}]
   (call-api "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fontList" (with-collection-format font-list :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn adaptive-form-and-interactive-communication-web-channel-theme-configur
  ""
  ([] (adaptive-form-and-interactive-communication-web-channel-theme-configur nil))
  ([optional-params]
   (:data (adaptive-form-and-interactive-communication-web-channel-theme-configur-with-http-info optional-params))))

(defn analytics-component-query-cache-service-with-http-info
  ""
  ([] (analytics-component-query-cache-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqanalyticscomponentquerycachesize ]}]
   (call-api "/system/console/configMgr/Analytics Component Query Cache Service" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.analytics.component.query.cache.size" cqanalyticscomponentquerycachesize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn analytics-component-query-cache-service
  ""
  ([] (analytics-component-query-cache-service nil))
  ([optional-params]
   (:data (analytics-component-query-cache-service-with-http-info optional-params))))

(defn apache-sling-health-check-result-html-serializer-with-http-info
  ""
  ([] (apache-sling-health-check-result-html-serializer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist style-string ]}]
   (call-api "/system/console/configMgr/Apache Sling Health Check Result HTML Serializer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "styleString" style-string }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn apache-sling-health-check-result-html-serializer
  ""
  ([] (apache-sling-health-check-result-html-serializer nil))
  ([optional-params]
   (:data (apache-sling-health-check-result-html-serializer-with-http-info optional-params))))

(defn com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-with-http-info
  ""
  ([] (com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist forms-manager-configinclude-ootb-templates forms-manager-configinclude-deprecated-templates ]}]
   (call-api "/system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "formsManagerConfig.includeOOTBTemplates" forms-manager-configinclude-ootb-templates "formsManagerConfig.includeDeprecatedTemplates" forms-manager-configinclude-deprecated-templates }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration
  ""
  ([] (com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration nil))
  ([optional-params]
   (:data (com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-with-http-info optional-params))))

(defn com-adobe-aem-transaction-core-impl-transaction-recorder-with-http-info
  ""
  ([] (com-adobe-aem-transaction-core-impl-transaction-recorder-with-http-info nil))
  ([{:keys [post apply delete action location propertylist is-transaction-recording-enabled ]}]
   (call-api "/system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "isTransactionRecordingEnabled" is-transaction-recording-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-aem-transaction-core-impl-transaction-recorder
  ""
  ([] (com-adobe-aem-transaction-core-impl-transaction-recorder nil))
  ([optional-params]
   (:data (com-adobe-aem-transaction-core-impl-transaction-recorder-with-http-info optional-params))))

(defn com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-with-http-info
  ""
  ([] (com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hcname hctags hcmbeanname ]}]
   (call-api "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.name" hcname "hc.tags" (with-collection-format hctags :multi) "hc.mbean.name" hcmbeanname }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc
  ""
  ([] (com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc nil))
  ([optional-params]
   (:data (com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-with-http-info optional-params))))

(defn com-adobe-aem-upgrade-prechecks-hc-impl-replication-agents-disabled-hc-with-http-info
  ""
  ([] (com-adobe-aem-upgrade-prechecks-hc-impl-replication-agents-disabled-hc-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hcname hctags hcmbeanname ]}]
   (call-api "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.name" hcname "hc.tags" (with-collection-format hctags :multi) "hc.mbean.name" hcmbeanname }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-aem-upgrade-prechecks-hc-impl-replication-agents-disabled-hc
  ""
  ([] (com-adobe-aem-upgrade-prechecks-hc-impl-replication-agents-disabled-hc nil))
  ([optional-params]
   (:data (com-adobe-aem-upgrade-prechecks-hc-impl-replication-agents-disabled-hc-with-http-info optional-params))))

(defn com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-with-http-info
  ""
  ([] (com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pre-upgrademaintenancetasks pre-upgradehctags ]}]
   (call-api "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "pre-upgrade.maintenance.tasks" (with-collection-format pre-upgrademaintenancetasks :multi) "pre-upgrade.hc.tags" (with-collection-format pre-upgradehctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl
  ""
  ([] (com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl nil))
  ([optional-params]
   (:data (com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-with-http-info optional-params))))

(defn com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-with-http-info
  ""
  ([] (com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist rootpath fixinconsistencies ]}]
   (call-api "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "root.path" rootpath "fix.inconsistencies" fixinconsistencies }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl
  ""
  ([] (com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl nil))
  ([optional-params]
   (:data (com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-with-http-info optional-params))))

(defn com-adobe-cq-account-api-account-management-service-with-http-info
  ""
  ([] (com-adobe-cq-account-api-account-management-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqaccountmanagertokenvalidityperiod cqaccountmanagerconfigrequestnewaccountmail cqaccountmanagerconfigrequestnewpwdmail ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.account.api.AccountManagementService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.accountmanager.token.validity.period" cqaccountmanagertokenvalidityperiod "cq.accountmanager.config.requestnewaccount.mail" cqaccountmanagerconfigrequestnewaccountmail "cq.accountmanager.config.requestnewpwd.mail" cqaccountmanagerconfigrequestnewpwdmail }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-account-api-account-management-service
  ""
  ([] (com-adobe-cq-account-api-account-management-service nil))
  ([optional-params]
   (:data (com-adobe-cq-account-api-account-management-service-with-http-info optional-params))))

(defn com-adobe-cq-account-impl-account-management-servlet-with-http-info
  ""
  ([] (com-adobe-cq-account-impl-account-management-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqaccountmanagerconfiginformnewaccountmail cqaccountmanagerconfiginformnewpwdmail ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.accountmanager.config.informnewaccount.mail" cqaccountmanagerconfiginformnewaccountmail "cq.accountmanager.config.informnewpwd.mail" cqaccountmanagerconfiginformnewpwdmail }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-account-impl-account-management-servlet
  ""
  ([] (com-adobe-cq-account-impl-account-management-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-account-impl-account-management-servlet-with-http-info optional-params))))

(defn com-adobe-cq-address-impl-location-location-list-servlet-with-http-info
  ""
  ([] (com-adobe-cq-address-impl-location-location-list-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqaddresslocationdefaultmax-results ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.address.location.default.maxResults" cqaddresslocationdefaultmax-results }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-address-impl-location-location-list-servlet
  ""
  ([] (com-adobe-cq-address-impl-location-location-list-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-address-impl-location-location-list-servlet-with-http-info optional-params))))

(defn com-adobe-cq-audit-purge-dam-with-http-info
  ""
  ([] (com-adobe-cq-audit-purge-dam-with-http-info nil))
  ([{:keys [post apply delete action location propertylist auditlogrulename auditlogrulecontentpath auditlogruleminimumage auditlogruletypes ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.audit.purge.Dam" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "auditlog.rule.name" auditlogrulename "auditlog.rule.contentpath" auditlogrulecontentpath "auditlog.rule.minimumage" auditlogruleminimumage "auditlog.rule.types" auditlogruletypes }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-audit-purge-dam
  ""
  ([] (com-adobe-cq-audit-purge-dam nil))
  ([optional-params]
   (:data (com-adobe-cq-audit-purge-dam-with-http-info optional-params))))

(defn com-adobe-cq-audit-purge-pages-with-http-info
  ""
  ([] (com-adobe-cq-audit-purge-pages-with-http-info nil))
  ([{:keys [post apply delete action location propertylist auditlogrulename auditlogrulecontentpath auditlogruleminimumage auditlogruletypes ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.audit.purge.Pages" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "auditlog.rule.name" auditlogrulename "auditlog.rule.contentpath" auditlogrulecontentpath "auditlog.rule.minimumage" auditlogruleminimumage "auditlog.rule.types" auditlogruletypes }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-audit-purge-pages
  ""
  ([] (com-adobe-cq-audit-purge-pages nil))
  ([optional-params]
   (:data (com-adobe-cq-audit-purge-pages-with-http-info optional-params))))

(defn com-adobe-cq-audit-purge-replication-with-http-info
  ""
  ([] (com-adobe-cq-audit-purge-replication-with-http-info nil))
  ([{:keys [post apply delete action location propertylist auditlogrulename auditlogrulecontentpath auditlogruleminimumage auditlogruletypes ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.audit.purge.Replication" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "auditlog.rule.name" auditlogrulename "auditlog.rule.contentpath" auditlogrulecontentpath "auditlog.rule.minimumage" auditlogruleminimumage "auditlog.rule.types" auditlogruletypes }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-audit-purge-replication
  ""
  ([] (com-adobe-cq-audit-purge-replication nil))
  ([optional-params]
   (:data (com-adobe-cq-audit-purge-replication-with-http-info optional-params))))

(defn com-adobe-cq-cdn-rewriter-impl-aws-cloud-front-rewriter-with-http-info
  ""
  ([] (com-adobe-cq-cdn-rewriter-impl-aws-cloud-front-rewriter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking keypairid keypairalias cdnrewriterattributes cdnrewriterdistributiondomain ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "keypair.id" keypairid "keypair.alias" keypairalias "cdnrewriter.attributes" (with-collection-format cdnrewriterattributes :multi) "cdn.rewriter.distribution.domain" cdnrewriterdistributiondomain }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-cdn-rewriter-impl-aws-cloud-front-rewriter
  ""
  ([] (com-adobe-cq-cdn-rewriter-impl-aws-cloud-front-rewriter nil))
  ([optional-params]
   (:data (com-adobe-cq-cdn-rewriter-impl-aws-cloud-front-rewriter-with-http-info optional-params))))

(defn com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cdnconfigdistributiondomain cdnconfigenablerewriting cdnconfigpathprefixes cdnconfigcdnttl cdnconfigapplicationprotocol ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cdn.config.distribution.domain" cdnconfigdistributiondomain "cdn.config.enable.rewriting" cdnconfigenablerewriting "cdn.config.path.prefixes" (with-collection-format cdnconfigpathprefixes :multi) "cdn.config.cdnttl" cdnconfigcdnttl "cdn.config.application.protocol" cdnconfigapplicationprotocol }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl
  ""
  ([] (com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-with-http-info
  ""
  ([] (com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking cdnrewriterattributes cdnrewriterdistributiondomain ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "cdnrewriter.attributes" (with-collection-format cdnrewriterattributes :multi) "cdn.rewriter.distribution.domain" cdnrewriterdistributiondomain }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-cdn-rewriter-impl-cdn-rewriter
  ""
  ([] (com-adobe-cq-cdn-rewriter-impl-cdn-rewriter nil))
  ([optional-params]
   (:data (com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-with-http-info optional-params))))

(defn com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle-with-http-info
  ""
  ([] (com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle-with-http-info nil))
  ([{:keys [post apply delete action location propertylist flushagents ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "flush.agents" (with-collection-format flushagents :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle
  ""
  ([] (com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle nil))
  ([optional-params]
   (:data (com-adobe-cq-cloudconfig-core-impl-configuration-replication-event-handle-with-http-info optional-params))))

(defn com-adobe-cq-commerce-impl-asset-dynamic-image-handler-with-http-info
  ""
  ([] (com-adobe-cq-commerce-impl-asset-dynamic-image-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqcommerceassethandleractive cqcommerceassethandlername ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.commerce.asset.handler.active" cqcommerceassethandleractive "cq.commerce.asset.handler.name" cqcommerceassethandlername }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-commerce-impl-asset-dynamic-image-handler
  ""
  ([] (com-adobe-cq-commerce-impl-asset-dynamic-image-handler nil))
  ([optional-params]
   (:data (com-adobe-cq-commerce-impl-asset-dynamic-image-handler-with-http-info optional-params))))

(defn com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl-with-http-info
  ""
  ([] (com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqcommerceassethandlerfallback ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.commerce.asset.handler.fallback" cqcommerceassethandlerfallback }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl
  ""
  ([] (com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl-with-http-info optional-params))))

(defn com-adobe-cq-commerce-impl-asset-static-image-handler-with-http-info
  ""
  ([] (com-adobe-cq-commerce-impl-asset-static-image-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqcommerceassethandleractive cqcommerceassethandlername ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.commerce.asset.handler.active" cqcommerceassethandleractive "cq.commerce.asset.handler.name" cqcommerceassethandlername }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-commerce-impl-asset-static-image-handler
  ""
  ([] (com-adobe-cq-commerce-impl-asset-static-image-handler nil))
  ([optional-params]
   (:data (com-adobe-cq-commerce-impl-asset-static-image-handler-with-http-info optional-params))))

(defn com-adobe-cq-commerce-impl-asset-video-handler-with-http-info
  ""
  ([] (com-adobe-cq-commerce-impl-asset-video-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqcommerceassethandleractive cqcommerceassethandlername ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.commerce.asset.handler.active" cqcommerceassethandleractive "cq.commerce.asset.handler.name" cqcommerceassethandlername }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-commerce-impl-asset-video-handler
  ""
  ([] (com-adobe-cq-commerce-impl-asset-video-handler nil))
  ([optional-params]
   (:data (com-adobe-cq-commerce-impl-asset-video-handler-with-http-info optional-params))))

(defn com-adobe-cq-commerce-impl-promotion-promotion-manager-impl-with-http-info
  ""
  ([] (com-adobe-cq-commerce-impl-promotion-promotion-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqcommercepromotionroot ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.commerce.promotion.root" cqcommercepromotionroot }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-commerce-impl-promotion-promotion-manager-impl
  ""
  ([] (com-adobe-cq-commerce-impl-promotion-promotion-manager-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-commerce-impl-promotion-promotion-manager-impl-with-http-info optional-params))))

(defn com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl-with-http-info
  ""
  ([] (com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqcommercecataloggeneratorbucketsize cqcommercecataloggeneratorbucketname cqcommercecataloggeneratorexcludedtemplateproperties ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.commerce.cataloggenerator.bucketsize" cqcommercecataloggeneratorbucketsize "cq.commerce.cataloggenerator.bucketname" cqcommercecataloggeneratorbucketname "cq.commerce.cataloggenerator.excludedtemplateproperties" (with-collection-format cqcommercecataloggeneratorexcludedtemplateproperties :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl
  ""
  ([] (com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl-with-http-info optional-params))))

(defn com-adobe-cq-commerce-pim-impl-page-event-listener-with-http-info
  ""
  ([] (com-adobe-cq-commerce-pim-impl-page-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqcommercepageeventlistenerenabled ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.commerce.pageeventlistener.enabled" cqcommercepageeventlistenerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-commerce-pim-impl-page-event-listener
  ""
  ([] (com-adobe-cq-commerce-pim-impl-page-event-listener nil))
  ([optional-params]
   (:data (com-adobe-cq-commerce-pim-impl-page-event-listener-with-http-info optional-params))))

(defn com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist feedgeneratoralgorithm ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "Feed generator algorithm" feedgeneratoralgorithm }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl
  ""
  ([] (com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-contentinsight-impl-reporting-services-settings-provider-with-http-info
  ""
  ([] (com-adobe-cq-contentinsight-impl-reporting-services-settings-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist reportingservicesurl ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "reportingservices.url" reportingservicesurl }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-contentinsight-impl-reporting-services-settings-provider
  ""
  ([] (com-adobe-cq-contentinsight-impl-reporting-services-settings-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-contentinsight-impl-reporting-services-settings-provider-with-http-info optional-params))))

(defn com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-with-http-info
  ""
  ([] (com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist brightedgeurl ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "brightedge.url" brightedgeurl }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet
  ""
  ([] (com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-with-http-info optional-params))))

(defn com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle-with-http-info
  ""
  ([] (com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle-with-http-info nil))
  ([{:keys [post apply delete action location propertylist reportingservicesproxywhitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "reportingservices.proxy.whitelist" (with-collection-format reportingservicesproxywhitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle
  ""
  ([] (com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle nil))
  ([optional-params]
   (:data (com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle-with-http-info optional-params))))

(defn com-adobe-cq-dam-cfm-impl-component-component-config-impl-with-http-info
  ""
  ([] (com-adobe-cq-dam-cfm-impl-component-component-config-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist damcfmcomponentresource-type damcfmcomponentfile-reference-prop damcfmcomponentelements-prop damcfmcomponentvariation-prop ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "dam.cfm.component.resourceType" damcfmcomponentresource-type "dam.cfm.component.fileReferenceProp" damcfmcomponentfile-reference-prop "dam.cfm.component.elementsProp" damcfmcomponentelements-prop "dam.cfm.component.variationProp" damcfmcomponentvariation-prop }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-cfm-impl-component-component-config-impl
  ""
  ([] (com-adobe-cq-dam-cfm-impl-component-component-config-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-cfm-impl-component-component-config-impl-with-http-info optional-params))))

(defn com-adobe-cq-dam-cfm-impl-conf-feature-config-impl-with-http-info
  ""
  ([] (com-adobe-cq-dam-cfm-impl-conf-feature-config-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist damcfmresource-types damcfmreference-properties ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "dam.cfm.resourceTypes" (with-collection-format damcfmresource-types :multi) "dam.cfm.referenceProperties" (with-collection-format damcfmreference-properties :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-cfm-impl-conf-feature-config-impl
  ""
  ([] (com-adobe-cq-dam-cfm-impl-conf-feature-config-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-cfm-impl-conf-feature-config-impl-with-http-info optional-params))))

(defn com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor-with-http-info
  ""
  ([] (com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pipelinetype ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "pipeline.type" pipelinetype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor
  ""
  ([] (com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor-with-http-info optional-params))))

(defn com-adobe-cq-dam-cfm-impl-content-rewriter-par-range-filter-with-http-info
  ""
  ([] (com-adobe-cq-dam-cfm-impl-content-rewriter-par-range-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pipelinetype ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "pipeline.type" pipelinetype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-cfm-impl-content-rewriter-par-range-filter
  ""
  ([] (com-adobe-cq-dam-cfm-impl-content-rewriter-par-range-filter nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-cfm-impl-content-rewriter-par-range-filter-with-http-info optional-params))))

(defn com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-with-http-info
  ""
  ([] (com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pipelinetype ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "pipeline.type" pipelinetype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter
  ""
  ([] (com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-with-http-info optional-params))))

(defn com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl-with-http-info
  ""
  ([] (com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist max-memory ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "maxMemory" max-memory }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl
  ""
  ([] (com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl-with-http-info optional-params))))

(defn com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-with-http-info
  ""
  ([] (com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-with-http-info nil))
  ([{:keys [post apply delete action location propertylist dmreplicateonmodifyenabled dmreplicateonmodifyforcesyncdeletes ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "dmreplicateonmodify.enabled" dmreplicateonmodifyenabled "dmreplicateonmodify.forcesyncdeletes" dmreplicateonmodifyforcesyncdeletes }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker
  ""
  ([] (com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-with-http-info optional-params))))

(defn com-adobe-cq-dam-mac-sync-helper-impl-mac-sync-client-impl-with-http-info
  ""
  ([] (com-adobe-cq-dam-mac-sync-helper-impl-mac-sync-client-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobedammacsyncclientsotimeout ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.dam.mac.sync.client.so.timeout" comadobedammacsyncclientsotimeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-mac-sync-helper-impl-mac-sync-client-impl
  ""
  ([] (com-adobe-cq-dam-mac-sync-helper-impl-mac-sync-client-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-mac-sync-helper-impl-mac-sync-client-impl-with-http-info optional-params))))

(defn com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobecqdammacsyncdamsyncserviceregistered-paths comadobecqdammacsyncdamsyncservicesyncrenditions comadobecqdammacsyncdamsyncservicereplicatethreadwaitms comadobecqdammacsyncdamsyncserviceplatform ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths" (with-collection-format comadobecqdammacsyncdamsyncserviceregistered-paths :multi) "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions" comadobecqdammacsyncdamsyncservicesyncrenditions "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms" comadobecqdammacsyncdamsyncservicereplicatethreadwaitms "com.adobe.cq.dam.mac.sync.damsyncservice.platform" comadobecqdammacsyncdamsyncserviceplatform }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl
  ""
  ([] (com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-dam-processor-nui-impl-nui-asset-processor-with-http-info
  ""
  ([] (com-adobe-cq-dam-processor-nui-impl-nui-asset-processor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist nui-enabled nui-service-url nui-api-key ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "nuiEnabled" nui-enabled "nuiServiceUrl" nui-service-url "nuiApiKey" nui-api-key }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-processor-nui-impl-nui-asset-processor
  ""
  ([] (com-adobe-cq-dam-processor-nui-impl-nui-asset-processor nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-processor-nui-impl-nui-asset-processor-with-http-info optional-params))))

(defn com-adobe-cq-dam-s7imaging-impl-is-image-server-component-with-http-info
  ""
  ([] (com-adobe-cq-dam-s7imaging-impl-is-image-server-component-with-http-info nil))
  ([{:keys [post apply delete action location propertylist tcp-port allow-remote-access max-render-rgn-pixels max-message-size random-access-url-timeout worker-threads ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "TcpPort" tcp-port "AllowRemoteAccess" allow-remote-access "MaxRenderRgnPixels" max-render-rgn-pixels "MaxMessageSize" max-message-size "RandomAccessUrlTimeout" random-access-url-timeout "WorkerThreads" worker-threads }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-s7imaging-impl-is-image-server-component
  ""
  ([] (com-adobe-cq-dam-s7imaging-impl-is-image-server-component nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-s7imaging-impl-is-image-server-component-with-http-info optional-params))))

(defn com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet-with-http-info
  ""
  ([] (com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cacheenable cacheroot-paths cachemax-size cachemax-entries ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cache.enable" cacheenable "cache.rootPaths" (with-collection-format cacheroot-paths :multi) "cache.maxSize" cachemax-size "cache.maxEntries" cachemax-entries }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet
  ""
  ([] (com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet-with-http-info optional-params))))

(defn com-adobe-cq-dam-webdav-impl-io-asset-io-handler-with-http-info
  ""
  ([] (com-adobe-cq-dam-webdav-impl-io-asset-io-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking path-prefix create-version ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "pathPrefix" path-prefix "createVersion" create-version }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-webdav-impl-io-asset-io-handler
  ""
  ([] (com-adobe-cq-dam-webdav-impl-io-asset-io-handler nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-webdav-impl-io-asset-io-handler-with-http-info optional-params))))

(defn com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job-with-http-info
  ""
  ([] (com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamwebdavversionlinkingenable cqdamwebdavversionlinkingschedulerperiod cqdamwebdavversionlinkingstagingtimeout ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.webdav.version.linking.enable" cqdamwebdavversionlinkingenable "cq.dam.webdav.version.linking.scheduler.period" cqdamwebdavversionlinkingschedulerperiod "cq.dam.webdav.version.linking.staging.timeout" cqdamwebdavversionlinkingstagingtimeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job
  ""
  ([] (com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job-with-http-info optional-params))))

(defn com-adobe-cq-dam-webdav-impl-io-special-files-handler-with-http-info
  ""
  ([] (com-adobe-cq-dam-webdav-impl-io-special-files-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comdaycqdamcoreimplio-special-files-handlerfilepatters ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters" (with-collection-format comdaycqdamcoreimplio-special-files-handlerfilepatters :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dam-webdav-impl-io-special-files-handler
  ""
  ([] (com-adobe-cq-dam-webdav-impl-io-special-files-handler nil))
  ([optional-params]
   (:data (com-adobe-cq-dam-webdav-impl-io-special-files-handler-with-http-info optional-params))))

(defn com-adobe-cq-deserfw-impl-deserialization-firewall-impl-with-http-info
  ""
  ([] (com-adobe-cq-deserfw-impl-deserialization-firewall-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist firewalldeserializationwhitelist firewalldeserializationblacklist firewalldeserializationdiagnostics ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "firewall.deserialization.whitelist" (with-collection-format firewalldeserializationwhitelist :multi) "firewall.deserialization.blacklist" (with-collection-format firewalldeserializationblacklist :multi) "firewall.deserialization.diagnostics" firewalldeserializationdiagnostics }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-deserfw-impl-deserialization-firewall-impl
  ""
  ([] (com-adobe-cq-deserfw-impl-deserialization-firewall-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-deserfw-impl-deserialization-firewall-impl-with-http-info optional-params))))

(defn com-adobe-cq-dtm-impl-service-dtm-web-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-dtm-impl-service-dtm-web-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist connectiontimeout sockettimeout ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "connection.timeout" connectiontimeout "socket.timeout" sockettimeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dtm-impl-service-dtm-web-service-impl
  ""
  ([] (com-adobe-cq-dtm-impl-service-dtm-web-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-dtm-impl-service-dtm-web-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-with-http-info
  ""
  ([] (com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist dtmstagingipwhitelist dtmproductionipwhitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "dtm.staging.ip.whitelist" (with-collection-format dtmstagingipwhitelist :multi) "dtm.production.ip.whitelist" (with-collection-format dtmproductionipwhitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet
  ""
  ([] (com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-with-http-info optional-params))))

(defn com-adobe-cq-dtm-reactor-impl-service-web-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-dtm-reactor-impl-service-web-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist endpoint-uri connection-timeout socket-timeout ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "endpointUri" endpoint-uri "connectionTimeout" connection-timeout "socketTimeout" socket-timeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-dtm-reactor-impl-service-web-service-impl
  ""
  ([] (com-adobe-cq-dtm-reactor-impl-service-web-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-dtm-reactor-impl-service-web-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-experiencelog-impl-experience-log-config-servlet-with-http-info
  ""
  ([] (com-adobe-cq-experiencelog-impl-experience-log-config-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled disabled-for-groups ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "disabledForGroups" (with-collection-format disabled-for-groups :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-experiencelog-impl-experience-log-config-servlet
  ""
  ([] (com-adobe-cq-experiencelog-impl-experience-log-config-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-experiencelog-impl-experience-log-config-servlet-with-http-info optional-params))))

(defn com-adobe-cq-hc-content-packages-health-check-with-http-info
  ""
  ([] (com-adobe-cq-hc-content-packages-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hcname hctags hcmbeanname packagenames ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.name" hcname "hc.tags" (with-collection-format hctags :multi) "hc.mbean.name" hcmbeanname "package.names" (with-collection-format packagenames :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-hc-content-packages-health-check
  ""
  ([] (com-adobe-cq-hc-content-packages-health-check nil))
  ([optional-params]
   (:data (com-adobe-cq-hc-content-packages-health-check-with-http-info optional-params))))

(defn com-adobe-cq-history-impl-history-request-filter-with-http-info
  ""
  ([] (com-adobe-cq-history-impl-history-request-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist historyrequest-filterexcluded-selectors historyrequest-filterexcluded-extensions ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "history.requestFilter.excludedSelectors" (with-collection-format historyrequest-filterexcluded-selectors :multi) "history.requestFilter.excludedExtensions" (with-collection-format historyrequest-filterexcluded-extensions :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-history-impl-history-request-filter
  ""
  ([] (com-adobe-cq-history-impl-history-request-filter nil))
  ([optional-params]
   (:data (com-adobe-cq-history-impl-history-request-filter-with-http-info optional-params))))

(defn com-adobe-cq-history-impl-history-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-history-impl-history-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist historyserviceresource-types historyservicepath-filter ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "history.service.resourceTypes" (with-collection-format historyserviceresource-types :multi) "history.service.pathFilter" (with-collection-format historyservicepath-filter :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-history-impl-history-service-impl
  ""
  ([] (com-adobe-cq-history-impl-history-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-history-impl-history-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-inbox-impl-typeprovider-item-type-provider-with-http-info
  ""
  ([] (com-adobe-cq-inbox-impl-typeprovider-item-type-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist inboximpltypeproviderregistrypaths inboximpltypeproviderlegacypaths inboximpltypeproviderdefaulturlfailureitem inboximpltypeproviderdefaulturlworkitem inboximpltypeproviderdefaulturltask ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "inbox.impl.typeprovider.registrypaths" (with-collection-format inboximpltypeproviderregistrypaths :multi) "inbox.impl.typeprovider.legacypaths" (with-collection-format inboximpltypeproviderlegacypaths :multi) "inbox.impl.typeprovider.defaulturl.failureitem" inboximpltypeproviderdefaulturlfailureitem "inbox.impl.typeprovider.defaulturl.workitem" inboximpltypeproviderdefaulturlworkitem "inbox.impl.typeprovider.defaulturl.task" inboximpltypeproviderdefaulturltask }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-inbox-impl-typeprovider-item-type-provider
  ""
  ([] (com-adobe-cq-inbox-impl-typeprovider-item-type-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-inbox-impl-typeprovider-item-type-provider-with-http-info optional-params))))

(defn com-adobe-cq-projects-impl-servlet-project-image-servlet-with-http-info
  ""
  ([] (com-adobe-cq-projects-impl-servlet-project-image-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist imagequality imagesupportedresolutions ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "image.quality" imagequality "image.supported.resolutions" imagesupportedresolutions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-projects-impl-servlet-project-image-servlet
  ""
  ([] (com-adobe-cq-projects-impl-servlet-project-image-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-projects-impl-servlet-project-image-servlet-with-http-info optional-params))))

(defn com-adobe-cq-projects-purge-scheduler-with-http-info
  ""
  ([] (com-adobe-cq-projects-purge-scheduler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist scheduledpurgename scheduledpurgepurge-active scheduledpurgetemplates scheduledpurgepurge-groups scheduledpurgepurge-assets scheduledpurgeterminate-running-workflows scheduledpurgedaysold scheduledpurgesave-threshold ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.projects.purge.Scheduler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduledpurge.name" scheduledpurgename "scheduledpurge.purgeActive" scheduledpurgepurge-active "scheduledpurge.templates" (with-collection-format scheduledpurgetemplates :multi) "scheduledpurge.purgeGroups" scheduledpurgepurge-groups "scheduledpurge.purgeAssets" scheduledpurgepurge-assets "scheduledpurge.terminateRunningWorkflows" scheduledpurgeterminate-running-workflows "scheduledpurge.daysold" scheduledpurgedaysold "scheduledpurge.saveThreshold" scheduledpurgesave-threshold }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-projects-purge-scheduler
  ""
  ([] (com-adobe-cq-projects-purge-scheduler nil))
  ([optional-params]
   (:data (com-adobe-cq-projects-purge-scheduler-with-http-info optional-params))))

(defn com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl-with-http-info
  ""
  ([] (com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist includepaths exporteruser ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "include.paths" (with-collection-format includepaths :multi) "exporter.user" exporteruser }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl
  ""
  ([] (com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl-with-http-info optional-params))))

(defn com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobecqscreensanalyticsimplurl comadobecqscreensanalyticsimplapikey comadobecqscreensanalyticsimplproject comadobecqscreensanalyticsimplenvironment comadobecqscreensanalyticsimplsend-frequency ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.cq.screens.analytics.impl.url" comadobecqscreensanalyticsimplurl "com.adobe.cq.screens.analytics.impl.apikey" comadobecqscreensanalyticsimplapikey "com.adobe.cq.screens.analytics.impl.project" comadobecqscreensanalyticsimplproject "com.adobe.cq.screens.analytics.impl.environment" comadobecqscreensanalyticsimplenvironment "com.adobe.cq.screens.analytics.impl.sendFrequency" comadobecqscreensanalyticsimplsend-frequency }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl
  ""
  ([] (com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-screens-device-impl-device-service-with-http-info
  ""
  ([] (com-adobe-cq-screens-device-impl-device-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobeaemscreensplayerpingfrequency comadobeaemscreensdevicepaswordspecialchars comadobeaemscreensdevicepaswordminlowercasechars comadobeaemscreensdevicepaswordminuppercasechars comadobeaemscreensdevicepaswordminnumberchars comadobeaemscreensdevicepaswordminspecialchars comadobeaemscreensdevicepaswordminlength ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.aem.screens.player.pingfrequency" comadobeaemscreensplayerpingfrequency "com.adobe.aem.screens.device.pasword.specialchars" comadobeaemscreensdevicepaswordspecialchars "com.adobe.aem.screens.device.pasword.minlowercasechars" comadobeaemscreensdevicepaswordminlowercasechars "com.adobe.aem.screens.device.pasword.minuppercasechars" comadobeaemscreensdevicepaswordminuppercasechars "com.adobe.aem.screens.device.pasword.minnumberchars" comadobeaemscreensdevicepaswordminnumberchars "com.adobe.aem.screens.device.pasword.minspecialchars" comadobeaemscreensdevicepaswordminspecialchars "com.adobe.aem.screens.device.pasword.minlength" comadobeaemscreensdevicepaswordminlength }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-device-impl-device-service
  ""
  ([] (com-adobe-cq-screens-device-impl-device-service nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-device-impl-device-service-with-http-info optional-params))))

(defn com-adobe-cq-screens-device-registration-impl-registration-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-screens-device-registration-impl-registration-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist device-registration-timeout ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "deviceRegistrationTimeout" device-registration-timeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-device-registration-impl-registration-service-impl
  ""
  ([] (com-adobe-cq-screens-device-registration-impl-registration-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-device-registration-impl-registration-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-screens-impl-handler-channels-update-handler-with-http-info
  ""
  ([] (com-adobe-cq-screens-impl-handler-channels-update-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqpagesupdatehandlerimageresourcetypes cqpagesupdatehandlerproductresourcetypes cqpagesupdatehandlervideoresourcetypes cqpagesupdatehandlerdynamicsequenceresourcetypes cqpagesupdatehandlerpreviewmodepaths ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.pagesupdatehandler.imageresourcetypes" (with-collection-format cqpagesupdatehandlerimageresourcetypes :multi) "cq.pagesupdatehandler.productresourcetypes" (with-collection-format cqpagesupdatehandlerproductresourcetypes :multi) "cq.pagesupdatehandler.videoresourcetypes" (with-collection-format cqpagesupdatehandlervideoresourcetypes :multi) "cq.pagesupdatehandler.dynamicsequenceresourcetypes" (with-collection-format cqpagesupdatehandlerdynamicsequenceresourcetypes :multi) "cq.pagesupdatehandler.previewmodepaths" (with-collection-format cqpagesupdatehandlerpreviewmodepaths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-impl-handler-channels-update-handler
  ""
  ([] (com-adobe-cq-screens-impl-handler-channels-update-handler nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-impl-handler-channels-update-handler-with-http-info optional-params))))

(defn com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-with-http-info
  ""
  ([] (com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job
  ""
  ([] (com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-with-http-info optional-params))))

(defn com-adobe-cq-screens-impl-remote-impl-distributed-http-client-impl-with-http-info
  ""
  ([] (com-adobe-cq-screens-impl-remote-impl-distributed-http-client-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobeaemscreensimplremoterequest-timeout ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.aem.screens.impl.remote.request_timeout" comadobeaemscreensimplremoterequest-timeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-impl-remote-impl-distributed-http-client-impl
  ""
  ([] (com-adobe-cq-screens-impl-remote-impl-distributed-http-client-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-impl-remote-impl-distributed-http-client-impl-with-http-info optional-params))))

(defn com-adobe-cq-screens-impl-screens-channel-post-processor-with-http-info
  ""
  ([] (com-adobe-cq-screens-impl-screens-channel-post-processor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist screenschannelspropertiestoremove ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "screens.channels.properties.to.remove" (with-collection-format screenschannelspropertiestoremove :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-impl-screens-channel-post-processor
  ""
  ([] (com-adobe-cq-screens-impl-screens-channel-post-processor nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-impl-screens-channel-post-processor-with-http-info optional-params))))

(defn com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobecqscreensmonitoringimpl-screens-monitoring-service-implproject-path comadobecqscreensmonitoringimpl-screens-monitoring-service-implschedule-frequency comadobecqscreensmonitoringimpl-screens-monitoring-service-implping-timeout comadobecqscreensmonitoringimpl-screens-monitoring-service-implrecipients comadobecqscreensmonitoringimpl-screens-monitoring-service-implsmtpserver comadobecqscreensmonitoringimpl-screens-monitoring-service-implsmtpport comadobecqscreensmonitoringimpl-screens-monitoring-service-implusetls comadobecqscreensmonitoringimpl-screens-monitoring-service-implusername comadobecqscreensmonitoringimpl-screens-monitoring-service-implpassword ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath" (with-collection-format comadobecqscreensmonitoringimpl-screens-monitoring-service-implproject-path :multi) "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency" comadobecqscreensmonitoringimpl-screens-monitoring-service-implschedule-frequency "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout" comadobecqscreensmonitoringimpl-screens-monitoring-service-implping-timeout "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients" comadobecqscreensmonitoringimpl-screens-monitoring-service-implrecipients "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver" comadobecqscreensmonitoringimpl-screens-monitoring-service-implsmtpserver "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport" comadobecqscreensmonitoringimpl-screens-monitoring-service-implsmtpport "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls" comadobecqscreensmonitoringimpl-screens-monitoring-service-implusetls "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username" comadobecqscreensmonitoringimpl-screens-monitoring-service-implusername "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password" comadobecqscreensmonitoringimpl-screens-monitoring-service-implpassword }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl
  ""
  ([] (com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-with-http-info
  ""
  ([] (com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking globalsize maxdiskusage persistenceenabled threadpoolmaxsize scheduledthreadpoolmaxsize gracefulshutdowntimeout queues topics addressesmaxdeliveryattempts addressesexpirydelay addressesaddressfullmessagepolicy addressesmaxsizebytes addressespagesizebytes addressespagecachemaxsize clusteruser clusterpassword clustercalltimeout clustercallfailovertimeout clusterclientfailurecheckperiod clusternotificationattempts clusternotificationinterval idcachesize clusterconfirmationwindowsize clusterconnectionttl clusterduplicatedetection clusterinitialconnectattempts clustermaxretryinterval clusterminlargemessagesize clusterproducerwindowsize clusterreconnectattempts clusterretryinterval clusterretryintervalmultiplier ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "global.size" globalsize "max.disk.usage" maxdiskusage "persistence.enabled" persistenceenabled "thread.pool.max.size" threadpoolmaxsize "scheduled.thread.pool.max.size" scheduledthreadpoolmaxsize "graceful.shutdown.timeout" gracefulshutdowntimeout "queues" (with-collection-format queues :multi) "topics" (with-collection-format topics :multi) "addresses.max.delivery.attempts" addressesmaxdeliveryattempts "addresses.expiry.delay" addressesexpirydelay "addresses.address.full.message.policy" addressesaddressfullmessagepolicy "addresses.max.size.bytes" addressesmaxsizebytes "addresses.page.size.bytes" addressespagesizebytes "addresses.page.cache.max.size" addressespagecachemaxsize "cluster.user" clusteruser "cluster.password" clusterpassword "cluster.call.timeout" clustercalltimeout "cluster.call.failover.timeout" clustercallfailovertimeout "cluster.client.failure.check.period" clusterclientfailurecheckperiod "cluster.notification.attempts" clusternotificationattempts "cluster.notification.interval" clusternotificationinterval "id.cache.size" idcachesize "cluster.confirmation.window.size" clusterconfirmationwindowsize "cluster.connection.ttl" clusterconnectionttl "cluster.duplicate.detection" clusterduplicatedetection "cluster.initial.connect.attempts" clusterinitialconnectattempts "cluster.max.retry.interval" clustermaxretryinterval "cluster.min.large.message.size" clusterminlargemessagesize "cluster.producer.window.size" clusterproducerwindowsize "cluster.reconnect.attempts" clusterreconnectattempts "cluster.retry.interval" clusterretryinterval "cluster.retry.interval.multiplier" clusterretryintervalmultiplier }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider
  ""
  ([] (com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-with-http-info optional-params))))

(defn com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobecqscreensofflinecontentimpl-bulk-offline-update-service-implproject-path comadobecqscreensofflinecontentimpl-bulk-offline-update-service-implschedule-frequency ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath" (with-collection-format comadobecqscreensofflinecontentimpl-bulk-offline-update-service-implproject-path :multi) "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency" comadobecqscreensofflinecontentimpl-bulk-offline-update-service-implschedule-frequency }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl
  ""
  ([] (com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist disable-smart-sync ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "disableSmartSync" disable-smart-sync }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl
  ""
  ([] (com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-screens-segmentation-impl-segmentation-feature-flag-with-http-info
  ""
  ([] (com-adobe-cq-screens-segmentation-impl-segmentation-feature-flag-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enable-data-triggered-content ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enableDataTriggeredContent" enable-data-triggered-content }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-screens-segmentation-impl-segmentation-feature-flag
  ""
  ([] (com-adobe-cq-screens-segmentation-impl-segmentation-feature-flag nil))
  ([optional-params]
   (:data (com-adobe-cq-screens-segmentation-impl-segmentation-feature-flag-with-http-info optional-params))))

(defn com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-with-http-info
  ""
  ([] (com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch
  ""
  ([] (com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch nil))
  ([optional-params]
   (:data (com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-with-http-info optional-params))))

(defn com-adobe-cq-security-hc-bundles-impl-wcm-filter-health-check-with-http-info
  ""
  ([] (com-adobe-cq-security-hc-bundles-impl-wcm-filter-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-security-hc-bundles-impl-wcm-filter-health-check
  ""
  ([] (com-adobe-cq-security-hc-bundles-impl-wcm-filter-health-check nil))
  ([optional-params]
   (:data (com-adobe-cq-security-hc-bundles-impl-wcm-filter-health-check-with-http-info optional-params))))

(defn com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check-with-http-info
  ""
  ([] (com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags dispatcheraddress dispatcherfilterallowed dispatcherfilterblocked ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) "dispatcher.address" dispatcheraddress "dispatcher.filter.allowed" (with-collection-format dispatcherfilterallowed :multi) "dispatcher.filter.blocked" (with-collection-format dispatcherfilterblocked :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check
  ""
  ([] (com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check nil))
  ([optional-params]
   (:data (com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check-with-http-info optional-params))))

(defn com-adobe-cq-security-hc-packages-impl-example-content-health-check-with-http-info
  ""
  ([] (com-adobe-cq-security-hc-packages-impl-example-content-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-security-hc-packages-impl-example-content-health-check
  ""
  ([] (com-adobe-cq-security-hc-packages-impl-example-content-health-check nil))
  ([optional-params]
   (:data (com-adobe-cq-security-hc-packages-impl-example-content-health-check-with-http-info optional-params))))

(defn com-adobe-cq-security-hc-webserver-impl-clickjacking-health-check-with-http-info
  ""
  ([] (com-adobe-cq-security-hc-webserver-impl-clickjacking-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags webserveraddress ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) "webserver.address" webserveraddress }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-security-hc-webserver-impl-clickjacking-health-check
  ""
  ([] (com-adobe-cq-security-hc-webserver-impl-clickjacking-health-check nil))
  ([optional-params]
   (:data (com-adobe-cq-security-hc-webserver-impl-clickjacking-health-check-with-http-info optional-params))))

(defn com-adobe-cq-social-accountverification-impl-account-management-config-im-with-http-info
  ""
  ([] (com-adobe-cq-social-accountverification-impl-account-management-config-im-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enable ttl1 ttl2 ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enable" enable "ttl1" ttl1 "ttl2" ttl2 }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-accountverification-impl-account-management-config-im
  ""
  ([] (com-adobe-cq-social-accountverification-impl-account-management-config-im nil))
  ([optional-params]
   (:data (com-adobe-cq-social-accountverification-impl-account-management-config-im-with-http-info optional-params))))

(defn com-adobe-cq-social-activitystreams-client-impl-social-activity-componen-with-http-info
  ""
  ([] (com-adobe-cq-social-activitystreams-client-impl-social-activity-componen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-activitystreams-client-impl-social-activity-componen
  ""
  ([] (com-adobe-cq-social-activitystreams-client-impl-social-activity-componen nil))
  ([optional-params]
   (:data (com-adobe-cq-social-activitystreams-client-impl-social-activity-componen-with-http-info optional-params))))

(defn com-adobe-cq-social-activitystreams-client-impl-social-activity-stream-co-with-http-info
  ""
  ([] (com-adobe-cq-social-activitystreams-client-impl-social-activity-stream-co-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-activitystreams-client-impl-social-activity-stream-co
  ""
  ([] (com-adobe-cq-social-activitystreams-client-impl-social-activity-stream-co nil))
  ([optional-params]
   (:data (com-adobe-cq-social-activitystreams-client-impl-social-activity-stream-co-with-http-info optional-params))))

(defn com-adobe-cq-social-activitystreams-listener-impl-event-listener-handler-with-http-info
  ""
  ([] (com-adobe-cq-social-activitystreams-listener-impl-event-listener-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventtopics eventfilter ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.topics" eventtopics "event.filter" eventfilter }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-activitystreams-listener-impl-event-listener-handler
  ""
  ([] (com-adobe-cq-social-activitystreams-listener-impl-event-listener-handler nil))
  ([optional-params]
   (:data (com-adobe-cq-social-activitystreams-listener-impl-event-listener-handler-with-http-info optional-params))))

(defn com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten-with-http-info
  ""
  ([] (com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten-with-http-info nil))
  ([{:keys [post apply delete action location propertylist accepted ranked ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "accepted" accepted "ranked" ranked }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten
  ""
  ([] (com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten nil))
  ([optional-params]
   (:data (com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten-with-http-info optional-params))))

(defn com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s-with-http-info
  ""
  ([] (com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s-with-http-info nil))
  ([{:keys [post apply delete action location propertylist ranking enable ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "ranking" ranking "enable" enable }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s
  ""
  ([] (com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s nil))
  ([optional-params]
   (:data (com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s-with-http-info optional-params))))

(defn com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-with-http-info
  ""
  ([] (com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-with-http-info nil))
  ([{:keys [post apply delete action location propertylist stream-path stream-name ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "streamPath" stream-path "streamName" stream-name }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre
  ""
  ([] (com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre nil))
  ([optional-params]
   (:data (com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-with-http-info optional-params))))

(defn com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-with-http-info
  ""
  ([] (com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-with-http-info nil))
  ([{:keys [post apply delete action location propertylist max-retry field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "MaxRetry" max-retry "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i
  ""
  ([] (com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i nil))
  ([optional-params]
   (:data (com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-with-http-info optional-params))))

(defn com-adobe-cq-social-calendar-client-operationextensions-event-attachmen-with-http-info
  ""
  ([] (com-adobe-cq-social-calendar-client-operationextensions-event-attachmen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist attachment-type-blacklist extensionorder ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "attachmentTypeBlacklist" attachment-type-blacklist "extension.order" extensionorder }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-calendar-client-operationextensions-event-attachmen
  ""
  ([] (com-adobe-cq-social-calendar-client-operationextensions-event-attachmen nil))
  ([optional-params]
   (:data (com-adobe-cq-social-calendar-client-operationextensions-event-attachmen-with-http-info optional-params))))

(defn com-adobe-cq-social-calendar-servlets-time-zone-servlet-with-http-info
  ""
  ([] (com-adobe-cq-social-calendar-servlets-time-zone-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist timezonesexpirytime ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "timezones.expirytime" timezonesexpirytime }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-calendar-servlets-time-zone-servlet
  ""
  ([] (com-adobe-cq-social-calendar-servlets-time-zone-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-social-calendar-servlets-time-zone-servlet-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-with-http-info nil))
  ([{:keys [post apply delete action location propertylist ranking ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "ranking" ranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event
  ""
  ([] (com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-comments-endpoints-impl-comment-operation-se-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-comments-endpoints-impl-comment-operation-se-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-comments-endpoints-impl-comment-operation-se
  ""
  ([] (com-adobe-cq-social-commons-comments-endpoints-impl-comment-operation-se nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-comments-endpoints-impl-comment-operation-se-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-comments-endpoints-impl-translation-operati-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-comments-endpoints-impl-translation-operati-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-comments-endpoints-impl-translation-operati
  ""
  ([] (com-adobe-cq-social-commons-comments-endpoints-impl-translation-operati nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-comments-endpoints-impl-translation-operati-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c-with-http-info nil))
  ([{:keys [post apply delete action location propertylist num-user-limit ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "numUserLimit" num-user-limit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c
  ""
  ([] (com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enable-scheduled-posts-search number-of-minutes max-search-limit ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enableScheduledPostsSearch" enable-scheduled-posts-search "numberOfMinutes" number-of-minutes "maxSearchLimit" max-search-limit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos
  ""
  ([] (com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-cors-cors-authentication-filter-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-cors-cors-authentication-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist corsenabling ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cors.enabling" corsenabling }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-cors-cors-authentication-filter
  ""
  ([] (com-adobe-cq-social-commons-cors-cors-authentication-filter nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-cors-cors-authentication-filter-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-android-email-client-provider-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-android-email-client-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority-order reply-email-patterns ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priorityOrder" priority-order "replyEmailPatterns" (with-collection-format reply-email-patterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-android-email-client-provider
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-android-email-client-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-android-email-client-provider-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist contextpath ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "context.path" contextpath }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-comment-email-event-listener-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-comment-email-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventtopics ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.topics" eventtopics }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-comment-email-event-listener
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-comment-email-event-listener nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-comment-email-event-listener-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-custom-email-client-provider-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-custom-email-client-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority-order reply-email-patterns ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priorityOrder" priority-order "replyEmailPatterns" (with-collection-format reply-email-patterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-custom-email-client-provider
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-custom-email-client-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-custom-email-client-provider-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp-with-http-info nil))
  ([{:keys [post apply delete action location propertylist patterntime patternnewline patternday-of-month patternmonth patternyear patterndate patterndate-time patternemail ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "pattern.time" patterntime "pattern.newline" patternnewline "pattern.dayOfMonth" patternday-of-month "pattern.month" patternmonth "pattern.year" patternyear "pattern.date" patterndate "pattern.dateTime" patterndate-time "pattern.email" patternemail }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-with-http-info nil))
  ([{:keys [post apply delete action location propertylist emailname emailcreate-post-from-reply emailadd-comment-id-to emailsubject-maximum-length emailreply-to-address emailreply-to-delimiter emailtracker-id-prefix-in-subject emailtracker-id-prefix-in-body emailas-html emaildefault-user-name emailtemplatesroot-path ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "email.name" emailname "email.createPostFromReply" emailcreate-post-from-reply "email.addCommentIdTo" emailadd-comment-id-to "email.subjectMaximumLength" emailsubject-maximum-length "email.replyToAddress" emailreply-to-address "email.replyToDelimiter" emailreply-to-delimiter "email.trackerIdPrefixInSubject" emailtracker-id-prefix-in-subject "email.trackerIdPrefixInBody" emailtracker-id-prefix-in-body "email.asHTML" emailas-html "email.defaultUserName" emaildefault-user-name "email.templates.rootPath" emailtemplatesroot-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-email-reply-importer-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-email-reply-importer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist connect-protocol ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "connectProtocol" connect-protocol }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-email-reply-importer
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-email-reply-importer nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-email-reply-importer-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-gmail-email-client-provider-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-gmail-email-client-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority-order reply-email-patterns ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priorityOrder" priority-order "replyEmailPatterns" (with-collection-format reply-email-patterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-gmail-email-client-provider
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-gmail-email-client-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-gmail-email-client-provider-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-ios-email-client-provider-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-ios-email-client-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority-order reply-email-patterns ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priorityOrder" priority-order "replyEmailPatterns" (with-collection-format reply-email-patterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-ios-email-client-provider
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-ios-email-client-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-ios-email-client-provider-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-macmail-email-client-provider-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-macmail-email-client-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority-order reply-email-patterns ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priorityOrder" priority-order "replyEmailPatterns" (with-collection-format reply-email-patterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-macmail-email-client-provider
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-macmail-email-client-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-macmail-email-client-provider-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-out-look-email-client-provider-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-out-look-email-client-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority-order reply-email-patterns ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priorityOrder" priority-order "replyEmailPatterns" (with-collection-format reply-email-patterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-out-look-email-client-provider
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-out-look-email-client-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-out-look-email-client-provider-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist reply-email-patterns priority-order ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "replyEmailPatterns" (with-collection-format reply-email-patterns :multi) "priorityOrder" priority-order }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority-order reply-email-patterns ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priorityOrder" priority-order "replyEmailPatterns" (with-collection-format reply-email-patterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider
  ""
  ([] (com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload-with-http-info nil))
  ([{:keys [post apply delete action location propertylist number-of-days age-of-file ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "numberOfDays" number-of-days "ageOfFile" age-of-file }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload
  ""
  ([] (com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventtopics eventfilter verbs ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.topics" eventtopics "event.filter" eventfilter "verbs" (with-collection-format verbs :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl
  ""
  ([] (com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-with-http-info
  ""
  ([] (com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enable ugc-limit ugc-limit-duration domains to-list ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enable" enable "UGCLimit" ugc-limit "ugcLimitDuration" ugc-limit-duration "domains" (with-collection-format domains :multi) "toList" (with-collection-format to-list :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit
  ""
  ([] (com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit nil))
  ([optional-params]
   (:data (com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-with-http-info optional-params))))

(defn com-adobe-cq-social-connect-oauth-impl-facebook-provider-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-connect-oauth-impl-facebook-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid oauthcloudconfigroot providerconfigroot providerconfigcreatetagsenabled providerconfiguserfolder providerconfigfacebookfetchfields providerconfigfacebookfields providerconfigrefreshuserdataenabled ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid "oauth.cloud.config.root" oauthcloudconfigroot "provider.config.root" providerconfigroot "provider.config.create.tags.enabled" providerconfigcreatetagsenabled "provider.config.user.folder" providerconfiguserfolder "provider.config.facebook.fetch.fields" providerconfigfacebookfetchfields "provider.config.facebook.fields" (with-collection-format providerconfigfacebookfields :multi) "provider.config.refresh.userdata.enabled" providerconfigrefreshuserdataenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-connect-oauth-impl-facebook-provider-impl
  ""
  ([] (com-adobe-cq-social-connect-oauth-impl-facebook-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-connect-oauth-impl-facebook-provider-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle-with-http-info
  ""
  ([] (com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path serviceranking ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" (with-collection-format path :multi) "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle
  ""
  ([] (com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle nil))
  ([optional-params]
   (:data (com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle-with-http-info optional-params))))

(defn com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-with-http-info
  ""
  ([] (com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-with-http-info nil))
  ([{:keys [post apply delete action location propertylist facebook twitter providerconfiguserfolder ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "facebook" (with-collection-format facebook :multi) "twitter" (with-collection-format twitter :multi) "provider.config.user.folder" providerconfiguserfolder }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper
  ""
  ([] (com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper nil))
  ([optional-params]
   (:data (com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-with-http-info optional-params))))

(defn com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid oauthcloudconfigroot providerconfigroot providerconfiguserfolder providerconfigtwitterenableparams providerconfigtwitterparams providerconfigrefreshuserdataenabled ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid "oauth.cloud.config.root" oauthcloudconfigroot "provider.config.root" providerconfigroot "provider.config.user.folder" providerconfiguserfolder "provider.config.twitter.enable.params" providerconfigtwitterenableparams "provider.config.twitter.params" (with-collection-format providerconfigtwitterparams :multi) "provider.config.refresh.userdata.enabled" providerconfigrefreshuserdataenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl
  ""
  ([] (com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-with-http-info
  ""
  ([] (com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqsocialcontentfragmentsservicesenabled cqsocialcontentfragmentsserviceswait-time-seconds ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.social.content.fragments.services.enabled" cqsocialcontentfragmentsservicesenabled "cq.social.content.fragments.services.waitTimeSeconds" cqsocialcontentfragmentsserviceswait-time-seconds }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-content-fragments-services-impl-communities-fragmen
  ""
  ([] (com-adobe-cq-social-content-fragments-services-impl-communities-fragmen nil))
  ([optional-params]
   (:data (com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-with-http-info optional-params))))

(defn com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory-with-http-info
  ""
  ([] (com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist versionid cacheon concurrencylevel cachestartsize cachettl cachesize timelimit ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "version.id" versionid "cache.on" cacheon "concurrency.level" concurrencylevel "cache.start.size" cachestartsize "cache.ttl" cachettl "cache.size" cachesize "time.limit" timelimit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory
  ""
  ([] (com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory nil))
  ([optional-params]
   (:data (com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory-with-http-info optional-params))))

(defn com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-with-http-info
  ""
  ([] (com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist solrzktimeout solrcommit cacheon concurrencylevel cachestartsize cachettl cachesize ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "solr.zk.timeout" solrzktimeout "solr.commit" solrcommit "cache.on" cacheon "concurrency.level" concurrencylevel "cache.start.size" cachestartsize "cache.ttl" cachettl "cache.size" cachesize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory
  ""
  ([] (com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory nil))
  ([optional-params]
   (:data (com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-with-http-info optional-params))))

(defn com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor-with-http-info
  ""
  ([] (com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist solrzktimeout solrcommit cacheon concurrencylevel cachestartsize cachettl cachesize ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "solr.zk.timeout" solrzktimeout "solr.commit" solrcommit "cache.on" cacheon "concurrency.level" concurrencylevel "cache.start.size" cachestartsize "cache.ttl" cachettl "cache.size" cachesize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor
  ""
  ([] (com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor nil))
  ([optional-params]
   (:data (com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor-with-http-info optional-params))))

(defn com-adobe-cq-social-enablement-adaptors-enablement-learning-path-adaptor-f-with-http-info
  ""
  ([] (com-adobe-cq-social-enablement-adaptors-enablement-learning-path-adaptor-f-with-http-info nil))
  ([{:keys [post apply delete action location propertylist is-member-check ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "isMemberCheck" is-member-check }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-enablement-adaptors-enablement-learning-path-adaptor-f
  ""
  ([] (com-adobe-cq-social-enablement-adaptors-enablement-learning-path-adaptor-f nil))
  ([optional-params]
   (:data (com-adobe-cq-social-enablement-adaptors-enablement-learning-path-adaptor-f-with-http-info optional-params))))

(defn com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-with-http-info
  ""
  ([] (com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-with-http-info nil))
  ([{:keys [post apply delete action location propertylist is-member-check ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "isMemberCheck" is-member-check }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto
  ""
  ([] (com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto nil))
  ([optional-params]
   (:data (com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-with-http-info optional-params))))

(defn com-adobe-cq-social-enablement-learningpath-endpoints-impl-enablement-l-with-http-info
  ""
  ([] (com-adobe-cq-social-enablement-learningpath-endpoints-impl-enablement-l-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-enablement-learningpath-endpoints-impl-enablement-l
  ""
  ([] (com-adobe-cq-social-enablement-learningpath-endpoints-impl-enablement-l nil))
  ([optional-params]
   (:data (com-adobe-cq-social-enablement-learningpath-endpoints-impl-enablement-l-with-http-info optional-params))))

(defn com-adobe-cq-social-enablement-resource-endpoints-impl-enablement-resou-with-http-info
  ""
  ([] (com-adobe-cq-social-enablement-resource-endpoints-impl-enablement-resou-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-enablement-resource-endpoints-impl-enablement-resou
  ""
  ([] (com-adobe-cq-social-enablement-resource-endpoints-impl-enablement-resou nil))
  ([optional-params]
   (:data (com-adobe-cq-social-enablement-resource-endpoints-impl-enablement-resou-with-http-info optional-params))))

(defn com-adobe-cq-social-enablement-services-impl-author-marker-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-enablement-services-impl-author-marker-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-enablement-services-impl-author-marker-impl
  ""
  ([] (com-adobe-cq-social-enablement-services-impl-author-marker-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-enablement-services-impl-author-marker-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge-with-http-info
  ""
  ([] (com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletselectors slingservletextensions ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.selectors" slingservletselectors "sling.servlet.extensions" slingservletextensions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge
  ""
  ([] (com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge nil))
  ([optional-params]
   (:data (com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge-with-http-info optional-params))))

(defn com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-with-http-info
  ""
  ([] (com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera
  ""
  ([] (com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera nil))
  ([optional-params]
   (:data (com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-with-http-info optional-params))))

(defn com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-with-http-info
  ""
  ([] (com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service
  ""
  ([] (com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service nil))
  ([optional-params]
   (:data (com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-with-http-info optional-params))))

(defn com-adobe-cq-social-forum-dispatcher-impl-flush-operations-with-http-info
  ""
  ([] (com-adobe-cq-social-forum-dispatcher-impl-flush-operations-with-http-info nil))
  ([{:keys [post apply delete action location propertylist extensionorder flushforumontopic ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "extension.order" extensionorder "flush.forumontopic" flushforumontopic }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-forum-dispatcher-impl-flush-operations
  ""
  ([] (com-adobe-cq-social-forum-dispatcher-impl-flush-operations nil))
  ([optional-params]
   (:data (com-adobe-cq-social-forum-dispatcher-impl-flush-operations-with-http-info optional-params))))

(defn com-adobe-cq-social-group-client-impl-community-group-collection-componen-with-http-info
  ""
  ([] (com-adobe-cq-social-group-client-impl-community-group-collection-componen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist grouplistingpaginationenable grouplistinglazyloadingenable pagesize priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "group.listing.pagination.enable" grouplistingpaginationenable "group.listing.lazyloading.enable" grouplistinglazyloadingenable "page.size" pagesize "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-group-client-impl-community-group-collection-componen
  ""
  ([] (com-adobe-cq-social-group-client-impl-community-group-collection-componen nil))
  ([optional-params]
   (:data (com-adobe-cq-social-group-client-impl-community-group-collection-componen-with-http-info optional-params))))

(defn com-adobe-cq-social-group-impl-group-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-group-impl-group-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist max-wait-time min-wait-between-retries ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "maxWaitTime" max-wait-time "minWaitBetweenRetries" min-wait-between-retries }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-group-impl-group-service-impl
  ""
  ([] (com-adobe-cq-social-group-impl-group-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-group-impl-group-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-handlebars-guava-template-cache-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-handlebars-guava-template-cache-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist parameterguavacacheenabled parameterguavacacheparams parameterguavacachereload serviceranking ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "parameter.guava.cache.enabled" parameterguavacacheenabled "parameter.guava.cache.params" parameterguavacacheparams "parameter.guava.cache.reload" parameterguavacachereload "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-handlebars-guava-template-cache-impl
  ""
  ([] (com-adobe-cq-social-handlebars-guava-template-cache-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-handlebars-guava-template-cache-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-ideation-client-endpoints-impl-ideation-operations-s-with-http-info
  ""
  ([] (com-adobe-cq-social-ideation-client-endpoints-impl-ideation-operations-s-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ideation-client-endpoints-impl-ideation-operations-s
  ""
  ([] (com-adobe-cq-social-ideation-client-endpoints-impl-ideation-operations-s nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ideation-client-endpoints-impl-ideation-operations-s-with-http-info optional-params))))

(defn com-adobe-cq-social-journal-client-endpoints-impl-journal-operations-ser-with-http-info
  ""
  ([] (com-adobe-cq-social-journal-client-endpoints-impl-journal-operations-ser-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-journal-client-endpoints-impl-journal-operations-ser
  ""
  ([] (com-adobe-cq-social-journal-client-endpoints-impl-journal-operations-ser nil))
  ([optional-params]
   (:data (com-adobe-cq-social-journal-client-endpoints-impl-journal-operations-ser-with-http-info optional-params))))

(defn com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-with-http-info
  ""
  ([] (com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-members-endpoints-impl-community-member-group-profile
  ""
  ([] (com-adobe-cq-social-members-endpoints-impl-community-member-group-profile nil))
  ([optional-params]
   (:data (com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-with-http-info optional-params))))

(defn com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o-with-http-info
  ""
  ([] (com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o
  ""
  ([] (com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o nil))
  ([optional-params]
   (:data (com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o-with-http-info optional-params))))

(defn com-adobe-cq-social-members-impl-community-member-group-profile-component-f-with-http-info
  ""
  ([] (com-adobe-cq-social-members-impl-community-member-group-profile-component-f-with-http-info nil))
  ([{:keys [post apply delete action location propertylist everyone-limit priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "everyoneLimit" everyone-limit "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-members-impl-community-member-group-profile-component-f
  ""
  ([] (com-adobe-cq-social-members-impl-community-member-group-profile-component-f nil))
  ([optional-params]
   (:data (com-adobe-cq-social-members-impl-community-member-group-profile-component-f-with-http-info optional-params))))

(defn com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation-with-http-info
  ""
  ([] (com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation-with-http-info nil))
  ([{:keys [post apply delete action location propertylist messageproperties message-box-size-limit message-count-limit notify-failure failure-message-from failure-template-path max-retries min-wait-between-retries count-update-pool-size inboxpath sentitemspath support-attachments support-group-messaging max-total-recipients batch-size max-total-attachment-size attachment-type-blacklist allowed-attachment-types service-selector field-whitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "message.properties" (with-collection-format messageproperties :multi) "messageBoxSizeLimit" message-box-size-limit "messageCountLimit" message-count-limit "notifyFailure" notify-failure "failureMessageFrom" failure-message-from "failureTemplatePath" failure-template-path "maxRetries" max-retries "minWaitBetweenRetries" min-wait-between-retries "countUpdatePoolSize" count-update-pool-size "inbox.path" inboxpath "sentitems.path" sentitemspath "supportAttachments" support-attachments "supportGroupMessaging" support-group-messaging "maxTotalRecipients" max-total-recipients "batchSize" batch-size "maxTotalAttachmentSize" max-total-attachment-size "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) "allowedAttachmentTypes" (with-collection-format allowed-attachment-types :multi) "serviceSelector" service-selector "fieldWhitelist" (with-collection-format field-whitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation
  ""
  ([] (com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation nil))
  ([optional-params]
   (:data (com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation-with-http-info optional-params))))

(defn com-adobe-cq-social-moderation-dashboard-api-filter-group-social-componen-with-http-info
  ""
  ([] (com-adobe-cq-social-moderation-dashboard-api-filter-group-social-componen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist resource-typefilters priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "resourceType.filters" (with-collection-format resource-typefilters :multi) "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-moderation-dashboard-api-filter-group-social-componen
  ""
  ([] (com-adobe-cq-social-moderation-dashboard-api-filter-group-social-componen nil))
  ([optional-params]
   (:data (com-adobe-cq-social-moderation-dashboard-api-filter-group-social-componen-with-http-info optional-params))))

(defn com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social-with-http-info
  ""
  ([] (com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social
  ""
  ([] (com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social nil))
  ([optional-params]
   (:data (com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social-with-http-info optional-params))))

(defn com-adobe-cq-social-moderation-dashboard-api-user-details-social-componen-with-http-info
  ""
  ([] (com-adobe-cq-social-moderation-dashboard-api-user-details-social-componen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-moderation-dashboard-api-user-details-social-componen
  ""
  ([] (com-adobe-cq-social-moderation-dashboard-api-user-details-social-componen nil))
  ([optional-params]
   (:data (com-adobe-cq-social-moderation-dashboard-api-user-details-social-componen-with-http-info optional-params))))

(defn com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci-with-http-info
  ""
  ([] (com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci-with-http-info nil))
  ([{:keys [post apply delete action location propertylist resource-typefilters priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "resourceType.filters" (with-collection-format resource-typefilters :multi) "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci
  ""
  ([] (com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci nil))
  ([optional-params]
   (:data (com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci-with-http-info optional-params))))

(defn com-adobe-cq-social-notifications-impl-mentions-router-with-http-info
  ""
  ([] (com-adobe-cq-social-notifications-impl-mentions-router-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventtopics eventfilter ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.topics" eventtopics "event.filter" eventfilter }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-notifications-impl-mentions-router
  ""
  ([] (com-adobe-cq-social-notifications-impl-mentions-router nil))
  ([optional-params]
   (:data (com-adobe-cq-social-notifications-impl-mentions-router-with-http-info optional-params))))

(defn com-adobe-cq-social-notifications-impl-notification-manager-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-notifications-impl-notification-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist maxunreadnotificationcount ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "max.unread.notification.count" maxunreadnotificationcount }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-notifications-impl-notification-manager-impl
  ""
  ([] (com-adobe-cq-social-notifications-impl-notification-manager-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-notifications-impl-notification-manager-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-notifications-impl-notifications-router-with-http-info
  ""
  ([] (com-adobe-cq-social-notifications-impl-notifications-router-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventtopics eventfilter ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.topics" eventtopics "event.filter" eventfilter }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-notifications-impl-notifications-router
  ""
  ([] (com-adobe-cq-social-notifications-impl-notifications-router nil))
  ([optional-params]
   (:data (com-adobe-cq-social-notifications-impl-notifications-router-with-http-info optional-params))))

(defn com-adobe-cq-social-qna-client-endpoints-impl-qna-forum-operations-servic-with-http-info
  ""
  ([] (com-adobe-cq-social-qna-client-endpoints-impl-qna-forum-operations-servic-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-qna-client-endpoints-impl-qna-forum-operations-servic
  ""
  ([] (com-adobe-cq-social-qna-client-endpoints-impl-qna-forum-operations-servic nil))
  ([optional-params]
   (:data (com-adobe-cq-social-qna-client-endpoints-impl-qna-forum-operations-servic-with-http-info optional-params))))

(defn com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i-with-http-info
  ""
  ([] (com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqsocialreportinganalyticspollingimporterinterval cqsocialreportinganalyticspollingimporterpage-size ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.social.reporting.analytics.polling.importer.interval" cqsocialreportinganalyticspollingimporterinterval "cq.social.reporting.analytics.polling.importer.pageSize" cqsocialreportinganalyticspollingimporterpage-size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i
  ""
  ([] (com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i nil))
  ([optional-params]
   (:data (com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i-with-http-info optional-params))))

(defn com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m-with-http-info
  ""
  ([] (com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m-with-http-info nil))
  ([{:keys [post apply delete action location propertylist reportfetchdelay ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "report.fetch.delay" reportfetchdelay }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m
  ""
  ([] (com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m nil))
  ([optional-params]
   (:data (com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m-with-http-info optional-params))))

(defn com-adobe-cq-social-reporting-analytics-services-impl-site-trend-report-s-with-http-info
  ""
  ([] (com-adobe-cq-social-reporting-analytics-services-impl-site-trend-report-s-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqsocialconsoleanalyticssitesmapping priority ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.social.console.analytics.sites.mapping" (with-collection-format cqsocialconsoleanalyticssitesmapping :multi) "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-reporting-analytics-services-impl-site-trend-report-s
  ""
  ([] (com-adobe-cq-social-reporting-analytics-services-impl-site-trend-report-s nil))
  ([optional-params]
   (:data (com-adobe-cq-social-reporting-analytics-services-impl-site-trend-report-s-with-http-info optional-params))))

(defn com-adobe-cq-social-review-client-endpoints-impl-review-operations-servi-with-http-info
  ""
  ([] (com-adobe-cq-social-review-client-endpoints-impl-review-operations-servi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist attachment-type-blacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "attachmentTypeBlacklist" (with-collection-format attachment-type-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-review-client-endpoints-impl-review-operations-servi
  ""
  ([] (com-adobe-cq-social-review-client-endpoints-impl-review-operations-servi nil))
  ([optional-params]
   (:data (com-adobe-cq-social-review-client-endpoints-impl-review-operations-servi-with-http-info optional-params))))

(defn com-adobe-cq-social-scf-core-operations-impl-social-operations-servlet-with-http-info
  ""
  ([] (com-adobe-cq-social-scf-core-operations-impl-social-operations-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletselectors slingservletextensions ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.selectors" slingservletselectors "sling.servlet.extensions" slingservletextensions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-scf-core-operations-impl-social-operations-servlet
  ""
  ([] (com-adobe-cq-social-scf-core-operations-impl-social-operations-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-social-scf-core-operations-impl-social-operations-servlet-with-http-info optional-params))))

(defn com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet-with-http-info
  ""
  ([] (com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletselectors slingservletextensions ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.selectors" (with-collection-format slingservletselectors :multi) "sling.servlet.extensions" slingservletextensions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet
  ""
  ([] (com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet-with-http-info optional-params))))

(defn com-adobe-cq-social-scoring-impl-scoring-event-listener-with-http-info
  ""
  ([] (com-adobe-cq-social-scoring-impl-scoring-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventtopics eventfilter ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.topics" eventtopics "event.filter" eventfilter }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-scoring-impl-scoring-event-listener
  ""
  ([] (com-adobe-cq-social-scoring-impl-scoring-event-listener nil))
  ([optional-params]
   (:data (com-adobe-cq-social-scoring-impl-scoring-event-listener-with-http-info optional-params))))

(defn com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enable-fallback ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enableFallback" enable-fallback }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl
  ""
  ([] (com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-site-endpoints-impl-site-operation-service-with-http-info
  ""
  ([] (com-adobe-cq-social-site-endpoints-impl-site-operation-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist field-whitelist site-path-filters site-package-group ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fieldWhitelist" (with-collection-format field-whitelist :multi) "sitePathFilters" (with-collection-format site-path-filters :multi) "sitePackageGroup" site-package-group }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-site-endpoints-impl-site-operation-service
  ""
  ([] (com-adobe-cq-social-site-endpoints-impl-site-operation-service nil))
  ([optional-params]
   (:data (com-adobe-cq-social-site-endpoints-impl-site-operation-service-with-http-info optional-params))))

(defn com-adobe-cq-social-site-impl-analytics-component-configuration-service-im-with-http-info
  ""
  ([] (com-adobe-cq-social-site-impl-analytics-component-configuration-service-im-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqsocialconsoleanalyticscomponents ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.social.console.analytics.components" (with-collection-format cqsocialconsoleanalyticscomponents :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-site-impl-analytics-component-configuration-service-im
  ""
  ([] (com-adobe-cq-social-site-impl-analytics-component-configuration-service-im nil))
  ([optional-params]
   (:data (com-adobe-cq-social-site-impl-analytics-component-configuration-service-im-with-http-info optional-params))))

(defn com-adobe-cq-social-site-impl-site-configurator-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-site-impl-site-configurator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist components-using-tags ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "componentsUsingTags" (with-collection-format components-using-tags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-site-impl-site-configurator-impl
  ""
  ([] (com-adobe-cq-social-site-impl-site-configurator-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-site-impl-site-configurator-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-srp-impl-social-solr-connector-with-http-info
  ""
  ([] (com-adobe-cq-social-srp-impl-social-solr-connector-with-http-info nil))
  ([{:keys [post apply delete action location propertylist srptype ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "srp.type" srptype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-srp-impl-social-solr-connector
  ""
  ([] (com-adobe-cq-social-srp-impl-social-solr-connector nil))
  ([optional-params]
   (:data (com-adobe-cq-social-srp-impl-social-solr-connector-with-http-info optional-params))))

(defn com-adobe-cq-social-sync-impl-diff-changes-observer-with-http-info
  ""
  ([] (com-adobe-cq-social-sync-impl-diff-changes-observer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled agent-name diff-path property-names ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "agentName" agent-name "diffPath" diff-path "propertyNames" property-names }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-sync-impl-diff-changes-observer
  ""
  ([] (com-adobe-cq-social-sync-impl-diff-changes-observer nil))
  ([optional-params]
   (:data (com-adobe-cq-social-sync-impl-diff-changes-observer-with-http-info optional-params))))

(defn com-adobe-cq-social-sync-impl-group-sync-listener-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-sync-impl-group-sync-listener-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist nodetypes ignorableprops ignorablenodes enabled distfolders ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "nodetypes" (with-collection-format nodetypes :multi) "ignorableprops" (with-collection-format ignorableprops :multi) "ignorablenodes" ignorablenodes "enabled" enabled "distfolders" distfolders }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-sync-impl-group-sync-listener-impl
  ""
  ([] (com-adobe-cq-social-sync-impl-group-sync-listener-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-sync-impl-group-sync-listener-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-sync-impl-publisher-sync-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-sync-impl-publisher-sync-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist active-run-modes ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "activeRunModes" (with-collection-format active-run-modes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-sync-impl-publisher-sync-service-impl
  ""
  ([] (com-adobe-cq-social-sync-impl-publisher-sync-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-sync-impl-publisher-sync-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-sync-impl-user-sync-listener-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-sync-impl-user-sync-listener-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist nodetypes ignorableprops ignorablenodes enabled distfolders ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "nodetypes" (with-collection-format nodetypes :multi) "ignorableprops" (with-collection-format ignorableprops :multi) "ignorablenodes" (with-collection-format ignorablenodes :multi) "enabled" enabled "distfolders" (with-collection-format distfolders :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-sync-impl-user-sync-listener-impl
  ""
  ([] (com-adobe-cq-social-sync-impl-user-sync-listener-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-sync-impl-user-sync-listener-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-translation-impl-translation-service-config-manager-with-http-info
  ""
  ([] (com-adobe-cq-social-translation-impl-translation-service-config-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist translatelanguage translatedisplay translateattribution translatecaching translatesmartrendering translatecachingduration translatesessionsaveinterval translatesessionsavebatch-limit ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "translate.language" translatelanguage "translate.display" translatedisplay "translate.attribution" translateattribution "translate.caching" translatecaching "translate.smart.rendering" translatesmartrendering "translate.caching.duration" translatecachingduration "translate.session.save.interval" translatesessionsaveinterval "translate.session.save.batchLimit" translatesessionsavebatch-limit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-translation-impl-translation-service-config-manager
  ""
  ([] (com-adobe-cq-social-translation-impl-translation-service-config-manager nil))
  ([optional-params]
   (:data (com-adobe-cq-social-translation-impl-translation-service-config-manager-with-http-info optional-params))))

(defn com-adobe-cq-social-translation-impl-ugc-language-detector-with-http-info
  ""
  ([] (com-adobe-cq-social-translation-impl-ugc-language-detector-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventtopics eventfilter translatelistenertype translatepropertylist pool-size max-pool-size queue-size keep-alive-time ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.topics" eventtopics "event.filter" eventfilter "translate.listener.type" (with-collection-format translatelistenertype :multi) "translate.property.list" (with-collection-format translatepropertylist :multi) "poolSize" pool-size "maxPoolSize" max-pool-size "queueSize" queue-size "keepAliveTime" keep-alive-time }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-translation-impl-ugc-language-detector
  ""
  ([] (com-adobe-cq-social-translation-impl-ugc-language-detector nil))
  ([optional-params]
   (:data (com-adobe-cq-social-translation-impl-ugc-language-detector-with-http-info optional-params))))

(defn com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist thread-pool-size delay-time worker-sleep-time ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "threadPoolSize" thread-pool-size "delayTime" delay-time "workerSleepTime" worker-sleep-time }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl
  ""
  ([] (com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pool-size max-pool-size queue-size keep-alive-time ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "poolSize" pool-size "maxPoolSize" max-pool-size "queueSize" queue-size "keepAliveTime" keep-alive-time }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl
  ""
  ([] (com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-ugcbase-impl-publisher-configuration-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-ugcbase-impl-publisher-configuration-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist is-primary-publisher ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "isPrimaryPublisher" is-primary-publisher }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ugcbase-impl-publisher-configuration-impl
  ""
  ([] (com-adobe-cq-social-ugcbase-impl-publisher-configuration-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ugcbase-impl-publisher-configuration-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-ugcbase-impl-social-utils-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-ugcbase-impl-social-utils-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist legacy-cloud-ugc-path-mapping ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "legacyCloudUGCPathMapping" legacy-cloud-ugc-path-mapping }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ugcbase-impl-social-utils-impl
  ""
  ([] (com-adobe-cq-social-ugcbase-impl-social-utils-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ugcbase-impl-social-utils-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist automoderationsequence automoderationonfailurestop ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "automoderation.sequence" (with-collection-format automoderationsequence :multi) "automoderation.onfailurestop" automoderationonfailurestop }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl
  ""
  ([] (com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-with-http-info
  ""
  ([] (com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-with-http-info nil))
  ([{:keys [post apply delete action location propertylist watchwordspositive watchwordsnegative watchwordspath sentimentpath ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "watchwords.positive" (with-collection-format watchwordspositive :multi) "watchwords.negative" (with-collection-format watchwordsnegative :multi) "watchwords.path" watchwordspath "sentiment.path" sentimentpath }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process
  ""
  ([] (com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-with-http-info optional-params))))

(defn com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-with-http-info
  ""
  ([] (com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-with-http-info nil))
  ([{:keys [post apply delete action location propertylist defaultattachmenttypeblacklist baselineattachmenttypeblacklist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "default.attachment.type.blacklist" (with-collection-format defaultattachmenttypeblacklist :multi) "baseline.attachment.type.blacklist" (with-collection-format baselineattachmenttypeblacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli
  ""
  ([] (com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-with-http-info optional-params))))

(defn com-adobe-cq-social-ugcbase-security-impl-safer-sling-post-validator-impl-with-http-info
  ""
  ([] (com-adobe-cq-social-ugcbase-security-impl-safer-sling-post-validator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist parameterwhitelist parameterwhitelistprefixes binaryparameterwhitelist modifierwhitelist operationwhitelist operationwhitelistprefixes typehintwhitelist resourcetypewhitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "parameter.whitelist" (with-collection-format parameterwhitelist :multi) "parameter.whitelist.prefixes" (with-collection-format parameterwhitelistprefixes :multi) "binary.parameter.whitelist" (with-collection-format binaryparameterwhitelist :multi) "modifier.whitelist" (with-collection-format modifierwhitelist :multi) "operation.whitelist" (with-collection-format operationwhitelist :multi) "operation.whitelist.prefixes" (with-collection-format operationwhitelistprefixes :multi) "typehint.whitelist" (with-collection-format typehintwhitelist :multi) "resourcetype.whitelist" (with-collection-format resourcetypewhitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-ugcbase-security-impl-safer-sling-post-validator-impl
  ""
  ([] (com-adobe-cq-social-ugcbase-security-impl-safer-sling-post-validator-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-social-ugcbase-security-impl-safer-sling-post-validator-impl-with-http-info optional-params))))

(defn com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet-with-http-info
  ""
  ([] (com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletextensions slingservletpaths slingservletmethods ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.extensions" slingservletextensions "sling.servlet.paths" slingservletpaths "sling.servlet.methods" slingservletmethods }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet
  ""
  ([] (com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet nil))
  ([optional-params]
   (:data (com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet-with-http-info optional-params))))

(defn com-adobe-cq-social-user-impl-transport-http-to-publisher-with-http-info
  ""
  ([] (com-adobe-cq-social-user-impl-transport-http-to-publisher-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enable agentconfiguration contextpath disabledciphersuites enabledciphersuites ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enable" enable "agent.configuration" (with-collection-format agentconfiguration :multi) "context.path" contextpath "disabled.cipher.suites" (with-collection-format disabledciphersuites :multi) "enabled.cipher.suites" (with-collection-format enabledciphersuites :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-social-user-impl-transport-http-to-publisher
  ""
  ([] (com-adobe-cq-social-user-impl-transport-http-to-publisher nil))
  ([optional-params]
   (:data (com-adobe-cq-social-user-impl-transport-http-to-publisher-with-http-info optional-params))))

(defn com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-with-http-info
  ""
  ([] (com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-with-http-info nil))
  ([{:keys [post apply delete action location propertylist resourcetypes ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "resource.types" (with-collection-format resourcetypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact
  ""
  ([] (com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact nil))
  ([optional-params]
   (:data (com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-with-http-info optional-params))))

(defn com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup-with-http-info
  ""
  ([] (com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup-with-http-info nil))
  ([{:keys [post apply delete action location propertylist deletepathregexps deletesql2query ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "delete.path.regexps" (with-collection-format deletepathregexps :multi) "delete.sql2.query" deletesql2query }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup
  ""
  ([] (com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup nil))
  ([optional-params]
   (:data (com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup-with-http-info optional-params))))

(defn com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-with-http-info
  ""
  ([] (com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-with-http-info nil))
  ([{:keys [post apply delete action location propertylist deletenameregexps ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "delete.name.regexps" (with-collection-format deletenameregexps :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup
  ""
  ([] (com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup nil))
  ([optional-params]
   (:data (com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-with-http-info optional-params))))

(defn com-adobe-cq-wcm-jobs-async-impl-async-delete-config-provider-service-with-http-info
  ""
  ([] (com-adobe-cq-wcm-jobs-async-impl-async-delete-config-provider-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist threshold job-topic-name email-enabled ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "threshold" threshold "jobTopicName" job-topic-name "emailEnabled" email-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-wcm-jobs-async-impl-async-delete-config-provider-service
  ""
  ([] (com-adobe-cq-wcm-jobs-async-impl-async-delete-config-provider-service nil))
  ([optional-params]
   (:data (com-adobe-cq-wcm-jobs-async-impl-async-delete-config-provider-service-with-http-info optional-params))))

(defn com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task-with-http-info
  ""
  ([] (com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression jobpurgethreshold jobpurgemaxjobs ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression "job.purge.threshold" jobpurgethreshold "job.purge.max.jobs" jobpurgemaxjobs }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task
  ""
  ([] (com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task nil))
  ([optional-params]
   (:data (com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task-with-http-info optional-params))))

(defn com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service-with-http-info
  ""
  ([] (com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist threshold job-topic-name email-enabled ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "threshold" threshold "jobTopicName" job-topic-name "emailEnabled" email-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service
  ""
  ([] (com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service nil))
  ([optional-params]
   (:data (com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service-with-http-info optional-params))))

(defn com-adobe-cq-wcm-jobs-async-impl-async-page-move-config-provider-service-with-http-info
  ""
  ([] (com-adobe-cq-wcm-jobs-async-impl-async-page-move-config-provider-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist threshold job-topic-name email-enabled ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "threshold" threshold "jobTopicName" job-topic-name "emailEnabled" email-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-wcm-jobs-async-impl-async-page-move-config-provider-service
  ""
  ([] (com-adobe-cq-wcm-jobs-async-impl-async-page-move-config-provider-service nil))
  ([optional-params]
   (:data (com-adobe-cq-wcm-jobs-async-impl-async-page-move-config-provider-service-with-http-info optional-params))))

(defn com-adobe-cq-wcm-launches-impl-launches-event-handler-with-http-info
  ""
  ([] (com-adobe-cq-wcm-launches-impl-launches-event-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventfilter launcheseventhandlerthreadpoolmaxsize launcheseventhandlerthreadpoolpriority launcheseventhandlerupdatelastmodification ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.filter" eventfilter "launches.eventhandler.threadpool.maxsize" launcheseventhandlerthreadpoolmaxsize "launches.eventhandler.threadpool.priority" launcheseventhandlerthreadpoolpriority "launches.eventhandler.updatelastmodification" launcheseventhandlerupdatelastmodification }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-wcm-launches-impl-launches-event-handler
  ""
  ([] (com-adobe-cq-wcm-launches-impl-launches-event-handler nil))
  ([optional-params]
   (:data (com-adobe-cq-wcm-launches-impl-launches-event-handler-with-http-info optional-params))))

(defn com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator-with-http-info
  ""
  ([] (com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmqrcodeservletwhitelist ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.qrcode.servlet.whitelist" (with-collection-format cqwcmqrcodeservletwhitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator
  ""
  ([] (com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator nil))
  ([optional-params]
   (:data (com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator-with-http-info optional-params))))

(defn com-adobe-cq-wcm-style-internal-component-style-info-cache-impl-with-http-info
  ""
  ([] (com-adobe-cq-wcm-style-internal-component-style-info-cache-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist size ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "size" size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-wcm-style-internal-component-style-info-cache-impl
  ""
  ([] (com-adobe-cq-wcm-style-internal-component-style-info-cache-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-wcm-style-internal-component-style-info-cache-impl-with-http-info optional-params))))

(defn com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-with-http-info
  ""
  ([] (com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist sync-translation-statescheduling-format scheduling-repeat-translationscheduling-format sync-translation-statelock-timeout-in-minutes exportformat ]}]
   (call-api "/system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "syncTranslationState.schedulingFormat" sync-translation-statescheduling-format "schedulingRepeatTranslation.schedulingFormat" scheduling-repeat-translationscheduling-format "syncTranslationState.lockTimeoutInMinutes" sync-translation-statelock-timeout-in-minutes "export.format" exportformat }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl
  ""
  ([] (com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl nil))
  ([optional-params]
   (:data (com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-with-http-info optional-params))))

(defn com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-with-http-info
  ""
  ([] (com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist portaloutboxes draftdataservice draftmetadataservice submitdataservice submitmetadataservice pending-signdataservice pending-signmetadataservice ]}]
   (call-api "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "portal.outboxes" (with-collection-format portaloutboxes :multi) "draft.data.service" draftdataservice "draft.metadata.service" draftmetadataservice "submit.data.service" submitdataservice "submit.metadata.service" submitmetadataservice "pendingSign.data.service" pending-signdataservice "pendingSign.metadata.service" pending-signmetadataservice }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service
  ""
  ([] (com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service nil))
  ([optional-params]
   (:data (com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-with-http-info optional-params))))

(defn com-adobe-fd-fp-config-forms-portal-scheduler-service-with-http-info
  ""
  ([] (com-adobe-fd-fp-config-forms-portal-scheduler-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist formportalinterval ]}]
   (call-api "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "formportal.interval" formportalinterval }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-fd-fp-config-forms-portal-scheduler-service
  ""
  ([] (com-adobe-fd-fp-config-forms-portal-scheduler-service nil))
  ([optional-params]
   (:data (com-adobe-fd-fp-config-forms-portal-scheduler-service-with-http-info optional-params))))

(defn com-adobe-forms-common-service-impl-default-data-provider-with-http-info
  ""
  ([] (com-adobe-forms-common-service-impl-default-data-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist alloweddata-file-locations ]}]
   (call-api "/system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "alloweddataFileLocations" (with-collection-format alloweddata-file-locations :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-forms-common-service-impl-default-data-provider
  ""
  ([] (com-adobe-forms-common-service-impl-default-data-provider nil))
  ([optional-params]
   (:data (com-adobe-forms-common-service-impl-default-data-provider-with-http-info optional-params))))

(defn com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-with-http-info
  ""
  ([] (com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-with-http-info nil))
  ([{:keys [post apply delete action location propertylist temp-storage-config ]}]
   (call-api "/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "tempStorageConfig" temp-storage-config }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-forms-common-service-impl-forms-common-configuration-service-imp
  ""
  ([] (com-adobe-forms-common-service-impl-forms-common-configuration-service-imp nil))
  ([optional-params]
   (:data (com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-with-http-info optional-params))))

(defn com-adobe-forms-common-servlet-temp-clean-up-task-with-http-info
  ""
  ([] (com-adobe-forms-common-servlet-temp-clean-up-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression durationfor-temporary-storage durationfor-anonymous-storage ]}]
   (call-api "/system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression "Duration for Temporary Storage" durationfor-temporary-storage "Duration for Anonymous Storage" durationfor-anonymous-storage }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-forms-common-servlet-temp-clean-up-task
  ""
  ([] (com-adobe-forms-common-servlet-temp-clean-up-task nil))
  ([optional-params]
   (:data (com-adobe-forms-common-servlet-temp-clean-up-task-with-http-info optional-params))))

(defn com-adobe-granite-acp-platform-platform-servlet-with-http-info
  ""
  ([] (com-adobe-granite-acp-platform-platform-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist querylimit filetypeextensionmap ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "query.limit" querylimit "file.type.extension.map" (with-collection-format filetypeextensionmap :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-acp-platform-platform-servlet
  ""
  ([] (com-adobe-granite-acp-platform-platform-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-acp-platform-platform-servlet-with-http-info optional-params))))

(defn com-adobe-granite-activitystreams-impl-activity-manager-impl-with-http-info
  ""
  ([] (com-adobe-granite-activitystreams-impl-activity-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist aggregaterelationships aggregatedescendvirtual ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "aggregate.relationships" (with-collection-format aggregaterelationships :multi) "aggregate.descend.virtual" aggregatedescendvirtual }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-activitystreams-impl-activity-manager-impl
  ""
  ([] (com-adobe-granite-activitystreams-impl-activity-manager-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-activitystreams-impl-activity-manager-impl-with-http-info optional-params))))

(defn com-adobe-granite-analyzer-base-system-status-servlet-with-http-info
  ""
  ([] (com-adobe-granite-analyzer-base-system-status-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist disabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "disabled" disabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-analyzer-base-system-status-servlet
  ""
  ([] (com-adobe-granite-analyzer-base-system-status-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-analyzer-base-system-status-servlet-with-http-info optional-params))))

(defn com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet-with-http-info
  ""
  ([] (com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist disabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "disabled" disabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet
  ""
  ([] (com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet-with-http-info optional-params))))

(defn com-adobe-granite-apicontroller-filter-resolver-hook-factory-with-http-info
  ""
  ([] (com-adobe-granite-apicontroller-filter-resolver-hook-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobecqcdncdn-rewriter comadobecqcloud-configcomponents comadobecqcloud-configcore comadobecqcloud-configui comadobecqcomadobecqeditor comadobecqcomadobecqprojectscore comadobecqcomadobecqprojectswcmcore comadobecqcomadobecquicommons comadobecqcomadobecqwcmstyle comadobecqcq-activitymap-integration comadobecqcq-contexthub-commons comadobecqcq-dtm comadobecqcq-healthcheck comadobecqcq-multisite-targeting comadobecqcq-pre-upgrade-cleanup comadobecqcq-product-info-provider comadobecqcq-rest-sites comadobecqcq-security-hc comadobecqdamcq-dam-svg-handler comadobecqdamcq-scene7-imaging comadobecqdtm-reactorcore comadobecqdtm-reactorui comadobecqexp-jspel-resolver comadobecqinboxcq-inbox comadobecqjson-schema-parser comadobecqmediacq-media-publishing-dps-fp-core comadobecqmobilecq-mobile-caas comadobecqmobilecq-mobile-index-builder comadobecqmobilecq-mobile-phonegap-build comadobecqmyspell comadobecqsampleweretailcore comadobecqscreenscomadobecqscreensdcc comadobecqscreenscomadobecqscreensmqcore comadobecqsocialcq-social-as-provider comadobecqsocialcq-social-badging-basic-impl comadobecqsocialcq-social-badging-impl comadobecqsocialcq-social-calendar-impl comadobecqsocialcq-social-content-fragments-impl comadobecqsocialcq-social-enablement-impl comadobecqsocialcq-social-graph-impl comadobecqsocialcq-social-ideation-impl comadobecqsocialcq-social-jcr-provider comadobecqsocialcq-social-members-impl comadobecqsocialcq-social-ms-provider comadobecqsocialcq-social-notifications-channels-web comadobecqsocialcq-social-notifications-impl comadobecqsocialcq-social-rdb-provider comadobecqsocialcq-social-scf-impl comadobecqsocialcq-social-scoring-basic-impl comadobecqsocialcq-social-scoring-impl comadobecqsocialcq-social-serviceusers-impl comadobecqsocialcq-social-srp-impl comadobecqsocialcq-social-ugcbase-impl comadobedamcq-dam-cfm-impl comadobeformsfoundation-forms-foundation-base comadobegraniteapicontroller comadobegraniteassetcore comadobegraniteauthsso comadobegranitebundleshcimpl comadobegranitecompat-router comadobegraniteconf comadobegraniteconfuicore comadobegranitecors comadobegranitecrx-explorer comadobegranitecrxde-lite comadobegranitecryptoconfig comadobegranitecryptoextension comadobegranitecryptofile comadobegranitecryptojcr comadobegranitecsrf comadobegranitedistributioncore comadobegranitedropwizardmetrics comadobegranitefragsimpl comadobegranitegibson comadobegraniteinfocollector comadobegraniteinstallerfactorypackages comadobegranitejettyssl comadobegranitejobsasync comadobegranitemaintenanceoak comadobegranitemonitoringcore comadobegranitequeries comadobegranitereplicationhcimpl comadobegraniterepositorychecker comadobegraniterepositoryhcimpl comadobegraniterestassets comadobegranitesecurityui comadobegranitestartup comadobegranitetagsoup comadobegranitetaskmanagementcore comadobegranitetaskmanagementworkflow comadobegraniteuiclientlibscompilerless comadobegraniteuiclientlibsprocessorgcc comadobegranitewebconsoleplugins comadobegraniteworkflowconsole comadobexmpworkerfilesnativefragmentlinux comadobexmpworkerfilesnativefragmentmacosx comadobexmpworkerfilesnativefragmentwin comdaycommonsosgiwrappersimple-jndi comdaycqcq-authhandler comdaycqcq-compat-configupdate comdaycqcq-licensebranding comdaycqcq-notifcation-impl comdaycqcq-replication-audit comdaycqcq-search-ext comdaycqdamcq-dam-annotation-print comdaycqdamcq-dam-asset-usage comdaycqdamcq-dam-s7dam comdaycqdamcq-dam-similaritysearch comdaycqdamdam-webdav-support comdaycqpre-upgrade-tasks comdaycqreplicationextensions comdaycqwcmcq-msm-core comdaycqwcmcq-wcm-translation day-commons-jrawio orgapacheariesjmxwhiteboard orgapachefelixhttpsslfilter orgapachefelixorgapachefelixthreaddump orgapachefelixwebconsolepluginsds orgapachefelixwebconsolepluginsevent orgapachefelixwebconsolepluginsmemoryusage orgapachefelixwebconsolepluginspackageadmin orgapachejackrabbitoak-auth-ldap orgapachejackrabbitoak-segment-tar orgapachejackrabbitoak-solr-osgi orgapacheslingbundleresourceimpl orgapacheslingcommonsfsclassloader orgapacheslingcommonslogwebconsole orgapacheslingdatasource orgapacheslingdiscoverybase orgapacheslingdiscoveryoak orgapacheslingdiscoverysupport orgapacheslingdistributionapi orgapacheslingdistributioncore orgapacheslingextensionswebconsolesecurityprovider orgapacheslinghcwebconsole orgapacheslinginstallerconsole orgapacheslinginstallerproviderfile orgapacheslinginstallerproviderjcr orgapacheslingjcrdavex orgapacheslingjcrresourcesecurity orgapacheslingjmxprovider orgapacheslinglaunchpadinstaller orgapacheslingmodelsimpl orgapacheslingrepoinitparser orgapacheslingresourceinventory orgapacheslingresourceresolver orgapacheslingscriptingjavascript orgapacheslingscriptingjst orgapacheslingscriptingsightlyjsprovider orgapacheslingscriptingsightlymodelsprovider orgapacheslingsecurity orgapacheslingservletscompat orgapacheslingservletsget orgapacheslingstartupfilterdisabler orgapacheslingtracer weretailclientappcore ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.cq.cdn.cdn-rewriter" comadobecqcdncdn-rewriter "com.adobe.cq.cloud-config.components" comadobecqcloud-configcomponents "com.adobe.cq.cloud-config.core" comadobecqcloud-configcore "com.adobe.cq.cloud-config.ui" comadobecqcloud-configui "com.adobe.cq.com.adobe.cq.editor" comadobecqcomadobecqeditor "com.adobe.cq.com.adobe.cq.projects.core" comadobecqcomadobecqprojectscore "com.adobe.cq.com.adobe.cq.projects.wcm.core" comadobecqcomadobecqprojectswcmcore "com.adobe.cq.com.adobe.cq.ui.commons" comadobecqcomadobecquicommons "com.adobe.cq.com.adobe.cq.wcm.style" comadobecqcomadobecqwcmstyle "com.adobe.cq.cq-activitymap-integration" comadobecqcq-activitymap-integration "com.adobe.cq.cq-contexthub-commons" comadobecqcq-contexthub-commons "com.adobe.cq.cq-dtm" comadobecqcq-dtm "com.adobe.cq.cq-healthcheck" comadobecqcq-healthcheck "com.adobe.cq.cq-multisite-targeting" comadobecqcq-multisite-targeting "com.adobe.cq.cq-pre-upgrade-cleanup" comadobecqcq-pre-upgrade-cleanup "com.adobe.cq.cq-product-info-provider" comadobecqcq-product-info-provider "com.adobe.cq.cq-rest-sites" comadobecqcq-rest-sites "com.adobe.cq.cq-security-hc" comadobecqcq-security-hc "com.adobe.cq.dam.cq-dam-svg-handler" comadobecqdamcq-dam-svg-handler "com.adobe.cq.dam.cq-scene7-imaging" comadobecqdamcq-scene7-imaging "com.adobe.cq.dtm-reactor.core" comadobecqdtm-reactorcore "com.adobe.cq.dtm-reactor.ui" comadobecqdtm-reactorui "com.adobe.cq.exp-jspel-resolver" comadobecqexp-jspel-resolver "com.adobe.cq.inbox.cq-inbox" comadobecqinboxcq-inbox "com.adobe.cq.json-schema-parser" comadobecqjson-schema-parser "com.adobe.cq.media.cq-media-publishing-dps-fp-core" comadobecqmediacq-media-publishing-dps-fp-core "com.adobe.cq.mobile.cq-mobile-caas" comadobecqmobilecq-mobile-caas "com.adobe.cq.mobile.cq-mobile-index-builder" comadobecqmobilecq-mobile-index-builder "com.adobe.cq.mobile.cq-mobile-phonegap-build" comadobecqmobilecq-mobile-phonegap-build "com.adobe.cq.myspell" comadobecqmyspell "com.adobe.cq.sample.we.retail.core" comadobecqsampleweretailcore "com.adobe.cq.screens.com.adobe.cq.screens.dcc" comadobecqscreenscomadobecqscreensdcc "com.adobe.cq.screens.com.adobe.cq.screens.mq.core" comadobecqscreenscomadobecqscreensmqcore "com.adobe.cq.social.cq-social-as-provider" comadobecqsocialcq-social-as-provider "com.adobe.cq.social.cq-social-badging-basic-impl" comadobecqsocialcq-social-badging-basic-impl "com.adobe.cq.social.cq-social-badging-impl" comadobecqsocialcq-social-badging-impl "com.adobe.cq.social.cq-social-calendar-impl" comadobecqsocialcq-social-calendar-impl "com.adobe.cq.social.cq-social-content-fragments-impl" comadobecqsocialcq-social-content-fragments-impl "com.adobe.cq.social.cq-social-enablement-impl" comadobecqsocialcq-social-enablement-impl "com.adobe.cq.social.cq-social-graph-impl" comadobecqsocialcq-social-graph-impl "com.adobe.cq.social.cq-social-ideation-impl" comadobecqsocialcq-social-ideation-impl "com.adobe.cq.social.cq-social-jcr-provider" comadobecqsocialcq-social-jcr-provider "com.adobe.cq.social.cq-social-members-impl" comadobecqsocialcq-social-members-impl "com.adobe.cq.social.cq-social-ms-provider" comadobecqsocialcq-social-ms-provider "com.adobe.cq.social.cq-social-notifications-channels-web" comadobecqsocialcq-social-notifications-channels-web "com.adobe.cq.social.cq-social-notifications-impl" comadobecqsocialcq-social-notifications-impl "com.adobe.cq.social.cq-social-rdb-provider" comadobecqsocialcq-social-rdb-provider "com.adobe.cq.social.cq-social-scf-impl" comadobecqsocialcq-social-scf-impl "com.adobe.cq.social.cq-social-scoring-basic-impl" comadobecqsocialcq-social-scoring-basic-impl "com.adobe.cq.social.cq-social-scoring-impl" comadobecqsocialcq-social-scoring-impl "com.adobe.cq.social.cq-social-serviceusers-impl" comadobecqsocialcq-social-serviceusers-impl "com.adobe.cq.social.cq-social-srp-impl" comadobecqsocialcq-social-srp-impl "com.adobe.cq.social.cq-social-ugcbase-impl" comadobecqsocialcq-social-ugcbase-impl "com.adobe.dam.cq-dam-cfm-impl" comadobedamcq-dam-cfm-impl "com.adobe.forms.foundation-forms-foundation-base" comadobeformsfoundation-forms-foundation-base "com.adobe.granite.apicontroller" comadobegraniteapicontroller "com.adobe.granite.asset.core" comadobegraniteassetcore "com.adobe.granite.auth.sso" comadobegraniteauthsso "com.adobe.granite.bundles.hc.impl" comadobegranitebundleshcimpl "com.adobe.granite.compat-router" comadobegranitecompat-router "com.adobe.granite.conf" comadobegraniteconf "com.adobe.granite.conf.ui.core" comadobegraniteconfuicore "com.adobe.granite.cors" comadobegranitecors "com.adobe.granite.crx-explorer" comadobegranitecrx-explorer "com.adobe.granite.crxde-lite" comadobegranitecrxde-lite "com.adobe.granite.crypto.config" comadobegranitecryptoconfig "com.adobe.granite.crypto.extension" comadobegranitecryptoextension "com.adobe.granite.crypto.file" comadobegranitecryptofile "com.adobe.granite.crypto.jcr" comadobegranitecryptojcr "com.adobe.granite.csrf" comadobegranitecsrf "com.adobe.granite.distribution.core" comadobegranitedistributioncore "com.adobe.granite.dropwizard.metrics" comadobegranitedropwizardmetrics "com.adobe.granite.frags.impl" comadobegranitefragsimpl "com.adobe.granite.gibson" comadobegranitegibson "com.adobe.granite.infocollector" comadobegraniteinfocollector "com.adobe.granite.installer.factory.packages" comadobegraniteinstallerfactorypackages "com.adobe.granite.jetty.ssl" comadobegranitejettyssl "com.adobe.granite.jobs.async" comadobegranitejobsasync "com.adobe.granite.maintenance.oak" comadobegranitemaintenanceoak "com.adobe.granite.monitoring.core" comadobegranitemonitoringcore "com.adobe.granite.queries" comadobegranitequeries "com.adobe.granite.replication.hc.impl" comadobegranitereplicationhcimpl "com.adobe.granite.repository.checker" comadobegraniterepositorychecker "com.adobe.granite.repository.hc.impl" comadobegraniterepositoryhcimpl "com.adobe.granite.rest.assets" comadobegraniterestassets "com.adobe.granite.security.ui" comadobegranitesecurityui "com.adobe.granite.startup" comadobegranitestartup "com.adobe.granite.tagsoup" comadobegranitetagsoup "com.adobe.granite.taskmanagement.core" comadobegranitetaskmanagementcore "com.adobe.granite.taskmanagement.workflow" comadobegranitetaskmanagementworkflow "com.adobe.granite.ui.clientlibs.compiler.less" comadobegraniteuiclientlibscompilerless "com.adobe.granite.ui.clientlibs.processor.gcc" comadobegraniteuiclientlibsprocessorgcc "com.adobe.granite.webconsole.plugins" comadobegranitewebconsoleplugins "com.adobe.granite.workflow.console" comadobegraniteworkflowconsole "com.adobe.xmp.worker.files.native.fragment.linux" comadobexmpworkerfilesnativefragmentlinux "com.adobe.xmp.worker.files.native.fragment.macosx" comadobexmpworkerfilesnativefragmentmacosx "com.adobe.xmp.worker.files.native.fragment.win" comadobexmpworkerfilesnativefragmentwin "com.day.commons.osgi.wrapper.simple-jndi" comdaycommonsosgiwrappersimple-jndi "com.day.cq.cq-authhandler" comdaycqcq-authhandler "com.day.cq.cq-compat-configupdate" comdaycqcq-compat-configupdate "com.day.cq.cq-licensebranding" comdaycqcq-licensebranding "com.day.cq.cq-notifcation-impl" comdaycqcq-notifcation-impl "com.day.cq.cq-replication-audit" comdaycqcq-replication-audit "com.day.cq.cq-search-ext" comdaycqcq-search-ext "com.day.cq.dam.cq-dam-annotation-print" comdaycqdamcq-dam-annotation-print "com.day.cq.dam.cq-dam-asset-usage" comdaycqdamcq-dam-asset-usage "com.day.cq.dam.cq-dam-s7dam" comdaycqdamcq-dam-s7dam "com.day.cq.dam.cq-dam-similaritysearch" comdaycqdamcq-dam-similaritysearch "com.day.cq.dam.dam-webdav-support" comdaycqdamdam-webdav-support "com.day.cq.pre-upgrade-tasks" comdaycqpre-upgrade-tasks "com.day.cq.replication.extensions" comdaycqreplicationextensions "com.day.cq.wcm.cq-msm-core" comdaycqwcmcq-msm-core "com.day.cq.wcm.cq-wcm-translation" comdaycqwcmcq-wcm-translation "day-commons-jrawio" day-commons-jrawio "org.apache.aries.jmx.whiteboard" orgapacheariesjmxwhiteboard "org.apache.felix.http.sslfilter" orgapachefelixhttpsslfilter "org.apache.felix.org.apache.felix.threaddump" orgapachefelixorgapachefelixthreaddump "org.apache.felix.webconsole.plugins.ds" orgapachefelixwebconsolepluginsds "org.apache.felix.webconsole.plugins.event" orgapachefelixwebconsolepluginsevent "org.apache.felix.webconsole.plugins.memoryusage" orgapachefelixwebconsolepluginsmemoryusage "org.apache.felix.webconsole.plugins.packageadmin" orgapachefelixwebconsolepluginspackageadmin "org.apache.jackrabbit.oak-auth-ldap" orgapachejackrabbitoak-auth-ldap "org.apache.jackrabbit.oak-segment-tar" orgapachejackrabbitoak-segment-tar "org.apache.jackrabbit.oak-solr-osgi" orgapachejackrabbitoak-solr-osgi "org.apache.sling.bundleresource.impl" orgapacheslingbundleresourceimpl "org.apache.sling.commons.fsclassloader" orgapacheslingcommonsfsclassloader "org.apache.sling.commons.log.webconsole" orgapacheslingcommonslogwebconsole "org.apache.sling.datasource" orgapacheslingdatasource "org.apache.sling.discovery.base" orgapacheslingdiscoverybase "org.apache.sling.discovery.oak" orgapacheslingdiscoveryoak "org.apache.sling.discovery.support" orgapacheslingdiscoverysupport "org.apache.sling.distribution.api" orgapacheslingdistributionapi "org.apache.sling.distribution.core" orgapacheslingdistributioncore "org.apache.sling.extensions.webconsolesecurityprovider" orgapacheslingextensionswebconsolesecurityprovider "org.apache.sling.hc.webconsole" orgapacheslinghcwebconsole "org.apache.sling.installer.console" orgapacheslinginstallerconsole "org.apache.sling.installer.provider.file" orgapacheslinginstallerproviderfile "org.apache.sling.installer.provider.jcr" orgapacheslinginstallerproviderjcr "org.apache.sling.jcr.davex" orgapacheslingjcrdavex "org.apache.sling.jcr.resourcesecurity" orgapacheslingjcrresourcesecurity "org.apache.sling.jmx.provider" orgapacheslingjmxprovider "org.apache.sling.launchpad.installer" orgapacheslinglaunchpadinstaller "org.apache.sling.models.impl" orgapacheslingmodelsimpl "org.apache.sling.repoinit.parser" orgapacheslingrepoinitparser "org.apache.sling.resource.inventory" orgapacheslingresourceinventory "org.apache.sling.resourceresolver" orgapacheslingresourceresolver "org.apache.sling.scripting.javascript" orgapacheslingscriptingjavascript "org.apache.sling.scripting.jst" orgapacheslingscriptingjst "org.apache.sling.scripting.sightly.js.provider" orgapacheslingscriptingsightlyjsprovider "org.apache.sling.scripting.sightly.models.provider" orgapacheslingscriptingsightlymodelsprovider "org.apache.sling.security" orgapacheslingsecurity "org.apache.sling.servlets.compat" orgapacheslingservletscompat "org.apache.sling.servlets.get" orgapacheslingservletsget "org.apache.sling.startupfilter.disabler" orgapacheslingstartupfilterdisabler "org.apache.sling.tracer" orgapacheslingtracer "we.retail.client.app.core" weretailclientappcore }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-apicontroller-filter-resolver-hook-factory
  ""
  ([] (com-adobe-granite-apicontroller-filter-resolver-hook-factory nil))
  ([optional-params]
   (:data (com-adobe-granite-apicontroller-filter-resolver-hook-factory-with-http-info optional-params))))

(defn com-adobe-granite-auth-cert-impl-client-cert-auth-handler-with-http-info
  ""
  ([] (com-adobe-granite-auth-cert-impl-client-cert-auth-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path serviceranking ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-cert-impl-client-cert-auth-handler
  ""
  ([] (com-adobe-granite-auth-cert-impl-client-cert-auth-handler nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-cert-impl-client-cert-auth-handler-with-http-info optional-params))))

(defn com-adobe-granite-auth-ims-with-http-info
  ""
  ([] (com-adobe-granite-auth-ims-with-http-info nil))
  ([{:keys [post apply delete action location propertylist configid scope ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.ims" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "configid" configid "scope" scope }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-ims
  ""
  ([] (com-adobe-granite-auth-ims nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-ims-with-http-info optional-params))))

(defn com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-with-http-info
  ""
  ([] (com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension
  ""
  ([] (com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-with-http-info optional-params))))

(defn com-adobe-granite-auth-ims-impl-ims-access-token-request-customizer-impl-with-http-info
  ""
  ([] (com-adobe-granite-auth-ims-impl-ims-access-token-request-customizer-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist authimsclientsecret customizertype ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "auth.ims.client.secret" authimsclientsecret "customizer.type" customizertype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-ims-impl-ims-access-token-request-customizer-impl
  ""
  ([] (com-adobe-granite-auth-ims-impl-ims-access-token-request-customizer-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-ims-impl-ims-access-token-request-customizer-impl-with-http-info optional-params))))

(defn com-adobe-granite-auth-ims-impl-ims-config-provider-impl-with-http-info
  ""
  ([] (com-adobe-granite-auth-ims-impl-ims-config-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthconfigmanagerimsconfigid imsowning-entity aeminstance-id imsservice-code ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.configmanager.ims.configid" oauthconfigmanagerimsconfigid "ims.owningEntity" imsowning-entity "aem.instanceId" aeminstance-id "ims.serviceCode" imsservice-code }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-ims-impl-ims-config-provider-impl
  ""
  ([] (com-adobe-granite-auth-ims-impl-ims-config-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-ims-impl-ims-config-provider-impl-with-http-info optional-params))))

(defn com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-with-http-info
  ""
  ([] (com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator
  ""
  ([] (com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-with-http-info optional-params))))

(defn com-adobe-granite-auth-ims-impl-ims-provider-impl-with-http-info
  ""
  ([] (com-adobe-granite-auth-ims-impl-ims-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid oauthproviderimsauthorizationurl oauthproviderimstokenurl oauthproviderimsprofileurl oauthproviderimsextendeddetailsurls oauthproviderimsvalidatetokenurl oauthproviderimssessionproperty oauthproviderimsservicetokenclientid oauthproviderimsservicetokenclientsecret oauthproviderimsservicetoken imsorgref imsgroupmapping oauthproviderimsonlylicensegroup ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid "oauth.provider.ims.authorization.url" oauthproviderimsauthorizationurl "oauth.provider.ims.token.url" oauthproviderimstokenurl "oauth.provider.ims.profile.url" oauthproviderimsprofileurl "oauth.provider.ims.extended.details.urls" (with-collection-format oauthproviderimsextendeddetailsurls :multi) "oauth.provider.ims.validate.token.url" oauthproviderimsvalidatetokenurl "oauth.provider.ims.session.property" oauthproviderimssessionproperty "oauth.provider.ims.service.token.client.id" oauthproviderimsservicetokenclientid "oauth.provider.ims.service.token.client.secret" oauthproviderimsservicetokenclientsecret "oauth.provider.ims.service.token" oauthproviderimsservicetoken "ims.org.ref" imsorgref "ims.group.mapping" (with-collection-format imsgroupmapping :multi) "oauth.provider.ims.only.license.group" oauthproviderimsonlylicensegroup }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-ims-impl-ims-provider-impl
  ""
  ([] (com-adobe-granite-auth-ims-impl-ims-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-ims-impl-ims-provider-impl-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-accesstoken-provider-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-accesstoken-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name authtokenprovidertitle authtokenproviderdefaultclaims authtokenproviderendpoint authaccesstokenrequest authtokenproviderkeypairalias authtokenproviderconntimeout authtokenprovidersotimeout authtokenproviderclientid authtokenproviderscope authtokenproviderreuseaccesstoken authtokenproviderrelaxedssl tokenrequestcustomizertype authtokenvalidatortype ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "auth.token.provider.title" authtokenprovidertitle "auth.token.provider.default.claims" (with-collection-format authtokenproviderdefaultclaims :multi) "auth.token.provider.endpoint" authtokenproviderendpoint "auth.access.token.request" authaccesstokenrequest "auth.token.provider.keypair.alias" authtokenproviderkeypairalias "auth.token.provider.conn.timeout" authtokenproviderconntimeout "auth.token.provider.so.timeout" authtokenprovidersotimeout "auth.token.provider.client.id" authtokenproviderclientid "auth.token.provider.scope" authtokenproviderscope "auth.token.provider.reuse.access.token" authtokenproviderreuseaccesstoken "auth.token.provider.relaxed.ssl" authtokenproviderrelaxedssl "token.request.customizer.type" tokenrequestcustomizertype "auth.token.validator.type" authtokenvalidatortype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-accesstoken-provider
  ""
  ([] (com-adobe-granite-auth-oauth-accesstoken-provider nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-accesstoken-provider-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-bearer-authentication-handler-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-bearer-authentication-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path oauthclient-idsallowed authbearersyncims authtoken-request-parameter oauthbearerconfigid oauthjwtsupport ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path "oauth.clientIds.allowed" (with-collection-format oauthclient-idsallowed :multi) "auth.bearer.sync.ims" authbearersyncims "auth.tokenRequestParameter" authtoken-request-parameter "oauth.bearer.configid" oauthbearerconfigid "oauth.jwt.support" oauthjwtsupport }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-bearer-authentication-handler
  ""
  ([] (com-adobe-granite-auth-oauth-impl-bearer-authentication-handler nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-bearer-authentication-handler-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-default-token-validator-impl-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-default-token-validator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist authtokenvalidatortype ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "auth.token.validator.type" authtokenvalidatortype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-default-token-validator-impl
  ""
  ([] (com-adobe-granite-auth-oauth-impl-default-token-validator-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-default-token-validator-impl-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-facebook-provider-impl-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-facebook-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-facebook-provider-impl
  ""
  ([] (com-adobe-granite-auth-oauth-impl-facebook-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-facebook-provider-impl-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-github-provider-impl-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-github-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid oauthprovidergithubauthorizationurl oauthprovidergithubtokenurl oauthprovidergithubprofileurl ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid "oauth.provider.github.authorization.url" oauthprovidergithubauthorizationurl "oauth.provider.github.token.url" oauthprovidergithubtokenurl "oauth.provider.github.profile.url" oauthprovidergithubprofileurl }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-github-provider-impl
  ""
  ([] (com-adobe-granite-auth-oauth-impl-github-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-github-provider-impl-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-granite-provider-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-granite-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid oauthprovidergraniteauthorizationurl oauthprovidergranitetokenurl oauthprovidergraniteprofileurl oauthprovidergraniteextendeddetailsurls ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid "oauth.provider.granite.authorization.url" oauthprovidergraniteauthorizationurl "oauth.provider.granite.token.url" oauthprovidergranitetokenurl "oauth.provider.granite.profile.url" oauthprovidergraniteprofileurl "oauth.provider.granite.extended.details.urls" oauthprovidergraniteextendeddetailsurls }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-granite-provider
  ""
  ([] (com-adobe-granite-auth-oauth-impl-granite-provider nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-granite-provider-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthcookielogintimeout oauthcookiemaxage ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.cookie.login.timeout" oauthcookielogintimeout "oauth.cookie.max.age" oauthcookiemaxage }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-helper-provider-config-manager
  ""
  ([] (com-adobe-granite-auth-oauth-impl-helper-provider-config-manager nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthcookielogintimeout oauthcookiemaxage ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.cookie.login.timeout" oauthcookielogintimeout "oauth.cookie.max.age" oauthcookiemaxage }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal
  ""
  ([] (com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler
  ""
  ([] (com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-impl-twitter-provider-impl-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-impl-twitter-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthproviderid ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.provider.id" oauthproviderid }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-impl-twitter-provider-impl
  ""
  ([] (com-adobe-granite-auth-oauth-impl-twitter-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-impl-twitter-provider-impl-with-http-info optional-params))))

(defn com-adobe-granite-auth-oauth-provider-with-http-info
  ""
  ([] (com-adobe-granite-auth-oauth-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthconfigid oauthclientid oauthclientsecret oauthscope oauthconfigproviderid oauthcreateusers oauthuseridproperty forcestrictusernamematching oauthencodeuserids oauthhashuserids oauthcall-back-url oauthaccesstokenpersist oauthaccesstokenpersistcookie oauthcsrfstateprotection oauthredirectrequestparams oauthconfigsiblingsallow ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.oauth.provider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.config.id" oauthconfigid "oauth.client.id" oauthclientid "oauth.client.secret" oauthclientsecret "oauth.scope" (with-collection-format oauthscope :multi) "oauth.config.provider.id" oauthconfigproviderid "oauth.create.users" oauthcreateusers "oauth.userid.property" oauthuseridproperty "force.strict.username.matching" forcestrictusernamematching "oauth.encode.userids" oauthencodeuserids "oauth.hash.userids" oauthhashuserids "oauth.callBackUrl" oauthcall-back-url "oauth.access.token.persist" oauthaccesstokenpersist "oauth.access.token.persist.cookie" oauthaccesstokenpersistcookie "oauth.csrf.state.protection" oauthcsrfstateprotection "oauth.redirect.request.params" oauthredirectrequestparams "oauth.config.siblings.allow" oauthconfigsiblingsallow }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-oauth-provider
  ""
  ([] (com-adobe-granite-auth-oauth-provider nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-oauth-provider-with-http-info optional-params))))

(defn com-adobe-granite-auth-requirement-impl-default-requirement-handler-with-http-info
  ""
  ([] (com-adobe-granite-auth-requirement-impl-default-requirement-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist supported-paths ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "supportedPaths" (with-collection-format supported-paths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-requirement-impl-default-requirement-handler
  ""
  ([] (com-adobe-granite-auth-requirement-impl-default-requirement-handler nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-requirement-impl-default-requirement-handler-with-http-info optional-params))))

(defn com-adobe-granite-auth-saml-saml-authentication-handler-with-http-info
  ""
  ([] (com-adobe-granite-auth-saml-saml-authentication-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path serviceranking idp-url idp-cert-alias idp-http-redirect service-provider-entity-id assertion-consumer-service-url sp-private-key-alias key-store-password default-redirect-url user-id-attribute use-encryption create-user user-intermediate-path add-group-memberships group-membership-attribute default-groups name-id-format synchronize-attributes handle-logout logout-url clock-tolerance digest-method signature-method identity-sync-type idp-identifier ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" (with-collection-format path :multi) "service.ranking" serviceranking "idpUrl" idp-url "idpCertAlias" idp-cert-alias "idpHttpRedirect" idp-http-redirect "serviceProviderEntityId" service-provider-entity-id "assertionConsumerServiceURL" assertion-consumer-service-url "spPrivateKeyAlias" sp-private-key-alias "keyStorePassword" key-store-password "defaultRedirectUrl" default-redirect-url "userIDAttribute" user-id-attribute "useEncryption" use-encryption "createUser" create-user "userIntermediatePath" user-intermediate-path "addGroupMemberships" add-group-memberships "groupMembershipAttribute" group-membership-attribute "defaultGroups" (with-collection-format default-groups :multi) "nameIdFormat" name-id-format "synchronizeAttributes" (with-collection-format synchronize-attributes :multi) "handleLogout" handle-logout "logoutUrl" logout-url "clockTolerance" clock-tolerance "digestMethod" digest-method "signatureMethod" signature-method "identitySyncType" identity-sync-type "idpIdentifier" idp-identifier }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-saml-saml-authentication-handler
  ""
  ([] (com-adobe-granite-auth-saml-saml-authentication-handler nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-saml-saml-authentication-handler-with-http-info optional-params))))

(defn com-adobe-granite-auth-sso-impl-sso-authentication-handler-with-http-info
  ""
  ([] (com-adobe-granite-auth-sso-impl-sso-authentication-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path serviceranking jaascontrol-flag jaasrealm-name jaasranking headers cookies parameters usermap format trusted-credentials-attribute ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path "service.ranking" serviceranking "jaas.controlFlag" jaascontrol-flag "jaas.realmName" jaasrealm-name "jaas.ranking" jaasranking "headers" (with-collection-format headers :multi) "cookies" (with-collection-format cookies :multi) "parameters" (with-collection-format parameters :multi) "usermap" (with-collection-format usermap :multi) "format" format "trustedCredentialsAttribute" trusted-credentials-attribute }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-auth-sso-impl-sso-authentication-handler
  ""
  ([] (com-adobe-granite-auth-sso-impl-sso-authentication-handler nil))
  ([optional-params]
   (:data (com-adobe-granite-auth-sso-impl-sso-authentication-handler-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-code-cache-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-code-cache-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags minimumcodecachesize ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) "minimum.code.cache.size" minimumcodecachesize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-code-cache-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-code-cache-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-code-cache-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-crxde-support-bundle-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-crxde-support-bundle-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-crxde-support-bundle-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-crxde-support-bundle-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-crxde-support-bundle-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-dav-ex-bundle-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-dav-ex-bundle-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-dav-ex-bundle-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-dav-ex-bundle-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-dav-ex-bundle-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-inactive-bundles-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-inactive-bundles-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ignoredbundles ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) "ignored.bundles" (with-collection-format ignoredbundles :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-inactive-bundles-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-inactive-bundles-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-inactive-bundles-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-jobs-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-jobs-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags maxqueuedjobs ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) "max.queued.jobs" maxqueuedjobs }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-jobs-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-jobs-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-jobs-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-sling-get-servlet-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-sling-get-servlet-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-sling-get-servlet-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-sling-get-servlet-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-sling-get-servlet-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-sling-java-script-handler-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-sling-java-script-handler-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-sling-java-script-handler-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-sling-java-script-handler-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-sling-java-script-handler-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-sling-jsp-script-handler-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-sling-jsp-script-handler-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-sling-jsp-script-handler-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-sling-jsp-script-handler-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-sling-jsp-script-handler-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-sling-referrer-filter-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-sling-referrer-filter-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-sling-referrer-filter-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-sling-referrer-filter-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-sling-referrer-filter-health-check-with-http-info optional-params))))

(defn com-adobe-granite-bundles-hc-impl-web-dav-bundle-health-check-with-http-info
  ""
  ([] (com-adobe-granite-bundles-hc-impl-web-dav-bundle-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-bundles-hc-impl-web-dav-bundle-health-check
  ""
  ([] (com-adobe-granite-bundles-hc-impl-web-dav-bundle-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-bundles-hc-impl-web-dav-bundle-health-check-with-http-info optional-params))))

(defn com-adobe-granite-comments-internal-comment-replication-content-filter-fac-with-http-info
  ""
  ([] (com-adobe-granite-comments-internal-comment-replication-content-filter-fac-with-http-info nil))
  ([{:keys [post apply delete action location propertylist replicatecommentresource-types ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "replicate.comment.resourceTypes" (with-collection-format replicatecommentresource-types :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-comments-internal-comment-replication-content-filter-fac
  ""
  ([] (com-adobe-granite-comments-internal-comment-replication-content-filter-fac nil))
  ([optional-params]
   (:data (com-adobe-granite-comments-internal-comment-replication-content-filter-fac-with-http-info optional-params))))

(defn com-adobe-granite-compatrouter-impl-compat-switching-service-impl-with-http-info
  ""
  ([] (com-adobe-granite-compatrouter-impl-compat-switching-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist compatgroups enabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "compatgroups" (with-collection-format compatgroups :multi) "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-compatrouter-impl-compat-switching-service-impl
  ""
  ([] (com-adobe-granite-compatrouter-impl-compat-switching-service-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-compatrouter-impl-compat-switching-service-impl-with-http-info optional-params))))

(defn com-adobe-granite-compatrouter-impl-routing-config-with-http-info
  ""
  ([] (com-adobe-granite-compatrouter-impl-routing-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist id compat-path new-path ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "id" id "compatPath" compat-path "newPath" new-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-compatrouter-impl-routing-config
  ""
  ([] (com-adobe-granite-compatrouter-impl-routing-config nil))
  ([optional-params]
   (:data (com-adobe-granite-compatrouter-impl-routing-config-with-http-info optional-params))))

(defn com-adobe-granite-compatrouter-impl-switch-mapping-config-with-http-info
  ""
  ([] (com-adobe-granite-compatrouter-impl-switch-mapping-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist group ids ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "group" group "ids" (with-collection-format ids :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-compatrouter-impl-switch-mapping-config
  ""
  ([] (com-adobe-granite-compatrouter-impl-switch-mapping-config nil))
  ([optional-params]
   (:data (com-adobe-granite-compatrouter-impl-switch-mapping-config-with-http-info optional-params))))

(defn com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-with-http-info
  ""
  ([] (com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled fallback-paths ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "fallbackPaths" (with-collection-format fallback-paths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving
  ""
  ([] (com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving nil))
  ([optional-params]
   (:data (com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-with-http-info optional-params))))

(defn com-adobe-granite-contexthub-impl-context-hub-impl-with-http-info
  ""
  ([] (com-adobe-granite-contexthub-impl-context-hub-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobegranitecontexthubsilent-mode comadobegranitecontexthubshow-ui ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.granite.contexthub.silent_mode" comadobegranitecontexthubsilent-mode "com.adobe.granite.contexthub.show_ui" comadobegranitecontexthubshow-ui }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-contexthub-impl-context-hub-impl
  ""
  ([] (com-adobe-granite-contexthub-impl-context-hub-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-contexthub-impl-context-hub-impl-with-http-info optional-params))))

(defn com-adobe-granite-cors-impl-cors-policy-impl-with-http-info
  ""
  ([] (com-adobe-granite-cors-impl-cors-policy-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist alloworigin alloworiginregexp allowedpaths exposedheaders maxage supportedheaders supportedmethods supportscredentials ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "alloworigin" (with-collection-format alloworigin :multi) "alloworiginregexp" (with-collection-format alloworiginregexp :multi) "allowedpaths" (with-collection-format allowedpaths :multi) "exposedheaders" (with-collection-format exposedheaders :multi) "maxage" maxage "supportedheaders" (with-collection-format supportedheaders :multi) "supportedmethods" (with-collection-format supportedmethods :multi) "supportscredentials" supportscredentials }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-cors-impl-cors-policy-impl
  ""
  ([] (com-adobe-granite-cors-impl-cors-policy-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-cors-impl-cors-policy-impl-with-http-info optional-params))))

(defn com-adobe-granite-csrf-impl-csrf-filter-with-http-info
  ""
  ([] (com-adobe-granite-csrf-impl-csrf-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist filtermethods filterenablesafeuseragents filtersafeuseragents filterexcludedpaths ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "filter.methods" (with-collection-format filtermethods :multi) "filter.enable.safe.user.agents" filterenablesafeuseragents "filter.safe.user.agents" (with-collection-format filtersafeuseragents :multi) "filter.excluded.paths" (with-collection-format filterexcludedpaths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-csrf-impl-csrf-filter
  ""
  ([] (com-adobe-granite-csrf-impl-csrf-filter nil))
  ([optional-params]
   (:data (com-adobe-granite-csrf-impl-csrf-filter-with-http-info optional-params))))

(defn com-adobe-granite-csrf-impl-csrf-servlet-with-http-info
  ""
  ([] (com-adobe-granite-csrf-impl-csrf-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist csrftokenexpiresin slingauthrequirements ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "csrf.token.expires.in" csrftokenexpiresin "sling.auth.requirements" slingauthrequirements }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-csrf-impl-csrf-servlet
  ""
  ([] (com-adobe-granite-csrf-impl-csrf-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-csrf-impl-csrf-servlet-with-http-info optional-params))))

(defn com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-with-http-info
  ""
  ([] (com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name username encrypted-password ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "username" username "encryptedPassword" encrypted-password }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se
  ""
  ([] (com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se nil))
  ([optional-params]
   (:data (com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-with-http-info optional-params))))

(defn com-adobe-granite-distribution-core-impl-diff-diff-changes-observer-with-http-info
  ""
  ([] (com-adobe-granite-distribution-core-impl-diff-diff-changes-observer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled agent-name diff-path observed-path service-name property-names distribution-delay service-usertarget ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "agentName" agent-name "diffPath" diff-path "observedPath" observed-path "serviceName" service-name "propertyNames" property-names "distributionDelay" distribution-delay "serviceUser.target" service-usertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-distribution-core-impl-diff-diff-changes-observer
  ""
  ([] (com-adobe-granite-distribution-core-impl-diff-diff-changes-observer nil))
  ([optional-params]
   (:data (com-adobe-granite-distribution-core-impl-diff-diff-changes-observer-with-http-info optional-params))))

(defn com-adobe-granite-distribution-core-impl-diff-diff-event-listener-with-http-info
  ""
  ([] (com-adobe-granite-distribution-core-impl-diff-diff-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist diff-path service-name service-usertarget ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "diffPath" diff-path "serviceName" service-name "serviceUser.target" service-usertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-distribution-core-impl-diff-diff-event-listener
  ""
  ([] (com-adobe-granite-distribution-core-impl-diff-diff-event-listener nil))
  ([optional-params]
   (:data (com-adobe-granite-distribution-core-impl-diff-diff-event-listener-with-http-info optional-params))))

(defn com-adobe-granite-distribution-core-impl-distribution-to-replication-even-with-http-info
  ""
  ([] (com-adobe-granite-distribution-core-impl-distribution-to-replication-even-with-http-info nil))
  ([{:keys [post apply delete action location propertylist importername ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "importer.name" (with-collection-format importername :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-distribution-core-impl-distribution-to-replication-even
  ""
  ([] (com-adobe-granite-distribution-core-impl-distribution-to-replication-even nil))
  ([optional-params]
   (:data (com-adobe-granite-distribution-core-impl-distribution-to-replication-even-with-http-info optional-params))))

(defn com-adobe-granite-distribution-core-impl-replication-adapters-replicat-with-http-info
  ""
  ([] (com-adobe-granite-distribution-core-impl-replication-adapters-replicat-with-http-info nil))
  ([{:keys [post apply delete action location propertylist provider-name forwardrequests ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "providerName" provider-name "forward.requests" forwardrequests }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-distribution-core-impl-replication-adapters-replicat
  ""
  ([] (com-adobe-granite-distribution-core-impl-replication-adapters-replicat nil))
  ([optional-params]
   (:data (com-adobe-granite-distribution-core-impl-replication-adapters-replicat-with-http-info optional-params))))

(defn com-adobe-granite-distribution-core-impl-replication-distribution-trans-with-http-info
  ""
  ([] (com-adobe-granite-distribution-core-impl-replication-distribution-trans-with-http-info nil))
  ([{:keys [post apply delete action location propertylist forwardrequests ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "forward.requests" forwardrequests }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-distribution-core-impl-replication-distribution-trans
  ""
  ([] (com-adobe-granite-distribution-core-impl-replication-distribution-trans nil))
  ([optional-params]
   (:data (com-adobe-granite-distribution-core-impl-replication-distribution-trans-with-http-info optional-params))))

(defn com-adobe-granite-distribution-core-impl-transport-access-token-distribu-with-http-info
  ""
  ([] (com-adobe-granite-distribution-core-impl-transport-access-token-distribu-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name service-name user-id access-token-providertarget ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "serviceName" service-name "userId" user-id "accessTokenProvider.target" access-token-providertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-distribution-core-impl-transport-access-token-distribu
  ""
  ([] (com-adobe-granite-distribution-core-impl-transport-access-token-distribu nil))
  ([optional-params]
   (:data (com-adobe-granite-distribution-core-impl-transport-access-token-distribu-with-http-info optional-params))))

(defn com-adobe-granite-frags-impl-check-http-header-flag-with-http-info
  ""
  ([] (com-adobe-granite-frags-impl-check-http-header-flag-with-http-info nil))
  ([{:keys [post apply delete action location propertylist featurename featuredescription httpheadername httpheadervaluepattern ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "feature.name" featurename "feature.description" featuredescription "http.header.name" httpheadername "http.header.valuepattern" httpheadervaluepattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-frags-impl-check-http-header-flag
  ""
  ([] (com-adobe-granite-frags-impl-check-http-header-flag nil))
  ([optional-params]
   (:data (com-adobe-granite-frags-impl-check-http-header-flag-with-http-info optional-params))))

(defn com-adobe-granite-frags-impl-random-feature-with-http-info
  ""
  ([] (com-adobe-granite-frags-impl-random-feature-with-http-info nil))
  ([{:keys [post apply delete action location propertylist featurename featuredescription activepercentage cookiename cookiemax-age ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "feature.name" featurename "feature.description" featuredescription "active.percentage" activepercentage "cookie.name" cookiename "cookie.maxAge" cookiemax-age }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-frags-impl-random-feature
  ""
  ([] (com-adobe-granite-frags-impl-random-feature nil))
  ([optional-params]
   (:data (com-adobe-granite-frags-impl-random-feature-with-http-info optional-params))))

(defn com-adobe-granite-httpcache-file-file-cache-store-with-http-info
  ""
  ([] (com-adobe-granite-httpcache-file-file-cache-store-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobegranitehttpcachefiledocument-root comadobegranitehttpcachefileinclude-host ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.granite.httpcache.file.documentRoot" comadobegranitehttpcachefiledocument-root "com.adobe.granite.httpcache.file.includeHost" comadobegranitehttpcachefileinclude-host }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-httpcache-file-file-cache-store
  ""
  ([] (com-adobe-granite-httpcache-file-file-cache-store nil))
  ([optional-params]
   (:data (com-adobe-granite-httpcache-file-file-cache-store-with-http-info optional-params))))

(defn com-adobe-granite-httpcache-impl-outer-cache-filter-with-http-info
  ""
  ([] (com-adobe-granite-httpcache-impl-outer-cache-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobegranitehttpcacheurlpaths ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.granite.httpcache.url.paths" (with-collection-format comadobegranitehttpcacheurlpaths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-httpcache-impl-outer-cache-filter
  ""
  ([] (com-adobe-granite-httpcache-impl-outer-cache-filter nil))
  ([optional-params]
   (:data (com-adobe-granite-httpcache-impl-outer-cache-filter-with-http-info optional-params))))

(defn com-adobe-granite-i18n-impl-bundle-pseudo-translations-with-http-info
  ""
  ([] (com-adobe-granite-i18n-impl-bundle-pseudo-translations-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pseudopatterns ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "pseudo.patterns" (with-collection-format pseudopatterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-i18n-impl-bundle-pseudo-translations
  ""
  ([] (com-adobe-granite-i18n-impl-bundle-pseudo-translations nil))
  ([optional-params]
   (:data (com-adobe-granite-i18n-impl-bundle-pseudo-translations-with-http-info optional-params))))

(defn com-adobe-granite-i18n-impl-preferences-locale-resolver-service-with-http-info
  ""
  ([] (com-adobe-granite-i18n-impl-preferences-locale-resolver-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist securitypreferencesname ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "security.preferences.name" securitypreferencesname }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-i18n-impl-preferences-locale-resolver-service
  ""
  ([] (com-adobe-granite-i18n-impl-preferences-locale-resolver-service nil))
  ([optional-params]
   (:data (com-adobe-granite-i18n-impl-preferences-locale-resolver-service-with-http-info optional-params))))

(defn com-adobe-granite-infocollector-info-collector-with-http-info
  ""
  ([] (com-adobe-granite-infocollector-info-collector-with-http-info nil))
  ([{:keys [post apply delete action location propertylist graniteinfocollectorinclude-thread-dumps graniteinfocollectorinclude-heap-dump ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.infocollector.InfoCollector" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "granite.infocollector.includeThreadDumps" graniteinfocollectorinclude-thread-dumps "granite.infocollector.includeHeapDump" graniteinfocollectorinclude-heap-dump }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-infocollector-info-collector
  ""
  ([] (com-adobe-granite-infocollector-info-collector nil))
  ([optional-params]
   (:data (com-adobe-granite-infocollector-info-collector-with-http-info optional-params))))

(defn com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-with-http-info
  ""
  ([] (com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comadobegranitejettysslport comadobegranitejettysslkeystoreuser comadobegranitejettysslkeystorepassword comadobegranitejettysslciphersuitesexcluded comadobegranitejettysslciphersuitesincluded comadobegranitejettysslclientcertificate ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.adobe.granite.jetty.ssl.port" comadobegranitejettysslport "com.adobe.granite.jetty.ssl.keystore.user" comadobegranitejettysslkeystoreuser "com.adobe.granite.jetty.ssl.keystore.password" comadobegranitejettysslkeystorepassword "com.adobe.granite.jetty.ssl.ciphersuites.excluded" (with-collection-format comadobegranitejettysslciphersuitesexcluded :multi) "com.adobe.granite.jetty.ssl.ciphersuites.included" (with-collection-format comadobegranitejettysslciphersuitesincluded :multi) "com.adobe.granite.jetty.ssl.client.certificate" comadobegranitejettysslclientcertificate }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory
  ""
  ([] (com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory nil))
  ([optional-params]
   (:data (com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-with-http-info optional-params))))

(defn com-adobe-granite-license-impl-license-check-filter-with-http-info
  ""
  ([] (com-adobe-granite-license-impl-license-check-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist check-internval exclude-ids encrypt-ping ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "checkInternval" check-internval "excludeIds" (with-collection-format exclude-ids :multi) "encryptPing" encrypt-ping }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-license-impl-license-check-filter
  ""
  ([] (com-adobe-granite-license-impl-license-check-filter nil))
  ([optional-params]
   (:data (com-adobe-granite-license-impl-license-check-filter-with-http-info optional-params))))

(defn com-adobe-granite-logging-impl-log-analyser-impl-with-http-info
  ""
  ([] (com-adobe-granite-logging-impl-log-analyser-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist messagesqueuesize loggerconfig messagessize ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "messages.queue.size" messagesqueuesize "logger.config" (with-collection-format loggerconfig :multi) "messages.size" messagessize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-logging-impl-log-analyser-impl
  ""
  ([] (com-adobe-granite-logging-impl-log-analyser-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-logging-impl-log-analyser-impl-with-http-info optional-params))))

(defn com-adobe-granite-logging-impl-log-error-health-check-with-http-info
  ""
  ([] (com-adobe-granite-logging-impl-log-error-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-logging-impl-log-error-health-check
  ""
  ([] (com-adobe-granite-logging-impl-log-error-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-logging-impl-log-error-health-check-with-http-info optional-params))))

(defn com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task-with-http-info
  ""
  ([] (com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist granitemaintenancemandatory jobtopics ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "granite.maintenance.mandatory" granitemaintenancemandatory "job.topics" jobtopics }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task
  ""
  ([] (com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task nil))
  ([optional-params]
   (:data (com-adobe-granite-maintenance-crx-impl-data-store-garbage-collection-task-with-http-info optional-params))))

(defn com-adobe-granite-maintenance-crx-impl-lucene-binaries-cleanup-task-with-http-info
  ""
  ([] (com-adobe-granite-maintenance-crx-impl-lucene-binaries-cleanup-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jobtopics ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "job.topics" jobtopics }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-maintenance-crx-impl-lucene-binaries-cleanup-task
  ""
  ([] (com-adobe-granite-maintenance-crx-impl-lucene-binaries-cleanup-task nil))
  ([optional-params]
   (:data (com-adobe-granite-maintenance-crx-impl-lucene-binaries-cleanup-task-with-http-info optional-params))))

(defn com-adobe-granite-maintenance-crx-impl-revision-cleanup-task-with-http-info
  ""
  ([] (com-adobe-granite-maintenance-crx-impl-revision-cleanup-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist fullgcdays ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "full.gc.days" (with-collection-format fullgcdays :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-maintenance-crx-impl-revision-cleanup-task
  ""
  ([] (com-adobe-granite-maintenance-crx-impl-revision-cleanup-task nil))
  ([optional-params]
   (:data (com-adobe-granite-maintenance-crx-impl-revision-cleanup-task-with-http-info optional-params))))

(defn com-adobe-granite-monitoring-impl-script-config-impl-with-http-info
  ""
  ([] (com-adobe-granite-monitoring-impl-script-config-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist scriptfilename scriptdisplay scriptpath scriptplatform interval jmxdomain ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "script.filename" scriptfilename "script.display" scriptdisplay "script.path" scriptpath "script.platform" (with-collection-format scriptplatform :multi) "interval" interval "jmxdomain" jmxdomain }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-monitoring-impl-script-config-impl
  ""
  ([] (com-adobe-granite-monitoring-impl-script-config-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-monitoring-impl-script-config-impl-with-http-info optional-params))))

(defn com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han-with-http-info
  ""
  ([] (com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path jaascontrol-flag jaasrealm-name jaasranking oauthofflinevalidation ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path "jaas.controlFlag" jaascontrol-flag "jaas.realmName" jaasrealm-name "jaas.ranking" jaasranking "oauth.offline.validation" oauthofflinevalidation }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han
  ""
  ([] (com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han nil))
  ([optional-params]
   (:data (com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han-with-http-info optional-params))))

(defn com-adobe-granite-oauth-server-impl-access-token-cleanup-task-with-http-info
  ""
  ([] (com-adobe-granite-oauth-server-impl-access-token-cleanup-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-oauth-server-impl-access-token-cleanup-task
  ""
  ([] (com-adobe-granite-oauth-server-impl-access-token-cleanup-task nil))
  ([optional-params]
   (:data (com-adobe-granite-oauth-server-impl-access-token-cleanup-task-with-http-info optional-params))))

(defn com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet-with-http-info
  ""
  ([] (com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthclientrevocationactive ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.client.revocation.active" oauthclientrevocationactive }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet
  ""
  ([] (com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet-with-http-info optional-params))))

(defn com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet-with-http-info
  ""
  ([] (com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletpaths oauthrevocationactive ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.paths" slingservletpaths "oauth.revocation.active" oauthrevocationactive }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet
  ""
  ([] (com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet-with-http-info optional-params))))

(defn com-adobe-granite-oauth-server-impl-o-auth2-token-endpoint-servlet-with-http-info
  ""
  ([] (com-adobe-granite-oauth-server-impl-o-auth2-token-endpoint-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthissuer oauthaccesstokenexpiresin osgihttpwhiteboardservletpattern osgihttpwhiteboardcontextselect ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.issuer" oauthissuer "oauth.access.token.expires.in" oauthaccesstokenexpiresin "osgi.http.whiteboard.servlet.pattern" osgihttpwhiteboardservletpattern "osgi.http.whiteboard.context.select" osgihttpwhiteboardcontextselect }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-oauth-server-impl-o-auth2-token-endpoint-servlet
  ""
  ([] (com-adobe-granite-oauth-server-impl-o-auth2-token-endpoint-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-oauth-server-impl-o-auth2-token-endpoint-servlet-with-http-info optional-params))))

(defn com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-with-http-info
  ""
  ([] (com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist oauthtokenrevocationactive ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "oauth.token.revocation.active" oauthtokenrevocationactive }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet
  ""
  ([] (com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-with-http-info optional-params))))

(defn com-adobe-granite-offloading-impl-offloading-configurator-with-http-info
  ""
  ([] (com-adobe-granite-offloading-impl-offloading-configurator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist offloadingtransporter offloadingcleanuppayload ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "offloading.transporter" offloadingtransporter "offloading.cleanup.payload" offloadingcleanuppayload }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-offloading-impl-offloading-configurator
  ""
  ([] (com-adobe-granite-offloading-impl-offloading-configurator nil))
  ([optional-params]
   (:data (com-adobe-granite-offloading-impl-offloading-configurator-with-http-info optional-params))))

(defn com-adobe-granite-offloading-impl-offloading-job-cloner-with-http-info
  ""
  ([] (com-adobe-granite-offloading-impl-offloading-job-cloner-with-http-info nil))
  ([{:keys [post apply delete action location propertylist offloadingjobclonerenabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "offloading.jobcloner.enabled" offloadingjobclonerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-offloading-impl-offloading-job-cloner
  ""
  ([] (com-adobe-granite-offloading-impl-offloading-job-cloner nil))
  ([optional-params]
   (:data (com-adobe-granite-offloading-impl-offloading-job-cloner-with-http-info optional-params))))

(defn com-adobe-granite-offloading-impl-offloading-job-offloader-with-http-info
  ""
  ([] (com-adobe-granite-offloading-impl-offloading-job-offloader-with-http-info nil))
  ([{:keys [post apply delete action location propertylist offloadingoffloaderenabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "offloading.offloader.enabled" offloadingoffloaderenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-offloading-impl-offloading-job-offloader
  ""
  ([] (com-adobe-granite-offloading-impl-offloading-job-offloader nil))
  ([optional-params]
   (:data (com-adobe-granite-offloading-impl-offloading-job-offloader-with-http-info optional-params))))

(defn com-adobe-granite-offloading-impl-transporter-offloading-agent-manager-with-http-info
  ""
  ([] (com-adobe-granite-offloading-impl-transporter-offloading-agent-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist offloadingagentmanagerenabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "offloading.agentmanager.enabled" offloadingagentmanagerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-offloading-impl-transporter-offloading-agent-manager
  ""
  ([] (com-adobe-granite-offloading-impl-transporter-offloading-agent-manager nil))
  ([optional-params]
   (:data (com-adobe-granite-offloading-impl-transporter-offloading-agent-manager-with-http-info optional-params))))

(defn com-adobe-granite-offloading-impl-transporter-offloading-default-transpo-with-http-info
  ""
  ([] (com-adobe-granite-offloading-impl-transporter-offloading-default-transpo-with-http-info nil))
  ([{:keys [post apply delete action location propertylist defaulttransportagent-to-workerprefix defaulttransportagent-to-masterprefix defaulttransportinputpackage defaulttransportoutputpackage defaulttransportreplicationsynchronous defaulttransportcontentpackage offloadingtransporterdefaultenabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "default.transport.agent-to-worker.prefix" defaulttransportagent-to-workerprefix "default.transport.agent-to-master.prefix" defaulttransportagent-to-masterprefix "default.transport.input.package" defaulttransportinputpackage "default.transport.output.package" defaulttransportoutputpackage "default.transport.replication.synchronous" defaulttransportreplicationsynchronous "default.transport.contentpackage" defaulttransportcontentpackage "offloading.transporter.default.enabled" offloadingtransporterdefaultenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-offloading-impl-transporter-offloading-default-transpo
  ""
  ([] (com-adobe-granite-offloading-impl-transporter-offloading-default-transpo nil))
  ([optional-params]
   (:data (com-adobe-granite-offloading-impl-transporter-offloading-default-transpo-with-http-info optional-params))))

(defn com-adobe-granite-omnisearch-impl-core-omni-search-service-impl-with-http-info
  ""
  ([] (com-adobe-granite-omnisearch-impl-core-omni-search-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist omnisearchsuggestionrequiretextmin omnisearchsuggestionspellcheckrequire ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "omnisearch.suggestion.requiretext.min" omnisearchsuggestionrequiretextmin "omnisearch.suggestion.spellcheck.require" omnisearchsuggestionspellcheckrequire }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-omnisearch-impl-core-omni-search-service-impl
  ""
  ([] (com-adobe-granite-omnisearch-impl-core-omni-search-service-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-omnisearch-impl-core-omni-search-service-impl-with-http-info optional-params))))

(defn com-adobe-granite-optout-impl-opt-out-service-impl-with-http-info
  ""
  ([] (com-adobe-granite-optout-impl-opt-out-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist optoutcookies optoutheaders optoutwhitelistcookies ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "optout.cookies" (with-collection-format optoutcookies :multi) "optout.headers" (with-collection-format optoutheaders :multi) "optout.whitelist.cookies" (with-collection-format optoutwhitelistcookies :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-optout-impl-opt-out-service-impl
  ""
  ([] (com-adobe-granite-optout-impl-opt-out-service-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-optout-impl-opt-out-service-impl-with-http-info optional-params))))

(defn com-adobe-granite-queries-impl-hc-async-index-health-check-with-http-info
  ""
  ([] (com-adobe-granite-queries-impl-hc-async-index-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist indexingcriticalthreshold indexingwarnthreshold hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "indexing.critical.threshold" indexingcriticalthreshold "indexing.warn.threshold" indexingwarnthreshold "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-queries-impl-hc-async-index-health-check
  ""
  ([] (com-adobe-granite-queries-impl-hc-async-index-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-queries-impl-hc-async-index-health-check-with-http-info optional-params))))

(defn com-adobe-granite-queries-impl-hc-large-index-health-check-with-http-info
  ""
  ([] (com-adobe-granite-queries-impl-hc-large-index-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist largeindexcriticalthreshold largeindexwarnthreshold hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "large.index.critical.threshold" largeindexcriticalthreshold "large.index.warn.threshold" largeindexwarnthreshold "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-queries-impl-hc-large-index-health-check
  ""
  ([] (com-adobe-granite-queries-impl-hc-large-index-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-queries-impl-hc-large-index-health-check-with-http-info optional-params))))

(defn com-adobe-granite-queries-impl-hc-queries-status-health-check-with-http-info
  ""
  ([] (com-adobe-granite-queries-impl-hc-queries-status-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-queries-impl-hc-queries-status-health-check
  ""
  ([] (com-adobe-granite-queries-impl-hc-queries-status-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-queries-impl-hc-queries-status-health-check-with-http-info optional-params))))

(defn com-adobe-granite-queries-impl-hc-query-health-check-metrics-with-http-info
  ""
  ([] (com-adobe-granite-queries-impl-hc-query-health-check-metrics-with-http-info nil))
  ([{:keys [post apply delete action location propertylist get-period ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "getPeriod" get-period }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-queries-impl-hc-query-health-check-metrics
  ""
  ([] (com-adobe-granite-queries-impl-hc-query-health-check-metrics nil))
  ([optional-params]
   (:data (com-adobe-granite-queries-impl-hc-query-health-check-metrics-with-http-info optional-params))))

(defn com-adobe-granite-queries-impl-hc-query-limits-health-check-with-http-info
  ""
  ([] (com-adobe-granite-queries-impl-hc-query-limits-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-queries-impl-hc-query-limits-health-check
  ""
  ([] (com-adobe-granite-queries-impl-hc-query-limits-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-queries-impl-hc-query-limits-health-check-with-http-info optional-params))))

(defn com-adobe-granite-replication-hc-impl-replication-queue-health-check-with-http-info
  ""
  ([] (com-adobe-granite-replication-hc-impl-replication-queue-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist numberofretriesallowed hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "number.of.retries.allowed" numberofretriesallowed "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-replication-hc-impl-replication-queue-health-check
  ""
  ([] (com-adobe-granite-replication-hc-impl-replication-queue-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-replication-hc-impl-replication-queue-health-check-with-http-info optional-params))))

(defn com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-with-http-info
  ""
  ([] (com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-replication-hc-impl-replication-transport-users-health-c
  ""
  ([] (com-adobe-granite-replication-hc-impl-replication-transport-users-health-c nil))
  ([optional-params]
   (:data (com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-with-http-info optional-params))))

(defn com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-with-http-info
  ""
  ([] (com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check
  ""
  ([] (com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-with-http-info optional-params))))

(defn com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c-with-http-info
  ""
  ([] (com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags excludesearchpath ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) "exclude.search.path" (with-collection-format excludesearchpath :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c
  ""
  ([] (com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c-with-http-info optional-params))))

(defn com-adobe-granite-repository-hc-impl-continuous-rgc-health-check-with-http-info
  ""
  ([] (com-adobe-granite-repository-hc-impl-continuous-rgc-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-hc-impl-continuous-rgc-health-check
  ""
  ([] (com-adobe-granite-repository-hc-impl-continuous-rgc-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-hc-impl-continuous-rgc-health-check-with-http-info optional-params))))

(defn com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-with-http-info
  ""
  ([] (com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che
  ""
  ([] (com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-with-http-info optional-params))))

(defn com-adobe-granite-repository-hc-impl-default-logins-health-check-with-http-info
  ""
  ([] (com-adobe-granite-repository-hc-impl-default-logins-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags accountlogins consolelogins ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) "account.logins" (with-collection-format accountlogins :multi) "console.logins" (with-collection-format consolelogins :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-hc-impl-default-logins-health-check
  ""
  ([] (com-adobe-granite-repository-hc-impl-default-logins-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-hc-impl-default-logins-health-check-with-http-info optional-params))))

(defn com-adobe-granite-repository-hc-impl-disk-space-health-check-with-http-info
  ""
  ([] (com-adobe-granite-repository-hc-impl-disk-space-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags diskspacewarnthreshold diskspaceerrorthreshold ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) "disk.space.warn.threshold" diskspacewarnthreshold "disk.space.error.threshold" diskspaceerrorthreshold }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-hc-impl-disk-space-health-check
  ""
  ([] (com-adobe-granite-repository-hc-impl-disk-space-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-hc-impl-disk-space-health-check-with-http-info optional-params))))

(defn com-adobe-granite-repository-hc-impl-observation-queue-length-health-check-with-http-info
  ""
  ([] (com-adobe-granite-repository-hc-impl-observation-queue-length-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-hc-impl-observation-queue-length-health-check
  ""
  ([] (com-adobe-granite-repository-hc-impl-observation-queue-length-health-check nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-hc-impl-observation-queue-length-health-check-with-http-info optional-params))))

(defn com-adobe-granite-repository-impl-commit-stats-config-with-http-info
  ""
  ([] (com-adobe-granite-repository-impl-commit-stats-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled interval-seconds commits-per-interval-threshold max-location-length max-details-shown min-details-percentage thread-matchers max-greedy-depth greedy-stack-matchers stack-filters stack-matchers stack-categorizers stack-shorteners ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "intervalSeconds" interval-seconds "commitsPerIntervalThreshold" commits-per-interval-threshold "maxLocationLength" max-location-length "maxDetailsShown" max-details-shown "minDetailsPercentage" min-details-percentage "threadMatchers" (with-collection-format thread-matchers :multi) "maxGreedyDepth" max-greedy-depth "greedyStackMatchers" greedy-stack-matchers "stackFilters" (with-collection-format stack-filters :multi) "stackMatchers" (with-collection-format stack-matchers :multi) "stackCategorizers" (with-collection-format stack-categorizers :multi) "stackShorteners" (with-collection-format stack-shorteners :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-impl-commit-stats-config
  ""
  ([] (com-adobe-granite-repository-impl-commit-stats-config nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-impl-commit-stats-config-with-http-info optional-params))))

(defn com-adobe-granite-repository-service-user-configuration-with-http-info
  ""
  ([] (com-adobe-granite-repository-service-user-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking serviceuserssimple-subject-population serviceuserslist ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "serviceusers.simpleSubjectPopulation" serviceuserssimple-subject-population "serviceusers.list" (with-collection-format serviceuserslist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-repository-service-user-configuration
  ""
  ([] (com-adobe-granite-repository-service-user-configuration nil))
  ([optional-params]
   (:data (com-adobe-granite-repository-service-user-configuration-with-http-info optional-params))))

(defn com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-with-http-info
  ""
  ([] (com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im
  ""
  ([] (com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im nil))
  ([optional-params]
   (:data (com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-with-http-info optional-params))))

(defn com-adobe-granite-resourcestatus-impl-composite-status-type-with-http-info
  ""
  ([] (com-adobe-granite-resourcestatus-impl-composite-status-type-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name types ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "types" (with-collection-format types :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-resourcestatus-impl-composite-status-type
  ""
  ([] (com-adobe-granite-resourcestatus-impl-composite-status-type nil))
  ([optional-params]
   (:data (com-adobe-granite-resourcestatus-impl-composite-status-type-with-http-info optional-params))))

(defn com-adobe-granite-resourcestatus-impl-status-resource-provider-impl-with-http-info
  ""
  ([] (com-adobe-granite-resourcestatus-impl-status-resource-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist providerroot ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "provider.root" providerroot }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-resourcestatus-impl-status-resource-provider-impl
  ""
  ([] (com-adobe-granite-resourcestatus-impl-status-resource-provider-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-resourcestatus-impl-status-resource-provider-impl-with-http-info optional-params))))

(defn com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-with-http-info
  ""
  ([] (com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mimeallow-empty mimeallowed ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mime.allowEmpty" mimeallow-empty "mime.allowed" (with-collection-format mimeallowed :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-rest-assets-impl-asset-content-disposition-filter
  ""
  ([] (com-adobe-granite-rest-assets-impl-asset-content-disposition-filter nil))
  ([optional-params]
   (:data (com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-with-http-info optional-params))))

(defn com-adobe-granite-rest-impl-api-endpoint-resource-provider-factory-impl-with-http-info
  ""
  ([] (com-adobe-granite-rest-impl-api-endpoint-resource-provider-factory-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist providerroots ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "provider.roots" providerroots }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-rest-impl-api-endpoint-resource-provider-factory-impl
  ""
  ([] (com-adobe-granite-rest-impl-api-endpoint-resource-provider-factory-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-rest-impl-api-endpoint-resource-provider-factory-impl-with-http-info optional-params))))

(defn com-adobe-granite-rest-impl-servlet-default-get-servlet-with-http-info
  ""
  ([] (com-adobe-granite-rest-impl-servlet-default-get-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist defaultlimit useabsoluteuri ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "default.limit" defaultlimit "use.absolute.uri" useabsoluteuri }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-rest-impl-servlet-default-get-servlet
  ""
  ([] (com-adobe-granite-rest-impl-servlet-default-get-servlet nil))
  ([optional-params]
   (:data (com-adobe-granite-rest-impl-servlet-default-get-servlet-with-http-info optional-params))))

(defn com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-with-http-info
  ""
  ([] (com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hctags ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.tags" (with-collection-format hctags :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s
  ""
  ([] (com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s nil))
  ([optional-params]
   (:data (com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-with-http-info optional-params))))

(defn com-adobe-granite-security-user-user-properties-service-with-http-info
  ""
  ([] (com-adobe-granite-security-user-user-properties-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist adaptercondition graniteuserpropertiesnodetypes graniteuserpropertiesresourcetypes ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "adapter.condition" adaptercondition "granite.userproperties.nodetypes" (with-collection-format graniteuserpropertiesnodetypes :multi) "granite.userproperties.resourcetypes" (with-collection-format graniteuserpropertiesresourcetypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-security-user-user-properties-service
  ""
  ([] (com-adobe-granite-security-user-user-properties-service nil))
  ([optional-params]
   (:data (com-adobe-granite-security-user-user-properties-service-with-http-info optional-params))))

(defn com-adobe-granite-socialgraph-impl-social-graph-factory-impl-with-http-info
  ""
  ([] (com-adobe-granite-socialgraph-impl-social-graph-factory-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist group2memberrelationshipoutgoing group2memberexcludedoutgoing group2memberrelationshipincoming group2memberexcludedincoming ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "group2member.relationship.outgoing" group2memberrelationshipoutgoing "group2member.excluded.outgoing" (with-collection-format group2memberexcludedoutgoing :multi) "group2member.relationship.incoming" group2memberrelationshipincoming "group2member.excluded.incoming" (with-collection-format group2memberexcludedincoming :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-socialgraph-impl-social-graph-factory-impl
  ""
  ([] (com-adobe-granite-socialgraph-impl-social-graph-factory-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-socialgraph-impl-social-graph-factory-impl-with-http-info optional-params))))

(defn com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-with-http-info
  ""
  ([] (com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression jmxobjectname ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression "jmx.objectname" jmxobjectname }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl
  ""
  ([] (com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-with-http-info optional-params))))

(defn com-adobe-granite-taskmanagement-impl-jcr-task-adapter-factory-with-http-info
  ""
  ([] (com-adobe-granite-taskmanagement-impl-jcr-task-adapter-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist adaptercondition ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "adapter.condition" adaptercondition }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-taskmanagement-impl-jcr-task-adapter-factory
  ""
  ([] (com-adobe-granite-taskmanagement-impl-jcr-task-adapter-factory nil))
  ([optional-params]
   (:data (com-adobe-granite-taskmanagement-impl-jcr-task-adapter-factory-with-http-info optional-params))))

(defn com-adobe-granite-taskmanagement-impl-jcr-task-archive-service-with-http-info
  ""
  ([] (com-adobe-granite-taskmanagement-impl-jcr-task-archive-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist archivingenabled schedulerexpression archivesincedayscompleted ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "archiving.enabled" archivingenabled "scheduler.expression" schedulerexpression "archive.since.days.completed" archivesincedayscompleted }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-taskmanagement-impl-jcr-task-archive-service
  ""
  ([] (com-adobe-granite-taskmanagement-impl-jcr-task-archive-service nil))
  ([optional-params]
   (:data (com-adobe-granite-taskmanagement-impl-jcr-task-archive-service-with-http-info optional-params))))

(defn com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task-with-http-info
  ""
  ([] (com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist purge-completed completed-age purge-active active-age save-threshold ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "purgeCompleted" purge-completed "completedAge" completed-age "purgeActive" purge-active "activeAge" active-age "saveThreshold" save-threshold }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task
  ""
  ([] (com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task nil))
  ([optional-params]
   (:data (com-adobe-granite-taskmanagement-impl-purge-task-purge-maintenance-task-with-http-info optional-params))))

(defn com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-with-http-info
  ""
  ([] (com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist adaptercondition taskmanageradmingroups ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "adapter.condition" adaptercondition "taskmanager.admingroups" (with-collection-format taskmanageradmingroups :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor
  ""
  ([] (com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor nil))
  ([optional-params]
   (:data (com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-with-http-info optional-params))))

(defn com-adobe-granite-threaddump-thread-dump-collector-with-http-info
  ""
  ([] (com-adobe-granite-threaddump-thread-dump-collector-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerperiod schedulerrun-on granitethreaddumpenabled granitethreaddumpdumps-per-file granitethreaddumpenable-gzip-compression granitethreaddumpenable-directories-compression granitethreaddumpenable-j-stack granitethreaddumpmax-backup-days granitethreaddumpbackup-clean-trigger ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.period" schedulerperiod "scheduler.runOn" schedulerrun-on "granite.threaddump.enabled" granitethreaddumpenabled "granite.threaddump.dumpsPerFile" granitethreaddumpdumps-per-file "granite.threaddump.enableGzipCompression" granitethreaddumpenable-gzip-compression "granite.threaddump.enableDirectoriesCompression" granitethreaddumpenable-directories-compression "granite.threaddump.enableJStack" granitethreaddumpenable-j-stack "granite.threaddump.maxBackupDays" granitethreaddumpmax-backup-days "granite.threaddump.backupCleanTrigger" granitethreaddumpbackup-clean-trigger }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-threaddump-thread-dump-collector
  ""
  ([] (com-adobe-granite-threaddump-thread-dump-collector nil))
  ([optional-params]
   (:data (com-adobe-granite-threaddump-thread-dump-collector-with-http-info optional-params))))

(defn com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl-with-http-info
  ""
  ([] (com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist translation-factory default-connector-label default-connector-attribution default-connector-workspace-id default-connector-subscription-key language-map-location category-map-location retry-attempts timeout-count ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "translationFactory" translation-factory "defaultConnectorLabel" default-connector-label "defaultConnectorAttribution" default-connector-attribution "defaultConnectorWorkspaceId" default-connector-workspace-id "defaultConnectorSubscriptionKey" default-connector-subscription-key "languageMapLocation" language-map-location "categoryMapLocation" category-map-location "retryAttempts" retry-attempts "timeoutCount" timeout-count }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl
  ""
  ([] (com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl nil))
  ([optional-params]
   (:data (com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl-with-http-info optional-params))))

(defn com-adobe-granite-translation-core-impl-translation-manager-impl-with-http-info
  ""
  ([] (com-adobe-granite-translation-core-impl-translation-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist default-connector-name default-category ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "defaultConnectorName" default-connector-name "defaultCategory" default-category }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-translation-core-impl-translation-manager-impl
  ""
  ([] (com-adobe-granite-translation-core-impl-translation-manager-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-translation-core-impl-translation-manager-impl-with-http-info optional-params))))

(defn com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl-with-http-info
  ""
  ([] (com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist htmllibmanagertiming htmllibmanagerdebuginitjs htmllibmanagerminify htmllibmanagerdebug htmllibmanagergzip htmllibmanagermax-data-uri-size htmllibmanagermaxage htmllibmanagerforce-cq-url-info htmllibmanagerdefaultthemename htmllibmanagerdefaultuserthemename htmllibmanagerclientmanager htmllibmanagerpathlist htmllibmanagerexcludedpathlist htmllibmanagerprocessorjs htmllibmanagerprocessorcss htmllibmanagerlongcachepatterns htmllibmanagerlongcacheformat htmllibmanageruse-file-system-output-cache htmllibmanagerfile-system-output-cache-location htmllibmanagerdisablereplacement ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "htmllibmanager.timing" htmllibmanagertiming "htmllibmanager.debug.init.js" htmllibmanagerdebuginitjs "htmllibmanager.minify" htmllibmanagerminify "htmllibmanager.debug" htmllibmanagerdebug "htmllibmanager.gzip" htmllibmanagergzip "htmllibmanager.maxDataUriSize" htmllibmanagermax-data-uri-size "htmllibmanager.maxage" htmllibmanagermaxage "htmllibmanager.forceCQUrlInfo" htmllibmanagerforce-cq-url-info "htmllibmanager.defaultthemename" htmllibmanagerdefaultthemename "htmllibmanager.defaultuserthemename" htmllibmanagerdefaultuserthemename "htmllibmanager.clientmanager" htmllibmanagerclientmanager "htmllibmanager.path.list" (with-collection-format htmllibmanagerpathlist :multi) "htmllibmanager.excluded.path.list" (with-collection-format htmllibmanagerexcludedpathlist :multi) "htmllibmanager.processor.js" (with-collection-format htmllibmanagerprocessorjs :multi) "htmllibmanager.processor.css" (with-collection-format htmllibmanagerprocessorcss :multi) "htmllibmanager.longcache.patterns" (with-collection-format htmllibmanagerlongcachepatterns :multi) "htmllibmanager.longcache.format" htmllibmanagerlongcacheformat "htmllibmanager.useFileSystemOutputCache" htmllibmanageruse-file-system-output-cache "htmllibmanager.fileSystemOutputCacheLocation" htmllibmanagerfile-system-output-cache-location "htmllibmanager.disable.replacement" (with-collection-format htmllibmanagerdisablereplacement :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl
  ""
  ([] (com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl nil))
  ([optional-params]
   (:data (com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl-with-http-info optional-params))))

(defn com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-with-http-info
  ""
  ([] (com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-console-frags-workflow-withdraw-feature
  ""
  ([] (com-adobe-granite-workflow-console-frags-workflow-withdraw-feature nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-with-http-info optional-params))))

(defn com-adobe-granite-workflow-console-publish-workflow-publish-event-service-with-http-info
  ""
  ([] (com-adobe-granite-workflow-console-publish-workflow-publish-event-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist graniteworkflow-workflow-publish-event-serviceenabled ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "granite.workflow.WorkflowPublishEventService.enabled" graniteworkflow-workflow-publish-event-serviceenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-console-publish-workflow-publish-event-service
  ""
  ([] (com-adobe-granite-workflow-console-publish-workflow-publish-event-service nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-console-publish-workflow-publish-event-service-with-http-info optional-params))))

(defn com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-with-http-info
  ""
  ([] (com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist bucket-size ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "bucketSize" bucket-size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-core-jcr-workflow-bucket-manager
  ""
  ([] (com-adobe-granite-workflow-core-jcr-workflow-bucket-manager nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-with-http-info optional-params))))

(defn com-adobe-granite-workflow-core-job-external-process-job-handler-with-http-info
  ""
  ([] (com-adobe-granite-workflow-core-job-external-process-job-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist defaulttimeout maxtimeout defaultperiod ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "default.timeout" defaulttimeout "max.timeout" maxtimeout "default.period" defaultperiod }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-core-job-external-process-job-handler
  ""
  ([] (com-adobe-granite-workflow-core-job-external-process-job-handler nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-core-job-external-process-job-handler-with-http-info optional-params))))

(defn com-adobe-granite-workflow-core-job-job-handler-with-http-info
  ""
  ([] (com-adobe-granite-workflow-core-job-job-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jobtopics allowselfprocesstermination ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "job.topics" (with-collection-format jobtopics :multi) "allow.self.process.termination" allowselfprocesstermination }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-core-job-job-handler
  ""
  ([] (com-adobe-granite-workflow-core-job-job-handler nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-core-job-job-handler-with-http-info optional-params))))

(defn com-adobe-granite-workflow-core-offloading-workflow-offloading-job-consum-with-http-info
  ""
  ([] (com-adobe-granite-workflow-core-offloading-workflow-offloading-job-consum-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jobtopics ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "job.topics" jobtopics }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-core-offloading-workflow-offloading-job-consum
  ""
  ([] (com-adobe-granite-workflow-core-offloading-workflow-offloading-job-consum nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-core-offloading-workflow-offloading-job-consum-with-http-info optional-params))))

(defn com-adobe-granite-workflow-core-payload-map-cache-with-http-info
  ""
  ([] (com-adobe-granite-workflow-core-payload-map-cache-with-http-info nil))
  ([{:keys [post apply delete action location propertylist get-system-workflow-models get-package-root-path ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "getSystemWorkflowModels" (with-collection-format get-system-workflow-models :multi) "getPackageRootPath" get-package-root-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-core-payload-map-cache
  ""
  ([] (com-adobe-granite-workflow-core-payload-map-cache nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-core-payload-map-cache-with-http-info optional-params))))

(defn com-adobe-granite-workflow-core-payloadmap-payload-move-listener-with-http-info
  ""
  ([] (com-adobe-granite-workflow-core-payloadmap-payload-move-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist payloadmovewhitelist payloadmovehandlefromworkflowprocess ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "payload.move.white.list" (with-collection-format payloadmovewhitelist :multi) "payload.move.handle.from.workflow.process" payloadmovehandlefromworkflowprocess }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-core-payloadmap-payload-move-listener
  ""
  ([] (com-adobe-granite-workflow-core-payloadmap-payload-move-listener nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-core-payloadmap-payload-move-listener-with-http-info optional-params))))

(defn com-adobe-granite-workflow-core-workflow-config-with-http-info
  ""
  ([] (com-adobe-granite-workflow-core-workflow-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqworkflowconfigworkflowpackagesrootpath cqworkflowconfigworkflowprocesslegacymode cqworkflowconfigallowlocking ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.workflow.config.workflow.packages.root.path" (with-collection-format cqworkflowconfigworkflowpackagesrootpath :multi) "cq.workflow.config.workflow.process.legacy.mode" cqworkflowconfigworkflowprocesslegacymode "cq.workflow.config.allow.locking" cqworkflowconfigallowlocking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-core-workflow-config
  ""
  ([] (com-adobe-granite-workflow-core-workflow-config nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-core-workflow-config-with-http-info optional-params))))

(defn com-adobe-granite-workflow-core-workflow-session-factory-with-http-info
  ""
  ([] (com-adobe-granite-workflow-core-workflow-session-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist graniteworkflowinboxsortproperty-name graniteworkflowinboxsortorder cqworkflowjobretry cqworkflowsuperuser graniteworkflowinbox-query-size graniteworkflowadmin-user-group-filter graniteworkflowenforce-workitem-assignee-permissions graniteworkflowenforce-workflow-initiator-permissions graniteworkflowinject-tenant-id-in-job-topics graniteworkflowmax-purge-save-threshold graniteworkflowmax-purge-query-count ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "granite.workflowinbox.sort.propertyName" graniteworkflowinboxsortproperty-name "granite.workflowinbox.sort.order" graniteworkflowinboxsortorder "cq.workflow.job.retry" cqworkflowjobretry "cq.workflow.superuser" (with-collection-format cqworkflowsuperuser :multi) "granite.workflow.inboxQuerySize" graniteworkflowinbox-query-size "granite.workflow.adminUserGroupFilter" graniteworkflowadmin-user-group-filter "granite.workflow.enforceWorkitemAssigneePermissions" graniteworkflowenforce-workitem-assignee-permissions "granite.workflow.enforceWorkflowInitiatorPermissions" graniteworkflowenforce-workflow-initiator-permissions "granite.workflow.injectTenantIdInJobTopics" graniteworkflowinject-tenant-id-in-job-topics "granite.workflow.maxPurgeSaveThreshold" graniteworkflowmax-purge-save-threshold "granite.workflow.maxPurgeQueryCount" graniteworkflowmax-purge-query-count }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-core-workflow-session-factory
  ""
  ([] (com-adobe-granite-workflow-core-workflow-session-factory nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-core-workflow-session-factory-with-http-info optional-params))))

(defn com-adobe-granite-workflow-purge-scheduler-with-http-info
  ""
  ([] (com-adobe-granite-workflow-purge-scheduler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist scheduledpurgename scheduledpurgeworkflow-status scheduledpurgemodel-ids scheduledpurgedaysold ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduledpurge.name" scheduledpurgename "scheduledpurge.workflowStatus" scheduledpurgeworkflow-status "scheduledpurge.modelIds" (with-collection-format scheduledpurgemodel-ids :multi) "scheduledpurge.daysold" scheduledpurgedaysold }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-granite-workflow-purge-scheduler
  ""
  ([] (com-adobe-granite-workflow-purge-scheduler nil))
  ([optional-params]
   (:data (com-adobe-granite-workflow-purge-scheduler-with-http-info optional-params))))

(defn com-adobe-octopus-ncomm-bootstrap-with-http-info
  ""
  ([] (com-adobe-octopus-ncomm-bootstrap-with-http-info nil))
  ([{:keys [post apply delete action location propertylist max-connections max-requests request-timeout request-retries launch-timeout ]}]
   (call-api "/system/console/configMgr/com.adobe.octopus.ncomm.bootstrap" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "maxConnections" max-connections "maxRequests" max-requests "requestTimeout" request-timeout "requestRetries" request-retries "launchTimeout" launch-timeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-octopus-ncomm-bootstrap
  ""
  ([] (com-adobe-octopus-ncomm-bootstrap nil))
  ([optional-params]
   (:data (com-adobe-octopus-ncomm-bootstrap-with-http-info optional-params))))

(defn com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-with-http-info
  ""
  ([] (com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-with-http-info nil))
  ([{:keys [post apply delete action location propertylist communitiesintegrationlivefyreslingeventfilter ]}]
   (call-api "/system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "communities.integration.livefyre.sling.event.filter" communitiesintegrationlivefyreslingeventfilter }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s
  ""
  ([] (com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s nil))
  ([optional-params]
   (:data (com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-with-http-info optional-params))))

(defn com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-with-http-info
  ""
  ([] (com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-with-http-info nil))
  ([{:keys [post apply delete action location propertylist max-connections max-requests request-timeout log-dir ]}]
   (call-api "/system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "maxConnections" max-connections "maxRequests" max-requests "requestTimeout" request-timeout "logDir" log-dir }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm
  ""
  ([] (com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm nil))
  ([optional-params]
   (:data (com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-with-http-info optional-params))))

(defn com-day-commons-datasource-jdbcpool-jdbc-pool-service-with-http-info
  ""
  ([] (com-day-commons-datasource-jdbcpool-jdbc-pool-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jdbcdriverclass jdbcconnectionuri jdbcusername jdbcpassword jdbcvalidationquery defaultreadonly defaultautocommit poolsize poolmaxwaitmsec datasourcename datasourcesvcproperties ]}]
   (call-api "/system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "jdbc.driver.class" jdbcdriverclass "jdbc.connection.uri" jdbcconnectionuri "jdbc.username" jdbcusername "jdbc.password" jdbcpassword "jdbc.validation.query" jdbcvalidationquery "default.readonly" defaultreadonly "default.autocommit" defaultautocommit "pool.size" poolsize "pool.max.wait.msec" poolmaxwaitmsec "datasource.name" datasourcename "datasource.svc.properties" (with-collection-format datasourcesvcproperties :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-commons-datasource-jdbcpool-jdbc-pool-service
  ""
  ([] (com-day-commons-datasource-jdbcpool-jdbc-pool-service nil))
  ([optional-params]
   (:data (com-day-commons-datasource-jdbcpool-jdbc-pool-service-with-http-info optional-params))))

(defn com-day-commons-httpclient-with-http-info
  ""
  ([] (com-day-commons-httpclient-with-http-info nil))
  ([{:keys [post apply delete action location propertylist proxyenabled proxyhost proxyuser proxypassword proxyntlmhost proxyntlmdomain proxyexceptions ]}]
   (call-api "/system/console/configMgr/com.day.commons.httpclient" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "proxy.enabled" proxyenabled "proxy.host" proxyhost "proxy.user" proxyuser "proxy.password" proxypassword "proxy.ntlm.host" proxyntlmhost "proxy.ntlm.domain" proxyntlmdomain "proxy.exceptions" (with-collection-format proxyexceptions :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-commons-httpclient
  ""
  ([] (com-day-commons-httpclient nil))
  ([optional-params]
   (:data (com-day-commons-httpclient-with-http-info optional-params))))

(defn com-day-cq-analytics-impl-store-properties-change-listener-with-http-info
  ""
  ([] (com-day-cq-analytics-impl-store-properties-change-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqstorelisteneradditional-store-paths ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.store.listener.additionalStorePaths" (with-collection-format cqstorelisteneradditional-store-paths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-impl-store-properties-change-listener
  ""
  ([] (com-day-cq-analytics-impl-store-properties-change-listener nil))
  ([optional-params]
   (:data (com-day-cq-analytics-impl-store-properties-change-listener-with-http-info optional-params))))

(defn com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte-with-http-info
  ""
  ([] (com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte-with-http-info nil))
  ([{:keys [post apply delete action location propertylist allowedpaths cqanalyticssaintexporterpagesize ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "allowed.paths" (with-collection-format allowedpaths :multi) "cq.analytics.saint.exporter.pagesize" cqanalyticssaintexporterpagesize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte
  ""
  ([] (com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte nil))
  ([optional-params]
   (:data (com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte-with-http-info optional-params))))

(defn com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-with-http-info
  ""
  ([] (com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist reportfetchattempts reportfetchdelay ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "report.fetch.attempts" reportfetchattempts "report.fetch.delay" reportfetchdelay }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-sitecatalyst-impl-importer-report-importer
  ""
  ([] (com-day-cq-analytics-sitecatalyst-impl-importer-report-importer nil))
  ([optional-params]
   (:data (com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-with-http-info optional-params))))

(defn com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory-with-http-info
  ""
  ([] (com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqanalyticsadapterfactorycontextstores ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.analytics.adapterfactory.contextstores" (with-collection-format cqanalyticsadapterfactorycontextstores :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory
  ""
  ([] (com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory nil))
  ([optional-params]
   (:data (com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-adapter-factory-with-http-info optional-params))))

(defn com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-with-http-info
  ""
  ([] (com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqanalyticssitecatalystservicedatacenterurl devhostnamepatterns connectiontimeout sockettimeout ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.analytics.sitecatalyst.service.datacenter.url" (with-collection-format cqanalyticssitecatalystservicedatacenterurl :multi) "devhostnamepatterns" (with-collection-format devhostnamepatterns :multi) "connection.timeout" connectiontimeout "socket.timeout" sockettimeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl
  ""
  ([] (com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl nil))
  ([optional-params]
   (:data (com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-with-http-info optional-params))))

(defn com-day-cq-analytics-testandtarget-impl-account-options-updater-with-http-info
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-account-options-updater-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqanalyticstestandtargetaccountoptionsupdaterenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.analytics.testandtarget.accountoptionsupdater.enabled" cqanalyticstestandtargetaccountoptionsupdaterenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-testandtarget-impl-account-options-updater
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-account-options-updater nil))
  ([optional-params]
   (:data (com-day-cq-analytics-testandtarget-impl-account-options-updater-with-http-info optional-params))))

(defn com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-with-http-info
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqanalyticstestandtargetdeleteauthoractivitylistenerenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.analytics.testandtarget.deleteauthoractivitylistener.enabled" cqanalyticstestandtargetdeleteauthoractivitylistenerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener nil))
  ([optional-params]
   (:data (com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-with-http-info optional-params))))

(defn com-day-cq-analytics-testandtarget-impl-push-author-campaign-page-listener-with-http-info
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-push-author-campaign-page-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled" cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-testandtarget-impl-push-author-campaign-page-listener
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-push-author-campaign-page-listener nil))
  ([optional-params]
   (:data (com-day-cq-analytics-testandtarget-impl-push-author-campaign-page-listener-with-http-info optional-params))))

(defn com-day-cq-analytics-testandtarget-impl-segment-importer-with-http-info
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-segment-importer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqanalyticstestandtargetsegmentimporterenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.analytics.testandtarget.segmentimporter.enabled" cqanalyticstestandtargetsegmentimporterenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-testandtarget-impl-segment-importer
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-segment-importer nil))
  ([optional-params]
   (:data (com-day-cq-analytics-testandtarget-impl-segment-importer-with-http-info optional-params))))

(defn com-day-cq-analytics-testandtarget-impl-service-web-service-impl-with-http-info
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-service-web-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist endpoint-uri connection-timeout socket-timeout ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "endpointUri" endpoint-uri "connectionTimeout" connection-timeout "socketTimeout" socket-timeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-testandtarget-impl-service-web-service-impl
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-service-web-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-analytics-testandtarget-impl-service-web-service-impl-with-http-info optional-params))))

(defn com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-with-http-info
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist testandtargetendpointurl ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "testandtarget.endpoint.url" testandtargetendpointurl }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet nil))
  ([optional-params]
   (:data (com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-with-http-info optional-params))))

(defn com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-with-http-info
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqanalyticstestandtargetapiurl cqanalyticstestandtargettimeout cqanalyticstestandtargetsockettimeout cqanalyticstestandtargetrecommendationsurlreplace cqanalyticstestandtargetrecommendationsurlreplacewith ]}]
   (call-api "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.analytics.testandtarget.api.url" cqanalyticstestandtargetapiurl "cq.analytics.testandtarget.timeout" cqanalyticstestandtargettimeout "cq.analytics.testandtarget.sockettimeout" cqanalyticstestandtargetsockettimeout "cq.analytics.testandtarget.recommendations.url.replace" cqanalyticstestandtargetrecommendationsurlreplace "cq.analytics.testandtarget.recommendations.url.replacewith" cqanalyticstestandtargetrecommendationsurlreplacewith }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl
  ""
  ([] (com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl nil))
  ([optional-params]
   (:data (com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-with-http-info optional-params))))

(defn com-day-cq-auth-impl-cug-cug-support-impl-with-http-info
  ""
  ([] (com-day-cq-auth-impl-cug-cug-support-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cugexemptedprincipals cugenabled cugprincipalsregex cugprincipalsreplacement ]}]
   (call-api "/system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cug.exempted.principals" (with-collection-format cugexemptedprincipals :multi) "cug.enabled" cugenabled "cug.principals.regex" cugprincipalsregex "cug.principals.replacement" cugprincipalsreplacement }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-auth-impl-cug-cug-support-impl
  ""
  ([] (com-day-cq-auth-impl-cug-cug-support-impl nil))
  ([optional-params]
   (:data (com-day-cq-auth-impl-cug-cug-support-impl-with-http-info optional-params))))

(defn com-day-cq-auth-impl-login-selector-handler-with-http-info
  ""
  ([] (com-day-cq-auth-impl-login-selector-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path serviceranking authloginselectormappings authloginselectorchangepwmappings authloginselectordefaultloginpage authloginselectordefaultchangepwpage authloginselectorhandle authloginselectorhandleallextensions ]}]
   (call-api "/system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path "service.ranking" serviceranking "auth.loginselector.mappings" (with-collection-format authloginselectormappings :multi) "auth.loginselector.changepw.mappings" (with-collection-format authloginselectorchangepwmappings :multi) "auth.loginselector.defaultloginpage" authloginselectordefaultloginpage "auth.loginselector.defaultchangepwpage" authloginselectordefaultchangepwpage "auth.loginselector.handle" (with-collection-format authloginselectorhandle :multi) "auth.loginselector.handle.all.extensions" authloginselectorhandleallextensions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-auth-impl-login-selector-handler
  ""
  ([] (com-day-cq-auth-impl-login-selector-handler nil))
  ([optional-params]
   (:data (com-day-cq-auth-impl-login-selector-handler-with-http-info optional-params))))

(defn com-day-cq-commons-impl-externalizer-impl-with-http-info
  ""
  ([] (com-day-cq-commons-impl-externalizer-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist externalizerdomains externalizerhost externalizercontextpath externalizerencodedpath ]}]
   (call-api "/system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "externalizer.domains" (with-collection-format externalizerdomains :multi) "externalizer.host" externalizerhost "externalizer.contextpath" externalizercontextpath "externalizer.encodedpath" externalizerencodedpath }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-commons-impl-externalizer-impl
  ""
  ([] (com-day-cq-commons-impl-externalizer-impl nil))
  ([optional-params]
   (:data (com-day-cq-commons-impl-externalizer-impl-with-http-info optional-params))))

(defn com-day-cq-commons-servlets-root-mapping-servlet-with-http-info
  ""
  ([] (com-day-cq-commons-servlets-root-mapping-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist rootmappingtarget ]}]
   (call-api "/system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "rootmapping.target" rootmappingtarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-commons-servlets-root-mapping-servlet
  ""
  ([] (com-day-cq-commons-servlets-root-mapping-servlet nil))
  ([optional-params]
   (:data (com-day-cq-commons-servlets-root-mapping-servlet-with-http-info optional-params))))

(defn com-day-cq-compat-codeupgrade-impl-code-upgrade-execution-condition-checke-with-http-info
  ""
  ([] (com-day-cq-compat-codeupgrade-impl-code-upgrade-execution-condition-checke-with-http-info nil))
  ([{:keys [post apply delete action location propertylist codeupgradetasks codeupgradetaskfilters ]}]
   (call-api "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "codeupgradetasks" (with-collection-format codeupgradetasks :multi) "codeupgradetaskfilters" (with-collection-format codeupgradetaskfilters :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-compat-codeupgrade-impl-code-upgrade-execution-condition-checke
  ""
  ([] (com-day-cq-compat-codeupgrade-impl-code-upgrade-execution-condition-checke nil))
  ([optional-params]
   (:data (com-day-cq-compat-codeupgrade-impl-code-upgrade-execution-condition-checke-with-http-info optional-params))))

(defn com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-with-http-info
  ""
  ([] (com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-with-http-info nil))
  ([{:keys [post apply delete action location propertylist upgrade-task-ignore-list ]}]
   (call-api "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "upgradeTaskIgnoreList" (with-collection-format upgrade-task-ignore-list :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list
  ""
  ([] (com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list nil))
  ([optional-params]
   (:data (com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-with-http-info optional-params))))

(defn com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist-with-http-info
  ""
  ([] (com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist-with-http-info nil))
  ([{:keys [post apply delete action location propertylist effective-bundle-list-path ]}]
   (call-api "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "effectiveBundleListPath" effective-bundle-list-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist
  ""
  ([] (com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist nil))
  ([optional-params]
   (:data (com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist-with-http-info optional-params))))

(defn com-day-cq-contentsync-impl-content-sync-manager-impl-with-http-info
  ""
  ([] (com-day-cq-contentsync-impl-content-sync-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist contentsyncfallbackauthorizable contentsyncfallbackupdateuser ]}]
   (call-api "/system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "contentsync.fallback.authorizable" contentsyncfallbackauthorizable "contentsync.fallback.updateuser" contentsyncfallbackupdateuser }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-contentsync-impl-content-sync-manager-impl
  ""
  ([] (com-day-cq-contentsync-impl-content-sync-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-contentsync-impl-content-sync-manager-impl-with-http-info optional-params))))

(defn com-day-cq-dam-commons-handler-standard-image-handler-with-http-info
  ""
  ([] (com-day-cq-dam-commons-handler-standard-image-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist large-file-threshold large-comment-threshold cqdamenableextmetaextraction ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "large_file_threshold" large-file-threshold "large_comment_threshold" large-comment-threshold "cq.dam.enable.ext.meta.extraction" cqdamenableextmetaextraction }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-commons-handler-standard-image-handler
  ""
  ([] (com-day-cq-dam-commons-handler-standard-image-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-commons-handler-standard-image-handler-with-http-info optional-params))))

(defn com-day-cq-dam-commons-metadata-xmp-filter-black-white-with-http-info
  ""
  ([] (com-day-cq-dam-commons-metadata-xmp-filter-black-white-with-http-info nil))
  ([{:keys [post apply delete action location propertylist xmpfilterapply-whitelist xmpfilterwhitelist xmpfilterapply-blacklist xmpfilterblacklist ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "xmp.filter.apply_whitelist" xmpfilterapply-whitelist "xmp.filter.whitelist" (with-collection-format xmpfilterwhitelist :multi) "xmp.filter.apply_blacklist" xmpfilterapply-blacklist "xmp.filter.blacklist" (with-collection-format xmpfilterblacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-commons-metadata-xmp-filter-black-white
  ""
  ([] (com-day-cq-dam-commons-metadata-xmp-filter-black-white nil))
  ([optional-params]
   (:data (com-day-cq-dam-commons-metadata-xmp-filter-black-white-with-http-info optional-params))))

(defn com-day-cq-dam-commons-util-impl-asset-cache-impl-with-http-info
  ""
  ([] (com-day-cq-dam-commons-util-impl-asset-cache-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist largefilemin cacheapply mimetypes ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "large.file.min" largefilemin "cache.apply" cacheapply "mime.types" (with-collection-format mimetypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-commons-util-impl-asset-cache-impl
  ""
  ([] (com-day-cq-dam-commons-util-impl-asset-cache-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-commons-util-impl-asset-cache-impl-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamconfigannotationpdfdocumentwidth cqdamconfigannotationpdfdocumentheight cqdamconfigannotationpdfdocumentpaddinghorizontal cqdamconfigannotationpdfdocumentpaddingvertical cqdamconfigannotationpdffontsize cqdamconfigannotationpdffontcolor cqdamconfigannotationpdffontfamily cqdamconfigannotationpdffontlight cqdamconfigannotationpdfmargin-text-image cqdamconfigannotationpdfmin-image-height cqdamconfigannotationpdfreview-statuswidth cqdamconfigannotationpdfreview-statuscolorapproved cqdamconfigannotationpdfreview-statuscolorrejected cqdamconfigannotationpdfreview-statuscolorchanges-requested cqdamconfigannotationpdfannotation-markerwidth cqdamconfigannotationpdfassetminheight ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.config.annotation.pdf.document.width" cqdamconfigannotationpdfdocumentwidth "cq.dam.config.annotation.pdf.document.height" cqdamconfigannotationpdfdocumentheight "cq.dam.config.annotation.pdf.document.padding.horizontal" cqdamconfigannotationpdfdocumentpaddinghorizontal "cq.dam.config.annotation.pdf.document.padding.vertical" cqdamconfigannotationpdfdocumentpaddingvertical "cq.dam.config.annotation.pdf.font.size" cqdamconfigannotationpdffontsize "cq.dam.config.annotation.pdf.font.color" cqdamconfigannotationpdffontcolor "cq.dam.config.annotation.pdf.font.family" cqdamconfigannotationpdffontfamily "cq.dam.config.annotation.pdf.font.light" cqdamconfigannotationpdffontlight "cq.dam.config.annotation.pdf.marginTextImage" cqdamconfigannotationpdfmargin-text-image "cq.dam.config.annotation.pdf.minImageHeight" cqdamconfigannotationpdfmin-image-height "cq.dam.config.annotation.pdf.reviewStatus.width" cqdamconfigannotationpdfreview-statuswidth "cq.dam.config.annotation.pdf.reviewStatus.color.approved" cqdamconfigannotationpdfreview-statuscolorapproved "cq.dam.config.annotation.pdf.reviewStatus.color.rejected" cqdamconfigannotationpdfreview-statuscolorrejected "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested" cqdamconfigannotationpdfreview-statuscolorchanges-requested "cq.dam.config.annotation.pdf.annotationMarker.width" cqdamconfigannotationpdfannotation-markerwidth "cq.dam.config.annotation.pdf.asset.minheight" cqdamconfigannotationpdfassetminheight }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config
  ""
  ([] (com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-asset-move-listener-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-asset-move-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-asset-move-listener
  ""
  ([] (com-day-cq-dam-core-impl-asset-move-listener nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-asset-move-listener-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-assethome-asset-home-page-configuration-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-assethome-asset-home-page-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist is-enabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "isEnabled" is-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-assethome-asset-home-page-configuration
  ""
  ([] (com-day-cq-dam-core-impl-assethome-asset-home-page-configuration nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-assethome-asset-home-page-configuration-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-assetlinkshare-adhoc-asset-share-proxy-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-assetlinkshare-adhoc-asset-share-proxy-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamadhocassetshareprezipmaxcontentsize ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.adhoc.asset.share.prezip.maxcontentsize" cqdamadhocassetshareprezipmaxcontentsize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-assetlinkshare-adhoc-asset-share-proxy-servlet
  ""
  ([] (com-day-cq-dam-core-impl-assetlinkshare-adhoc-asset-share-proxy-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-assetlinkshare-adhoc-asset-share-proxy-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-cache-cq-buffered-image-cache-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-cache-cq-buffered-image-cache-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamimagecachemaxmemory cqdamimagecachemaxage cqdamimagecachemaxdimension ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.image.cache.max.memory" cqdamimagecachemaxmemory "cq.dam.image.cache.max.age" cqdamimagecachemaxage "cq.dam.image.cache.max.dimension" cqdamimagecachemaxdimension }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-cache-cq-buffered-image-cache
  ""
  ([] (com-day-cq-dam-core-impl-cache-cq-buffered-image-cache nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-cache-cq-buffered-image-cache-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-dam-change-event-listener-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-dam-change-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist changeeventlistenerobservedpaths ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "changeeventlistener.observed.paths" (with-collection-format changeeventlistenerobservedpaths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-dam-change-event-listener
  ""
  ([] (com-day-cq-dam-core-impl-dam-change-event-listener nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-dam-change-event-listener-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-dam-event-purge-service-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-dam-event-purge-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression max-saved-activities save-interval enable-activity-purge event-types ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression "maxSavedActivities" max-saved-activities "saveInterval" save-interval "enableActivityPurge" enable-activity-purge "eventTypes" event-types }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-dam-event-purge-service
  ""
  ([] (com-day-cq-dam-core-impl-dam-event-purge-service nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-dam-event-purge-service-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-dam-event-recorder-impl-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-dam-event-recorder-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventfilter eventqueuelength eventrecorderenabled eventrecorderblacklist eventrecordereventtypes ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.filter" eventfilter "event.queue.length" eventqueuelength "eventrecorder.enabled" eventrecorderenabled "eventrecorder.blacklist" (with-collection-format eventrecorderblacklist :multi) "eventrecorder.eventtypes" eventrecordereventtypes }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-dam-event-recorder-impl
  ""
  ([] (com-day-cq-dam-core-impl-dam-event-recorder-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-dam-event-recorder-impl-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-event-dam-event-audit-listener-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-event-dam-event-audit-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventfilter enabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.filter" eventfilter "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-event-dam-event-audit-listener
  ""
  ([] (com-day-cq-dam-core-impl-event-dam-event-audit-listener nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-event-dam-event-audit-listener-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-expiry-notification-job-impl-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-expiry-notification-job-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamexpirynotificationscheduleristimebased cqdamexpirynotificationschedulertimebasedrule cqdamexpirynotificationschedulerperiodrule send-email asset-expired-limit prior-notification-seconds cqdamexpirynotificationurlprotocol ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.expiry.notification.scheduler.istimebased" cqdamexpirynotificationscheduleristimebased "cq.dam.expiry.notification.scheduler.timebased.rule" cqdamexpirynotificationschedulertimebasedrule "cq.dam.expiry.notification.scheduler.period.rule" cqdamexpirynotificationschedulerperiodrule "send_email" send-email "asset_expired_limit" asset-expired-limit "prior_notification_seconds" prior-notification-seconds "cq.dam.expiry.notification.url.protocol" cqdamexpirynotificationurlprotocol }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-expiry-notification-job-impl
  ""
  ([] (com-day-cq-dam-core-impl-expiry-notification-job-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-expiry-notification-job-impl-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-with-http-info nil))
  ([{:keys [post apply delete action location propertylist is-enabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "isEnabled" is-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat
  ""
  ([] (com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist skipbufferedcache ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "skip.bufferedcache" skipbufferedcache }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-gfx-commons-gfx-renderer
  ""
  ([] (com-day-cq-dam-core-impl-gfx-commons-gfx-renderer nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-handler-eps-format-handler-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-handler-eps-format-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mimetype ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mimetype" mimetype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-handler-eps-format-handler
  ""
  ([] (com-day-cq-dam-core-impl-handler-eps-format-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-handler-eps-format-handler-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-handler-indesign-format-handler-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-handler-indesign-format-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mimetype ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mimetype" (with-collection-format mimetype :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-handler-indesign-format-handler
  ""
  ([] (com-day-cq-dam-core-impl-handler-indesign-format-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-handler-indesign-format-handler-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-handler-jpeg-handler-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-handler-jpeg-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamenableextmetaextraction large-file-threshold large-comment-threshold ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.enable.ext.meta.extraction" cqdamenableextmetaextraction "large_file_threshold" large-file-threshold "large_comment_threshold" large-comment-threshold }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-handler-jpeg-handler
  ""
  ([] (com-day-cq-dam-core-impl-handler-jpeg-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-handler-jpeg-handler-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-handler-xmp-n-comm-xmp-handler-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-handler-xmp-n-comm-xmp-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist xmphandlercqformats ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "xmphandler.cq.formats" (with-collection-format xmphandlercqformats :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-handler-xmp-n-comm-xmp-handler
  ""
  ([] (com-day-cq-dam-core-impl-handler-xmp-n-comm-xmp-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-handler-xmp-n-comm-xmp-handler-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-jmx-asset-index-update-monitor-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-jmx-asset-index-update-monitor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jmxobjectname propertymeasureenabled propertyname propertymaxwaitms propertymaxrate fulltextmeasureenabled fulltextname fulltextmaxwaitms fulltextmaxrate ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "jmx.objectname" jmxobjectname "property.measure.enabled" propertymeasureenabled "property.name" propertyname "property.max.wait.ms" propertymaxwaitms "property.max.rate" propertymaxrate "fulltext.measure.enabled" fulltextmeasureenabled "fulltext.name" fulltextname "fulltext.max.wait.ms" fulltextmaxwaitms "fulltext.max.rate" fulltextmaxrate }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-jmx-asset-index-update-monitor
  ""
  ([] (com-day-cq-dam-core-impl-jmx-asset-index-update-monitor nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-jmx-asset-index-update-monitor-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jmxobjectname ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "jmx.objectname" jmxobjectname }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl
  ""
  ([] (com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-jmx-asset-migration-m-bean-impl-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-jmx-asset-update-monitor-impl-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-jmx-asset-update-monitor-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jmxobjectname active ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "jmx.objectname" jmxobjectname "active" active }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-jmx-asset-update-monitor-impl
  ""
  ([] (com-day-cq-dam-core-impl-jmx-asset-update-monitor-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-jmx-asset-update-monitor-impl-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist operation email-enabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "operation" operation "emailEnabled" email-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config
  ""
  ([] (com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-jobs-metadataimport-async-metadata-import-config-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-jobs-metadataimport-async-metadata-import-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist operation operation-icon topic-name email-enabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "operation" operation "operationIcon" operation-icon "topicName" topic-name "emailEnabled" email-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-jobs-metadataimport-async-metadata-import-config
  ""
  ([] (com-day-cq-dam-core-impl-jobs-metadataimport-async-metadata-import-config nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-jobs-metadataimport-async-metadata-import-config-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-lightbox-lightbox-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-lightbox-lightbox-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletpaths slingservletmethods cqdamenableanonymous ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.paths" slingservletpaths "sling.servlet.methods" (with-collection-format slingservletmethods :multi) "cq.dam.enable.anonymous" cqdamenableanonymous }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-lightbox-lightbox-servlet
  ""
  ([] (com-day-cq-dam-core-impl-lightbox-lightbox-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-lightbox-lightbox-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-metadata-editor-select-component-handler-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-metadata-editor-select-component-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist granitedata ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "granite:data" (with-collection-format granitedata :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-metadata-editor-select-component-handler
  ""
  ([] (com-day-cq-dam-core-impl-metadata-editor-select-component-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-metadata-editor-select-component-handler-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamallowallmime cqdamallowedassetmimes ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.allow.all.mime" cqdamallowallmime "cq.dam.allowed.asset.mimes" (with-collection-format cqdamallowedassetmimes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper
  ""
  ([] (com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-mime-type-dam-mime-type-service-impl-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-mime-type-dam-mime-type-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamdetectassetmimefromcontent ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.detect.asset.mime.from.content" cqdamdetectassetmimefromcontent }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-mime-type-dam-mime-type-service-impl
  ""
  ([] (com-day-cq-dam-core-impl-mime-type-dam-mime-type-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-mime-type-dam-mime-type-service-impl-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-missing-metadata-notification-job-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-missing-metadata-notification-job-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdammissingmetadatanotificationscheduleristimebased cqdammissingmetadatanotificationschedulertimebasedrule cqdammissingmetadatanotificationschedulerperiodrule cqdammissingmetadatanotificationrecipient ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.missingmetadata.notification.scheduler.istimebased" cqdammissingmetadatanotificationscheduleristimebased "cq.dam.missingmetadata.notification.scheduler.timebased.rule" cqdammissingmetadatanotificationschedulertimebasedrule "cq.dam.missingmetadata.notification.scheduler.period.rule" cqdammissingmetadatanotificationschedulerperiodrule "cq.dam.missingmetadata.notification.recipient" cqdammissingmetadatanotificationrecipient }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-missing-metadata-notification-job
  ""
  ([] (com-day-cq-dam-core-impl-missing-metadata-notification-job nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-missing-metadata-notification-job-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-process-send-transient-workflow-completed-email-pr-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-process-send-transient-workflow-completed-email-pr-with-http-info nil))
  ([{:keys [post apply delete action location propertylist processlabel notifyon-complete ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "process.label" processlabel "Notify on Complete" notifyon-complete }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-process-send-transient-workflow-completed-email-pr
  ""
  ([] (com-day-cq-dam-core-impl-process-send-transient-workflow-completed-email-pr nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-process-send-transient-workflow-completed-email-pr-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-process-text-extraction-process-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-process-text-extraction-process-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mime-types max-extract ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mimeTypes" (with-collection-format mime-types :multi) "maxExtract" max-extract }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-process-text-extraction-process
  ""
  ([] (com-day-cq-dam-core-impl-process-text-extraction-process nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-process-text-extraction-process-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-rendition-maker-impl-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-rendition-maker-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist xmppropagate xmpexcludes ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "xmp.propagate" xmppropagate "xmp.excludes" (with-collection-format xmpexcludes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-rendition-maker-impl
  ""
  ([] (com-day-cq-dam-core-impl-rendition-maker-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-rendition-maker-impl-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-reports-report-export-service-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-reports-report-export-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist query-batch-size ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "queryBatchSize" query-batch-size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-reports-report-export-service
  ""
  ([] (com-day-cq-dam-core-impl-reports-report-export-service nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-reports-report-export-service-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-reports-report-purge-service-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-reports-report-purge-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression max-saved-reports time-duration enable-report-purge ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression "maxSavedReports" max-saved-reports "timeDuration" time-duration "enableReportPurge" enable-report-purge }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-reports-report-purge-service
  ""
  ([] (com-day-cq-dam-core-impl-reports-report-purge-service nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-reports-report-purge-service-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-asset-download-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-asset-download-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-asset-download-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-asset-download-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-asset-download-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-asset-status-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-asset-status-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdambatchstatusmaxassets ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.batch.status.maxassets" cqdambatchstatusmaxassets }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-asset-status-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-asset-status-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-asset-status-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-asset-xmp-search-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-asset-xmp-search-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdambatchindesignmaxassets ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.batch.indesign.maxassets" cqdambatchindesignmaxassets }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-asset-xmp-search-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-asset-xmp-search-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-asset-xmp-search-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-batch-metadata-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-batch-metadata-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdambatchmetadataassetdefault cqdambatchmetadatacollectiondefault cqdambatchmetadatamaxresources ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.batch.metadata.asset.default" (with-collection-format cqdambatchmetadataassetdefault :multi) "cq.dam.batch.metadata.collection.default" (with-collection-format cqdambatchmetadatacollectiondefault :multi) "cq.dam.batch.metadata.maxresources" cqdambatchmetadatamaxresources }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-batch-metadata-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-batch-metadata-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-batch-metadata-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-binary-provider-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-binary-provider-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletresource-types slingservletmethods cqdamdrmenable ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.resourceTypes" (with-collection-format slingservletresource-types :multi) "sling.servlet.methods" (with-collection-format slingservletmethods :multi) "cq.dam.drm.enable" cqdamdrmenable }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-binary-provider-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-binary-provider-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-binary-provider-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-collection-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-collection-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdambatchcollectionproperties cqdambatchcollectionmaxcollections ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.batch.collection.properties" (with-collection-format cqdambatchcollectionproperties :multi) "cq.dam.batch.collection.maxcollections" cqdambatchcollectionmaxcollections }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-collection-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-collection-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-collection-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-collections-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-collections-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdambatchcollectionsproperties cqdambatchcollectionslimit ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.batch.collections.properties" (with-collection-format cqdambatchcollectionsproperties :multi) "cq.dam.batch.collections.limit" cqdambatchcollectionslimit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-collections-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-collections-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-collections-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-companion-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-companion-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist more-info mntoverlaydamguicontentassetsmoreinfohtmlpath ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "More Info" more-info "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}" mntoverlaydamguicontentassetsmoreinfohtmlpath }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-companion-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-companion-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-companion-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-create-asset-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-create-asset-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist detect-duplicate ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "detect_duplicate" detect-duplicate }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-create-asset-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-create-asset-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-create-asset-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqmimetypeblacklist cqdamemptymime ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.mime.type.blacklist" (with-collection-format cqmimetypeblacklist :multi) "cq.dam.empty.mime" cqdamemptymime }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter
  ""
  ([] (com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-guid-lookup-filter-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-guid-lookup-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamcoreguidlookupfilterenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.core.guidlookupfilter.enabled" cqdamcoreguidlookupfilterenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-guid-lookup-filter
  ""
  ([] (com-day-cq-dam-core-impl-servlet-guid-lookup-filter nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-guid-lookup-filter-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-health-check-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-health-check-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamsyncworkflowid cqdamsyncfoldertypes ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.sync.workflow.id" cqdamsyncworkflowid "cq.dam.sync.folder.types" (with-collection-format cqdamsyncfoldertypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-health-check-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-health-check-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-health-check-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-metadata-get-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-metadata-get-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletresource-types slingservletmethods slingservletextensions slingservletselectors ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.resourceTypes" slingservletresource-types "sling.servlet.methods" slingservletmethods "sling.servlet.extensions" slingservletextensions "sling.servlet.selectors" slingservletselectors }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-metadata-get-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-metadata-get-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-metadata-get-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-multiple-license-accept-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-multiple-license-accept-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamdrmenable ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.drm.enable" cqdamdrmenable }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-multiple-license-accept-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-multiple-license-accept-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-multiple-license-accept-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-servlet-resource-collection-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-servlet-resource-collection-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletresource-types slingservletmethods slingservletselectors downloadconfig viewselector send-email ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.resourceTypes" (with-collection-format slingservletresource-types :multi) "sling.servlet.methods" slingservletmethods "sling.servlet.selectors" slingservletselectors "download.config" downloadconfig "view.selector" viewselector "send_email" send-email }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-servlet-resource-collection-servlet
  ""
  ([] (com-day-cq-dam-core-impl-servlet-resource-collection-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-servlet-resource-collection-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist create-preview-enabled update-preview-enabled queue-size folder-preview-rendition-regex ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "createPreviewEnabled" create-preview-enabled "updatePreviewEnabled" update-preview-enabled "queueSize" queue-size "folderPreviewRenditionRegex" folder-preview-rendition-regex }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl
  ""
  ([] (com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl-with-http-info optional-params))))

(defn com-day-cq-dam-core-impl-unzip-unzip-config-with-http-info
  ""
  ([] (com-day-cq-dam-core-impl-unzip-unzip-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamconfigunzipmaxuncompressedsize cqdamconfigunzipencoding ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.config.unzip.maxuncompressedsize" cqdamconfigunzipmaxuncompressedsize "cq.dam.config.unzip.encoding" cqdamconfigunzipencoding }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-impl-unzip-unzip-config
  ""
  ([] (com-day-cq-dam-core-impl-unzip-unzip-config nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-impl-unzip-unzip-config-with-http-info optional-params))))

(defn com-day-cq-dam-core-process-exif-tool-extract-metadata-process-with-http-info
  ""
  ([] (com-day-cq-dam-core-process-exif-tool-extract-metadata-process-with-http-info nil))
  ([{:keys [post apply delete action location propertylist processlabel cqdamenablesha1 ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "process.label" processlabel "cq.dam.enable.sha1" cqdamenablesha1 }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-process-exif-tool-extract-metadata-process
  ""
  ([] (com-day-cq-dam-core-process-exif-tool-extract-metadata-process nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-process-exif-tool-extract-metadata-process-with-http-info optional-params))))

(defn com-day-cq-dam-core-process-extract-metadata-process-with-http-info
  ""
  ([] (com-day-cq-dam-core-process-extract-metadata-process-with-http-info nil))
  ([{:keys [post apply delete action location propertylist processlabel cqdamenablesha1 ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "process.label" processlabel "cq.dam.enable.sha1" cqdamenablesha1 }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-process-extract-metadata-process
  ""
  ([] (com-day-cq-dam-core-process-extract-metadata-process nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-process-extract-metadata-process-with-http-info optional-params))))

(defn com-day-cq-dam-core-process-metadata-processor-process-with-http-info
  ""
  ([] (com-day-cq-dam-core-process-metadata-processor-process-with-http-info nil))
  ([{:keys [post apply delete action location propertylist processlabel cqdamenablesha1 cqdammetadataxssprotectedproperties ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "process.label" processlabel "cq.dam.enable.sha1" cqdamenablesha1 "cq.dam.metadata.xssprotected.properties" (with-collection-format cqdammetadataxssprotectedproperties :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-core-process-metadata-processor-process
  ""
  ([] (com-day-cq-dam-core-process-metadata-processor-process nil))
  ([optional-params]
   (:data (com-day-cq-dam-core-process-metadata-processor-process-with-http-info optional-params))))

(defn com-day-cq-dam-handler-ffmpeg-locator-impl-with-http-info
  ""
  ([] (com-day-cq-dam-handler-ffmpeg-locator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist executablesearchpath ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "executable.searchpath" (with-collection-format executablesearchpath :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-handler-ffmpeg-locator-impl
  ""
  ([] (com-day-cq-dam-handler-ffmpeg-locator-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-handler-ffmpeg-locator-impl-with-http-info optional-params))))

(defn com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl-with-http-info
  ""
  ([] (com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventfilter fontmgrsystemfontdir fontmgradobefontdir fontmgrcustomerfontdir ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.filter" eventfilter "fontmgr.system.font.dir" (with-collection-format fontmgrsystemfontdir :multi) "fontmgr.adobe.font.dir" fontmgradobefontdir "fontmgr.customer.font.dir" fontmgrcustomerfontdir }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl
  ""
  ([] (com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl-with-http-info optional-params))))

(defn com-day-cq-dam-handler-standard-pdf-pdf-handler-with-http-info
  ""
  ([] (com-day-cq-dam-handler-standard-pdf-pdf-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist rasterannotation ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "raster.annotation" rasterannotation }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-handler-standard-pdf-pdf-handler
  ""
  ([] (com-day-cq-dam-handler-standard-pdf-pdf-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-handler-standard-pdf-pdf-handler-with-http-info optional-params))))

(defn com-day-cq-dam-handler-standard-ps-post-script-handler-with-http-info
  ""
  ([] (com-day-cq-dam-handler-standard-ps-post-script-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist rasterannotation ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "raster.annotation" rasterannotation }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-handler-standard-ps-post-script-handler
  ""
  ([] (com-day-cq-dam-handler-standard-ps-post-script-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-handler-standard-ps-post-script-handler-with-http-info optional-params))))

(defn com-day-cq-dam-handler-standard-psd-psd-handler-with-http-info
  ""
  ([] (com-day-cq-dam-handler-standard-psd-psd-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist large-file-threshold ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "large_file_threshold" large-file-threshold }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-handler-standard-psd-psd-handler
  ""
  ([] (com-day-cq-dam-handler-standard-psd-psd-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-handler-standard-psd-psd-handler-with-http-info optional-params))))

(defn com-day-cq-dam-ids-impl-ids-job-processor-with-http-info
  ""
  ([] (com-day-cq-dam-ids-impl-ids-job-processor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enablemultisession idsccenable enableretry enableretryscripterror externalizerdomaincqhost externalizerdomainhttp ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enable.multisession" enablemultisession "ids.cc.enable" idsccenable "enable.retry" enableretry "enable.retry.scripterror" enableretryscripterror "externalizer.domain.cqhost" externalizerdomaincqhost "externalizer.domain.http" externalizerdomainhttp }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-ids-impl-ids-job-processor
  ""
  ([] (com-day-cq-dam-ids-impl-ids-job-processor nil))
  ([optional-params]
   (:data (com-day-cq-dam-ids-impl-ids-job-processor-with-http-info optional-params))))

(defn com-day-cq-dam-ids-impl-ids-pool-manager-impl-with-http-info
  ""
  ([] (com-day-cq-dam-ids-impl-ids-pool-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist maxerrorstoblacklist retryintervaltowhitelist connecttimeout sockettimeout processlabel connectionusemax ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "max.errors.to.blacklist" maxerrorstoblacklist "retry.interval.to.whitelist" retryintervaltowhitelist "connect.timeout" connecttimeout "socket.timeout" sockettimeout "process.label" processlabel "connection.use.max" connectionusemax }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-ids-impl-ids-pool-manager-impl
  ""
  ([] (com-day-cq-dam-ids-impl-ids-pool-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-ids-impl-ids-pool-manager-impl-with-http-info optional-params))))

(defn com-day-cq-dam-indd-impl-handler-indesign-xmp-handler-with-http-info
  ""
  ([] (com-day-cq-dam-indd-impl-handler-indesign-xmp-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist processlabel extractpages ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "process.label" processlabel "extract.pages" extractpages }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-indd-impl-handler-indesign-xmp-handler
  ""
  ([] (com-day-cq-dam-indd-impl-handler-indesign-xmp-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-indd-impl-handler-indesign-xmp-handler-with-http-info optional-params))))

(defn com-day-cq-dam-indd-impl-servlet-snippet-creation-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-indd-impl-servlet-snippet-creation-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist snippetcreationmaxcollections ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "snippetcreation.maxcollections" snippetcreationmaxcollections }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-indd-impl-servlet-snippet-creation-servlet
  ""
  ([] (com-day-cq-dam-indd-impl-servlet-snippet-creation-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-indd-impl-servlet-snippet-creation-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-indd-process-indd-media-extract-process-with-http-info
  ""
  ([] (com-day-cq-dam-indd-process-indd-media-extract-process-with-http-info nil))
  ([{:keys [post apply delete action location propertylist processlabel cqdaminddpagesregex idsjobdecoupled idsjobworkflowmodel ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "process.label" processlabel "cq.dam.indd.pages.regex" cqdaminddpagesregex "ids.job.decoupled" idsjobdecoupled "ids.job.workflow.model" idsjobworkflowmodel }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-indd-process-indd-media-extract-process
  ""
  ([] (com-day-cq-dam-indd-process-indd-media-extract-process nil))
  ([optional-params]
   (:data (com-day-cq-dam-indd-process-indd-media-extract-process-with-http-info optional-params))))

(defn com-day-cq-dam-performance-internal-asset-performance-data-handler-impl-with-http-info
  ""
  ([] (com-day-cq-dam-performance-internal-asset-performance-data-handler-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist batchcommitsize ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "batch.commit.size" batchcommitsize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-performance-internal-asset-performance-data-handler-impl
  ""
  ([] (com-day-cq-dam-performance-internal-asset-performance-data-handler-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-performance-internal-asset-performance-data-handler-impl-with-http-info optional-params))))

(defn com-day-cq-dam-performance-internal-asset-performance-report-sync-job-with-http-info
  ""
  ([] (com-day-cq-dam-performance-internal-asset-performance-report-sync-job-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-performance-internal-asset-performance-report-sync-job
  ""
  ([] (com-day-cq-dam-performance-internal-asset-performance-report-sync-job nil))
  ([optional-params]
   (:data (com-day-cq-dam-performance-internal-asset-performance-report-sync-job-with-http-info optional-params))))

(defn com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-with-http-info
  ""
  ([] (com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-with-http-info nil))
  ([{:keys [post apply delete action location propertylist deletezipfile ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "delete.zip.file" deletezipfile }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro
  ""
  ([] (com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro nil))
  ([optional-params]
   (:data (com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-with-http-info optional-params))))

(defn com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-with-http-info
  ""
  ([] (com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdams7damdynamicmediaconfigeventlistenerenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled" cqdams7damdynamicmediaconfigeventlistenerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even
  ""
  ([] (com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even nil))
  ([optional-params]
   (:data (com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-with-http-info optional-params))))

(defn com-day-cq-dam-s7dam-common-analytics-impl-site-catalyst-report-runner-with-http-info
  ""
  ([] (com-day-cq-dam-s7dam-common-analytics-impl-site-catalyst-report-runner-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression schedulerconcurrent ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression "scheduler.concurrent" schedulerconcurrent }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-s7dam-common-analytics-impl-site-catalyst-report-runner
  ""
  ([] (com-day-cq-dam-s7dam-common-analytics-impl-site-catalyst-report-runner nil))
  ([optional-params]
   (:data (com-day-cq-dam-s7dam-common-analytics-impl-site-catalyst-report-runner-with-http-info optional-params))))

(defn com-day-cq-dam-s7dam-common-post-servlets-set-create-handler-with-http-info
  ""
  ([] (com-day-cq-dam-s7dam-common-post-servlets-set-create-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingpostoperation slingservletmethods ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.post.operation" slingpostoperation "sling.servlet.methods" slingservletmethods }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-s7dam-common-post-servlets-set-create-handler
  ""
  ([] (com-day-cq-dam-s7dam-common-post-servlets-set-create-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-s7dam-common-post-servlets-set-create-handler-with-http-info optional-params))))

(defn com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler-with-http-info
  ""
  ([] (com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingpostoperation slingservletmethods ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.post.operation" slingpostoperation "sling.servlet.methods" slingservletmethods }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler
  ""
  ([] (com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler nil))
  ([optional-params]
   (:data (com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler-with-http-info optional-params))))

(defn com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process-with-http-info
  ""
  ([] (com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process-with-http-info nil))
  ([{:keys [post apply delete action location propertylist processlabel ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "process.label" processlabel }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process
  ""
  ([] (com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process nil))
  ([optional-params]
   (:data (com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process-with-http-info optional-params))))

(defn com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener-with-http-info
  ""
  ([] (com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdams7damdamchangeeventlistenerenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.s7dam.damchangeeventlistener.enabled" cqdams7damdamchangeeventlistenerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener
  ""
  ([] (com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener nil))
  ([optional-params]
   (:data (com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener-with-http-info optional-params))))

(defn com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletpaths slingservletmethods ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.paths" slingservletpaths "sling.servlet.methods" slingservletmethods }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet
  ""
  ([] (com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet-with-http-info optional-params))))

(defn com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl-with-http-info
  ""
  ([] (com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdams7damvideoproxyclientservicemultipartuploadminsizename cqdams7damvideoproxyclientservicemultipartuploadpartsizename cqdams7damvideoproxyclientservicemultipartuploadnumthreadname cqdams7damvideoproxyclientservicehttpreadtimeoutname cqdams7damvideoproxyclientservicehttpconnectiontimeoutname cqdams7damvideoproxyclientservicehttpmaxretrycountname cqdams7damvideoproxyclientserviceuploadprogressintervalname ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name" cqdams7damvideoproxyclientservicemultipartuploadminsizename "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name" cqdams7damvideoproxyclientservicemultipartuploadpartsizename "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name" cqdams7damvideoproxyclientservicemultipartuploadnumthreadname "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name" cqdams7damvideoproxyclientservicehttpreadtimeoutname "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name" cqdams7damvideoproxyclientservicehttpconnectiontimeoutname "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name" cqdams7damvideoproxyclientservicehttpmaxretrycountname "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name" cqdams7damvideoproxyclientserviceuploadprogressintervalname }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl
  ""
  ([] (com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl-with-http-info optional-params))))

(defn com-day-cq-dam-scene7-impl-scene7-api-client-impl-with-http-info
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-api-client-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamscene7apiclientrecordsperpagenofiltername cqdamscene7apiclientrecordsperpagewithfiltername ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.scene7.apiclient.recordsperpage.nofilter.name" cqdamscene7apiclientrecordsperpagenofiltername "cq.dam.scene7.apiclient.recordsperpage.withfilter.name" cqdamscene7apiclientrecordsperpagewithfiltername }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-scene7-impl-scene7-api-client-impl
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-api-client-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-scene7-impl-scene7-api-client-impl-with-http-info optional-params))))

(defn com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl-with-http-info
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamscene7assetmimetypeservicemapping ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.scene7.assetmimetypeservice.mapping" (with-collection-format cqdamscene7assetmimetypeservicemapping :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl-with-http-info optional-params))))

(defn com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-with-http-info
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamscene7configurationeventlistenerenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.scene7.configurationeventlistener.enabled" cqdamscene7configurationeventlistenerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-scene7-impl-scene7-configuration-event-listener
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-configuration-event-listener nil))
  ([optional-params]
   (:data (com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-with-http-info optional-params))))

(defn com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener-with-http-info
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamscene7damchangeeventlistenerenabled cqdamscene7damchangeeventlistenerobservedpaths ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.scene7.damchangeeventlistener.enabled" cqdamscene7damchangeeventlistenerenabled "cq.dam.scene7.damchangeeventlistener.observed.paths" (with-collection-format cqdamscene7damchangeeventlistenerobservedpaths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener nil))
  ([optional-params]
   (:data (com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener-with-http-info optional-params))))

(defn com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl-with-http-info
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist scene7-flash-templatesrti scene7-flash-templatesrsi scene7-flash-templatesrb scene7-flash-templatesrurl scene7-flash-templateurl-format-parameter ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scene7FlashTemplates.rti" scene7-flash-templatesrti "scene7FlashTemplates.rsi" scene7-flash-templatesrsi "scene7FlashTemplates.rb" scene7-flash-templatesrb "scene7FlashTemplates.rurl" scene7-flash-templatesrurl "scene7FlashTemplate.urlFormatParameter" scene7-flash-templateurl-format-parameter }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl-with-http-info optional-params))))

(defn com-day-cq-dam-scene7-impl-scene7-upload-service-impl-with-http-info
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-upload-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqdamscene7uploadserviceactivejobtimeoutlabel cqdamscene7uploadserviceconnectionmaxperroutelabel ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.dam.scene7.uploadservice.activejobtimeout.label" cqdamscene7uploadserviceactivejobtimeoutlabel "cq.dam.scene7.uploadservice.connectionmaxperroute.label" cqdamscene7uploadserviceconnectionmaxperroutelabel }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-scene7-impl-scene7-upload-service-impl
  ""
  ([] (com-day-cq-dam-scene7-impl-scene7-upload-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-dam-scene7-impl-scene7-upload-service-impl-with-http-info optional-params))))

(defn com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-with-http-info
  ""
  ([] (com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-with-http-info nil))
  ([{:keys [post apply delete action location propertylist get-cache-expiration-unit get-cache-expiration-value ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "getCacheExpirationUnit" get-cache-expiration-unit "getCacheExpirationValue" get-cache-expiration-value }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser
  ""
  ([] (com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser nil))
  ([optional-params]
   (:data (com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-with-http-info optional-params))))

(defn com-day-cq-dam-stock-integration-impl-configuration-stock-configuration-with-http-info
  ""
  ([] (com-day-cq-dam-stock-integration-impl-configuration-stock-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name locale ims-config ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "locale" locale "imsConfig" ims-config }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-stock-integration-impl-configuration-stock-configuration
  ""
  ([] (com-day-cq-dam-stock-integration-impl-configuration-stock-configuration nil))
  ([optional-params]
   (:data (com-day-cq-dam-stock-integration-impl-configuration-stock-configuration-with-http-info optional-params))))

(defn com-day-cq-dam-video-impl-servlet-video-test-servlet-with-http-info
  ""
  ([] (com-day-cq-dam-video-impl-servlet-video-test-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-dam-video-impl-servlet-video-test-servlet
  ""
  ([] (com-day-cq-dam-video-impl-servlet-video-test-servlet nil))
  ([optional-params]
   (:data (com-day-cq-dam-video-impl-servlet-video-test-servlet-with-http-info optional-params))))

(defn com-day-cq-extwidget-servlets-image-sprite-servlet-with-http-info
  ""
  ([] (com-day-cq-extwidget-servlets-image-sprite-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist max-width max-height ]}]
   (call-api "/system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "maxWidth" max-width "maxHeight" max-height }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-extwidget-servlets-image-sprite-servlet
  ""
  ([] (com-day-cq-extwidget-servlets-image-sprite-servlet nil))
  ([optional-params]
   (:data (com-day-cq-extwidget-servlets-image-sprite-servlet-with-http-info optional-params))))

(defn com-day-cq-image-internal-font-font-helper-with-http-info
  ""
  ([] (com-day-cq-image-internal-font-font-helper-with-http-info nil))
  ([{:keys [post apply delete action location propertylist fontpath oversampling-factor ]}]
   (call-api "/system/console/configMgr/com.day.cq.image.internal.font.FontHelper" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "fontpath" (with-collection-format fontpath :multi) "oversamplingFactor" oversampling-factor }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-image-internal-font-font-helper
  ""
  ([] (com-day-cq-image-internal-font-font-helper nil))
  ([optional-params]
   (:data (com-day-cq-image-internal-font-font-helper-with-http-info optional-params))))

(defn com-day-cq-jcrclustersupport-cluster-start-level-controller-with-http-info
  ""
  ([] (com-day-cq-jcrclustersupport-cluster-start-level-controller-with-http-info nil))
  ([{:keys [post apply delete action location propertylist clusterlevelenable clustermasterlevel clusterslavelevel ]}]
   (call-api "/system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cluster.level.enable" clusterlevelenable "cluster.master.level" clustermasterlevel "cluster.slave.level" clusterslavelevel }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-jcrclustersupport-cluster-start-level-controller
  ""
  ([] (com-day-cq-jcrclustersupport-cluster-start-level-controller nil))
  ([optional-params]
   (:data (com-day-cq-jcrclustersupport-cluster-start-level-controller-with-http-info optional-params))))

(defn com-day-cq-mailer-default-mail-service-with-http-info
  ""
  ([] (com-day-cq-mailer-default-mail-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist smtphost smtpport smtpuser smtppassword fromaddress smtpssl smtpstarttls debugemail ]}]
   (call-api "/system/console/configMgr/com.day.cq.mailer.DefaultMailService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "smtp.host" smtphost "smtp.port" smtpport "smtp.user" smtpuser "smtp.password" smtppassword "from.address" fromaddress "smtp.ssl" smtpssl "smtp.starttls" smtpstarttls "debug.email" debugemail }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mailer-default-mail-service
  ""
  ([] (com-day-cq-mailer-default-mail-service nil))
  ([optional-params]
   (:data (com-day-cq-mailer-default-mail-service-with-http-info optional-params))))

(defn com-day-cq-mailer-impl-cq-mailing-service-with-http-info
  ""
  ([] (com-day-cq-mailer-impl-cq-mailing-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist maxrecipientcount ]}]
   (call-api "/system/console/configMgr/com.day.cq.mailer.impl.CqMailingService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "max.recipient.count" maxrecipientcount }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mailer-impl-cq-mailing-service
  ""
  ([] (com-day-cq-mailer-impl-cq-mailing-service nil))
  ([optional-params]
   (:data (com-day-cq-mailer-impl-cq-mailing-service-with-http-info optional-params))))

(defn com-day-cq-mailer-impl-email-cq-email-template-factory-with-http-info
  ""
  ([] (com-day-cq-mailer-impl-email-cq-email-template-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist maileremailcharset ]}]
   (call-api "/system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mailer.email.charset" maileremailcharset }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mailer-impl-email-cq-email-template-factory
  ""
  ([] (com-day-cq-mailer-impl-email-cq-email-template-factory nil))
  ([optional-params]
   (:data (com-day-cq-mailer-impl-email-cq-email-template-factory-with-http-info optional-params))))

(defn com-day-cq-mailer-impl-email-cq-retriever-template-factory-with-http-info
  ""
  ([] (com-day-cq-mailer-impl-email-cq-retriever-template-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist maileremailembed maileremailcharset maileremailretriever-user-id maileremailretriever-user-pwd ]}]
   (call-api "/system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mailer.email.embed" maileremailembed "mailer.email.charset" maileremailcharset "mailer.email.retrieverUserID" maileremailretriever-user-id "mailer.email.retrieverUserPWD" maileremailretriever-user-pwd }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mailer-impl-email-cq-retriever-template-factory
  ""
  ([] (com-day-cq-mailer-impl-email-cq-retriever-template-factory nil))
  ([optional-params]
   (:data (com-day-cq-mailer-impl-email-cq-retriever-template-factory-with-http-info optional-params))))

(defn com-day-cq-mcm-campaign-impl-integration-config-impl-with-http-info
  ""
  ([] (com-day-cq-mcm-campaign-impl-integration-config-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist aemmcmcampaignform-constraints aemmcmcampaignpublic-url aemmcmcampaignrelaxed-ssl ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "aem.mcm.campaign.formConstraints" (with-collection-format aemmcmcampaignform-constraints :multi) "aem.mcm.campaign.publicUrl" aemmcmcampaignpublic-url "aem.mcm.campaign.relaxedSSL" aemmcmcampaignrelaxed-ssl }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-campaign-impl-integration-config-impl
  ""
  ([] (com-day-cq-mcm-campaign-impl-integration-config-impl nil))
  ([optional-params]
   (:data (com-day-cq-mcm-campaign-impl-integration-config-impl-with-http-info optional-params))))

(defn com-day-cq-mcm-campaign-importer-personalized-text-handler-factory-with-http-info
  ""
  ([] (com-day-cq-mcm-campaign-importer-personalized-text-handler-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-campaign-importer-personalized-text-handler-factory
  ""
  ([] (com-day-cq-mcm-campaign-importer-personalized-text-handler-factory nil))
  ([optional-params]
   (:data (com-day-cq-mcm-campaign-importer-personalized-text-handler-factory-with-http-info optional-params))))

(defn com-day-cq-mcm-core-newsletter-newsletter-email-service-impl-with-http-info
  ""
  ([] (com-day-cq-mcm-core-newsletter-newsletter-email-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist fromaddress senderhost maxbouncecount ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "from.address" fromaddress "sender.host" senderhost "max.bounce.count" maxbouncecount }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-core-newsletter-newsletter-email-service-impl
  ""
  ([] (com-day-cq-mcm-core-newsletter-newsletter-email-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-mcm-core-newsletter-newsletter-email-service-impl-with-http-info optional-params))))

(defn com-day-cq-mcm-impl-mcm-configuration-with-http-info
  ""
  ([] (com-day-cq-mcm-impl-mcm-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist experienceindirection touchpointindirection ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "experience.indirection" (with-collection-format experienceindirection :multi) "touchpoint.indirection" (with-collection-format touchpointindirection :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-impl-mcm-configuration
  ""
  ([] (com-day-cq-mcm-impl-mcm-configuration nil))
  ([optional-params]
   (:data (com-day-cq-mcm-impl-mcm-configuration-with-http-info optional-params))))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-with-http-info
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern componentresource-type ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern "component.resourceType" componentresource-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen nil))
  ([optional-params]
   (:data (com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-with-http-info optional-params))))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-cta-graphical-click-throug-with-http-info
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-cta-graphical-click-throug-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern componentresource-type ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern "component.resourceType" componentresource-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-cta-graphical-click-throug
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-cta-graphical-click-throug nil))
  ([optional-params]
   (:data (com-day-cq-mcm-landingpage-parser-taghandlers-cta-graphical-click-throug-with-http-info optional-params))))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-cta-lead-form-cta-component-with-http-info
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-cta-lead-form-cta-component-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-cta-lead-form-cta-component
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-cta-lead-form-cta-component nil))
  ([optional-params]
   (:data (com-day-cq-mcm-landingpage-parser-taghandlers-cta-lead-form-cta-component-with-http-info optional-params))))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-mbox-m-box-experience-tag-ha-with-http-info
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-mbox-m-box-experience-tag-ha-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-mbox-m-box-experience-tag-ha
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-mbox-m-box-experience-tag-ha nil))
  ([optional-params]
   (:data (com-day-cq-mcm-landingpage-parser-taghandlers-mbox-m-box-experience-tag-ha-with-http-info optional-params))))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-mbox-target-component-tag-h-with-http-info
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-mbox-target-component-tag-h-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern componentresource-type ]}]
   (call-api "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern "component.resourceType" componentresource-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-mcm-landingpage-parser-taghandlers-mbox-target-component-tag-h
  ""
  ([] (com-day-cq-mcm-landingpage-parser-taghandlers-mbox-target-component-tag-h nil))
  ([optional-params]
   (:data (com-day-cq-mcm-landingpage-parser-taghandlers-mbox-target-component-tag-h-with-http-info optional-params))))

(defn com-day-cq-notification-impl-notification-service-impl-with-http-info
  ""
  ([] (com-day-cq-notification-impl-notification-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventfilter ]}]
   (call-api "/system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.filter" eventfilter }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-notification-impl-notification-service-impl
  ""
  ([] (com-day-cq-notification-impl-notification-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-notification-impl-notification-service-impl-with-http-info optional-params))))

(defn com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-with-http-info
  ""
  ([] (com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist forcelocation ]}]
   (call-api "/system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "forcelocation" forcelocation }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-personalization-impl-servlets-targeting-configuration-servlet
  ""
  ([] (com-day-cq-personalization-impl-servlets-targeting-configuration-servlet nil))
  ([optional-params]
   (:data (com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-with-http-info optional-params))))

(defn com-day-cq-polling-importer-impl-managed-poll-config-impl-with-http-info
  ""
  ([] (com-day-cq-polling-importer-impl-managed-poll-config-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist id enabled reference interval expression source target login password ]}]
   (call-api "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "id" id "enabled" enabled "reference" reference "interval" interval "expression" expression "source" source "target" target "login" login "password" password }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-polling-importer-impl-managed-poll-config-impl
  ""
  ([] (com-day-cq-polling-importer-impl-managed-poll-config-impl nil))
  ([optional-params]
   (:data (com-day-cq-polling-importer-impl-managed-poll-config-impl-with-http-info optional-params))))

(defn com-day-cq-polling-importer-impl-managed-polling-importer-impl-with-http-info
  ""
  ([] (com-day-cq-polling-importer-impl-managed-polling-importer-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist importeruser ]}]
   (call-api "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "importer.user" importeruser }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-polling-importer-impl-managed-polling-importer-impl
  ""
  ([] (com-day-cq-polling-importer-impl-managed-polling-importer-impl nil))
  ([optional-params]
   (:data (com-day-cq-polling-importer-impl-managed-polling-importer-impl-with-http-info optional-params))))

(defn com-day-cq-polling-importer-impl-polling-importer-impl-with-http-info
  ""
  ([] (com-day-cq-polling-importer-impl-polling-importer-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist importermininterval importeruser excludepaths includepaths ]}]
   (call-api "/system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "importer.min.interval" importermininterval "importer.user" importeruser "exclude.paths" (with-collection-format excludepaths :multi) "include.paths" (with-collection-format includepaths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-polling-importer-impl-polling-importer-impl
  ""
  ([] (com-day-cq-polling-importer-impl-polling-importer-impl nil))
  ([optional-params]
   (:data (com-day-cq-polling-importer-impl-polling-importer-impl-with-http-info optional-params))))

(defn com-day-cq-replication-audit-replication-event-listener-with-http-info
  ""
  ([] (com-day-cq-replication-audit-replication-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-audit-replication-event-listener
  ""
  ([] (com-day-cq-replication-audit-replication-event-listener nil))
  ([optional-params]
   (:data (com-day-cq-replication-audit-replication-event-listener-with-http-info optional-params))))

(defn com-day-cq-replication-content-static-content-builder-with-http-info
  ""
  ([] (com-day-cq-replication-content-static-content-builder-with-http-info nil))
  ([{:keys [post apply delete action location propertylist host port ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "host" host "port" port }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-content-static-content-builder
  ""
  ([] (com-day-cq-replication-content-static-content-builder nil))
  ([optional-params]
   (:data (com-day-cq-replication-content-static-content-builder-with-http-info optional-params))))

(defn com-day-cq-replication-impl-agent-manager-impl-with-http-info
  ""
  ([] (com-day-cq-replication-impl-agent-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jobtopics service-usertarget agent-providertarget ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "job.topics" jobtopics "serviceUser.target" service-usertarget "agentProvider.target" agent-providertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-agent-manager-impl
  ""
  ([] (com-day-cq-replication-impl-agent-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-agent-manager-impl-with-http-info optional-params))))

(defn com-day-cq-replication-impl-content-durbo-binary-less-content-builder-with-http-info
  ""
  ([] (com-day-cq-replication-impl-content-durbo-binary-less-content-builder-with-http-info nil))
  ([{:keys [post apply delete action location propertylist binarythreshold ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "binary.threshold" binarythreshold }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-content-durbo-binary-less-content-builder
  ""
  ([] (com-day-cq-replication-impl-content-durbo-binary-less-content-builder nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-content-durbo-binary-less-content-builder-with-http-info optional-params))))

(defn com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-with-http-info
  ""
  ([] (com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-with-http-info nil))
  ([{:keys [post apply delete action location propertylist preservehierarchynodes ignoreversioning importacl savethreshold preserveuserpaths preserveuuid preserveuuidnodetypes preserveuuidsubtrees autocommit ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "preserve.hierarchy.nodes" preservehierarchynodes "ignore.versioning" ignoreversioning "import.acl" importacl "save.threshold" savethreshold "preserve.user.paths" preserveuserpaths "preserve.uuid" preserveuuid "preserve.uuid.nodetypes" (with-collection-format preserveuuidnodetypes :multi) "preserve.uuid.subtrees" (with-collection-format preserveuuidsubtrees :multi) "auto.commit" autocommit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov
  ""
  ([] (com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-with-http-info optional-params))))

(defn com-day-cq-replication-impl-replication-content-factory-provider-impl-with-http-info
  ""
  ([] (com-day-cq-replication-impl-replication-content-factory-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist replicationcontentuse-file-storage replicationcontentmax-commit-attempts ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "replication.content.useFileStorage" replicationcontentuse-file-storage "replication.content.maxCommitAttempts" replicationcontentmax-commit-attempts }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-replication-content-factory-provider-impl
  ""
  ([] (com-day-cq-replication-impl-replication-content-factory-provider-impl nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-replication-content-factory-provider-impl-with-http-info optional-params))))

(defn com-day-cq-replication-impl-replication-receiver-impl-with-http-info
  ""
  ([] (com-day-cq-replication-impl-replication-receiver-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist receivertmpfilethreshold receiverpackagesuseinstall ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "receiver.tmpfile.threshold" receivertmpfilethreshold "receiver.packages.use.install" receiverpackagesuseinstall }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-replication-receiver-impl
  ""
  ([] (com-day-cq-replication-impl-replication-receiver-impl nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-replication-receiver-impl-with-http-info optional-params))))

(defn com-day-cq-replication-impl-replicator-impl-with-http-info
  ""
  ([] (com-day-cq-replication-impl-replicator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist distribute-events ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "distribute_events" distribute-events }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-replicator-impl
  ""
  ([] (com-day-cq-replication-impl-replicator-impl nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-replicator-impl-with-http-info optional-params))))

(defn com-day-cq-replication-impl-reverse-replicator-with-http-info
  ""
  ([] (com-day-cq-replication-impl-reverse-replicator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerperiod ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.period" schedulerperiod }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-reverse-replicator
  ""
  ([] (com-day-cq-replication-impl-reverse-replicator nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-reverse-replicator-with-http-info optional-params))))

(defn com-day-cq-replication-impl-transport-binary-less-transport-handler-with-http-info
  ""
  ([] (com-day-cq-replication-impl-transport-binary-less-transport-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist disabledciphersuites enabledciphersuites ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "disabled.cipher.suites" (with-collection-format disabledciphersuites :multi) "enabled.cipher.suites" (with-collection-format enabledciphersuites :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-transport-binary-less-transport-handler
  ""
  ([] (com-day-cq-replication-impl-transport-binary-less-transport-handler nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-transport-binary-less-transport-handler-with-http-info optional-params))))

(defn com-day-cq-replication-impl-transport-http-with-http-info
  ""
  ([] (com-day-cq-replication-impl-transport-http-with-http-info nil))
  ([{:keys [post apply delete action location propertylist disabledciphersuites enabledciphersuites ]}]
   (call-api "/system/console/configMgr/com.day.cq.replication.impl.transport.Http" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "disabled.cipher.suites" (with-collection-format disabledciphersuites :multi) "enabled.cipher.suites" (with-collection-format enabledciphersuites :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-replication-impl-transport-http
  ""
  ([] (com-day-cq-replication-impl-transport-http nil))
  ([optional-params]
   (:data (com-day-cq-replication-impl-transport-http-with-http-info optional-params))))

(defn com-day-cq-reporting-impl-cache-cache-impl-with-http-info
  ""
  ([] (com-day-cq-reporting-impl-cache-cache-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist repcacheenable repcachettl repcachemax ]}]
   (call-api "/system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "repcache.enable" repcacheenable "repcache.ttl" repcachettl "repcache.max" repcachemax }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-reporting-impl-cache-cache-impl
  ""
  ([] (com-day-cq-reporting-impl-cache-cache-impl nil))
  ([optional-params]
   (:data (com-day-cq-reporting-impl-cache-cache-impl-with-http-info optional-params))))

(defn com-day-cq-reporting-impl-config-service-impl-with-http-info
  ""
  ([] (com-day-cq-reporting-impl-config-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist repconftimezone repconflocale repconfsnapshots repconfrepdir repconfhourofday repconfminofhour repconfmaxrows repconffakedata repconfsnapshotuser repconfenforcesnapshotuser ]}]
   (call-api "/system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "repconf.timezone" repconftimezone "repconf.locale" repconflocale "repconf.snapshots" repconfsnapshots "repconf.repdir" repconfrepdir "repconf.hourofday" repconfhourofday "repconf.minofhour" repconfminofhour "repconf.maxrows" repconfmaxrows "repconf.fakedata" repconffakedata "repconf.snapshotuser" repconfsnapshotuser "repconf.enforcesnapshotuser" repconfenforcesnapshotuser }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-reporting-impl-config-service-impl
  ""
  ([] (com-day-cq-reporting-impl-config-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-reporting-impl-config-service-impl-with-http-info optional-params))))

(defn com-day-cq-reporting-impl-r-log-analyzer-with-http-info
  ""
  ([] (com-day-cq-reporting-impl-r-log-analyzer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist requestlogoutput ]}]
   (call-api "/system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "request.log.output" requestlogoutput }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-reporting-impl-r-log-analyzer
  ""
  ([] (com-day-cq-reporting-impl-r-log-analyzer nil))
  ([optional-params]
   (:data (com-day-cq-reporting-impl-r-log-analyzer-with-http-info optional-params))))

(defn com-day-cq-rewriter-linkchecker-impl-link-checker-impl-with-http-info
  ""
  ([] (com-day-cq-rewriter-linkchecker-impl-link-checker-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerperiod schedulerconcurrent servicebad-link-tolerance-interval servicecheck-override-patterns servicecache-broken-internal-links servicespecial-link-prefix servicespecial-link-patterns ]}]
   (call-api "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.period" schedulerperiod "scheduler.concurrent" schedulerconcurrent "service.bad_link_tolerance_interval" servicebad-link-tolerance-interval "service.check_override_patterns" (with-collection-format servicecheck-override-patterns :multi) "service.cache_broken_internal_links" servicecache-broken-internal-links "service.special_link_prefix" (with-collection-format servicespecial-link-prefix :multi) "service.special_link_patterns" (with-collection-format servicespecial-link-patterns :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-rewriter-linkchecker-impl-link-checker-impl
  ""
  ([] (com-day-cq-rewriter-linkchecker-impl-link-checker-impl nil))
  ([optional-params]
   (:data (com-day-cq-rewriter-linkchecker-impl-link-checker-impl-with-http-info optional-params))))

(defn com-day-cq-rewriter-linkchecker-impl-link-checker-task-with-http-info
  ""
  ([] (com-day-cq-rewriter-linkchecker-impl-link-checker-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerperiod schedulerconcurrent good-link-test-interval bad-link-test-interval link-unused-interval connectiontimeout ]}]
   (call-api "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.period" schedulerperiod "scheduler.concurrent" schedulerconcurrent "good_link_test_interval" good-link-test-interval "bad_link_test_interval" bad-link-test-interval "link_unused_interval" link-unused-interval "connection.timeout" connectiontimeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-rewriter-linkchecker-impl-link-checker-task
  ""
  ([] (com-day-cq-rewriter-linkchecker-impl-link-checker-task nil))
  ([optional-params]
   (:data (com-day-cq-rewriter-linkchecker-impl-link-checker-task-with-http-info optional-params))))

(defn com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory-with-http-info
  ""
  ([] (com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist linkcheckertransformerdisable-rewriting linkcheckertransformerdisable-checking linkcheckertransformermap-cache-size linkcheckertransformerstrict-extension-check linkcheckertransformerstrip-htmlt-extension linkcheckertransformerrewrite-elements linkcheckertransformerstrip-extension-path-blacklist ]}]
   (call-api "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "linkcheckertransformer.disableRewriting" linkcheckertransformerdisable-rewriting "linkcheckertransformer.disableChecking" linkcheckertransformerdisable-checking "linkcheckertransformer.mapCacheSize" linkcheckertransformermap-cache-size "linkcheckertransformer.strictExtensionCheck" linkcheckertransformerstrict-extension-check "linkcheckertransformer.stripHtmltExtension" linkcheckertransformerstrip-htmlt-extension "linkcheckertransformer.rewriteElements" (with-collection-format linkcheckertransformerrewrite-elements :multi) "linkcheckertransformer.stripExtensionPathBlacklist" (with-collection-format linkcheckertransformerstrip-extension-path-blacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory
  ""
  ([] (com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory nil))
  ([optional-params]
   (:data (com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory-with-http-info optional-params))))

(defn com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl-with-http-info
  ""
  ([] (com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist servicemax-links-per-host servicesave-external-link-references ]}]
   (call-api "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.max_links_per_host" servicemax-links-per-host "service.save_external_link_references" servicesave-external-link-references }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl
  ""
  ([] (com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl nil))
  ([optional-params]
   (:data (com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl-with-http-info optional-params))))

(defn com-day-cq-rewriter-processor-impl-html-parser-factory-with-http-info
  ""
  ([] (com-day-cq-rewriter-processor-impl-html-parser-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist htmlparserprocess-tags htmlparserpreserve-camel-case ]}]
   (call-api "/system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "htmlparser.processTags" (with-collection-format htmlparserprocess-tags :multi) "htmlparser.preserveCamelCase" htmlparserpreserve-camel-case }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-rewriter-processor-impl-html-parser-factory
  ""
  ([] (com-day-cq-rewriter-processor-impl-html-parser-factory nil))
  ([optional-params]
   (:data (com-day-cq-rewriter-processor-impl-html-parser-factory-with-http-info optional-params))))

(defn com-day-cq-search-impl-builder-query-builder-impl-with-http-info
  ""
  ([] (com-day-cq-search-impl-builder-query-builder-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist excerptproperties cachemaxentries cacheentrylifetime xpathunion ]}]
   (call-api "/system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "excerpt.properties" (with-collection-format excerptproperties :multi) "cache.max.entries" cachemaxentries "cache.entry.lifetime" cacheentrylifetime "xpath.union" xpathunion }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-search-impl-builder-query-builder-impl
  ""
  ([] (com-day-cq-search-impl-builder-query-builder-impl nil))
  ([optional-params]
   (:data (com-day-cq-search-impl-builder-query-builder-impl-with-http-info optional-params))))

(defn com-day-cq-search-suggest-impl-suggestion-index-manager-impl-with-http-info
  ""
  ([] (com-day-cq-search-suggest-impl-suggestion-index-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path-buildertarget suggestbasepath ]}]
   (call-api "/system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "pathBuilder.target" path-buildertarget "suggest.basepath" suggestbasepath }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-search-suggest-impl-suggestion-index-manager-impl
  ""
  ([] (com-day-cq-search-suggest-impl-suggestion-index-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-search-suggest-impl-suggestion-index-manager-impl-with-http-info optional-params))))

(defn com-day-cq-searchpromote-impl-publish-search-promote-config-handler-with-http-info
  ""
  ([] (com-day-cq-searchpromote-impl-publish-search-promote-config-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqsearchpromoteconfighandlerenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.searchpromote.confighandler.enabled" cqsearchpromoteconfighandlerenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-searchpromote-impl-publish-search-promote-config-handler
  ""
  ([] (com-day-cq-searchpromote-impl-publish-search-promote-config-handler nil))
  ([optional-params]
   (:data (com-day-cq-searchpromote-impl-publish-search-promote-config-handler-with-http-info optional-params))))

(defn com-day-cq-searchpromote-impl-search-promote-service-impl-with-http-info
  ""
  ([] (com-day-cq-searchpromote-impl-search-promote-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqsearchpromoteconfigurationserveruri cqsearchpromoteconfigurationenvironment connectiontimeout sockettimeout ]}]
   (call-api "/system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.searchpromote.configuration.server.uri" cqsearchpromoteconfigurationserveruri "cq.searchpromote.configuration.environment" cqsearchpromoteconfigurationenvironment "connection.timeout" connectiontimeout "socket.timeout" sockettimeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-searchpromote-impl-search-promote-service-impl
  ""
  ([] (com-day-cq-searchpromote-impl-search-promote-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-searchpromote-impl-search-promote-service-impl-with-http-info optional-params))))

(defn com-day-cq-security-acl-setup-with-http-info
  ""
  ([] (com-day-cq-security-acl-setup-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqaclsetuprules ]}]
   (call-api "/system/console/configMgr/com.day.cq.security.ACLSetup" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.aclsetup.rules" (with-collection-format cqaclsetuprules :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-security-acl-setup
  ""
  ([] (com-day-cq-security-acl-setup nil))
  ([optional-params]
   (:data (com-day-cq-security-acl-setup-with-http-info optional-params))))

(defn com-day-cq-statistics-impl-statistics-service-impl-with-http-info
  ""
  ([] (com-day-cq-statistics-impl-statistics-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerperiod schedulerconcurrent path workspace keywords-path async-entries ]}]
   (call-api "/system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.period" schedulerperiod "scheduler.concurrent" schedulerconcurrent "path" path "workspace" workspace "keywordsPath" keywords-path "asyncEntries" async-entries }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-statistics-impl-statistics-service-impl
  ""
  ([] (com-day-cq-statistics-impl-statistics-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-statistics-impl-statistics-service-impl-with-http-info optional-params))))

(defn com-day-cq-tagging-impl-jcr-tag-manager-factory-impl-with-http-info
  ""
  ([] (com-day-cq-tagging-impl-jcr-tag-manager-factory-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist validationenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "validation.enabled" validationenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-tagging-impl-jcr-tag-manager-factory-impl
  ""
  ([] (com-day-cq-tagging-impl-jcr-tag-manager-factory-impl nil))
  ([optional-params]
   (:data (com-day-cq-tagging-impl-jcr-tag-manager-factory-impl-with-http-info optional-params))))

(defn com-day-cq-tagging-impl-search-tag-predicate-evaluator-with-http-info
  ""
  ([] (com-day-cq-tagging-impl-search-tag-predicate-evaluator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist ignore-path ]}]
   (call-api "/system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "ignore_path" ignore-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-tagging-impl-search-tag-predicate-evaluator
  ""
  ([] (com-day-cq-tagging-impl-search-tag-predicate-evaluator nil))
  ([optional-params]
   (:data (com-day-cq-tagging-impl-search-tag-predicate-evaluator-with-http-info optional-params))))

(defn com-day-cq-tagging-impl-tag-garbage-collector-with-http-info
  ""
  ([] (com-day-cq-tagging-impl-tag-garbage-collector-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression ]}]
   (call-api "/system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-tagging-impl-tag-garbage-collector
  ""
  ([] (com-day-cq-tagging-impl-tag-garbage-collector nil))
  ([optional-params]
   (:data (com-day-cq-tagging-impl-tag-garbage-collector-with-http-info optional-params))))

(defn com-day-cq-wcm-contentsync-impl-handler-pages-update-handler-with-http-info
  ""
  ([] (com-day-cq-wcm-contentsync-impl-handler-pages-update-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqpagesupdatehandlerimageresourcetypes ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.pagesupdatehandler.imageresourcetypes" (with-collection-format cqpagesupdatehandlerimageresourcetypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-contentsync-impl-handler-pages-update-handler
  ""
  ([] (com-day-cq-wcm-contentsync-impl-handler-pages-update-handler nil))
  ([optional-params]
   (:data (com-day-cq-wcm-contentsync-impl-handler-pages-update-handler-with-http-info optional-params))))

(defn com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor-with-http-info
  ""
  ([] (com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqcontentsyncpathrewritertransformermappinglinks cqcontentsyncpathrewritertransformermappingclientlibs cqcontentsyncpathrewritertransformermappingimages cqcontentsyncpathrewritertransformerattributepattern cqcontentsyncpathrewritertransformerclientlibrarypattern cqcontentsyncpathrewritertransformerclientlibraryreplace ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.contentsync.pathrewritertransformer.mapping.links" (with-collection-format cqcontentsyncpathrewritertransformermappinglinks :multi) "cq.contentsync.pathrewritertransformer.mapping.clientlibs" (with-collection-format cqcontentsyncpathrewritertransformermappingclientlibs :multi) "cq.contentsync.pathrewritertransformer.mapping.images" (with-collection-format cqcontentsyncpathrewritertransformermappingimages :multi) "cq.contentsync.pathrewritertransformer.attribute.pattern" cqcontentsyncpathrewritertransformerattributepattern "cq.contentsync.pathrewritertransformer.clientlibrary.pattern" cqcontentsyncpathrewritertransformerclientlibrarypattern "cq.contentsync.pathrewritertransformer.clientlibrary.replace" cqcontentsyncpathrewritertransformerclientlibraryreplace }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor
  ""
  ([] (com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor nil))
  ([optional-params]
   (:data (com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-authoring-ui-mode-service-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-authoring-ui-mode-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist authoring-ui-mode-servicedefault ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "authoringUIModeService.default" authoring-ui-mode-servicedefault }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-authoring-ui-mode-service-impl
  ""
  ([] (com-day-cq-wcm-core-impl-authoring-ui-mode-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-authoring-ui-mode-service-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-commands-wcm-command-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-commands-wcm-command-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist wcmcommandservletdelete-whitelist ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "wcmcommandservlet.delete_whitelist" (with-collection-format wcmcommandservletdelete-whitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-commands-wcm-command-servlet
  ""
  ([] (com-day-cq-wcm-core-impl-commands-wcm-command-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-commands-wcm-command-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist dimdefaultmode dimappcacheenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "dim.default.mode" dimdefaultmode "dim.appcache.enabled" dimappcacheenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl
  ""
  ([] (com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-event-page-event-audit-listener-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-event-page-event-audit-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist configured ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "configured" configured }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-event-page-event-audit-listener
  ""
  ([] (com-day-cq-wcm-core-impl-event-page-event-audit-listener nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-event-page-event-audit-listener-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-event-page-post-processor-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-event-page-post-processor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist paths ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "paths" (with-collection-format paths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-event-page-post-processor
  ""
  ([] (com-day-cq-wcm-core-impl-event-page-post-processor nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-event-page-post-processor-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-event-repository-change-event-listener-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-event-repository-change-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist paths excluded-paths ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "paths" (with-collection-format paths :multi) "excludedPaths" (with-collection-format excluded-paths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-event-repository-change-event-listener
  ""
  ([] (com-day-cq-wcm-core-impl-event-repository-change-event-listener nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-event-repository-change-event-listener-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-event-template-post-processor-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-event-template-post-processor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist paths ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "paths" paths }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-event-template-post-processor
  ""
  ([] (com-day-cq-wcm-core-impl-event-template-post-processor nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-event-template-post-processor-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-language-manager-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-language-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist langmgrlistpath langmgrcountrydefault ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "langmgr.list.path" langmgrlistpath "langmgr.country.default" (with-collection-format langmgrcountrydefault :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-language-manager-impl
  ""
  ([] (com-day-cq-wcm-core-impl-language-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-language-manager-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist linkexpiredprefix linkexpiredremove linkexpiredsuffix linkinvalidprefix linkinvalidremove linkinvalidsuffix linkpredatedprefix linkpredatedremove linkpredatedsuffix linkwcmmodes ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "link.expired.prefix" linkexpiredprefix "link.expired.remove" linkexpiredremove "link.expired.suffix" linkexpiredsuffix "link.invalid.prefix" linkinvalidprefix "link.invalid.remove" linkinvalidremove "link.invalid.suffix" linkinvalidsuffix "link.predated.prefix" linkpredatedprefix "link.predated.remove" linkpredatedremove "link.predated.suffix" linkpredatedsuffix "link.wcmmodes" (with-collection-format linkwcmmodes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl
  ""
  ([] (com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-page-page-info-aggregator-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-page-page-info-aggregator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pageinfoproviderpropertyregexdefault pageinfoproviderpropertyname ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "page.info.provider.property.regex.default" pageinfoproviderpropertyregexdefault "page.info.provider.property.name" pageinfoproviderpropertyname }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-page-page-info-aggregator-impl
  ""
  ([] (com-day-cq-wcm-core-impl-page-page-info-aggregator-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-page-page-info-aggregator-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-page-page-manager-factory-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-page-page-manager-factory-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist illegal-char-mapping page-sub-tree-activation-check ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "illegalCharMapping" illegal-char-mapping "pageSubTreeActivationCheck" page-sub-tree-activation-check }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-page-page-manager-factory-impl
  ""
  ([] (com-day-cq-wcm-core-impl-page-page-manager-factory-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-page-page-manager-factory-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-references-content-content-reference-config-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-references-content-content-reference-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist content-reference-configresource-types ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "contentReferenceConfig.resourceTypes" (with-collection-format content-reference-configresource-types :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-references-content-content-reference-config
  ""
  ([] (com-day-cq-wcm-core-impl-references-content-content-reference-config nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-references-content-content-reference-config-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist damshowexpired damshowhidden tag-title-search guess-total damexpiry-property ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "dam.showexpired" damshowexpired "dam.showhidden" damshowhidden "tagTitleSearch" tag-title-search "guessTotal" guess-total "dam.expiryProperty" damexpiry-property }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-servlets-contentfinder-connector-connector-vie-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-contentfinder-connector-connector-vie-with-http-info nil))
  ([{:keys [post apply delete action location propertylist itemresourcetypes ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "item.resource.types" (with-collection-format itemresourcetypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-servlets-contentfinder-connector-connector-vie
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-contentfinder-connector-connector-vie nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-servlets-contentfinder-connector-connector-vie-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist guess-total tag-title-search ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "guessTotal" guess-total "tagTitleSearch" tag-title-search }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-servlets-find-replace-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-find-replace-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist scope ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scope" (with-collection-format scope :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-servlets-find-replace-servlet
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-find-replace-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-servlets-find-replace-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-servlets-reference-search-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-reference-search-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist referencesearchservletmax-references-per-page referencesearchservletmax-pages ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "referencesearchservlet.maxReferencesPerPage" referencesearchservletmax-references-per-page "referencesearchservlet.maxPages" referencesearchservletmax-pages }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-servlets-reference-search-servlet
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-reference-search-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-servlets-reference-search-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-servlets-thumbnail-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-thumbnail-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist workspace dimensions ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "workspace" workspace "dimensions" (with-collection-format dimensions :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-servlets-thumbnail-servlet
  ""
  ([] (com-day-cq-wcm-core-impl-servlets-thumbnail-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-servlets-thumbnail-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-utils-default-page-name-validator-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-utils-default-page-name-validator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist non-valid-chars ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "nonValidChars" non-valid-chars }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-utils-default-page-name-validator
  ""
  ([] (com-day-cq-wcm-core-impl-utils-default-page-name-validator nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-utils-default-page-name-validator-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-variants-page-variants-provider-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-variants-page-variants-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist defaultexternalizerdomain ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "default.externalizer.domain" defaultexternalizerdomain }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-variants-page-variants-provider-impl
  ""
  ([] (com-day-cq-wcm-core-impl-variants-page-variants-provider-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-variants-page-variants-provider-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-version-manager-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-version-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist versionmanagercreate-version-on-activation versionmanagerpurging-enabled versionmanagerpurge-paths versionmanageriv-paths versionmanagermax-age-days versionmanagermax-number-versions versionmanagermin-number-versions ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "versionmanager.createVersionOnActivation" versionmanagercreate-version-on-activation "versionmanager.purgingEnabled" versionmanagerpurging-enabled "versionmanager.purgePaths" (with-collection-format versionmanagerpurge-paths :multi) "versionmanager.ivPaths" (with-collection-format versionmanageriv-paths :multi) "versionmanager.maxAgeDays" versionmanagermax-age-days "versionmanager.maxNumberVersions" versionmanagermax-number-versions "versionmanager.minNumberVersions" versionmanagermin-number-versions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-version-manager-impl
  ""
  ([] (com-day-cq-wcm-core-impl-version-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-version-manager-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-version-purge-task-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-version-purge-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist versionpurgepaths versionpurgerecursive versionpurgemax-versions versionpurgemin-versions versionpurgemax-age-days ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "versionpurge.paths" (with-collection-format versionpurgepaths :multi) "versionpurge.recursive" versionpurgerecursive "versionpurge.maxVersions" versionpurgemax-versions "versionpurge.minVersions" versionpurgemin-versions "versionpurge.maxAgeDays" versionpurgemax-age-days }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-version-purge-task
  ""
  ([] (com-day-cq-wcm-core-impl-version-purge-task nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-version-purge-task-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-warp-time-warp-filter-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-warp-time-warp-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist filterorder filterscope ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "filter.order" filterorder "filter.scope" filterscope }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-warp-time-warp-filter
  ""
  ([] (com-day-cq-wcm-core-impl-warp-time-warp-filter nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-warp-time-warp-filter-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-wcm-debug-filter-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-wcm-debug-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist wcmdbgfilterenabled wcmdbgfilterjsp-debug ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "wcmdbgfilter.enabled" wcmdbgfilterenabled "wcmdbgfilter.jspDebug" wcmdbgfilterjsp-debug }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-wcm-debug-filter
  ""
  ([] (com-day-cq-wcm-core-impl-wcm-debug-filter nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-wcm-debug-filter-with-http-info optional-params))))

(defn com-day-cq-wcm-core-impl-wcm-developer-mode-filter-with-http-info
  ""
  ([] (com-day-cq-wcm-core-impl-wcm-developer-mode-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist wcmdevmodefilterenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "wcmdevmodefilter.enabled" wcmdevmodefilterenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-impl-wcm-developer-mode-filter
  ""
  ([] (com-day-cq-wcm-core-impl-wcm-developer-mode-filter nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-impl-wcm-developer-mode-filter-with-http-info optional-params))))

(defn com-day-cq-wcm-core-mvt-mvt-statistics-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-mvt-mvt-statistics-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mvtstatisticstrackingurl ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mvtstatistics.trackingurl" mvtstatisticstrackingurl }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-mvt-mvt-statistics-impl
  ""
  ([] (com-day-cq-wcm-core-mvt-mvt-statistics-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-mvt-mvt-statistics-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-stats-page-view-statistics-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-core-stats-page-view-statistics-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pageviewstatisticstrackingurl pageviewstatisticstrackingscriptenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "pageviewstatistics.trackingurl" pageviewstatisticstrackingurl "pageviewstatistics.trackingscript.enabled" pageviewstatisticstrackingscriptenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-stats-page-view-statistics-impl
  ""
  ([] (com-day-cq-wcm-core-stats-page-view-statistics-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-stats-page-view-statistics-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-core-wcm-request-filter-with-http-info
  ""
  ([] (com-day-cq-wcm-core-wcm-request-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist wcmfiltermode ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "wcmfilter.mode" wcmfiltermode }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-core-wcm-request-filter
  ""
  ([] (com-day-cq-wcm-core-wcm-request-filter nil))
  ([optional-params]
   (:data (com-day-cq-wcm-core-wcm-request-filter-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-design-package-importer-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-design-package-importer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist extractfilter ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "extract.filter" (with-collection-format extractfilter :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-design-package-importer
  ""
  ([] (com-day-cq-wcm-designimporter-design-package-importer nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-design-package-importer-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-impl-canvas-builder-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-impl-canvas-builder-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist filepattern buildpagenodes buildclientlibs buildcanvascomponent ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "filepattern" filepattern "build.page.nodes" buildpagenodes "build.client.libs" buildclientlibs "build.canvas.component" buildcanvascomponent }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-impl-canvas-builder-impl
  ""
  ([] (com-day-cq-wcm-designimporter-impl-canvas-builder-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-impl-canvas-builder-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist min-thread-pool-size max-thread-pool-size ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "minThreadPoolSize" min-thread-pool-size "maxThreadPoolSize" max-thread-pool-size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler
  ""
  ([] (com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-impl-entry-preprocessor-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-impl-entry-preprocessor-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist searchpattern replacepattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "search.pattern" searchpattern "replace.pattern" replacepattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-impl-entry-preprocessor-impl
  ""
  ([] (com-day-cq-wcm-designimporter-impl-entry-preprocessor-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-impl-entry-preprocessor-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist filepattern devicegroups buildpagenodes buildclientlibs buildcanvascomponent ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "filepattern" filepattern "device.groups" (with-collection-format devicegroups :multi) "build.page.nodes" buildpagenodes "build.client.libs" buildclientlibs "build.canvas.component" buildcanvascomponent }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl
  ""
  ([] (com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-canvas-compone-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-canvas-compone-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-canvas-compone
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-canvas-compone nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-canvas-compone-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-tag-han-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-tag-han-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-tag-han
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-tag-han nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-tag-han-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-i-frame-tag-hand-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-i-frame-tag-hand-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-i-frame-tag-hand
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-i-frame-tag-hand nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-i-frame-tag-hand-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-image-componen-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-image-componen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern componentresource-type ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern "component.resourceType" componentresource-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-image-componen
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-image-componen nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-image-componen-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-img-tag-handler-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-img-tag-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-img-tag-handler
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-img-tag-handler nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-img-tag-handler-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-inline-script-t-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-inline-script-t-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-inline-script-t
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-inline-script-t nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-inline-script-t-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-link-tag-handle-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-link-tag-handle-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-link-tag-handle
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-link-tag-handle nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-link-tag-handle-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-meta-tag-handle-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-meta-tag-handle-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-meta-tag-handle
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-meta-tag-handle nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-meta-tag-handle-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-parsys-compone-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-parsys-compone-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern componentresource-type ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern "component.resourceType" componentresource-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-parsys-compone
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-parsys-compone nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-parsys-compone-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-script-tag-hand-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-script-tag-hand-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-script-tag-hand
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-script-tag-hand nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-script-tag-hand-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-style-tag-handl-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-style-tag-handl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-style-tag-handl
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-style-tag-handl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-style-tag-handl-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-text-component-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-text-component-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern componentresource-type ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern "component.resourceType" componentresource-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-text-component
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-text-component nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-text-component-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-componen-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-componen-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern componentresource-type ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern "component.resourceType" componentresource-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-componen
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-componen nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-componen-with-http-info optional-params))))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-tag-handl-with-http-info
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-tag-handl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking tagpattern ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "tagpattern" tagpattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-tag-handl
  ""
  ([] (com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-tag-handl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-designimporter-parser-taghandlers-factory-title-tag-handl-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist servicename slingservletresource-types slingservletselectors slingservletmethods formsformchooserservletadvansesearchrequire ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.name" servicename "sling.servlet.resourceTypes" slingservletresource-types "sling.servlet.selectors" slingservletselectors "sling.servlet.methods" (with-collection-format slingservletmethods :multi) "forms.formchooserservlet.advansesearch.require" formsformchooserservletadvansesearchrequire }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet
  ""
  ([] (com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist formsformparagraphpostprocessorenabled formsformparagraphpostprocessorformresourcetypes ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "forms.formparagraphpostprocessor.enabled" formsformparagraphpostprocessorenabled "forms.formparagraphpostprocessor.formresourcetypes" (with-collection-format formsformparagraphpostprocessorformresourcetypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor
  ""
  ([] (com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-forms-impl-forms-handling-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-forms-impl-forms-handling-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist namewhitelist allowexpressions ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name.whitelist" namewhitelist "allow.expressions" allowexpressions }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-forms-impl-forms-handling-servlet
  ""
  ([] (com-day-cq-wcm-foundation-forms-impl-forms-handling-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-forms-impl-forms-handling-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-forms-impl-mail-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-forms-impl-mail-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletresource-types slingservletselectors resourcewhitelist resourceblacklist ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.resourceTypes" slingservletresource-types "sling.servlet.selectors" slingservletselectors "resource.whitelist" (with-collection-format resourcewhitelist :multi) "resource.blacklist" resourceblacklist }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-forms-impl-mail-servlet
  ""
  ([] (com-day-cq-wcm-foundation-forms-impl-mail-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-forms-impl-mail-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-impl-adaptive-image-component-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-impl-adaptive-image-component-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist adaptsupportedwidths ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "adapt.supported.widths" (with-collection-format adaptsupportedwidths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-impl-adaptive-image-component-servlet
  ""
  ([] (com-day-cq-wcm-foundation-impl-adaptive-image-component-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-impl-adaptive-image-component-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-impl-http-auth-handler-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-impl-http-auth-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path authhttpnologin authhttprealm authdefaultloginpage authcredform authcredutf8 ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path "auth.http.nologin" authhttpnologin "auth.http.realm" authhttprealm "auth.default.loginpage" authdefaultloginpage "auth.cred.form" (with-collection-format authcredform :multi) "auth.cred.utf8" (with-collection-format authcredutf8 :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-impl-http-auth-handler
  ""
  ([] (com-day-cq-wcm-foundation-impl-http-auth-handler nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-impl-http-auth-handler-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-impl-page-impressions-tracker-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-impl-page-impressions-tracker-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingauthrequirements ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.auth.requirements" slingauthrequirements }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-impl-page-impressions-tracker
  ""
  ([] (com-day-cq-wcm-foundation-impl-page-impressions-tracker nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-impl-page-impressions-tracker-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-impl-page-redirect-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-impl-page-redirect-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist excludedresourcetypes ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "excluded.resource.types" (with-collection-format excludedresourcetypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-impl-page-redirect-servlet
  ""
  ([] (com-day-cq-wcm-foundation-impl-page-redirect-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-impl-page-redirect-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-with-http-info nil))
  ([{:keys [post apply delete action location propertylist defaultattachmenttypeblacklist baselineattachmenttypeblacklist ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "default.attachment.type.blacklist" (with-collection-format defaultattachmenttypeblacklist :multi) "baseline.attachment.type.blacklist" (with-collection-format baselineattachmenttypeblacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist
  ""
  ([] (com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-with-http-info optional-params))))

(defn com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist parameterwhitelist parameterwhitelistprefixes binaryparameterwhitelist modifierwhitelist operationwhitelist operationwhitelistprefixes typehintwhitelist resourcetypewhitelist ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "parameter.whitelist" (with-collection-format parameterwhitelist :multi) "parameter.whitelist.prefixes" (with-collection-format parameterwhitelistprefixes :multi) "binary.parameter.whitelist" (with-collection-format binaryparameterwhitelist :multi) "modifier.whitelist" (with-collection-format modifierwhitelist :multi) "operation.whitelist" (with-collection-format operationwhitelist :multi) "operation.whitelist.prefixes" (with-collection-format operationwhitelistprefixes :multi) "typehint.whitelist" (with-collection-format typehintwhitelist :multi) "resourcetype.whitelist" (with-collection-format resourcetypewhitelist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl
  ""
  ([] (com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory-with-http-info
  ""
  ([] (com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist deviceinfotransformerenabled deviceinfotransformercssstyle ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "device.info.transformer.enabled" deviceinfotransformerenabled "device.info.transformer.css.style" deviceinfotransformercssstyle }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory
  ""
  ([] (com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory nil))
  ([optional-params]
   (:data (com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory-with-http-info optional-params))))

(defn com-day-cq-wcm-mobile-core-impl-redirect-redirect-filter-with-http-info
  ""
  ([] (com-day-cq-wcm-mobile-core-impl-redirect-redirect-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist redirectenabled redirectstatsenabled redirectextensions redirectpaths ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "redirect.enabled" redirectenabled "redirect.stats.enabled" redirectstatsenabled "redirect.extensions" (with-collection-format redirectextensions :multi) "redirect.paths" (with-collection-format redirectpaths :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-mobile-core-impl-redirect-redirect-filter
  ""
  ([] (com-day-cq-wcm-mobile-core-impl-redirect-redirect-filter nil))
  ([optional-params]
   (:data (com-day-cq-wcm-mobile-core-impl-redirect-redirect-filter-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-actions-content-copy-action-factory-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-content-copy-action-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmmsmactionexcludednodetypes cqwcmmsmactionexcludedparagraphitems cqwcmmsmactionexcludedprops contentcopyactionorderstyle ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.msm.action.excludednodetypes" (with-collection-format cqwcmmsmactionexcludednodetypes :multi) "cq.wcm.msm.action.excludedparagraphitems" (with-collection-format cqwcmmsmactionexcludedparagraphitems :multi) "cq.wcm.msm.action.excludedprops" (with-collection-format cqwcmmsmactionexcludedprops :multi) "contentcopyaction.order.style" contentcopyactionorderstyle }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-actions-content-copy-action-factory
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-content-copy-action-factory nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-actions-content-copy-action-factory-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-actions-content-delete-action-factory-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-content-delete-action-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmmsmactionexcludednodetypes cqwcmmsmactionexcludedparagraphitems cqwcmmsmactionexcludedprops ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.msm.action.excludednodetypes" (with-collection-format cqwcmmsmactionexcludednodetypes :multi) "cq.wcm.msm.action.excludedparagraphitems" (with-collection-format cqwcmmsmactionexcludedparagraphitems :multi) "cq.wcm.msm.action.excludedprops" (with-collection-format cqwcmmsmactionexcludedprops :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-actions-content-delete-action-factory
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-content-delete-action-factory nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-actions-content-delete-action-factory-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-actions-content-update-action-factory-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-content-update-action-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmmsmactionexcludednodetypes cqwcmmsmactionexcludedparagraphitems cqwcmmsmactionexcludedprops cqwcmmsmactionignored-mixin ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.msm.action.excludednodetypes" (with-collection-format cqwcmmsmactionexcludednodetypes :multi) "cq.wcm.msm.action.excludedparagraphitems" (with-collection-format cqwcmmsmactionexcludedparagraphitems :multi) "cq.wcm.msm.action.excludedprops" (with-collection-format cqwcmmsmactionexcludedprops :multi) "cq.wcm.msm.action.ignoredMixin" (with-collection-format cqwcmmsmactionignored-mixin :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-actions-content-update-action-factory
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-content-update-action-factory nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-actions-content-update-action-factory-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-actions-order-children-action-factory-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-order-children-action-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmmsmactionexcludednodetypes cqwcmmsmactionexcludedparagraphitems cqwcmmsmactionexcludedprops ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.msm.action.excludednodetypes" (with-collection-format cqwcmmsmactionexcludednodetypes :multi) "cq.wcm.msm.action.excludedparagraphitems" (with-collection-format cqwcmmsmactionexcludedparagraphitems :multi) "cq.wcm.msm.action.excludedprops" (with-collection-format cqwcmmsmactionexcludedprops :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-actions-order-children-action-factory
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-order-children-action-factory nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-actions-order-children-action-factory-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-actions-page-move-action-factory-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-page-move-action-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmmsmactionexcludednodetypes cqwcmmsmactionexcludedparagraphitems cqwcmmsmactionexcludedprops cqwcmmsmimplactionspagemoveprop-reference-update ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.msm.action.excludednodetypes" (with-collection-format cqwcmmsmactionexcludednodetypes :multi) "cq.wcm.msm.action.excludedparagraphitems" (with-collection-format cqwcmmsmactionexcludedparagraphitems :multi) "cq.wcm.msm.action.excludedprops" (with-collection-format cqwcmmsmactionexcludedprops :multi) "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate" cqwcmmsmimplactionspagemoveprop-reference-update }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-actions-page-move-action-factory
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-page-move-action-factory nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-actions-page-move-action-factory-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-actions-references-update-action-factory-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-references-update-action-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmmsmactionexcludednodetypes cqwcmmsmactionexcludedparagraphitems cqwcmmsmactionexcludedprops cqwcmmsmimplactionreferencesupdateprop-update-nested ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.msm.action.excludednodetypes" (with-collection-format cqwcmmsmactionexcludednodetypes :multi) "cq.wcm.msm.action.excludedparagraphitems" (with-collection-format cqwcmmsmactionexcludedparagraphitems :multi) "cq.wcm.msm.action.excludedprops" (with-collection-format cqwcmmsmactionexcludedprops :multi) "cq.wcm.msm.impl.action.referencesupdate.prop_updateNested" cqwcmmsmimplactionreferencesupdateprop-update-nested }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-actions-references-update-action-factory
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-references-update-action-factory nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-actions-references-update-action-factory-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-actions-version-copy-action-factory-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-version-copy-action-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmmsmactionexcludednodetypes cqwcmmsmactionexcludedparagraphitems cqwcmmsmactionexcludedprops ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.msm.action.excludednodetypes" (with-collection-format cqwcmmsmactionexcludednodetypes :multi) "cq.wcm.msm.action.excludedparagraphitems" (with-collection-format cqwcmmsmactionexcludedparagraphitems :multi) "cq.wcm.msm.action.excludedprops" (with-collection-format cqwcmmsmactionexcludedprops :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-actions-version-copy-action-factory
  ""
  ([] (com-day-cq-wcm-msm-impl-actions-version-copy-action-factory nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-actions-version-copy-action-factory-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-live-relationship-manager-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-live-relationship-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist liverelationshipmgrrelationsconfigdefault ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "liverelationshipmgr.relationsconfig.default" liverelationshipmgrrelationsconfigdefault }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-live-relationship-manager-impl
  ""
  ([] (com-day-cq-wcm-msm-impl-live-relationship-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-live-relationship-manager-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-rollout-manager-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-rollout-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventfilter rolloutmgrexcludedpropsdefault rolloutmgrexcludedparagraphpropsdefault rolloutmgrexcludednodetypesdefault rolloutmgrthreadpoolmaxsize rolloutmgrthreadpoolmaxshutdowntime rolloutmgrthreadpoolpriority rolloutmgrcommitsize rolloutmgrconflicthandlingenabled ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.filter" eventfilter "rolloutmgr.excludedprops.default" (with-collection-format rolloutmgrexcludedpropsdefault :multi) "rolloutmgr.excludedparagraphprops.default" (with-collection-format rolloutmgrexcludedparagraphpropsdefault :multi) "rolloutmgr.excludednodetypes.default" (with-collection-format rolloutmgrexcludednodetypesdefault :multi) "rolloutmgr.threadpool.maxsize" rolloutmgrthreadpoolmaxsize "rolloutmgr.threadpool.maxshutdowntime" rolloutmgrthreadpoolmaxshutdowntime "rolloutmgr.threadpool.priority" rolloutmgrthreadpoolpriority "rolloutmgr.commit.size" rolloutmgrcommitsize "rolloutmgr.conflicthandling.enabled" rolloutmgrconflicthandlingenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-rollout-manager-impl
  ""
  ([] (com-day-cq-wcm-msm-impl-rollout-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-rollout-manager-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-msm-impl-servlets-audit-log-servlet-with-http-info
  ""
  ([] (com-day-cq-wcm-msm-impl-servlets-audit-log-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist auditlogservletdefaulteventscount auditlogservletdefaultpath ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "auditlogservlet.default.events.count" auditlogservletdefaulteventscount "auditlogservlet.default.path" auditlogservletdefaultpath }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-msm-impl-servlets-audit-log-servlet
  ""
  ([] (com-day-cq-wcm-msm-impl-servlets-audit-log-servlet nil))
  ([optional-params]
   (:data (com-day-cq-wcm-msm-impl-servlets-audit-log-servlet-with-http-info optional-params))))

(defn com-day-cq-wcm-notification-email-impl-email-channel-with-http-info
  ""
  ([] (com-day-cq-wcm-notification-email-impl-email-channel-with-http-info nil))
  ([{:keys [post apply delete action location propertylist emailfrom ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "email.from" emailfrom }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-notification-email-impl-email-channel
  ""
  ([] (com-day-cq-wcm-notification-email-impl-email-channel nil))
  ([optional-params]
   (:data (com-day-cq-wcm-notification-email-impl-email-channel-with-http-info optional-params))))

(defn com-day-cq-wcm-notification-impl-notification-manager-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-notification-impl-notification-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventtopics ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.topics" (with-collection-format eventtopics :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-notification-impl-notification-manager-impl
  ""
  ([] (com-day-cq-wcm-notification-impl-notification-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-notification-impl-notification-manager-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-scripting-impl-bvp-manager-with-http-info
  ""
  ([] (com-day-cq-wcm-scripting-impl-bvp-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist comdaycqwcmscriptingbvpscriptengines ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "com.day.cq.wcm.scripting.bvp.script.engines" (with-collection-format comdaycqwcmscriptingbvpscriptengines :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-scripting-impl-bvp-manager
  ""
  ([] (com-day-cq-wcm-scripting-impl-bvp-manager nil))
  ([optional-params]
   (:data (com-day-cq-wcm-scripting-impl-bvp-manager-with-http-info optional-params))))

(defn com-day-cq-wcm-undo-undo-config-with-http-info
  ""
  ([] (com-day-cq-wcm-undo-undo-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cqwcmundoenabled cqwcmundopath cqwcmundovalidity cqwcmundosteps cqwcmundopersistence cqwcmundopersistencemode cqwcmundomarkermode cqwcmundowhitelist cqwcmundoblacklist ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.undo.UndoConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cq.wcm.undo.enabled" cqwcmundoenabled "cq.wcm.undo.path" cqwcmundopath "cq.wcm.undo.validity" cqwcmundovalidity "cq.wcm.undo.steps" cqwcmundosteps "cq.wcm.undo.persistence" cqwcmundopersistence "cq.wcm.undo.persistence.mode" cqwcmundopersistencemode "cq.wcm.undo.markermode" cqwcmundomarkermode "cq.wcm.undo.whitelist" (with-collection-format cqwcmundowhitelist :multi) "cq.wcm.undo.blacklist" (with-collection-format cqwcmundoblacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-undo-undo-config
  ""
  ([] (com-day-cq-wcm-undo-undo-config nil))
  ([optional-params]
   (:data (com-day-cq-wcm-undo-undo-config-with-http-info optional-params))))

(defn com-day-cq-wcm-webservicesupport-impl-replication-event-listener-with-http-info
  ""
  ([] (com-day-cq-wcm-webservicesupport-impl-replication-event-listener-with-http-info nil))
  ([{:keys [post apply delete action location propertylist flushagents ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "Flush agents" (with-collection-format flushagents :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-webservicesupport-impl-replication-event-listener
  ""
  ([] (com-day-cq-wcm-webservicesupport-impl-replication-event-listener nil))
  ([optional-params]
   (:data (com-day-cq-wcm-webservicesupport-impl-replication-event-listener-with-http-info optional-params))))

(defn com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl-with-http-info
  ""
  ([] (com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist eventfilter min-thread-pool-size max-thread-pool-size cqwcmworkflowterminateonactivate cqwcmworklfowterminateexclusionlist ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "event.filter" eventfilter "minThreadPoolSize" min-thread-pool-size "maxThreadPoolSize" max-thread-pool-size "cq.wcm.workflow.terminate.on.activate" cqwcmworkflowterminateonactivate "cq.wcm.worklfow.terminate.exclusion.list" (with-collection-format cqwcmworklfowterminateexclusionlist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl
  ""
  ([] (com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl nil))
  ([optional-params]
   (:data (com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl-with-http-info optional-params))))

(defn com-day-cq-wcm-workflow-impl-workflow-package-info-provider-with-http-info
  ""
  ([] (com-day-cq-wcm-workflow-impl-workflow-package-info-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist workflowpackageinfoproviderfilter workflowpackageinfoproviderfilterrootpath ]}]
   (call-api "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "workflowpackageinfoprovider.filter" (with-collection-format workflowpackageinfoproviderfilter :multi) "workflowpackageinfoprovider.filter.rootpath" workflowpackageinfoproviderfilterrootpath }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-wcm-workflow-impl-workflow-package-info-provider
  ""
  ([] (com-day-cq-wcm-workflow-impl-workflow-package-info-provider nil))
  ([optional-params]
   (:data (com-day-cq-wcm-workflow-impl-workflow-package-info-provider-with-http-info optional-params))))

(defn com-day-cq-widget-impl-html-library-manager-impl-with-http-info
  ""
  ([] (com-day-cq-widget-impl-html-library-manager-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist htmllibmanagerclientmanager htmllibmanagerdebug htmllibmanagerdebugconsole htmllibmanagerdebuginitjs htmllibmanagerdefaultthemename htmllibmanagerdefaultuserthemename htmllibmanagerfirebuglitepath htmllibmanagerforce-cq-url-info htmllibmanagergzip htmllibmanagermaxage htmllibmanagermax-data-uri-size htmllibmanagerminify htmllibmanagerpathlist htmllibmanagertiming ]}]
   (call-api "/system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "htmllibmanager.clientmanager" htmllibmanagerclientmanager "htmllibmanager.debug" htmllibmanagerdebug "htmllibmanager.debug.console" htmllibmanagerdebugconsole "htmllibmanager.debug.init.js" htmllibmanagerdebuginitjs "htmllibmanager.defaultthemename" htmllibmanagerdefaultthemename "htmllibmanager.defaultuserthemename" htmllibmanagerdefaultuserthemename "htmllibmanager.firebuglite.path" htmllibmanagerfirebuglitepath "htmllibmanager.forceCQUrlInfo" htmllibmanagerforce-cq-url-info "htmllibmanager.gzip" htmllibmanagergzip "htmllibmanager.maxage" htmllibmanagermaxage "htmllibmanager.maxDataUriSize" htmllibmanagermax-data-uri-size "htmllibmanager.minify" htmllibmanagerminify "htmllibmanager.path.list" (with-collection-format htmllibmanagerpathlist :multi) "htmllibmanager.timing" htmllibmanagertiming }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-widget-impl-html-library-manager-impl
  ""
  ([] (com-day-cq-widget-impl-html-library-manager-impl nil))
  ([optional-params]
   (:data (com-day-cq-widget-impl-html-library-manager-impl-with-http-info optional-params))))

(defn com-day-cq-widget-impl-widget-extension-provider-impl-with-http-info
  ""
  ([] (com-day-cq-widget-impl-widget-extension-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist extendablewidgets widgetextensionproviderdebug ]}]
   (call-api "/system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "extendable.widgets" (with-collection-format extendablewidgets :multi) "widgetextensionprovider.debug" widgetextensionproviderdebug }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-widget-impl-widget-extension-provider-impl
  ""
  ([] (com-day-cq-widget-impl-widget-extension-provider-impl nil))
  ([optional-params]
   (:data (com-day-cq-widget-impl-widget-extension-provider-impl-with-http-info optional-params))))

(defn com-day-cq-workflow-impl-email-e-mail-notification-service-with-http-info
  ""
  ([] (com-day-cq-workflow-impl-email-e-mail-notification-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist fromaddress hostprefix notifyonabort notifyoncomplete notifyoncontainercomplete notifyuseronly ]}]
   (call-api "/system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "from.address" fromaddress "host.prefix" hostprefix "notify.onabort" notifyonabort "notify.oncomplete" notifyoncomplete "notify.oncontainercomplete" notifyoncontainercomplete "notify.useronly" notifyuseronly }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-workflow-impl-email-e-mail-notification-service
  ""
  ([] (com-day-cq-workflow-impl-email-e-mail-notification-service nil))
  ([optional-params]
   (:data (com-day-cq-workflow-impl-email-e-mail-notification-service-with-http-info optional-params))))

(defn com-day-cq-workflow-impl-email-task-e-mail-notification-service-with-http-info
  ""
  ([] (com-day-cq-workflow-impl-email-task-e-mail-notification-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist notifyonupdate notifyoncomplete ]}]
   (call-api "/system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "notify.onupdate" notifyonupdate "notify.oncomplete" notifyoncomplete }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-cq-workflow-impl-email-task-e-mail-notification-service
  ""
  ([] (com-day-cq-workflow-impl-email-task-e-mail-notification-service nil))
  ([optional-params]
   (:data (com-day-cq-workflow-impl-email-task-e-mail-notification-service-with-http-info optional-params))))

(defn com-day-crx-security-token-impl-impl-token-authentication-handler-with-http-info
  ""
  ([] (com-day-crx-security-token-impl-impl-token-authentication-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path tokenrequiredattr tokenalternateurl tokenencapsulated skiptokenrefresh ]}]
   (call-api "/system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path "token.required.attr" tokenrequiredattr "token.alternate.url" tokenalternateurl "token.encapsulated" tokenencapsulated "skip.token.refresh" (with-collection-format skiptokenrefresh :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-crx-security-token-impl-impl-token-authentication-handler
  ""
  ([] (com-day-crx-security-token-impl-impl-token-authentication-handler nil))
  ([optional-params]
   (:data (com-day-crx-security-token-impl-impl-token-authentication-handler-with-http-info optional-params))))

(defn com-day-crx-security-token-impl-token-cleanup-task-with-http-info
  ""
  ([] (com-day-crx-security-token-impl-token-cleanup-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabletokencleanuptask schedulerexpression batchsize ]}]
   (call-api "/system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enable.token.cleanup.task" enabletokencleanuptask "scheduler.expression" schedulerexpression "batch.size" batchsize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn com-day-crx-security-token-impl-token-cleanup-task
  ""
  ([] (com-day-crx-security-token-impl-token-cleanup-task nil))
  ([optional-params]
   (:data (com-day-crx-security-token-impl-token-cleanup-task-with-http-info optional-params))))

(defn guide-localization-service-with-http-info
  ""
  ([] (guide-localization-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist supported-locales localizable-properties ]}]
   (call-api "/system/console/configMgr/Guide Localization Service" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "supportedLocales" (with-collection-format supported-locales :multi) "Localizable Properties" (with-collection-format localizable-properties :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn guide-localization-service
  ""
  ([] (guide-localization-service nil))
  ([optional-params]
   (:data (guide-localization-service-with-http-info optional-params))))

(defn messaging-user-component-factory-with-http-info
  ""
  ([] (messaging-user-component-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist priority ]}]
   (call-api "/system/console/configMgr/MessagingUserComponentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn messaging-user-component-factory
  ""
  ([] (messaging-user-component-factory nil))
  ([optional-params]
   (:data (messaging-user-component-factory-with-http-info optional-params))))

(defn org-apache-aries-jmx-framework-state-config-with-http-info
  ""
  ([] (org-apache-aries-jmx-framework-state-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist attribute-change-notification-enabled ]}]
   (call-api "/system/console/configMgr/org.apache.aries.jmx.framework.StateConfig" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "attributeChangeNotificationEnabled" attribute-change-notification-enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-aries-jmx-framework-state-config
  ""
  ([] (org-apache-aries-jmx-framework-state-config nil))
  ([optional-params]
   (:data (org-apache-aries-jmx-framework-state-config-with-http-info optional-params))))

(defn org-apache-felix-eventadmin-impl-event-admin-with-http-info
  ""
  ([] (org-apache-felix-eventadmin-impl-event-admin-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapachefelixeventadmin-thread-pool-size orgapachefelixeventadmin-async-to-sync-thread-ratio orgapachefelixeventadmin-timeout orgapachefelixeventadmin-require-topic orgapachefelixeventadmin-ignore-timeout orgapachefelixeventadmin-ignore-topic ]}]
   (call-api "/system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.felix.eventadmin.ThreadPoolSize" orgapachefelixeventadmin-thread-pool-size "org.apache.felix.eventadmin.AsyncToSyncThreadRatio" orgapachefelixeventadmin-async-to-sync-thread-ratio "org.apache.felix.eventadmin.Timeout" orgapachefelixeventadmin-timeout "org.apache.felix.eventadmin.RequireTopic" orgapachefelixeventadmin-require-topic "org.apache.felix.eventadmin.IgnoreTimeout" (with-collection-format orgapachefelixeventadmin-ignore-timeout :multi) "org.apache.felix.eventadmin.IgnoreTopic" (with-collection-format orgapachefelixeventadmin-ignore-topic :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-eventadmin-impl-event-admin
  ""
  ([] (org-apache-felix-eventadmin-impl-event-admin nil))
  ([optional-params]
   (:data (org-apache-felix-eventadmin-impl-event-admin-with-http-info optional-params))))

(defn org-apache-felix-http-with-http-info
  ""
  ([] (org-apache-felix-http-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapachefelixhttphost orgapachefelixhttpenable orgosgiservicehttpport orgapachefelixhttptimeout orgapachefelixhttpsenable orgosgiservicehttpportsecure orgapachefelixhttpskeystore orgapachefelixhttpskeystorepassword orgapachefelixhttpskeystorekeypassword orgapachefelixhttpstruststore orgapachefelixhttpstruststorepassword orgapachefelixhttpsclientcertificate orgapachefelixhttpcontext-path orgapachefelixhttpmbeans orgapachefelixhttpsessiontimeout orgapachefelixhttpjettythreadpoolmax orgapachefelixhttpjettyacceptors orgapachefelixhttpjettyselectors orgapachefelixhttpjettyheader-buffer-size orgapachefelixhttpjettyrequest-buffer-size orgapachefelixhttpjettyresponse-buffer-size orgapachefelixhttpjettymax-form-size orgapachefelixhttppath-exclusions orgapachefelixhttpsjettyciphersuitesexcluded orgapachefelixhttpsjettyciphersuitesincluded orgapachefelixhttpjettysend-server-header orgapachefelixhttpsjettyprotocolsincluded orgapachefelixhttpsjettyprotocolsexcluded orgapachefelixproxyloadbalancerconnectionenable orgapachefelixhttpsjettyrenegotiate-allowed orgapachefelixhttpsjettysessioncookiehttp-only orgapachefelixhttpsjettysessioncookiesecure orgeclipsejettyservlet-session-id-path-parameter-name orgeclipsejettyservlet-checking-remote-session-id-encoding orgeclipsejettyservlet-session-cookie orgeclipsejettyservlet-session-domain orgeclipsejettyservlet-session-path orgeclipsejettyservlet-max-age orgapachefelixhttpname orgapachefelixjettygziphandlerenable orgapachefelixjettygzipmin-gzip-size orgapachefelixjettygzipcompression-level orgapachefelixjettygzipinflate-buffer-size orgapachefelixjettygzipsync-flush orgapachefelixjettygzipexcluded-user-agents orgapachefelixjettygzipincluded-methods orgapachefelixjettygzipexcluded-methods orgapachefelixjettygzipincluded-paths orgapachefelixjettygzipexcluded-paths orgapachefelixjettygzipincluded-mime-types orgapachefelixjettygzipexcluded-mime-types orgapachefelixhttpsessioninvalidate orgapachefelixhttpsessionuniqueid ]}]
   (call-api "/system/console/configMgr/org.apache.felix.http" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.felix.http.host" orgapachefelixhttphost "org.apache.felix.http.enable" orgapachefelixhttpenable "org.osgi.service.http.port" orgosgiservicehttpport "org.apache.felix.http.timeout" orgapachefelixhttptimeout "org.apache.felix.https.enable" orgapachefelixhttpsenable "org.osgi.service.http.port.secure" orgosgiservicehttpportsecure "org.apache.felix.https.keystore" orgapachefelixhttpskeystore "org.apache.felix.https.keystore.password" orgapachefelixhttpskeystorepassword "org.apache.felix.https.keystore.key.password" orgapachefelixhttpskeystorekeypassword "org.apache.felix.https.truststore" orgapachefelixhttpstruststore "org.apache.felix.https.truststore.password" orgapachefelixhttpstruststorepassword "org.apache.felix.https.clientcertificate" orgapachefelixhttpsclientcertificate "org.apache.felix.http.context_path" orgapachefelixhttpcontext-path "org.apache.felix.http.mbeans" orgapachefelixhttpmbeans "org.apache.felix.http.session.timeout" orgapachefelixhttpsessiontimeout "org.apache.felix.http.jetty.threadpool.max" orgapachefelixhttpjettythreadpoolmax "org.apache.felix.http.jetty.acceptors" orgapachefelixhttpjettyacceptors "org.apache.felix.http.jetty.selectors" orgapachefelixhttpjettyselectors "org.apache.felix.http.jetty.headerBufferSize" orgapachefelixhttpjettyheader-buffer-size "org.apache.felix.http.jetty.requestBufferSize" orgapachefelixhttpjettyrequest-buffer-size "org.apache.felix.http.jetty.responseBufferSize" orgapachefelixhttpjettyresponse-buffer-size "org.apache.felix.http.jetty.maxFormSize" orgapachefelixhttpjettymax-form-size "org.apache.felix.http.path_exclusions" (with-collection-format orgapachefelixhttppath-exclusions :multi) "org.apache.felix.https.jetty.ciphersuites.excluded" (with-collection-format orgapachefelixhttpsjettyciphersuitesexcluded :multi) "org.apache.felix.https.jetty.ciphersuites.included" (with-collection-format orgapachefelixhttpsjettyciphersuitesincluded :multi) "org.apache.felix.http.jetty.sendServerHeader" orgapachefelixhttpjettysend-server-header "org.apache.felix.https.jetty.protocols.included" (with-collection-format orgapachefelixhttpsjettyprotocolsincluded :multi) "org.apache.felix.https.jetty.protocols.excluded" (with-collection-format orgapachefelixhttpsjettyprotocolsexcluded :multi) "org.apache.felix.proxy.load.balancer.connection.enable" orgapachefelixproxyloadbalancerconnectionenable "org.apache.felix.https.jetty.renegotiateAllowed" orgapachefelixhttpsjettyrenegotiate-allowed "org.apache.felix.https.jetty.session.cookie.httpOnly" orgapachefelixhttpsjettysessioncookiehttp-only "org.apache.felix.https.jetty.session.cookie.secure" orgapachefelixhttpsjettysessioncookiesecure "org.eclipse.jetty.servlet.SessionIdPathParameterName" orgeclipsejettyservlet-session-id-path-parameter-name "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding" orgeclipsejettyservlet-checking-remote-session-id-encoding "org.eclipse.jetty.servlet.SessionCookie" orgeclipsejettyservlet-session-cookie "org.eclipse.jetty.servlet.SessionDomain" orgeclipsejettyservlet-session-domain "org.eclipse.jetty.servlet.SessionPath" orgeclipsejettyservlet-session-path "org.eclipse.jetty.servlet.MaxAge" orgeclipsejettyservlet-max-age "org.apache.felix.http.name" orgapachefelixhttpname "org.apache.felix.jetty.gziphandler.enable" orgapachefelixjettygziphandlerenable "org.apache.felix.jetty.gzip.minGzipSize" orgapachefelixjettygzipmin-gzip-size "org.apache.felix.jetty.gzip.compressionLevel" orgapachefelixjettygzipcompression-level "org.apache.felix.jetty.gzip.inflateBufferSize" orgapachefelixjettygzipinflate-buffer-size "org.apache.felix.jetty.gzip.syncFlush" orgapachefelixjettygzipsync-flush "org.apache.felix.jetty.gzip.excludedUserAgents" (with-collection-format orgapachefelixjettygzipexcluded-user-agents :multi) "org.apache.felix.jetty.gzip.includedMethods" (with-collection-format orgapachefelixjettygzipincluded-methods :multi) "org.apache.felix.jetty.gzip.excludedMethods" (with-collection-format orgapachefelixjettygzipexcluded-methods :multi) "org.apache.felix.jetty.gzip.includedPaths" (with-collection-format orgapachefelixjettygzipincluded-paths :multi) "org.apache.felix.jetty.gzip.excludedPaths" (with-collection-format orgapachefelixjettygzipexcluded-paths :multi) "org.apache.felix.jetty.gzip.includedMimeTypes" (with-collection-format orgapachefelixjettygzipincluded-mime-types :multi) "org.apache.felix.jetty.gzip.excludedMimeTypes" (with-collection-format orgapachefelixjettygzipexcluded-mime-types :multi) "org.apache.felix.http.session.invalidate" orgapachefelixhttpsessioninvalidate "org.apache.felix.http.session.uniqueid" orgapachefelixhttpsessionuniqueid }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-http
  ""
  ([] (org-apache-felix-http nil))
  ([optional-params]
   (:data (org-apache-felix-http-with-http-info optional-params))))

(defn org-apache-felix-http-sslfilter-ssl-filter-with-http-info
  ""
  ([] (org-apache-felix-http-sslfilter-ssl-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist ssl-forwardheader ssl-forwardvalue ssl-forward-certheader rewriteabsoluteurls ]}]
   (call-api "/system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "ssl-forward.header" ssl-forwardheader "ssl-forward.value" ssl-forwardvalue "ssl-forward-cert.header" ssl-forward-certheader "rewrite.absolute.urls" rewriteabsoluteurls }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-http-sslfilter-ssl-filter
  ""
  ([] (org-apache-felix-http-sslfilter-ssl-filter nil))
  ([optional-params]
   (:data (org-apache-felix-http-sslfilter-ssl-filter-with-http-info optional-params))))

(defn org-apache-felix-jaas-configuration-factory-with-http-info
  ""
  ([] (org-apache-felix-jaas-configuration-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jaascontrol-flag jaasranking jaasrealm-name jaasclassname jaasoptions ]}]
   (call-api "/system/console/configMgr/org.apache.felix.jaas.Configuration.factory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "jaas.controlFlag" jaascontrol-flag "jaas.ranking" jaasranking "jaas.realmName" jaasrealm-name "jaas.classname" jaasclassname "jaas.options" (with-collection-format jaasoptions :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-jaas-configuration-factory
  ""
  ([] (org-apache-felix-jaas-configuration-factory nil))
  ([optional-params]
   (:data (org-apache-felix-jaas-configuration-factory-with-http-info optional-params))))

(defn org-apache-felix-jaas-configuration-spi-with-http-info
  ""
  ([] (org-apache-felix-jaas-configuration-spi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jaasdefault-realm-name jaasconfig-provider-name jaasglobal-config-policy ]}]
   (call-api "/system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "jaas.defaultRealmName" jaasdefault-realm-name "jaas.configProviderName" jaasconfig-provider-name "jaas.globalConfigPolicy" jaasglobal-config-policy }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-jaas-configuration-spi
  ""
  ([] (org-apache-felix-jaas-configuration-spi nil))
  ([optional-params]
   (:data (org-apache-felix-jaas-configuration-spi-with-http-info optional-params))))

(defn org-apache-felix-scr-scr-service-with-http-info
  ""
  ([] (org-apache-felix-scr-scr-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist dsloglevel dsfactoryenabled dsdelayedkeep-instances dslocktimeoutmilliseconds dsstoptimeoutmilliseconds dsglobalextender ]}]
   (call-api "/system/console/configMgr/org.apache.felix.scr.ScrService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "ds.loglevel" dsloglevel "ds.factory.enabled" dsfactoryenabled "ds.delayed.keepInstances" dsdelayedkeep-instances "ds.lock.timeout.milliseconds" dslocktimeoutmilliseconds "ds.stop.timeout.milliseconds" dsstoptimeoutmilliseconds "ds.global.extender" dsglobalextender }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-scr-scr-service
  ""
  ([] (org-apache-felix-scr-scr-service nil))
  ([optional-params]
   (:data (org-apache-felix-scr-scr-service-with-http-info optional-params))))

(defn org-apache-felix-systemready-impl-components-check-with-http-info
  ""
  ([] (org-apache-felix-systemready-impl-components-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist componentslist type ]}]
   (call-api "/system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "components.list" (with-collection-format componentslist :multi) "type" type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-systemready-impl-components-check
  ""
  ([] (org-apache-felix-systemready-impl-components-check nil))
  ([optional-params]
   (:data (org-apache-felix-systemready-impl-components-check-with-http-info optional-params))))

(defn org-apache-felix-systemready-impl-framework-start-check-with-http-info
  ""
  ([] (org-apache-felix-systemready-impl-framework-start-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist timeout targetstartlevel targetstartlevelpropname type ]}]
   (call-api "/system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "timeout" timeout "target.start.level" targetstartlevel "target.start.level.prop.name" targetstartlevelpropname "type" type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-systemready-impl-framework-start-check
  ""
  ([] (org-apache-felix-systemready-impl-framework-start-check nil))
  ([optional-params]
   (:data (org-apache-felix-systemready-impl-framework-start-check-with-http-info optional-params))))

(defn org-apache-felix-systemready-impl-services-check-with-http-info
  ""
  ([] (org-apache-felix-systemready-impl-services-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceslist type ]}]
   (call-api "/system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "services.list" (with-collection-format serviceslist :multi) "type" type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-systemready-impl-services-check
  ""
  ([] (org-apache-felix-systemready-impl-services-check nil))
  ([optional-params]
   (:data (org-apache-felix-systemready-impl-services-check-with-http-info optional-params))))

(defn org-apache-felix-systemready-impl-servlet-system-alive-servlet-with-http-info
  ""
  ([] (org-apache-felix-systemready-impl-servlet-system-alive-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist osgihttpwhiteboardservletpattern osgihttpwhiteboardcontextselect ]}]
   (call-api "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "osgi.http.whiteboard.servlet.pattern" osgihttpwhiteboardservletpattern "osgi.http.whiteboard.context.select" osgihttpwhiteboardcontextselect }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-systemready-impl-servlet-system-alive-servlet
  ""
  ([] (org-apache-felix-systemready-impl-servlet-system-alive-servlet nil))
  ([optional-params]
   (:data (org-apache-felix-systemready-impl-servlet-system-alive-servlet-with-http-info optional-params))))

(defn org-apache-felix-systemready-impl-servlet-system-ready-servlet-with-http-info
  ""
  ([] (org-apache-felix-systemready-impl-servlet-system-ready-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist osgihttpwhiteboardservletpattern osgihttpwhiteboardcontextselect ]}]
   (call-api "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "osgi.http.whiteboard.servlet.pattern" osgihttpwhiteboardservletpattern "osgi.http.whiteboard.context.select" osgihttpwhiteboardcontextselect }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-systemready-impl-servlet-system-ready-servlet
  ""
  ([] (org-apache-felix-systemready-impl-servlet-system-ready-servlet nil))
  ([optional-params]
   (:data (org-apache-felix-systemready-impl-servlet-system-ready-servlet-with-http-info optional-params))))

(defn org-apache-felix-systemready-system-ready-monitor-with-http-info
  ""
  ([] (org-apache-felix-systemready-system-ready-monitor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pollinterval ]}]
   (call-api "/system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "poll.interval" pollinterval }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-systemready-system-ready-monitor
  ""
  ([] (org-apache-felix-systemready-system-ready-monitor nil))
  ([optional-params]
   (:data (org-apache-felix-systemready-system-ready-monitor-with-http-info optional-params))))

(defn org-apache-felix-webconsole-internal-servlet-osgi-manager-with-http-info
  ""
  ([] (org-apache-felix-webconsole-internal-servlet-osgi-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist managerroot httpservicefilter defaultrender realm username password category locale loglevel plugins ]}]
   (call-api "/system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "manager.root" managerroot "http.service.filter" httpservicefilter "default.render" defaultrender "realm" realm "username" username "password" password "category" category "locale" locale "loglevel" loglevel "plugins" plugins }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-webconsole-internal-servlet-osgi-manager
  ""
  ([] (org-apache-felix-webconsole-internal-servlet-osgi-manager nil))
  ([optional-params]
   (:data (org-apache-felix-webconsole-internal-servlet-osgi-manager-with-http-info optional-params))))

(defn org-apache-felix-webconsole-plugins-event-internal-plugin-servlet-with-http-info
  ""
  ([] (org-apache-felix-webconsole-plugins-event-internal-plugin-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist maxsize ]}]
   (call-api "/system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "max.size" maxsize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-webconsole-plugins-event-internal-plugin-servlet
  ""
  ([] (org-apache-felix-webconsole-plugins-event-internal-plugin-servlet nil))
  ([optional-params]
   (:data (org-apache-felix-webconsole-plugins-event-internal-plugin-servlet-with-http-info optional-params))))

(defn org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-with-http-info
  ""
  ([] (org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-with-http-info nil))
  ([{:keys [post apply delete action location propertylist felixmemoryusagedumpthreshold felixmemoryusagedumpinterval felixmemoryusagedumplocation ]}]
   (call-api "/system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "felix.memoryusage.dump.threshold" felixmemoryusagedumpthreshold "felix.memoryusage.dump.interval" felixmemoryusagedumpinterval "felix.memoryusage.dump.location" felixmemoryusagedumplocation }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co
  ""
  ([] (org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co nil))
  ([optional-params]
   (:data (org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-with-http-info optional-params))))

(defn org-apache-http-proxyconfigurator-with-http-info
  ""
  ([] (org-apache-http-proxyconfigurator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist proxyenabled proxyhost proxyport proxyuser proxypassword proxyexceptions ]}]
   (call-api "/system/console/configMgr/org.apache.http.proxyconfigurator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "proxy.enabled" proxyenabled "proxy.host" proxyhost "proxy.port" proxyport "proxy.user" proxyuser "proxy.password" proxypassword "proxy.exceptions" (with-collection-format proxyexceptions :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-http-proxyconfigurator
  ""
  ([] (org-apache-http-proxyconfigurator nil))
  ([optional-params]
   (:data (org-apache-http-proxyconfigurator-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-blob-datastore-data-store-text-provider-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-blob-datastore-data-store-text-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist dir ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "dir" dir }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-blob-datastore-data-store-text-provider
  ""
  ([] (org-apache-jackrabbit-oak-plugins-blob-datastore-data-store-text-provider nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-blob-datastore-data-store-text-provider-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store
  ""
  ([] (org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-document-document-node-store-service-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-document-document-node-store-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mongouri db socket-keep-alive cache node-cache-percentage prev-doc-cache-percentage children-cache-percentage diff-cache-percentage cache-segment-count cache-stack-move-distance blob-cache-size persistent-cache journal-cache custom-blob-store journal-gc-interval journal-gc-max-age prefetch-external-changes role version-gc-max-age-in-secs version-gc-expression version-gc-time-limit-in-secs blob-gc-max-age-in-secs blob-track-snapshot-interval-in-secs repositoryhome max-replication-lag-in-secs document-store-type bundling-disabled update-limit persistent-cache-includes lease-check-mode ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mongouri" mongouri "db" db "socketKeepAlive" socket-keep-alive "cache" cache "nodeCachePercentage" node-cache-percentage "prevDocCachePercentage" prev-doc-cache-percentage "childrenCachePercentage" children-cache-percentage "diffCachePercentage" diff-cache-percentage "cacheSegmentCount" cache-segment-count "cacheStackMoveDistance" cache-stack-move-distance "blobCacheSize" blob-cache-size "persistentCache" persistent-cache "journalCache" journal-cache "customBlobStore" custom-blob-store "journalGCInterval" journal-gc-interval "journalGCMaxAge" journal-gc-max-age "prefetchExternalChanges" prefetch-external-changes "role" role "versionGcMaxAgeInSecs" version-gc-max-age-in-secs "versionGCExpression" version-gc-expression "versionGCTimeLimitInSecs" version-gc-time-limit-in-secs "blobGcMaxAgeInSecs" blob-gc-max-age-in-secs "blobTrackSnapshotIntervalInSecs" blob-track-snapshot-interval-in-secs "repository.home" repositoryhome "maxReplicationLagInSecs" max-replication-lag-in-secs "documentStoreType" document-store-type "bundlingDisabled" bundling-disabled "updateLimit" update-limit "persistentCacheIncludes" (with-collection-format persistent-cache-includes :multi) "leaseCheckMode" lease-check-mode }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-document-document-node-store-service
  ""
  ([] (org-apache-jackrabbit-oak-plugins-document-document-node-store-service nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-document-document-node-store-service-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-with-http-info nil))
  ([{:keys [post apply delete action location propertylist persistent-cache-includes ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "persistentCacheIncludes" (with-collection-format persistent-cache-includes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre
  ""
  ([] (org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac-with-http-info nil))
  ([{:keys [post apply delete action location propertylist included-paths enable-async-observer observer-queue-size ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "includedPaths" (with-collection-format included-paths :multi) "enableAsyncObserver" enable-async-observer "observerQueueSize" observer-queue-size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac
  ""
  ([] (org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-index-async-indexer-service-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-async-indexer-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist async-configs lease-time-out-minutes failing-index-timeout-seconds error-warn-interval-seconds ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "asyncConfigs" (with-collection-format async-configs :multi) "leaseTimeOutMinutes" lease-time-out-minutes "failingIndexTimeoutSeconds" failing-index-timeout-seconds "errorWarnIntervalSeconds" error-warn-interval-seconds }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-index-async-indexer-service
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-async-indexer-service nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-index-async-indexer-service-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-with-http-info nil))
  ([{:keys [post apply delete action location propertylist disabled debug local-index-dir enable-open-index-async thread-pool-size prefetch-index-files extracted-text-cache-size-in-mb extracted-text-cache-expiry-in-secs always-use-pre-extracted-cache boolean-clause-limit enable-hybrid-indexing hybrid-queue-size disable-stored-index-definition deleted-blobs-collection-enabled prop-index-cleaner-interval-in-secs enable-single-blob-index-files ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "disabled" disabled "debug" debug "localIndexDir" local-index-dir "enableOpenIndexAsync" enable-open-index-async "threadPoolSize" thread-pool-size "prefetchIndexFiles" prefetch-index-files "extractedTextCacheSizeInMB" extracted-text-cache-size-in-mb "extractedTextCacheExpiryInSecs" extracted-text-cache-expiry-in-secs "alwaysUsePreExtractedCache" always-use-pre-extracted-cache "booleanClauseLimit" boolean-clause-limit "enableHybridIndexing" enable-hybrid-indexing "hybridQueueSize" hybrid-queue-size "disableStoredIndexDefinition" disable-stored-index-definition "deletedBlobsCollectionEnabled" deleted-blobs-collection-enabled "propIndexCleanerIntervalInSecs" prop-index-cleaner-interval-in-secs "enableSingleBlobIndexFiles" enable-single-blob-index-files }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co-with-http-info nil))
  ([{:keys [post apply delete action location propertylist solrhomepath solrcorename ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "solr.home.path" solrhomepath "solr.core.name" solrcorename }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pathdescfield pathchildfield pathparentfield pathexactfield catchallfield collapsedpathfield pathdepthfield commitpolicy rows pathrestrictions propertyrestrictions primarytypesrestrictions ignoredproperties usedproperties typemappings propertymappings collapsejcrcontentnodes ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path.desc.field" pathdescfield "path.child.field" pathchildfield "path.parent.field" pathparentfield "path.exact.field" pathexactfield "catch.all.field" catchallfield "collapsed.path.field" collapsedpathfield "path.depth.field" pathdepthfield "commit.policy" commitpolicy "rows" rows "path.restrictions" pathrestrictions "property.restrictions" propertyrestrictions "primarytypes.restrictions" primarytypesrestrictions "ignored.properties" (with-collection-format ignoredproperties :multi) "used.properties" (with-collection-format usedproperties :multi) "type.mappings" (with-collection-format typemappings :multi) "property.mappings" (with-collection-format propertymappings :multi) "collapse.jcrcontent.nodes" collapsejcrcontentnodes }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf-with-http-info nil))
  ([{:keys [post apply delete action location propertylist solrhttpurl solrzkhost solrcollection solrsockettimeout solrconnectiontimeout solrshardsno solrreplicationfactor solrconfdir ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "solr.http.url" solrhttpurl "solr.zk.host" solrzkhost "solr.collection" solrcollection "solr.socket.timeout" solrsockettimeout "solr.connection.timeout" solrconnectiontimeout "solr.shards.no" solrshardsno "solr.replication.factor" solrreplicationfactor "solr.conf.dir" solrconfdir }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-query-index-provid-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-query-index-provid-with-http-info nil))
  ([{:keys [post apply delete action location propertylist queryaggregation ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "query.aggregation" queryaggregation }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-query-index-provid
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-query-index-provid nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-query-index-provid-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se-with-http-info nil))
  ([{:keys [post apply delete action location propertylist servertype ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "server.type" servertype }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se
  ""
  ([] (org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist provider-type ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "providerType" provider-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory
  ""
  ([] (org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-plugins-observation-change-collector-provider-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-plugins-observation-change-collector-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist max-items max-path-depth enabled ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "maxItems" max-items "maxPathDepth" max-path-depth "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-plugins-observation-change-collector-provider
  ""
  ([] (org-apache-jackrabbit-oak-plugins-observation-change-collector-provider nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-plugins-observation-change-collector-provider-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-query-query-engine-settings-service-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-query-query-engine-settings-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist query-limit-in-memory query-limit-reads query-fail-traversal fast-query-size ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "queryLimitInMemory" query-limit-in-memory "queryLimitReads" query-limit-reads "queryFailTraversal" query-fail-traversal "fastQuerySize" fast-query-size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-query-query-engine-settings-service
  ""
  ([] (org-apache-jackrabbit-oak-query-query-engine-settings-service nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-query-query-engine-settings-service-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-security-authentication-authentication-config-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-security-authentication-authentication-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapachejackrabbitoakauthenticationapp-name orgapachejackrabbitoakauthenticationconfig-spi-name ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.jackrabbit.oak.authentication.appName" orgapachejackrabbitoakauthenticationapp-name "org.apache.jackrabbit.oak.authentication.configSpiName" orgapachejackrabbitoakauthenticationconfig-spi-name }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-security-authentication-authentication-config
  ""
  ([] (org-apache-jackrabbit-oak-security-authentication-authentication-config nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-security-authentication-authentication-config-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist providername hostname hostport hostssl hosttls hostno-cert-check binddn bindpassword search-timeout admin-poolmax-active admin-poollookup-on-validate user-poolmax-active user-poollookup-on-validate userbase-dn userobjectclass userid-attribute userextra-filter usermake-dn-path groupbase-dn groupobjectclass groupname-attribute groupextra-filter groupmake-dn-path groupmember-attribute use-uid-for-ext-id customattributes ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "provider.name" providername "host.name" hostname "host.port" hostport "host.ssl" hostssl "host.tls" hosttls "host.noCertCheck" hostno-cert-check "bind.dn" binddn "bind.password" bindpassword "searchTimeout" search-timeout "adminPool.maxActive" admin-poolmax-active "adminPool.lookupOnValidate" admin-poollookup-on-validate "userPool.maxActive" user-poolmax-active "userPool.lookupOnValidate" user-poollookup-on-validate "user.baseDN" userbase-dn "user.objectclass" (with-collection-format userobjectclass :multi) "user.idAttribute" userid-attribute "user.extraFilter" userextra-filter "user.makeDnPath" usermake-dn-path "group.baseDN" groupbase-dn "group.objectclass" (with-collection-format groupobjectclass :multi) "group.nameAttribute" groupname-attribute "group.extraFilter" groupextra-filter "group.makeDnPath" groupmake-dn-path "group.memberAttribute" groupmember-attribute "useUidForExtId" use-uid-for-ext-id "customattributes" (with-collection-format customattributes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi
  ""
  ([] (org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-security-authentication-token-token-configura-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-security-authentication-token-token-configura-with-http-info nil))
  ([{:keys [post apply delete action location propertylist token-expiration token-length token-refresh token-cleanup-threshold password-hash-algorithm password-hash-iterations password-salt-size ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "tokenExpiration" token-expiration "tokenLength" token-length "tokenRefresh" token-refresh "tokenCleanupThreshold" token-cleanup-threshold "passwordHashAlgorithm" password-hash-algorithm "passwordHashIterations" password-hash-iterations "passwordSaltSize" password-salt-size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-security-authentication-token-token-configura
  ""
  ([] (org-apache-jackrabbit-oak-security-authentication-token-token-configura nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-security-authentication-token-token-configura-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-security-authorization-authorization-configur-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-security-authorization-authorization-configur-with-http-info nil))
  ([{:keys [post apply delete action location propertylist permissions-jr2 import-behavior read-paths administrative-principals configuration-ranking ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "permissionsJr2" permissions-jr2 "importBehavior" import-behavior "readPaths" (with-collection-format read-paths :multi) "administrativePrincipals" (with-collection-format administrative-principals :multi) "configurationRanking" configuration-ranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-security-authorization-authorization-configur
  ""
  ([] (org-apache-jackrabbit-oak-security-authorization-authorization-configur nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-security-authorization-authorization-configur-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-security-internal-security-provider-registrati-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-security-internal-security-provider-registrati-with-http-info nil))
  ([{:keys [post apply delete action location propertylist required-service-pids authorization-composition-type ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "requiredServicePids" (with-collection-format required-service-pids :multi) "authorizationCompositionType" authorization-composition-type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-security-internal-security-provider-registrati
  ""
  ([] (org-apache-jackrabbit-oak-security-internal-security-provider-registrati nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-security-internal-security-provider-registrati-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-with-http-info nil))
  ([{:keys [post apply delete action location propertylist length ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "length" length }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-security-user-random-authorizable-node-name
  ""
  ([] (org-apache-jackrabbit-oak-security-user-random-authorizable-node-name nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-security-user-user-configuration-impl-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-security-user-user-configuration-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist users-path groups-path system-relative-path default-depth import-behavior password-hash-algorithm password-hash-iterations password-salt-size omit-admin-pw support-auto-save password-max-age initial-password-change password-history-size password-expiry-for-admin cache-expiration enable-rfc7613-usercase-mapped-profile ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "usersPath" users-path "groupsPath" groups-path "systemRelativePath" system-relative-path "defaultDepth" default-depth "importBehavior" import-behavior "passwordHashAlgorithm" password-hash-algorithm "passwordHashIterations" password-hash-iterations "passwordSaltSize" password-salt-size "omitAdminPw" omit-admin-pw "supportAutoSave" support-auto-save "passwordMaxAge" password-max-age "initialPasswordChange" initial-password-change "passwordHistorySize" password-history-size "passwordExpiryForAdmin" password-expiry-for-admin "cacheExpiration" cache-expiration "enableRFC7613UsercaseMappedProfile" enable-rfc7613-usercase-mapped-profile }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-security-user-user-configuration-impl
  ""
  ([] (org-apache-jackrabbit-oak-security-user-user-configuration-impl nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-security-user-user-configuration-impl-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist account-name container-name access-key root-path connection-url ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "accountName" account-name "containerName" container-name "accessKey" access-key "rootPath" root-path "connectionURL" connection-url }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service
  ""
  ([] (org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-segment-segment-node-store-factory-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-segment-segment-node-store-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist repositoryhome tarmkmode tarmksize segment-cachesize string-cachesize template-cachesize string-deduplication-cachesize template-deduplication-cachesize node-deduplication-cachesize pause-compaction compactionretry-count compactionforcetimeout compactionsize-delta-estimation compactiondisable-estimation compactionretained-generations compactionmemory-threshold compactionprogress-log standby custom-blob-store custom-segment-store split-persistence repositorybackupdir blob-gc-max-age-in-secs blob-track-snapshot-interval-in-secs role register-descriptors dispatch-changes ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "repository.home" repositoryhome "tarmk.mode" tarmkmode "tarmk.size" tarmksize "segmentCache.size" segment-cachesize "stringCache.size" string-cachesize "templateCache.size" template-cachesize "stringDeduplicationCache.size" string-deduplication-cachesize "templateDeduplicationCache.size" template-deduplication-cachesize "nodeDeduplicationCache.size" node-deduplication-cachesize "pauseCompaction" pause-compaction "compaction.retryCount" compactionretry-count "compaction.force.timeout" compactionforcetimeout "compaction.sizeDeltaEstimation" compactionsize-delta-estimation "compaction.disableEstimation" compactiondisable-estimation "compaction.retainedGenerations" compactionretained-generations "compaction.memoryThreshold" compactionmemory-threshold "compaction.progressLog" compactionprogress-log "standby" standby "customBlobStore" custom-blob-store "customSegmentStore" custom-segment-store "splitPersistence" split-persistence "repository.backup.dir" repositorybackupdir "blobGcMaxAgeInSecs" blob-gc-max-age-in-secs "blobTrackSnapshotIntervalInSecs" blob-track-snapshot-interval-in-secs "role" role "registerDescriptors" register-descriptors "dispatchChanges" dispatch-changes }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-segment-segment-node-store-factory
  ""
  ([] (org-apache-jackrabbit-oak-segment-segment-node-store-factory nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-segment-segment-node-store-factory-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist commits-tracker-writer-groups ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "commitsTrackerWriterGroups" (with-collection-format commits-tracker-writer-groups :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service
  ""
  ([] (org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-segment-segment-node-store-monitor-service-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-segment-segment-node-store-service-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-segment-segment-node-store-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist repositoryhome tarmkmode tarmksize segment-cachesize string-cachesize template-cachesize string-deduplication-cachesize template-deduplication-cachesize node-deduplication-cachesize pause-compaction compactionretry-count compactionforcetimeout compactionsize-delta-estimation compactiondisable-estimation compactionretained-generations compactionmemory-threshold compactionprogress-log standby custom-blob-store custom-segment-store split-persistence repositorybackupdir blob-gc-max-age-in-secs blob-track-snapshot-interval-in-secs ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "repository.home" repositoryhome "tarmk.mode" tarmkmode "tarmk.size" tarmksize "segmentCache.size" segment-cachesize "stringCache.size" string-cachesize "templateCache.size" template-cachesize "stringDeduplicationCache.size" string-deduplication-cachesize "templateDeduplicationCache.size" template-deduplication-cachesize "nodeDeduplicationCache.size" node-deduplication-cachesize "pauseCompaction" pause-compaction "compaction.retryCount" compactionretry-count "compaction.force.timeout" compactionforcetimeout "compaction.sizeDeltaEstimation" compactionsize-delta-estimation "compaction.disableEstimation" compactiondisable-estimation "compaction.retainedGenerations" compactionretained-generations "compaction.memoryThreshold" compactionmemory-threshold "compaction.progressLog" compactionprogress-log "standby" standby "customBlobStore" custom-blob-store "customSegmentStore" custom-segment-store "splitPersistence" split-persistence "repository.backup.dir" repositorybackupdir "blobGcMaxAgeInSecs" blob-gc-max-age-in-secs "blobTrackSnapshotIntervalInSecs" blob-track-snapshot-interval-in-secs }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-segment-segment-node-store-service
  ""
  ([] (org-apache-jackrabbit-oak-segment-segment-node-store-service nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-segment-segment-node-store-service-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-segment-standby-store-standby-store-service-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-segment-standby-store-standby-store-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslinginstallerconfigurationpersist mode port primaryhost interval primaryallowed-client-ip-ranges secure standbyreadtimeout standbyautoclean ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.installer.configuration.persist" orgapacheslinginstallerconfigurationpersist "mode" mode "port" port "primary.host" primaryhost "interval" interval "primary.allowed-client-ip-ranges" (with-collection-format primaryallowed-client-ip-ranges :multi) "secure" secure "standby.readtimeout" standbyreadtimeout "standby.autoclean" standbyautoclean }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-segment-standby-store-standby-store-service
  ""
  ([] (org-apache-jackrabbit-oak-segment-standby-store-standby-store-service nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-segment-standby-store-standby-store-service-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de-with-http-info nil))
  ([{:keys [post apply delete action location propertylist handlername userexpiration-time userauto-membership userproperty-mapping userpath-prefix usermembership-exp-time usermembership-nesting-depth userdynamic-membership userdisable-missing groupexpiration-time groupauto-membership groupproperty-mapping grouppath-prefix enable-rfc7613-usercase-mapped-profile ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "handler.name" handlername "user.expirationTime" userexpiration-time "user.autoMembership" (with-collection-format userauto-membership :multi) "user.propertyMapping" (with-collection-format userproperty-mapping :multi) "user.pathPrefix" userpath-prefix "user.membershipExpTime" usermembership-exp-time "user.membershipNestingDepth" usermembership-nesting-depth "user.dynamicMembership" userdynamic-membership "user.disableMissing" userdisable-missing "group.expirationTime" groupexpiration-time "group.autoMembership" (with-collection-format groupauto-membership :multi) "group.propertyMapping" (with-collection-format groupproperty-mapping :multi) "group.pathPrefix" grouppath-prefix "enableRFC7613UsercaseMappedProfile" enable-rfc7613-usercase-mapped-profile }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jaasranking jaascontrol-flag jaasrealm-name idpname synchandler-name ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "jaas.ranking" jaasranking "jaas.controlFlag" jaascontrol-flag "jaas.realmName" jaasrealm-name "idp.name" idpname "sync.handlerName" synchandler-name }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-spi-security-authentication-external-impl-pr-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-pr-with-http-info nil))
  ([{:keys [post apply delete action location propertylist protect-external-id ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "protectExternalId" protect-external-id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-spi-security-authentication-external-impl-pr
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-pr nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-spi-security-authentication-external-impl-pr-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist cug-supported-paths cug-enabled configuration-ranking ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "cugSupportedPaths" (with-collection-format cug-supported-paths :multi) "cugEnabled" cug-enabled "configurationRanking" configuration-ranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu-with-http-info nil))
  ([{:keys [post apply delete action location propertylist principal-names ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "principalNames" (with-collection-format principal-names :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu-with-http-info optional-params))))

(defn org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable-with-http-info
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled-actions user-privilege-names group-privilege-names constraint ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabledActions" enabled-actions "userPrivilegeNames" (with-collection-format user-privilege-names :multi) "groupPrivilegeNames" (with-collection-format group-privilege-names :multi) "constraint" constraint }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable
  ""
  ([] (org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable-with-http-info optional-params))))

(defn org-apache-jackrabbit-vault-packaging-impl-packaging-impl-with-http-info
  ""
  ([] (org-apache-jackrabbit-vault-packaging-impl-packaging-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist package-roots ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "packageRoots" (with-collection-format package-roots :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-vault-packaging-impl-packaging-impl
  ""
  ([] (org-apache-jackrabbit-vault-packaging-impl-packaging-impl nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-vault-packaging-impl-packaging-impl-with-http-info optional-params))))

(defn org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry-with-http-info
  ""
  ([] (org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry-with-http-info nil))
  ([{:keys [post apply delete action location propertylist home-path ]}]
   (call-api "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "homePath" home-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry
  ""
  ([] (org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry nil))
  ([optional-params]
   (:data (org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry-with-http-info optional-params))))

(defn org-apache-sling-auth-core-impl-logout-servlet-with-http-info
  ""
  ([] (org-apache-sling-auth-core-impl-logout-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletmethods slingservletpaths ]}]
   (call-api "/system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.methods" (with-collection-format slingservletmethods :multi) "sling.servlet.paths" slingservletpaths }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-auth-core-impl-logout-servlet
  ""
  ([] (org-apache-sling-auth-core-impl-logout-servlet nil))
  ([optional-params]
   (:data (org-apache-sling-auth-core-impl-logout-servlet-with-http-info optional-params))))

(defn org-apache-sling-caconfig-impl-configuration-bindings-value-provider-with-http-info
  ""
  ([] (org-apache-sling-caconfig-impl-configuration-bindings-value-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-impl-configuration-bindings-value-provider
  ""
  ([] (org-apache-sling-caconfig-impl-configuration-bindings-value-provider nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-impl-configuration-bindings-value-provider-with-http-info optional-params))))

(defn org-apache-sling-caconfig-impl-configuration-resolver-impl-with-http-info
  ""
  ([] (org-apache-sling-caconfig-impl-configuration-resolver-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist config-bucket-names ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "configBucketNames" (with-collection-format config-bucket-names :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-impl-configuration-resolver-impl
  ""
  ([] (org-apache-sling-caconfig-impl-configuration-resolver-impl nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-impl-configuration-resolver-impl-with-http-info optional-params))))

(defn org-apache-sling-caconfig-impl-def-default-configuration-inheritance-stra-with-http-info
  ""
  ([] (org-apache-sling-caconfig-impl-def-default-configuration-inheritance-stra-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled config-property-inheritance-property-names ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "configPropertyInheritancePropertyNames" (with-collection-format config-property-inheritance-property-names :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-impl-def-default-configuration-inheritance-stra
  ""
  ([] (org-apache-sling-caconfig-impl-def-default-configuration-inheritance-stra nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-impl-def-default-configuration-inheritance-stra-with-http-info optional-params))))

(defn org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-with-http-info
  ""
  ([] (org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra
  ""
  ([] (org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-with-http-info optional-params))))

(defn org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi-with-http-info
  ""
  ([] (org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist description overrides enabled serviceranking ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "description" description "overrides" (with-collection-format overrides :multi) "enabled" enabled "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi
  ""
  ([] (org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi-with-http-info optional-params))))

(defn org-apache-sling-caconfig-impl-override-system-property-configuration-ove-with-http-info
  ""
  ([] (org-apache-sling-caconfig-impl-override-system-property-configuration-ove-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled serviceranking ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-impl-override-system-property-configuration-ove
  ""
  ([] (org-apache-sling-caconfig-impl-override-system-property-configuration-ove nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-impl-override-system-property-configuration-ove-with-http-info optional-params))))

(defn org-apache-sling-caconfig-management-impl-configuration-management-setti-with-http-info
  ""
  ([] (org-apache-sling-caconfig-management-impl-configuration-management-setti-with-http-info nil))
  ([{:keys [post apply delete action location propertylist ignore-property-name-regex config-collection-properties-resource-names ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "ignorePropertyNameRegex" (with-collection-format ignore-property-name-regex :multi) "configCollectionPropertiesResourceNames" (with-collection-format config-collection-properties-resource-names :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-management-impl-configuration-management-setti
  ""
  ([] (org-apache-sling-caconfig-management-impl-configuration-management-setti nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-management-impl-configuration-management-setti-with-http-info optional-params))))

(defn org-apache-sling-caconfig-resource-impl-def-default-configuration-resour-with-http-info
  ""
  ([] (org-apache-sling-caconfig-resource-impl-def-default-configuration-resour-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled config-path fallback-paths config-collection-inheritance-property-names ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "configPath" config-path "fallbackPaths" (with-collection-format fallback-paths :multi) "configCollectionInheritancePropertyNames" (with-collection-format config-collection-inheritance-property-names :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-resource-impl-def-default-configuration-resour
  ""
  ([] (org-apache-sling-caconfig-resource-impl-def-default-configuration-resour nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-resource-impl-def-default-configuration-resour-with-http-info optional-params))))

(defn org-apache-sling-caconfig-resource-impl-def-default-context-path-strategy-with-http-info
  ""
  ([] (org-apache-sling-caconfig-resource-impl-def-default-context-path-strategy-with-http-info nil))
  ([{:keys [post apply delete action location propertylist enabled config-ref-resource-names config-ref-property-names serviceranking ]}]
   (call-api "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "enabled" enabled "configRefResourceNames" (with-collection-format config-ref-resource-names :multi) "configRefPropertyNames" (with-collection-format config-ref-property-names :multi) "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-caconfig-resource-impl-def-default-context-path-strategy
  ""
  ([] (org-apache-sling-caconfig-resource-impl-def-default-context-path-strategy nil))
  ([optional-params]
   (:data (org-apache-sling-caconfig-resource-impl-def-default-context-path-strategy-with-http-info optional-params))))

(defn org-apache-sling-commons-html-internal-tagsoup-html-parser-with-http-info
  ""
  ([] (org-apache-sling-commons-html-internal-tagsoup-html-parser-with-http-info nil))
  ([{:keys [post apply delete action location propertylist parserfeatures ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "parser.features" (with-collection-format parserfeatures :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-html-internal-tagsoup-html-parser
  ""
  ([] (org-apache-sling-commons-html-internal-tagsoup-html-parser nil))
  ([optional-params]
   (:data (org-apache-sling-commons-html-internal-tagsoup-html-parser-with-http-info optional-params))))

(defn org-apache-sling-commons-log-log-manager-with-http-info
  ""
  ([] (org-apache-sling-commons-log-log-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslingcommonsloglevel orgapacheslingcommonslogfile orgapacheslingcommonslogfilenumber orgapacheslingcommonslogfilesize orgapacheslingcommonslogpattern orgapacheslingcommonslogconfiguration-file orgapacheslingcommonslogpackaging-data-enabled orgapacheslingcommonslogmax-caller-data-depth orgapacheslingcommonslogmax-old-file-count-in-dump orgapacheslingcommonslognum-of-lines ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.log.LogManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.commons.log.level" orgapacheslingcommonsloglevel "org.apache.sling.commons.log.file" orgapacheslingcommonslogfile "org.apache.sling.commons.log.file.number" orgapacheslingcommonslogfilenumber "org.apache.sling.commons.log.file.size" orgapacheslingcommonslogfilesize "org.apache.sling.commons.log.pattern" orgapacheslingcommonslogpattern "org.apache.sling.commons.log.configurationFile" orgapacheslingcommonslogconfiguration-file "org.apache.sling.commons.log.packagingDataEnabled" orgapacheslingcommonslogpackaging-data-enabled "org.apache.sling.commons.log.maxCallerDataDepth" orgapacheslingcommonslogmax-caller-data-depth "org.apache.sling.commons.log.maxOldFileCountInDump" orgapacheslingcommonslogmax-old-file-count-in-dump "org.apache.sling.commons.log.numOfLines" orgapacheslingcommonslognum-of-lines }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-log-log-manager
  ""
  ([] (org-apache-sling-commons-log-log-manager nil))
  ([optional-params]
   (:data (org-apache-sling-commons-log-log-manager-with-http-info optional-params))))

(defn org-apache-sling-commons-log-log-manager-factory-config-with-http-info
  ""
  ([] (org-apache-sling-commons-log-log-manager-factory-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslingcommonsloglevel orgapacheslingcommonslogfile orgapacheslingcommonslogpattern orgapacheslingcommonslognames orgapacheslingcommonslogadditiv ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.commons.log.level" orgapacheslingcommonsloglevel "org.apache.sling.commons.log.file" orgapacheslingcommonslogfile "org.apache.sling.commons.log.pattern" orgapacheslingcommonslogpattern "org.apache.sling.commons.log.names" (with-collection-format orgapacheslingcommonslognames :multi) "org.apache.sling.commons.log.additiv" orgapacheslingcommonslogadditiv }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-log-log-manager-factory-config
  ""
  ([] (org-apache-sling-commons-log-log-manager-factory-config nil))
  ([optional-params]
   (:data (org-apache-sling-commons-log-log-manager-factory-config-with-http-info optional-params))))

(defn org-apache-sling-commons-log-log-manager-factory-writer-with-http-info
  ""
  ([] (org-apache-sling-commons-log-log-manager-factory-writer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslingcommonslogfile orgapacheslingcommonslogfilenumber orgapacheslingcommonslogfilesize orgapacheslingcommonslogfilebuffered ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.commons.log.file" orgapacheslingcommonslogfile "org.apache.sling.commons.log.file.number" orgapacheslingcommonslogfilenumber "org.apache.sling.commons.log.file.size" orgapacheslingcommonslogfilesize "org.apache.sling.commons.log.file.buffered" orgapacheslingcommonslogfilebuffered }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-log-log-manager-factory-writer
  ""
  ([] (org-apache-sling-commons-log-log-manager-factory-writer nil))
  ([optional-params]
   (:data (org-apache-sling-commons-log-log-manager-factory-writer-with-http-info optional-params))))

(defn org-apache-sling-commons-metrics-internal-log-reporter-with-http-info
  ""
  ([] (org-apache-sling-commons-metrics-internal-log-reporter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist period time-unit level logger-name prefix pattern registry-name ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "period" period "timeUnit" time-unit "level" level "loggerName" logger-name "prefix" prefix "pattern" pattern "registryName" registry-name }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-metrics-internal-log-reporter
  ""
  ([] (org-apache-sling-commons-metrics-internal-log-reporter nil))
  ([optional-params]
   (:data (org-apache-sling-commons-metrics-internal-log-reporter-with-http-info optional-params))))

(defn org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter-with-http-info
  ""
  ([] (org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist datasources step archives path ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "datasources" (with-collection-format datasources :multi) "step" step "archives" (with-collection-format archives :multi) "path" path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter
  ""
  ([] (org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter nil))
  ([optional-params]
   (:data (org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter-with-http-info optional-params))))

(defn org-apache-sling-commons-mime-internal-mime-type-service-impl-with-http-info
  ""
  ([] (org-apache-sling-commons-mime-internal-mime-type-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mimetypes ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "mime.types" (with-collection-format mimetypes :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-mime-internal-mime-type-service-impl
  ""
  ([] (org-apache-sling-commons-mime-internal-mime-type-service-impl nil))
  ([optional-params]
   (:data (org-apache-sling-commons-mime-internal-mime-type-service-impl-with-http-info optional-params))))

(defn org-apache-sling-commons-scheduler-impl-quartz-scheduler-with-http-info
  ""
  ([] (org-apache-sling-commons-scheduler-impl-quartz-scheduler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist pool-name allowed-pool-names scheduleruseleaderforsingle metricsfilters slow-threshold-millis ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "poolName" pool-name "allowedPoolNames" (with-collection-format allowed-pool-names :multi) "scheduler.useleaderforsingle" scheduleruseleaderforsingle "metrics.filters" (with-collection-format metricsfilters :multi) "slowThresholdMillis" slow-threshold-millis }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-scheduler-impl-quartz-scheduler
  ""
  ([] (org-apache-sling-commons-scheduler-impl-quartz-scheduler nil))
  ([optional-params]
   (:data (org-apache-sling-commons-scheduler-impl-quartz-scheduler-with-http-info optional-params))))

(defn org-apache-sling-commons-scheduler-impl-scheduler-health-check-with-http-info
  ""
  ([] (org-apache-sling-commons-scheduler-impl-scheduler-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist maxquartz-jobdurationacceptable ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "max.quartzJob.duration.acceptable" maxquartz-jobdurationacceptable }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-scheduler-impl-scheduler-health-check
  ""
  ([] (org-apache-sling-commons-scheduler-impl-scheduler-health-check nil))
  ([optional-params]
   (:data (org-apache-sling-commons-scheduler-impl-scheduler-health-check-with-http-info optional-params))))

(defn org-apache-sling-commons-threads-impl-default-thread-pool-factory-with-http-info
  ""
  ([] (org-apache-sling-commons-threads-impl-default-thread-pool-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name min-pool-size max-pool-size queue-size max-thread-age keep-alive-time block-policy shutdown-graceful daemon shutdown-wait-time priority ]}]
   (call-api "/system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "minPoolSize" min-pool-size "maxPoolSize" max-pool-size "queueSize" queue-size "maxThreadAge" max-thread-age "keepAliveTime" keep-alive-time "blockPolicy" block-policy "shutdownGraceful" shutdown-graceful "daemon" daemon "shutdownWaitTime" shutdown-wait-time "priority" priority }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-commons-threads-impl-default-thread-pool-factory
  ""
  ([] (org-apache-sling-commons-threads-impl-default-thread-pool-factory nil))
  ([optional-params]
   (:data (org-apache-sling-commons-threads-impl-default-thread-pool-factory-with-http-info optional-params))))

(defn org-apache-sling-datasource-data-source-factory-with-http-info
  ""
  ([] (org-apache-sling-datasource-data-source-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist datasourcename datasourcesvcpropname driver-class-name url username password default-auto-commit default-read-only default-transaction-isolation default-catalog max-active max-idle min-idle initial-size max-wait max-age test-on-borrow test-on-return test-while-idle validation-query validation-query-timeout time-between-eviction-runs-millis min-evictable-idle-time-millis connection-properties init-sql jdbc-interceptors validation-interval log-validation-errors datasourcesvcproperties ]}]
   (call-api "/system/console/configMgr/org.apache.sling.datasource.DataSourceFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "datasource.name" datasourcename "datasource.svc.prop.name" datasourcesvcpropname "driverClassName" driver-class-name "url" url "username" username "password" password "defaultAutoCommit" default-auto-commit "defaultReadOnly" default-read-only "defaultTransactionIsolation" default-transaction-isolation "defaultCatalog" default-catalog "maxActive" max-active "maxIdle" max-idle "minIdle" min-idle "initialSize" initial-size "maxWait" max-wait "maxAge" max-age "testOnBorrow" test-on-borrow "testOnReturn" test-on-return "testWhileIdle" test-while-idle "validationQuery" validation-query "validationQueryTimeout" validation-query-timeout "timeBetweenEvictionRunsMillis" time-between-eviction-runs-millis "minEvictableIdleTimeMillis" min-evictable-idle-time-millis "connectionProperties" connection-properties "initSQL" init-sql "jdbcInterceptors" jdbc-interceptors "validationInterval" validation-interval "logValidationErrors" log-validation-errors "datasource.svc.properties" (with-collection-format datasourcesvcproperties :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-datasource-data-source-factory
  ""
  ([] (org-apache-sling-datasource-data-source-factory nil))
  ([optional-params]
   (:data (org-apache-sling-datasource-data-source-factory-with-http-info optional-params))))

(defn org-apache-sling-datasource-jndi-data-source-factory-with-http-info
  ""
  ([] (org-apache-sling-datasource-jndi-data-source-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist datasourcename datasourcesvcpropname datasourcejndiname jndiproperties ]}]
   (call-api "/system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "datasource.name" datasourcename "datasource.svc.prop.name" datasourcesvcpropname "datasource.jndi.name" datasourcejndiname "jndi.properties" (with-collection-format jndiproperties :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-datasource-jndi-data-source-factory
  ""
  ([] (org-apache-sling-datasource-jndi-data-source-factory nil))
  ([optional-params]
   (:data (org-apache-sling-datasource-jndi-data-source-factory-with-http-info optional-params))))

(defn org-apache-sling-discovery-oak-config-with-http-info
  ""
  ([] (org-apache-sling-discovery-oak-config-with-http-info nil))
  ([{:keys [post apply delete action location propertylist connector-ping-timeout connector-ping-interval discovery-lite-check-interval cluster-sync-service-timeout cluster-sync-service-interval enable-sync-token min-event-delay socket-connect-timeout so-timeout topology-connector-urls topology-connector-whitelist auto-stop-local-loop-enabled gzip-connector-requests-enabled hmac-enabled enable-encryption shared-key hmac-shared-key-ttl backoff-standby-factor backoff-stable-factor ]}]
   (call-api "/system/console/configMgr/org.apache.sling.discovery.oak.Config" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "connectorPingTimeout" connector-ping-timeout "connectorPingInterval" connector-ping-interval "discoveryLiteCheckInterval" discovery-lite-check-interval "clusterSyncServiceTimeout" cluster-sync-service-timeout "clusterSyncServiceInterval" cluster-sync-service-interval "enableSyncToken" enable-sync-token "minEventDelay" min-event-delay "socketConnectTimeout" socket-connect-timeout "soTimeout" so-timeout "topologyConnectorUrls" (with-collection-format topology-connector-urls :multi) "topologyConnectorWhitelist" (with-collection-format topology-connector-whitelist :multi) "autoStopLocalLoopEnabled" auto-stop-local-loop-enabled "gzipConnectorRequestsEnabled" gzip-connector-requests-enabled "hmacEnabled" hmac-enabled "enableEncryption" enable-encryption "sharedKey" shared-key "hmacSharedKeyTTL" hmac-shared-key-ttl "backoffStandbyFactor" backoff-standby-factor "backoffStableFactor" backoff-stable-factor }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-discovery-oak-config
  ""
  ([] (org-apache-sling-discovery-oak-config nil))
  ([optional-params]
   (:data (org-apache-sling-discovery-oak-config-with-http-info optional-params))))

(defn org-apache-sling-discovery-oak-synchronized-clocks-health-check-with-http-info
  ""
  ([] (org-apache-sling-discovery-oak-synchronized-clocks-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hcname hctags hcmbeanname ]}]
   (call-api "/system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.name" hcname "hc.tags" (with-collection-format hctags :multi) "hc.mbean.name" hcmbeanname }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-discovery-oak-synchronized-clocks-health-check
  ""
  ([] (org-apache-sling-discovery-oak-synchronized-clocks-health-check nil))
  ([optional-params]
   (:data (org-apache-sling-discovery-oak-synchronized-clocks-health-check-with-http-info optional-params))))

(defn org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto-with-http-info
  ""
  ([] (org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name title details enabled service-name loglevel allowedroots queueprocessingenabled package-importerendpoints passive-queues priority-queues retrystrategy retryattempts request-authorization-strategytarget transport-secret-providertarget package-buildertarget triggerstarget queueprovider asyncdelivery httpconntimeout ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "title" title "details" details "enabled" enabled "serviceName" service-name "log.level" loglevel "allowed.roots" (with-collection-format allowedroots :multi) "queue.processing.enabled" queueprocessingenabled "packageImporter.endpoints" (with-collection-format package-importerendpoints :multi) "passiveQueues" (with-collection-format passive-queues :multi) "priorityQueues" (with-collection-format priority-queues :multi) "retry.strategy" retrystrategy "retry.attempts" retryattempts "requestAuthorizationStrategy.target" request-authorization-strategytarget "transportSecretProvider.target" transport-secret-providertarget "packageBuilder.target" package-buildertarget "triggers.target" triggerstarget "queue.provider" queueprovider "async.delivery" asyncdelivery "http.conn.timeout" httpconntimeout }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto
  ""
  ([] (org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto-with-http-info optional-params))))

(defn org-apache-sling-distribution-agent-impl-privilege-distribution-request-a-with-http-info
  ""
  ([] (org-apache-sling-distribution-agent-impl-privilege-distribution-request-a-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name jcr-privilege ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "jcrPrivilege" jcr-privilege }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-agent-impl-privilege-distribution-request-a
  ""
  ([] (org-apache-sling-distribution-agent-impl-privilege-distribution-request-a nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-agent-impl-privilege-distribution-request-a-with-http-info optional-params))))

(defn org-apache-sling-distribution-agent-impl-queue-distribution-agent-factory-with-http-info
  ""
  ([] (org-apache-sling-distribution-agent-impl-queue-distribution-agent-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name title details enabled service-name loglevel allowedroots request-authorization-strategytarget queue-provider-factorytarget package-buildertarget triggerstarget priority-queues ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "title" title "details" details "enabled" enabled "serviceName" service-name "log.level" loglevel "allowed.roots" (with-collection-format allowedroots :multi) "requestAuthorizationStrategy.target" request-authorization-strategytarget "queueProviderFactory.target" queue-provider-factorytarget "packageBuilder.target" package-buildertarget "triggers.target" triggerstarget "priorityQueues" (with-collection-format priority-queues :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-agent-impl-queue-distribution-agent-factory
  ""
  ([] (org-apache-sling-distribution-agent-impl-queue-distribution-agent-factory nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-agent-impl-queue-distribution-agent-factory-with-http-info optional-params))))

(defn org-apache-sling-distribution-agent-impl-reverse-distribution-agent-facto-with-http-info
  ""
  ([] (org-apache-sling-distribution-agent-impl-reverse-distribution-agent-facto-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name title details enabled service-name loglevel queueprocessingenabled package-exporterendpoints pullitems httpconntimeout request-authorization-strategytarget transport-secret-providertarget package-buildertarget triggerstarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "title" title "details" details "enabled" enabled "serviceName" service-name "log.level" loglevel "queue.processing.enabled" queueprocessingenabled "packageExporter.endpoints" (with-collection-format package-exporterendpoints :multi) "pull.items" pullitems "http.conn.timeout" httpconntimeout "requestAuthorizationStrategy.target" request-authorization-strategytarget "transportSecretProvider.target" transport-secret-providertarget "packageBuilder.target" package-buildertarget "triggers.target" triggerstarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-agent-impl-reverse-distribution-agent-facto
  ""
  ([] (org-apache-sling-distribution-agent-impl-reverse-distribution-agent-facto nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-agent-impl-reverse-distribution-agent-facto-with-http-info optional-params))))

(defn org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor-with-http-info
  ""
  ([] (org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name title details enabled service-name loglevel queueprocessingenabled package-exportertarget package-importertarget request-authorization-strategytarget triggerstarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "title" title "details" details "enabled" enabled "serviceName" service-name "log.level" loglevel "queue.processing.enabled" queueprocessingenabled "packageExporter.target" package-exportertarget "packageImporter.target" package-importertarget "requestAuthorizationStrategy.target" request-authorization-strategytarget "triggers.target" triggerstarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor
  ""
  ([] (org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor-with-http-info optional-params))))

(defn org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-with-http-info
  ""
  ([] (org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name title details enabled service-name loglevel queueprocessingenabled passive-queues package-exporterendpoints package-importerendpoints retrystrategy retryattempts pullitems httpconntimeout request-authorization-strategytarget transport-secret-providertarget package-buildertarget triggerstarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "title" title "details" details "enabled" enabled "serviceName" service-name "log.level" loglevel "queue.processing.enabled" queueprocessingenabled "passiveQueues" (with-collection-format passive-queues :multi) "packageExporter.endpoints" (with-collection-format package-exporterendpoints :multi) "packageImporter.endpoints" (with-collection-format package-importerendpoints :multi) "retry.strategy" retrystrategy "retry.attempts" retryattempts "pull.items" pullitems "http.conn.timeout" httpconntimeout "requestAuthorizationStrategy.target" request-authorization-strategytarget "transportSecretProvider.target" transport-secret-providertarget "packageBuilder.target" package-buildertarget "triggers.target" triggerstarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory
  ""
  ([] (org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-with-http-info optional-params))))

(defn org-apache-sling-distribution-monitor-distribution-queue-health-check-with-http-info
  ""
  ([] (org-apache-sling-distribution-monitor-distribution-queue-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hcname hctags hcmbeanname number-of-retries-allowed ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.name" hcname "hc.tags" (with-collection-format hctags :multi) "hc.mbean.name" hcmbeanname "numberOfRetriesAllowed" number-of-retries-allowed }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-monitor-distribution-queue-health-check
  ""
  ([] (org-apache-sling-distribution-monitor-distribution-queue-health-check nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-monitor-distribution-queue-health-check-with-http-info optional-params))))

(defn org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-with-http-info
  ""
  ([] (org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name queue dropinvaliditems agenttarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "queue" queue "drop.invalid.items" dropinvaliditems "agent.target" agenttarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-packaging-impl-exporter-agent-distributio
  ""
  ([] (org-apache-sling-distribution-packaging-impl-exporter-agent-distributio nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-with-http-info optional-params))))

(defn org-apache-sling-distribution-packaging-impl-exporter-local-distributio-with-http-info
  ""
  ([] (org-apache-sling-distribution-packaging-impl-exporter-local-distributio-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name package-buildertarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "packageBuilder.target" package-buildertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-packaging-impl-exporter-local-distributio
  ""
  ([] (org-apache-sling-distribution-packaging-impl-exporter-local-distributio nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-packaging-impl-exporter-local-distributio-with-http-info optional-params))))

(defn org-apache-sling-distribution-packaging-impl-exporter-remote-distributi-with-http-info
  ""
  ([] (org-apache-sling-distribution-packaging-impl-exporter-remote-distributi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name endpoints pullitems package-buildertarget transport-secret-providertarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "endpoints" (with-collection-format endpoints :multi) "pull.items" pullitems "packageBuilder.target" package-buildertarget "transportSecretProvider.target" transport-secret-providertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-packaging-impl-exporter-remote-distributi
  ""
  ([] (org-apache-sling-distribution-packaging-impl-exporter-remote-distributi nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-packaging-impl-exporter-remote-distributi-with-http-info optional-params))))

(defn org-apache-sling-distribution-packaging-impl-importer-local-distributio-with-http-info
  ""
  ([] (org-apache-sling-distribution-packaging-impl-importer-local-distributio-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name package-buildertarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "packageBuilder.target" package-buildertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-packaging-impl-importer-local-distributio
  ""
  ([] (org-apache-sling-distribution-packaging-impl-importer-local-distributio nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-packaging-impl-importer-local-distributio-with-http-info optional-params))))

(defn org-apache-sling-distribution-packaging-impl-importer-remote-distributi-with-http-info
  ""
  ([] (org-apache-sling-distribution-packaging-impl-importer-remote-distributi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name endpoints transport-secret-providertarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "endpoints" (with-collection-format endpoints :multi) "transportSecretProvider.target" transport-secret-providertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-packaging-impl-importer-remote-distributi
  ""
  ([] (org-apache-sling-distribution-packaging-impl-importer-remote-distributi nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-packaging-impl-importer-remote-distributi-with-http-info optional-params))))

(defn org-apache-sling-distribution-packaging-impl-importer-repository-distri-with-http-info
  ""
  ([] (org-apache-sling-distribution-packaging-impl-importer-repository-distri-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name servicename path privilegename ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "service.name" servicename "path" path "privilege.name" privilegename }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-packaging-impl-importer-repository-distri
  ""
  ([] (org-apache-sling-distribution-packaging-impl-importer-repository-distri nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-packaging-impl-importer-repository-distri-with-http-info optional-params))))

(defn org-apache-sling-distribution-resources-impl-distribution-configuration-with-http-info
  ""
  ([] (org-apache-sling-distribution-resources-impl-distribution-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist providerroots kind ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "provider.roots" providerroots "kind" kind }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-resources-impl-distribution-configuration
  ""
  ([] (org-apache-sling-distribution-resources-impl-distribution-configuration nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-resources-impl-distribution-configuration-with-http-info optional-params))))

(defn org-apache-sling-distribution-resources-impl-distribution-service-resour-with-http-info
  ""
  ([] (org-apache-sling-distribution-resources-impl-distribution-service-resour-with-http-info nil))
  ([{:keys [post apply delete action location propertylist providerroots kind ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "provider.roots" providerroots "kind" kind }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-resources-impl-distribution-service-resour
  ""
  ([] (org-apache-sling-distribution-resources-impl-distribution-service-resour nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-resources-impl-distribution-service-resour-with-http-info optional-params))))

(defn org-apache-sling-distribution-serialization-impl-distribution-package-bu-with-http-info
  ""
  ([] (org-apache-sling-distribution-serialization-impl-distribution-package-bu-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name type formattarget temp-fs-folder file-threshold memory-unit use-off-heap-memory digest-algorithm monitoring-queue-size cleanup-delay packagefilters propertyfilters ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "type" type "format.target" formattarget "tempFsFolder" temp-fs-folder "fileThreshold" file-threshold "memoryUnit" memory-unit "useOffHeapMemory" use-off-heap-memory "digestAlgorithm" digest-algorithm "monitoringQueueSize" monitoring-queue-size "cleanupDelay" cleanup-delay "package.filters" (with-collection-format packagefilters :multi) "property.filters" (with-collection-format propertyfilters :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-serialization-impl-distribution-package-bu
  ""
  ([] (org-apache-sling-distribution-serialization-impl-distribution-package-bu nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-serialization-impl-distribution-package-bu-with-http-info optional-params))))

(defn org-apache-sling-distribution-serialization-impl-vlt-vault-distribution-with-http-info
  ""
  ([] (org-apache-sling-distribution-serialization-impl-vlt-vault-distribution-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name type import-mode acl-handling packageroots packagefilters propertyfilters temp-fs-folder use-binary-references auto-save-threshold cleanup-delay file-threshold mega-bytes use-off-heap-memory digest-algorithm monitoring-queue-size paths-mapping strict-import ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "type" type "importMode" import-mode "aclHandling" acl-handling "package.roots" packageroots "package.filters" (with-collection-format packagefilters :multi) "property.filters" (with-collection-format propertyfilters :multi) "tempFsFolder" temp-fs-folder "useBinaryReferences" use-binary-references "autoSaveThreshold" auto-save-threshold "cleanupDelay" cleanup-delay "fileThreshold" file-threshold "MEGA_BYTES" mega-bytes "useOffHeapMemory" use-off-heap-memory "digestAlgorithm" digest-algorithm "monitoringQueueSize" monitoring-queue-size "pathsMapping" (with-collection-format paths-mapping :multi) "strictImport" strict-import }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-serialization-impl-vlt-vault-distribution
  ""
  ([] (org-apache-sling-distribution-serialization-impl-vlt-vault-distribution nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-serialization-impl-vlt-vault-distribution-with-http-info optional-params))))

(defn org-apache-sling-distribution-transport-impl-user-credentials-distributi-with-http-info
  ""
  ([] (org-apache-sling-distribution-transport-impl-user-credentials-distributi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name username password ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "username" username "password" password }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-transport-impl-user-credentials-distributi
  ""
  ([] (org-apache-sling-distribution-transport-impl-user-credentials-distributi nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-transport-impl-user-credentials-distributi-with-http-info optional-params))))

(defn org-apache-sling-distribution-trigger-impl-distribution-event-distribute-with-http-info
  ""
  ([] (org-apache-sling-distribution-trigger-impl-distribution-event-distribute-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name path ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "path" path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-trigger-impl-distribution-event-distribute
  ""
  ([] (org-apache-sling-distribution-trigger-impl-distribution-event-distribute nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-trigger-impl-distribution-event-distribute-with-http-info optional-params))))

(defn org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger-with-http-info
  ""
  ([] (org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name path ignored-paths-patterns service-name deep ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "path" path "ignoredPathsPatterns" (with-collection-format ignored-paths-patterns :multi) "serviceName" service-name "deep" deep }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger
  ""
  ([] (org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger-with-http-info optional-params))))

(defn org-apache-sling-distribution-trigger-impl-persisted-jcr-event-distributi-with-http-info
  ""
  ([] (org-apache-sling-distribution-trigger-impl-persisted-jcr-event-distributi-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name path service-name nuggets-path ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "path" path "serviceName" service-name "nuggetsPath" nuggets-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-trigger-impl-persisted-jcr-event-distributi
  ""
  ([] (org-apache-sling-distribution-trigger-impl-persisted-jcr-event-distributi nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-trigger-impl-persisted-jcr-event-distributi-with-http-info optional-params))))

(defn org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-with-http-info
  ""
  ([] (org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name endpoint transport-secret-providertarget ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "endpoint" endpoint "transportSecretProvider.target" transport-secret-providertarget }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig
  ""
  ([] (org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-with-http-info optional-params))))

(defn org-apache-sling-distribution-trigger-impl-resource-event-distribution-tr-with-http-info
  ""
  ([] (org-apache-sling-distribution-trigger-impl-resource-event-distribution-tr-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name path ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "path" path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-trigger-impl-resource-event-distribution-tr
  ""
  ([] (org-apache-sling-distribution-trigger-impl-resource-event-distribution-tr nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-trigger-impl-resource-event-distribution-tr-with-http-info optional-params))))

(defn org-apache-sling-distribution-trigger-impl-scheduled-distribution-trigge-with-http-info
  ""
  ([] (org-apache-sling-distribution-trigger-impl-scheduled-distribution-trigge-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name path seconds service-name ]}]
   (call-api "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "path" path "seconds" seconds "serviceName" service-name }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-distribution-trigger-impl-scheduled-distribution-trigge
  ""
  ([] (org-apache-sling-distribution-trigger-impl-scheduled-distribution-trigge nil))
  ([optional-params]
   (:data (org-apache-sling-distribution-trigger-impl-scheduled-distribution-trigge-with-http-info optional-params))))

(defn org-apache-sling-engine-impl-auth-sling-authenticator-with-http-info
  ""
  ([] (org-apache-sling-engine-impl-auth-sling-authenticator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist osgihttpwhiteboardcontextselect osgihttpwhiteboardlistener authsudocookie authsudoparameter authannonymous slingauthrequirements slingauthanonymoususer slingauthanonymouspassword authhttp authhttprealm authurisuffix ]}]
   (call-api "/system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "osgi.http.whiteboard.context.select" osgihttpwhiteboardcontextselect "osgi.http.whiteboard.listener" osgihttpwhiteboardlistener "auth.sudo.cookie" authsudocookie "auth.sudo.parameter" authsudoparameter "auth.annonymous" authannonymous "sling.auth.requirements" (with-collection-format slingauthrequirements :multi) "sling.auth.anonymous.user" slingauthanonymoususer "sling.auth.anonymous.password" slingauthanonymouspassword "auth.http" authhttp "auth.http.realm" authhttprealm "auth.uri.suffix" (with-collection-format authurisuffix :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-engine-impl-auth-sling-authenticator
  ""
  ([] (org-apache-sling-engine-impl-auth-sling-authenticator nil))
  ([optional-params]
   (:data (org-apache-sling-engine-impl-auth-sling-authenticator-with-http-info optional-params))))

(defn org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-with-http-info
  ""
  ([] (org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist extensions min-duration-ms max-duration-ms compact-log-format ]}]
   (call-api "/system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "extensions" (with-collection-format extensions :multi) "minDurationMs" min-duration-ms "maxDurationMs" max-duration-ms "compactLogFormat" compact-log-format }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter
  ""
  ([] (org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter nil))
  ([optional-params]
   (:data (org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-with-http-info optional-params))))

(defn org-apache-sling-engine-impl-log-request-logger-with-http-info
  ""
  ([] (org-apache-sling-engine-impl-log-request-logger-with-http-info nil))
  ([{:keys [post apply delete action location propertylist requestlogoutput requestlogoutputtype requestlogenabled accesslogoutput accesslogoutputtype accesslogenabled ]}]
   (call-api "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "request.log.output" requestlogoutput "request.log.outputtype" requestlogoutputtype "request.log.enabled" requestlogenabled "access.log.output" accesslogoutput "access.log.outputtype" accesslogoutputtype "access.log.enabled" accesslogenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-engine-impl-log-request-logger
  ""
  ([] (org-apache-sling-engine-impl-log-request-logger nil))
  ([optional-params]
   (:data (org-apache-sling-engine-impl-log-request-logger-with-http-info optional-params))))

(defn org-apache-sling-engine-impl-log-request-logger-service-with-http-info
  ""
  ([] (org-apache-sling-engine-impl-log-request-logger-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist requestlogserviceformat requestlogserviceoutput requestlogserviceoutputtype requestlogserviceonentry ]}]
   (call-api "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "request.log.service.format" requestlogserviceformat "request.log.service.output" requestlogserviceoutput "request.log.service.outputtype" requestlogserviceoutputtype "request.log.service.onentry" requestlogserviceonentry }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-engine-impl-log-request-logger-service
  ""
  ([] (org-apache-sling-engine-impl-log-request-logger-service nil))
  ([optional-params]
   (:data (org-apache-sling-engine-impl-log-request-logger-service-with-http-info optional-params))))

(defn org-apache-sling-engine-impl-sling-main-servlet-with-http-info
  ""
  ([] (org-apache-sling-engine-impl-sling-main-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingmaxcalls slingmaxinclusions slingtraceallow slingmaxrecordrequests slingstorepatternrequests slingserverinfo slingadditionalresponseheaders ]}]
   (call-api "/system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.max.calls" slingmaxcalls "sling.max.inclusions" slingmaxinclusions "sling.trace.allow" slingtraceallow "sling.max.record.requests" slingmaxrecordrequests "sling.store.pattern.requests" (with-collection-format slingstorepatternrequests :multi) "sling.serverinfo" slingserverinfo "sling.additional.response.headers" (with-collection-format slingadditionalresponseheaders :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-engine-impl-sling-main-servlet
  ""
  ([] (org-apache-sling-engine-impl-sling-main-servlet nil))
  ([optional-params]
   (:data (org-apache-sling-engine-impl-sling-main-servlet-with-http-info optional-params))))

(defn org-apache-sling-engine-parameters-with-http-info
  ""
  ([] (org-apache-sling-engine-parameters-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingdefaultparameterencoding slingdefaultmaxparameters filelocation filethreshold filemax requestmax slingdefaultparametercheck-for-additional-container-parameters ]}]
   (call-api "/system/console/configMgr/org.apache.sling.engine.parameters" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.default.parameter.encoding" slingdefaultparameterencoding "sling.default.max.parameters" slingdefaultmaxparameters "file.location" filelocation "file.threshold" filethreshold "file.max" filemax "request.max" requestmax "sling.default.parameter.checkForAdditionalContainerParameters" slingdefaultparametercheck-for-additional-container-parameters }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-engine-parameters
  ""
  ([] (org-apache-sling-engine-parameters nil))
  ([optional-params]
   (:data (org-apache-sling-engine-parameters-with-http-info optional-params))))

(defn org-apache-sling-event-impl-eventing-thread-pool-with-http-info
  ""
  ([] (org-apache-sling-event-impl-eventing-thread-pool-with-http-info nil))
  ([{:keys [post apply delete action location propertylist min-pool-size ]}]
   (call-api "/system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "minPoolSize" min-pool-size }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-event-impl-eventing-thread-pool
  ""
  ([] (org-apache-sling-event-impl-eventing-thread-pool nil))
  ([optional-params]
   (:data (org-apache-sling-event-impl-eventing-thread-pool-with-http-info optional-params))))

(defn org-apache-sling-event-impl-jobs-default-job-manager-with-http-info
  ""
  ([] (org-apache-sling-event-impl-jobs-default-job-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist queuepriority queueretries queueretrydelay queuemaxparallel ]}]
   (call-api "/system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "queue.priority" queuepriority "queue.retries" queueretries "queue.retrydelay" queueretrydelay "queue.maxparallel" queuemaxparallel }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-event-impl-jobs-default-job-manager
  ""
  ([] (org-apache-sling-event-impl-jobs-default-job-manager nil))
  ([optional-params]
   (:data (org-apache-sling-event-impl-jobs-default-job-manager-with-http-info optional-params))))

(defn org-apache-sling-event-impl-jobs-jcr-persistence-handler-with-http-info
  ""
  ([] (org-apache-sling-event-impl-jobs-jcr-persistence-handler-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jobconsumermanagerdisable-distribution startupdelay cleanupperiod ]}]
   (call-api "/system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "job.consumermanager.disableDistribution" jobconsumermanagerdisable-distribution "startup.delay" startupdelay "cleanup.period" cleanupperiod }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-event-impl-jobs-jcr-persistence-handler
  ""
  ([] (org-apache-sling-event-impl-jobs-jcr-persistence-handler nil))
  ([optional-params]
   (:data (org-apache-sling-event-impl-jobs-jcr-persistence-handler-with-http-info optional-params))))

(defn org-apache-sling-event-impl-jobs-job-consumer-manager-with-http-info
  ""
  ([] (org-apache-sling-event-impl-jobs-job-consumer-manager-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslinginstallerconfigurationpersist jobconsumermanagerwhitelist jobconsumermanagerblacklist ]}]
   (call-api "/system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.installer.configuration.persist" orgapacheslinginstallerconfigurationpersist "job.consumermanager.whitelist" (with-collection-format jobconsumermanagerwhitelist :multi) "job.consumermanager.blacklist" (with-collection-format jobconsumermanagerblacklist :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-event-impl-jobs-job-consumer-manager
  ""
  ([] (org-apache-sling-event-impl-jobs-job-consumer-manager nil))
  ([optional-params]
   (:data (org-apache-sling-event-impl-jobs-job-consumer-manager-with-http-info optional-params))))

(defn org-apache-sling-event-jobs-queue-configuration-with-http-info
  ""
  ([] (org-apache-sling-event-jobs-queue-configuration-with-http-info nil))
  ([{:keys [post apply delete action location propertylist queuename queuetopics queuetype queuepriority queueretries queueretrydelay queuemaxparallel queuekeep-jobs queueprefer-run-on-creation-instance queuethread-pool-size serviceranking ]}]
   (call-api "/system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "queue.name" queuename "queue.topics" (with-collection-format queuetopics :multi) "queue.type" queuetype "queue.priority" queuepriority "queue.retries" queueretries "queue.retrydelay" queueretrydelay "queue.maxparallel" queuemaxparallel "queue.keepJobs" queuekeep-jobs "queue.preferRunOnCreationInstance" queueprefer-run-on-creation-instance "queue.threadPoolSize" queuethread-pool-size "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-event-jobs-queue-configuration
  ""
  ([] (org-apache-sling-event-jobs-queue-configuration nil))
  ([optional-params]
   (:data (org-apache-sling-event-jobs-queue-configuration-with-http-info optional-params))))

(defn org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-with-http-info
  ""
  ([] (org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-with-http-info nil))
  ([{:keys [post apply delete action location propertylist users groups ]}]
   (call-api "/system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "users" (with-collection-format users :multi) "groups" (with-collection-format groups :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w
  ""
  ([] (org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w nil))
  ([optional-params]
   (:data (org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-with-http-info optional-params))))

(defn org-apache-sling-featureflags-feature-with-http-info
  ""
  ([] (org-apache-sling-featureflags-feature-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name description enabled ]}]
   (call-api "/system/console/configMgr/org.apache.sling.featureflags.Feature" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "description" description "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-featureflags-feature
  ""
  ([] (org-apache-sling-featureflags-feature nil))
  ([optional-params]
   (:data (org-apache-sling-featureflags-feature-with-http-info optional-params))))

(defn org-apache-sling-featureflags-impl-configured-feature-with-http-info
  ""
  ([] (org-apache-sling-featureflags-impl-configured-feature-with-http-info nil))
  ([{:keys [post apply delete action location propertylist name description enabled ]}]
   (call-api "/system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "name" name "description" description "enabled" enabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-featureflags-impl-configured-feature
  ""
  ([] (org-apache-sling-featureflags-impl-configured-feature nil))
  ([optional-params]
   (:data (org-apache-sling-featureflags-impl-configured-feature-with-http-info optional-params))))

(defn org-apache-sling-hapi-impl-h-api-util-impl-with-http-info
  ""
  ([] (org-apache-sling-hapi-impl-h-api-util-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslinghapitoolsresourcetype orgapacheslinghapitoolscollectionresourcetype orgapacheslinghapitoolssearchpaths orgapacheslinghapitoolsexternalurl orgapacheslinghapitoolsenabled ]}]
   (call-api "/system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.hapi.tools.resourcetype" orgapacheslinghapitoolsresourcetype "org.apache.sling.hapi.tools.collectionresourcetype" orgapacheslinghapitoolscollectionresourcetype "org.apache.sling.hapi.tools.searchpaths" (with-collection-format orgapacheslinghapitoolssearchpaths :multi) "org.apache.sling.hapi.tools.externalurl" orgapacheslinghapitoolsexternalurl "org.apache.sling.hapi.tools.enabled" orgapacheslinghapitoolsenabled }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-hapi-impl-h-api-util-impl
  ""
  ([] (org-apache-sling-hapi-impl-h-api-util-impl nil))
  ([optional-params]
   (:data (org-apache-sling-hapi-impl-h-api-util-impl-with-http-info optional-params))))

(defn org-apache-sling-hc-core-impl-composite-health-check-with-http-info
  ""
  ([] (org-apache-sling-hc-core-impl-composite-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hcname hctags hcmbeanname filtertags filtercombine-tags-with-or ]}]
   (call-api "/system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.name" hcname "hc.tags" (with-collection-format hctags :multi) "hc.mbean.name" hcmbeanname "filter.tags" (with-collection-format filtertags :multi) "filter.combineTagsWithOr" filtercombine-tags-with-or }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-hc-core-impl-composite-health-check
  ""
  ([] (org-apache-sling-hc-core-impl-composite-health-check nil))
  ([optional-params]
   (:data (org-apache-sling-hc-core-impl-composite-health-check-with-http-info optional-params))))

(defn org-apache-sling-hc-core-impl-executor-health-check-executor-impl-with-http-info
  ""
  ([] (org-apache-sling-hc-core-impl-executor-health-check-executor-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist timeout-in-ms long-running-future-threshold-for-critical-ms result-cache-ttl-in-ms ]}]
   (call-api "/system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "timeoutInMs" timeout-in-ms "longRunningFutureThresholdForCriticalMs" long-running-future-threshold-for-critical-ms "resultCacheTtlInMs" result-cache-ttl-in-ms }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-hc-core-impl-executor-health-check-executor-impl
  ""
  ([] (org-apache-sling-hc-core-impl-executor-health-check-executor-impl nil))
  ([optional-params]
   (:data (org-apache-sling-hc-core-impl-executor-health-check-executor-impl-with-http-info optional-params))))

(defn org-apache-sling-hc-core-impl-jmx-attribute-health-check-with-http-info
  ""
  ([] (org-apache-sling-hc-core-impl-jmx-attribute-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hcname hctags hcmbeanname mbeanname attributename attributevalueconstraint ]}]
   (call-api "/system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.name" hcname "hc.tags" (with-collection-format hctags :multi) "hc.mbean.name" hcmbeanname "mbean.name" mbeanname "attribute.name" attributename "attribute.value.constraint" attributevalueconstraint }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-hc-core-impl-jmx-attribute-health-check
  ""
  ([] (org-apache-sling-hc-core-impl-jmx-attribute-health-check nil))
  ([optional-params]
   (:data (org-apache-sling-hc-core-impl-jmx-attribute-health-check-with-http-info optional-params))))

(defn org-apache-sling-hc-core-impl-scriptable-health-check-with-http-info
  ""
  ([] (org-apache-sling-hc-core-impl-scriptable-health-check-with-http-info nil))
  ([{:keys [post apply delete action location propertylist hcname hctags hcmbeanname expression languageextension ]}]
   (call-api "/system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "hc.name" hcname "hc.tags" (with-collection-format hctags :multi) "hc.mbean.name" hcmbeanname "expression" expression "language.extension" languageextension }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-hc-core-impl-scriptable-health-check
  ""
  ([] (org-apache-sling-hc-core-impl-scriptable-health-check nil))
  ([optional-params]
   (:data (org-apache-sling-hc-core-impl-scriptable-health-check-with-http-info optional-params))))

(defn org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet-with-http-info
  ""
  ([] (org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist servlet-path disabled corsaccess-control-allow-origin ]}]
   (call-api "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "servletPath" servlet-path "disabled" disabled "cors.accessControlAllowOrigin" corsaccess-control-allow-origin }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet
  ""
  ([] (org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet nil))
  ([optional-params]
   (:data (org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet-with-http-info optional-params))))

(defn org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-with-http-info
  ""
  ([] (org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist total-width col-width-name col-width-result col-width-timing ]}]
   (call-api "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "totalWidth" total-width "colWidthName" col-width-name "colWidthResult" col-width-result "colWidthTiming" col-width-timing }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer
  ""
  ([] (org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer nil))
  ([optional-params]
   (:data (org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-with-http-info optional-params))))

(defn org-apache-sling-i18n-impl-i18-n-filter-with-http-info
  ""
  ([] (org-apache-sling-i18n-impl-i18-n-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking slingfilterscope ]}]
   (call-api "/system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "sling.filter.scope" (with-collection-format slingfilterscope :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-i18n-impl-i18-n-filter
  ""
  ([] (org-apache-sling-i18n-impl-i18-n-filter nil))
  ([optional-params]
   (:data (org-apache-sling-i18n-impl-i18-n-filter-with-http-info optional-params))))

(defn org-apache-sling-i18n-impl-jcr-resource-bundle-provider-with-http-info
  ""
  ([] (org-apache-sling-i18n-impl-jcr-resource-bundle-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist localedefault preloadbundles invalidationdelay ]}]
   (call-api "/system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "locale.default" localedefault "preload.bundles" preloadbundles "invalidation.delay" invalidationdelay }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-i18n-impl-jcr-resource-bundle-provider
  ""
  ([] (org-apache-sling-i18n-impl-jcr-resource-bundle-provider nil))
  ([optional-params]
   (:data (org-apache-sling-i18n-impl-jcr-resource-bundle-provider-with-http-info optional-params))))

(defn org-apache-sling-installer-provider-jcr-impl-jcr-installer-with-http-info
  ""
  ([] (org-apache-sling-installer-provider-jcr-impl-jcr-installer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist handlerschemes slingjcrinstallfoldernameregexp slingjcrinstallfoldermaxdepth slingjcrinstallsearchpath slingjcrinstallnewconfigpath slingjcrinstallsignalpath slingjcrinstallenablewriteback ]}]
   (call-api "/system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "handler.schemes" (with-collection-format handlerschemes :multi) "sling.jcrinstall.folder.name.regexp" slingjcrinstallfoldernameregexp "sling.jcrinstall.folder.max.depth" slingjcrinstallfoldermaxdepth "sling.jcrinstall.search.path" (with-collection-format slingjcrinstallsearchpath :multi) "sling.jcrinstall.new.config.path" slingjcrinstallnewconfigpath "sling.jcrinstall.signal.path" slingjcrinstallsignalpath "sling.jcrinstall.enable.writeback" slingjcrinstallenablewriteback }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-installer-provider-jcr-impl-jcr-installer
  ""
  ([] (org-apache-sling-installer-provider-jcr-impl-jcr-installer nil))
  ([optional-params]
   (:data (org-apache-sling-installer-provider-jcr-impl-jcr-installer-with-http-info optional-params))))

(defn org-apache-sling-jcr-base-internal-login-admin-whitelist-with-http-info
  ""
  ([] (org-apache-sling-jcr-base-internal-login-admin-whitelist-with-http-info nil))
  ([{:keys [post apply delete action location propertylist whitelistbypass whitelistbundlesregexp ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "whitelist.bypass" whitelistbypass "whitelist.bundles.regexp" whitelistbundlesregexp }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-base-internal-login-admin-whitelist
  ""
  ([] (org-apache-sling-jcr-base-internal-login-admin-whitelist nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-base-internal-login-admin-whitelist-with-http-info optional-params))))

(defn org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment-with-http-info
  ""
  ([] (org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment-with-http-info nil))
  ([{:keys [post apply delete action location propertylist whitelistname whitelistbundles ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "whitelist.name" whitelistname "whitelist.bundles" (with-collection-format whitelistbundles :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment
  ""
  ([] (org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment-with-http-info optional-params))))

(defn org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet-with-http-info
  ""
  ([] (org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist alias davcreate-absolute-uri davprotectedhandlers ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "alias" alias "dav.create-absolute-uri" davcreate-absolute-uri "dav.protectedhandlers" davprotectedhandlers }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet
  ""
  ([] (org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet-with-http-info optional-params))))

(defn org-apache-sling-jcr-jackrabbit-server-jndi-registration-support-with-http-info
  ""
  ([] (org-apache-sling-jcr-jackrabbit-server-jndi-registration-support-with-http-info nil))
  ([{:keys [post apply delete action location propertylist javanamingfactoryinitial javanamingproviderurl ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "java.naming.factory.initial" javanamingfactoryinitial "java.naming.provider.url" javanamingproviderurl }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-jackrabbit-server-jndi-registration-support
  ""
  ([] (org-apache-sling-jcr-jackrabbit-server-jndi-registration-support nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-jackrabbit-server-jndi-registration-support-with-http-info optional-params))))

(defn org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-with-http-info
  ""
  ([] (org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-with-http-info nil))
  ([{:keys [post apply delete action location propertylist port ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "port" port }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-jackrabbit-server-rmi-registration-support
  ""
  ([] (org-apache-sling-jcr-jackrabbit-server-rmi-registration-support nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-with-http-info optional-params))))

(defn org-apache-sling-jcr-repoinit-impl-repository-initializer-with-http-info
  ""
  ([] (org-apache-sling-jcr-repoinit-impl-repository-initializer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist references ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "references" (with-collection-format references :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-repoinit-impl-repository-initializer
  ""
  ([] (org-apache-sling-jcr-repoinit-impl-repository-initializer nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-repoinit-impl-repository-initializer-with-http-info optional-params))))

(defn org-apache-sling-jcr-repoinit-repository-initializer-with-http-info
  ""
  ([] (org-apache-sling-jcr-repoinit-repository-initializer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist references scripts ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "references" (with-collection-format references :multi) "scripts" (with-collection-format scripts :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-repoinit-repository-initializer
  ""
  ([] (org-apache-sling-jcr-repoinit-repository-initializer nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-repoinit-repository-initializer-with-http-info optional-params))))

(defn org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-with-http-info
  ""
  ([] (org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist resourceresolversearchpath resourceresolvermanglenamespaces resourceresolverallow-direct resourceresolverrequiredproviders resourceresolverrequiredprovidernames resourceresolvervirtual resourceresolvermapping resourceresolvermaplocation resourceresolvermapobservation resourceresolverdefaultvanityredirectstatus resourceresolverenablevanitypath resourceresolvervanitypathmax-entries resourceresolvervanitypathmax-entriesstartup resourceresolvervanitypathbloomfiltermax-bytes resourceresolveroptimizealiasresolution resourceresolvervanitypathwhitelist resourceresolvervanitypathblacklist resourceresolvervanityprecedence resourceresolverproviderhandlingparanoid resourceresolverlogclosing resourceresolverlogunclosed ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "resource.resolver.searchpath" (with-collection-format resourceresolversearchpath :multi) "resource.resolver.manglenamespaces" resourceresolvermanglenamespaces "resource.resolver.allowDirect" resourceresolverallow-direct "resource.resolver.required.providers" (with-collection-format resourceresolverrequiredproviders :multi) "resource.resolver.required.providernames" (with-collection-format resourceresolverrequiredprovidernames :multi) "resource.resolver.virtual" (with-collection-format resourceresolvervirtual :multi) "resource.resolver.mapping" (with-collection-format resourceresolvermapping :multi) "resource.resolver.map.location" resourceresolvermaplocation "resource.resolver.map.observation" (with-collection-format resourceresolvermapobservation :multi) "resource.resolver.default.vanity.redirect.status" resourceresolverdefaultvanityredirectstatus "resource.resolver.enable.vanitypath" resourceresolverenablevanitypath "resource.resolver.vanitypath.maxEntries" resourceresolvervanitypathmax-entries "resource.resolver.vanitypath.maxEntries.startup" resourceresolvervanitypathmax-entriesstartup "resource.resolver.vanitypath.bloomfilter.maxBytes" resourceresolvervanitypathbloomfiltermax-bytes "resource.resolver.optimize.alias.resolution" resourceresolveroptimizealiasresolution "resource.resolver.vanitypath.whitelist" (with-collection-format resourceresolvervanitypathwhitelist :multi) "resource.resolver.vanitypath.blacklist" (with-collection-format resourceresolvervanitypathblacklist :multi) "resource.resolver.vanity.precedence" resourceresolvervanityprecedence "resource.resolver.providerhandling.paranoid" resourceresolverproviderhandlingparanoid "resource.resolver.log.closing" resourceresolverlogclosing "resource.resolver.log.unclosed" resourceresolverlogunclosed }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl
  ""
  ([] (org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-with-http-info optional-params))))

(defn org-apache-sling-jcr-resource-internal-jcr-system-user-validator-with-http-info
  ""
  ([] (org-apache-sling-jcr-resource-internal-jcr-system-user-validator-with-http-info nil))
  ([{:keys [post apply delete action location propertylist allowonlysystemuser ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "allow.only.system.user" allowonlysystemuser }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-resource-internal-jcr-system-user-validator
  ""
  ([] (org-apache-sling-jcr-resource-internal-jcr-system-user-validator nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-resource-internal-jcr-system-user-validator-with-http-info optional-params))))

(defn org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory-with-http-info
  ""
  ([] (org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist path checkpathprefix jcr-path ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "path" path "checkpath.prefix" checkpathprefix "jcrPath" jcr-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory
  ""
  ([] (org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory-with-http-info optional-params))))

(defn org-apache-sling-jcr-webdav-impl-handler-default-handler-service-with-http-info
  ""
  ([] (org-apache-sling-jcr-webdav-impl-handler-default-handler-service-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking typecollections typenoncollections typecontent ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "type.collections" typecollections "type.noncollections" typenoncollections "type.content" typecontent }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-webdav-impl-handler-default-handler-service
  ""
  ([] (org-apache-sling-jcr-webdav-impl-handler-default-handler-service nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-webdav-impl-handler-default-handler-service-with-http-info optional-params))))

(defn org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-with-http-info
  ""
  ([] (org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic
  ""
  ([] (org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-with-http-info optional-params))))

(defn org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet-with-http-info
  ""
  ([] (org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist davroot davcreate-absolute-uri davrealm collectiontypes filterprefixes filtertypes filteruris typecollections typenoncollections typecontent ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "dav.root" davroot "dav.create-absolute-uri" davcreate-absolute-uri "dav.realm" davrealm "collection.types" (with-collection-format collectiontypes :multi) "filter.prefixes" (with-collection-format filterprefixes :multi) "filter.types" filtertypes "filter.uris" filteruris "type.collections" typecollections "type.noncollections" typenoncollections "type.content" typecontent }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet
  ""
  ([] (org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet nil))
  ([optional-params]
   (:data (org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet-with-http-info optional-params))))

(defn org-apache-sling-jmx-provider-impl-jmx-resource-provider-with-http-info
  ""
  ([] (org-apache-sling-jmx-provider-impl-jmx-resource-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist providerroots ]}]
   (call-api "/system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "provider.roots" providerroots }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-jmx-provider-impl-jmx-resource-provider
  ""
  ([] (org-apache-sling-jmx-provider-impl-jmx-resource-provider nil))
  ([optional-params]
   (:data (org-apache-sling-jmx-provider-impl-jmx-resource-provider-with-http-info optional-params))))

(defn org-apache-sling-models-impl-model-adapter-factory-with-http-info
  ""
  ([] (org-apache-sling-models-impl-model-adapter-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist osgihttpwhiteboardlistener osgihttpwhiteboardcontextselect maxrecursiondepth cleanupjobperiod ]}]
   (call-api "/system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "osgi.http.whiteboard.listener" osgihttpwhiteboardlistener "osgi.http.whiteboard.context.select" osgihttpwhiteboardcontextselect "max.recursion.depth" maxrecursiondepth "cleanup.job.period" cleanupjobperiod }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-models-impl-model-adapter-factory
  ""
  ([] (org-apache-sling-models-impl-model-adapter-factory nil))
  ([optional-params]
   (:data (org-apache-sling-models-impl-model-adapter-factory-with-http-info optional-params))))

(defn org-apache-sling-models-jacksonexporter-impl-resource-module-provider-with-http-info
  ""
  ([] (org-apache-sling-models-jacksonexporter-impl-resource-module-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist maxrecursionlevels ]}]
   (call-api "/system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "max.recursion.levels" maxrecursionlevels }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-models-jacksonexporter-impl-resource-module-provider
  ""
  ([] (org-apache-sling-models-jacksonexporter-impl-resource-module-provider nil))
  ([optional-params]
   (:data (org-apache-sling-models-jacksonexporter-impl-resource-module-provider-with-http-info optional-params))))

(defn org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-with-http-info
  ""
  ([] (org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-with-http-info nil))
  ([{:keys [post apply delete action location propertylist felixinventoryprintername felixinventoryprintertitle path ]}]
   (call-api "/system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "felix.inventory.printer.name" felixinventoryprintername "felix.inventory.printer.title" felixinventoryprintertitle "path" path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto
  ""
  ([] (org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto nil))
  ([optional-params]
   (:data (org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-with-http-info optional-params))))

(defn org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-with-http-info
  ""
  ([] (org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mergeroot mergeread-only ]}]
   (call-api "/system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "merge.root" mergeroot "merge.readOnly" mergeread-only }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-resourcemerger-impl-merged-resource-provider-factory
  ""
  ([] (org-apache-sling-resourcemerger-impl-merged-resource-provider-factory nil))
  ([optional-params]
   (:data (org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-with-http-info optional-params))))

(defn org-apache-sling-resourcemerger-picker-overriding-with-http-info
  ""
  ([] (org-apache-sling-resourcemerger-picker-overriding-with-http-info nil))
  ([{:keys [post apply delete action location propertylist mergeroot mergeread-only ]}]
   (call-api "/system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "merge.root" mergeroot "merge.readOnly" mergeread-only }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-resourcemerger-picker-overriding
  ""
  ([] (org-apache-sling-resourcemerger-picker-overriding nil))
  ([optional-params]
   (:data (org-apache-sling-resourcemerger-picker-overriding-with-http-info optional-params))))

(defn org-apache-sling-scripting-core-impl-script-cache-impl-with-http-info
  ""
  ([] (org-apache-sling-scripting-core-impl-script-cache-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslingscriptingcachesize orgapacheslingscriptingcacheadditional-extensions ]}]
   (call-api "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.scripting.cache.size" orgapacheslingscriptingcachesize "org.apache.sling.scripting.cache.additional_extensions" (with-collection-format orgapacheslingscriptingcacheadditional-extensions :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-scripting-core-impl-script-cache-impl
  ""
  ([] (org-apache-sling-scripting-core-impl-script-cache-impl nil))
  ([optional-params]
   (:data (org-apache-sling-scripting-core-impl-script-cache-impl-with-http-info optional-params))))

(defn org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-with-http-info
  ""
  ([] (org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-with-http-info nil))
  ([{:keys [post apply delete action location propertylist logstacktraceonclose ]}]
   (call-api "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "log.stacktrace.onclose" logstacktraceonclose }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider
  ""
  ([] (org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider nil))
  ([optional-params]
   (:data (org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-with-http-info optional-params))))

(defn org-apache-sling-scripting-java-impl-java-script-engine-factory-with-http-info
  ""
  ([] (org-apache-sling-scripting-java-impl-java-script-engine-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist javaclassdebuginfo javajava-encoding javacompiler-source-vm javacompiler-target-vm ]}]
   (call-api "/system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "java.classdebuginfo" javaclassdebuginfo "java.javaEncoding" javajava-encoding "java.compilerSourceVM" javacompiler-source-vm "java.compilerTargetVM" javacompiler-target-vm }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-scripting-java-impl-java-script-engine-factory
  ""
  ([] (org-apache-sling-scripting-java-impl-java-script-engine-factory nil))
  ([optional-params]
   (:data (org-apache-sling-scripting-java-impl-java-script-engine-factory-with-http-info optional-params))))

(defn org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa-with-http-info
  ""
  ([] (org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslingscriptingjavascriptrhinoopt-level ]}]
   (call-api "/system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.scripting.javascript.rhino.optLevel" orgapacheslingscriptingjavascriptrhinoopt-level }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa
  ""
  ([] (org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa nil))
  ([optional-params]
   (:data (org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa-with-http-info optional-params))))

(defn org-apache-sling-scripting-jsp-jsp-script-engine-factory-with-http-info
  ""
  ([] (org-apache-sling-scripting-jsp-jsp-script-engine-factory-with-http-info nil))
  ([{:keys [post apply delete action location propertylist jaspercompiler-target-vm jaspercompiler-source-vm jasperclassdebuginfo jasperenable-pooling jasperie-class-id jaspergen-string-as-char-array jasperkeepgenerated jaspermappedfile jaspertrim-spaces jasperdisplay-source-fragments defaultissession ]}]
   (call-api "/system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "jasper.compilerTargetVM" jaspercompiler-target-vm "jasper.compilerSourceVM" jaspercompiler-source-vm "jasper.classdebuginfo" jasperclassdebuginfo "jasper.enablePooling" jasperenable-pooling "jasper.ieClassId" jasperie-class-id "jasper.genStringAsCharArray" jaspergen-string-as-char-array "jasper.keepgenerated" jasperkeepgenerated "jasper.mappedfile" jaspermappedfile "jasper.trimSpaces" jaspertrim-spaces "jasper.displaySourceFragments" jasperdisplay-source-fragments "default.is.session" defaultissession }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-scripting-jsp-jsp-script-engine-factory
  ""
  ([] (org-apache-sling-scripting-jsp-jsp-script-engine-factory nil))
  ([optional-params]
   (:data (org-apache-sling-scripting-jsp-jsp-script-engine-factory-with-http-info optional-params))))

(defn org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-with-http-info
  ""
  ([] (org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-with-http-info nil))
  ([{:keys [post apply delete action location propertylist orgapacheslingscriptingsightlyjsbindings ]}]
   (call-api "/system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "org.apache.sling.scripting.sightly.js.bindings" (with-collection-format orgapacheslingscriptingsightlyjsbindings :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov
  ""
  ([] (org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov nil))
  ([optional-params]
   (:data (org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-with-http-info optional-params))))

(defn org-apache-sling-security-impl-content-disposition-filter-with-http-info
  ""
  ([] (org-apache-sling-security-impl-content-disposition-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingcontentdispositionpaths slingcontentdispositionexcludedpaths slingcontentdispositionallpaths ]}]
   (call-api "/system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.content.disposition.paths" (with-collection-format slingcontentdispositionpaths :multi) "sling.content.disposition.excluded.paths" (with-collection-format slingcontentdispositionexcludedpaths :multi) "sling.content.disposition.all.paths" slingcontentdispositionallpaths }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-security-impl-content-disposition-filter
  ""
  ([] (org-apache-sling-security-impl-content-disposition-filter nil))
  ([optional-params]
   (:data (org-apache-sling-security-impl-content-disposition-filter-with-http-info optional-params))))

(defn org-apache-sling-security-impl-referrer-filter-with-http-info
  ""
  ([] (org-apache-sling-security-impl-referrer-filter-with-http-info nil))
  ([{:keys [post apply delete action location propertylist allowempty allowhosts allowhostsregexp filtermethods excludeagentsregexp ]}]
   (call-api "/system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "allow.empty" allowempty "allow.hosts" (with-collection-format allowhosts :multi) "allow.hosts.regexp" (with-collection-format allowhostsregexp :multi) "filter.methods" (with-collection-format filtermethods :multi) "exclude.agents.regexp" (with-collection-format excludeagentsregexp :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-security-impl-referrer-filter
  ""
  ([] (org-apache-sling-security-impl-referrer-filter nil))
  ([optional-params]
   (:data (org-apache-sling-security-impl-referrer-filter-with-http-info optional-params))))

(defn org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-with-http-info
  ""
  ([] (org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist usermapping userdefault userenabledefaultmapping requirevalidation ]}]
   (call-api "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "user.mapping" (with-collection-format usermapping :multi) "user.default" userdefault "user.enable.default.mapping" userenabledefaultmapping "require.validation" requirevalidation }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-serviceusermapping-impl-service-user-mapper-impl
  ""
  ([] (org-apache-sling-serviceusermapping-impl-service-user-mapper-impl nil))
  ([optional-params]
   (:data (org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-with-http-info optional-params))))

(defn org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended-with-http-info
  ""
  ([] (org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended-with-http-info nil))
  ([{:keys [post apply delete action location propertylist serviceranking usermapping ]}]
   (call-api "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "service.ranking" serviceranking "user.mapping" (with-collection-format usermapping :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended
  ""
  ([] (org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended nil))
  ([optional-params]
   (:data (org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended-with-http-info optional-params))))

(defn org-apache-sling-servlets-get-default-get-servlet-with-http-info
  ""
  ([] (org-apache-sling-servlets-get-default-get-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist aliases index indexfiles enablehtml enablejson enabletxt enablexml jsonmaximumresults ecma-suport ]}]
   (call-api "/system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "aliases" (with-collection-format aliases :multi) "index" index "index.files" (with-collection-format indexfiles :multi) "enable.html" enablehtml "enable.json" enablejson "enable.txt" enabletxt "enable.xml" enablexml "json.maximumresults" jsonmaximumresults "ecmaSuport" ecma-suport }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-servlets-get-default-get-servlet
  ""
  ([] (org-apache-sling-servlets-get-default-get-servlet nil))
  ([optional-params]
   (:data (org-apache-sling-servlets-get-default-get-servlet-with-http-info optional-params))))

(defn org-apache-sling-servlets-get-impl-version-version-info-servlet-with-http-info
  ""
  ([] (org-apache-sling-servlets-get-impl-version-version-info-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingservletselectors ecma-suport ]}]
   (call-api "/system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.servlet.selectors" (with-collection-format slingservletselectors :multi) "ecmaSuport" ecma-suport }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-servlets-get-impl-version-version-info-servlet
  ""
  ([] (org-apache-sling-servlets-get-impl-version-version-info-servlet nil))
  ([optional-params]
   (:data (org-apache-sling-servlets-get-impl-version-version-info-servlet-with-http-info optional-params))))

(defn org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-with-http-info
  ""
  ([] (org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-with-http-info nil))
  ([{:keys [post apply delete action location propertylist schedulerexpression schedulerconcurrent chunkcleanupage ]}]
   (call-api "/system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "scheduler.expression" schedulerexpression "scheduler.concurrent" schedulerconcurrent "chunk.cleanup.age" chunkcleanupage }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task
  ""
  ([] (org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task nil))
  ([optional-params]
   (:data (org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-with-http-info optional-params))))

(defn org-apache-sling-servlets-post-impl-sling-post-servlet-with-http-info
  ""
  ([] (org-apache-sling-servlets-post-impl-sling-post-servlet-with-http-info nil))
  ([{:keys [post apply delete action location propertylist servletpostdate-formats servletpostnode-name-hints servletpostnode-name-max-length servletpostcheckin-new-versionable-nodes servletpostauto-checkout servletpostauto-checkin servletpostignore-pattern ]}]
   (call-api "/system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "servlet.post.dateFormats" (with-collection-format servletpostdate-formats :multi) "servlet.post.nodeNameHints" (with-collection-format servletpostnode-name-hints :multi) "servlet.post.nodeNameMaxLength" servletpostnode-name-max-length "servlet.post.checkinNewVersionableNodes" servletpostcheckin-new-versionable-nodes "servlet.post.autoCheckout" servletpostauto-checkout "servlet.post.autoCheckin" servletpostauto-checkin "servlet.post.ignorePattern" servletpostignore-pattern }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-servlets-post-impl-sling-post-servlet
  ""
  ([] (org-apache-sling-servlets-post-impl-sling-post-servlet nil))
  ([optional-params]
   (:data (org-apache-sling-servlets-post-impl-sling-post-servlet-with-http-info optional-params))))

(defn org-apache-sling-servlets-resolver-sling-servlet-resolver-with-http-info
  ""
  ([] (org-apache-sling-servlets-resolver-sling-servlet-resolver-with-http-info nil))
  ([{:keys [post apply delete action location propertylist servletresolverservlet-root servletresolvercache-size servletresolverpaths servletresolverdefault-extensions ]}]
   (call-api "/system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "servletresolver.servletRoot" servletresolverservlet-root "servletresolver.cacheSize" servletresolvercache-size "servletresolver.paths" (with-collection-format servletresolverpaths :multi) "servletresolver.defaultExtensions" (with-collection-format servletresolverdefault-extensions :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-servlets-resolver-sling-servlet-resolver
  ""
  ([] (org-apache-sling-servlets-resolver-sling-servlet-resolver nil))
  ([optional-params]
   (:data (org-apache-sling-servlets-resolver-sling-servlet-resolver-with-http-info optional-params))))

(defn org-apache-sling-settings-impl-sling-settings-service-impl-with-http-info
  ""
  ([] (org-apache-sling-settings-impl-sling-settings-service-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist slingname slingdescription ]}]
   (call-api "/system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "sling.name" slingname "sling.description" slingdescription }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-settings-impl-sling-settings-service-impl
  ""
  ([] (org-apache-sling-settings-impl-sling-settings-service-impl nil))
  ([optional-params]
   (:data (org-apache-sling-settings-impl-sling-settings-service-impl-with-http-info optional-params))))

(defn org-apache-sling-startupfilter-impl-startup-filter-impl-with-http-info
  ""
  ([] (org-apache-sling-startupfilter-impl-startup-filter-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist activebydefault defaultmessage ]}]
   (call-api "/system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "active.by.default" activebydefault "default.message" defaultmessage }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-startupfilter-impl-startup-filter-impl
  ""
  ([] (org-apache-sling-startupfilter-impl-startup-filter-impl nil))
  ([optional-params]
   (:data (org-apache-sling-startupfilter-impl-startup-filter-impl-with-http-info optional-params))))

(defn org-apache-sling-tenant-internal-tenant-provider-impl-with-http-info
  ""
  ([] (org-apache-sling-tenant-internal-tenant-provider-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist tenantroot tenantpathmatcher ]}]
   (call-api "/system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "tenant.root" tenantroot "tenant.path.matcher" (with-collection-format tenantpathmatcher :multi) }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-tenant-internal-tenant-provider-impl
  ""
  ([] (org-apache-sling-tenant-internal-tenant-provider-impl nil))
  ([optional-params]
   (:data (org-apache-sling-tenant-internal-tenant-provider-impl-with-http-info optional-params))))

(defn org-apache-sling-tracer-internal-log-tracer-with-http-info
  ""
  ([] (org-apache-sling-tracer-internal-log-tracer-with-http-info nil))
  ([{:keys [post apply delete action location propertylist tracer-sets enabled servlet-enabled recording-cache-size-in-mb recording-cache-duration-in-secs recording-compression-enabled gzip-response ]}]
   (call-api "/system/console/configMgr/org.apache.sling.tracer.internal.LogTracer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "tracerSets" (with-collection-format tracer-sets :multi) "enabled" enabled "servletEnabled" servlet-enabled "recordingCacheSizeInMB" recording-cache-size-in-mb "recordingCacheDurationInSecs" recording-cache-duration-in-secs "recordingCompressionEnabled" recording-compression-enabled "gzipResponse" gzip-response }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-tracer-internal-log-tracer
  ""
  ([] (org-apache-sling-tracer-internal-log-tracer nil))
  ([optional-params]
   (:data (org-apache-sling-tracer-internal-log-tracer-with-http-info optional-params))))

(defn org-apache-sling-xss-impl-xss-filter-impl-with-http-info
  ""
  ([] (org-apache-sling-xss-impl-xss-filter-impl-with-http-info nil))
  ([{:keys [post apply delete action location propertylist policy-path ]}]
   (call-api "/system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "propertylist" (with-collection-format propertylist :csv) "policyPath" policy-path }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "text/plain"]
              :auth-names    ["aemAuth"]})))

(defn org-apache-sling-xss-impl-xss-filter-impl
  ""
  ([] (org-apache-sling-xss-impl-xss-filter-impl nil))
  ([optional-params]
   (:data (org-apache-sling-xss-impl-xss-filter-impl-with-http-info optional-params))))

