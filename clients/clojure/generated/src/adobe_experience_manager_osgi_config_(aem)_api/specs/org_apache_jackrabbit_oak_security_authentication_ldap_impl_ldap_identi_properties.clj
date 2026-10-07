(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi-properties-data
  {
   (ds/opt :providername) config-node-property-string-spec
   (ds/opt :hostname) config-node-property-string-spec
   (ds/opt :hostport) config-node-property-integer-spec
   (ds/opt :hostssl) config-node-property-boolean-spec
   (ds/opt :hosttls) config-node-property-boolean-spec
   (ds/opt :hostnoCertCheck) config-node-property-boolean-spec
   (ds/opt :binddn) config-node-property-string-spec
   (ds/opt :bindpassword) config-node-property-string-spec
   (ds/opt :searchTimeout) config-node-property-string-spec
   (ds/opt :adminPoolmaxActive) config-node-property-integer-spec
   (ds/opt :adminPoollookupOnValidate) config-node-property-boolean-spec
   (ds/opt :userPoolmaxActive) config-node-property-integer-spec
   (ds/opt :userPoollookupOnValidate) config-node-property-boolean-spec
   (ds/opt :userbaseDN) config-node-property-string-spec
   (ds/opt :userobjectclass) config-node-property-array-spec
   (ds/opt :useridAttribute) config-node-property-string-spec
   (ds/opt :userextraFilter) config-node-property-string-spec
   (ds/opt :usermakeDnPath) config-node-property-boolean-spec
   (ds/opt :groupbaseDN) config-node-property-string-spec
   (ds/opt :groupobjectclass) config-node-property-array-spec
   (ds/opt :groupnameAttribute) config-node-property-string-spec
   (ds/opt :groupextraFilter) config-node-property-string-spec
   (ds/opt :groupmakeDnPath) config-node-property-boolean-spec
   (ds/opt :groupmemberAttribute) config-node-property-string-spec
   (ds/opt :useUidForExtId) config-node-property-boolean-spec
   (ds/opt :customattributes) config-node-property-array-spec
   })

(def org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi-properties
     :spec org-apache-jackrabbit-oak-security-authentication-ldap-impl-ldap-identi-properties-data}))
