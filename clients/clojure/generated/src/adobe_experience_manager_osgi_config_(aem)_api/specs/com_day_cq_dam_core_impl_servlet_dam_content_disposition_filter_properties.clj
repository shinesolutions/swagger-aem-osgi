(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter-properties-data
  {
   (ds/opt :cqmimetypeblacklist) config-node-property-array-spec
   (ds/opt :cqdamemptymime) config-node-property-boolean-spec
   })

(def com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter-properties
     :spec com-day-cq-dam-core-impl-servlet-dam-content-disposition-filter-properties-data}))
