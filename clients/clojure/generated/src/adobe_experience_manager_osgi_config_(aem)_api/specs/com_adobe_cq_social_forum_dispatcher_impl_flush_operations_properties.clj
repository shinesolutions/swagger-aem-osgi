(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-forum-dispatcher-impl-flush-operations-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-forum-dispatcher-impl-flush-operations-properties-data
  {
   (ds/opt :extensionorder) config-node-property-integer-spec
   (ds/opt :flushforumontopic) config-node-property-boolean-spec
   })

(def com-adobe-cq-social-forum-dispatcher-impl-flush-operations-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-forum-dispatcher-impl-flush-operations-properties
     :spec com-adobe-cq-social-forum-dispatcher-impl-flush-operations-properties-data}))
