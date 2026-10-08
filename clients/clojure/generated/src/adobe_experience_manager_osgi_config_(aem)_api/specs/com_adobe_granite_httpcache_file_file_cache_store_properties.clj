(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-httpcache-file-file-cache-store-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-httpcache-file-file-cache-store-properties-data
  {
   (ds/opt :comadobegranitehttpcachefiledocumentRoot) config-node-property-string-spec
   (ds/opt :comadobegranitehttpcachefileincludeHost) config-node-property-string-spec
   })

(def com-adobe-granite-httpcache-file-file-cache-store-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-httpcache-file-file-cache-store-properties
     :spec com-adobe-granite-httpcache-file-file-cache-store-properties-data}))
