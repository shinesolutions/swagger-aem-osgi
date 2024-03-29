/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * OASComAdobeGraniteAnalyzerScriptsCom
 */
public class OASComAdobeGraniteAnalyzerScriptsCom {
    /**
     * Get disabled
     * @return disabled
     */
    public OASConfigNodePropertyBoolean disabled { get; set; }

    public static OASComAdobeGraniteAnalyzerScriptsCom getExample() {
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties = new OASComAdobeGraniteAnalyzerScriptsCom();
          comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.disabled = OASConfigNodePropertyBoolean.getExample();
        return comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeGraniteAnalyzerScriptsCom) {           
            OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties = (OASComAdobeGraniteAnalyzerScriptsCom) obj;
            return this.disabled == comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.disabled;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (disabled == null ? 0 : System.hashCode(disabled));
        return hashCode;
    }
}

