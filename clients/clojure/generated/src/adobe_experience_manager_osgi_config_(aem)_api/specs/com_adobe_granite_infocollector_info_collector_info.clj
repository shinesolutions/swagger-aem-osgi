(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-infocollector-info-collector-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-infocollector-info-collector-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-infocollector-info-collector-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-infocollector-info-collector-properties-spec
   })

(def com-adobe-granite-infocollector-info-collector-info-spec
  (ds/spec
    {:name ::com-adobe-granite-infocollector-info-collector-info
     :spec com-adobe-granite-infocollector-info-collector-info-data}))
