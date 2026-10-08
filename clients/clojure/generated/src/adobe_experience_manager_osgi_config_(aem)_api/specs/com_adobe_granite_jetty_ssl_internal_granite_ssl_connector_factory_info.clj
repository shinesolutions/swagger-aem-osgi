(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-properties-spec
   (ds/opt :additionalProperties) string?
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-info-spec
  (ds/spec
    {:name ::com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-info
     :spec com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-info-data}))
