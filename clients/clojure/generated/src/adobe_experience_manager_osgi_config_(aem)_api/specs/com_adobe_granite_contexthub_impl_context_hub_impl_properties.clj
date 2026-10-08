(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-contexthub-impl-context-hub-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-contexthub-impl-context-hub-impl-properties-data
  {
   (ds/opt :comadobegranitecontexthubsilent_mode) config-node-property-boolean-spec
   (ds/opt :comadobegranitecontexthubshow_ui) config-node-property-boolean-spec
   })

(def com-adobe-granite-contexthub-impl-context-hub-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-contexthub-impl-context-hub-impl-properties
     :spec com-adobe-granite-contexthub-impl-context-hub-impl-properties-data}))
