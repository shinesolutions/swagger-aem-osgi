(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-cfm-impl-component-component-config-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-cfm-impl-component-component-config-impl-properties-data
  {
   (ds/opt :damcfmcomponentresourceType) config-node-property-string-spec
   (ds/opt :damcfmcomponentfileReferenceProp) config-node-property-string-spec
   (ds/opt :damcfmcomponentelementsProp) config-node-property-string-spec
   (ds/opt :damcfmcomponentvariationProp) config-node-property-string-spec
   })

(def com-adobe-cq-dam-cfm-impl-component-component-config-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-cfm-impl-component-component-config-impl-properties
     :spec com-adobe-cq-dam-cfm-impl-component-component-config-impl-properties-data}))
