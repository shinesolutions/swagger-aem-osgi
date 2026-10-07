(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl-properties-data
  {
   (ds/opt :comadobecqdammacsyncdamsyncserviceregistered_paths) config-node-property-array-spec
   (ds/opt :comadobecqdammacsyncdamsyncservicesyncrenditions) config-node-property-boolean-spec
   (ds/opt :comadobecqdammacsyncdamsyncservicereplicatethreadwaitms) config-node-property-integer-spec
   (ds/opt :comadobecqdammacsyncdamsyncserviceplatform) config-node-property-drop-down-spec
   })

(def com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl-properties
     :spec com-adobe-cq-dam-mac-sync-impl-dam-sync-service-impl-properties-data}))
