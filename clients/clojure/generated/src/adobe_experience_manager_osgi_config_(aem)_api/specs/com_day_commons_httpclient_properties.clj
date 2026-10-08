(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-commons-httpclient-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-commons-httpclient-properties-data
  {
   (ds/opt :proxyenabled) config-node-property-boolean-spec
   (ds/opt :proxyhost) config-node-property-string-spec
   (ds/opt :proxyuser) config-node-property-string-spec
   (ds/opt :proxypassword) config-node-property-string-spec
   (ds/opt :proxyntlmhost) config-node-property-string-spec
   (ds/opt :proxyntlmdomain) config-node-property-string-spec
   (ds/opt :proxyexceptions) config-node-property-array-spec
   })

(def com-day-commons-httpclient-properties-spec
  (ds/spec
    {:name ::com-day-commons-httpclient-properties
     :spec com-day-commons-httpclient-properties-data}))
