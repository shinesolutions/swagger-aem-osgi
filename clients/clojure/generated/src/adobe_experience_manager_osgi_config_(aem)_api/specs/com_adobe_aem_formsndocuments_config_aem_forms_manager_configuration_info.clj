(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-properties-spec
   })

(def com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-info-spec
  (ds/spec
    {:name ::com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-info
     :spec com-adobe-aem-formsndocuments-config-aem-forms-manager-configuration-info-data}))
