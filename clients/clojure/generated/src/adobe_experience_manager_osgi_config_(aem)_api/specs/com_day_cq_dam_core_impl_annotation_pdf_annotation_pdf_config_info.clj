(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-properties-spec
   })

(def com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-info
     :spec com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-info-data}))
