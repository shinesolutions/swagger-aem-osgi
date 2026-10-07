(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-payload-map-cache-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-payload-map-cache-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-payload-map-cache-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-workflow-core-payload-map-cache-properties-spec
   })

(def com-adobe-granite-workflow-core-payload-map-cache-info-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-payload-map-cache-info
     :spec com-adobe-granite-workflow-core-payload-map-cache-info-data}))
