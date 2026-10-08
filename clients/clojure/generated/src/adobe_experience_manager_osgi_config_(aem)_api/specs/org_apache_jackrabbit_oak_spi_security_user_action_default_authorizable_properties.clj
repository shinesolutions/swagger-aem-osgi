(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable-properties-data
  {
   (ds/opt :enabledActions) config-node-property-drop-down-spec
   (ds/opt :userPrivilegeNames) config-node-property-array-spec
   (ds/opt :groupPrivilegeNames) config-node-property-array-spec
   (ds/opt :constraint) config-node-property-string-spec
   })

(def org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable-properties
     :spec org-apache-jackrabbit-oak-spi-security-user-action-default-authorizable-properties-data}))
