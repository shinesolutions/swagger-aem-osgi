(ns adobe-experience-manager-osgi-config-(aem)-api.specs.guide-localization-service-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.guide-localization-service-properties :refer :all]
            )
  (:import (java.io File)))


(def guide-localization-service-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) guide-localization-service-properties-spec
   })

(def guide-localization-service-info-spec
  (ds/spec
    {:name ::guide-localization-service-info
     :spec guide-localization-service-info-data}))
