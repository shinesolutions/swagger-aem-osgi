(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-info-spec
  (ds/spec
    {:name ::com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-info
     :spec com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-info-data}))
