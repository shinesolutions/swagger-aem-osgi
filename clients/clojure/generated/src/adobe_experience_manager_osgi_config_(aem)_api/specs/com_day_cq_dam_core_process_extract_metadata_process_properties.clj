(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-process-extract-metadata-process-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-process-extract-metadata-process-properties-data
  {
   (ds/opt :processlabel) config-node-property-string-spec
   (ds/opt :cqdamenablesha1) config-node-property-boolean-spec
   })

(def com-day-cq-dam-core-process-extract-metadata-process-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-process-extract-metadata-process-properties
     :spec com-day-cq-dam-core-process-extract-metadata-process-properties-data}))
