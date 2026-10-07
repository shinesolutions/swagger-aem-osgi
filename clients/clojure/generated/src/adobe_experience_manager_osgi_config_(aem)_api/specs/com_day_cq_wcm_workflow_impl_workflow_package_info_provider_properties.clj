(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-workflow-impl-workflow-package-info-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-workflow-impl-workflow-package-info-provider-properties-data
  {
   (ds/opt :workflowpackageinfoproviderfilter) config-node-property-array-spec
   (ds/opt :workflowpackageinfoproviderfilterrootpath) config-node-property-string-spec
   })

(def com-day-cq-wcm-workflow-impl-workflow-package-info-provider-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-workflow-impl-workflow-package-info-provider-properties
     :spec com-day-cq-wcm-workflow-impl-workflow-package-info-provider-properties-data}))
