(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-forms-impl-mail-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-foundation-forms-impl-mail-servlet-properties-data
  {
   (ds/opt :slingservletresourceTypes) config-node-property-string-spec
   (ds/opt :slingservletselectors) config-node-property-string-spec
   (ds/opt :resourcewhitelist) config-node-property-array-spec
   (ds/opt :resourceblacklist) config-node-property-string-spec
   })

(def com-day-cq-wcm-foundation-forms-impl-mail-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-foundation-forms-impl-mail-servlet-properties
     :spec com-day-cq-wcm-foundation-forms-impl-mail-servlet-properties-data}))
