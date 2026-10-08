(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration-properties-data
  {
   (ds/opt :pathdescfield) config-node-property-string-spec
   (ds/opt :pathchildfield) config-node-property-string-spec
   (ds/opt :pathparentfield) config-node-property-string-spec
   (ds/opt :pathexactfield) config-node-property-string-spec
   (ds/opt :catchallfield) config-node-property-string-spec
   (ds/opt :collapsedpathfield) config-node-property-string-spec
   (ds/opt :pathdepthfield) config-node-property-string-spec
   (ds/opt :commitpolicy) config-node-property-drop-down-spec
   (ds/opt :rows) config-node-property-integer-spec
   (ds/opt :pathrestrictions) config-node-property-boolean-spec
   (ds/opt :propertyrestrictions) config-node-property-boolean-spec
   (ds/opt :primarytypesrestrictions) config-node-property-boolean-spec
   (ds/opt :ignoredproperties) config-node-property-array-spec
   (ds/opt :usedproperties) config-node-property-array-spec
   (ds/opt :typemappings) config-node-property-array-spec
   (ds/opt :propertymappings) config-node-property-array-spec
   (ds/opt :collapsejcrcontentnodes) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration-properties
     :spec org-apache-jackrabbit-oak-plugins-index-solr-osgi-oak-solr-configuration-properties-data}))
