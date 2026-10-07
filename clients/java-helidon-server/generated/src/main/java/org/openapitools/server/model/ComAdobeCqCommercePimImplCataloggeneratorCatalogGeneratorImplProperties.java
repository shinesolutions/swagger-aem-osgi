package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties   {

    private ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize;
    private ConfigNodePropertyString cqCommerceCataloggeneratorBucketname;
    private ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties;

    /**
     * Default constructor.
     */
    public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.
     *
     * @param cqCommerceCataloggeneratorBucketsize cqCommerceCataloggeneratorBucketsize
     * @param cqCommerceCataloggeneratorBucketname cqCommerceCataloggeneratorBucketname
     * @param cqCommerceCataloggeneratorExcludedtemplateproperties cqCommerceCataloggeneratorExcludedtemplateproperties
     */
    public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(
        ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize, 
        ConfigNodePropertyString cqCommerceCataloggeneratorBucketname, 
        ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties
    ) {
        this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
        this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
        this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
    }



    /**
     * Get cqCommerceCataloggeneratorBucketsize
     * @return cqCommerceCataloggeneratorBucketsize
     */
    public ConfigNodePropertyInteger getCqCommerceCataloggeneratorBucketsize() {
        return cqCommerceCataloggeneratorBucketsize;
    }

    public void setCqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
        this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
    }

    /**
     * Get cqCommerceCataloggeneratorBucketname
     * @return cqCommerceCataloggeneratorBucketname
     */
    public ConfigNodePropertyString getCqCommerceCataloggeneratorBucketname() {
        return cqCommerceCataloggeneratorBucketname;
    }

    public void setCqCommerceCataloggeneratorBucketname(ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
        this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
    }

    /**
     * Get cqCommerceCataloggeneratorExcludedtemplateproperties
     * @return cqCommerceCataloggeneratorExcludedtemplateproperties
     */
    public ConfigNodePropertyArray getCqCommerceCataloggeneratorExcludedtemplateproperties() {
        return cqCommerceCataloggeneratorExcludedtemplateproperties;
    }

    public void setCqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
        this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {\n");
        
        sb.append("    cqCommerceCataloggeneratorBucketsize: ").append(toIndentedString(cqCommerceCataloggeneratorBucketsize)).append("\n");
        sb.append("    cqCommerceCataloggeneratorBucketname: ").append(toIndentedString(cqCommerceCataloggeneratorBucketname)).append("\n");
        sb.append("    cqCommerceCataloggeneratorExcludedtemplateproperties: ").append(toIndentedString(cqCommerceCataloggeneratorExcludedtemplateproperties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

