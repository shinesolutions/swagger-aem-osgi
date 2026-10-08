(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-acp-platform-platform-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-acp-platform-platform-servlet-properties-data
  {
   (ds/opt :querylimit) config-node-property-integer-spec
   (ds/opt :filetypeextensionmap) config-node-property-array-spec
   })

(def com-adobe-granite-acp-platform-platform-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-acp-platform-platform-servlet-properties
     :spec com-adobe-granite-acp-platform-platform-servlet-properties-data}))
