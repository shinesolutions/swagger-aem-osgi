(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator-properties-data
  {
   (ds/opt :cqwcmqrcodeservletwhitelist) config-node-property-array-spec
   })

(def com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator-properties
     :spec com-adobe-cq-wcm-mobile-qrcode-servlet-qr-code-image-generator-properties-data}))
