(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-properties-spec
   })

(def com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-info
     :spec com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-info-data}))
