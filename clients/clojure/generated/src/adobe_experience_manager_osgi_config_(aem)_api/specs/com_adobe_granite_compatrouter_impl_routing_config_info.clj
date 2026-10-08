(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-compatrouter-impl-routing-config-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-compatrouter-impl-routing-config-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-compatrouter-impl-routing-config-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-compatrouter-impl-routing-config-properties-spec
   })

(def com-adobe-granite-compatrouter-impl-routing-config-info-spec
  (ds/spec
    {:name ::com-adobe-granite-compatrouter-impl-routing-config-info
     :spec com-adobe-granite-compatrouter-impl-routing-config-info-data}))
