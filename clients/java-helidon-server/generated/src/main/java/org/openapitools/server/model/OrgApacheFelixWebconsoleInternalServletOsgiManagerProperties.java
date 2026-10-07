package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties   {

    private ConfigNodePropertyString managerRoot;
    private ConfigNodePropertyString httpServiceFilter;
    private ConfigNodePropertyString defaultRender;
    private ConfigNodePropertyString realm;
    private ConfigNodePropertyString username;
    private ConfigNodePropertyString password;
    private ConfigNodePropertyString category;
    private ConfigNodePropertyString locale;
    private ConfigNodePropertyDropDown loglevel;
    private ConfigNodePropertyDropDown plugins;

    /**
     * Default constructor.
     */
    public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.
     *
     * @param managerRoot managerRoot
     * @param httpServiceFilter httpServiceFilter
     * @param defaultRender defaultRender
     * @param realm realm
     * @param username username
     * @param password password
     * @param category category
     * @param locale locale
     * @param loglevel loglevel
     * @param plugins plugins
     */
    public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(
        ConfigNodePropertyString managerRoot, 
        ConfigNodePropertyString httpServiceFilter, 
        ConfigNodePropertyString defaultRender, 
        ConfigNodePropertyString realm, 
        ConfigNodePropertyString username, 
        ConfigNodePropertyString password, 
        ConfigNodePropertyString category, 
        ConfigNodePropertyString locale, 
        ConfigNodePropertyDropDown loglevel, 
        ConfigNodePropertyDropDown plugins
    ) {
        this.managerRoot = managerRoot;
        this.httpServiceFilter = httpServiceFilter;
        this.defaultRender = defaultRender;
        this.realm = realm;
        this.username = username;
        this.password = password;
        this.category = category;
        this.locale = locale;
        this.loglevel = loglevel;
        this.plugins = plugins;
    }



    /**
     * Get managerRoot
     * @return managerRoot
     */
    public ConfigNodePropertyString getManagerRoot() {
        return managerRoot;
    }

    public void setManagerRoot(ConfigNodePropertyString managerRoot) {
        this.managerRoot = managerRoot;
    }

    /**
     * Get httpServiceFilter
     * @return httpServiceFilter
     */
    public ConfigNodePropertyString getHttpServiceFilter() {
        return httpServiceFilter;
    }

    public void setHttpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
        this.httpServiceFilter = httpServiceFilter;
    }

    /**
     * Get defaultRender
     * @return defaultRender
     */
    public ConfigNodePropertyString getDefaultRender() {
        return defaultRender;
    }

    public void setDefaultRender(ConfigNodePropertyString defaultRender) {
        this.defaultRender = defaultRender;
    }

    /**
     * Get realm
     * @return realm
     */
    public ConfigNodePropertyString getRealm() {
        return realm;
    }

    public void setRealm(ConfigNodePropertyString realm) {
        this.realm = realm;
    }

    /**
     * Get username
     * @return username
     */
    public ConfigNodePropertyString getUsername() {
        return username;
    }

    public void setUsername(ConfigNodePropertyString username) {
        this.username = username;
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
     * Get category
     * @return category
     */
    public ConfigNodePropertyString getCategory() {
        return category;
    }

    public void setCategory(ConfigNodePropertyString category) {
        this.category = category;
    }

    /**
     * Get locale
     * @return locale
     */
    public ConfigNodePropertyString getLocale() {
        return locale;
    }

    public void setLocale(ConfigNodePropertyString locale) {
        this.locale = locale;
    }

    /**
     * Get loglevel
     * @return loglevel
     */
    public ConfigNodePropertyDropDown getLoglevel() {
        return loglevel;
    }

    public void setLoglevel(ConfigNodePropertyDropDown loglevel) {
        this.loglevel = loglevel;
    }

    /**
     * Get plugins
     * @return plugins
     */
    public ConfigNodePropertyDropDown getPlugins() {
        return plugins;
    }

    public void setPlugins(ConfigNodePropertyDropDown plugins) {
        this.plugins = plugins;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {\n");
        
        sb.append("    managerRoot: ").append(toIndentedString(managerRoot)).append("\n");
        sb.append("    httpServiceFilter: ").append(toIndentedString(httpServiceFilter)).append("\n");
        sb.append("    defaultRender: ").append(toIndentedString(defaultRender)).append("\n");
        sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    loglevel: ").append(toIndentedString(loglevel)).append("\n");
        sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

