(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-properties-spec
   })

(def com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-info-spec
  (ds/spec
    {:name ::com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-info
     :spec com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-info-data}))
