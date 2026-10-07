(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-properties-data
  {
   (ds/opt :fieldWhitelist) config-node-property-array-spec
   (ds/opt :attachmentTypeBlacklist) config-node-property-array-spec
   })

(def com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-properties
     :spec com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-properties-data}))
