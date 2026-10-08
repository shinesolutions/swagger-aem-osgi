(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-commons-metadata-xmp-filter-black-white-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-commons-metadata-xmp-filter-black-white-properties-data
  {
   (ds/opt :xmpfilterapply_whitelist) config-node-property-boolean-spec
   (ds/opt :xmpfilterwhitelist) config-node-property-array-spec
   (ds/opt :xmpfilterapply_blacklist) config-node-property-boolean-spec
   (ds/opt :xmpfilterblacklist) config-node-property-array-spec
   })

(def com-day-cq-dam-commons-metadata-xmp-filter-black-white-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-commons-metadata-xmp-filter-black-white-properties
     :spec com-day-cq-dam-commons-metadata-xmp-filter-black-white-properties-data}))
