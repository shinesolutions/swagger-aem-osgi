(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-image-internal-font-font-helper-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-image-internal-font-font-helper-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-image-internal-font-font-helper-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-image-internal-font-font-helper-properties-spec
   })

(def com-day-cq-image-internal-font-font-helper-info-spec
  (ds/spec
    {:name ::com-day-cq-image-internal-font-font-helper-info
     :spec com-day-cq-image-internal-font-font-helper-info-data}))
