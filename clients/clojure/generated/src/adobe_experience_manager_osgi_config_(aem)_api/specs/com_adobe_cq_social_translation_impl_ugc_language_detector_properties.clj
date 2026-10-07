(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-translation-impl-ugc-language-detector-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-translation-impl-ugc-language-detector-properties-data
  {
   (ds/opt :eventtopics) config-node-property-string-spec
   (ds/opt :eventfilter) config-node-property-string-spec
   (ds/opt :translatelistenertype) config-node-property-array-spec
   (ds/opt :translatepropertylist) config-node-property-array-spec
   (ds/opt :poolSize) config-node-property-integer-spec
   (ds/opt :maxPoolSize) config-node-property-integer-spec
   (ds/opt :queueSize) config-node-property-integer-spec
   (ds/opt :keepAliveTime) config-node-property-integer-spec
   })

(def com-adobe-cq-social-translation-impl-ugc-language-detector-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-translation-impl-ugc-language-detector-properties
     :spec com-adobe-cq-social-translation-impl-ugc-language-detector-properties-data}))
