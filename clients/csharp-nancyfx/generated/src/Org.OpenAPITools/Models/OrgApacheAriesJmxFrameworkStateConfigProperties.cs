using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheAriesJmxFrameworkStateConfigProperties
    /// </summary>
    public sealed class OrgApacheAriesJmxFrameworkStateConfigProperties:  IEquatable<OrgApacheAriesJmxFrameworkStateConfigProperties>
    { 
        /// <summary>
        /// AttributeChangeNotificationEnabled
        /// </summary>
        public ConfigNodePropertyBoolean AttributeChangeNotificationEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheAriesJmxFrameworkStateConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheAriesJmxFrameworkStateConfigProperties()
        {
        }

        private OrgApacheAriesJmxFrameworkStateConfigProperties(ConfigNodePropertyBoolean AttributeChangeNotificationEnabled)
        {
            
            this.AttributeChangeNotificationEnabled = AttributeChangeNotificationEnabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheAriesJmxFrameworkStateConfigProperties.
        /// </summary>
        /// <returns>OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder</returns>
        public static OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder Builder()
        {
            return new OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder</returns>
        public OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder With()
        {
            return Builder()
                .AttributeChangeNotificationEnabled(AttributeChangeNotificationEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheAriesJmxFrameworkStateConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheAriesJmxFrameworkStateConfigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheAriesJmxFrameworkStateConfigProperties</param>
        /// <param name="right">Compared (OrgApacheAriesJmxFrameworkStateConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheAriesJmxFrameworkStateConfigProperties left, OrgApacheAriesJmxFrameworkStateConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheAriesJmxFrameworkStateConfigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheAriesJmxFrameworkStateConfigProperties</param>
        /// <param name="right">Compared (OrgApacheAriesJmxFrameworkStateConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheAriesJmxFrameworkStateConfigProperties left, OrgApacheAriesJmxFrameworkStateConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheAriesJmxFrameworkStateConfigProperties.
        /// </summary>
        public sealed class OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _AttributeChangeNotificationEnabled;

            internal OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheAriesJmxFrameworkStateConfigProperties.AttributeChangeNotificationEnabled property.
            /// </summary>
            /// <param name="value">AttributeChangeNotificationEnabled</param>
            public OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder AttributeChangeNotificationEnabled(ConfigNodePropertyBoolean value)
            {
                _AttributeChangeNotificationEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheAriesJmxFrameworkStateConfigProperties.
            /// </summary>
            /// <returns>OrgApacheAriesJmxFrameworkStateConfigProperties</returns>
            public OrgApacheAriesJmxFrameworkStateConfigProperties Build()
            {
                Validate();
                return new OrgApacheAriesJmxFrameworkStateConfigProperties(
                    AttributeChangeNotificationEnabled: _AttributeChangeNotificationEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}