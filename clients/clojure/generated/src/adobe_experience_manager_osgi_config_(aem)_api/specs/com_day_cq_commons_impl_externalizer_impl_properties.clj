(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-commons-impl-externalizer-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-commons-impl-externalizer-impl-properties-data
  {
   (ds/opt :externalizerdomains) config-node-property-array-spec
   (ds/opt :externalizerhost) config-node-property-string-spec
   (ds/opt :externalizercontextpath) config-node-property-string-spec
   (ds/opt :externalizerencodedpath) config-node-property-boolean-spec
   })

(def com-day-cq-commons-impl-externalizer-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-commons-impl-externalizer-impl-properties
     :spec com-day-cq-commons-impl-externalizer-impl-properties-data}))
