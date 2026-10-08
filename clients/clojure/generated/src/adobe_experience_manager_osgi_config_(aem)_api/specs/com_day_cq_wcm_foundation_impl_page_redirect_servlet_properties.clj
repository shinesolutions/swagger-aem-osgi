(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-impl-page-redirect-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-foundation-impl-page-redirect-servlet-properties-data
  {
   (ds/opt :excludedresourcetypes) config-node-property-array-spec
   })

(def com-day-cq-wcm-foundation-impl-page-redirect-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-foundation-impl-page-redirect-servlet-properties
     :spec com-day-cq-wcm-foundation-impl-page-redirect-servlet-properties-data}))
