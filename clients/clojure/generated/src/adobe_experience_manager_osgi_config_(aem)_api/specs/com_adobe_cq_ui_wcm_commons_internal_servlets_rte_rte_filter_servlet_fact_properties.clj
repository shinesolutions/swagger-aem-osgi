(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-properties-data
  {
   (ds/opt :resourcetypes) config-node-property-array-spec
   })

(def com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-properties
     :spec com-adobe-cq-ui-wcm-commons-internal-servlets-rte-rte-filter-servlet-fact-properties-data}))
