(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider-properties-data
  {
   (ds/opt :priorityOrder) config-node-property-integer-spec
   (ds/opt :replyEmailPatterns) config-node-property-array-spec
   })

(def com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider-properties
     :spec com-adobe-cq-social-commons-emailreply-impl-yahoo-email-client-provider-properties-data}))
