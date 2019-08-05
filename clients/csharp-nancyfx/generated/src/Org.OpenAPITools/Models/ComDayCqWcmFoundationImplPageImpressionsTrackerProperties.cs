using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationImplPageImpressionsTrackerProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties:  IEquatable<ComDayCqWcmFoundationImplPageImpressionsTrackerProperties>
    { 
        /// <summary>
        /// SlingAuthRequirements
        /// </summary>
        public ConfigNodePropertyString SlingAuthRequirements { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationImplPageImpressionsTrackerProperties()
        {
        }

        private ComDayCqWcmFoundationImplPageImpressionsTrackerProperties(ConfigNodePropertyString SlingAuthRequirements)
        {
            
            this.SlingAuthRequirements = SlingAuthRequirements;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder</returns>
        public ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder With()
        {
            return Builder()
                .SlingAuthRequirements(SlingAuthRequirements);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationImplPageImpressionsTrackerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties left, ComDayCqWcmFoundationImplPageImpressionsTrackerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties left, ComDayCqWcmFoundationImplPageImpressionsTrackerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingAuthRequirements;

            internal ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.SlingAuthRequirements property.
            /// </summary>
            /// <param name="value">SlingAuthRequirements</param>
            public ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder SlingAuthRequirements(ConfigNodePropertyString value)
            {
                _SlingAuthRequirements = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationImplPageImpressionsTrackerProperties</returns>
            public ComDayCqWcmFoundationImplPageImpressionsTrackerProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationImplPageImpressionsTrackerProperties(
                    SlingAuthRequirements: _SlingAuthRequirements
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}