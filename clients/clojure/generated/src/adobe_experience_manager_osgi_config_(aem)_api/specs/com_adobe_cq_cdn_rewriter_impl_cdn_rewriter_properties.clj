(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :cdnrewriterattributes) config-node-property-array-spec
   (ds/opt :cdnrewriterdistributiondomain) config-node-property-string-spec
   })

(def com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-properties
     :spec com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-properties-data}))
