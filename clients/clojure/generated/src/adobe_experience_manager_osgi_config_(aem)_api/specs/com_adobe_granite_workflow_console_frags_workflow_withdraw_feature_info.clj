(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-properties-spec
   })

(def com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-info-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-info
     :spec com-adobe-granite-workflow-console-frags-workflow-withdraw-feature-info-data}))
