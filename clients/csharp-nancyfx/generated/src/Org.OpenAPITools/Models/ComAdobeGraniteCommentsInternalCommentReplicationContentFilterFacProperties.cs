using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties
    /// </summary>
    public sealed class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties:  IEquatable<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties>
    { 
        /// <summary>
        /// ReplicateCommentResourceTypes
        /// </summary>
        public ConfigNodePropertyArray ReplicateCommentResourceTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties()
        {
        }

        private ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties(ConfigNodePropertyArray ReplicateCommentResourceTypes)
        {
            
            this.ReplicateCommentResourceTypes = ReplicateCommentResourceTypes;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder</returns>
        public static ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder</returns>
        public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder With()
        {
            return Builder()
                .ReplicateCommentResourceTypes(ReplicateCommentResourceTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties left, ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties left, ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.
        /// </summary>
        public sealed class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder
        {
            private ConfigNodePropertyArray _ReplicateCommentResourceTypes;

            internal ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.ReplicateCommentResourceTypes property.
            /// </summary>
            /// <param name="value">ReplicateCommentResourceTypes</param>
            public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder ReplicateCommentResourceTypes(ConfigNodePropertyArray value)
            {
                _ReplicateCommentResourceTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties</returns>
            public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties Build()
            {
                Validate();
                return new ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties(
                    ReplicateCommentResourceTypes: _ReplicateCommentResourceTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}