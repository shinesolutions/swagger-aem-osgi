(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-service-impl-default-data-provider-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-service-impl-default-data-provider-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-forms-common-service-impl-default-data-provider-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-forms-common-service-impl-default-data-provider-properties-spec
   })

(def com-adobe-forms-common-service-impl-default-data-provider-info-spec
  (ds/spec
    {:name ::com-adobe-forms-common-service-impl-default-data-provider-info
     :spec com-adobe-forms-common-service-impl-default-data-provider-info-data}))
