(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-authorization-authorization-configur-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-security-authorization-authorization-configur-properties-data
  {
   (ds/opt :permissionsJr2) config-node-property-drop-down-spec
   (ds/opt :importBehavior) config-node-property-drop-down-spec
   (ds/opt :readPaths) config-node-property-array-spec
   (ds/opt :administrativePrincipals) config-node-property-array-spec
   (ds/opt :configurationRanking) config-node-property-integer-spec
   })

(def org-apache-jackrabbit-oak-security-authorization-authorization-configur-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-security-authorization-authorization-configur-properties
     :spec org-apache-jackrabbit-oak-security-authorization-authorization-configur-properties-data}))
