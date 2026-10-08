(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-user-user-configuration-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-security-user-user-configuration-impl-properties-data
  {
   (ds/opt :usersPath) config-node-property-string-spec
   (ds/opt :groupsPath) config-node-property-string-spec
   (ds/opt :systemRelativePath) config-node-property-string-spec
   (ds/opt :defaultDepth) config-node-property-integer-spec
   (ds/opt :importBehavior) config-node-property-drop-down-spec
   (ds/opt :passwordHashAlgorithm) config-node-property-string-spec
   (ds/opt :passwordHashIterations) config-node-property-integer-spec
   (ds/opt :passwordSaltSize) config-node-property-integer-spec
   (ds/opt :omitAdminPw) config-node-property-boolean-spec
   (ds/opt :supportAutoSave) config-node-property-boolean-spec
   (ds/opt :passwordMaxAge) config-node-property-integer-spec
   (ds/opt :initialPasswordChange) config-node-property-boolean-spec
   (ds/opt :passwordHistorySize) config-node-property-integer-spec
   (ds/opt :passwordExpiryForAdmin) config-node-property-boolean-spec
   (ds/opt :cacheExpiration) config-node-property-integer-spec
   (ds/opt :enableRFC7613UsercaseMappedProfile) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-security-user-user-configuration-impl-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-security-user-user-configuration-impl-properties
     :spec org-apache-jackrabbit-oak-security-user-user-configuration-impl-properties-data}))
