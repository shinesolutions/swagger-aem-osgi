(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp-properties-data
  {
   (ds/opt :patterntime) config-node-property-string-spec
   (ds/opt :patternnewline) config-node-property-string-spec
   (ds/opt :patterndayOfMonth) config-node-property-string-spec
   (ds/opt :patternmonth) config-node-property-string-spec
   (ds/opt :patternyear) config-node-property-string-spec
   (ds/opt :patterndate) config-node-property-string-spec
   (ds/opt :patterndateTime) config-node-property-string-spec
   (ds/opt :patternemail) config-node-property-string-spec
   })

(def com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp-properties
     :spec com-adobe-cq-social-commons-emailreply-impl-email-quoted-text-patterns-imp-properties-data}))
