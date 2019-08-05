using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
    /// </summary>
    public sealed class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties:  IEquatable<OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties>
    { 
        /// <summary>
        /// ManagerRoot
        /// </summary>
        public ConfigNodePropertyString ManagerRoot { get; private set; }

        /// <summary>
        /// HttpServiceFilter
        /// </summary>
        public ConfigNodePropertyString HttpServiceFilter { get; private set; }

        /// <summary>
        /// DefaultRender
        /// </summary>
        public ConfigNodePropertyString DefaultRender { get; private set; }

        /// <summary>
        /// Realm
        /// </summary>
        public ConfigNodePropertyString Realm { get; private set; }

        /// <summary>
        /// Username
        /// </summary>
        public ConfigNodePropertyString Username { get; private set; }

        /// <summary>
        /// Password
        /// </summary>
        public ConfigNodePropertyString Password { get; private set; }

        /// <summary>
        /// Category
        /// </summary>
        public ConfigNodePropertyString Category { get; private set; }

        /// <summary>
        /// Locale
        /// </summary>
        public ConfigNodePropertyString Locale { get; private set; }

        /// <summary>
        /// Loglevel
        /// </summary>
        public ConfigNodePropertyDropDown Loglevel { get; private set; }

        /// <summary>
        /// Plugins
        /// </summary>
        public ConfigNodePropertyDropDown Plugins { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties()
        {
        }

        private OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(ConfigNodePropertyString ManagerRoot, ConfigNodePropertyString HttpServiceFilter, ConfigNodePropertyString DefaultRender, ConfigNodePropertyString Realm, ConfigNodePropertyString Username, ConfigNodePropertyString Password, ConfigNodePropertyString Category, ConfigNodePropertyString Locale, ConfigNodePropertyDropDown Loglevel, ConfigNodePropertyDropDown Plugins)
        {
            
            this.ManagerRoot = ManagerRoot;
            
            this.HttpServiceFilter = HttpServiceFilter;
            
            this.DefaultRender = DefaultRender;
            
            this.Realm = Realm;
            
            this.Username = Username;
            
            this.Password = Password;
            
            this.Category = Category;
            
            this.Locale = Locale;
            
            this.Loglevel = Loglevel;
            
            this.Plugins = Plugins;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder</returns>
        public static OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder Builder()
        {
            return new OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder</returns>
        public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder With()
        {
            return Builder()
                .ManagerRoot(ManagerRoot)
                .HttpServiceFilter(HttpServiceFilter)
                .DefaultRender(DefaultRender)
                .Realm(Realm)
                .Username(Username)
                .Password(Password)
                .Category(Category)
                .Locale(Locale)
                .Loglevel(Loglevel)
                .Plugins(Plugins);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties left, OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties left, OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.
        /// </summary>
        public sealed class OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder
        {
            private ConfigNodePropertyString _ManagerRoot;
            private ConfigNodePropertyString _HttpServiceFilter;
            private ConfigNodePropertyString _DefaultRender;
            private ConfigNodePropertyString _Realm;
            private ConfigNodePropertyString _Username;
            private ConfigNodePropertyString _Password;
            private ConfigNodePropertyString _Category;
            private ConfigNodePropertyString _Locale;
            private ConfigNodePropertyDropDown _Loglevel;
            private ConfigNodePropertyDropDown _Plugins;

            internal OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.ManagerRoot property.
            /// </summary>
            /// <param name="value">ManagerRoot</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder ManagerRoot(ConfigNodePropertyString value)
            {
                _ManagerRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.HttpServiceFilter property.
            /// </summary>
            /// <param name="value">HttpServiceFilter</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder HttpServiceFilter(ConfigNodePropertyString value)
            {
                _HttpServiceFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.DefaultRender property.
            /// </summary>
            /// <param name="value">DefaultRender</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder DefaultRender(ConfigNodePropertyString value)
            {
                _DefaultRender = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.Realm property.
            /// </summary>
            /// <param name="value">Realm</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder Realm(ConfigNodePropertyString value)
            {
                _Realm = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.Username property.
            /// </summary>
            /// <param name="value">Username</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder Username(ConfigNodePropertyString value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.Password property.
            /// </summary>
            /// <param name="value">Password</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder Password(ConfigNodePropertyString value)
            {
                _Password = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.Category property.
            /// </summary>
            /// <param name="value">Category</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder Category(ConfigNodePropertyString value)
            {
                _Category = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.Locale property.
            /// </summary>
            /// <param name="value">Locale</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder Locale(ConfigNodePropertyString value)
            {
                _Locale = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.Loglevel property.
            /// </summary>
            /// <param name="value">Loglevel</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder Loglevel(ConfigNodePropertyDropDown value)
            {
                _Loglevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.Plugins property.
            /// </summary>
            /// <param name="value">Plugins</param>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesBuilder Plugins(ConfigNodePropertyDropDown value)
            {
                _Plugins = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.
            /// </summary>
            /// <returns>OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties</returns>
            public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties Build()
            {
                Validate();
                return new OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(
                    ManagerRoot: _ManagerRoot,
                    HttpServiceFilter: _HttpServiceFilter,
                    DefaultRender: _DefaultRender,
                    Realm: _Realm,
                    Username: _Username,
                    Password: _Password,
                    Category: _Category,
                    Locale: _Locale,
                    Loglevel: _Loglevel,
                    Plugins: _Plugins
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}