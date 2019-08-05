using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties:  IEquatable<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties>
    { 
        /// <summary>
        /// Group2memberRelationshipOutgoing
        /// </summary>
        public ConfigNodePropertyString Group2memberRelationshipOutgoing { get; private set; }

        /// <summary>
        /// Group2memberExcludedOutgoing
        /// </summary>
        public ConfigNodePropertyArray Group2memberExcludedOutgoing { get; private set; }

        /// <summary>
        /// Group2memberRelationshipIncoming
        /// </summary>
        public ConfigNodePropertyString Group2memberRelationshipIncoming { get; private set; }

        /// <summary>
        /// Group2memberExcludedIncoming
        /// </summary>
        public ConfigNodePropertyArray Group2memberExcludedIncoming { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties()
        {
        }

        private ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(ConfigNodePropertyString Group2memberRelationshipOutgoing, ConfigNodePropertyArray Group2memberExcludedOutgoing, ConfigNodePropertyString Group2memberRelationshipIncoming, ConfigNodePropertyArray Group2memberExcludedIncoming)
        {
            
            this.Group2memberRelationshipOutgoing = Group2memberRelationshipOutgoing;
            
            this.Group2memberExcludedOutgoing = Group2memberExcludedOutgoing;
            
            this.Group2memberRelationshipIncoming = Group2memberRelationshipIncoming;
            
            this.Group2memberExcludedIncoming = Group2memberExcludedIncoming;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder</returns>
        public static ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder</returns>
        public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder With()
        {
            return Builder()
                .Group2memberRelationshipOutgoing(Group2memberRelationshipOutgoing)
                .Group2memberExcludedOutgoing(Group2memberExcludedOutgoing)
                .Group2memberRelationshipIncoming(Group2memberRelationshipIncoming)
                .Group2memberExcludedIncoming(Group2memberExcludedIncoming);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties left, ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties left, ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder
        {
            private ConfigNodePropertyString _Group2memberRelationshipOutgoing;
            private ConfigNodePropertyArray _Group2memberExcludedOutgoing;
            private ConfigNodePropertyString _Group2memberRelationshipIncoming;
            private ConfigNodePropertyArray _Group2memberExcludedIncoming;

            internal ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.Group2memberRelationshipOutgoing property.
            /// </summary>
            /// <param name="value">Group2memberRelationshipOutgoing</param>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder Group2memberRelationshipOutgoing(ConfigNodePropertyString value)
            {
                _Group2memberRelationshipOutgoing = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.Group2memberExcludedOutgoing property.
            /// </summary>
            /// <param name="value">Group2memberExcludedOutgoing</param>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder Group2memberExcludedOutgoing(ConfigNodePropertyArray value)
            {
                _Group2memberExcludedOutgoing = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.Group2memberRelationshipIncoming property.
            /// </summary>
            /// <param name="value">Group2memberRelationshipIncoming</param>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder Group2memberRelationshipIncoming(ConfigNodePropertyString value)
            {
                _Group2memberRelationshipIncoming = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.Group2memberExcludedIncoming property.
            /// </summary>
            /// <param name="value">Group2memberExcludedIncoming</param>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder Group2memberExcludedIncoming(ConfigNodePropertyArray value)
            {
                _Group2memberExcludedIncoming = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties</returns>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(
                    Group2memberRelationshipOutgoing: _Group2memberRelationshipOutgoing,
                    Group2memberExcludedOutgoing: _Group2memberExcludedOutgoing,
                    Group2memberRelationshipIncoming: _Group2memberRelationshipIncoming,
                    Group2memberExcludedIncoming: _Group2memberExcludedIncoming
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}