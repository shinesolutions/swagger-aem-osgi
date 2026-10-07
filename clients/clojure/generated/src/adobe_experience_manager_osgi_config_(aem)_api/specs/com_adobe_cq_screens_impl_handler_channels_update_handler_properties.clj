(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-impl-handler-channels-update-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-impl-handler-channels-update-handler-properties-data
  {
   (ds/opt :cqpagesupdatehandlerimageresourcetypes) config-node-property-array-spec
   (ds/opt :cqpagesupdatehandlerproductresourcetypes) config-node-property-array-spec
   (ds/opt :cqpagesupdatehandlervideoresourcetypes) config-node-property-array-spec
   (ds/opt :cqpagesupdatehandlerdynamicsequenceresourcetypes) config-node-property-array-spec
   (ds/opt :cqpagesupdatehandlerpreviewmodepaths) config-node-property-array-spec
   })

(def com-adobe-cq-screens-impl-handler-channels-update-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-impl-handler-channels-update-handler-properties
     :spec com-adobe-cq-screens-impl-handler-channels-update-handler-properties-data}))
