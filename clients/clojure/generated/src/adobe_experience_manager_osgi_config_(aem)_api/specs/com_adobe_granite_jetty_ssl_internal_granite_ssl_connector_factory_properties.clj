(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-properties-data
  {
   (ds/opt :comadobegranitejettysslport) config-node-property-integer-spec
   (ds/opt :comadobegranitejettysslkeystoreuser) config-node-property-string-spec
   (ds/opt :comadobegranitejettysslkeystorepassword) config-node-property-string-spec
   (ds/opt :comadobegranitejettysslciphersuitesexcluded) config-node-property-array-spec
   (ds/opt :comadobegranitejettysslciphersuitesincluded) config-node-property-array-spec
   (ds/opt :comadobegranitejettysslclientcertificate) config-node-property-drop-down-spec
   })

(def com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-properties
     :spec com-adobe-granite-jetty-ssl-internal-granite-ssl-connector-factory-properties-data}))
