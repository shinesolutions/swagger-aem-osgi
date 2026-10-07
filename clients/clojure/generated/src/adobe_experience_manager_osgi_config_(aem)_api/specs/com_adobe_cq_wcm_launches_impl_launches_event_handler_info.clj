(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-launches-impl-launches-event-handler-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-launches-impl-launches-event-handler-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-wcm-launches-impl-launches-event-handler-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-wcm-launches-impl-launches-event-handler-properties-spec
   })

(def com-adobe-cq-wcm-launches-impl-launches-event-handler-info-spec
  (ds/spec
    {:name ::com-adobe-cq-wcm-launches-impl-launches-event-handler-info
     :spec com-adobe-cq-wcm-launches-impl-launches-event-handler-info-data}))
