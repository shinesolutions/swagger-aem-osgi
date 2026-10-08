(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-properties-spec
   })

(def com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-info
     :spec com-day-cq-dam-core-impl-gfx-commons-gfx-renderer-info-data}))
