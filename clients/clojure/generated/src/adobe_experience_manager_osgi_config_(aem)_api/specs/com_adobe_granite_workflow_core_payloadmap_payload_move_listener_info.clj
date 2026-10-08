(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-payloadmap-payload-move-listener-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-payloadmap-payload-move-listener-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-payloadmap-payload-move-listener-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-workflow-core-payloadmap-payload-move-listener-properties-spec
   })

(def com-adobe-granite-workflow-core-payloadmap-payload-move-listener-info-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-payloadmap-payload-move-listener-info
     :spec com-adobe-granite-workflow-core-payloadmap-payload-move-listener-info-data}))
