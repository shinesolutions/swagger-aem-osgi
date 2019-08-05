using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
    /// </summary>
    public sealed class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties:  IEquatable<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties>
    { 
        /// <summary>
        /// NotifyOnupdate
        /// </summary>
        public ConfigNodePropertyBoolean NotifyOnupdate { get; private set; }

        /// <summary>
        /// NotifyOncomplete
        /// </summary>
        public ConfigNodePropertyBoolean NotifyOncomplete { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties()
        {
        }

        private ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(ConfigNodePropertyBoolean NotifyOnupdate, ConfigNodePropertyBoolean NotifyOncomplete)
        {
            
            this.NotifyOnupdate = NotifyOnupdate;
            
            this.NotifyOncomplete = NotifyOncomplete;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.
        /// </summary>
        /// <returns>ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder</returns>
        public static ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder Builder()
        {
            return new ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder</returns>
        public ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder With()
        {
            return Builder()
                .NotifyOnupdate(NotifyOnupdate)
                .NotifyOncomplete(NotifyOncomplete);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties</param>
        /// <param name="right">Compared (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties left, ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties</param>
        /// <param name="right">Compared (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties left, ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.
        /// </summary>
        public sealed class ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder
        {
            private ConfigNodePropertyBoolean _NotifyOnupdate;
            private ConfigNodePropertyBoolean _NotifyOncomplete;

            internal ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.NotifyOnupdate property.
            /// </summary>
            /// <param name="value">NotifyOnupdate</param>
            public ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder NotifyOnupdate(ConfigNodePropertyBoolean value)
            {
                _NotifyOnupdate = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.NotifyOncomplete property.
            /// </summary>
            /// <param name="value">NotifyOncomplete</param>
            public ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder NotifyOncomplete(ConfigNodePropertyBoolean value)
            {
                _NotifyOncomplete = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.
            /// </summary>
            /// <returns>ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties</returns>
            public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties Build()
            {
                Validate();
                return new ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(
                    NotifyOnupdate: _NotifyOnupdate,
                    NotifyOncomplete: _NotifyOncomplete
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}