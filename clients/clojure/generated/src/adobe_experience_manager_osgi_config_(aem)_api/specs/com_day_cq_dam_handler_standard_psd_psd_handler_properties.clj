(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-handler-standard-psd-psd-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-handler-standard-psd-psd-handler-properties-data
  {
   (ds/opt :large_file_threshold) config-node-property-integer-spec
   })

(def com-day-cq-dam-handler-standard-psd-psd-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-handler-standard-psd-psd-handler-properties
     :spec com-day-cq-dam-handler-standard-psd-psd-handler-properties-data}))
