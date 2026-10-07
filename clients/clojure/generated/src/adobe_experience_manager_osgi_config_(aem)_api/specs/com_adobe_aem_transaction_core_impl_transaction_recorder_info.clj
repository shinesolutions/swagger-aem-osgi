(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-transaction-core-impl-transaction-recorder-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-transaction-core-impl-transaction-recorder-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-transaction-core-impl-transaction-recorder-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-aem-transaction-core-impl-transaction-recorder-properties-spec
   })

(def com-adobe-aem-transaction-core-impl-transaction-recorder-info-spec
  (ds/spec
    {:name ::com-adobe-aem-transaction-core-impl-transaction-recorder-info
     :spec com-adobe-aem-transaction-core-impl-transaction-recorder-info-data}))
