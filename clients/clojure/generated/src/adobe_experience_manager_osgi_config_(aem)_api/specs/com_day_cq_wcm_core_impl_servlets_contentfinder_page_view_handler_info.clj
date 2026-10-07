(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-properties-spec
   })

(def com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-info
     :spec com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-info-data}))
