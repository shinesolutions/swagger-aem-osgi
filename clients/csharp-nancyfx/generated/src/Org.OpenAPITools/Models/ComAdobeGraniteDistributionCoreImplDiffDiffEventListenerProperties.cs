using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties:  IEquatable<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties>
    { 
        /// <summary>
        /// DiffPath
        /// </summary>
        public ConfigNodePropertyString DiffPath { get; private set; }

        /// <summary>
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }

        /// <summary>
        /// ServiceUserTarget
        /// </summary>
        public ConfigNodePropertyString ServiceUserTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties()
        {
        }

        private ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(ConfigNodePropertyString DiffPath, ConfigNodePropertyString ServiceName, ConfigNodePropertyString ServiceUserTarget)
        {
            
            this.DiffPath = DiffPath;
            
            this.ServiceName = ServiceName;
            
            this.ServiceUserTarget = ServiceUserTarget;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder With()
        {
            return Builder()
                .DiffPath(DiffPath)
                .ServiceName(ServiceName)
                .ServiceUserTarget(ServiceUserTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties left, ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties left, ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyString _DiffPath;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyString _ServiceUserTarget;

            internal ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.DiffPath property.
            /// </summary>
            /// <param name="value">DiffPath</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder DiffPath(ConfigNodePropertyString value)
            {
                _DiffPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.ServiceUserTarget property.
            /// </summary>
            /// <param name="value">ServiceUserTarget</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder ServiceUserTarget(ConfigNodePropertyString value)
            {
                _ServiceUserTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties</returns>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(
                    DiffPath: _DiffPath,
                    ServiceName: _ServiceName,
                    ServiceUserTarget: _ServiceUserTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}