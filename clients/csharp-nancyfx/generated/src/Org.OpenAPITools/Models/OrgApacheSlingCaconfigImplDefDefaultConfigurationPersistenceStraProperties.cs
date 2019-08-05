using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties:  IEquatable<OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties()
        {
        }

        private OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties(ConfigNodePropertyBoolean Enabled)
        {
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder</returns>
        public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties left, OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties left, OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;

            internal OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties</returns>
            public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties(
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}