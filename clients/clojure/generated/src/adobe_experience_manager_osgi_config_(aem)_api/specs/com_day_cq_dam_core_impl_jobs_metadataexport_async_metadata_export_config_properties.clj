(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config-properties-data
  {
   (ds/opt :operation) config-node-property-string-spec
   (ds/opt :emailEnabled) config-node-property-boolean-spec
   })

(def com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config-properties
     :spec com-day-cq-dam-core-impl-jobs-metadataexport-async-metadata-export-config-properties-data}))
