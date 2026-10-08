(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mailer-default-mail-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mailer-default-mail-service-properties-data
  {
   (ds/opt :smtphost) config-node-property-string-spec
   (ds/opt :smtpport) config-node-property-integer-spec
   (ds/opt :smtpuser) config-node-property-string-spec
   (ds/opt :smtppassword) config-node-property-string-spec
   (ds/opt :fromaddress) config-node-property-string-spec
   (ds/opt :smtpssl) config-node-property-boolean-spec
   (ds/opt :smtpstarttls) config-node-property-boolean-spec
   (ds/opt :debugemail) config-node-property-boolean-spec
   })

(def com-day-cq-mailer-default-mail-service-properties-spec
  (ds/spec
    {:name ::com-day-cq-mailer-default-mail-service-properties
     :spec com-day-cq-mailer-default-mail-service-properties-data}))
