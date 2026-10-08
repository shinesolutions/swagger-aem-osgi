(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl-properties-data
  {
   (ds/opt :linkexpiredprefix) config-node-property-string-spec
   (ds/opt :linkexpiredremove) config-node-property-boolean-spec
   (ds/opt :linkexpiredsuffix) config-node-property-string-spec
   (ds/opt :linkinvalidprefix) config-node-property-string-spec
   (ds/opt :linkinvalidremove) config-node-property-boolean-spec
   (ds/opt :linkinvalidsuffix) config-node-property-string-spec
   (ds/opt :linkpredatedprefix) config-node-property-string-spec
   (ds/opt :linkpredatedremove) config-node-property-boolean-spec
   (ds/opt :linkpredatedsuffix) config-node-property-string-spec
   (ds/opt :linkwcmmodes) config-node-property-array-spec
   })

(def com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl-properties
     :spec com-day-cq-wcm-core-impl-link-checker-configuration-factory-impl-properties-data}))
