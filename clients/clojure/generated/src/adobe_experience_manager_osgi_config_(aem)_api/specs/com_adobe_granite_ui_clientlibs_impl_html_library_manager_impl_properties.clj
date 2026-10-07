(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl-properties-data
  {
   (ds/opt :htmllibmanagertiming) config-node-property-boolean-spec
   (ds/opt :htmllibmanagerdebuginitjs) config-node-property-string-spec
   (ds/opt :htmllibmanagerminify) config-node-property-boolean-spec
   (ds/opt :htmllibmanagerdebug) config-node-property-boolean-spec
   (ds/opt :htmllibmanagergzip) config-node-property-boolean-spec
   (ds/opt :htmllibmanagermaxDataUriSize) config-node-property-integer-spec
   (ds/opt :htmllibmanagermaxage) config-node-property-integer-spec
   (ds/opt :htmllibmanagerforceCQUrlInfo) config-node-property-boolean-spec
   (ds/opt :htmllibmanagerdefaultthemename) config-node-property-string-spec
   (ds/opt :htmllibmanagerdefaultuserthemename) config-node-property-string-spec
   (ds/opt :htmllibmanagerclientmanager) config-node-property-string-spec
   (ds/opt :htmllibmanagerpathlist) config-node-property-array-spec
   (ds/opt :htmllibmanagerexcludedpathlist) config-node-property-array-spec
   (ds/opt :htmllibmanagerprocessorjs) config-node-property-array-spec
   (ds/opt :htmllibmanagerprocessorcss) config-node-property-array-spec
   (ds/opt :htmllibmanagerlongcachepatterns) config-node-property-array-spec
   (ds/opt :htmllibmanagerlongcacheformat) config-node-property-string-spec
   (ds/opt :htmllibmanageruseFileSystemOutputCache) config-node-property-boolean-spec
   (ds/opt :htmllibmanagerfileSystemOutputCacheLocation) config-node-property-string-spec
   (ds/opt :htmllibmanagerdisablereplacement) config-node-property-array-spec
   })

(def com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl-properties
     :spec com-adobe-granite-ui-clientlibs-impl-html-library-manager-impl-properties-data}))
