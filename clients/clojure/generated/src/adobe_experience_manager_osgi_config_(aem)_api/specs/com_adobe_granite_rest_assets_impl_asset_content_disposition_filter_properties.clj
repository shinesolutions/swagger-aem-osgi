(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-properties-data
  {
   (ds/opt :mimeallowEmpty) config-node-property-boolean-spec
   (ds/opt :mimeallowed) config-node-property-array-spec
   })

(def com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-properties
     :spec com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-properties-data}))
