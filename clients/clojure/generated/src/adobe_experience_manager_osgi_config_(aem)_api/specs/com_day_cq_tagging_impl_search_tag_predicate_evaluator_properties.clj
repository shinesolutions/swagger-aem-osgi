(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-tagging-impl-search-tag-predicate-evaluator-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-tagging-impl-search-tag-predicate-evaluator-properties-data
  {
   (ds/opt :ignore_path) config-node-property-boolean-spec
   })

(def com-day-cq-tagging-impl-search-tag-predicate-evaluator-properties-spec
  (ds/spec
    {:name ::com-day-cq-tagging-impl-search-tag-predicate-evaluator-properties
     :spec com-day-cq-tagging-impl-search-tag-predicate-evaluator-properties-data}))
