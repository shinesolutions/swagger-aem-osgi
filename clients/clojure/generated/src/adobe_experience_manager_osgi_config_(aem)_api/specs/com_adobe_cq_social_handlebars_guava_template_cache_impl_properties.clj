(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-handlebars-guava-template-cache-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-handlebars-guava-template-cache-impl-properties-data
  {
   (ds/opt :parameterguavacacheenabled) config-node-property-boolean-spec
   (ds/opt :parameterguavacacheparams) config-node-property-string-spec
   (ds/opt :parameterguavacachereload) config-node-property-boolean-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   })

(def com-adobe-cq-social-handlebars-guava-template-cache-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-handlebars-guava-template-cache-impl-properties
     :spec com-adobe-cq-social-handlebars-guava-template-cache-impl-properties-data}))
