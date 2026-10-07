(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-inbox-impl-typeprovider-item-type-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-inbox-impl-typeprovider-item-type-provider-properties-data
  {
   (ds/opt :inboximpltypeproviderregistrypaths) config-node-property-array-spec
   (ds/opt :inboximpltypeproviderlegacypaths) config-node-property-array-spec
   (ds/opt :inboximpltypeproviderdefaulturlfailureitem) config-node-property-string-spec
   (ds/opt :inboximpltypeproviderdefaulturlworkitem) config-node-property-string-spec
   (ds/opt :inboximpltypeproviderdefaulturltask) config-node-property-string-spec
   })

(def com-adobe-cq-inbox-impl-typeprovider-item-type-provider-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-inbox-impl-typeprovider-item-type-provider-properties
     :spec com-adobe-cq-inbox-impl-typeprovider-item-type-provider-properties-data}))
