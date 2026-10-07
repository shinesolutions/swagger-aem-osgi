(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-properties-data
  {
   (ds/opt :resourceresolversearchpath) config-node-property-array-spec
   (ds/opt :resourceresolvermanglenamespaces) config-node-property-boolean-spec
   (ds/opt :resourceresolverallowDirect) config-node-property-boolean-spec
   (ds/opt :resourceresolverrequiredproviders) config-node-property-array-spec
   (ds/opt :resourceresolverrequiredprovidernames) config-node-property-array-spec
   (ds/opt :resourceresolvervirtual) config-node-property-array-spec
   (ds/opt :resourceresolvermapping) config-node-property-array-spec
   (ds/opt :resourceresolvermaplocation) config-node-property-string-spec
   (ds/opt :resourceresolvermapobservation) config-node-property-array-spec
   (ds/opt :resourceresolverdefaultvanityredirectstatus) config-node-property-integer-spec
   (ds/opt :resourceresolverenablevanitypath) config-node-property-boolean-spec
   (ds/opt :resourceresolvervanitypathmaxEntries) config-node-property-integer-spec
   (ds/opt :resourceresolvervanitypathmaxEntriesstartup) config-node-property-boolean-spec
   (ds/opt :resourceresolvervanitypathbloomfiltermaxBytes) config-node-property-integer-spec
   (ds/opt :resourceresolveroptimizealiasresolution) config-node-property-boolean-spec
   (ds/opt :resourceresolvervanitypathwhitelist) config-node-property-array-spec
   (ds/opt :resourceresolvervanitypathblacklist) config-node-property-array-spec
   (ds/opt :resourceresolvervanityprecedence) config-node-property-boolean-spec
   (ds/opt :resourceresolverproviderhandlingparanoid) config-node-property-boolean-spec
   (ds/opt :resourceresolverlogclosing) config-node-property-boolean-spec
   (ds/opt :resourceresolverlogunclosed) config-node-property-boolean-spec
   })

(def org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-properties
     :spec org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-properties-data}))
