(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-user-impl-transport-http-to-publisher-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-user-impl-transport-http-to-publisher-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-user-impl-transport-http-to-publisher-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-user-impl-transport-http-to-publisher-properties-spec
   })

(def com-adobe-cq-social-user-impl-transport-http-to-publisher-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-user-impl-transport-http-to-publisher-info
     :spec com-adobe-cq-social-user-impl-transport-http-to-publisher-info-data}))
