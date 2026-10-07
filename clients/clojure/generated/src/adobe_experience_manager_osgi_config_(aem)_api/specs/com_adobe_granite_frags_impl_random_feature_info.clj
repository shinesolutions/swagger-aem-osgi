(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-frags-impl-random-feature-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-frags-impl-random-feature-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-frags-impl-random-feature-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-frags-impl-random-feature-properties-spec
   })

(def com-adobe-granite-frags-impl-random-feature-info-spec
  (ds/spec
    {:name ::com-adobe-granite-frags-impl-random-feature-info
     :spec com-adobe-granite-frags-impl-random-feature-info-data}))
