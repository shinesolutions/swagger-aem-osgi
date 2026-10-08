(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de-properties-data
  {
   (ds/opt :handlername) config-node-property-string-spec
   (ds/opt :userexpirationTime) config-node-property-string-spec
   (ds/opt :userautoMembership) config-node-property-array-spec
   (ds/opt :userpropertyMapping) config-node-property-array-spec
   (ds/opt :userpathPrefix) config-node-property-string-spec
   (ds/opt :usermembershipExpTime) config-node-property-string-spec
   (ds/opt :usermembershipNestingDepth) config-node-property-integer-spec
   (ds/opt :userdynamicMembership) config-node-property-boolean-spec
   (ds/opt :userdisableMissing) config-node-property-boolean-spec
   (ds/opt :groupexpirationTime) config-node-property-string-spec
   (ds/opt :groupautoMembership) config-node-property-array-spec
   (ds/opt :grouppropertyMapping) config-node-property-array-spec
   (ds/opt :grouppathPrefix) config-node-property-string-spec
   (ds/opt :enableRFC7613UsercaseMappedProfile) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de-properties
     :spec org-apache-jackrabbit-oak-spi-security-authentication-external-impl-de-properties-data}))
