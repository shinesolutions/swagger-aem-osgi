(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-srp-impl-social-solr-connector-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-srp-impl-social-solr-connector-properties-data
  {
   (ds/opt :srptype) config-node-property-string-spec
   })

(def com-adobe-cq-social-srp-impl-social-solr-connector-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-srp-impl-social-solr-connector-properties
     :spec com-adobe-cq-social-srp-impl-social-solr-connector-properties-data}))
