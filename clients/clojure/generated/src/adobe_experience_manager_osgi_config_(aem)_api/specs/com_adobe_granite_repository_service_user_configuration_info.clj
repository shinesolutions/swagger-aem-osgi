(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-service-user-configuration-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-service-user-configuration-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-repository-service-user-configuration-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-repository-service-user-configuration-properties-spec
   })

(def com-adobe-granite-repository-service-user-configuration-info-spec
  (ds/spec
    {:name ::com-adobe-granite-repository-service-user-configuration-info
     :spec com-adobe-granite-repository-service-user-configuration-info-data}))
