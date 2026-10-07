(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-fd-fp-config-forms-portal-scheduler-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-fd-fp-config-forms-portal-scheduler-service-properties-data
  {
   (ds/opt :formportalinterval) config-node-property-string-spec
   })

(def com-adobe-fd-fp-config-forms-portal-scheduler-service-properties-spec
  (ds/spec
    {:name ::com-adobe-fd-fp-config-forms-portal-scheduler-service-properties
     :spec com-adobe-fd-fp-config-forms-portal-scheduler-service-properties-data}))
