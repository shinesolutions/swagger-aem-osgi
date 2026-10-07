(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-properties-spec
   })

(def com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-info-spec
  (ds/spec
    {:name ::com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-info
     :spec com-adobe-granite-distribution-core-impl-crypto-distribution-transport-se-info-data}))
