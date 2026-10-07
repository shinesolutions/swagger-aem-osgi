(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-payloadmap-payload-move-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-payloadmap-payload-move-listener-properties-data
  {
   (ds/opt :payloadmovewhitelist) config-node-property-array-spec
   (ds/opt :payloadmovehandlefromworkflowprocess) config-node-property-boolean-spec
   })

(def com-adobe-granite-workflow-core-payloadmap-payload-move-listener-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-payloadmap-payload-move-listener-properties
     :spec com-adobe-granite-workflow-core-payloadmap-payload-move-listener-properties-data}))
