(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-httpcache-impl-outer-cache-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-httpcache-impl-outer-cache-filter-properties-data
  {
   (ds/opt :comadobegranitehttpcacheurlpaths) config-node-property-array-spec
   })

(def com-adobe-granite-httpcache-impl-outer-cache-filter-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-httpcache-impl-outer-cache-filter-properties
     :spec com-adobe-granite-httpcache-impl-outer-cache-filter-properties-data}))
