(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-commons-util-impl-asset-cache-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-commons-util-impl-asset-cache-impl-properties-data
  {
   (ds/opt :largefilemin) config-node-property-integer-spec
   (ds/opt :cacheapply) config-node-property-boolean-spec
   (ds/opt :mimetypes) config-node-property-array-spec
   })

(def com-day-cq-dam-commons-util-impl-asset-cache-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-commons-util-impl-asset-cache-impl-properties
     :spec com-day-cq-dam-commons-util-impl-asset-cache-impl-properties-data}))
