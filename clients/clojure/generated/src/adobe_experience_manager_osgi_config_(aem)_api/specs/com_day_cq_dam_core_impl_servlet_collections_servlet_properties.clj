(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-servlet-collections-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-servlet-collections-servlet-properties-data
  {
   (ds/opt :cqdambatchcollectionsproperties) config-node-property-array-spec
   (ds/opt :cqdambatchcollectionslimit) config-node-property-integer-spec
   })

(def com-day-cq-dam-core-impl-servlet-collections-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-servlet-collections-servlet-properties
     :spec com-day-cq-dam-core-impl-servlet-collections-servlet-properties-data}))
