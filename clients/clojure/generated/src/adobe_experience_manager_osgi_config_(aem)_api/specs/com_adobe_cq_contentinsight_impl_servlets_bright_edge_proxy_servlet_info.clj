(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-properties-spec
   })

(def com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-info-spec
  (ds/spec
    {:name ::com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-info
     :spec com-adobe-cq-contentinsight-impl-servlets-bright-edge-proxy-servlet-info-data}))
