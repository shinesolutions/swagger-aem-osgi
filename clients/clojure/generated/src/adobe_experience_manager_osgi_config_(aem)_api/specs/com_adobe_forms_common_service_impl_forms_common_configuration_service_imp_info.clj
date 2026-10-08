(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-properties-spec
   })

(def com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-info-spec
  (ds/spec
    {:name ::com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-info
     :spec com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-info-data}))
