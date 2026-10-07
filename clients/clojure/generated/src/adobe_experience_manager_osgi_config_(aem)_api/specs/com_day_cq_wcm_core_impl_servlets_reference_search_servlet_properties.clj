(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-servlets-reference-search-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-servlets-reference-search-servlet-properties-data
  {
   (ds/opt :referencesearchservletmaxReferencesPerPage) config-node-property-integer-spec
   (ds/opt :referencesearchservletmaxPages) config-node-property-integer-spec
   })

(def com-day-cq-wcm-core-impl-servlets-reference-search-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-servlets-reference-search-servlet-properties
     :spec com-day-cq-wcm-core-impl-servlets-reference-search-servlet-properties-data}))
