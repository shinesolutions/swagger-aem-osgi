(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-csrf-impl-csrf-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-csrf-impl-csrf-filter-properties-data
  {
   (ds/opt :filtermethods) config-node-property-array-spec
   (ds/opt :filterenablesafeuseragents) config-node-property-boolean-spec
   (ds/opt :filtersafeuseragents) config-node-property-array-spec
   (ds/opt :filterexcludedpaths) config-node-property-array-spec
   })

(def com-adobe-granite-csrf-impl-csrf-filter-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-csrf-impl-csrf-filter-properties
     :spec com-adobe-granite-csrf-impl-csrf-filter-properties-data}))
