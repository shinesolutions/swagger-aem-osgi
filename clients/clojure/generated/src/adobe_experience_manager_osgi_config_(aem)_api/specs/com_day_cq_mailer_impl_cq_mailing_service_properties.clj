(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mailer-impl-cq-mailing-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mailer-impl-cq-mailing-service-properties-data
  {
   (ds/opt :maxrecipientcount) config-node-property-string-spec
   })

(def com-day-cq-mailer-impl-cq-mailing-service-properties-spec
  (ds/spec
    {:name ::com-day-cq-mailer-impl-cq-mailing-service-properties
     :spec com-day-cq-mailer-impl-cq-mailing-service-properties-data}))
