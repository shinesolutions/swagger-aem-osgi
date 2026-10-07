(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-cors-impl-cors-policy-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-cors-impl-cors-policy-impl-properties-data
  {
   (ds/opt :alloworigin) config-node-property-array-spec
   (ds/opt :alloworiginregexp) config-node-property-array-spec
   (ds/opt :allowedpaths) config-node-property-array-spec
   (ds/opt :exposedheaders) config-node-property-array-spec
   (ds/opt :maxage) config-node-property-integer-spec
   (ds/opt :supportedheaders) config-node-property-array-spec
   (ds/opt :supportedmethods) config-node-property-array-spec
   (ds/opt :supportscredentials) config-node-property-boolean-spec
   })

(def com-adobe-granite-cors-impl-cors-policy-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-cors-impl-cors-policy-impl-properties
     :spec com-adobe-granite-cors-impl-cors-policy-impl-properties-data}))
