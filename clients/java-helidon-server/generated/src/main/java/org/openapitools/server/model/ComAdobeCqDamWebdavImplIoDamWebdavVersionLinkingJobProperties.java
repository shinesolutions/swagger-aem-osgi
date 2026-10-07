package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties   {

    private ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable;
    private ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod;
    private ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.
     *
     * @param cqDamWebdavVersionLinkingEnable cqDamWebdavVersionLinkingEnable
     * @param cqDamWebdavVersionLinkingSchedulerPeriod cqDamWebdavVersionLinkingSchedulerPeriod
     * @param cqDamWebdavVersionLinkingStagingTimeout cqDamWebdavVersionLinkingStagingTimeout
     */
    public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(
        ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable, 
        ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod, 
        ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout
    ) {
        this.cqDamWebdavVersionLinkingEnable = cqDamWebdavVersionLinkingEnable;
        this.cqDamWebdavVersionLinkingSchedulerPeriod = cqDamWebdavVersionLinkingSchedulerPeriod;
        this.cqDamWebdavVersionLinkingStagingTimeout = cqDamWebdavVersionLinkingStagingTimeout;
    }



    /**
     * Get cqDamWebdavVersionLinkingEnable
     * @return cqDamWebdavVersionLinkingEnable
     */
    public ConfigNodePropertyBoolean getCqDamWebdavVersionLinkingEnable() {
        return cqDamWebdavVersionLinkingEnable;
    }

    public void setCqDamWebdavVersionLinkingEnable(ConfigNodePropertyBoolean cqDamWebdavVersionLinkingEnable) {
        this.cqDamWebdavVersionLinkingEnable = cqDamWebdavVersionLinkingEnable;
    }

    /**
     * Get cqDamWebdavVersionLinkingSchedulerPeriod
     * @return cqDamWebdavVersionLinkingSchedulerPeriod
     */
    public ConfigNodePropertyInteger getCqDamWebdavVersionLinkingSchedulerPeriod() {
        return cqDamWebdavVersionLinkingSchedulerPeriod;
    }

    public void setCqDamWebdavVersionLinkingSchedulerPeriod(ConfigNodePropertyInteger cqDamWebdavVersionLinkingSchedulerPeriod) {
        this.cqDamWebdavVersionLinkingSchedulerPeriod = cqDamWebdavVersionLinkingSchedulerPeriod;
    }

    /**
     * Get cqDamWebdavVersionLinkingStagingTimeout
     * @return cqDamWebdavVersionLinkingStagingTimeout
     */
    public ConfigNodePropertyInteger getCqDamWebdavVersionLinkingStagingTimeout() {
        return cqDamWebdavVersionLinkingStagingTimeout;
    }

    public void setCqDamWebdavVersionLinkingStagingTimeout(ConfigNodePropertyInteger cqDamWebdavVersionLinkingStagingTimeout) {
        this.cqDamWebdavVersionLinkingStagingTimeout = cqDamWebdavVersionLinkingStagingTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {\n");
        
        sb.append("    cqDamWebdavVersionLinkingEnable: ").append(toIndentedString(cqDamWebdavVersionLinkingEnable)).append("\n");
        sb.append("    cqDamWebdavVersionLinkingSchedulerPeriod: ").append(toIndentedString(cqDamWebdavVersionLinkingSchedulerPeriod)).append("\n");
        sb.append("    cqDamWebdavVersionLinkingStagingTimeout: ").append(toIndentedString(cqDamWebdavVersionLinkingStagingTimeout)).append("\n");
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

