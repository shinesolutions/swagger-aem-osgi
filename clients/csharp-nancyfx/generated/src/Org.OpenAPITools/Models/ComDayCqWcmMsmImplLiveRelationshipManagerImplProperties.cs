using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties:  IEquatable<ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties>
    { 
        /// <summary>
        /// LiverelationshipmgrRelationsconfigDefault
        /// </summary>
        public ConfigNodePropertyString LiverelationshipmgrRelationsconfigDefault { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties()
        {
        }

        private ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties(ConfigNodePropertyString LiverelationshipmgrRelationsconfigDefault)
        {
            
            this.LiverelationshipmgrRelationsconfigDefault = LiverelationshipmgrRelationsconfigDefault;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder With()
        {
            return Builder()
                .LiverelationshipmgrRelationsconfigDefault(LiverelationshipmgrRelationsconfigDefault);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties left, ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties left, ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _LiverelationshipmgrRelationsconfigDefault;

            internal ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.LiverelationshipmgrRelationsconfigDefault property.
            /// </summary>
            /// <param name="value">LiverelationshipmgrRelationsconfigDefault</param>
            public ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder LiverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString value)
            {
                _LiverelationshipmgrRelationsconfigDefault = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties</returns>
            public ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties(
                    LiverelationshipmgrRelationsconfigDefault: _LiverelationshipmgrRelationsconfigDefault
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}