(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-ids-impl-ids-job-processor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-ids-impl-ids-job-processor-properties-data
  {
   (ds/opt :enablemultisession) config-node-property-boolean-spec
   (ds/opt :idsccenable) config-node-property-boolean-spec
   (ds/opt :enableretry) config-node-property-boolean-spec
   (ds/opt :enableretryscripterror) config-node-property-boolean-spec
   (ds/opt :externalizerdomaincqhost) config-node-property-string-spec
   (ds/opt :externalizerdomainhttp) config-node-property-string-spec
   })

(def com-day-cq-dam-ids-impl-ids-job-processor-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-ids-impl-ids-job-processor-properties
     :spec com-day-cq-dam-ids-impl-ids-job-processor-properties-data}))
