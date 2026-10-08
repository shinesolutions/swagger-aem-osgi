(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl-properties-data
  {
   (ds/opt :comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath) config-node-property-array-spec
   (ds/opt :comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency) config-node-property-string-spec
   })

(def com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl-properties
     :spec com-adobe-cq-screens-offlinecontent-impl-bulk-offline-update-service-impl-properties-data}))
