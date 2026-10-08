(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-properties-data
  {
   (ds/opt :formsManagerConfigincludeOOTBTemplates) config-node-property-boolean-spec
   (ds/opt :formsManagerConfigincludeDeprecatedTemplates) config-node-property-boolean-spec
   })

(def com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-properties-spec
  (ds/spec
    {:name ::com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-properties
     :spec com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-properties-data}))
