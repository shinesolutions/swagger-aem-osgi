(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process-properties-data
  {
   (ds/opt :processlabel) config-node-property-string-spec
   })

(def com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process-properties
     :spec com-day-cq-dam-s7dam-common-process-video-thumbnail-download-process-properties-data}))
