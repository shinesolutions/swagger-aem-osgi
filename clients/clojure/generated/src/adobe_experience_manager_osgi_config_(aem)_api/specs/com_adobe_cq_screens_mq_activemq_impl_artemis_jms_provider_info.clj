(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-properties-spec
   })

(def com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-info-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-info
     :spec com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-info-data}))
