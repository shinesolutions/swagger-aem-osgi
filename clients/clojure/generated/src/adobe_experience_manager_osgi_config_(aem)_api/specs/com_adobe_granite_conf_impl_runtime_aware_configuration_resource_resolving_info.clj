(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-properties-spec
   })

(def com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-info-spec
  (ds/spec
    {:name ::com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-info
     :spec com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-info-data}))
