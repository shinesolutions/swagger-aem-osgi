(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-segment-standby-store-standby-store-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-segment-standby-store-standby-store-service-properties-data
  {
   (ds/opt :orgapacheslinginstallerconfigurationpersist) config-node-property-boolean-spec
   (ds/opt :mode) config-node-property-drop-down-spec
   (ds/opt :port) config-node-property-integer-spec
   (ds/opt :primaryhost) config-node-property-string-spec
   (ds/opt :interval) config-node-property-integer-spec
   (ds/opt :primaryallowed-client-ip-ranges) config-node-property-array-spec
   (ds/opt :secure) config-node-property-boolean-spec
   (ds/opt :standbyreadtimeout) config-node-property-integer-spec
   (ds/opt :standbyautoclean) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-segment-standby-store-standby-store-service-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-segment-standby-store-standby-store-service-properties
     :spec org-apache-jackrabbit-oak-segment-standby-store-standby-store-service-properties-data}))
