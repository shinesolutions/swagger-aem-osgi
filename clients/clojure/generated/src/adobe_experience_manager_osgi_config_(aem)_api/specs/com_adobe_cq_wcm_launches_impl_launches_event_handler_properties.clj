(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-launches-impl-launches-event-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-wcm-launches-impl-launches-event-handler-properties-data
  {
   (ds/opt :eventfilter) config-node-property-string-spec
   (ds/opt :launcheseventhandlerthreadpoolmaxsize) config-node-property-integer-spec
   (ds/opt :launcheseventhandlerthreadpoolpriority) config-node-property-drop-down-spec
   (ds/opt :launcheseventhandlerupdatelastmodification) config-node-property-boolean-spec
   })

(def com-adobe-cq-wcm-launches-impl-launches-event-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-wcm-launches-impl-launches-event-handler-properties
     :spec com-adobe-cq-wcm-launches-impl-launches-event-handler-properties-data}))
