(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet-properties-data
  {
   (ds/opt :servicename) config-node-property-string-spec
   (ds/opt :slingservletresourceTypes) config-node-property-string-spec
   (ds/opt :slingservletselectors) config-node-property-string-spec
   (ds/opt :slingservletmethods) config-node-property-array-spec
   (ds/opt :formsformchooserservletadvansesearchrequire) config-node-property-boolean-spec
   })

(def com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet-properties
     :spec com-day-cq-wcm-foundation-forms-impl-form-chooser-servlet-properties-data}))
