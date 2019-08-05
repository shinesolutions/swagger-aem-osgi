using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties:  IEquatable<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties>
    { 
        /// <summary>
        /// BucketSize
        /// </summary>
        public ConfigNodePropertyInteger BucketSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties()
        {
        }

        private ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties(ConfigNodePropertyInteger BucketSize)
        {
            
            this.BucketSize = BucketSize;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder With()
        {
            return Builder()
                .BucketSize(BucketSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties left, ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties left, ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder
        {
            private ConfigNodePropertyInteger _BucketSize;

            internal ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.BucketSize property.
            /// </summary>
            /// <param name="value">BucketSize</param>
            public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder BucketSize(ConfigNodePropertyInteger value)
            {
                _BucketSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties</returns>
            public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties(
                    BucketSize: _BucketSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}