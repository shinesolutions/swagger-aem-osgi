(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-designimporter-design-package-importer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-designimporter-design-package-importer-properties-data
  {
   (ds/opt :extractfilter) config-node-property-array-spec
   })

(def com-day-cq-wcm-designimporter-design-package-importer-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-designimporter-design-package-importer-properties
     :spec com-day-cq-wcm-designimporter-design-package-importer-properties-data}))
