(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-offloading-impl-offloading-configurator-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-offloading-impl-offloading-configurator-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-offloading-impl-offloading-configurator-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-offloading-impl-offloading-configurator-properties-spec
   })

(def com-adobe-granite-offloading-impl-offloading-configurator-info-spec
  (ds/spec
    {:name ::com-adobe-granite-offloading-impl-offloading-configurator-info
     :spec com-adobe-granite-offloading-impl-offloading-configurator-info-data}))
