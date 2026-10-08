(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-properties-data
  {
   (ds/opt :cqdamconfigannotationpdfdocumentwidth) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdfdocumentheight) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdfdocumentpaddinghorizontal) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdfdocumentpaddingvertical) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdffontsize) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdffontcolor) config-node-property-string-spec
   (ds/opt :cqdamconfigannotationpdffontfamily) config-node-property-string-spec
   (ds/opt :cqdamconfigannotationpdffontlight) config-node-property-string-spec
   (ds/opt :cqdamconfigannotationpdfmarginTextImage) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdfminImageHeight) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdfreviewStatuswidth) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdfreviewStatuscolorapproved) config-node-property-string-spec
   (ds/opt :cqdamconfigannotationpdfreviewStatuscolorrejected) config-node-property-string-spec
   (ds/opt :cqdamconfigannotationpdfreviewStatuscolorchangesRequested) config-node-property-string-spec
   (ds/opt :cqdamconfigannotationpdfannotationMarkerwidth) config-node-property-integer-spec
   (ds/opt :cqdamconfigannotationpdfassetminheight) config-node-property-integer-spec
   })

(def com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-properties
     :spec com-day-cq-dam-core-impl-annotation-pdf-annotation-pdf-config-properties-data}))
