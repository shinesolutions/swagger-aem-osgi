(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl-properties-data
  {
   (ds/opt :cdnconfigdistributiondomain) config-node-property-string-spec
   (ds/opt :cdnconfigenablerewriting) config-node-property-boolean-spec
   (ds/opt :cdnconfigpathprefixes) config-node-property-array-spec
   (ds/opt :cdnconfigcdnttl) config-node-property-integer-spec
   (ds/opt :cdnconfigapplicationprotocol) config-node-property-string-spec
   })

(def com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl-properties
     :spec com-adobe-cq-cdn-rewriter-impl-cdn-config-service-impl-properties-data}))
