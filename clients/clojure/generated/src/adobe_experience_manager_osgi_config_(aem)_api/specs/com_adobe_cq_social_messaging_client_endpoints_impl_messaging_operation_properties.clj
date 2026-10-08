(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation-properties-data
  {
   (ds/opt :messageproperties) config-node-property-array-spec
   (ds/opt :messageBoxSizeLimit) config-node-property-integer-spec
   (ds/opt :messageCountLimit) config-node-property-integer-spec
   (ds/opt :notifyFailure) config-node-property-boolean-spec
   (ds/opt :failureMessageFrom) config-node-property-string-spec
   (ds/opt :failureTemplatePath) config-node-property-string-spec
   (ds/opt :maxRetries) config-node-property-integer-spec
   (ds/opt :minWaitBetweenRetries) config-node-property-integer-spec
   (ds/opt :countUpdatePoolSize) config-node-property-integer-spec
   (ds/opt :inboxpath) config-node-property-string-spec
   (ds/opt :sentitemspath) config-node-property-string-spec
   (ds/opt :supportAttachments) config-node-property-boolean-spec
   (ds/opt :supportGroupMessaging) config-node-property-boolean-spec
   (ds/opt :maxTotalRecipients) config-node-property-integer-spec
   (ds/opt :batchSize) config-node-property-integer-spec
   (ds/opt :maxTotalAttachmentSize) config-node-property-integer-spec
   (ds/opt :attachmentTypeBlacklist) config-node-property-array-spec
   (ds/opt :allowedAttachmentTypes) config-node-property-array-spec
   (ds/opt :serviceSelector) config-node-property-string-spec
   (ds/opt :fieldWhitelist) config-node-property-array-spec
   })

(def com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation-properties
     :spec com-adobe-cq-social-messaging-client-endpoints-impl-messaging-operation-properties-data}))
