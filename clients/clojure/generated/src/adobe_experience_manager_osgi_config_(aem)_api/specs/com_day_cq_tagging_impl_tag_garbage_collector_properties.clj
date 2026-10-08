(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-tagging-impl-tag-garbage-collector-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-tagging-impl-tag-garbage-collector-properties-data
  {
   (ds/opt :schedulerexpression) config-node-property-string-spec
   })

(def com-day-cq-tagging-impl-tag-garbage-collector-properties-spec
  (ds/spec
    {:name ::com-day-cq-tagging-impl-tag-garbage-collector-properties
     :spec com-day-cq-tagging-impl-tag-garbage-collector-properties-data}))
