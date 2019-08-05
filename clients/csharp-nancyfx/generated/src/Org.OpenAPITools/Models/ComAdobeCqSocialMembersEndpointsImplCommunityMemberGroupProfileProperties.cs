using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties
    /// </summary>
    public sealed class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties:  IEquatable<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties>
    { 
        /// <summary>
        /// FieldWhitelist
        /// </summary>
        public ConfigNodePropertyArray FieldWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties()
        {
        }

        private ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties(ConfigNodePropertyArray FieldWhitelist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder</returns>
        public static ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder</returns>
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder With()
        {
            return Builder()
                .FieldWhitelist(FieldWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties left, ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties left, ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;

            internal ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties</returns>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties(
                    FieldWhitelist: _FieldWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}