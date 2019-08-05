using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ApacheSlingHealthCheckResultHTMLSerializerProperties
    /// </summary>
    public sealed class ApacheSlingHealthCheckResultHTMLSerializerProperties:  IEquatable<ApacheSlingHealthCheckResultHTMLSerializerProperties>
    { 
        /// <summary>
        /// StyleString
        /// </summary>
        public ConfigNodePropertyString StyleString { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ApacheSlingHealthCheckResultHTMLSerializerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ApacheSlingHealthCheckResultHTMLSerializerProperties()
        {
        }

        private ApacheSlingHealthCheckResultHTMLSerializerProperties(ConfigNodePropertyString StyleString)
        {
            
            this.StyleString = StyleString;
            
        }

        /// <summary>
        /// Returns builder of ApacheSlingHealthCheckResultHTMLSerializerProperties.
        /// </summary>
        /// <returns>ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder</returns>
        public static ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder Builder()
        {
            return new ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder</returns>
        public ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder With()
        {
            return Builder()
                .StyleString(StyleString);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ApacheSlingHealthCheckResultHTMLSerializerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ApacheSlingHealthCheckResultHTMLSerializerProperties.
        /// </summary>
        /// <param name="left">Compared (ApacheSlingHealthCheckResultHTMLSerializerProperties</param>
        /// <param name="right">Compared (ApacheSlingHealthCheckResultHTMLSerializerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ApacheSlingHealthCheckResultHTMLSerializerProperties left, ApacheSlingHealthCheckResultHTMLSerializerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ApacheSlingHealthCheckResultHTMLSerializerProperties.
        /// </summary>
        /// <param name="left">Compared (ApacheSlingHealthCheckResultHTMLSerializerProperties</param>
        /// <param name="right">Compared (ApacheSlingHealthCheckResultHTMLSerializerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ApacheSlingHealthCheckResultHTMLSerializerProperties left, ApacheSlingHealthCheckResultHTMLSerializerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ApacheSlingHealthCheckResultHTMLSerializerProperties.
        /// </summary>
        public sealed class ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder
        {
            private ConfigNodePropertyString _StyleString;

            internal ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ApacheSlingHealthCheckResultHTMLSerializerProperties.StyleString property.
            /// </summary>
            /// <param name="value">StyleString</param>
            public ApacheSlingHealthCheckResultHTMLSerializerPropertiesBuilder StyleString(ConfigNodePropertyString value)
            {
                _StyleString = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ApacheSlingHealthCheckResultHTMLSerializerProperties.
            /// </summary>
            /// <returns>ApacheSlingHealthCheckResultHTMLSerializerProperties</returns>
            public ApacheSlingHealthCheckResultHTMLSerializerProperties Build()
            {
                Validate();
                return new ApacheSlingHealthCheckResultHTMLSerializerProperties(
                    StyleString: _StyleString
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}