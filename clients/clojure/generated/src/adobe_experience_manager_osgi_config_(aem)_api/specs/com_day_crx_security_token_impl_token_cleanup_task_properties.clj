(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-crx-security-token-impl-token-cleanup-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-crx-security-token-impl-token-cleanup-task-properties-data
  {
   (ds/opt :enabletokencleanuptask) config-node-property-boolean-spec
   (ds/opt :schedulerexpression) config-node-property-string-spec
   (ds/opt :batchsize) config-node-property-integer-spec
   })

(def com-day-crx-security-token-impl-token-cleanup-task-properties-spec
  (ds/spec
    {:name ::com-day-crx-security-token-impl-token-cleanup-task-properties
     :spec com-day-crx-security-token-impl-token-cleanup-task-properties-data}))
