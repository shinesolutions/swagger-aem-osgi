(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge-properties-data
  {
   (ds/opt :slingservletselectors) config-node-property-string-spec
   (ds/opt :slingservletextensions) config-node-property-string-spec
   })

(def com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge-properties
     :spec com-adobe-cq-social-filelibrary-client-endpoints-filelibrary-download-ge-properties-data}))
