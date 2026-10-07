(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-tagging-impl-jcr-tag-manager-factory-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-tagging-impl-jcr-tag-manager-factory-impl-properties-data
  {
   (ds/opt :validationenabled) config-node-property-boolean-spec
   })

(def com-day-cq-tagging-impl-jcr-tag-manager-factory-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-tagging-impl-jcr-tag-manager-factory-impl-properties
     :spec com-day-cq-tagging-impl-jcr-tag-manager-factory-impl-properties-data}))
