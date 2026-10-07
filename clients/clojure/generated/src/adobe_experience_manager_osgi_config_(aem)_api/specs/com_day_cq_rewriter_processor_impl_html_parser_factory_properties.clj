(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-processor-impl-html-parser-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-rewriter-processor-impl-html-parser-factory-properties-data
  {
   (ds/opt :htmlparserprocessTags) config-node-property-array-spec
   (ds/opt :htmlparserpreserveCamelCase) config-node-property-boolean-spec
   })

(def com-day-cq-rewriter-processor-impl-html-parser-factory-properties-spec
  (ds/spec
    {:name ::com-day-cq-rewriter-processor-impl-html-parser-factory-properties
     :spec com-day-cq-rewriter-processor-impl-html-parser-factory-properties-data}))
