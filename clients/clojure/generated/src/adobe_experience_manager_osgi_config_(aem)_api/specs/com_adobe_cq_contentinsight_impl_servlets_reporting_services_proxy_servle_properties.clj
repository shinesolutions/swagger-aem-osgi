(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle-properties-data
  {
   (ds/opt :reportingservicesproxywhitelist) config-node-property-array-spec
   })

(def com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle-properties
     :spec com-adobe-cq-contentinsight-impl-servlets-reporting-services-proxy-servle-properties-data}))
