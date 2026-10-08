(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist-properties-data
  {
   (ds/opt :effectiveBundleListPath) config-node-property-string-spec
   })

(def com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist-properties-spec
  (ds/spec
    {:name ::com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist-properties
     :spec com-day-cq-compat-codeupgrade-impl-version-range-task-ignorelist-properties-data}))
