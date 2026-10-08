(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-handler-ffmpeg-locator-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-handler-ffmpeg-locator-impl-properties-data
  {
   (ds/opt :executablesearchpath) config-node-property-array-spec
   })

(def com-day-cq-dam-handler-ffmpeg-locator-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-handler-ffmpeg-locator-impl-properties
     :spec com-day-cq-dam-handler-ffmpeg-locator-impl-properties-data}))
