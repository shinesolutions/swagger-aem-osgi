using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties
    /// </summary>
    public sealed class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties:  IEquatable<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties>
    { 
        /// <summary>
        /// Users
        /// </summary>
        public ConfigNodePropertyArray Users { get; private set; }

        /// <summary>
        /// Groups
        /// </summary>
        public ConfigNodePropertyArray Groups { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties()
        {
        }

        private OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(ConfigNodePropertyArray Users, ConfigNodePropertyArray Groups)
        {
            
            this.Users = Users;
            
            this.Groups = Groups;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.
        /// </summary>
        /// <returns>OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder</returns>
        public static OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder Builder()
        {
            return new OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder</returns>
        public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder With()
        {
            return Builder()
                .Users(Users)
                .Groups(Groups);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties</param>
        /// <param name="right">Compared (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties left, OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties</param>
        /// <param name="right">Compared (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties left, OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.
        /// </summary>
        public sealed class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder
        {
            private ConfigNodePropertyArray _Users;
            private ConfigNodePropertyArray _Groups;

            internal OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.Users property.
            /// </summary>
            /// <param name="value">Users</param>
            public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder Users(ConfigNodePropertyArray value)
            {
                _Users = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.Groups property.
            /// </summary>
            /// <param name="value">Groups</param>
            public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder Groups(ConfigNodePropertyArray value)
            {
                _Groups = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.
            /// </summary>
            /// <returns>OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties</returns>
            public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties Build()
            {
                Validate();
                return new OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(
                    Users: _Users,
                    Groups: _Groups
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}