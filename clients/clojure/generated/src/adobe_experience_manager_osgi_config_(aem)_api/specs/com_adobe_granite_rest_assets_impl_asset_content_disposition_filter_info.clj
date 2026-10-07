(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-properties-spec
   })

(def com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-info-spec
  (ds/spec
    {:name ::com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-info
     :spec com-adobe-granite-rest-assets-impl-asset-content-disposition-filter-info-data}))
