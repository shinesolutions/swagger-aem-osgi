(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-payload-map-cache-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-payload-map-cache-properties-data
  {
   (ds/opt :getSystemWorkflowModels) config-node-property-array-spec
   (ds/opt :getPackageRootPath) config-node-property-string-spec
   })

(def com-adobe-granite-workflow-core-payload-map-cache-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-payload-map-cache-properties
     :spec com-adobe-granite-workflow-core-payload-map-cache-properties-data}))
