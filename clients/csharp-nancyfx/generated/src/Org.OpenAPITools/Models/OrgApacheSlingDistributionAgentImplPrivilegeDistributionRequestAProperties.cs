using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties:  IEquatable<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// JcrPrivilege
        /// </summary>
        public ConfigNodePropertyString JcrPrivilege { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties()
        {
        }

        private OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(ConfigNodePropertyString Name, ConfigNodePropertyString JcrPrivilege)
        {
            
            this.Name = Name;
            
            this.JcrPrivilege = JcrPrivilege;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder</returns>
        public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .JcrPrivilege(JcrPrivilege);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties left, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties left, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _JcrPrivilege;

            internal OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.JcrPrivilege property.
            /// </summary>
            /// <param name="value">JcrPrivilege</param>
            public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder JcrPrivilege(ConfigNodePropertyString value)
            {
                _JcrPrivilege = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties</returns>
            public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(
                    Name: _Name,
                    JcrPrivilege: _JcrPrivilege
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}