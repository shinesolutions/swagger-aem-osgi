using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties:  IEquatable<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties>
    { 
        /// <summary>
        /// ProcessLabel
        /// </summary>
        public ConfigNodePropertyString ProcessLabel { get; private set; }

        /// <summary>
        /// NotifyOnComplete
        /// </summary>
        public ConfigNodePropertyBoolean NotifyOnComplete { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties()
        {
        }

        private ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(ConfigNodePropertyString ProcessLabel, ConfigNodePropertyBoolean NotifyOnComplete)
        {
            
            this.ProcessLabel = ProcessLabel;
            
            this.NotifyOnComplete = NotifyOnComplete;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder</returns>
        public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder With()
        {
            return Builder()
                .ProcessLabel(ProcessLabel)
                .NotifyOnComplete(NotifyOnComplete);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties left, ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties left, ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder
        {
            private ConfigNodePropertyString _ProcessLabel;
            private ConfigNodePropertyBoolean _NotifyOnComplete;

            internal ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.ProcessLabel property.
            /// </summary>
            /// <param name="value">ProcessLabel</param>
            public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder ProcessLabel(ConfigNodePropertyString value)
            {
                _ProcessLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.NotifyOnComplete property.
            /// </summary>
            /// <param name="value">NotifyOnComplete</param>
            public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder NotifyOnComplete(ConfigNodePropertyBoolean value)
            {
                _NotifyOnComplete = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties</returns>
            public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(
                    ProcessLabel: _ProcessLabel,
                    NotifyOnComplete: _NotifyOnComplete
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}