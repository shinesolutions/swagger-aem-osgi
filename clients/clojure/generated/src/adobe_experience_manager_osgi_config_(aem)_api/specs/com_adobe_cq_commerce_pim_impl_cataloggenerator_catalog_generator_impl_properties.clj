(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl-properties-data
  {
   (ds/opt :cqcommercecataloggeneratorbucketsize) config-node-property-integer-spec
   (ds/opt :cqcommercecataloggeneratorbucketname) config-node-property-string-spec
   (ds/opt :cqcommercecataloggeneratorexcludedtemplateproperties) config-node-property-array-spec
   })

(def com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl-properties
     :spec com-adobe-cq-commerce-pim-impl-cataloggenerator-catalog-generator-impl-properties-data}))
