(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider-properties-data
  {
   (ds/opt :replyEmailPatterns) config-node-property-array-spec
   (ds/opt :priorityOrder) config-node-property-integer-spec
   })

(def com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider-properties
     :spec com-adobe-cq-social-commons-emailreply-impl-unknown-email-client-provider-properties-data}))
