(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-octopus-ncomm-bootstrap-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-octopus-ncomm-bootstrap-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-octopus-ncomm-bootstrap-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-octopus-ncomm-bootstrap-properties-spec
   })

(def com-adobe-octopus-ncomm-bootstrap-info-spec
  (ds/spec
    {:name ::com-adobe-octopus-ncomm-bootstrap-info
     :spec com-adobe-octopus-ncomm-bootstrap-info-data}))
