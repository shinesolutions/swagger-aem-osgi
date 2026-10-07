(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-scoring-impl-scoring-event-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-scoring-impl-scoring-event-listener-properties-data
  {
   (ds/opt :eventtopics) config-node-property-string-spec
   (ds/opt :eventfilter) config-node-property-string-spec
   })

(def com-adobe-cq-social-scoring-impl-scoring-event-listener-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-scoring-impl-scoring-event-listener-properties
     :spec com-adobe-cq-social-scoring-impl-scoring-event-listener-properties-data}))
