(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-enablement-services-impl-author-marker-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-enablement-services-impl-author-marker-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-enablement-services-impl-author-marker-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-enablement-services-impl-author-marker-impl-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-adobe-cq-social-enablement-services-impl-author-marker-impl-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-enablement-services-impl-author-marker-impl-info
     :spec com-adobe-cq-social-enablement-services-impl-author-marker-impl-info-data}))
