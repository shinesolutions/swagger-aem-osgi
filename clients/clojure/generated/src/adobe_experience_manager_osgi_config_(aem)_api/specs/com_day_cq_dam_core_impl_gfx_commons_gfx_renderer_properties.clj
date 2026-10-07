(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-properties-data
  {
   (ds/opt :skipbufferedcache) config-node-property-boolean-spec
   })

(def com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-properties
     :spec com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-properties-data}))
