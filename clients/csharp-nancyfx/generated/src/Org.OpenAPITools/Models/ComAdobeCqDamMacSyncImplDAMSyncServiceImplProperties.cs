using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties:  IEquatable<ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties>
    { 
        /// <summary>
        /// ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
        /// </summary>
        public ConfigNodePropertyArray ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths { get; private set; }

        /// <summary>
        /// ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions
        /// </summary>
        public ConfigNodePropertyBoolean ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions { get; private set; }

        /// <summary>
        /// ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs { get; private set; }

        /// <summary>
        /// ComAdobeCqDamMacSyncDamsyncservicePlatform
        /// </summary>
        public ConfigNodePropertyDropDown ComAdobeCqDamMacSyncDamsyncservicePlatform { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties()
        {
        }

        private ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(ConfigNodePropertyArray ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths, ConfigNodePropertyBoolean ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions, ConfigNodePropertyInteger ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs, ConfigNodePropertyDropDown ComAdobeCqDamMacSyncDamsyncservicePlatform)
        {
            
            this.ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
            
            this.ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions = ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
            
            this.ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
            
            this.ComAdobeCqDamMacSyncDamsyncservicePlatform = ComAdobeCqDamMacSyncDamsyncservicePlatform;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder</returns>
        public ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths)
                .ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions)
                .ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs)
                .ComAdobeCqDamMacSyncDamsyncservicePlatform(ComAdobeCqDamMacSyncDamsyncservicePlatform);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties left, ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties left, ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
            private ConfigNodePropertyBoolean _ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
            private ConfigNodePropertyInteger _ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
            private ConfigNodePropertyDropDown _ComAdobeCqDamMacSyncDamsyncservicePlatform;

            internal ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths property.
            /// </summary>
            /// <param name="value">ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths</param>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ConfigNodePropertyArray value)
            {
                _ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions property.
            /// </summary>
            /// <param name="value">ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions</param>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ConfigNodePropertyBoolean value)
            {
                _ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs property.
            /// </summary>
            /// <param name="value">ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs</param>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ConfigNodePropertyInteger value)
            {
                _ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.ComAdobeCqDamMacSyncDamsyncservicePlatform property.
            /// </summary>
            /// <param name="value">ComAdobeCqDamMacSyncDamsyncservicePlatform</param>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder ComAdobeCqDamMacSyncDamsyncservicePlatform(ConfigNodePropertyDropDown value)
            {
                _ComAdobeCqDamMacSyncDamsyncservicePlatform = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties</returns>
            public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(
                    ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: _ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths,
                    ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions: _ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions,
                    ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: _ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs,
                    ComAdobeCqDamMacSyncDamsyncservicePlatform: _ComAdobeCqDamMacSyncDamsyncservicePlatform
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}