(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-properties-data
  {
   (ds/opt :brightedgeurl) config-node-property-string-spec
   })

(def com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-properties
     :spec com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-properties-data}))
