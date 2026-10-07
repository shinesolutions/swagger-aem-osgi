(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-impl-screens-channel-post-processor-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-impl-screens-channel-post-processor-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-impl-screens-channel-post-processor-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-screens-impl-screens-channel-post-processor-properties-spec
   })

(def com-adobe-cq-screens-impl-screens-channel-post-processor-info-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-impl-screens-channel-post-processor-info
     :spec com-adobe-cq-screens-impl-screens-channel-post-processor-info-data}))
