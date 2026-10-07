(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-impl-screens-channel-post-processor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-impl-screens-channel-post-processor-properties-data
  {
   (ds/opt :screenschannelspropertiestoremove) config-node-property-array-spec
   })

(def com-adobe-cq-screens-impl-screens-channel-post-processor-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-impl-screens-channel-post-processor-properties
     :spec com-adobe-cq-screens-impl-screens-channel-post-processor-properties-data}))
