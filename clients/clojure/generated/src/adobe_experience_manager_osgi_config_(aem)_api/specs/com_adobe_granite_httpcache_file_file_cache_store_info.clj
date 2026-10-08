(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-httpcache-file-file-cache-store-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-httpcache-file-file-cache-store-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-httpcache-file-file-cache-store-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-httpcache-file-file-cache-store-properties-spec
   })

(def com-adobe-granite-httpcache-file-file-cache-store-info-spec
  (ds/spec
    {:name ::com-adobe-granite-httpcache-file-file-cache-store-info
     :spec com-adobe-granite-httpcache-file-file-cache-store-info-data}))
