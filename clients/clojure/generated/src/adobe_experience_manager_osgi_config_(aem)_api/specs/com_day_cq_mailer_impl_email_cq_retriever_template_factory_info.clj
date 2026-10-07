(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mailer-impl-email-cq-retriever-template-factory-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mailer-impl-email-cq-retriever-template-factory-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mailer-impl-email-cq-retriever-template-factory-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-mailer-impl-email-cq-retriever-template-factory-properties-spec
   })

(def com-day-cq-mailer-impl-email-cq-retriever-template-factory-info-spec
  (ds/spec
    {:name ::com-day-cq-mailer-impl-email-cq-retriever-template-factory-info
     :spec com-day-cq-mailer-impl-email-cq-retriever-template-factory-info-data}))
