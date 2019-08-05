using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsProperties:  IEquatable<ComAdobeGraniteAuthImsProperties>
    { 
        /// <summary>
        /// Configid
        /// </summary>
        public ConfigNodePropertyString Configid { get; private set; }

        /// <summary>
        /// Scope
        /// </summary>
        public ConfigNodePropertyString Scope { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsProperties()
        {
        }

        private ComAdobeGraniteAuthImsProperties(ConfigNodePropertyString Configid, ConfigNodePropertyString Scope)
        {
            
            this.Configid = Configid;
            
            this.Scope = Scope;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthImsPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsPropertiesBuilder</returns>
        public ComAdobeGraniteAuthImsPropertiesBuilder With()
        {
            return Builder()
                .Configid(Configid)
                .Scope(Scope);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthImsProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsProperties left, ComAdobeGraniteAuthImsProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsProperties left, ComAdobeGraniteAuthImsProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsPropertiesBuilder
        {
            private ConfigNodePropertyString _Configid;
            private ConfigNodePropertyString _Scope;

            internal ComAdobeGraniteAuthImsPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsProperties.Configid property.
            /// </summary>
            /// <param name="value">Configid</param>
            public ComAdobeGraniteAuthImsPropertiesBuilder Configid(ConfigNodePropertyString value)
            {
                _Configid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsProperties.Scope property.
            /// </summary>
            /// <param name="value">Scope</param>
            public ComAdobeGraniteAuthImsPropertiesBuilder Scope(ConfigNodePropertyString value)
            {
                _Scope = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsProperties</returns>
            public ComAdobeGraniteAuthImsProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsProperties(
                    Configid: _Configid,
                    Scope: _Scope
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}