using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationFormsImplFormChooserServletProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationFormsImplFormChooserServletProperties:  IEquatable<ComDayCqWcmFoundationFormsImplFormChooserServletProperties>
    { 
        /// <summary>
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }

        /// <summary>
        /// SlingServletResourceTypes
        /// </summary>
        public ConfigNodePropertyString SlingServletResourceTypes { get; private set; }

        /// <summary>
        /// SlingServletSelectors
        /// </summary>
        public ConfigNodePropertyString SlingServletSelectors { get; private set; }

        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyArray SlingServletMethods { get; private set; }

        /// <summary>
        /// FormsFormchooserservletAdvansesearchRequire
        /// </summary>
        public ConfigNodePropertyBoolean FormsFormchooserservletAdvansesearchRequire { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationFormsImplFormChooserServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationFormsImplFormChooserServletProperties()
        {
        }

        private ComDayCqWcmFoundationFormsImplFormChooserServletProperties(ConfigNodePropertyString ServiceName, ConfigNodePropertyString SlingServletResourceTypes, ConfigNodePropertyString SlingServletSelectors, ConfigNodePropertyArray SlingServletMethods, ConfigNodePropertyBoolean FormsFormchooserservletAdvansesearchRequire)
        {
            
            this.ServiceName = ServiceName;
            
            this.SlingServletResourceTypes = SlingServletResourceTypes;
            
            this.SlingServletSelectors = SlingServletSelectors;
            
            this.SlingServletMethods = SlingServletMethods;
            
            this.FormsFormchooserservletAdvansesearchRequire = FormsFormchooserservletAdvansesearchRequire;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationFormsImplFormChooserServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder</returns>
        public ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder With()
        {
            return Builder()
                .ServiceName(ServiceName)
                .SlingServletResourceTypes(SlingServletResourceTypes)
                .SlingServletSelectors(SlingServletSelectors)
                .SlingServletMethods(SlingServletMethods)
                .FormsFormchooserservletAdvansesearchRequire(FormsFormchooserservletAdvansesearchRequire);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationFormsImplFormChooserServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationFormsImplFormChooserServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormChooserServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormChooserServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationFormsImplFormChooserServletProperties left, ComDayCqWcmFoundationFormsImplFormChooserServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationFormsImplFormChooserServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormChooserServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormChooserServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationFormsImplFormChooserServletProperties left, ComDayCqWcmFoundationFormsImplFormChooserServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationFormsImplFormChooserServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder
        {
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyString _SlingServletResourceTypes;
            private ConfigNodePropertyString _SlingServletSelectors;
            private ConfigNodePropertyArray _SlingServletMethods;
            private ConfigNodePropertyBoolean _FormsFormchooserservletAdvansesearchRequire;

            internal ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletProperties.SlingServletResourceTypes property.
            /// </summary>
            /// <param name="value">SlingServletResourceTypes</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder SlingServletResourceTypes(ConfigNodePropertyString value)
            {
                _SlingServletResourceTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletProperties.SlingServletSelectors property.
            /// </summary>
            /// <param name="value">SlingServletSelectors</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder SlingServletSelectors(ConfigNodePropertyString value)
            {
                _SlingServletSelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder SlingServletMethods(ConfigNodePropertyArray value)
            {
                _SlingServletMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletProperties.FormsFormchooserservletAdvansesearchRequire property.
            /// </summary>
            /// <param name="value">FormsFormchooserservletAdvansesearchRequire</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder FormsFormchooserservletAdvansesearchRequire(ConfigNodePropertyBoolean value)
            {
                _FormsFormchooserservletAdvansesearchRequire = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationFormsImplFormChooserServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationFormsImplFormChooserServletProperties</returns>
            public ComDayCqWcmFoundationFormsImplFormChooserServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationFormsImplFormChooserServletProperties(
                    ServiceName: _ServiceName,
                    SlingServletResourceTypes: _SlingServletResourceTypes,
                    SlingServletSelectors: _SlingServletSelectors,
                    SlingServletMethods: _SlingServletMethods,
                    FormsFormchooserservletAdvansesearchRequire: _FormsFormchooserservletAdvansesearchRequire
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}