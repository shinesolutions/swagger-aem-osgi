using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties:  IEquatable<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties>
    { 
        /// <summary>
        /// IgnorePropertyNameRegex
        /// </summary>
        public ConfigNodePropertyArray IgnorePropertyNameRegex { get; private set; }

        /// <summary>
        /// ConfigCollectionPropertiesResourceNames
        /// </summary>
        public ConfigNodePropertyArray ConfigCollectionPropertiesResourceNames { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties()
        {
        }

        private OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(ConfigNodePropertyArray IgnorePropertyNameRegex, ConfigNodePropertyArray ConfigCollectionPropertiesResourceNames)
        {
            
            this.IgnorePropertyNameRegex = IgnorePropertyNameRegex;
            
            this.ConfigCollectionPropertiesResourceNames = ConfigCollectionPropertiesResourceNames;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder</returns>
        public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder With()
        {
            return Builder()
                .IgnorePropertyNameRegex(IgnorePropertyNameRegex)
                .ConfigCollectionPropertiesResourceNames(ConfigCollectionPropertiesResourceNames);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties left, OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties left, OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder
        {
            private ConfigNodePropertyArray _IgnorePropertyNameRegex;
            private ConfigNodePropertyArray _ConfigCollectionPropertiesResourceNames;

            internal OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.IgnorePropertyNameRegex property.
            /// </summary>
            /// <param name="value">IgnorePropertyNameRegex</param>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder IgnorePropertyNameRegex(ConfigNodePropertyArray value)
            {
                _IgnorePropertyNameRegex = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.ConfigCollectionPropertiesResourceNames property.
            /// </summary>
            /// <param name="value">ConfigCollectionPropertiesResourceNames</param>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder ConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray value)
            {
                _ConfigCollectionPropertiesResourceNames = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties</returns>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(
                    IgnorePropertyNameRegex: _IgnorePropertyNameRegex,
                    ConfigCollectionPropertiesResourceNames: _ConfigCollectionPropertiesResourceNames
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}