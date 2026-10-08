(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mailer-impl-email-cq-retriever-template-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mailer-impl-email-cq-retriever-template-factory-properties-data
  {
   (ds/opt :maileremailembed) config-node-property-boolean-spec
   (ds/opt :maileremailcharset) config-node-property-string-spec
   (ds/opt :maileremailretrieverUserID) config-node-property-string-spec
   (ds/opt :maileremailretrieverUserPWD) config-node-property-string-spec
   })

(def com-day-cq-mailer-impl-email-cq-retriever-template-factory-properties-spec
  (ds/spec
    {:name ::com-day-cq-mailer-impl-email-cq-retriever-template-factory-properties
     :spec com-day-cq-mailer-impl-email-cq-retriever-template-factory-properties-data}))
