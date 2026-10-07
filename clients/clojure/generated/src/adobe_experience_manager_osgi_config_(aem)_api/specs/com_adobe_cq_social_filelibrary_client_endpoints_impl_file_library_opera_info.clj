(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-properties-spec
   })

(def com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-info
     :spec com-adobe-cq-social-filelibrary-client-endpoints-impl-file-library-opera-info-data}))
