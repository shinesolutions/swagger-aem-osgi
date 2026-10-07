(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-properties-spec
   })

(def com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-info-spec
  (ds/spec
    {:name ::com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-info
     :spec com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-info-data}))
