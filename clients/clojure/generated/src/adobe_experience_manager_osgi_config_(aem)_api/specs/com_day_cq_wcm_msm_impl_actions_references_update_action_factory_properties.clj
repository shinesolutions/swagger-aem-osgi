(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-msm-impl-actions-references-update-action-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-msm-impl-actions-references-update-action-factory-properties-data
  {
   (ds/opt :cqwcmmsmactionexcludednodetypes) config-node-property-array-spec
   (ds/opt :cqwcmmsmactionexcludedparagraphitems) config-node-property-array-spec
   (ds/opt :cqwcmmsmactionexcludedprops) config-node-property-array-spec
   (ds/opt :cqwcmmsmimplactionreferencesupdateprop_updateNested) config-node-property-boolean-spec
   })

(def com-day-cq-wcm-msm-impl-actions-references-update-action-factory-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-msm-impl-actions-references-update-action-factory-properties
     :spec com-day-cq-wcm-msm-impl-actions-references-update-action-factory-properties-data}))
