(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-cors-cors-authentication-filter-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-cors-cors-authentication-filter-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-cors-cors-authentication-filter-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-commons-cors-cors-authentication-filter-properties-spec
   })

(def com-adobe-cq-social-commons-cors-cors-authentication-filter-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-cors-cors-authentication-filter-info
     :spec com-adobe-cq-social-commons-cors-cors-authentication-filter-info-data}))
