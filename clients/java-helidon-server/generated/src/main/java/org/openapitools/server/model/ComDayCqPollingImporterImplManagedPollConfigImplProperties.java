package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqPollingImporterImplManagedPollConfigImplProperties   {

    private ConfigNodePropertyString id;
    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyBoolean reference;
    private ConfigNodePropertyInteger interval;
    private ConfigNodePropertyString expression;
    private ConfigNodePropertyString source;
    private ConfigNodePropertyString target;
    private ConfigNodePropertyString login;
    private ConfigNodePropertyString password;

    /**
     * Default constructor.
     */
    public ComDayCqPollingImporterImplManagedPollConfigImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqPollingImporterImplManagedPollConfigImplProperties.
     *
     * @param id id
     * @param enabled enabled
     * @param reference reference
     * @param interval interval
     * @param expression expression
     * @param source source
     * @param target target
     * @param login login
     * @param password password
     */
    public ComDayCqPollingImporterImplManagedPollConfigImplProperties(
        ConfigNodePropertyString id, 
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyBoolean reference, 
        ConfigNodePropertyInteger interval, 
        ConfigNodePropertyString expression, 
        ConfigNodePropertyString source, 
        ConfigNodePropertyString target, 
        ConfigNodePropertyString login, 
        ConfigNodePropertyString password
    ) {
        this.id = id;
        this.enabled = enabled;
        this.reference = reference;
        this.interval = interval;
        this.expression = expression;
        this.source = source;
        this.target = target;
        this.login = login;
        this.password = password;
    }



    /**
     * Get id
     * @return id
     */
    public ConfigNodePropertyString getId() {
        return id;
    }

    public void setId(ConfigNodePropertyString id) {
        this.id = id;
    }

    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get reference
     * @return reference
     */
    public ConfigNodePropertyBoolean getReference() {
        return reference;
    }

    public void setReference(ConfigNodePropertyBoolean reference) {
        this.reference = reference;
    }

    /**
     * Get interval
     * @return interval
     */
    public ConfigNodePropertyInteger getInterval() {
        return interval;
    }

    public void setInterval(ConfigNodePropertyInteger interval) {
        this.interval = interval;
    }

    /**
     * Get expression
     * @return expression
     */
    public ConfigNodePropertyString getExpression() {
        return expression;
    }

    public void setExpression(ConfigNodePropertyString expression) {
        this.expression = expression;
    }

    /**
     * Get source
     * @return source
     */
    public ConfigNodePropertyString getSource() {
        return source;
    }

    public void setSource(ConfigNodePropertyString source) {
        this.source = source;
    }

    /**
     * Get target
     * @return target
     */
    public ConfigNodePropertyString getTarget() {
        return target;
    }

    public void setTarget(ConfigNodePropertyString target) {
        this.target = target;
    }

    /**
     * Get login
     * @return login
     */
    public ConfigNodePropertyString getLogin() {
        return login;
    }

    public void setLogin(ConfigNodePropertyString login) {
        this.login = login;
    }

    /**
     * Get password
     * @return password
     */
    public ConfigNodePropertyString getPassword() {
        return password;
    }

    public void setPassword(ConfigNodePropertyString password) {
        this.password = password;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqPollingImporterImplManagedPollConfigImplProperties {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

