(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex-properties-data
  {
   (ds/opt :jaasranking) config-node-property-integer-spec
   (ds/opt :jaascontrolFlag) config-node-property-string-spec
   (ds/opt :jaasrealmName) config-node-property-string-spec
   (ds/opt :idpname) config-node-property-string-spec
   (ds/opt :synchandlerName) config-node-property-string-spec
   })

(def org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex-properties
     :spec org-apache-jackrabbit-oak-spi-security-authentication-external-impl-ex-properties-data}))
