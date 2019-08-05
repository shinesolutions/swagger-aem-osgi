using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties:  IEquatable<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// ConfigPropertyInheritancePropertyNames
        /// </summary>
        public ConfigNodePropertyArray ConfigPropertyInheritancePropertyNames { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties()
        {
        }

        private OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyArray ConfigPropertyInheritancePropertyNames)
        {
            
            this.Enabled = Enabled;
            
            this.ConfigPropertyInheritancePropertyNames = ConfigPropertyInheritancePropertyNames;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder</returns>
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled)
                .ConfigPropertyInheritancePropertyNames(ConfigPropertyInheritancePropertyNames);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties left, OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties left, OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyArray _ConfigPropertyInheritancePropertyNames;

            internal OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.ConfigPropertyInheritancePropertyNames property.
            /// </summary>
            /// <param name="value">ConfigPropertyInheritancePropertyNames</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder ConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray value)
            {
                _ConfigPropertyInheritancePropertyNames = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties</returns>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties(
                    Enabled: _Enabled,
                    ConfigPropertyInheritancePropertyNames: _ConfigPropertyInheritancePropertyNames
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}