(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-workflow-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-workflow-config-properties-data
  {
   (ds/opt :cqworkflowconfigworkflowpackagesrootpath) config-node-property-array-spec
   (ds/opt :cqworkflowconfigworkflowprocesslegacymode) config-node-property-boolean-spec
   (ds/opt :cqworkflowconfigallowlocking) config-node-property-boolean-spec
   })

(def com-adobe-granite-workflow-core-workflow-config-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-workflow-config-properties
     :spec com-adobe-granite-workflow-core-workflow-config-properties-data}))
