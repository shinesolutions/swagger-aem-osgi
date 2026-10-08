(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-tagging-impl-tag-garbage-collector-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-tagging-impl-tag-garbage-collector-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-tagging-impl-tag-garbage-collector-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-tagging-impl-tag-garbage-collector-properties-spec
   })

(def com-day-cq-tagging-impl-tag-garbage-collector-info-spec
  (ds/spec
    {:name ::com-day-cq-tagging-impl-tag-garbage-collector-info
     :spec com-day-cq-tagging-impl-tag-garbage-collector-info-data}))
